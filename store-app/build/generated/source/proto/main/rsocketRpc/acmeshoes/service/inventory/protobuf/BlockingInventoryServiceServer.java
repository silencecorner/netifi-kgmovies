package acmeshoes.service.inventory.protobuf;

@javax.annotation.Generated(
    value = "by RSocket RPC proto compiler (version 0.2.18)",
    comments = "Source: acmeshoes.service.inventory/inventory-service.proto")
@io.rsocket.rpc.annotations.internal.Generated(
    type = io.rsocket.rpc.annotations.internal.ResourceType.SERVICE,
    idlClass = BlockingInventoryService.class)
@javax.inject.Named(
    value ="BlockingInventoryServiceServer")
public final class BlockingInventoryServiceServer extends io.rsocket.rpc.AbstractRSocketService {
  private final BlockingInventoryService service;
  private final reactor.core.scheduler.Scheduler scheduler;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getProductInventory;
  private final java.util.function.Function<? super org.reactivestreams.Publisher<io.rsocket.Payload>, ? extends org.reactivestreams.Publisher<io.rsocket.Payload>> getSkuInventory;
  @javax.inject.Inject
  public BlockingInventoryServiceServer(BlockingInventoryService service, java.util.Optional<reactor.core.scheduler.Scheduler> scheduler, java.util.Optional<io.micrometer.core.instrument.MeterRegistry> registry) {
    this.scheduler = scheduler.orElse(reactor.core.scheduler.Schedulers.elastic());
    this.service = service;
    if (!registry.isPresent()) {
      this.getProductInventory = java.util.function.Function.identity();
      this.getSkuInventory = java.util.function.Function.identity();
    } else {
      this.getProductInventory = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingInventoryService.SERVICE_ID, "method", BlockingInventoryService.METHOD_GET_PRODUCT_INVENTORY);
      this.getSkuInventory = io.rsocket.rpc.metrics.Metrics.timed(registry.get(), "rsocket.server", "service", BlockingInventoryService.SERVICE_ID, "method", BlockingInventoryService.METHOD_GET_SKU_INVENTORY);
    }

  }

  @java.lang.Override
  public String getService() {
    return BlockingInventoryService.SERVICE_ID;
  }

  @java.lang.Override
  public Class<?> getServiceClass() {
    return service.getClass();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> fireAndForget(io.rsocket.Payload payload) {
    return reactor.core.publisher.Mono.error(new UnsupportedOperationException("Fire and forget not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<io.rsocket.Payload> requestResponse(io.rsocket.Payload payload) {
    try {
      io.netty.buffer.ByteBuf metadata = payload.sliceMetadata();
      switch(io.rsocket.rpc.frames.Metadata.getMethod(metadata)) {
        case InventoryService.METHOD_GET_PRODUCT_INVENTORY: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          acmeshoes.service.inventory.protobuf.ProductInventoryRequest message = acmeshoes.service.inventory.protobuf.ProductInventoryRequest.parseFrom(is);
          return reactor.core.publisher.Mono.fromSupplier(() -> service.getProductInventory(message, metadata)).map(serializer).transform(getProductInventory).subscribeOn(scheduler);
        }
        case InventoryService.METHOD_GET_SKU_INVENTORY: {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          acmeshoes.service.inventory.protobuf.SkuInventoryRequest message = acmeshoes.service.inventory.protobuf.SkuInventoryRequest.parseFrom(is);
          return reactor.core.publisher.Mono.fromSupplier(() -> service.getSkuInventory(message, metadata)).map(serializer).transform(getSkuInventory).subscribeOn(scheduler);
        }
        default: {
          return reactor.core.publisher.Mono.error(new UnsupportedOperationException());
        }
      }
    } catch (Throwable t) {
      return reactor.core.publisher.Mono.error(t);
    } finally {
      payload.release();
    }
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestStream(io.rsocket.Payload payload) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Stream not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(io.rsocket.Payload payload, reactor.core.publisher.Flux<io.rsocket.Payload> publisher) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Channel not implemented."));
  }

  @java.lang.Override
  public reactor.core.publisher.Flux<io.rsocket.Payload> requestChannel(org.reactivestreams.Publisher<io.rsocket.Payload> payloads) {
    return reactor.core.publisher.Flux.error(new UnsupportedOperationException("Request-Channel not implemented."));
  }

  private static final java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload> serializer =
    new java.util.function.Function<com.google.protobuf.MessageLite, io.rsocket.Payload>() {
      @java.lang.Override
      public io.rsocket.Payload apply(com.google.protobuf.MessageLite message) {
        int length = message.getSerializedSize();
        io.netty.buffer.ByteBuf byteBuf = io.netty.buffer.ByteBufAllocator.DEFAULT.buffer(length);
        try {
          message.writeTo(com.google.protobuf.CodedOutputStream.newInstance(byteBuf.internalNioBuffer(0, length)));
          byteBuf.writerIndex(length);
          return io.rsocket.util.ByteBufPayload.create(byteBuf);
        } catch (Throwable t) {
          byteBuf.release();
          throw new RuntimeException(t);
        }
      }
    };

  private static <T> java.util.function.Function<io.rsocket.Payload, T> deserializer(final com.google.protobuf.Parser<T> parser) {
    return new java.util.function.Function<io.rsocket.Payload, T>() {
      @java.lang.Override
      public T apply(io.rsocket.Payload payload) {
        try {
          com.google.protobuf.CodedInputStream is = com.google.protobuf.CodedInputStream.newInstance(payload.getData());
          return parser.parseFrom(is);
        } catch (Throwable t) {
          throw new RuntimeException(t);
        } finally {
          payload.release();
        }
      }
    };
  }
}
