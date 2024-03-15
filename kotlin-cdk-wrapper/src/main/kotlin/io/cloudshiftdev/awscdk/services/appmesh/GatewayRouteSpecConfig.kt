@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName

public interface GatewayRouteSpecConfig {
  public fun grpcSpecConfig(): CfnGatewayRoute.GrpcGatewayRouteProperty? =
      unwrap(this).getGrpcSpecConfig()?.let(CfnGatewayRoute.GrpcGatewayRouteProperty::wrap)

  public fun http2SpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
      unwrap(this).getHttp2SpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

  public fun httpSpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
      unwrap(this).getHttpSpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

  public fun priority(): Number? = unwrap(this).getPriority()

  @CdkDslMarker
  public interface Builder {
    public fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a48e768578c81af5adabfab72a86facf38a3e71857773f94214b95f54d6e9a78")
    public
        fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder.() -> Unit)

    public fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00eac5ae02075cfdca2760cfb0ef55ef0da125778059d13571c31ac32ec68b0c")
    public
        fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit)

    public fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00897ac40e45cf896dcb1fd16d121a288e413fe3e1bc4e38e8d580fdbebc6225")
    public
        fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit)

    public fun priority(priority: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig.builder()

    override fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty) {
      cdkBuilder.grpcSpecConfig(grpcSpecConfig.let(CfnGatewayRoute.GrpcGatewayRouteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a48e768578c81af5adabfab72a86facf38a3e71857773f94214b95f54d6e9a78")
    override
        fun grpcSpecConfig(grpcSpecConfig: CfnGatewayRoute.GrpcGatewayRouteProperty.Builder.() -> Unit):
        Unit = grpcSpecConfig(CfnGatewayRoute.GrpcGatewayRouteProperty(grpcSpecConfig))

    override fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
      cdkBuilder.http2SpecConfig(http2SpecConfig.let(CfnGatewayRoute.HttpGatewayRouteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00eac5ae02075cfdca2760cfb0ef55ef0da125778059d13571c31ac32ec68b0c")
    override
        fun http2SpecConfig(http2SpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit):
        Unit = http2SpecConfig(CfnGatewayRoute.HttpGatewayRouteProperty(http2SpecConfig))

    override fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty) {
      cdkBuilder.httpSpecConfig(httpSpecConfig.let(CfnGatewayRoute.HttpGatewayRouteProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00897ac40e45cf896dcb1fd16d121a288e413fe3e1bc4e38e8d580fdbebc6225")
    override
        fun httpSpecConfig(httpSpecConfig: CfnGatewayRoute.HttpGatewayRouteProperty.Builder.() -> Unit):
        Unit = httpSpecConfig(CfnGatewayRoute.HttpGatewayRouteProperty(httpSpecConfig))

    override fun priority(priority: Number) {
      cdkBuilder.priority(priority)
    }

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig,
  ) : CdkObject(cdkObject), GatewayRouteSpecConfig {
    override fun grpcSpecConfig(): CfnGatewayRoute.GrpcGatewayRouteProperty? =
        unwrap(this).getGrpcSpecConfig()?.let(CfnGatewayRoute.GrpcGatewayRouteProperty::wrap)

    override fun http2SpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
        unwrap(this).getHttp2SpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

    override fun httpSpecConfig(): CfnGatewayRoute.HttpGatewayRouteProperty? =
        unwrap(this).getHttpSpecConfig()?.let(CfnGatewayRoute.HttpGatewayRouteProperty::wrap)

    override fun priority(): Number? = unwrap(this).getPriority()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteSpecConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig):
        GatewayRouteSpecConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteSpecConfig):
        software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.GatewayRouteSpecConfig
  }
}
