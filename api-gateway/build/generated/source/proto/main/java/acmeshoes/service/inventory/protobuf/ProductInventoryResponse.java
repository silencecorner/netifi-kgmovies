// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: acmeshoes.service.inventory/inventory-service.proto

package acmeshoes.service.inventory.protobuf;

/**
 * Protobuf type {@code acmeshoes.service.inventory.ProductInventoryResponse}
 */
public  final class ProductInventoryResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:acmeshoes.service.inventory.ProductInventoryResponse)
    ProductInventoryResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProductInventoryResponse.newBuilder() to construct.
  private ProductInventoryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProductInventoryResponse() {
    productId_ = "";
    skus_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ProductInventoryResponse(
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

            productId_ = s;
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              skus_ = new java.util.ArrayList<acmeshoes.service.inventory.protobuf.SkuInventory>();
              mutable_bitField0_ |= 0x00000002;
            }
            skus_.add(
                input.readMessage(acmeshoes.service.inventory.protobuf.SkuInventory.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        skus_ = java.util.Collections.unmodifiableList(skus_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_ProductInventoryResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_ProductInventoryResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            acmeshoes.service.inventory.protobuf.ProductInventoryResponse.class, acmeshoes.service.inventory.protobuf.ProductInventoryResponse.Builder.class);
  }

  private int bitField0_;
  public static final int PRODUCTID_FIELD_NUMBER = 1;
  private volatile java.lang.Object productId_;
  /**
   * <code>string productId = 1;</code>
   */
  public java.lang.String getProductId() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      productId_ = s;
      return s;
    }
  }
  /**
   * <code>string productId = 1;</code>
   */
  public com.google.protobuf.ByteString
      getProductIdBytes() {
    java.lang.Object ref = productId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      productId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKUS_FIELD_NUMBER = 2;
  private java.util.List<acmeshoes.service.inventory.protobuf.SkuInventory> skus_;
  /**
   * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
   */
  public java.util.List<acmeshoes.service.inventory.protobuf.SkuInventory> getSkusList() {
    return skus_;
  }
  /**
   * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
   */
  public java.util.List<? extends acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder> 
      getSkusOrBuilderList() {
    return skus_;
  }
  /**
   * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
   */
  public int getSkusCount() {
    return skus_.size();
  }
  /**
   * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
   */
  public acmeshoes.service.inventory.protobuf.SkuInventory getSkus(int index) {
    return skus_.get(index);
  }
  /**
   * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
   */
  public acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder getSkusOrBuilder(
      int index) {
    return skus_.get(index);
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
    if (!getProductIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, productId_);
    }
    for (int i = 0; i < skus_.size(); i++) {
      output.writeMessage(2, skus_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getProductIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, productId_);
    }
    for (int i = 0; i < skus_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, skus_.get(i));
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
    if (!(obj instanceof acmeshoes.service.inventory.protobuf.ProductInventoryResponse)) {
      return super.equals(obj);
    }
    acmeshoes.service.inventory.protobuf.ProductInventoryResponse other = (acmeshoes.service.inventory.protobuf.ProductInventoryResponse) obj;

    boolean result = true;
    result = result && getProductId()
        .equals(other.getProductId());
    result = result && getSkusList()
        .equals(other.getSkusList());
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
    hash = (37 * hash) + PRODUCTID_FIELD_NUMBER;
    hash = (53 * hash) + getProductId().hashCode();
    if (getSkusCount() > 0) {
      hash = (37 * hash) + SKUS_FIELD_NUMBER;
      hash = (53 * hash) + getSkusList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse parseFrom(
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
  public static Builder newBuilder(acmeshoes.service.inventory.protobuf.ProductInventoryResponse prototype) {
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
   * Protobuf type {@code acmeshoes.service.inventory.ProductInventoryResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:acmeshoes.service.inventory.ProductInventoryResponse)
      acmeshoes.service.inventory.protobuf.ProductInventoryResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_ProductInventoryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_ProductInventoryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              acmeshoes.service.inventory.protobuf.ProductInventoryResponse.class, acmeshoes.service.inventory.protobuf.ProductInventoryResponse.Builder.class);
    }

    // Construct using acmeshoes.service.inventory.protobuf.ProductInventoryResponse.newBuilder()
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
        getSkusFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      productId_ = "";

      if (skusBuilder_ == null) {
        skus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        skusBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_ProductInventoryResponse_descriptor;
    }

    @java.lang.Override
    public acmeshoes.service.inventory.protobuf.ProductInventoryResponse getDefaultInstanceForType() {
      return acmeshoes.service.inventory.protobuf.ProductInventoryResponse.getDefaultInstance();
    }

    @java.lang.Override
    public acmeshoes.service.inventory.protobuf.ProductInventoryResponse build() {
      acmeshoes.service.inventory.protobuf.ProductInventoryResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public acmeshoes.service.inventory.protobuf.ProductInventoryResponse buildPartial() {
      acmeshoes.service.inventory.protobuf.ProductInventoryResponse result = new acmeshoes.service.inventory.protobuf.ProductInventoryResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.productId_ = productId_;
      if (skusBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          skus_ = java.util.Collections.unmodifiableList(skus_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.skus_ = skus_;
      } else {
        result.skus_ = skusBuilder_.build();
      }
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
      if (other instanceof acmeshoes.service.inventory.protobuf.ProductInventoryResponse) {
        return mergeFrom((acmeshoes.service.inventory.protobuf.ProductInventoryResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(acmeshoes.service.inventory.protobuf.ProductInventoryResponse other) {
      if (other == acmeshoes.service.inventory.protobuf.ProductInventoryResponse.getDefaultInstance()) return this;
      if (!other.getProductId().isEmpty()) {
        productId_ = other.productId_;
        onChanged();
      }
      if (skusBuilder_ == null) {
        if (!other.skus_.isEmpty()) {
          if (skus_.isEmpty()) {
            skus_ = other.skus_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureSkusIsMutable();
            skus_.addAll(other.skus_);
          }
          onChanged();
        }
      } else {
        if (!other.skus_.isEmpty()) {
          if (skusBuilder_.isEmpty()) {
            skusBuilder_.dispose();
            skusBuilder_ = null;
            skus_ = other.skus_;
            bitField0_ = (bitField0_ & ~0x00000002);
            skusBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSkusFieldBuilder() : null;
          } else {
            skusBuilder_.addAllMessages(other.skus_);
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
      acmeshoes.service.inventory.protobuf.ProductInventoryResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (acmeshoes.service.inventory.protobuf.ProductInventoryResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object productId_ = "";
    /**
     * <code>string productId = 1;</code>
     */
    public java.lang.String getProductId() {
      java.lang.Object ref = productId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        productId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     */
    public com.google.protobuf.ByteString
        getProductIdBytes() {
      java.lang.Object ref = productId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        productId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string productId = 1;</code>
     */
    public Builder setProductId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      productId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     */
    public Builder clearProductId() {
      
      productId_ = getDefaultInstance().getProductId();
      onChanged();
      return this;
    }
    /**
     * <code>string productId = 1;</code>
     */
    public Builder setProductIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      productId_ = value;
      onChanged();
      return this;
    }

    private java.util.List<acmeshoes.service.inventory.protobuf.SkuInventory> skus_ =
      java.util.Collections.emptyList();
    private void ensureSkusIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        skus_ = new java.util.ArrayList<acmeshoes.service.inventory.protobuf.SkuInventory>(skus_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        acmeshoes.service.inventory.protobuf.SkuInventory, acmeshoes.service.inventory.protobuf.SkuInventory.Builder, acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder> skusBuilder_;

    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public java.util.List<acmeshoes.service.inventory.protobuf.SkuInventory> getSkusList() {
      if (skusBuilder_ == null) {
        return java.util.Collections.unmodifiableList(skus_);
      } else {
        return skusBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public int getSkusCount() {
      if (skusBuilder_ == null) {
        return skus_.size();
      } else {
        return skusBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public acmeshoes.service.inventory.protobuf.SkuInventory getSkus(int index) {
      if (skusBuilder_ == null) {
        return skus_.get(index);
      } else {
        return skusBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder setSkus(
        int index, acmeshoes.service.inventory.protobuf.SkuInventory value) {
      if (skusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkusIsMutable();
        skus_.set(index, value);
        onChanged();
      } else {
        skusBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder setSkus(
        int index, acmeshoes.service.inventory.protobuf.SkuInventory.Builder builderForValue) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.set(index, builderForValue.build());
        onChanged();
      } else {
        skusBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder addSkus(acmeshoes.service.inventory.protobuf.SkuInventory value) {
      if (skusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkusIsMutable();
        skus_.add(value);
        onChanged();
      } else {
        skusBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder addSkus(
        int index, acmeshoes.service.inventory.protobuf.SkuInventory value) {
      if (skusBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSkusIsMutable();
        skus_.add(index, value);
        onChanged();
      } else {
        skusBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder addSkus(
        acmeshoes.service.inventory.protobuf.SkuInventory.Builder builderForValue) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.add(builderForValue.build());
        onChanged();
      } else {
        skusBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder addSkus(
        int index, acmeshoes.service.inventory.protobuf.SkuInventory.Builder builderForValue) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.add(index, builderForValue.build());
        onChanged();
      } else {
        skusBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder addAllSkus(
        java.lang.Iterable<? extends acmeshoes.service.inventory.protobuf.SkuInventory> values) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, skus_);
        onChanged();
      } else {
        skusBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder clearSkus() {
      if (skusBuilder_ == null) {
        skus_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        skusBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public Builder removeSkus(int index) {
      if (skusBuilder_ == null) {
        ensureSkusIsMutable();
        skus_.remove(index);
        onChanged();
      } else {
        skusBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public acmeshoes.service.inventory.protobuf.SkuInventory.Builder getSkusBuilder(
        int index) {
      return getSkusFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder getSkusOrBuilder(
        int index) {
      if (skusBuilder_ == null) {
        return skus_.get(index);  } else {
        return skusBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public java.util.List<? extends acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder> 
         getSkusOrBuilderList() {
      if (skusBuilder_ != null) {
        return skusBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(skus_);
      }
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public acmeshoes.service.inventory.protobuf.SkuInventory.Builder addSkusBuilder() {
      return getSkusFieldBuilder().addBuilder(
          acmeshoes.service.inventory.protobuf.SkuInventory.getDefaultInstance());
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public acmeshoes.service.inventory.protobuf.SkuInventory.Builder addSkusBuilder(
        int index) {
      return getSkusFieldBuilder().addBuilder(
          index, acmeshoes.service.inventory.protobuf.SkuInventory.getDefaultInstance());
    }
    /**
     * <code>repeated .acmeshoes.service.inventory.SkuInventory skus = 2;</code>
     */
    public java.util.List<acmeshoes.service.inventory.protobuf.SkuInventory.Builder> 
         getSkusBuilderList() {
      return getSkusFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        acmeshoes.service.inventory.protobuf.SkuInventory, acmeshoes.service.inventory.protobuf.SkuInventory.Builder, acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder> 
        getSkusFieldBuilder() {
      if (skusBuilder_ == null) {
        skusBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            acmeshoes.service.inventory.protobuf.SkuInventory, acmeshoes.service.inventory.protobuf.SkuInventory.Builder, acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder>(
                skus_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        skus_ = null;
      }
      return skusBuilder_;
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


    // @@protoc_insertion_point(builder_scope:acmeshoes.service.inventory.ProductInventoryResponse)
  }

  // @@protoc_insertion_point(class_scope:acmeshoes.service.inventory.ProductInventoryResponse)
  private static final acmeshoes.service.inventory.protobuf.ProductInventoryResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new acmeshoes.service.inventory.protobuf.ProductInventoryResponse();
  }

  public static acmeshoes.service.inventory.protobuf.ProductInventoryResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProductInventoryResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProductInventoryResponse>() {
    @java.lang.Override
    public ProductInventoryResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ProductInventoryResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ProductInventoryResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProductInventoryResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public acmeshoes.service.inventory.protobuf.ProductInventoryResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

