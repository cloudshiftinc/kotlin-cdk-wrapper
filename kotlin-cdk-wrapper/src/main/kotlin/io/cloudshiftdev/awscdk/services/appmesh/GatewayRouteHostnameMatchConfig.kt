@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface GatewayRouteHostnameMatchConfig {
  public fun hostnameMatch(): CfnGatewayRoute.GatewayRouteHostnameMatchProperty

  @CdkDslMarker
  public interface Builder {
    public fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66e199f5cd8312912ac210b0b0df2c995400d4198db87b42467f6b441ab49127")
    public
        fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig.Builder =
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig.builder()

    override fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty) {
      cdkBuilder.hostnameMatch(hostnameMatch.let(CfnGatewayRoute.GatewayRouteHostnameMatchProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("66e199f5cd8312912ac210b0b0df2c995400d4198db87b42467f6b441ab49127")
    override
        fun hostnameMatch(hostnameMatch: CfnGatewayRoute.GatewayRouteHostnameMatchProperty.Builder.() -> Unit):
        Unit = hostnameMatch(CfnGatewayRoute.GatewayRouteHostnameMatchProperty(hostnameMatch))

    public fun build(): software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig,
  ) : CdkObject(cdkObject), GatewayRouteHostnameMatchConfig {
    override fun hostnameMatch(): CfnGatewayRoute.GatewayRouteHostnameMatchProperty =
        unwrap(this).getHostnameMatch().let(CfnGatewayRoute.GatewayRouteHostnameMatchProperty::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GatewayRouteHostnameMatchConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig):
        GatewayRouteHostnameMatchConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GatewayRouteHostnameMatchConfig):
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.appmesh.GatewayRouteHostnameMatchConfig
  }
}