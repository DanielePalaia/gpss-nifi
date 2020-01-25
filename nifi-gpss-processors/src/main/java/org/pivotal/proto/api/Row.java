// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package api;

/**
 * Protobuf type {@code api.Row}
 */
public  final class Row extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.Row)
    RowOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Row.newBuilder() to construct.
  private Row(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Row() {
    columns_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Row(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              columns_ = new java.util.ArrayList<api.DBValue>();
              mutable_bitField0_ |= 0x00000001;
            }
            columns_.add(
                input.readMessage(api.DBValue.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        columns_ = java.util.Collections.unmodifiableList(columns_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.GpssOuterClass.internal_static_api_Row_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.GpssOuterClass.internal_static_api_Row_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.Row.class, api.Row.Builder.class);
  }

  public static final int COLUMNS_FIELD_NUMBER = 1;
  private java.util.List<api.DBValue> columns_;
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  public java.util.List<api.DBValue> getColumnsList() {
    return columns_;
  }
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  public java.util.List<? extends api.DBValueOrBuilder> 
      getColumnsOrBuilderList() {
    return columns_;
  }
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  public int getColumnsCount() {
    return columns_.size();
  }
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  public api.DBValue getColumns(int index) {
    return columns_.get(index);
  }
  /**
   * <code>repeated .api.DBValue Columns = 1;</code>
   */
  public api.DBValueOrBuilder getColumnsOrBuilder(
      int index) {
    return columns_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < columns_.size(); i++) {
      output.writeMessage(1, columns_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < columns_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, columns_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof api.Row)) {
      return super.equals(obj);
    }
    api.Row other = (api.Row) obj;

    boolean result = true;
    result = result && getColumnsList()
        .equals(other.getColumnsList());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getColumnsCount() > 0) {
      hash = (37 * hash) + COLUMNS_FIELD_NUMBER;
      hash = (53 * hash) + getColumnsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.Row parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.Row parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.Row parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.Row parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.Row parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.Row parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.Row parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.Row parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.Row parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.Row parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.Row parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.Row parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(api.Row prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code api.Row}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.Row)
      api.RowOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.GpssOuterClass.internal_static_api_Row_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.GpssOuterClass.internal_static_api_Row_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.Row.class, api.Row.Builder.class);
    }

    // Construct using api.Row.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getColumnsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        columnsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.GpssOuterClass.internal_static_api_Row_descriptor;
    }

    @java.lang.Override
    public api.Row getDefaultInstanceForType() {
      return api.Row.getDefaultInstance();
    }

    @java.lang.Override
    public api.Row build() {
      api.Row result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.Row buildPartial() {
      api.Row result = new api.Row(this);
      int from_bitField0_ = bitField0_;
      if (columnsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          columns_ = java.util.Collections.unmodifiableList(columns_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.columns_ = columns_;
      } else {
        result.columns_ = columnsBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof api.Row) {
        return mergeFrom((api.Row)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.Row other) {
      if (other == api.Row.getDefaultInstance()) return this;
      if (columnsBuilder_ == null) {
        if (!other.columns_.isEmpty()) {
          if (columns_.isEmpty()) {
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureColumnsIsMutable();
            columns_.addAll(other.columns_);
          }
          onChanged();
        }
      } else {
        if (!other.columns_.isEmpty()) {
          if (columnsBuilder_.isEmpty()) {
            columnsBuilder_.dispose();
            columnsBuilder_ = null;
            columns_ = other.columns_;
            bitField0_ = (bitField0_ & ~0x00000001);
            columnsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getColumnsFieldBuilder() : null;
          } else {
            columnsBuilder_.addAllMessages(other.columns_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      api.Row parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (api.Row) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<api.DBValue> columns_ =
      java.util.Collections.emptyList();
    private void ensureColumnsIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        columns_ = new java.util.ArrayList<api.DBValue>(columns_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.DBValue, api.DBValue.Builder, api.DBValueOrBuilder> columnsBuilder_;

    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public java.util.List<api.DBValue> getColumnsList() {
      if (columnsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(columns_);
      } else {
        return columnsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public int getColumnsCount() {
      if (columnsBuilder_ == null) {
        return columns_.size();
      } else {
        return columnsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public api.DBValue getColumns(int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);
      } else {
        return columnsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder setColumns(
        int index, api.DBValue value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.set(index, value);
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder setColumns(
        int index, api.DBValue.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.set(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder addColumns(api.DBValue value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder addColumns(
        int index, api.DBValue value) {
      if (columnsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureColumnsIsMutable();
        columns_.add(index, value);
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder addColumns(
        api.DBValue.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder addColumns(
        int index, api.DBValue.Builder builderForValue) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.add(index, builderForValue.build());
        onChanged();
      } else {
        columnsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder addAllColumns(
        java.lang.Iterable<? extends api.DBValue> values) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, columns_);
        onChanged();
      } else {
        columnsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder clearColumns() {
      if (columnsBuilder_ == null) {
        columns_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        columnsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public Builder removeColumns(int index) {
      if (columnsBuilder_ == null) {
        ensureColumnsIsMutable();
        columns_.remove(index);
        onChanged();
      } else {
        columnsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public api.DBValue.Builder getColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public api.DBValueOrBuilder getColumnsOrBuilder(
        int index) {
      if (columnsBuilder_ == null) {
        return columns_.get(index);  } else {
        return columnsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public java.util.List<? extends api.DBValueOrBuilder> 
         getColumnsOrBuilderList() {
      if (columnsBuilder_ != null) {
        return columnsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(columns_);
      }
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public api.DBValue.Builder addColumnsBuilder() {
      return getColumnsFieldBuilder().addBuilder(
          api.DBValue.getDefaultInstance());
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public api.DBValue.Builder addColumnsBuilder(
        int index) {
      return getColumnsFieldBuilder().addBuilder(
          index, api.DBValue.getDefaultInstance());
    }
    /**
     * <code>repeated .api.DBValue Columns = 1;</code>
     */
    public java.util.List<api.DBValue.Builder> 
         getColumnsBuilderList() {
      return getColumnsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        api.DBValue, api.DBValue.Builder, api.DBValueOrBuilder> 
        getColumnsFieldBuilder() {
      if (columnsBuilder_ == null) {
        columnsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            api.DBValue, api.DBValue.Builder, api.DBValueOrBuilder>(
                columns_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        columns_ = null;
      }
      return columnsBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:api.Row)
  }

  // @@protoc_insertion_point(class_scope:api.Row)
  private static final api.Row DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.Row();
  }

  public static api.Row getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Row>
      PARSER = new com.google.protobuf.AbstractParser<Row>() {
    @java.lang.Override
    public Row parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Row(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Row> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Row> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.Row getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
