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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGatewayV2::Route` resource creates a route for an API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
 * Object requestModels;
 * Object requestParameters;
 * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
 * .apiId("apiId")
 * .routeKey("routeKey")
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .modelSelectionExpression("modelSelectionExpression")
 * .operationName("operationName")
 * .requestModels(requestModels)
 * .requestParameters(requestParameters)
 * .routeResponseSelectionExpression("routeResponseSelectionExpression")
 * .target("target")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html)
 */
public open class CfnRoute(
  cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteProps,
  ) :
      this(software.amazon.awscdk.services.apigatewayv2.CfnRoute(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRouteProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRouteProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRouteProps(props)
  )

  /**
   * The API identifier.
   */
  public open fun apiId(): String = unwrap(this).getApiId()

  /**
   * The API identifier.
   */
  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  /**
   * Specifies whether an API key is required for the route.
   */
  public open fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  /**
   * Specifies whether an API key is required for the route.
   */
  public open fun apiKeyRequired(`value`: Boolean) {
    unwrap(this).setApiKeyRequired(`value`)
  }

  /**
   * Specifies whether an API key is required for the route.
   */
  public open fun apiKeyRequired(`value`: IResolvable) {
    unwrap(this).setApiKeyRequired(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The route ID.
   */
  public open fun attrRouteId(): String = unwrap(this).getAttrRouteId()

  /**
   * The authorization scopes supported by this route.
   */
  public open fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  /**
   * The authorization scopes supported by this route.
   */
  public open fun authorizationScopes(`value`: List<String>) {
    unwrap(this).setAuthorizationScopes(`value`)
  }

  /**
   * The authorization scopes supported by this route.
   */
  public open fun authorizationScopes(vararg `value`: String): Unit =
      authorizationScopes(`value`.toList())

  /**
   * The authorization type for the route.
   */
  public open fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  /**
   * The authorization type for the route.
   */
  public open fun authorizationType(`value`: String) {
    unwrap(this).setAuthorizationType(`value`)
  }

  /**
   * The identifier of the `Authorizer` resource to be associated with this route.
   */
  public open fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  /**
   * The identifier of the `Authorizer` resource to be associated with this route.
   */
  public open fun authorizerId(`value`: String) {
    unwrap(this).setAuthorizerId(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The model selection expression for the route.
   */
  public open fun modelSelectionExpression(): String? = unwrap(this).getModelSelectionExpression()

  /**
   * The model selection expression for the route.
   */
  public open fun modelSelectionExpression(`value`: String) {
    unwrap(this).setModelSelectionExpression(`value`)
  }

  /**
   * The operation name for the route.
   */
  public open fun operationName(): String? = unwrap(this).getOperationName()

  /**
   * The operation name for the route.
   */
  public open fun operationName(`value`: String) {
    unwrap(this).setOperationName(`value`)
  }

  /**
   * The request models for the route.
   */
  public open fun requestModels(): Any? = unwrap(this).getRequestModels()

  /**
   * The request models for the route.
   */
  public open fun requestModels(`value`: Any) {
    unwrap(this).setRequestModels(`value`)
  }

  /**
   * The request parameters for the route.
   */
  public open fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  /**
   * The request parameters for the route.
   */
  public open fun requestParameters(`value`: Any) {
    unwrap(this).setRequestParameters(`value`)
  }

  /**
   * The route key for the route.
   */
  public open fun routeKey(): String = unwrap(this).getRouteKey()

  /**
   * The route key for the route.
   */
  public open fun routeKey(`value`: String) {
    unwrap(this).setRouteKey(`value`)
  }

  /**
   * The route response selection expression for the route.
   */
  public open fun routeResponseSelectionExpression(): String? =
      unwrap(this).getRouteResponseSelectionExpression()

  /**
   * The route response selection expression for the route.
   */
  public open fun routeResponseSelectionExpression(`value`: String) {
    unwrap(this).setRouteResponseSelectionExpression(`value`)
  }

  /**
   * The target for the route.
   */
  public open fun target(): String? = unwrap(this).getTarget()

  /**
   * The target for the route.
   */
  public open fun target(`value`: String) {
    unwrap(this).setTarget(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigatewayv2.CfnRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid)
     * @param apiId The API identifier. 
     */
    public fun apiId(apiId: String)

    /**
     * Specifies whether an API key is required for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired)
     * @param apiKeyRequired Specifies whether an API key is required for the route. 
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    /**
     * Specifies whether an API key is required for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired)
     * @param apiKeyRequired Specifies whether an API key is required for the route. 
     */
    public fun apiKeyRequired(apiKeyRequired: IResolvable)

    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes)
     * @param authorizationScopes The authorization scopes supported by this route. 
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes)
     * @param authorizationScopes The authorization scopes supported by this route. 
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * The authorization type for the route.
     *
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM
     * permissions, and `CUSTOM` for using a Lambda authorizer. For HTTP APIs, valid values are `NONE`
     * for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and
     * `CUSTOM` for using a Lambda authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
     * @param authorizationType The authorization type for the route. 
     */
    public fun authorizationType(authorizationType: String)

    /**
     * The identifier of the `Authorizer` resource to be associated with this route.
     *
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid)
     * @param authorizerId The identifier of the `Authorizer` resource to be associated with this
     * route. 
     */
    public fun authorizerId(authorizerId: String)

    /**
     * The model selection expression for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression)
     * @param modelSelectionExpression The model selection expression for the route. 
     */
    public fun modelSelectionExpression(modelSelectionExpression: String)

    /**
     * The operation name for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname)
     * @param operationName The operation name for the route. 
     */
    public fun operationName(operationName: String)

    /**
     * The request models for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels)
     * @param requestModels The request models for the route. 
     */
    public fun requestModels(requestModels: Any)

    /**
     * The request parameters for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters)
     * @param requestParameters The request parameters for the route. 
     */
    public fun requestParameters(requestParameters: Any)

    /**
     * The route key for the route.
     *
     * For HTTP APIs, the route key can be either `$default` , or a combination of an HTTP method
     * and resource path, for example, `GET /pets` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey)
     * @param routeKey The route key for the route. 
     */
    public fun routeKey(routeKey: String)

    /**
     * The route response selection expression for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression)
     * @param routeResponseSelectionExpression The route response selection expression for the
     * route. 
     */
    public fun routeResponseSelectionExpression(routeResponseSelectionExpression: String)

    /**
     * The target for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target)
     * @param target The target for the route. 
     */
    public fun target(target: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.CfnRoute.Builder =
        software.amazon.awscdk.services.apigatewayv2.CfnRoute.Builder.create(scope, id)

    /**
     * The API identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apiid)
     * @param apiId The API identifier. 
     */
    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * Specifies whether an API key is required for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired)
     * @param apiKeyRequired Specifies whether an API key is required for the route. 
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * Specifies whether an API key is required for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-apikeyrequired)
     * @param apiKeyRequired Specifies whether an API key is required for the route. 
     */
    override fun apiKeyRequired(apiKeyRequired: IResolvable) {
      cdkBuilder.apiKeyRequired(apiKeyRequired.let(IResolvable.Companion::unwrap))
    }

    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes)
     * @param authorizationScopes The authorization scopes supported by this route. 
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * The authorization scopes supported by this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationscopes)
     * @param authorizationScopes The authorization scopes supported by this route. 
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * The authorization type for the route.
     *
     * For WebSocket APIs, valid values are `NONE` for open access, `AWS_IAM` for using AWS IAM
     * permissions, and `CUSTOM` for using a Lambda authorizer. For HTTP APIs, valid values are `NONE`
     * for open access, `JWT` for using JSON Web Tokens, `AWS_IAM` for using AWS IAM permissions, and
     * `CUSTOM` for using a Lambda authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizationtype)
     * @param authorizationType The authorization type for the route. 
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * The identifier of the `Authorizer` resource to be associated with this route.
     *
     * The authorizer identifier is generated by API Gateway when you created the authorizer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-authorizerid)
     * @param authorizerId The identifier of the `Authorizer` resource to be associated with this
     * route. 
     */
    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * The model selection expression for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-modelselectionexpression)
     * @param modelSelectionExpression The model selection expression for the route. 
     */
    override fun modelSelectionExpression(modelSelectionExpression: String) {
      cdkBuilder.modelSelectionExpression(modelSelectionExpression)
    }

    /**
     * The operation name for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-operationname)
     * @param operationName The operation name for the route. 
     */
    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    /**
     * The request models for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestmodels)
     * @param requestModels The request models for the route. 
     */
    override fun requestModels(requestModels: Any) {
      cdkBuilder.requestModels(requestModels)
    }

    /**
     * The request parameters for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-requestparameters)
     * @param requestParameters The request parameters for the route. 
     */
    override fun requestParameters(requestParameters: Any) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * The route key for the route.
     *
     * For HTTP APIs, the route key can be either `$default` , or a combination of an HTTP method
     * and resource path, for example, `GET /pets` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routekey)
     * @param routeKey The route key for the route. 
     */
    override fun routeKey(routeKey: String) {
      cdkBuilder.routeKey(routeKey)
    }

    /**
     * The route response selection expression for the route.
     *
     * Supported only for WebSocket APIs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-routeresponseselectionexpression)
     * @param routeResponseSelectionExpression The route response selection expression for the
     * route. 
     */
    override fun routeResponseSelectionExpression(routeResponseSelectionExpression: String) {
      cdkBuilder.routeResponseSelectionExpression(routeResponseSelectionExpression)
    }

    /**
     * The target for the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-route.html#cfn-apigatewayv2-route-target)
     * @param target The target for the route. 
     */
    override fun target(target: String) {
      cdkBuilder.target(target)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.CfnRoute = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigatewayv2.CfnRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute): CfnRoute =
        CfnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnRoute): software.amazon.awscdk.services.apigatewayv2.CfnRoute =
        wrapped.cdkObject as software.amazon.awscdk.services.apigatewayv2.CfnRoute
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigatewayv2.*;
   * ParameterConstraintsProperty parameterConstraintsProperty =
   * ParameterConstraintsProperty.builder()
   * .required(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-route-parameterconstraints.html)
   */
  public interface ParameterConstraintsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-route-parameterconstraints.html#cfn-apigatewayv2-route-parameterconstraints-required)
     */
    public fun required(): Any

    /**
     * A builder for [ParameterConstraintsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param required the value to be set. 
       */
      public fun required(required: Boolean)

      /**
       * @param required the value to be set. 
       */
      public fun required(required: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty.Builder
          =
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty.builder()

      /**
       * @param required the value to be set. 
       */
      override fun required(required: Boolean) {
        cdkBuilder.required(required)
      }

      /**
       * @param required the value to be set. 
       */
      override fun required(required: IResolvable) {
        cdkBuilder.required(required.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty,
    ) : CdkObject(cdkObject),
        ParameterConstraintsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-route-parameterconstraints.html#cfn-apigatewayv2-route-parameterconstraints-required)
       */
      override fun required(): Any = unwrap(this).getRequired()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ParameterConstraintsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty):
          ParameterConstraintsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ParameterConstraintsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ParameterConstraintsProperty):
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigatewayv2.CfnRoute.ParameterConstraintsProperty
    }
  }
}
