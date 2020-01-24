/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pivotal.gpss;

import org.apache.nifi.components.PropertyDescriptor;
import org.apache.nifi.flowfile.FlowFile;
import org.apache.nifi.annotation.behavior.ReadsAttribute;
import org.apache.nifi.annotation.behavior.ReadsAttributes;
import org.apache.nifi.annotation.behavior.WritesAttribute;
import org.apache.nifi.annotation.behavior.WritesAttributes;
import org.apache.nifi.annotation.lifecycle.OnScheduled;
import org.apache.nifi.annotation.documentation.CapabilityDescription;
import org.apache.nifi.annotation.documentation.SeeAlso;
import org.apache.nifi.annotation.documentation.Tags;
import org.apache.nifi.processor.exception.ProcessException;
import org.apache.nifi.processor.AbstractProcessor;
import org.apache.nifi.processor.ProcessContext;
import org.apache.nifi.processor.ProcessSession;
import org.apache.nifi.processor.ProcessorInitializationContext;
import org.apache.nifi.processor.Relationship;
import org.apache.nifi.processor.util.StandardValidators;
import org.apache.nifi.logging.ComponentLog;


import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.apache.nifi.annotation.behavior.SideEffectFree;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Tags({"GPSS processor"})
@CapabilityDescription("GPSS processor")
@SeeAlso({})
@ReadsAttributes({@ReadsAttribute(attribute="", description="")})
@WritesAttributes({@WritesAttribute(attribute="", description="")})
public class MyProcessor extends AbstractProcessor {

    GpssWrapper gpssClient;

    public static final PropertyDescriptor GPSSServerProperty = new PropertyDescriptor
            .Builder().name("GPSSServer")
            .displayName("GPSSServer")
            .description("host ip of the gpss server host")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GPSSPortProperty = new PropertyDescriptor
            .Builder().name("GPSSPort")
            .displayName("GPSSPort")
            .description("port of the gpss server")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GreenplumMasterHostProperty = new PropertyDescriptor
            .Builder().name("GreenplumMasterHost")
            .displayName("Greenplum: master host")
            .description("Greenpllum master host ip")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GreenplumMasterPortProperty = new PropertyDescriptor
            .Builder().name("GreenplumMasterPort")
            .displayName("Greenplum: master port")
            .description("Greenplum master host")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GreenplumDatabaseProperty = new PropertyDescriptor
            .Builder().name("DatabaseName")
            .displayName("Greenplum: atabase to use")
            .description("Greenplum database to use")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GreenplumUsernameProperty = new PropertyDescriptor
            .Builder().name("Username")
            .displayName("Greenplum: username")
            .description("Greenplum username")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GreenplumPasswordProperty = new PropertyDescriptor
            .Builder().name("DatabaseName")
            .displayName("Greenplum: password")
            .description("Greenplum password")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor GreenplumTableProperty = new PropertyDescriptor
            .Builder().name("GreenplumTable")
            .displayName("Greenplum: table to ingest")
            .description("Greenplum table ot ingest")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final PropertyDescriptor SchemaNameProperty = new PropertyDescriptor
            .Builder().name("SchmaName")
            .displayName("Greenplum: schema name of the table to ingest")
            .description("Greenplum schema name of the table to ingest")
            .required(true)
            .addValidator(StandardValidators.NON_EMPTY_VALIDATOR)
            .build();

    public static final Relationship MY_RELATIONSHIP = new Relationship.Builder()
            .name("SUCCESS")
            .description("Example relationship")
            .build();

    private List<PropertyDescriptor> descriptors;

    private Set<Relationship> relationships;

    @Override
    protected void init(final ProcessorInitializationContext context) {
        ComponentLog logger = this.getLogger();
        final List<PropertyDescriptor> descriptors = new ArrayList<PropertyDescriptor>();
        descriptors.add(GPSSServerProperty);
        descriptors.add(GPSSPortProperty);
        descriptors.add(GreenplumMasterHostProperty);
        descriptors.add(GreenplumMasterPortProperty);
        descriptors.add(GreenplumTableProperty);
        descriptors.add(SchemaNameProperty);
        descriptors.add(GreenplumDatabaseProperty);
        descriptors.add(GreenplumUsernameProperty);
        descriptors.add(GreenplumPasswordProperty);

        this.descriptors = Collections.unmodifiableList(descriptors);

        final Set<Relationship> relationships = new HashSet<Relationship>();
        relationships.add(MY_RELATIONSHIP);
        this.relationships = Collections.unmodifiableSet(relationships);

        logger.info("initialize component with properties" + GPSSServerProperty + " " + GreenplumMasterHostProperty + " " + GreenplumTableProperty);

    }

    @Override
    public Set<Relationship> getRelationships() {
        return this.relationships;
    }

    @Override
    public final List<PropertyDescriptor> getSupportedPropertyDescriptors() {
        return descriptors;
    }

    @OnScheduled
    public void onScheduled(final ProcessContext context) {

        ComponentLog logger = this.getLogger();
        String GpssServer = context.getProperty(GPSSServerProperty).getValue();
        int GpssPort = Integer.parseInt(context.getProperty(GPSSPortProperty).getValue());
        String GreenplumMasterHost = context.getProperty(GreenplumMasterHostProperty).getValue();
        int GreenplumMasterPort = Integer.parseInt(context.getProperty(GreenplumMasterPortProperty).getValue());
        String GreenplumTable = context.getProperty(GreenplumTableProperty).getValue();
        String GreenplumSchema = context.getProperty(SchemaNameProperty).getValue();
        String GreenplumUsername = context.getProperty(GreenplumUsernameProperty).getValue();
        String GreenplumPassword = context.getProperty(GreenplumPasswordProperty).getValue();
        String GreenplumDatabase = context.getProperty(GreenplumDatabaseProperty).getValue();

        gpssClient = new GpssWrapper(GpssServer,GpssPort, GreenplumMasterHost,GreenplumMasterPort, GreenplumUsername, GreenplumPassword, GreenplumDatabase, GreenplumTable, GreenplumSchema);
        gpssClient.connectToGrpc();

        logger.info("initialize component with properties" + GpssServer + " " + GreenplumMasterHost + " " + GreenplumTable);




    }

    @Override
    public void onTrigger(final ProcessContext context, final ProcessSession session) throws ProcessException {
        ComponentLog logger = this.getLogger();


        FlowFile flowFile = session.get();
        if ( flowFile == null ) {
            return;
        }

        session.transfer(flowFile, MY_RELATIONSHIP);
        // TODO implement
    }
}
