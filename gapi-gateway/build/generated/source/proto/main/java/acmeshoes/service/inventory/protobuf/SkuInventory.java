// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: acmeshoes.service.inventory/inventory-service.proto

package acmeshoes.service.inventory.protobuf;

/**
 * Protobuf type {@code acmeshoes.service.inventory.SkuInventory}
 */
public  final class SkuInventory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:acmeshoes.service.inventory.SkuInventory)
    SkuInventoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SkuInventory.newBuilder() to construct.
  private SkuInventory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SkuInventory() {
    sku_ = "";
    units_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SkuInventory(
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

            sku_ = s;
            break;
          }
          case 16: {

            units_ = input.readInt32();
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
    return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_SkuInventory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_SkuInventory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            acmeshoes.service.inventory.protobuf.SkuInventory.class, acmeshoes.service.inventory.protobuf.SkuInventory.Builder.class);
  }

  public static final int SKU_FIELD_NUMBER = 1;
  private volatile java.lang.Object sku_;
  /**
   * <code>string sku = 1;</code>
   */
  public java.lang.String getSku() {
    java.lang.Object ref = sku_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sku_ = s;
      return s;
    }
  }
  /**
   * <code>string sku = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSkuBytes() {
    java.lang.Object ref = sku_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sku_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNITS_FIELD_NUMBER = 2;
  private int units_;
  /**
   * <code>int32 units = 2;</code>
   */
  public int getUnits() {
    return units_;
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
    if (!getSkuBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sku_);
    }
    if (units_ != 0) {
      output.writeInt32(2, units_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSkuBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sku_);
    }
    if (units_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, units_);
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
    if (!(obj instanceof acmeshoes.service.inventory.protobuf.SkuInventory)) {
      return super.equals(obj);
    }
    acmeshoes.service.inventory.protobuf.SkuInventory other = (acmeshoes.service.inventory.protobuf.SkuInventory) obj;

    boolean result = true;
    result = result && getSku()
        .equals(other.getSku());
    result = result && (getUnits()
        == other.getUnits());
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
    hash = (37 * hash) + SKU_FIELD_NUMBER;
    hash = (53 * hash) + getSku().hashCode();
    hash = (37 * hash) + UNITS_FIELD_NUMBER;
    hash = (53 * hash) + getUnits();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static acmeshoes.service.inventory.protobuf.SkuInventory parseFrom(
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
  public static Builder newBuilder(acmeshoes.service.inventory.protobuf.SkuInventory prototype) {
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
   * Protobuf type {@code acmeshoes.service.inventory.SkuInventory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:acmeshoes.service.inventory.SkuInventory)
      acmeshoes.service.inventory.protobuf.SkuInventoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_SkuInventory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_SkuInventory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              acmeshoes.service.inventory.protobuf.SkuInventory.class, acmeshoes.service.inventory.protobuf.SkuInventory.Builder.class);
    }

    // Construct using acmeshoes.service.inventory.protobuf.SkuInventory.newBuilder()
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
      sku_ = "";

      units_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return acmeshoes.service.inventory.protobuf.InventoryServiceProto.internal_static_acmeshoes_service_inventory_SkuInventory_descriptor;
    }

    @java.lang.Override
    public acmeshoes.service.inventory.protobuf.SkuInventory getDefaultInstanceForType() {
      return acmeshoes.service.inventory.protobuf.SkuInventory.getDefaultInstance();
    }

    @java.lang.Override
    public acmeshoes.service.inventory.protobuf.SkuInventory build() {
      acmeshoes.service.inventory.protobuf.SkuInventory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public acmeshoes.service.inventory.protobuf.SkuInventory buildPartial() {
      acmeshoes.service.inventory.protobuf.SkuInventory result = new acmeshoes.service.inventory.protobuf.SkuInventory(this);
      result.sku_ = sku_;
      result.units_ = units_;
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
      if (other instanceof acmeshoes.service.inventory.protobuf.SkuInventory) {
        return mergeFrom((acmeshoes.service.inventory.protobuf.SkuInventory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(acmeshoes.service.inventory.protobuf.SkuInventory other) {
      if (other == acmeshoes.service.inventory.protobuf.SkuInventory.getDefaultInstance()) return this;
      if (!other.getSku().isEmpty()) {
        sku_ = other.sku_;
        onChanged();
      }
      if (other.getUnits() != 0) {
        setUnits(other.getUnits());
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
      acmeshoes.service.inventory.protobuf.SkuInventory parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (acmeshoes.service.inventory.protobuf.SkuInventory) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object sku_ = "";
    /**
     * <code>string sku = 1;</code>
     */
    public java.lang.String getSku() {
      java.lang.Object ref = sku_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sku_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sku = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSkuBytes() {
      java.lang.Object ref = sku_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sku_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sku = 1;</code>
     */
    public Builder setSku(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sku_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sku = 1;</code>
     */
    public Builder clearSku() {
      
      sku_ = getDefaultInstance().getSku();
      onChanged();
      return this;
    }
    /**
     * <code>string sku = 1;</code>
     */
    public Builder setSkuBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sku_ = value;
      onChanged();
      return this;
    }

    private int units_ ;
    /**
     * <code>int32 units = 2;</code>
     */
    public int getUnits() {
      return units_;
    }
    /**
     * <code>int32 units = 2;</code>
     */
    public Builder setUnits(int value) {
      
      units_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 units = 2;</code>
     */
    public Builder clearUnits() {
      
      units_ = 0;
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


    // @@protoc_insertion_point(builder_scope:acmeshoes.service.inventory.SkuInventory)
  }

  // @@protoc_insertion_point(class_scope:acmeshoes.service.inventory.SkuInventory)
  private static final acmeshoes.service.inventory.protobuf.SkuInventory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new acmeshoes.service.inventory.protobuf.SkuInventory();
  }

  public static acmeshoes.service.inventory.protobuf.SkuInventory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SkuInventory>
      PARSER = new com.google.protobuf.AbstractParser<SkuInventory>() {
    @java.lang.Override
    public SkuInventory parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SkuInventory(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SkuInventory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SkuInventory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public acmeshoes.service.inventory.protobuf.SkuInventory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

