@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApiGatewayManagedOverrides`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * CfnApiGatewayManagedOverridesProps cfnApiGatewayManagedOverridesProps =
 * CfnApiGatewayManagedOverridesProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .integration(IntegrationOverridesProperty.builder()
 * .description("description")
 * .integrationMethod("integrationMethod")
 * .payloadFormatVersion("payloadFormatVersion")
 * .timeoutInMillis(123)
 * .build())
 * .route(RouteOverridesProperty.builder()
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .operationName("operationName")
 * .target("target")
 * .build())
 * .stage(StageOverridesProperty.builder()
 * .accessLogSettings(AccessLogSettingsProperty.builder()
 * .destinationArn("destinationArn")
 * .format("format")
 * .build())
 * .autoDeploy(false)
 * .defaultRouteSettings(RouteSettingsProperty.builder()
 * .dataTraceEnabled(false)
 * .detailedMetricsEnabled(false)
 * .loggingLevel("loggingLevel")
 * .throttlingBurstLimit(123)
 * .throttlingRateLimit(123)
 * .build())
 * .description("description")
 * .routeSettings(routeSettings)
 * .stageVariables(stageVariables)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html)
 */
public interface CfnApiGatewayManagedOverridesProps {
  /**
   * The ID of the API for which to override the configuration of API Gateway-managed resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-apiid)
   */
  public fun apiId(): String

  /**
   * Overrides the integration configuration for an API Gateway-managed integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
   */
  public fun integration(): Any? = unwrap(this).getIntegration()

  /**
   * Overrides the route configuration for an API Gateway-managed route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
   */
  public fun route(): Any? = unwrap(this).getRoute()

  /**
   * Overrides the stage configuration for an API Gateway-managed stage.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
   */
  public fun stage(): Any? = unwrap(this).getStage()

  /**
   * A builder for [CfnApiGatewayManagedOverridesProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiId The ID of the API for which to override the configuration of API Gateway-managed
     * resources. 
     */
    public fun apiId(apiId: String)

    /**
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration.
     */
    public fun integration(integration: IResolvable)

    /**
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration.
     */
    public fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty)

    /**
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d62610d909648b6138524ba5890f64aff9b8e3494466057b74483fb28a3932ae")
    public
        fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder.() -> Unit)

    /**
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    public fun route(route: IResolvable)

    /**
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty)

    /**
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6472ae77482876534584f8243003c0a8f901f71ba0500477c5a5ed5ffdb6f584")
    public fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder.() -> Unit)

    /**
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    public fun stage(stage: IResolvable)

    /**
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty)

    /**
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a7895000995f41f81ad9c5e8e949e60fc23d40e43e559043674bd958a2abdda")
    public fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps.builder()

    /**
     * @param apiId The ID of the API for which to override the configuration of API Gateway-managed
     * resources. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration.
     */
    override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    /**
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration.
     */
    override
        fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty) {
      cdkBuilder.integration(integration.let(CfnApiGatewayManagedOverrides.IntegrationOverridesProperty::unwrap))
    }

    /**
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d62610d909648b6138524ba5890f64aff9b8e3494466057b74483fb28a3932ae")
    override
        fun integration(integration: CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder.() -> Unit):
        Unit = integration(CfnApiGatewayManagedOverrides.IntegrationOverridesProperty(integration))

    /**
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    override fun route(route: IResolvable) {
      cdkBuilder.route(route.let(IResolvable::unwrap))
    }

    /**
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    override fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty) {
      cdkBuilder.route(route.let(CfnApiGatewayManagedOverrides.RouteOverridesProperty::unwrap))
    }

    /**
     * @param route Overrides the route configuration for an API Gateway-managed route.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6472ae77482876534584f8243003c0a8f901f71ba0500477c5a5ed5ffdb6f584")
    override
        fun route(route: CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder.() -> Unit):
        Unit = route(CfnApiGatewayManagedOverrides.RouteOverridesProperty(route))

    /**
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    override fun stage(stage: IResolvable) {
      cdkBuilder.stage(stage.let(IResolvable::unwrap))
    }

    /**
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
    override fun stage(stage: CfnApiGatewayManagedOverrides.StageOverridesProperty) {
      cdkBuilder.stage(stage.let(CfnApiGatewayManagedOverrides.StageOverridesProperty::unwrap))
    }

    /**
     * @param stage Overrides the stage configuration for an API Gateway-managed stage.
     */
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
    /**
     * The ID of the API for which to override the configuration of API Gateway-managed resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-apiid)
     */
    override fun apiId(): String = unwrap(this).getApiId()

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     */
    override fun integration(): Any? = unwrap(this).getIntegration()

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     */
    override fun route(): Any? = unwrap(this).getRoute()

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     */
    override fun stage(): Any? = unwrap(this).getStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiGatewayManagedOverridesProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps):
        CfnApiGatewayManagedOverridesProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnApiGatewayManagedOverridesProps

    internal fun unwrap(wrapped: CfnApiGatewayManagedOverridesProps):
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverridesProps
  }
}
