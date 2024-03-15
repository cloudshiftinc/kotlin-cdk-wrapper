@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApiGatewayManagedOverridesProps {
  public fun apiId(): String

  public fun integration(): Any? = unwrap(this).getIntegration()

  public fun route(): Any? = unwrap(this).getRoute()

  public fun stage(): Any? = unwrap(this).getStage()

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun integration(integration: IResolvable)

    public fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d62610d909648b6138524ba5890f64aff9b8e3494466057b74483fb28a3932ae")
    public
        fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder.() -> Unit)

    public fun route(route: IResolvable)

    public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6472ae77482876534584f8243003c0a8f901f71ba0500477c5a5ed5ffdb6f584")
    public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder.() -> Unit)

    public fun stage(stage: IResolvable)

    public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7895000995f41f81ad9c5e8e949e60fc23d40e43e559043674bd958a2abdda")
    public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    override
        fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty) {
      cdkBuilder.integration(integration.let(CfnApiGatewayManagedOverrides.IntegrationOverridesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d62610d909648b6138524ba5890f64aff9b8e3494466057b74483fb28a3932ae")
    override
        fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder.() -> Unit):
        Unit = integration(CfnApiGatewayManagedOverrides.IntegrationOverridesProperty(integration))

    override fun route(route: IResolvable) {
      cdkBuilder.route(route.let(IResolvable::unwrap))
    }

    override fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty) {
      cdkBuilder.route(route.let(CfnApiGatewayManagedOverrides.RouteOverridesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6472ae77482876534584f8243003c0a8f901f71ba0500477c5a5ed5ffdb6f584")
    override
        fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder.() -> Unit):
        Unit = route(CfnApiGatewayManagedOverrides.RouteOverridesProperty(route))

    override fun stage(stage: IResolvable) {
      cdkBuilder.stage(stage.let(IResolvable::unwrap))
    }

    override fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty) {
      cdkBuilder.stage(stage.let(CfnApiGatewayManagedOverrides.StageOverridesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7895000995f41f81ad9c5e8e949e60fc23d40e43e559043674bd958a2abdda")
    override
        fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder.() -> Unit):
        Unit = stage(CfnApiGatewayManagedOverrides.StageOverridesProperty(stage))

    public fun build():
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps,
  ) : CdkObject(cdkObject), CfnApiGatewayManagedOverridesProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun integration(): Any? = unwrap(this).getIntegration()

    override fun route(): Any? = unwrap(this).getRoute()

    override fun stage(): Any? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiGatewayManagedOverridesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps):
        CfnApiGatewayManagedOverridesProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiGatewayManagedOverridesProps):
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps
  }
}
