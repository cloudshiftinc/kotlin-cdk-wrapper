package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GrpcRouteMatch {
  public fun metadata(): List<HeaderMatch> = unwrap(this).getMetadata()?.map(HeaderMatch::wrap) ?:
      emptyList()

  public fun methodName(): String? = unwrap(this).getMethodName()

  public fun port(): Number? = unwrap(this).getPort()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public interface Builder {
    public fun metadata(metadata: List<HeaderMatch>) {
    }

    public fun methodName(methodName: String) {
    }

    public fun port(port: Number) {
    }

    public fun serviceName(serviceName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.GrpcRouteMatch.builder()

    public override fun metadata(metadata: List<HeaderMatch>) {
      cdkBuilder.metadata(metadata.map(HeaderMatch::unwrap))
    }

    public override fun methodName(methodName: String) {
      cdkBuilder.methodName(methodName)
    }

    public override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    public override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcRouteMatch = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteMatch,
  ) : GrpcRouteMatch {
    public override fun metadata(): List<HeaderMatch> =
        unwrap(this).getMetadata()?.map(HeaderMatch::wrap) ?: emptyList()

    public override fun methodName(): String? = unwrap(this).getMethodName()

    public override fun port(): Number? = unwrap(this).getPort()

    public override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcRouteMatch):
        GrpcRouteMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcRouteMatch):
        software.amazon.awscdk.services.appmesh.GrpcRouteMatch = (wrapped as Wrapper).cdkObject
  }
}
