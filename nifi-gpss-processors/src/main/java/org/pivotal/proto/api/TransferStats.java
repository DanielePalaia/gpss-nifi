// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpss.proto

package api;

/**
 * <pre>
 * Close service Response message
 * </pre>
 *
 * Protobuf type {@code api.TransferStats}
 */
public  final class TransferStats extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:api.TransferStats)
    TransferStatsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferStats.newBuilder() to construct.
  private TransferStats(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferStats() {
    successCount_ = 0L;
    errorCount_ = 0L;
    errorRows_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TransferStats(
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
          case 8: {

            successCount_ = input.readInt64();
            break;
          }
          case 16: {

            errorCount_ = input.readInt64();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              errorRows_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000004;
            }
            errorRows_.add(s);
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        errorRows_ = errorRows_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return api.GpssOuterClass.internal_static_api_TransferStats_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return api.GpssOuterClass.internal_static_api_TransferStats_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            api.TransferStats.class, api.TransferStats.Builder.class);
  }

  private int bitField0_;
  public static final int SUCCESSCOUNT_FIELD_NUMBER = 1;
  private long successCount_;
  /**
   * <pre>
   * Number of rows successfully loaded
   * </pre>
   *
   * <code>int64 SuccessCount = 1;</code>
   */
  public long getSuccessCount() {
    return successCount_;
  }

  public static final int ERRORCOUNT_FIELD_NUMBER = 2;
  private long errorCount_;
  /**
   * <pre>
   * Number of error lines if Errorlimit is not reached
   * </pre>
   *
   * <code>int64 ErrorCount = 2;</code>
   */
  public long getErrorCount() {
    return errorCount_;
  }

  public static final int ERRORROWS_FIELD_NUMBER = 3;
  private com.google.protobuf.LazyStringList errorRows_;
  /**
   * <pre>
   * Number of rows with incorrectly-formatted data; not supported
   * </pre>
   *
   * <code>repeated string ErrorRows = 3;</code>
   */
  public com.google.protobuf.ProtocolStringList
      getErrorRowsList() {
    return errorRows_;
  }
  /**
   * <pre>
   * Number of rows with incorrectly-formatted data; not supported
   * </pre>
   *
   * <code>repeated string ErrorRows = 3;</code>
   */
  public int getErrorRowsCount() {
    return errorRows_.size();
  }
  /**
   * <pre>
   * Number of rows with incorrectly-formatted data; not supported
   * </pre>
   *
   * <code>repeated string ErrorRows = 3;</code>
   */
  public java.lang.String getErrorRows(int index) {
    return errorRows_.get(index);
  }
  /**
   * <pre>
   * Number of rows with incorrectly-formatted data; not supported
   * </pre>
   *
   * <code>repeated string ErrorRows = 3;</code>
   */
  public com.google.protobuf.ByteString
      getErrorRowsBytes(int index) {
    return errorRows_.getByteString(index);
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
    if (successCount_ != 0L) {
      output.writeInt64(1, successCount_);
    }
    if (errorCount_ != 0L) {
      output.writeInt64(2, errorCount_);
    }
    for (int i = 0; i < errorRows_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, errorRows_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (successCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, successCount_);
    }
    if (errorCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, errorCount_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < errorRows_.size(); i++) {
        dataSize += computeStringSizeNoTag(errorRows_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getErrorRowsList().size();
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
    if (!(obj instanceof api.TransferStats)) {
      return super.equals(obj);
    }
    api.TransferStats other = (api.TransferStats) obj;

    boolean result = true;
    result = result && (getSuccessCount()
        == other.getSuccessCount());
    result = result && (getErrorCount()
        == other.getErrorCount());
    result = result && getErrorRowsList()
        .equals(other.getErrorRowsList());
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
    hash = (37 * hash) + SUCCESSCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSuccessCount());
    hash = (37 * hash) + ERRORCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getErrorCount());
    if (getErrorRowsCount() > 0) {
      hash = (37 * hash) + ERRORROWS_FIELD_NUMBER;
      hash = (53 * hash) + getErrorRowsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static api.TransferStats parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.TransferStats parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.TransferStats parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.TransferStats parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.TransferStats parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static api.TransferStats parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static api.TransferStats parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.TransferStats parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.TransferStats parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static api.TransferStats parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static api.TransferStats parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static api.TransferStats parseFrom(
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
  public static Builder newBuilder(api.TransferStats prototype) {
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
   * <pre>
   * Close service Response message
   * </pre>
   *
   * Protobuf type {@code api.TransferStats}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:api.TransferStats)
      api.TransferStatsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return api.GpssOuterClass.internal_static_api_TransferStats_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return api.GpssOuterClass.internal_static_api_TransferStats_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              api.TransferStats.class, api.TransferStats.Builder.class);
    }

    // Construct using api.TransferStats.newBuilder()
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
      successCount_ = 0L;

      errorCount_ = 0L;

      errorRows_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return api.GpssOuterClass.internal_static_api_TransferStats_descriptor;
    }

    @java.lang.Override
    public api.TransferStats getDefaultInstanceForType() {
      return api.TransferStats.getDefaultInstance();
    }

    @java.lang.Override
    public api.TransferStats build() {
      api.TransferStats result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public api.TransferStats buildPartial() {
      api.TransferStats result = new api.TransferStats(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.successCount_ = successCount_;
      result.errorCount_ = errorCount_;
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        errorRows_ = errorRows_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.errorRows_ = errorRows_;
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof api.TransferStats) {
        return mergeFrom((api.TransferStats)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(api.TransferStats other) {
      if (other == api.TransferStats.getDefaultInstance()) return this;
      if (other.getSuccessCount() != 0L) {
        setSuccessCount(other.getSuccessCount());
      }
      if (other.getErrorCount() != 0L) {
        setErrorCount(other.getErrorCount());
      }
      if (!other.errorRows_.isEmpty()) {
        if (errorRows_.isEmpty()) {
          errorRows_ = other.errorRows_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureErrorRowsIsMutable();
          errorRows_.addAll(other.errorRows_);
        }
        onChanged();
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
      api.TransferStats parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (api.TransferStats) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long successCount_ ;
    /**
     * <pre>
     * Number of rows successfully loaded
     * </pre>
     *
     * <code>int64 SuccessCount = 1;</code>
     */
    public long getSuccessCount() {
      return successCount_;
    }
    /**
     * <pre>
     * Number of rows successfully loaded
     * </pre>
     *
     * <code>int64 SuccessCount = 1;</code>
     */
    public Builder setSuccessCount(long value) {
      
      successCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of rows successfully loaded
     * </pre>
     *
     * <code>int64 SuccessCount = 1;</code>
     */
    public Builder clearSuccessCount() {
      
      successCount_ = 0L;
      onChanged();
      return this;
    }

    private long errorCount_ ;
    /**
     * <pre>
     * Number of error lines if Errorlimit is not reached
     * </pre>
     *
     * <code>int64 ErrorCount = 2;</code>
     */
    public long getErrorCount() {
      return errorCount_;
    }
    /**
     * <pre>
     * Number of error lines if Errorlimit is not reached
     * </pre>
     *
     * <code>int64 ErrorCount = 2;</code>
     */
    public Builder setErrorCount(long value) {
      
      errorCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of error lines if Errorlimit is not reached
     * </pre>
     *
     * <code>int64 ErrorCount = 2;</code>
     */
    public Builder clearErrorCount() {
      
      errorCount_ = 0L;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList errorRows_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureErrorRowsIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        errorRows_ = new com.google.protobuf.LazyStringArrayList(errorRows_);
        bitField0_ |= 0x00000004;
       }
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public com.google.protobuf.ProtocolStringList
        getErrorRowsList() {
      return errorRows_.getUnmodifiableView();
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public int getErrorRowsCount() {
      return errorRows_.size();
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public java.lang.String getErrorRows(int index) {
      return errorRows_.get(index);
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public com.google.protobuf.ByteString
        getErrorRowsBytes(int index) {
      return errorRows_.getByteString(index);
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public Builder setErrorRows(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureErrorRowsIsMutable();
      errorRows_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public Builder addErrorRows(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureErrorRowsIsMutable();
      errorRows_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public Builder addAllErrorRows(
        java.lang.Iterable<java.lang.String> values) {
      ensureErrorRowsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, errorRows_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public Builder clearErrorRows() {
      errorRows_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Number of rows with incorrectly-formatted data; not supported
     * </pre>
     *
     * <code>repeated string ErrorRows = 3;</code>
     */
    public Builder addErrorRowsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureErrorRowsIsMutable();
      errorRows_.add(value);
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


    // @@protoc_insertion_point(builder_scope:api.TransferStats)
  }

  // @@protoc_insertion_point(class_scope:api.TransferStats)
  private static final api.TransferStats DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new api.TransferStats();
  }

  public static api.TransferStats getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferStats>
      PARSER = new com.google.protobuf.AbstractParser<TransferStats>() {
    @java.lang.Override
    public TransferStats parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TransferStats(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TransferStats> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferStats> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public api.TransferStats getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
