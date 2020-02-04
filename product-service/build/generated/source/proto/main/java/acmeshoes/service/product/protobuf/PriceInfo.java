// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: acmeshoes.service.product/product-service.proto

package acmeshoes.service.product.protobuf;

/**
 * Protobuf type {@code acmeshoes.service.product.PriceInfo}
 */
public  final class PriceInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:acmeshoes.service.product.PriceInfo)
    PriceInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PriceInfo.newBuilder() to construct.
  private PriceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PriceInfo() {
    list_ = 0D;
    msrp_ = 0D;
    sale_ = 0D;
    formattedList_ = "";
    formattedMsrp_ = "";
    formattedSale_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PriceInfo(
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
          case 9: {

            list_ = input.readDouble();
            break;
          }
          case 17: {

            msrp_ = input.readDouble();
            break;
          }
          case 25: {

            sale_ = input.readDouble();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            formattedList_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            formattedMsrp_ = s;
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            formattedSale_ = s;
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
    return acmeshoes.service.product.protobuf.ProductServiceProto.internal_static_acmeshoes_service_product_PriceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return acmeshoes.service.product.protobuf.ProductServiceProto.internal_static_acmeshoes_service_product_PriceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            acmeshoes.service.product.protobuf.PriceInfo.class, acmeshoes.service.product.protobuf.PriceInfo.Builder.class);
  }

  public static final int LIST_FIELD_NUMBER = 1;
  private double list_;
  /**
   * <code>double list = 1;</code>
   */
  public double getList() {
    return list_;
  }

  public static final int MSRP_FIELD_NUMBER = 2;
  private double msrp_;
  /**
   * <code>double msrp = 2;</code>
   */
  public double getMsrp() {
    return msrp_;
  }

  public static final int SALE_FIELD_NUMBER = 3;
  private double sale_;
  /**
   * <code>double sale = 3;</code>
   */
  public double getSale() {
    return sale_;
  }

  public static final int FORMATTEDLIST_FIELD_NUMBER = 4;
  private volatile java.lang.Object formattedList_;
  /**
   * <code>string formattedList = 4;</code>
   */
  public java.lang.String getFormattedList() {
    java.lang.Object ref = formattedList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      formattedList_ = s;
      return s;
    }
  }
  /**
   * <code>string formattedList = 4;</code>
   */
  public com.google.protobuf.ByteString
      getFormattedListBytes() {
    java.lang.Object ref = formattedList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      formattedList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMATTEDMSRP_FIELD_NUMBER = 5;
  private volatile java.lang.Object formattedMsrp_;
  /**
   * <code>string formattedMsrp = 5;</code>
   */
  public java.lang.String getFormattedMsrp() {
    java.lang.Object ref = formattedMsrp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      formattedMsrp_ = s;
      return s;
    }
  }
  /**
   * <code>string formattedMsrp = 5;</code>
   */
  public com.google.protobuf.ByteString
      getFormattedMsrpBytes() {
    java.lang.Object ref = formattedMsrp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      formattedMsrp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FORMATTEDSALE_FIELD_NUMBER = 6;
  private volatile java.lang.Object formattedSale_;
  /**
   * <code>string formattedSale = 6;</code>
   */
  public java.lang.String getFormattedSale() {
    java.lang.Object ref = formattedSale_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      formattedSale_ = s;
      return s;
    }
  }
  /**
   * <code>string formattedSale = 6;</code>
   */
  public com.google.protobuf.ByteString
      getFormattedSaleBytes() {
    java.lang.Object ref = formattedSale_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      formattedSale_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (list_ != 0D) {
      output.writeDouble(1, list_);
    }
    if (msrp_ != 0D) {
      output.writeDouble(2, msrp_);
    }
    if (sale_ != 0D) {
      output.writeDouble(3, sale_);
    }
    if (!getFormattedListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, formattedList_);
    }
    if (!getFormattedMsrpBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, formattedMsrp_);
    }
    if (!getFormattedSaleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, formattedSale_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (list_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, list_);
    }
    if (msrp_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, msrp_);
    }
    if (sale_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, sale_);
    }
    if (!getFormattedListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, formattedList_);
    }
    if (!getFormattedMsrpBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, formattedMsrp_);
    }
    if (!getFormattedSaleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, formattedSale_);
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
    if (!(obj instanceof acmeshoes.service.product.protobuf.PriceInfo)) {
      return super.equals(obj);
    }
    acmeshoes.service.product.protobuf.PriceInfo other = (acmeshoes.service.product.protobuf.PriceInfo) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getList())
        == java.lang.Double.doubleToLongBits(
            other.getList()));
    result = result && (
        java.lang.Double.doubleToLongBits(getMsrp())
        == java.lang.Double.doubleToLongBits(
            other.getMsrp()));
    result = result && (
        java.lang.Double.doubleToLongBits(getSale())
        == java.lang.Double.doubleToLongBits(
            other.getSale()));
    result = result && getFormattedList()
        .equals(other.getFormattedList());
    result = result && getFormattedMsrp()
        .equals(other.getFormattedMsrp());
    result = result && getFormattedSale()
        .equals(other.getFormattedSale());
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
    hash = (37 * hash) + LIST_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getList()));
    hash = (37 * hash) + MSRP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMsrp()));
    hash = (37 * hash) + SALE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSale()));
    hash = (37 * hash) + FORMATTEDLIST_FIELD_NUMBER;
    hash = (53 * hash) + getFormattedList().hashCode();
    hash = (37 * hash) + FORMATTEDMSRP_FIELD_NUMBER;
    hash = (53 * hash) + getFormattedMsrp().hashCode();
    hash = (37 * hash) + FORMATTEDSALE_FIELD_NUMBER;
    hash = (53 * hash) + getFormattedSale().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static acmeshoes.service.product.protobuf.PriceInfo parseFrom(
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
  public static Builder newBuilder(acmeshoes.service.product.protobuf.PriceInfo prototype) {
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
   * Protobuf type {@code acmeshoes.service.product.PriceInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:acmeshoes.service.product.PriceInfo)
      acmeshoes.service.product.protobuf.PriceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return acmeshoes.service.product.protobuf.ProductServiceProto.internal_static_acmeshoes_service_product_PriceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return acmeshoes.service.product.protobuf.ProductServiceProto.internal_static_acmeshoes_service_product_PriceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              acmeshoes.service.product.protobuf.PriceInfo.class, acmeshoes.service.product.protobuf.PriceInfo.Builder.class);
    }

    // Construct using acmeshoes.service.product.protobuf.PriceInfo.newBuilder()
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
      list_ = 0D;

      msrp_ = 0D;

      sale_ = 0D;

      formattedList_ = "";

      formattedMsrp_ = "";

      formattedSale_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return acmeshoes.service.product.protobuf.ProductServiceProto.internal_static_acmeshoes_service_product_PriceInfo_descriptor;
    }

    @java.lang.Override
    public acmeshoes.service.product.protobuf.PriceInfo getDefaultInstanceForType() {
      return acmeshoes.service.product.protobuf.PriceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public acmeshoes.service.product.protobuf.PriceInfo build() {
      acmeshoes.service.product.protobuf.PriceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public acmeshoes.service.product.protobuf.PriceInfo buildPartial() {
      acmeshoes.service.product.protobuf.PriceInfo result = new acmeshoes.service.product.protobuf.PriceInfo(this);
      result.list_ = list_;
      result.msrp_ = msrp_;
      result.sale_ = sale_;
      result.formattedList_ = formattedList_;
      result.formattedMsrp_ = formattedMsrp_;
      result.formattedSale_ = formattedSale_;
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
      if (other instanceof acmeshoes.service.product.protobuf.PriceInfo) {
        return mergeFrom((acmeshoes.service.product.protobuf.PriceInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(acmeshoes.service.product.protobuf.PriceInfo other) {
      if (other == acmeshoes.service.product.protobuf.PriceInfo.getDefaultInstance()) return this;
      if (other.getList() != 0D) {
        setList(other.getList());
      }
      if (other.getMsrp() != 0D) {
        setMsrp(other.getMsrp());
      }
      if (other.getSale() != 0D) {
        setSale(other.getSale());
      }
      if (!other.getFormattedList().isEmpty()) {
        formattedList_ = other.formattedList_;
        onChanged();
      }
      if (!other.getFormattedMsrp().isEmpty()) {
        formattedMsrp_ = other.formattedMsrp_;
        onChanged();
      }
      if (!other.getFormattedSale().isEmpty()) {
        formattedSale_ = other.formattedSale_;
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
      acmeshoes.service.product.protobuf.PriceInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (acmeshoes.service.product.protobuf.PriceInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double list_ ;
    /**
     * <code>double list = 1;</code>
     */
    public double getList() {
      return list_;
    }
    /**
     * <code>double list = 1;</code>
     */
    public Builder setList(double value) {
      
      list_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double list = 1;</code>
     */
    public Builder clearList() {
      
      list_ = 0D;
      onChanged();
      return this;
    }

    private double msrp_ ;
    /**
     * <code>double msrp = 2;</code>
     */
    public double getMsrp() {
      return msrp_;
    }
    /**
     * <code>double msrp = 2;</code>
     */
    public Builder setMsrp(double value) {
      
      msrp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double msrp = 2;</code>
     */
    public Builder clearMsrp() {
      
      msrp_ = 0D;
      onChanged();
      return this;
    }

    private double sale_ ;
    /**
     * <code>double sale = 3;</code>
     */
    public double getSale() {
      return sale_;
    }
    /**
     * <code>double sale = 3;</code>
     */
    public Builder setSale(double value) {
      
      sale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double sale = 3;</code>
     */
    public Builder clearSale() {
      
      sale_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object formattedList_ = "";
    /**
     * <code>string formattedList = 4;</code>
     */
    public java.lang.String getFormattedList() {
      java.lang.Object ref = formattedList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        formattedList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string formattedList = 4;</code>
     */
    public com.google.protobuf.ByteString
        getFormattedListBytes() {
      java.lang.Object ref = formattedList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        formattedList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string formattedList = 4;</code>
     */
    public Builder setFormattedList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      formattedList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string formattedList = 4;</code>
     */
    public Builder clearFormattedList() {
      
      formattedList_ = getDefaultInstance().getFormattedList();
      onChanged();
      return this;
    }
    /**
     * <code>string formattedList = 4;</code>
     */
    public Builder setFormattedListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      formattedList_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object formattedMsrp_ = "";
    /**
     * <code>string formattedMsrp = 5;</code>
     */
    public java.lang.String getFormattedMsrp() {
      java.lang.Object ref = formattedMsrp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        formattedMsrp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string formattedMsrp = 5;</code>
     */
    public com.google.protobuf.ByteString
        getFormattedMsrpBytes() {
      java.lang.Object ref = formattedMsrp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        formattedMsrp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string formattedMsrp = 5;</code>
     */
    public Builder setFormattedMsrp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      formattedMsrp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string formattedMsrp = 5;</code>
     */
    public Builder clearFormattedMsrp() {
      
      formattedMsrp_ = getDefaultInstance().getFormattedMsrp();
      onChanged();
      return this;
    }
    /**
     * <code>string formattedMsrp = 5;</code>
     */
    public Builder setFormattedMsrpBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      formattedMsrp_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object formattedSale_ = "";
    /**
     * <code>string formattedSale = 6;</code>
     */
    public java.lang.String getFormattedSale() {
      java.lang.Object ref = formattedSale_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        formattedSale_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string formattedSale = 6;</code>
     */
    public com.google.protobuf.ByteString
        getFormattedSaleBytes() {
      java.lang.Object ref = formattedSale_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        formattedSale_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string formattedSale = 6;</code>
     */
    public Builder setFormattedSale(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      formattedSale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string formattedSale = 6;</code>
     */
    public Builder clearFormattedSale() {
      
      formattedSale_ = getDefaultInstance().getFormattedSale();
      onChanged();
      return this;
    }
    /**
     * <code>string formattedSale = 6;</code>
     */
    public Builder setFormattedSaleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      formattedSale_ = value;
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


    // @@protoc_insertion_point(builder_scope:acmeshoes.service.product.PriceInfo)
  }

  // @@protoc_insertion_point(class_scope:acmeshoes.service.product.PriceInfo)
  private static final acmeshoes.service.product.protobuf.PriceInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new acmeshoes.service.product.protobuf.PriceInfo();
  }

  public static acmeshoes.service.product.protobuf.PriceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PriceInfo>
      PARSER = new com.google.protobuf.AbstractParser<PriceInfo>() {
    @java.lang.Override
    public PriceInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PriceInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PriceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PriceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public acmeshoes.service.product.protobuf.PriceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
