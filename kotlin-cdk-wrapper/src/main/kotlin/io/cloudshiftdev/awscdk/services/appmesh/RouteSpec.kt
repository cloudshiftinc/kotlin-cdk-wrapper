@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class RouteSpec internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appmesh.RouteSpec,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): RouteSpecConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(RouteSpecConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.RouteSpec,
  ) : RouteSpec(cdkObject)

  public companion object {
    public fun grpc(options: GrpcRouteSpecOptions): RouteSpec =
        software.amazon.awscdk.services.appmesh.RouteSpec.grpc(options.let(GrpcRouteSpecOptions::unwrap)).let(RouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fc28dcf808b3ebcbf9f38613fcbdd0645f0b82d5945d8a620ed7b4b9fcf3d85b")
    public fun grpc(options: GrpcRouteSpecOptions.Builder.() -> Unit): RouteSpec =
        grpc(GrpcRouteSpecOptions(options))

    public fun http(options: HttpRouteSpecOptions): RouteSpec =
        software.amazon.awscdk.services.appmesh.RouteSpec.http(options.let(HttpRouteSpecOptions::unwrap)).let(RouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1bfddccd485c3fe5b29338b133376307d93f409f7c0b903d635bbd558046f67b")
    public fun http(options: HttpRouteSpecOptions.Builder.() -> Unit): RouteSpec =
        http(HttpRouteSpecOptions(options))

    public fun http2(options: HttpRouteSpecOptions): RouteSpec =
        software.amazon.awscdk.services.appmesh.RouteSpec.http2(options.let(HttpRouteSpecOptions::unwrap)).let(RouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("23e1fc70af5ac38889106ed66894951534640db2bb38ad1eaa88b2dddc554f7c")
    public fun http2(options: HttpRouteSpecOptions.Builder.() -> Unit): RouteSpec =
        http2(HttpRouteSpecOptions(options))

    public fun tcp(options: TcpRouteSpecOptions): RouteSpec =
        software.amazon.awscdk.services.appmesh.RouteSpec.tcp(options.let(TcpRouteSpecOptions::unwrap)).let(RouteSpec::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("981534fa18f8eb5ee1a048c400928ad525aa9f1c8826090f3f79666fdc02cf5a")
    public fun tcp(options: TcpRouteSpecOptions.Builder.() -> Unit): RouteSpec =
        tcp(TcpRouteSpecOptions(options))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.RouteSpec): RouteSpec =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: RouteSpec): software.amazon.awscdk.services.appmesh.RouteSpec =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appmesh.RouteSpec
  }
}
