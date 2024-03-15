@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class GatewayRouteSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpec,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): GatewayRouteSpecConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(GatewayRouteSpecConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpec,
  ) : GatewayRouteSpec(cdkObject)

  public companion object {
    public fun grpc(options: GrpcGatewayRouteSpecOptions): GatewayRouteSpec =
        software.amazon.awscdk.services.appmesh.GatewayRouteSpec.grpc(options.let(GrpcGatewayRouteSpecOptions::unwrap)).let(GatewayRouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("20a057acd1d5bea0171c6ed08df4018bcd4552b87df80c44e8eba2463ece741e")
    public fun grpc(options: GrpcGatewayRouteSpecOptions.Builder.() -> Unit): GatewayRouteSpec =
        grpc(GrpcGatewayRouteSpecOptions(options))

    public fun http(options: HttpGatewayRouteSpecOptions): GatewayRouteSpec =
        software.amazon.awscdk.services.appmesh.GatewayRouteSpec.http(options.let(HttpGatewayRouteSpecOptions::unwrap)).let(GatewayRouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("38854938bce1dd96cd8f2207bbe2cb32753f6ac78eb62f5b193b7cf060c2ff0c")
    public fun http(options: HttpGatewayRouteSpecOptions.Builder.() -> Unit): GatewayRouteSpec =
        http(HttpGatewayRouteSpecOptions(options))

    public fun http2(options: HttpGatewayRouteSpecOptions): GatewayRouteSpec =
        software.amazon.awscdk.services.appmesh.GatewayRouteSpec.http2(options.let(HttpGatewayRouteSpecOptions::unwrap)).let(GatewayRouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d640a2a4cef3f119369351bf30da380f984be62890146cf53c65006cf3bea353")
    public fun http2(options: HttpGatewayRouteSpecOptions.Builder.() -> Unit): GatewayRouteSpec =
        http2(HttpGatewayRouteSpecOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteSpec):
        GatewayRouteSpec = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteSpec):
        software.amazon.awscdk.services.appmesh.GatewayRouteSpec = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appmesh.GatewayRouteSpec
  }
}
