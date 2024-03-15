@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::Method` resource creates API Gateway methods that define the parameters and
 * body that clients must send in their requests.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnMethod cfnMethod = CfnMethod.Builder.create(this, "MyCfnMethod")
 * .httpMethod("httpMethod")
 * .resourceId("resourceId")
 * .restApiId("restApiId")
 * // the properties below are optional
 * .apiKeyRequired(false)
 * .authorizationScopes(List.of("authorizationScopes"))
 * .authorizationType("authorizationType")
 * .authorizerId("authorizerId")
 * .integration(IntegrationProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionId("connectionId")
 * .connectionType("connectionType")
 * .contentHandling("contentHandling")
 * .credentials("credentials")
 * .integrationHttpMethod("integrationHttpMethod")
 * .integrationResponses(List.of(IntegrationResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling("contentHandling")
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior("passthroughBehavior")
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeoutInMillis(123)
 * .uri("uri")
 * .build())
 * .methodResponses(List.of(MethodResponseProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .responseModels(Map.of(
 * "responseModelsKey", "responseModels"))
 * .responseParameters(Map.of(
 * "responseParametersKey", false))
 * .build()))
 * .operationName("operationName")
 * .requestModels(Map.of(
 * "requestModelsKey", "requestModels"))
 * .requestParameters(Map.of(
 * "requestParametersKey", false))
 * .requestValidatorId("requestValidatorId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
 */
public open class CfnMethod internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod,
) : CfnResource(cdkObject), IInspectable {
  /**
   * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
   */
  public open fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  /**
   * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
   */
  public open fun apiKeyRequired(`value`: Boolean) {
    unwrap(this).setApiKeyRequired(`value`)
  }

  /**
   * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
   */
  public open fun apiKeyRequired(`value`: IResolvable) {
    unwrap(this).setApiKeyRequired(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of authorization scopes configured on the method.
   */
  public open fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

  /**
   * A list of authorization scopes configured on the method.
   */
  public open fun authorizationScopes(`value`: List<String>) {
    unwrap(this).setAuthorizationScopes(`value`)
  }

  /**
   * A list of authorization scopes configured on the method.
   */
  public open fun authorizationScopes(vararg `value`: String): Unit =
      authorizationScopes(`value`.toList())

  /**
   * The method's authorization type.
   */
  public open fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  /**
   * The method's authorization type.
   */
  public open fun authorizationType(`value`: String) {
    unwrap(this).setAuthorizationType(`value`)
  }

  /**
   * The identifier of an authorizer to use on this method.
   */
  public open fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  /**
   * The identifier of an authorizer to use on this method.
   */
  public open fun authorizerId(`value`: String) {
    unwrap(this).setAuthorizerId(`value`)
  }

  /**
   * The method's HTTP verb.
   */
  public open fun httpMethod(): String = unwrap(this).getHttpMethod()

  /**
   * The method's HTTP verb.
   */
  public open fun httpMethod(`value`: String) {
    unwrap(this).setHttpMethod(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   */
  public open fun integration(): Any? = unwrap(this).getIntegration()

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   */
  public open fun integration(`value`: IResolvable) {
    unwrap(this).setIntegration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   */
  public open fun integration(`value`: IntegrationProperty) {
    unwrap(this).setIntegration(`value`.let(IntegrationProperty::unwrap))
  }

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("93caab136aa7119afd0bda486850265386e56e299dd24fb2bc2bff74bbffbd08")
  public open fun integration(`value`: IntegrationProperty.Builder.() -> Unit): Unit =
      integration(IntegrationProperty(`value`))

  /**
   * Gets a method response associated with a given HTTP status code.
   */
  public open fun methodResponses(): Any? = unwrap(this).getMethodResponses()

  /**
   * Gets a method response associated with a given HTTP status code.
   */
  public open fun methodResponses(`value`: IResolvable) {
    unwrap(this).setMethodResponses(`value`.let(IResolvable::unwrap))
  }

  /**
   * Gets a method response associated with a given HTTP status code.
   */
  public open fun methodResponses(__idx_ac66f0: List<Any>) {
    unwrap(this).setMethodResponses(__idx_ac66f0)
  }

  /**
   * Gets a method response associated with a given HTTP status code.
   */
  public open fun methodResponses(vararg __idx_ac66f0: Any): Unit =
      methodResponses(__idx_ac66f0.toList())

  /**
   * A human-friendly operation identifier for the method.
   */
  public open fun operationName(): String? = unwrap(this).getOperationName()

  /**
   * A human-friendly operation identifier for the method.
   */
  public open fun operationName(`value`: String) {
    unwrap(this).setOperationName(`value`)
  }

  /**
   * A key-value map specifying data schemas, represented by Model resources, (as the mapped value)
   * of the request payloads of given content types (as the mapping key).
   */
  public open fun requestModels(): Any? = unwrap(this).getRequestModels()

  /**
   * A key-value map specifying data schemas, represented by Model resources, (as the mapped value)
   * of the request payloads of given content types (as the mapping key).
   */
  public open fun requestModels(`value`: IResolvable) {
    unwrap(this).setRequestModels(`value`.let(IResolvable::unwrap))
  }

  /**
   * A key-value map specifying data schemas, represented by Model resources, (as the mapped value)
   * of the request payloads of given content types (as the mapping key).
   */
  public open fun requestModels(`value`: Map<String, String>) {
    unwrap(this).setRequestModels(`value`)
  }

  /**
   * A key-value map defining required or optional method request parameters that can be accepted by
   * API Gateway.
   */
  public open fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  /**
   * A key-value map defining required or optional method request parameters that can be accepted by
   * API Gateway.
   */
  public open fun requestParameters(`value`: IResolvable) {
    unwrap(this).setRequestParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * A key-value map defining required or optional method request parameters that can be accepted by
   * API Gateway.
   */
  public open fun requestParameters(__item_ac66f0: Map<String, Any>) {
    unwrap(this).setRequestParameters(__item_ac66f0)
  }

  /**
   * The identifier of a RequestValidator for request validation.
   */
  public open fun requestValidatorId(): String? = unwrap(this).getRequestValidatorId()

  /**
   * The identifier of a RequestValidator for request validation.
   */
  public open fun requestValidatorId(`value`: String) {
    unwrap(this).setRequestValidatorId(`value`)
  }

  /**
   * The Resource identifier for the MethodResponse resource.
   */
  public open fun resourceId(): String = unwrap(this).getResourceId()

  /**
   * The Resource identifier for the MethodResponse resource.
   */
  public open fun resourceId(`value`: String) {
    unwrap(this).setResourceId(`value`)
  }

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(): String = unwrap(this).getRestApiId()

  /**
   * The string identifier of the associated RestApi.
   */
  public open fun restApiId(`value`: String) {
    unwrap(this).setRestApiId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnMethod].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method. 
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    /**
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method. 
     */
    public fun apiKeyRequired(apiKeyRequired: IResolvable)

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * The method's authorization type.
     *
     *  For valid values, see
     * [Method](https://docs.aws.amazon.com/apigateway/latest/api/API_Method.html) in the *API Gateway
     * API Reference* .
     *
     *
     * If you specify the `AuthorizerId` property, specify `CUSTOM` or `COGNITO_USER_POOLS` for this
     * property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype)
     * @param authorizationType The method's authorization type. 
     */
    public fun authorizationType(authorizationType: String)

    /**
     * The identifier of an authorizer to use on this method.
     *
     * The method's authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
     * @param authorizerId The identifier of an authorizer to use on this method. 
     */
    public fun authorizerId(authorizerId: String)

    /**
     * The method's HTTP verb.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
     * @param httpMethod The method's HTTP verb. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration. 
     */
    public fun integration(integration: IResolvable)

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration. 
     */
    public fun integration(integration: IntegrationProperty)

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f56da9b626b21a48f48534fdb62818e4eb7da26a97678b9a9f5446258bd8e74c")
    public fun integration(integration: IntegrationProperty.Builder.() -> Unit)

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     * @param methodResponses Gets a method response associated with a given HTTP status code. 
     */
    public fun methodResponses(methodResponses: IResolvable)

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     * @param methodResponses Gets a method response associated with a given HTTP status code. 
     */
    public fun methodResponses(methodResponses: List<Any>)

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     * @param methodResponses Gets a method response associated with a given HTTP status code. 
     */
    public fun methodResponses(vararg methodResponses: Any)

    /**
     * A human-friendly operation identifier for the method.
     *
     * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in
     * the `PetStore` example.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
     * @param operationName A human-friendly operation identifier for the method. 
     */
    public fun operationName(operationName: String)

    /**
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped
     * value) of the request payloads of given content types (as the mapping key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key). 
     */
    public fun requestModels(requestModels: IResolvable)

    /**
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped
     * value) of the request payloads of given content types (as the mapping key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key). 
     */
    public fun requestModels(requestModels: Map<String, String>)

    /**
     * A key-value map defining required or optional method request parameters that can be accepted
     * by API Gateway.
     *
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway. 
     */
    public fun requestParameters(requestParameters: IResolvable)

    /**
     * A key-value map defining required or optional method request parameters that can be accepted
     * by API Gateway.
     *
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway. 
     */
    public fun requestParameters(requestParameters: Map<String, Any>)

    /**
     * The identifier of a RequestValidator for request validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
     * @param requestValidatorId The identifier of a RequestValidator for request validation. 
     */
    public fun requestValidatorId(requestValidatorId: String)

    /**
     * The Resource identifier for the MethodResponse resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
     * @param resourceId The Resource identifier for the MethodResponse resource. 
     */
    public fun resourceId(resourceId: String)

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnMethod.Builder =
        software.amazon.awscdk.services.apigateway.CfnMethod.Builder.create(scope, id)

    /**
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method. 
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method. 
     */
    override fun apiKeyRequired(apiKeyRequired: IResolvable) {
      cdkBuilder.apiKeyRequired(apiKeyRequired.let(IResolvable::unwrap))
    }

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * A list of authorization scopes configured on the method.
     *
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
     * @param authorizationScopes A list of authorization scopes configured on the method. 
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * The method's authorization type.
     *
     *  For valid values, see
     * [Method](https://docs.aws.amazon.com/apigateway/latest/api/API_Method.html) in the *API Gateway
     * API Reference* .
     *
     *
     * If you specify the `AuthorizerId` property, specify `CUSTOM` or `COGNITO_USER_POOLS` for this
     * property.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationtype)
     * @param authorizationType The method's authorization type. 
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * The identifier of an authorizer to use on this method.
     *
     * The method's authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
     * @param authorizerId The identifier of an authorizer to use on this method. 
     */
    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * The method's HTTP verb.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
     * @param httpMethod The method's HTTP verb. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration. 
     */
    override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration. 
     */
    override fun integration(integration: IntegrationProperty) {
      cdkBuilder.integration(integration.let(IntegrationProperty::unwrap))
    }

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f56da9b626b21a48f48534fdb62818e4eb7da26a97678b9a9f5446258bd8e74c")
    override fun integration(integration: IntegrationProperty.Builder.() -> Unit): Unit =
        integration(IntegrationProperty(integration))

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     * @param methodResponses Gets a method response associated with a given HTTP status code. 
     */
    override fun methodResponses(methodResponses: IResolvable) {
      cdkBuilder.methodResponses(methodResponses.let(IResolvable::unwrap))
    }

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     * @param methodResponses Gets a method response associated with a given HTTP status code. 
     */
    override fun methodResponses(methodResponses: List<Any>) {
      cdkBuilder.methodResponses(methodResponses)
    }

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     * @param methodResponses Gets a method response associated with a given HTTP status code. 
     */
    override fun methodResponses(vararg methodResponses: Any): Unit =
        methodResponses(methodResponses.toList())

    /**
     * A human-friendly operation identifier for the method.
     *
     * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in
     * the `PetStore` example.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
     * @param operationName A human-friendly operation identifier for the method. 
     */
    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    /**
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped
     * value) of the request payloads of given content types (as the mapping key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key). 
     */
    override fun requestModels(requestModels: IResolvable) {
      cdkBuilder.requestModels(requestModels.let(IResolvable::unwrap))
    }

    /**
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped
     * value) of the request payloads of given content types (as the mapping key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key). 
     */
    override fun requestModels(requestModels: Map<String, String>) {
      cdkBuilder.requestModels(requestModels)
    }

    /**
     * A key-value map defining required or optional method request parameters that can be accepted
     * by API Gateway.
     *
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway. 
     */
    override fun requestParameters(requestParameters: IResolvable) {
      cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
    }

    /**
     * A key-value map defining required or optional method request parameters that can be accepted
     * by API Gateway.
     *
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway. 
     */
    override fun requestParameters(requestParameters: Map<String, Any>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * The identifier of a RequestValidator for request validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
     * @param requestValidatorId The identifier of a RequestValidator for request validation. 
     */
    override fun requestValidatorId(requestValidatorId: String) {
      cdkBuilder.requestValidatorId(requestValidatorId)
    }

    /**
     * The Resource identifier for the MethodResponse resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
     * @param resourceId The Resource identifier for the MethodResponse resource. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnMethod = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnMethod.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMethod {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMethod(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod): CfnMethod =
        CfnMethod(cdkObject)

    internal fun unwrap(wrapped: CfnMethod): software.amazon.awscdk.services.apigateway.CfnMethod =
        wrapped.cdkObject
  }

  /**
   * Represents a method response of a given HTTP status code returned to the client.
   *
   * The method response is passed from the back end through the associated integration response
   * that can be transformed using a mapping template.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * MethodResponseProperty methodResponseProperty = MethodResponseProperty.builder()
   * .statusCode("statusCode")
   * // the properties below are optional
   * .responseModels(Map.of(
   * "responseModelsKey", "responseModels"))
   * .responseParameters(Map.of(
   * "responseParametersKey", false))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html)
   */
  public interface MethodResponseProperty {
    /**
     * Specifies the Model resources used for the response's content-type.
     *
     * Response models are represented as a key/value map, with a content-type as the key and a
     * Model name as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels)
     */
    public fun responseModels(): Any? = unwrap(this).getResponseModels()

    /**
     * A key-value map specifying required or optional response parameters that API Gateway can send
     * back to the caller.
     *
     * A key defines a method response header and the value specifies whether the associated method
     * response header is required or not. The expression of the key must match the pattern
     * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
     * passes certain integration response data to the method response headers specified here according
     * to the mapping you prescribe in the API's IntegrationResponse. The integration response data
     * that can be mapped include an integration response header expressed in
     * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
     * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the
     * form of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid JSON
     * expression without the `$` prefix.)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters)
     */
    public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * The method response's status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode)
     */
    public fun statusCode(): String

    /**
     * A builder for [MethodResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param responseModels Specifies the Model resources used for the response's content-type.
       * Response models are represented as a key/value map, with a content-type as the key and a
       * Model name as the value.
       */
      public fun responseModels(responseModels: IResolvable)

      /**
       * @param responseModels Specifies the Model resources used for the response's content-type.
       * Response models are represented as a key/value map, with a content-type as the key and a
       * Model name as the value.
       */
      public fun responseModels(responseModels: Map<String, String>)

      /**
       * @param responseParameters A key-value map specifying required or optional response
       * parameters that API Gateway can send back to the caller.
       * A key defines a method response header and the value specifies whether the associated
       * method response header is required or not. The expression of the key must match the pattern
       * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
       * passes certain integration response data to the method response headers specified here
       * according to the mapping you prescribe in the API's IntegrationResponse. The integration
       * response data that can be mapped include an integration response header expressed in
       * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
       * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the
       * form of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid
       * JSON expression without the `$` prefix.)
       */
      public fun responseParameters(responseParameters: IResolvable)

      /**
       * @param responseParameters A key-value map specifying required or optional response
       * parameters that API Gateway can send back to the caller.
       * A key defines a method response header and the value specifies whether the associated
       * method response header is required or not. The expression of the key must match the pattern
       * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
       * passes certain integration response data to the method response headers specified here
       * according to the mapping you prescribe in the API's IntegrationResponse. The integration
       * response data that can be mapped include an integration response header expressed in
       * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
       * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the
       * form of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid
       * JSON expression without the `$` prefix.)
       */
      public fun responseParameters(responseParameters: Map<String, Any>)

      /**
       * @param statusCode The method response's status code. 
       */
      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty.builder()

      /**
       * @param responseModels Specifies the Model resources used for the response's content-type.
       * Response models are represented as a key/value map, with a content-type as the key and a
       * Model name as the value.
       */
      override fun responseModels(responseModels: IResolvable) {
        cdkBuilder.responseModels(responseModels.let(IResolvable::unwrap))
      }

      /**
       * @param responseModels Specifies the Model resources used for the response's content-type.
       * Response models are represented as a key/value map, with a content-type as the key and a
       * Model name as the value.
       */
      override fun responseModels(responseModels: Map<String, String>) {
        cdkBuilder.responseModels(responseModels)
      }

      /**
       * @param responseParameters A key-value map specifying required or optional response
       * parameters that API Gateway can send back to the caller.
       * A key defines a method response header and the value specifies whether the associated
       * method response header is required or not. The expression of the key must match the pattern
       * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
       * passes certain integration response data to the method response headers specified here
       * according to the mapping you prescribe in the API's IntegrationResponse. The integration
       * response data that can be mapped include an integration response header expressed in
       * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
       * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the
       * form of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid
       * JSON expression without the `$` prefix.)
       */
      override fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
      }

      /**
       * @param responseParameters A key-value map specifying required or optional response
       * parameters that API Gateway can send back to the caller.
       * A key defines a method response header and the value specifies whether the associated
       * method response header is required or not. The expression of the key must match the pattern
       * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
       * passes certain integration response data to the method response headers specified here
       * according to the mapping you prescribe in the API's IntegrationResponse. The integration
       * response data that can be mapped include an integration response header expressed in
       * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
       * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the
       * form of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid
       * JSON expression without the `$` prefix.)
       */
      override fun responseParameters(responseParameters: Map<String, Any>) {
        cdkBuilder.responseParameters(responseParameters)
      }

      /**
       * @param statusCode The method response's status code. 
       */
      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty,
    ) : CdkObject(cdkObject), MethodResponseProperty {
      /**
       * Specifies the Model resources used for the response's content-type.
       *
       * Response models are represented as a key/value map, with a content-type as the key and a
       * Model name as the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responsemodels)
       */
      override fun responseModels(): Any? = unwrap(this).getResponseModels()

      /**
       * A key-value map specifying required or optional response parameters that API Gateway can
       * send back to the caller.
       *
       * A key defines a method response header and the value specifies whether the associated
       * method response header is required or not. The expression of the key must match the pattern
       * `method.response.header.{name}` , where `name` is a valid and unique header name. API Gateway
       * passes certain integration response data to the method response headers specified here
       * according to the mapping you prescribe in the API's IntegrationResponse. The integration
       * response data that can be mapped include an integration response header expressed in
       * `integration.response.header.{name}` , a static value enclosed within a pair of single quotes
       * (e.g., `'application/json'` ), or a JSON expression from the back-end response payload in the
       * form of `integration.response.body.{JSON-expression}` , where `JSON-expression` is a valid
       * JSON expression without the `$` prefix.)
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-responseparameters)
       */
      override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

      /**
       * The method response's status code.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-methodresponse.html#cfn-apigateway-method-methodresponse-statuscode)
       */
      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MethodResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty):
          MethodResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MethodResponseProperty):
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnMethod.MethodResponseProperty
    }
  }

  /**
   * `Integration` is a property of the
   * [AWS::ApiGateway::Method](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html)
   * resource that specifies information about the target backend that a method calls.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * IntegrationProperty integrationProperty = IntegrationProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .cacheKeyParameters(List.of("cacheKeyParameters"))
   * .cacheNamespace("cacheNamespace")
   * .connectionId("connectionId")
   * .connectionType("connectionType")
   * .contentHandling("contentHandling")
   * .credentials("credentials")
   * .integrationHttpMethod("integrationHttpMethod")
   * .integrationResponses(List.of(IntegrationResponseProperty.builder()
   * .statusCode("statusCode")
   * // the properties below are optional
   * .contentHandling("contentHandling")
   * .responseParameters(Map.of(
   * "responseParametersKey", "responseParameters"))
   * .responseTemplates(Map.of(
   * "responseTemplatesKey", "responseTemplates"))
   * .selectionPattern("selectionPattern")
   * .build()))
   * .passthroughBehavior("passthroughBehavior")
   * .requestParameters(Map.of(
   * "requestParametersKey", "requestParameters"))
   * .requestTemplates(Map.of(
   * "requestTemplatesKey", "requestTemplates"))
   * .timeoutInMillis(123)
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html)
   */
  public interface IntegrationProperty {
    /**
     * A list of request parameters whose values API Gateway caches.
     *
     * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
     * Method `requestParameters` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters)
     */
    public fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
        emptyList()

    /**
     * Specifies a group of related cached parameters.
     *
     * By default, API Gateway uses the resource ID as the `cacheNamespace` . You can specify the
     * same `cacheNamespace` across resources to return the same cached data for requests to different
     * resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace)
     */
    public fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

    /**
     * The ID of the VpcLink used for the integration when `connectionType=VPC_LINK` and undefined,
     * otherwise.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-connectionid)
     */
    public fun connectionId(): String? = unwrap(this).getConnectionId()

    /**
     * The type of the network connection to the integration endpoint.
     *
     * The valid value is `INTERNET` for connections through the public routable internet or
     * `VPC_LINK` for private connections between API Gateway and a network load balancer in a VPC. The
     * default value is `INTERNET` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-connectiontype)
     */
    public fun connectionType(): String? = unwrap(this).getConnectionType()

    /**
     * Specifies how to handle request payload content type conversions.
     *
     * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
     * behaviors:
     *
     * If this property is not defined, the request payload will be passed through from the method
     * request to integration request without modification, provided that the `passthroughBehavior` is
     * configured to support payload pass-through.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-contenthandling)
     */
    public fun contentHandling(): String? = unwrap(this).getContentHandling()

    /**
     * Specifies the credentials required for the integration, if any.
     *
     * For AWS integrations, three options are available. To specify an IAM Role for API Gateway to
     * assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
     * passed through from the request, specify the string `arn:aws:iam::\*:user/\*` . To use
     * resource-based permissions on supported AWS services, specify null.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-credentials)
     */
    public fun credentials(): String? = unwrap(this).getCredentials()

    /**
     * Specifies the integration's HTTP method type.
     *
     * For the Type property, if you specify `MOCK` , this property is optional. For Lambda
     * integrations, you must set the integration method to `POST` . For all other types, you must
     * specify this property.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod)
     */
    public fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

    /**
     * Specifies the integration's responses.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses)
     */
    public fun integrationResponses(): Any? = unwrap(this).getIntegrationResponses()

    /**
     * Specifies how the method request body of an unmapped content type will be passed through the
     * integration request to the back end without transformation.
     *
     * A content type is unmapped if no mapping template is defined in the integration or the
     * content type does not match any of the mapped content types, as specified in `requestTemplates`
     * . The valid value is one of the following: `WHEN_NO_MATCH` : passes the method request body
     * through the integration request to the back end without transformation when the method request
     * content type does not match any content type associated with the mapping templates defined in
     * the integration request. `WHEN_NO_TEMPLATES` : passes the method request body through the
     * integration request to the back end without transformation when no mapping template is defined
     * in the integration request. If a template is defined when this option is selected, the method
     * request of an unmapped content-type will be rejected with an HTTP 415 Unsupported Media Type
     * response. `NEVER` : rejects the method request with an HTTP 415 Unsupported Media Type response
     * when either the method request content type does not match any content type associated with the
     * mapping templates defined in the integration request or no mapping template is defined in the
     * integration request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior)
     */
    public fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

    /**
     * A key-value map specifying request parameters that are passed from the method request to the
     * back end.
     *
     * The key is an integration request parameter name and the associated value is a method request
     * parameter value or static value that must be enclosed within single quotes and pre-encoded as
     * required by the back end. The method request parameter value must match the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` must be a valid and unique method request parameter name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-requestparameters)
     */
    public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    /**
     * Represents a map of Velocity templates that are applied on the request payload based on the
     * value of the Content-Type header sent by the client.
     *
     * The content type value is the key in this map, and the template (as a String) is the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates)
     */
    public fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

    /**
     * Custom timeout between 50 and 29,000 milliseconds.
     *
     * The default value is 29,000 milliseconds or 29 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis)
     */
    public fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

    /**
     * Specifies an API method integration type. The valid value is one of the following:.
     *
     * For the HTTP and HTTP proxy integrations, each integration can specify a protocol (
     * `http/https` ), port and path. Standard 80 and 443 ports are supported as well as custom ports
     * above 1024. An HTTP or HTTP proxy integration with a `connectionType` of `VPC_LINK` is referred
     * to as a private integration and uses a VpcLink to connect API Gateway to a network load balancer
     * of a VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-type)
     */
    public fun type(): String

    /**
     * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
     *
     * For `HTTP` or `HTTP_PROXY` integrations, the URI must be a fully formed, encoded HTTP(S) URL
     * according to the RFC-3986 specification for standard integrations. If `connectionType` is
     * `VPC_LINK` specify the Network Load Balancer DNS name. For `AWS` or `AWS_PROXY` integrations,
     * the URI is of the form
     * `arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}` . Here,
     * {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated
     * AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS
     * service for fast host-name lookup. action can be used for an AWS service action-based API, using
     * an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api} refers to
     * a supported action {name} plus any required input parameters. Alternatively, path can be used
     * for an AWS service path-based API. The ensuing service_api refers to the path to an AWS service
     * resource, including the region of the integrated AWS service, if applicable. For example, for
     * integration with the S3 API of GetObject, the uri can be either
     * `arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}` or
     * `arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-uri)
     */
    public fun uri(): String? = unwrap(this).getUri()

    /**
     * A builder for [IntegrationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cacheKeyParameters A list of request parameters whose values API Gateway caches.
       * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
       * Method `requestParameters` .
       */
      public fun cacheKeyParameters(cacheKeyParameters: List<String>)

      /**
       * @param cacheKeyParameters A list of request parameters whose values API Gateway caches.
       * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
       * Method `requestParameters` .
       */
      public fun cacheKeyParameters(vararg cacheKeyParameters: String)

      /**
       * @param cacheNamespace Specifies a group of related cached parameters.
       * By default, API Gateway uses the resource ID as the `cacheNamespace` . You can specify the
       * same `cacheNamespace` across resources to return the same cached data for requests to
       * different resources.
       */
      public fun cacheNamespace(cacheNamespace: String)

      /**
       * @param connectionId The ID of the VpcLink used for the integration when
       * `connectionType=VPC_LINK` and undefined, otherwise.
       */
      public fun connectionId(connectionId: String)

      /**
       * @param connectionType The type of the network connection to the integration endpoint.
       * The valid value is `INTERNET` for connections through the public routable internet or
       * `VPC_LINK` for private connections between API Gateway and a network load balancer in a VPC.
       * The default value is `INTERNET` .
       */
      public fun connectionType(connectionType: String)

      /**
       * @param contentHandling Specifies how to handle request payload content type conversions.
       * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
       * behaviors:
       *
       * If this property is not defined, the request payload will be passed through from the method
       * request to integration request without modification, provided that the `passthroughBehavior`
       * is configured to support payload pass-through.
       */
      public fun contentHandling(contentHandling: String)

      /**
       * @param credentials Specifies the credentials required for the integration, if any.
       * For AWS integrations, three options are available. To specify an IAM Role for API Gateway
       * to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
       * passed through from the request, specify the string `arn:aws:iam::\*:user/\*` . To use
       * resource-based permissions on supported AWS services, specify null.
       */
      public fun credentials(credentials: String)

      /**
       * @param integrationHttpMethod Specifies the integration's HTTP method type.
       * For the Type property, if you specify `MOCK` , this property is optional. For Lambda
       * integrations, you must set the integration method to `POST` . For all other types, you must
       * specify this property.
       */
      public fun integrationHttpMethod(integrationHttpMethod: String)

      /**
       * @param integrationResponses Specifies the integration's responses.
       */
      public fun integrationResponses(integrationResponses: IResolvable)

      /**
       * @param integrationResponses Specifies the integration's responses.
       */
      public fun integrationResponses(integrationResponses: List<Any>)

      /**
       * @param integrationResponses Specifies the integration's responses.
       */
      public fun integrationResponses(vararg integrationResponses: Any)

      /**
       * @param passthroughBehavior Specifies how the method request body of an unmapped content
       * type will be passed through the integration request to the back end without transformation.
       * A content type is unmapped if no mapping template is defined in the integration or the
       * content type does not match any of the mapped content types, as specified in
       * `requestTemplates` . The valid value is one of the following: `WHEN_NO_MATCH` : passes the
       * method request body through the integration request to the back end without transformation
       * when the method request content type does not match any content type associated with the
       * mapping templates defined in the integration request. `WHEN_NO_TEMPLATES` : passes the method
       * request body through the integration request to the back end without transformation when no
       * mapping template is defined in the integration request. If a template is defined when this
       * option is selected, the method request of an unmapped content-type will be rejected with an
       * HTTP 415 Unsupported Media Type response. `NEVER` : rejects the method request with an HTTP
       * 415 Unsupported Media Type response when either the method request content type does not match
       * any content type associated with the mapping templates defined in the integration request or
       * no mapping template is defined in the integration request.
       */
      public fun passthroughBehavior(passthroughBehavior: String)

      /**
       * @param requestParameters A key-value map specifying request parameters that are passed from
       * the method request to the back end.
       * The key is an integration request parameter name and the associated value is a method
       * request parameter value or static value that must be enclosed within single quotes and
       * pre-encoded as required by the back end. The method request parameter value must match the
       * pattern of `method.request.{location}.{name}` , where `location` is `querystring` , `path` ,
       * or `header` and `name` must be a valid and unique method request parameter name.
       */
      public fun requestParameters(requestParameters: IResolvable)

      /**
       * @param requestParameters A key-value map specifying request parameters that are passed from
       * the method request to the back end.
       * The key is an integration request parameter name and the associated value is a method
       * request parameter value or static value that must be enclosed within single quotes and
       * pre-encoded as required by the back end. The method request parameter value must match the
       * pattern of `method.request.{location}.{name}` , where `location` is `querystring` , `path` ,
       * or `header` and `name` must be a valid and unique method request parameter name.
       */
      public fun requestParameters(requestParameters: Map<String, String>)

      /**
       * @param requestTemplates Represents a map of Velocity templates that are applied on the
       * request payload based on the value of the Content-Type header sent by the client.
       * The content type value is the key in this map, and the template (as a String) is the value.
       */
      public fun requestTemplates(requestTemplates: IResolvable)

      /**
       * @param requestTemplates Represents a map of Velocity templates that are applied on the
       * request payload based on the value of the Content-Type header sent by the client.
       * The content type value is the key in this map, and the template (as a String) is the value.
       */
      public fun requestTemplates(requestTemplates: Map<String, String>)

      /**
       * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds.
       * The default value is 29,000 milliseconds or 29 seconds.
       */
      public fun timeoutInMillis(timeoutInMillis: Number)

      /**
       * @param type Specifies an API method integration type. The valid value is one of the
       * following:. 
       * For the HTTP and HTTP proxy integrations, each integration can specify a protocol (
       * `http/https` ), port and path. Standard 80 and 443 ports are supported as well as custom ports
       * above 1024. An HTTP or HTTP proxy integration with a `connectionType` of `VPC_LINK` is
       * referred to as a private integration and uses a VpcLink to connect API Gateway to a network
       * load balancer of a VPC.
       */
      public fun type(type: String)

      /**
       * @param uri Specifies Uniform Resource Identifier (URI) of the integration endpoint.
       * For `HTTP` or `HTTP_PROXY` integrations, the URI must be a fully formed, encoded HTTP(S)
       * URL according to the RFC-3986 specification for standard integrations. If `connectionType` is
       * `VPC_LINK` specify the Network Load Balancer DNS name. For `AWS` or `AWS_PROXY` integrations,
       * the URI is of the form
       * `arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}` . Here,
       * {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated
       * AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS
       * service for fast host-name lookup. action can be used for an AWS service action-based API,
       * using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api}
       * refers to a supported action {name} plus any required input parameters. Alternatively, path
       * can be used for an AWS service path-based API. The ensuing service_api refers to the path to
       * an AWS service resource, including the region of the integrated AWS service, if applicable.
       * For example, for integration with the S3 API of GetObject, the uri can be either
       * `arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}` or
       * `arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}`
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty.builder()

      /**
       * @param cacheKeyParameters A list of request parameters whose values API Gateway caches.
       * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
       * Method `requestParameters` .
       */
      override fun cacheKeyParameters(cacheKeyParameters: List<String>) {
        cdkBuilder.cacheKeyParameters(cacheKeyParameters)
      }

      /**
       * @param cacheKeyParameters A list of request parameters whose values API Gateway caches.
       * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
       * Method `requestParameters` .
       */
      override fun cacheKeyParameters(vararg cacheKeyParameters: String): Unit =
          cacheKeyParameters(cacheKeyParameters.toList())

      /**
       * @param cacheNamespace Specifies a group of related cached parameters.
       * By default, API Gateway uses the resource ID as the `cacheNamespace` . You can specify the
       * same `cacheNamespace` across resources to return the same cached data for requests to
       * different resources.
       */
      override fun cacheNamespace(cacheNamespace: String) {
        cdkBuilder.cacheNamespace(cacheNamespace)
      }

      /**
       * @param connectionId The ID of the VpcLink used for the integration when
       * `connectionType=VPC_LINK` and undefined, otherwise.
       */
      override fun connectionId(connectionId: String) {
        cdkBuilder.connectionId(connectionId)
      }

      /**
       * @param connectionType The type of the network connection to the integration endpoint.
       * The valid value is `INTERNET` for connections through the public routable internet or
       * `VPC_LINK` for private connections between API Gateway and a network load balancer in a VPC.
       * The default value is `INTERNET` .
       */
      override fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
      }

      /**
       * @param contentHandling Specifies how to handle request payload content type conversions.
       * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
       * behaviors:
       *
       * If this property is not defined, the request payload will be passed through from the method
       * request to integration request without modification, provided that the `passthroughBehavior`
       * is configured to support payload pass-through.
       */
      override fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
      }

      /**
       * @param credentials Specifies the credentials required for the integration, if any.
       * For AWS integrations, three options are available. To specify an IAM Role for API Gateway
       * to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
       * passed through from the request, specify the string `arn:aws:iam::\*:user/\*` . To use
       * resource-based permissions on supported AWS services, specify null.
       */
      override fun credentials(credentials: String) {
        cdkBuilder.credentials(credentials)
      }

      /**
       * @param integrationHttpMethod Specifies the integration's HTTP method type.
       * For the Type property, if you specify `MOCK` , this property is optional. For Lambda
       * integrations, you must set the integration method to `POST` . For all other types, you must
       * specify this property.
       */
      override fun integrationHttpMethod(integrationHttpMethod: String) {
        cdkBuilder.integrationHttpMethod(integrationHttpMethod)
      }

      /**
       * @param integrationResponses Specifies the integration's responses.
       */
      override fun integrationResponses(integrationResponses: IResolvable) {
        cdkBuilder.integrationResponses(integrationResponses.let(IResolvable::unwrap))
      }

      /**
       * @param integrationResponses Specifies the integration's responses.
       */
      override fun integrationResponses(integrationResponses: List<Any>) {
        cdkBuilder.integrationResponses(integrationResponses)
      }

      /**
       * @param integrationResponses Specifies the integration's responses.
       */
      override fun integrationResponses(vararg integrationResponses: Any): Unit =
          integrationResponses(integrationResponses.toList())

      /**
       * @param passthroughBehavior Specifies how the method request body of an unmapped content
       * type will be passed through the integration request to the back end without transformation.
       * A content type is unmapped if no mapping template is defined in the integration or the
       * content type does not match any of the mapped content types, as specified in
       * `requestTemplates` . The valid value is one of the following: `WHEN_NO_MATCH` : passes the
       * method request body through the integration request to the back end without transformation
       * when the method request content type does not match any content type associated with the
       * mapping templates defined in the integration request. `WHEN_NO_TEMPLATES` : passes the method
       * request body through the integration request to the back end without transformation when no
       * mapping template is defined in the integration request. If a template is defined when this
       * option is selected, the method request of an unmapped content-type will be rejected with an
       * HTTP 415 Unsupported Media Type response. `NEVER` : rejects the method request with an HTTP
       * 415 Unsupported Media Type response when either the method request content type does not match
       * any content type associated with the mapping templates defined in the integration request or
       * no mapping template is defined in the integration request.
       */
      override fun passthroughBehavior(passthroughBehavior: String) {
        cdkBuilder.passthroughBehavior(passthroughBehavior)
      }

      /**
       * @param requestParameters A key-value map specifying request parameters that are passed from
       * the method request to the back end.
       * The key is an integration request parameter name and the associated value is a method
       * request parameter value or static value that must be enclosed within single quotes and
       * pre-encoded as required by the back end. The method request parameter value must match the
       * pattern of `method.request.{location}.{name}` , where `location` is `querystring` , `path` ,
       * or `header` and `name` must be a valid and unique method request parameter name.
       */
      override fun requestParameters(requestParameters: IResolvable) {
        cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
      }

      /**
       * @param requestParameters A key-value map specifying request parameters that are passed from
       * the method request to the back end.
       * The key is an integration request parameter name and the associated value is a method
       * request parameter value or static value that must be enclosed within single quotes and
       * pre-encoded as required by the back end. The method request parameter value must match the
       * pattern of `method.request.{location}.{name}` , where `location` is `querystring` , `path` ,
       * or `header` and `name` must be a valid and unique method request parameter name.
       */
      override fun requestParameters(requestParameters: Map<String, String>) {
        cdkBuilder.requestParameters(requestParameters)
      }

      /**
       * @param requestTemplates Represents a map of Velocity templates that are applied on the
       * request payload based on the value of the Content-Type header sent by the client.
       * The content type value is the key in this map, and the template (as a String) is the value.
       */
      override fun requestTemplates(requestTemplates: IResolvable) {
        cdkBuilder.requestTemplates(requestTemplates.let(IResolvable::unwrap))
      }

      /**
       * @param requestTemplates Represents a map of Velocity templates that are applied on the
       * request payload based on the value of the Content-Type header sent by the client.
       * The content type value is the key in this map, and the template (as a String) is the value.
       */
      override fun requestTemplates(requestTemplates: Map<String, String>) {
        cdkBuilder.requestTemplates(requestTemplates)
      }

      /**
       * @param timeoutInMillis Custom timeout between 50 and 29,000 milliseconds.
       * The default value is 29,000 milliseconds or 29 seconds.
       */
      override fun timeoutInMillis(timeoutInMillis: Number) {
        cdkBuilder.timeoutInMillis(timeoutInMillis)
      }

      /**
       * @param type Specifies an API method integration type. The valid value is one of the
       * following:. 
       * For the HTTP and HTTP proxy integrations, each integration can specify a protocol (
       * `http/https` ), port and path. Standard 80 and 443 ports are supported as well as custom ports
       * above 1024. An HTTP or HTTP proxy integration with a `connectionType` of `VPC_LINK` is
       * referred to as a private integration and uses a VpcLink to connect API Gateway to a network
       * load balancer of a VPC.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param uri Specifies Uniform Resource Identifier (URI) of the integration endpoint.
       * For `HTTP` or `HTTP_PROXY` integrations, the URI must be a fully formed, encoded HTTP(S)
       * URL according to the RFC-3986 specification for standard integrations. If `connectionType` is
       * `VPC_LINK` specify the Network Load Balancer DNS name. For `AWS` or `AWS_PROXY` integrations,
       * the URI is of the form
       * `arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}` . Here,
       * {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated
       * AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS
       * service for fast host-name lookup. action can be used for an AWS service action-based API,
       * using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api}
       * refers to a supported action {name} plus any required input parameters. Alternatively, path
       * can be used for an AWS service path-based API. The ensuing service_api refers to the path to
       * an AWS service resource, including the region of the integrated AWS service, if applicable.
       * For example, for integration with the S3 API of GetObject, the uri can be either
       * `arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}` or
       * `arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}`
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty,
    ) : CdkObject(cdkObject), IntegrationProperty {
      /**
       * A list of request parameters whose values API Gateway caches.
       *
       * To be valid values for `cacheKeyParameters` , these parameters must also be specified for
       * Method `requestParameters` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-cachekeyparameters)
       */
      override fun cacheKeyParameters(): List<String> = unwrap(this).getCacheKeyParameters() ?:
          emptyList()

      /**
       * Specifies a group of related cached parameters.
       *
       * By default, API Gateway uses the resource ID as the `cacheNamespace` . You can specify the
       * same `cacheNamespace` across resources to return the same cached data for requests to
       * different resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-cachenamespace)
       */
      override fun cacheNamespace(): String? = unwrap(this).getCacheNamespace()

      /**
       * The ID of the VpcLink used for the integration when `connectionType=VPC_LINK` and
       * undefined, otherwise.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-connectionid)
       */
      override fun connectionId(): String? = unwrap(this).getConnectionId()

      /**
       * The type of the network connection to the integration endpoint.
       *
       * The valid value is `INTERNET` for connections through the public routable internet or
       * `VPC_LINK` for private connections between API Gateway and a network load balancer in a VPC.
       * The default value is `INTERNET` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-connectiontype)
       */
      override fun connectionType(): String? = unwrap(this).getConnectionType()

      /**
       * Specifies how to handle request payload content type conversions.
       *
       * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
       * behaviors:
       *
       * If this property is not defined, the request payload will be passed through from the method
       * request to integration request without modification, provided that the `passthroughBehavior`
       * is configured to support payload pass-through.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-contenthandling)
       */
      override fun contentHandling(): String? = unwrap(this).getContentHandling()

      /**
       * Specifies the credentials required for the integration, if any.
       *
       * For AWS integrations, three options are available. To specify an IAM Role for API Gateway
       * to assume, use the role's Amazon Resource Name (ARN). To require that the caller's identity be
       * passed through from the request, specify the string `arn:aws:iam::\*:user/\*` . To use
       * resource-based permissions on supported AWS services, specify null.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-credentials)
       */
      override fun credentials(): String? = unwrap(this).getCredentials()

      /**
       * Specifies the integration's HTTP method type.
       *
       * For the Type property, if you specify `MOCK` , this property is optional. For Lambda
       * integrations, you must set the integration method to `POST` . For all other types, you must
       * specify this property.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-integrationhttpmethod)
       */
      override fun integrationHttpMethod(): String? = unwrap(this).getIntegrationHttpMethod()

      /**
       * Specifies the integration's responses.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-integrationresponses)
       */
      override fun integrationResponses(): Any? = unwrap(this).getIntegrationResponses()

      /**
       * Specifies how the method request body of an unmapped content type will be passed through
       * the integration request to the back end without transformation.
       *
       * A content type is unmapped if no mapping template is defined in the integration or the
       * content type does not match any of the mapped content types, as specified in
       * `requestTemplates` . The valid value is one of the following: `WHEN_NO_MATCH` : passes the
       * method request body through the integration request to the back end without transformation
       * when the method request content type does not match any content type associated with the
       * mapping templates defined in the integration request. `WHEN_NO_TEMPLATES` : passes the method
       * request body through the integration request to the back end without transformation when no
       * mapping template is defined in the integration request. If a template is defined when this
       * option is selected, the method request of an unmapped content-type will be rejected with an
       * HTTP 415 Unsupported Media Type response. `NEVER` : rejects the method request with an HTTP
       * 415 Unsupported Media Type response when either the method request content type does not match
       * any content type associated with the mapping templates defined in the integration request or
       * no mapping template is defined in the integration request.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-passthroughbehavior)
       */
      override fun passthroughBehavior(): String? = unwrap(this).getPassthroughBehavior()

      /**
       * A key-value map specifying request parameters that are passed from the method request to
       * the back end.
       *
       * The key is an integration request parameter name and the associated value is a method
       * request parameter value or static value that must be enclosed within single quotes and
       * pre-encoded as required by the back end. The method request parameter value must match the
       * pattern of `method.request.{location}.{name}` , where `location` is `querystring` , `path` ,
       * or `header` and `name` must be a valid and unique method request parameter name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-requestparameters)
       */
      override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

      /**
       * Represents a map of Velocity templates that are applied on the request payload based on the
       * value of the Content-Type header sent by the client.
       *
       * The content type value is the key in this map, and the template (as a String) is the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-requesttemplates)
       */
      override fun requestTemplates(): Any? = unwrap(this).getRequestTemplates()

      /**
       * Custom timeout between 50 and 29,000 milliseconds.
       *
       * The default value is 29,000 milliseconds or 29 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-timeoutinmillis)
       */
      override fun timeoutInMillis(): Number? = unwrap(this).getTimeoutInMillis()

      /**
       * Specifies an API method integration type. The valid value is one of the following:.
       *
       * For the HTTP and HTTP proxy integrations, each integration can specify a protocol (
       * `http/https` ), port and path. Standard 80 and 443 ports are supported as well as custom ports
       * above 1024. An HTTP or HTTP proxy integration with a `connectionType` of `VPC_LINK` is
       * referred to as a private integration and uses a VpcLink to connect API Gateway to a network
       * load balancer of a VPC.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-type)
       */
      override fun type(): String = unwrap(this).getType()

      /**
       * Specifies Uniform Resource Identifier (URI) of the integration endpoint.
       *
       * For `HTTP` or `HTTP_PROXY` integrations, the URI must be a fully formed, encoded HTTP(S)
       * URL according to the RFC-3986 specification for standard integrations. If `connectionType` is
       * `VPC_LINK` specify the Network Load Balancer DNS name. For `AWS` or `AWS_PROXY` integrations,
       * the URI is of the form
       * `arn:aws:apigateway:{region}:{subdomain.service|service}:path|action/{service_api}` . Here,
       * {Region} is the API Gateway region (e.g., us-east-1); {service} is the name of the integrated
       * AWS service (e.g., s3); and {subdomain} is a designated subdomain supported by certain AWS
       * service for fast host-name lookup. action can be used for an AWS service action-based API,
       * using an Action={name}&amp;{p1}={v1}&amp;p2={v2}... query string. The ensuing {service_api}
       * refers to a supported action {name} plus any required input parameters. Alternatively, path
       * can be used for an AWS service path-based API. The ensuing service_api refers to the path to
       * an AWS service resource, including the region of the integrated AWS service, if applicable.
       * For example, for integration with the S3 API of GetObject, the uri can be either
       * `arn:aws:apigateway:us-west-2:s3:action/GetObject&amp;Bucket={bucket}&amp;Key={key}` or
       * `arn:aws:apigateway:us-west-2:s3:path/{bucket}/{key}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integration.html#cfn-apigateway-method-integration-uri)
       */
      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty):
          IntegrationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationProperty):
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationProperty
    }
  }

  /**
   * `IntegrationResponse` is a property of the [Amazon API Gateway Method
   * Integration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apitgateway-method-integration.html)
   * property type that specifies the response that API Gateway sends after a method's backend finishes
   * processing a request.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * IntegrationResponseProperty integrationResponseProperty = IntegrationResponseProperty.builder()
   * .statusCode("statusCode")
   * // the properties below are optional
   * .contentHandling("contentHandling")
   * .responseParameters(Map.of(
   * "responseParametersKey", "responseParameters"))
   * .responseTemplates(Map.of(
   * "responseTemplatesKey", "responseTemplates"))
   * .selectionPattern("selectionPattern")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html)
   */
  public interface IntegrationResponseProperty {
    /**
     * Specifies how to handle response payload content type conversions.
     *
     * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
     * behaviors:
     *
     * If this property is not defined, the response payload will be passed through from the
     * integration response to the method response without modification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling)
     */
    public fun contentHandling(): String? = unwrap(this).getContentHandling()

    /**
     * A key-value map specifying response parameters that are passed to the method response from
     * the back end.
     *
     * The key is a method response header parameter name and the mapped value is an integration
     * response header value, a static value enclosed within a pair of single quotes, or a JSON
     * expression from the integration response body. The mapping key must match the pattern of
     * `method.response.header.{name}` , where `name` is a valid and unique header name. The mapped
     * non-static value must match the pattern of `integration.response.header.{name}` or
     * `integration.response.body.{JSON-expression}` , where `name` is a valid and unique response
     * header name and `JSON-expression` is a valid JSON expression without the `$` prefix.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-responseparameters)
     */
    public fun responseParameters(): Any? = unwrap(this).getResponseParameters()

    /**
     * Specifies the templates used to transform the integration response body.
     *
     * Response templates are represented as a key/value map, with a content-type as the key and a
     * template as the value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-responsetemplates)
     */
    public fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

    /**
     * Specifies the regular expression (regex) pattern used to choose an integration response based
     * on the response from the back end.
     *
     * For example, if the success response returns nothing and the error response returns some
     * string, you could use the `.+` regex to match error response. However, make sure that the error
     * response does not contain any newline ( `\n` ) character in such cases. If the back end is an
     * AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP and AWS
     * back ends, the HTTP status code is matched.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-selectionpattern)
     */
    public fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

    /**
     * Specifies the status code that is used to map the integration response to an existing
     * MethodResponse.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-statuscode)
     */
    public fun statusCode(): String

    /**
     * A builder for [IntegrationResponseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param contentHandling Specifies how to handle response payload content type conversions.
       * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
       * behaviors:
       *
       * If this property is not defined, the response payload will be passed through from the
       * integration response to the method response without modification.
       */
      public fun contentHandling(contentHandling: String)

      /**
       * @param responseParameters A key-value map specifying response parameters that are passed to
       * the method response from the back end.
       * The key is a method response header parameter name and the mapped value is an integration
       * response header value, a static value enclosed within a pair of single quotes, or a JSON
       * expression from the integration response body. The mapping key must match the pattern of
       * `method.response.header.{name}` , where `name` is a valid and unique header name. The mapped
       * non-static value must match the pattern of `integration.response.header.{name}` or
       * `integration.response.body.{JSON-expression}` , where `name` is a valid and unique response
       * header name and `JSON-expression` is a valid JSON expression without the `$` prefix.
       */
      public fun responseParameters(responseParameters: IResolvable)

      /**
       * @param responseParameters A key-value map specifying response parameters that are passed to
       * the method response from the back end.
       * The key is a method response header parameter name and the mapped value is an integration
       * response header value, a static value enclosed within a pair of single quotes, or a JSON
       * expression from the integration response body. The mapping key must match the pattern of
       * `method.response.header.{name}` , where `name` is a valid and unique header name. The mapped
       * non-static value must match the pattern of `integration.response.header.{name}` or
       * `integration.response.body.{JSON-expression}` , where `name` is a valid and unique response
       * header name and `JSON-expression` is a valid JSON expression without the `$` prefix.
       */
      public fun responseParameters(responseParameters: Map<String, String>)

      /**
       * @param responseTemplates Specifies the templates used to transform the integration response
       * body.
       * Response templates are represented as a key/value map, with a content-type as the key and a
       * template as the value.
       */
      public fun responseTemplates(responseTemplates: IResolvable)

      /**
       * @param responseTemplates Specifies the templates used to transform the integration response
       * body.
       * Response templates are represented as a key/value map, with a content-type as the key and a
       * template as the value.
       */
      public fun responseTemplates(responseTemplates: Map<String, String>)

      /**
       * @param selectionPattern Specifies the regular expression (regex) pattern used to choose an
       * integration response based on the response from the back end.
       * For example, if the success response returns nothing and the error response returns some
       * string, you could use the `.+` regex to match error response. However, make sure that the
       * error response does not contain any newline ( `\n` ) character in such cases. If the back end
       * is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP
       * and AWS back ends, the HTTP status code is matched.
       */
      public fun selectionPattern(selectionPattern: String)

      /**
       * @param statusCode Specifies the status code that is used to map the integration response to
       * an existing MethodResponse. 
       */
      public fun statusCode(statusCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty.builder()

      /**
       * @param contentHandling Specifies how to handle response payload content type conversions.
       * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
       * behaviors:
       *
       * If this property is not defined, the response payload will be passed through from the
       * integration response to the method response without modification.
       */
      override fun contentHandling(contentHandling: String) {
        cdkBuilder.contentHandling(contentHandling)
      }

      /**
       * @param responseParameters A key-value map specifying response parameters that are passed to
       * the method response from the back end.
       * The key is a method response header parameter name and the mapped value is an integration
       * response header value, a static value enclosed within a pair of single quotes, or a JSON
       * expression from the integration response body. The mapping key must match the pattern of
       * `method.response.header.{name}` , where `name` is a valid and unique header name. The mapped
       * non-static value must match the pattern of `integration.response.header.{name}` or
       * `integration.response.body.{JSON-expression}` , where `name` is a valid and unique response
       * header name and `JSON-expression` is a valid JSON expression without the `$` prefix.
       */
      override fun responseParameters(responseParameters: IResolvable) {
        cdkBuilder.responseParameters(responseParameters.let(IResolvable::unwrap))
      }

      /**
       * @param responseParameters A key-value map specifying response parameters that are passed to
       * the method response from the back end.
       * The key is a method response header parameter name and the mapped value is an integration
       * response header value, a static value enclosed within a pair of single quotes, or a JSON
       * expression from the integration response body. The mapping key must match the pattern of
       * `method.response.header.{name}` , where `name` is a valid and unique header name. The mapped
       * non-static value must match the pattern of `integration.response.header.{name}` or
       * `integration.response.body.{JSON-expression}` , where `name` is a valid and unique response
       * header name and `JSON-expression` is a valid JSON expression without the `$` prefix.
       */
      override fun responseParameters(responseParameters: Map<String, String>) {
        cdkBuilder.responseParameters(responseParameters)
      }

      /**
       * @param responseTemplates Specifies the templates used to transform the integration response
       * body.
       * Response templates are represented as a key/value map, with a content-type as the key and a
       * template as the value.
       */
      override fun responseTemplates(responseTemplates: IResolvable) {
        cdkBuilder.responseTemplates(responseTemplates.let(IResolvable::unwrap))
      }

      /**
       * @param responseTemplates Specifies the templates used to transform the integration response
       * body.
       * Response templates are represented as a key/value map, with a content-type as the key and a
       * template as the value.
       */
      override fun responseTemplates(responseTemplates: Map<String, String>) {
        cdkBuilder.responseTemplates(responseTemplates)
      }

      /**
       * @param selectionPattern Specifies the regular expression (regex) pattern used to choose an
       * integration response based on the response from the back end.
       * For example, if the success response returns nothing and the error response returns some
       * string, you could use the `.+` regex to match error response. However, make sure that the
       * error response does not contain any newline ( `\n` ) character in such cases. If the back end
       * is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP
       * and AWS back ends, the HTTP status code is matched.
       */
      override fun selectionPattern(selectionPattern: String) {
        cdkBuilder.selectionPattern(selectionPattern)
      }

      /**
       * @param statusCode Specifies the status code that is used to map the integration response to
       * an existing MethodResponse. 
       */
      override fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
      }

      public fun build():
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty,
    ) : CdkObject(cdkObject), IntegrationResponseProperty {
      /**
       * Specifies how to handle response payload content type conversions.
       *
       * Supported values are `CONVERT_TO_BINARY` and `CONVERT_TO_TEXT` , with the following
       * behaviors:
       *
       * If this property is not defined, the response payload will be passed through from the
       * integration response to the method response without modification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-contenthandling)
       */
      override fun contentHandling(): String? = unwrap(this).getContentHandling()

      /**
       * A key-value map specifying response parameters that are passed to the method response from
       * the back end.
       *
       * The key is a method response header parameter name and the mapped value is an integration
       * response header value, a static value enclosed within a pair of single quotes, or a JSON
       * expression from the integration response body. The mapping key must match the pattern of
       * `method.response.header.{name}` , where `name` is a valid and unique header name. The mapped
       * non-static value must match the pattern of `integration.response.header.{name}` or
       * `integration.response.body.{JSON-expression}` , where `name` is a valid and unique response
       * header name and `JSON-expression` is a valid JSON expression without the `$` prefix.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-responseparameters)
       */
      override fun responseParameters(): Any? = unwrap(this).getResponseParameters()

      /**
       * Specifies the templates used to transform the integration response body.
       *
       * Response templates are represented as a key/value map, with a content-type as the key and a
       * template as the value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-responsetemplates)
       */
      override fun responseTemplates(): Any? = unwrap(this).getResponseTemplates()

      /**
       * Specifies the regular expression (regex) pattern used to choose an integration response
       * based on the response from the back end.
       *
       * For example, if the success response returns nothing and the error response returns some
       * string, you could use the `.+` regex to match error response. However, make sure that the
       * error response does not contain any newline ( `\n` ) character in such cases. If the back end
       * is an AWS Lambda function, the AWS Lambda function error header is matched. For all other HTTP
       * and AWS back ends, the HTTP status code is matched.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-selectionpattern)
       */
      override fun selectionPattern(): String? = unwrap(this).getSelectionPattern()

      /**
       * Specifies the status code that is used to map the integration response to an existing
       * MethodResponse.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-method-integrationresponse.html#cfn-apigateway-method-integrationresponse-statuscode)
       */
      override fun statusCode(): String = unwrap(this).getStatusCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IntegrationResponseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty):
          IntegrationResponseProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IntegrationResponseProperty):
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnMethod.IntegrationResponseProperty
    }
  }
}
