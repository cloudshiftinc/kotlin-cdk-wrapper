package io.cloudshiftdev.awscdk.services.appmesh

import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GrpcGatewayRouteMatch {
  public fun hostname(): GatewayRouteHostnameMatch? =
      unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

  public fun metadata(): List<HeaderMatch> = unwrap(this).getMetadata()?.map(HeaderMatch::wrap) ?:
      emptyList()

  public fun port(): Number? = unwrap(this).getPort()

  public fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()

  public fun serviceName(): String? = unwrap(this).getServiceName()

  public interface Builder {
    public fun hostname(hostname: GatewayRouteHostnameMatch)

    public fun metadata(metadata: List<HeaderMatch>)

    public fun metadata(vararg metadata: HeaderMatch)

    public fun port(port: Number)

    public fun rewriteRequestHostname(rewriteRequestHostname: Boolean)

    public fun serviceName(serviceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch.Builder =
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch.builder()

    override fun hostname(hostname: GatewayRouteHostnameMatch) {
      cdkBuilder.hostname(hostname.let(GatewayRouteHostnameMatch::unwrap))
    }

    override fun metadata(metadata: List<HeaderMatch>) {
      cdkBuilder.metadata(metadata.map(HeaderMatch::unwrap))
    }

    override fun metadata(vararg metadata: HeaderMatch): Unit = metadata(metadata.toList())

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun rewriteRequestHostname(rewriteRequestHostname: Boolean) {
      cdkBuilder.rewriteRequestHostname(rewriteRequestHostname)
    }

    override fun serviceName(serviceName: String) {
      cdkBuilder.serviceName(serviceName)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch,
  ) : GrpcGatewayRouteMatch {
    override fun hostname(): GatewayRouteHostnameMatch? =
        unwrap(this).getHostname()?.let(GatewayRouteHostnameMatch::wrap)

    override fun metadata(): List<HeaderMatch> = unwrap(this).getMetadata()?.map(HeaderMatch::wrap)
        ?: emptyList()

    override fun port(): Number? = unwrap(this).getPort()

    override fun rewriteRequestHostname(): Boolean? = unwrap(this).getRewriteRequestHostname()

    override fun serviceName(): String? = unwrap(this).getServiceName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GrpcGatewayRouteMatch {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch):
        GrpcGatewayRouteMatch = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GrpcGatewayRouteMatch):
        software.amazon.awscdk.services.appmesh.GrpcGatewayRouteMatch = (wrapped as
        Wrapper).cdkObject
  }
}
