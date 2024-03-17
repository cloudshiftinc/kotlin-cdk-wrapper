@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::ApiGatewayManagedOverrides` resource overrides the default properties of
 * API Gateway-managed resources that are implicitly configured for you when you use quick create.
 *
 * When you create an API by using quick create, an `AWS::ApiGatewayV2::Route` ,
 * `AWS::ApiGatewayV2::Integration` , and `AWS::ApiGatewayV2::Stage` are created for you and associated
 * with your `AWS::ApiGatewayV2::Api` . The `AWS::ApiGatewayV2::ApiGatewayManagedOverrides` resource
 * enables you to set, or override the properties of these implicit resources. Supported only for HTTP
 * APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object routeSettings;
 * Object stageVariables;
 * CfnApiGatewayManagedOverrides cfnApiGatewayManagedOverrides =
 * CfnApiGatewayManagedOverrides.Builder.create(this, "MyCfnApiGatewayManagedOverrides")
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
public open class CfnApiGatewayManagedOverrides internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the API for which to override the configuration of API Gateway-managed resources.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The ID of the API for which to override the configuration of API Gateway-managed resources.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * The identifier.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Overrides the integration configuration for an API Gateway-managed integration.
   */
  public open fun integration(): Any? = unwrap(this).getIntegration()

  /**
   * Overrides the integration configuration for an API Gateway-managed integration.
   */
  public open fun integration(`value`: IResolvable) {
    unwrap(this).setIntegration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Overrides the integration configuration for an API Gateway-managed integration.
   */
  public open fun integration(`value`: IntegrationOverridesProperty) {
    unwrap(this).setIntegration(`value`.let(IntegrationOverridesProperty::unwrap))
  }

  /**
   * Overrides the integration configuration for an API Gateway-managed integration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d227913a4f3e56ca715c309ba6e5e982dfdb88590d0d2e1c89e61cf2459504b5")
  public open fun integration(`value`: IntegrationOverridesProperty.Builder.() -> Unit): Unit =
      integration(IntegrationOverridesProperty(`value`))

  /**
   * Overrides the route configuration for an API Gateway-managed route.
   */
  public open fun route(): Any? = unwrap(this).getRoute()

  /**
   * Overrides the route configuration for an API Gateway-managed route.
   */
  public open fun route(`value`: IResolvable) {
    unwrap(this).setRoute(`value`.let(IResolvable::unwrap))
  }

  /**
   * Overrides the route configuration for an API Gateway-managed route.
   */
  public open fun route(`value`: RouteOverridesProperty) {
    unwrap(this).setRoute(`value`.let(RouteOverridesProperty::unwrap))
  }

  /**
   * Overrides the route configuration for an API Gateway-managed route.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ca232602418b963933c78f051960c14f1306082fe35667538d9823f7a2319a4b")
  public open fun route(`value`: RouteOverridesProperty.Builder.() -> Unit): Unit =
      route(RouteOverridesProperty(`value`))

  /**
   * Overrides the stage configuration for an API Gateway-managed stage.
   */
  public open fun stage(): Any? = unwrap(this).getStage()

  /**
   * Overrides the stage configuration for an API Gateway-managed stage.
   */
  public open fun stage(`value`: IResolvable) {
    unwrap(this).setStage(`value`.let(IResolvable::unwrap))
  }

  /**
   * Overrides the stage configuration for an API Gateway-managed stage.
   */
  public open fun stage(`value`: StageOverridesProperty) {
    unwrap(this).setStage(`value`.let(StageOverridesProperty::unwrap))
  }

  /**
   * Overrides the stage configuration for an API Gateway-managed stage.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e3dfce67de4814dc0a36fc02552a6a40b13c7419e2341b74d30ddb987c775a8b")
  public open fun stage(`value`: StageOverridesProperty.Builder.() -> Unit): Unit =
      stage(StageOverridesProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the API for which to override the configuration of API Gateway-managed resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-apiid)
     * @param apiId The ID of the API for which to override the configuration of API Gateway-managed
     * resources. 
     */
    public fun apiId(apiId: String)

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration. 
     */
    public fun integration(integration: IResolvable)

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration. 
     */
    public fun integration(integration: IntegrationOverridesProperty)

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1994cd72c74baf9b22c5e968c3a4a843eb3995442f997c9beaacc8c19e88440e")
    public fun integration(integration: IntegrationOverridesProperty.Builder.() -> Unit)

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     * @param route Overrides the route configuration for an API Gateway-managed route. 
     */
    public fun route(route: IResolvable)

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     * @param route Overrides the route configuration for an API Gateway-managed route. 
     */
    public fun route(route: RouteOverridesProperty)

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     * @param route Overrides the route configuration for an API Gateway-managed route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2d86a5f548e4c32c34baba7510f92a88c7213fad434bb975afebd6c711d6cf8")
    public fun route(route: RouteOverridesProperty.Builder.() -> Unit)

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     * @param stage Overrides the stage configuration for an API Gateway-managed stage. 
     */
    public fun stage(stage: IResolvable)

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     * @param stage Overrides the stage configuration for an API Gateway-managed stage. 
     */
    public fun stage(stage: StageOverridesProperty)

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     * @param stage Overrides the stage configuration for an API Gateway-managed stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e5f5d78a8c8182ecb85c09514d512fa1d6af924c78bcaf0f704ebd2b38b6aa")
    public fun stage(stage: StageOverridesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.Builder.create(scope,
        id)

    /**
     * The ID of the API for which to override the configuration of API Gateway-managed resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-apiid)
     * @param apiId The ID of the API for which to override the configuration of API Gateway-managed
     * resources. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration. 
     */
    override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration. 
     */
    override fun integration(integration: IntegrationOverridesProperty) {
      cdkBuilder.integration(integration.let(IntegrationOverridesProperty::unwrap))
    }

    /**
     * Overrides the integration configuration for an API Gateway-managed integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integration)
     * @param integration Overrides the integration configuration for an API Gateway-managed
     * integration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1994cd72c74baf9b22c5e968c3a4a843eb3995442f997c9beaacc8c19e88440e")
    override fun integration(integration: IntegrationOverridesProperty.Builder.() -> Unit): Unit =
        integration(IntegrationOverridesProperty(integration))

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     * @param route Overrides the route configuration for an API Gateway-managed route. 
     */
    override fun route(route: IResolvable) {
      cdkBuilder.route(route.let(IResolvable::unwrap))
    }

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     * @param route Overrides the route configuration for an API Gateway-managed route. 
     */
    override fun route(route: RouteOverridesProperty) {
      cdkBuilder.route(route.let(RouteOverridesProperty::unwrap))
    }

    /**
     * Overrides the route configuration for an API Gateway-managed route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-route)
     * @param route Overrides the route configuration for an API Gateway-managed route. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f2d86a5f548e4c32c34baba7510f92a88c7213fad434bb975afebd6c711d6cf8")
    override fun route(route: RouteOverridesProperty.Builder.() -> Unit): Unit =
        route(RouteOverridesProperty(route))

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     * @param stage Overrides the stage configuration for an API Gateway-managed stage. 
     */
    override fun stage(stage: IResolvable) {
      cdkBuilder.stage(stage.let(IResolvable::unwrap))
    }

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     * @param stage Overrides the stage configuration for an API Gateway-managed stage. 
     */
    override fun stage(stage: StageOverridesProperty) {
      cdkBuilder.stage(stage.let(StageOverridesProperty::unwrap))
    }

    /**
     * Overrides the stage configuration for an API Gateway-managed stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-apigatewaymanagedoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stage)
     * @param stage Overrides the stage configuration for an API Gateway-managed stage. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b3e5f5d78a8c8182ecb85c09514d512fa1d6af924c78bcaf0f704ebd2b38b6aa")
    override fun stage(stage: StageOverridesProperty.Builder.() -> Unit): Unit =
        stage(StageOverridesProperty(stage))

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiGatewayManagedOverrides {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiGatewayManagedOverrides(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides):
        CfnApiGatewayManagedOverrides = CfnApiGatewayManagedOverrides(cdkObject)

    internal fun unwrap(wrapped: CfnApiGatewayManagedOverrides):
        software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides =
        wrapped.cdkObject
  }

  /**
   * The `RouteOverrides` property overrides the route configuration for an API Gateway-managed
   * route.
   *
   * If you remove this property, API Gateway restores the default values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * RouteOverridesProperty routeOverridesProperty = RouteOverridesProperty.builder()
   * .authorizationScopes(List.of("authorizationScopes"))
   * .authorizationType("authorizationType")
   * .authorizerId("authorizerId")
   * .operationName("operationName")
   * .target("target")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html)
   */
  public interface RouteOverridesProperty {
    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-authorizationscopes)
     */
    public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

    /**
     * The authorization type for the route.
     *
     * To learn more, see
     * [AuthorizationType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-authorizationtype)
     */
    public fun authorizationType(): String? = unwrap(this).getAuthorizationType()

    /**
     * The identifier of the `Authorizer` resource to be associated with this route.
     *
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-authorizerid)
     */
    public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

    /**
     * The operation name for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-operationname)
     */
    public fun operationName(): String? = unwrap(this).getOperationName()

    /**
     * For HTTP integrations, specify a fully qualified URL.
     *
     * For Lambda integrations, specify a function ARN. The type of the integration will be
     * HTTP_PROXY or AWS_PROXY, respectively.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-target)
     */
    public fun target(): String? = unwrap(this).getTarget()

    /**
     * A builder for [RouteOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param authorizationScopes The authorization scopes supported by this route.
       */
      public fun authorizationScopes(authorizationScopes: List<String>)

      /**
       * @param authorizationScopes The authorization scopes supported by this route.
       */
      public fun authorizationScopes(vararg authorizationScopes: String)

      /**
       * @param authorizationType The authorization type for the route.
       * To learn more, see
       * [AuthorizationType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
       * .
       */
      public fun authorizationType(authorizationType: String)

      /**
       * @param authorizerId The identifier of the `Authorizer` resource to be associated with this
       * route.
       * The authorizer identifier is generated by API Gateway when you created the authorizer.
       */
      public fun authorizerId(authorizerId: String)

      /**
       * @param operationName The operation name for the route.
       */
      public fun operationName(operationName: String)

      /**
       * @param target For HTTP integrations, specify a fully qualified URL.
       * For Lambda integrations, specify a function ARN. The type of the integration will be
       * HTTP_PROXY or AWS_PROXY, respectively.
       */
      public fun target(target: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty.builder()

      /**
       * @param authorizationScopes The authorization scopes supported by this route.
       */
      override fun authorizationScopes(authorizationScopes: List<String>) {
        cdkBuilder.authorizationScopes(authorizationScopes)
      }

      /**
       * @param authorizationScopes The authorization scopes supported by this route.
       */
      override fun authorizationScopes(vararg authorizationScopes: String): Unit =
          authorizationScopes(authorizationScopes.toList())

      /**
       * @param authorizationType The authorization type for the route.
       * To learn more, see
       * [AuthorizationType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
       * .
       */
      override fun authorizationType(authorizationType: String) {
        cdkBuilder.authorizationType(authorizationType)
      }

      /**
       * @param authorizerId The identifier of the `Authorizer` resource to be associated with this
       * route.
       * The authorizer identifier is generated by API Gateway when you created the authorizer.
       */
      override fun authorizerId(authorizerId: String) {
        cdkBuilder.authorizerId(authorizerId)
      }

      /**
       * @param operationName The operation name for the route.
       */
      override fun operationName(operationName: String) {
        cdkBuilder.operationName(operationName)
      }

      /**
       * @param target For HTTP integrations, specify a fully qualified URL.
       * For Lambda integrations, specify a function ARN. The type of the integration will be
       * HTTP_PROXY or AWS_PROXY, respectively.
       */
      override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty,
    ) : CdkObject(cdkObject), RouteOverridesProperty {
      /**
       * The authorization scopes supported by this route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-authorizationscopes)
       */
      override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
          emptyList()

      /**
       * The authorization type for the route.
       *
       * To learn more, see
       * [AuthorizationType](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-authorizationtype)
       */
      override fun authorizationType(): String? = unwrap(this).getAuthorizationType()

      /**
       * The identifier of the `Authorizer` resource to be associated with this route.
       *
       * The authorizer identifier is generated by API Gateway when you created the authorizer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-authorizerid)
       */
      override fun authorizerId(): String? = unwrap(this).getAuthorizerId()

      /**
       * The operation name for the route.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-operationname)
       */
      override fun operationName(): String? = unwrap(this).getOperationName()

      /**
       * For HTTP integrations, specify a fully qualified URL.
       *
       * For Lambda integrations, specify a function ARN. The type of the integration will be
       * HTTP_PROXY or AWS_PROXY, respectively.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routeoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routeoverrides-target)
       */
      override fun target(): String? = unwrap(this).getTarget()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty):
          RouteOverridesProperty = CdkObjectWrappers.wrap(cdkObject) as? RouteOverridesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteOverridesProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteOverridesProperty
    }
  }

  /**
   * The `RouteSettings` property overrides the route settings for an API Gateway-managed route.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * RouteSettingsProperty routeSettingsProperty = RouteSettingsProperty.builder()
   * .dataTraceEnabled(false)
   * .detailedMetricsEnabled(false)
   * .loggingLevel("loggingLevel")
   * .throttlingBurstLimit(123)
   * .throttlingRateLimit(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html)
   */
  public interface RouteSettingsProperty {
    /**
     * Specifies whether ( `true` ) or not ( `false` ) data trace logging is enabled for this route.
     *
     * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
     * WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-datatraceenabled)
     */
    public fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

    /**
     * Specifies whether detailed metrics are enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-detailedmetricsenabled)
     */
    public fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

    /**
     * Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF` .
     *
     * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
     * WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-logginglevel)
     */
    public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * Specifies the throttling burst limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-throttlingburstlimit)
     */
    public fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

    /**
     * Specifies the throttling rate limit.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-throttlingratelimit)
     */
    public fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()

    /**
     * A builder for [RouteSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: Boolean)

      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      public fun dataTraceEnabled(dataTraceEnabled: IResolvable)

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean)

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      public fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable)

      /**
       * @param loggingLevel Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF`
       * .
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      public fun loggingLevel(loggingLevel: String)

      /**
       * @param throttlingBurstLimit Specifies the throttling burst limit.
       */
      public fun throttlingBurstLimit(throttlingBurstLimit: Number)

      /**
       * @param throttlingRateLimit Specifies the throttling rate limit.
       */
      public fun throttlingRateLimit(throttlingRateLimit: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty.builder()

      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: Boolean) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled)
      }

      /**
       * @param dataTraceEnabled Specifies whether ( `true` ) or not ( `false` ) data trace logging
       * is enabled for this route.
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      override fun dataTraceEnabled(dataTraceEnabled: IResolvable) {
        cdkBuilder.dataTraceEnabled(dataTraceEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: Boolean) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled)
      }

      /**
       * @param detailedMetricsEnabled Specifies whether detailed metrics are enabled.
       */
      override fun detailedMetricsEnabled(detailedMetricsEnabled: IResolvable) {
        cdkBuilder.detailedMetricsEnabled(detailedMetricsEnabled.let(IResolvable::unwrap))
      }

      /**
       * @param loggingLevel Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF`
       * .
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       */
      override fun loggingLevel(loggingLevel: String) {
        cdkBuilder.loggingLevel(loggingLevel)
      }

      /**
       * @param throttlingBurstLimit Specifies the throttling burst limit.
       */
      override fun throttlingBurstLimit(throttlingBurstLimit: Number) {
        cdkBuilder.throttlingBurstLimit(throttlingBurstLimit)
      }

      /**
       * @param throttlingRateLimit Specifies the throttling rate limit.
       */
      override fun throttlingRateLimit(throttlingRateLimit: Number) {
        cdkBuilder.throttlingRateLimit(throttlingRateLimit)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty,
    ) : CdkObject(cdkObject), RouteSettingsProperty {
      /**
       * Specifies whether ( `true` ) or not ( `false` ) data trace logging is enabled for this
       * route.
       *
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-datatraceenabled)
       */
      override fun dataTraceEnabled(): Any? = unwrap(this).getDataTraceEnabled()

      /**
       * Specifies whether detailed metrics are enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-detailedmetricsenabled)
       */
      override fun detailedMetricsEnabled(): Any? = unwrap(this).getDetailedMetricsEnabled()

      /**
       * Specifies the logging level for this route: `INFO` , `ERROR` , or `OFF` .
       *
       * This property affects the log entries pushed to Amazon CloudWatch Logs. Supported only for
       * WebSocket APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-logginglevel)
       */
      override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

      /**
       * Specifies the throttling burst limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-throttlingburstlimit)
       */
      override fun throttlingBurstLimit(): Number? = unwrap(this).getThrottlingBurstLimit()

      /**
       * Specifies the throttling rate limit.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-routesettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-routesettings-throttlingratelimit)
       */
      override fun throttlingRateLimit(): Number? = unwrap(this).getThrottlingRateLimit()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RouteSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty):
          RouteSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as? RouteSettingsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RouteSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.RouteSettingsProperty
    }
  }

  /**
   * The `AccessLogSettings` property overrides the access log settings for an API Gateway-managed
   * stage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * AccessLogSettingsProperty accessLogSettingsProperty = AccessLogSettingsProperty.builder()
   * .destinationArn("destinationArn")
   * .format("format")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html)
   */
  public interface AccessLogSettingsProperty {
    /**
     * The ARN of the CloudWatch Logs log group to receive access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings-destinationarn)
     */
    public fun destinationArn(): String? = unwrap(this).getDestinationArn()

    /**
     * A single line format of the access logs of data, as specified by selected $context variables.
     *
     * The format must include at least $context.requestId.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings-format)
     */
    public fun format(): String? = unwrap(this).getFormat()

    /**
     * A builder for [AccessLogSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationArn The ARN of the CloudWatch Logs log group to receive access logs.
       */
      public fun destinationArn(destinationArn: String)

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * $context variables.
       * The format must include at least $context.requestId.
       */
      public fun format(format: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty.builder()

      /**
       * @param destinationArn The ARN of the CloudWatch Logs log group to receive access logs.
       */
      override fun destinationArn(destinationArn: String) {
        cdkBuilder.destinationArn(destinationArn)
      }

      /**
       * @param format A single line format of the access logs of data, as specified by selected
       * $context variables.
       * The format must include at least $context.requestId.
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty,
    ) : CdkObject(cdkObject), AccessLogSettingsProperty {
      /**
       * The ARN of the CloudWatch Logs log group to receive access logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings-destinationarn)
       */
      override fun destinationArn(): String? = unwrap(this).getDestinationArn()

      /**
       * A single line format of the access logs of data, as specified by selected $context
       * variables.
       *
       * The format must include at least $context.requestId.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings.html#cfn-apigatewayv2-apigatewaymanagedoverrides-accesslogsettings-format)
       */
      override fun format(): String? = unwrap(this).getFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessLogSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty):
          AccessLogSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AccessLogSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessLogSettingsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.AccessLogSettingsProperty
    }
  }

  /**
   * The `IntegrationOverrides` property overrides the integration settings for an API
   * Gateway-managed integration.
   *
   * If you remove this property, API Gateway restores the default values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * IntegrationOverridesProperty integrationOverridesProperty =
   * IntegrationOverridesProperty.builder()
   * .description("description")
   * .integrationMethod("integrationMethod")
   * .payloadFormatVersion("payloadFormatVersion")
   * .timeoutInMillis(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html)
   */
  public interface IntegrationOverridesProperty {
    /**
     * The description of the integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies the integration's HTTP method type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-integrationmethod)
     */
    public fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

    /**
     * Specifies the format of the payload sent to an integration.
     *
     * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
     * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn more,
     * see [Working with AWS Lambda proxy integrations for HTTP
     * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-payloadformatversion)
     */
    public fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

    /**
     * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and
     * 30,000 milliseconds for HTTP APIs.
     *
     * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-timeoutinmillis)
     */
    public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    /**
     * A builder for [IntegrationOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param description The description of the integration.
       */
      public fun description(description: String)

      /**
       * @param integrationMethod Specifies the integration's HTTP method type.
       */
      public fun integrationMethod(integrationMethod: String)

      /**
       * @param payloadFormatVersion Specifies the format of the payload sent to an integration.
       * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
       * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn
       * more, see [Working with AWS Lambda proxy integrations for HTTP
       * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
       * .
       */
      public fun payloadFormatVersion(payloadFormatVersion: String)

      /**
       * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
       * and between 50 and 30,000 milliseconds for HTTP APIs.
       * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
       */
      public fun timeoutInMillis(timeoutInMillis: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty.builder()

      /**
       * @param description The description of the integration.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param integrationMethod Specifies the integration's HTTP method type.
       */
      override fun integrationMethod(integrationMethod: String) {
        cdkBuilder.integrationMethod(integrationMethod)
      }

      /**
       * @param payloadFormatVersion Specifies the format of the payload sent to an integration.
       * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
       * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn
       * more, see [Working with AWS Lambda proxy integrations for HTTP
       * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
       * .
       */
      override fun payloadFormatVersion(payloadFormatVersion: String) {
        cdkBuilder.payloadFormatVersion(payloadFormatVersion)
      }

      /**
       * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs
       * and between 50 and 30,000 milliseconds for HTTP APIs.
       * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
       */
      override fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty,
    ) : CdkObject(cdkObject), IntegrationOverridesProperty {
      /**
       * The description of the integration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Specifies the integration's HTTP method type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-integrationmethod)
       */
      override fun integrationMethod(): String? = unwrap(this).getIntegrationMethod()

      /**
       * Specifies the format of the payload sent to an integration.
       *
       * Required for HTTP APIs. For HTTP APIs, supported values for Lambda proxy integrations are
       * `1.0` and `2.0` . For all other integrations, `1.0` is the only supported value. To learn
       * more, see [Working with AWS Lambda proxy integrations for HTTP
       * APIs](https://docs.aws.amazon.com/apigateway/latest/developerguide/http-api-develop-integrations-lambda.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-payloadformatversion)
       */
      override fun payloadFormatVersion(): String? = unwrap(this).getPayloadFormatVersion()

      /**
       * Custom timeout between 50 and 29,000 milliseconds for WebSocket APIs and between 50 and
       * 30,000 milliseconds for HTTP APIs.
       *
       * The default timeout is 29 seconds for WebSocket APIs and 30 seconds for HTTP APIs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-integrationoverrides-timeoutinmillis)
       */
      override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty):
          IntegrationOverridesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IntegrationOverridesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationOverridesProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.IntegrationOverridesProperty
    }
  }

  /**
   * The `StageOverrides` property overrides the stage configuration for an API Gateway-managed
   * stage.
   *
   * If you remove this property, API Gateway restores the default values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * Object routeSettings;
   * Object stageVariables;
   * StageOverridesProperty stageOverridesProperty = StageOverridesProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html)
   */
  public interface StageOverridesProperty {
    /**
     * Settings for logging access in a stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-accesslogsettings)
     */
    public fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

    /**
     * Specifies whether updates to an API automatically trigger a new deployment.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-autodeploy)
     */
    public fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

    /**
     * The default route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-defaultroutesettings)
     */
    public fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

    /**
     * The description for the API stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * Route settings for the stage.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-routesettings)
     */
    public fun routeSettings(): Any? = unwrap(this).getRouteSettings()

    /**
     * A map that defines the stage variables for a `Stage` .
     *
     * Variable names can have alphanumeric and underscore characters, and the values must match
     * [A-Za-z0-9-._~:/?#&amp;=,]+.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-stagevariables)
     */
    public fun stageVariables(): Any? = unwrap(this).getStageVariables()

    /**
     * A builder for [StageOverridesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessLogSettings Settings for logging access in a stage.
       */
      public fun accessLogSettings(accessLogSettings: IResolvable)

      /**
       * @param accessLogSettings Settings for logging access in a stage.
       */
      public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty)

      /**
       * @param accessLogSettings Settings for logging access in a stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2231515a54b96e4144859c2f13013a00add666280ae0fca11ce1fb7b967d1b65")
      public fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit)

      /**
       * @param autoDeploy Specifies whether updates to an API automatically trigger a new
       * deployment.
       * The default value is `true` .
       */
      public fun autoDeploy(autoDeploy: Boolean)

      /**
       * @param autoDeploy Specifies whether updates to an API automatically trigger a new
       * deployment.
       * The default value is `true` .
       */
      public fun autoDeploy(autoDeploy: IResolvable)

      /**
       * @param defaultRouteSettings The default route settings for the stage.
       */
      public fun defaultRouteSettings(defaultRouteSettings: IResolvable)

      /**
       * @param defaultRouteSettings The default route settings for the stage.
       */
      public fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty)

      /**
       * @param defaultRouteSettings The default route settings for the stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("835f35219001fb090ef2ac51dcf9833a07dfdacfd1bec35109297159c68d986a")
      public
          fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit)

      /**
       * @param description The description for the API stage.
       */
      public fun description(description: String)

      /**
       * @param routeSettings Route settings for the stage.
       */
      public fun routeSettings(routeSettings: Any)

      /**
       * @param stageVariables A map that defines the stage variables for a `Stage` .
       * Variable names can have alphanumeric and underscore characters, and the values must match
       * [A-Za-z0-9-._~:/?#&amp;=,]+.
       */
      public fun stageVariables(stageVariables: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty.builder()

      /**
       * @param accessLogSettings Settings for logging access in a stage.
       */
      override fun accessLogSettings(accessLogSettings: IResolvable) {
        cdkBuilder.accessLogSettings(accessLogSettings.let(IResolvable::unwrap))
      }

      /**
       * @param accessLogSettings Settings for logging access in a stage.
       */
      override fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty) {
        cdkBuilder.accessLogSettings(accessLogSettings.let(AccessLogSettingsProperty::unwrap))
      }

      /**
       * @param accessLogSettings Settings for logging access in a stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2231515a54b96e4144859c2f13013a00add666280ae0fca11ce1fb7b967d1b65")
      override
          fun accessLogSettings(accessLogSettings: AccessLogSettingsProperty.Builder.() -> Unit):
          Unit = accessLogSettings(AccessLogSettingsProperty(accessLogSettings))

      /**
       * @param autoDeploy Specifies whether updates to an API automatically trigger a new
       * deployment.
       * The default value is `true` .
       */
      override fun autoDeploy(autoDeploy: Boolean) {
        cdkBuilder.autoDeploy(autoDeploy)
      }

      /**
       * @param autoDeploy Specifies whether updates to an API automatically trigger a new
       * deployment.
       * The default value is `true` .
       */
      override fun autoDeploy(autoDeploy: IResolvable) {
        cdkBuilder.autoDeploy(autoDeploy.let(IResolvable::unwrap))
      }

      /**
       * @param defaultRouteSettings The default route settings for the stage.
       */
      override fun defaultRouteSettings(defaultRouteSettings: IResolvable) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(IResolvable::unwrap))
      }

      /**
       * @param defaultRouteSettings The default route settings for the stage.
       */
      override fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty) {
        cdkBuilder.defaultRouteSettings(defaultRouteSettings.let(RouteSettingsProperty::unwrap))
      }

      /**
       * @param defaultRouteSettings The default route settings for the stage.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("835f35219001fb090ef2ac51dcf9833a07dfdacfd1bec35109297159c68d986a")
      override
          fun defaultRouteSettings(defaultRouteSettings: RouteSettingsProperty.Builder.() -> Unit):
          Unit = defaultRouteSettings(RouteSettingsProperty(defaultRouteSettings))

      /**
       * @param description The description for the API stage.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param routeSettings Route settings for the stage.
       */
      override fun routeSettings(routeSettings: Any) {
        cdkBuilder.routeSettings(routeSettings)
      }

      /**
       * @param stageVariables A map that defines the stage variables for a `Stage` .
       * Variable names can have alphanumeric and underscore characters, and the values must match
       * [A-Za-z0-9-._~:/?#&amp;=,]+.
       */
      override fun stageVariables(stageVariables: Any) {
        cdkBuilder.stageVariables(stageVariables)
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty,
    ) : CdkObject(cdkObject), StageOverridesProperty {
      /**
       * Settings for logging access in a stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-accesslogsettings)
       */
      override fun accessLogSettings(): Any? = unwrap(this).getAccessLogSettings()

      /**
       * Specifies whether updates to an API automatically trigger a new deployment.
       *
       * The default value is `true` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-autodeploy)
       */
      override fun autoDeploy(): Any? = unwrap(this).getAutoDeploy()

      /**
       * The default route settings for the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-defaultroutesettings)
       */
      override fun defaultRouteSettings(): Any? = unwrap(this).getDefaultRouteSettings()

      /**
       * The description for the API stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * Route settings for the stage.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-routesettings)
       */
      override fun routeSettings(): Any? = unwrap(this).getRouteSettings()

      /**
       * A map that defines the stage variables for a `Stage` .
       *
       * Variable names can have alphanumeric and underscore characters, and the values must match
       * [A-Za-z0-9-._~:/?#&amp;=,]+.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-apigatewaymanagedoverrides-stageoverrides.html#cfn-apigatewayv2-apigatewaymanagedoverrides-stageoverrides-stagevariables)
       */
      override fun stageVariables(): Any? = unwrap(this).getStageVariables()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageOverridesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty):
          StageOverridesProperty = CdkObjectWrappers.wrap(cdkObject) as? StageOverridesProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageOverridesProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnApiGatewayManagedOverrides.StageOverridesProperty
    }
  }
}
