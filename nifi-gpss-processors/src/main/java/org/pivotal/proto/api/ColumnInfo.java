// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package api;

/**
 * Protobuf type {@code api.ColumnInfo}
 */
public  final class ColumnInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.ColumnInfo)
    ColumnInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ColumnInfo.newBuilder() to construct.
  private ColumnInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ColumnInfo() {
    name_ = "";
    databaseType_ = "";
    hasLength_ = false;
    length_ = 0L;
    hasPrecisionScale_ = false;
    precision_ = 0L;
    scale_ = 0L;
    hasNullable_ = false;
    nullable_ = false;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ColumnInfo(
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
            java.lang.String s = input.readStringRequireUtf8();

            name_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            databaseType_ = s;
            break;
          }
          case 24: {

            hasLength_ = input.readBool();
            break;
          }
          case 32: {

            length_ = input.readInt64();
            break;
          }
          case 40: {

            hasPrecisionScale_ = input.readBool();
            break;
          }
          case 48: {

            precision_ = input.readInt64();
            break;
          }
          case 56: {

            scale_ = input.readInt64();
            break;
          }
          case 64: {

            hasNullable_ = input.readBool();
            break;
          }
          case 72: {

            nullable_ = input.readBool();
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.GpssOuterClass.internal_static_api_ColumnInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.GpssOuterClass.internal_static_api_ColumnInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.ColumnInfo.class, api.ColumnInfo.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object name_;
  /**
   * <pre>
   * Column name
   * </pre>
   *
   * <code>string Name = 1;</code>
   */
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Column name
   * </pre>
   *
   * <code>string Name = 1;</code>
   */
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATABASETYPE_FIELD_NUMBER = 2;
  private volatile java.lang.Object databaseType_;
  /**
   * <pre>
   * Greenplum data type
   * </pre>
   *
   * <code>string DatabaseType = 2;</code>
   */
  public java.lang.String getDatabaseType() {
    java.lang.Object ref = databaseType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      databaseType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Greenplum data type
   * </pre>
   *
   * <code>string DatabaseType = 2;</code>
   */
  public com.google.protobuf.ByteString
      getDatabaseTypeBytes() {
    java.lang.Object ref = databaseType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      databaseType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASLENGTH_FIELD_NUMBER = 3;
  private boolean hasLength_;
  /**
   * <pre>
   * Contains length information?
   * </pre>
   *
   * <code>bool HasLength = 3;</code>
   */
  public boolean getHasLength() {
    return hasLength_;
  }

  public static final int LENGTH_FIELD_NUMBER = 4;
  private long length_;
  /**
   * <pre>
   * Length if HasLength is true
   * </pre>
   *
   * <code>int64 Length = 4;</code>
   */
  public long getLength() {
    return length_;
  }

  public static final int HASPRECISIONSCALE_FIELD_NUMBER = 5;
  private boolean hasPrecisionScale_;
  /**
   * <pre>
   * Contains precision or scale information?
   * </pre>
   *
   * <code>bool HasPrecisionScale = 5;</code>
   */
  public boolean getHasPrecisionScale() {
    return hasPrecisionScale_;
  }

  public static final int PRECISION_FIELD_NUMBER = 6;
  private long precision_;
  /**
   * <code>int64 Precision = 6;</code>
   */
  public long getPrecision() {
    return precision_;
  }

  public static final int SCALE_FIELD_NUMBER = 7;
  private long scale_;
  /**
   * <code>int64 Scale = 7;</code>
   */
  public long getScale() {
    return scale_;
  }

  public static final int HASNULLABLE_FIELD_NUMBER = 8;
  private boolean hasNullable_;
  /**
   * <pre>
   * Contains Nullable constraint?
   * </pre>
   *
   * <code>bool HasNullable = 8;</code>
   */
  public boolean getHasNullable() {
    return hasNullable_;
  }

  public static final int NULLABLE_FIELD_NUMBER = 9;
  private boolean nullable_;
  /**
   * <code>bool Nullable = 9;</code>
   */
  public boolean getNullable() {
    return nullable_;
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
    if (!getNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!getDatabaseTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, databaseType_);
    }
    if (hasLength_ != false) {
      output.writeBool(3, hasLength_);
    }
    if (length_ != 0L) {
      output.writeInt64(4, length_);
    }
    if (hasPrecisionScale_ != false) {
      output.writeBool(5, hasPrecisionScale_);
    }
    if (precision_ != 0L) {
      output.writeInt64(6, precision_);
    }
    if (scale_ != 0L) {
      output.writeInt64(7, scale_);
    }
    if (hasNullable_ != false) {
      output.writeBool(8, hasNullable_);
    }
    if (nullable_ != false) {
      output.writeBool(9, nullable_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!getDatabaseTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, databaseType_);
    }
    if (hasLength_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, hasLength_);
    }
    if (length_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, length_);
    }
    if (hasPrecisionScale_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, hasPrecisionScale_);
    }
    if (precision_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(6, precision_);
    }
    if (scale_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(7, scale_);
    }
    if (hasNullable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, hasNullable_);
    }
    if (nullable_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(9, nullable_);
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
    if (!(obj instanceof api.ColumnInfo)) {
      return super.equals(obj);
    }
    api.ColumnInfo other = (api.ColumnInfo) obj;

    boolean result = true;
    result = result && getName()
        .equals(other.getName());
    result = result && getDatabaseType()
        .equals(other.getDatabaseType());
    result = result && (getHasLength()
        == other.getHasLength());
    result = result && (getLength()
        == other.getLength());
    result = result && (getHasPrecisionScale()
        == other.getHasPrecisionScale());
    result = result && (getPrecision()
        == other.getPrecision());
    result = result && (getScale()
        == other.getScale());
    result = result && (getHasNullable()
        == other.getHasNullable());
    result = result && (getNullable()
        == other.getNullable());
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DATABASETYPE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabaseType().hashCode();
    hash = (37 * hash) + HASLENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasLength());
    hash = (37 * hash) + LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getLength());
    hash = (37 * hash) + HASPRECISIONSCALE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasPrecisionScale());
    hash = (37 * hash) + PRECISION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getPrecision());
    hash = (37 * hash) + SCALE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getScale());
    hash = (37 * hash) + HASNULLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasNullable());
    hash = (37 * hash) + NULLABLE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getNullable());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.ColumnInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.ColumnInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.ColumnInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.ColumnInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.ColumnInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.ColumnInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.ColumnInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.ColumnInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.ColumnInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.ColumnInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.ColumnInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.ColumnInfo parseFrom(
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
  public static Builder newBuilder(api.ColumnInfo prototype) {
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
   * Protobuf type {@code api.ColumnInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.ColumnInfo)
      api.ColumnInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.GpssOuterClass.internal_static_api_ColumnInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.GpssOuterClass.internal_static_api_ColumnInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.ColumnInfo.class, api.ColumnInfo.Builder.class);
    }

    // Construct using api.ColumnInfo.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      databaseType_ = "";

      hasLength_ = false;

      length_ = 0L;

      hasPrecisionScale_ = false;

      precision_ = 0L;

      scale_ = 0L;

      hasNullable_ = false;

      nullable_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.GpssOuterClass.internal_static_api_ColumnInfo_descriptor;
    }

    @java.lang.Override
    public api.ColumnInfo getDefaultInstanceForType() {
      return api.ColumnInfo.getDefaultInstance();
    }

    @java.lang.Override
    public api.ColumnInfo build() {
      api.ColumnInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.ColumnInfo buildPartial() {
      api.ColumnInfo result = new api.ColumnInfo(this);
      result.name_ = name_;
      result.databaseType_ = databaseType_;
      result.hasLength_ = hasLength_;
      result.length_ = length_;
      result.hasPrecisionScale_ = hasPrecisionScale_;
      result.precision_ = precision_;
      result.scale_ = scale_;
      result.hasNullable_ = hasNullable_;
      result.nullable_ = nullable_;
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
      if (other instanceof api.ColumnInfo) {
        return mergeFrom((api.ColumnInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.ColumnInfo other) {
      if (other == api.ColumnInfo.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (!other.getDatabaseType().isEmpty()) {
        databaseType_ = other.databaseType_;
        onChanged();
      }
      if (other.getHasLength() != false) {
        setHasLength(other.getHasLength());
      }
      if (other.getLength() != 0L) {
        setLength(other.getLength());
      }
      if (other.getHasPrecisionScale() != false) {
        setHasPrecisionScale(other.getHasPrecisionScale());
      }
      if (other.getPrecision() != 0L) {
        setPrecision(other.getPrecision());
      }
      if (other.getScale() != 0L) {
        setScale(other.getScale());
      }
      if (other.getHasNullable() != false) {
        setHasNullable(other.getHasNullable());
      }
      if (other.getNullable() != false) {
        setNullable(other.getNullable());
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
      api.ColumnInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (api.ColumnInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <pre>
     * Column name
     * </pre>
     *
     * <code>string Name = 1;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Column name
     * </pre>
     *
     * <code>string Name = 1;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Column name
     * </pre>
     *
     * <code>string Name = 1;</code>
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column name
     * </pre>
     *
     * <code>string Name = 1;</code>
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Column name
     * </pre>
     *
     * <code>string Name = 1;</code>
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object databaseType_ = "";
    /**
     * <pre>
     * Greenplum data type
     * </pre>
     *
     * <code>string DatabaseType = 2;</code>
     */
    public java.lang.String getDatabaseType() {
      java.lang.Object ref = databaseType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        databaseType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Greenplum data type
     * </pre>
     *
     * <code>string DatabaseType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getDatabaseTypeBytes() {
      java.lang.Object ref = databaseType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        databaseType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Greenplum data type
     * </pre>
     *
     * <code>string DatabaseType = 2;</code>
     */
    public Builder setDatabaseType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      databaseType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenplum data type
     * </pre>
     *
     * <code>string DatabaseType = 2;</code>
     */
    public Builder clearDatabaseType() {
      
      databaseType_ = getDefaultInstance().getDatabaseType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Greenplum data type
     * </pre>
     *
     * <code>string DatabaseType = 2;</code>
     */
    public Builder setDatabaseTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      databaseType_ = value;
      onChanged();
      return this;
    }

    private boolean hasLength_ ;
    /**
     * <pre>
     * Contains length information?
     * </pre>
     *
     * <code>bool HasLength = 3;</code>
     */
    public boolean getHasLength() {
      return hasLength_;
    }
    /**
     * <pre>
     * Contains length information?
     * </pre>
     *
     * <code>bool HasLength = 3;</code>
     */
    public Builder setHasLength(boolean value) {
      
      hasLength_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains length information?
     * </pre>
     *
     * <code>bool HasLength = 3;</code>
     */
    public Builder clearHasLength() {
      
      hasLength_ = false;
      onChanged();
      return this;
    }

    private long length_ ;
    /**
     * <pre>
     * Length if HasLength is true
     * </pre>
     *
     * <code>int64 Length = 4;</code>
     */
    public long getLength() {
      return length_;
    }
    /**
     * <pre>
     * Length if HasLength is true
     * </pre>
     *
     * <code>int64 Length = 4;</code>
     */
    public Builder setLength(long value) {
      
      length_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Length if HasLength is true
     * </pre>
     *
     * <code>int64 Length = 4;</code>
     */
    public Builder clearLength() {
      
      length_ = 0L;
      onChanged();
      return this;
    }

    private boolean hasPrecisionScale_ ;
    /**
     * <pre>
     * Contains precision or scale information?
     * </pre>
     *
     * <code>bool HasPrecisionScale = 5;</code>
     */
    public boolean getHasPrecisionScale() {
      return hasPrecisionScale_;
    }
    /**
     * <pre>
     * Contains precision or scale information?
     * </pre>
     *
     * <code>bool HasPrecisionScale = 5;</code>
     */
    public Builder setHasPrecisionScale(boolean value) {
      
      hasPrecisionScale_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains precision or scale information?
     * </pre>
     *
     * <code>bool HasPrecisionScale = 5;</code>
     */
    public Builder clearHasPrecisionScale() {
      
      hasPrecisionScale_ = false;
      onChanged();
      return this;
    }

    private long precision_ ;
    /**
     * <code>int64 Precision = 6;</code>
     */
    public long getPrecision() {
      return precision_;
    }
    /**
     * <code>int64 Precision = 6;</code>
     */
    public Builder setPrecision(long value) {
      
      precision_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Precision = 6;</code>
     */
    public Builder clearPrecision() {
      
      precision_ = 0L;
      onChanged();
      return this;
    }

    private long scale_ ;
    /**
     * <code>int64 Scale = 7;</code>
     */
    public long getScale() {
      return scale_;
    }
    /**
     * <code>int64 Scale = 7;</code>
     */
    public Builder setScale(long value) {
      
      scale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 Scale = 7;</code>
     */
    public Builder clearScale() {
      
      scale_ = 0L;
      onChanged();
      return this;
    }

    private boolean hasNullable_ ;
    /**
     * <pre>
     * Contains Nullable constraint?
     * </pre>
     *
     * <code>bool HasNullable = 8;</code>
     */
    public boolean getHasNullable() {
      return hasNullable_;
    }
    /**
     * <pre>
     * Contains Nullable constraint?
     * </pre>
     *
     * <code>bool HasNullable = 8;</code>
     */
    public Builder setHasNullable(boolean value) {
      
      hasNullable_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Contains Nullable constraint?
     * </pre>
     *
     * <code>bool HasNullable = 8;</code>
     */
    public Builder clearHasNullable() {
      
      hasNullable_ = false;
      onChanged();
      return this;
    }

    private boolean nullable_ ;
    /**
     * <code>bool Nullable = 9;</code>
     */
    public boolean getNullable() {
      return nullable_;
    }
    /**
     * <code>bool Nullable = 9;</code>
     */
    public Builder setNullable(boolean value) {
      
      nullable_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool Nullable = 9;</code>
     */
    public Builder clearNullable() {
      
      nullable_ = false;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:api.ColumnInfo)
  }

  // @@protoc_insertion_point(class_scope:api.ColumnInfo)
  private static final api.ColumnInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.ColumnInfo();
  }

  public static api.ColumnInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ColumnInfo>
      PARSER = new com.google.protobuf.AbstractParser<ColumnInfo>() {
    @java.lang.Override
    public ColumnInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ColumnInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ColumnInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ColumnInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.ColumnInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

