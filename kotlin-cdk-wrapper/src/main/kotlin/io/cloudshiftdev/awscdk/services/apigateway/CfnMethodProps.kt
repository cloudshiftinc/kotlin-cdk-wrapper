@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnMethod`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnMethodProps cfnMethodProps = CfnMethodProps.builder()
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
public interface CfnMethodProps {
  /**
   * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
   */
  public fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

  /**
   * A list of authorization scopes configured on the method.
   *
   * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method invocation.
   * The authorization works by matching the method scopes against the scopes parsed from the access
   * token in the incoming request. The method invocation is authorized if any method scopes matches a
   * claimed scope in the access token. Otherwise, the invocation is not authorized. When the method
   * scope is configured, the client must provide an access token instead of an identity token for
   * authorization purposes.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizationscopes)
   */
  public fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
      emptyList()

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
   */
  public fun authorizationType(): String? = unwrap(this).getAuthorizationType()

  /**
   * The identifier of an authorizer to use on this method.
   *
   * The method's authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
   */
  public fun authorizerId(): String? = unwrap(this).getAuthorizerId()

  /**
   * The method's HTTP verb.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
   */
  public fun httpMethod(): String

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
   */
  public fun integration(): Any? = unwrap(this).getIntegration()

  /**
   * Gets a method response associated with a given HTTP status code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
   */
  public fun methodResponses(): Any? = unwrap(this).getMethodResponses()

  /**
   * A human-friendly operation identifier for the method.
   *
   * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in the
   * `PetStore` example.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
   */
  public fun operationName(): String? = unwrap(this).getOperationName()

  /**
   * A key-value map specifying data schemas, represented by Model resources, (as the mapped value)
   * of the request payloads of given content types (as the mapping key).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
   */
  public fun requestModels(): Any? = unwrap(this).getRequestModels()

  /**
   * A key-value map defining required or optional method request parameters that can be accepted by
   * API Gateway.
   *
   * A key is a method request parameter name matching the pattern of
   * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header` and
   * `name` is a valid and unique parameter name. The value associated with the key is a Boolean flag
   * indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
   * request parameter names defined here are available in Integration to be mapped to integration
   * request parameters or templates.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestparameters)
   */
  public fun requestParameters(): Any? = unwrap(this).getRequestParameters()

  /**
   * The identifier of a RequestValidator for request validation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
   */
  public fun requestValidatorId(): String? = unwrap(this).getRequestValidatorId()

  /**
   * The Resource identifier for the MethodResponse resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
   */
  public fun resourceId(): String

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
   */
  public fun restApiId(): String

  /**
   * A builder for [CfnMethodProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method.
     */
    public fun apiKeyRequired(apiKeyRequired: Boolean)

    /**
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method.
     */
    public fun apiKeyRequired(apiKeyRequired: IResolvable)

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     */
    public fun authorizationScopes(authorizationScopes: List<String>)

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     */
    public fun authorizationScopes(vararg authorizationScopes: String)

    /**
     * @param authorizationType The method's authorization type.
     *  For valid values, see
     * [Method](https://docs.aws.amazon.com/apigateway/latest/api/API_Method.html) in the *API Gateway
     * API Reference* .
     *
     *
     * If you specify the `AuthorizerId` property, specify `CUSTOM` or `COGNITO_USER_POOLS` for this
     * property.
     */
    public fun authorizationType(authorizationType: String)

    /**
     * @param authorizerId The identifier of an authorizer to use on this method.
     * The method's authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
     */
    public fun authorizerId(authorizerId: String)

    /**
     * @param httpMethod The method's HTTP verb. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration.
     */
    public fun integration(integration: IResolvable)

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration.
     */
    public fun integration(integration: CfnMethod.IntegrationProperty)

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5245da4b9509ece1c494ecdde37d0f9eb6a968e5af4555e3b2f071e19e58d2f")
    public fun integration(integration: CfnMethod.IntegrationProperty.Builder.() -> Unit)

    /**
     * @param methodResponses Gets a method response associated with a given HTTP status code.
     */
    public fun methodResponses(methodResponses: IResolvable)

    /**
     * @param methodResponses Gets a method response associated with a given HTTP status code.
     */
    public fun methodResponses(methodResponses: List<Any>)

    /**
     * @param methodResponses Gets a method response associated with a given HTTP status code.
     */
    public fun methodResponses(vararg methodResponses: Any)

    /**
     * @param operationName A human-friendly operation identifier for the method.
     * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in
     * the `PetStore` example.
     */
    public fun operationName(operationName: String)

    /**
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key).
     */
    public fun requestModels(requestModels: IResolvable)

    /**
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key).
     */
    public fun requestModels(requestModels: Map<String, String>)

    /**
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway.
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     */
    public fun requestParameters(requestParameters: IResolvable)

    /**
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway.
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     */
    public fun requestParameters(requestParameters: Map<String, Any>)

    /**
     * @param requestValidatorId The identifier of a RequestValidator for request validation.
     */
    public fun requestValidatorId(requestValidatorId: String)

    /**
     * @param resourceId The Resource identifier for the MethodResponse resource. 
     */
    public fun resourceId(resourceId: String)

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    public fun restApiId(restApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnMethodProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnMethodProps.builder()

    /**
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method.
     */
    override fun apiKeyRequired(apiKeyRequired: Boolean) {
      cdkBuilder.apiKeyRequired(apiKeyRequired)
    }

    /**
     * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
     * this method.
     */
    override fun apiKeyRequired(apiKeyRequired: IResolvable) {
      cdkBuilder.apiKeyRequired(apiKeyRequired.let(IResolvable::unwrap))
    }

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     */
    override fun authorizationScopes(authorizationScopes: List<String>) {
      cdkBuilder.authorizationScopes(authorizationScopes)
    }

    /**
     * @param authorizationScopes A list of authorization scopes configured on the method.
     * The scopes are used with a `COGNITO_USER_POOLS` authorizer to authorize the method
     * invocation. The authorization works by matching the method scopes against the scopes parsed from
     * the access token in the incoming request. The method invocation is authorized if any method
     * scopes matches a claimed scope in the access token. Otherwise, the invocation is not authorized.
     * When the method scope is configured, the client must provide an access token instead of an
     * identity token for authorization purposes.
     */
    override fun authorizationScopes(vararg authorizationScopes: String): Unit =
        authorizationScopes(authorizationScopes.toList())

    /**
     * @param authorizationType The method's authorization type.
     *  For valid values, see
     * [Method](https://docs.aws.amazon.com/apigateway/latest/api/API_Method.html) in the *API Gateway
     * API Reference* .
     *
     *
     * If you specify the `AuthorizerId` property, specify `CUSTOM` or `COGNITO_USER_POOLS` for this
     * property.
     */
    override fun authorizationType(authorizationType: String) {
      cdkBuilder.authorizationType(authorizationType)
    }

    /**
     * @param authorizerId The identifier of an authorizer to use on this method.
     * The method's authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
     */
    override fun authorizerId(authorizerId: String) {
      cdkBuilder.authorizerId(authorizerId)
    }

    /**
     * @param httpMethod The method's HTTP verb. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration.
     */
    override fun integration(integration: IResolvable) {
      cdkBuilder.integration(integration.let(IResolvable::unwrap))
    }

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration.
     */
    override fun integration(integration: CfnMethod.IntegrationProperty) {
      cdkBuilder.integration(integration.let(CfnMethod.IntegrationProperty::unwrap))
    }

    /**
     * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
     * integration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c5245da4b9509ece1c494ecdde37d0f9eb6a968e5af4555e3b2f071e19e58d2f")
    override fun integration(integration: CfnMethod.IntegrationProperty.Builder.() -> Unit): Unit =
        integration(CfnMethod.IntegrationProperty(integration))

    /**
     * @param methodResponses Gets a method response associated with a given HTTP status code.
     */
    override fun methodResponses(methodResponses: IResolvable) {
      cdkBuilder.methodResponses(methodResponses.let(IResolvable::unwrap))
    }

    /**
     * @param methodResponses Gets a method response associated with a given HTTP status code.
     */
    override fun methodResponses(methodResponses: List<Any>) {
      cdkBuilder.methodResponses(methodResponses)
    }

    /**
     * @param methodResponses Gets a method response associated with a given HTTP status code.
     */
    override fun methodResponses(vararg methodResponses: Any): Unit =
        methodResponses(methodResponses.toList())

    /**
     * @param operationName A human-friendly operation identifier for the method.
     * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in
     * the `PetStore` example.
     */
    override fun operationName(operationName: String) {
      cdkBuilder.operationName(operationName)
    }

    /**
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key).
     */
    override fun requestModels(requestModels: IResolvable) {
      cdkBuilder.requestModels(requestModels.let(IResolvable::unwrap))
    }

    /**
     * @param requestModels A key-value map specifying data schemas, represented by Model resources,
     * (as the mapped value) of the request payloads of given content types (as the mapping key).
     */
    override fun requestModels(requestModels: Map<String, String>) {
      cdkBuilder.requestModels(requestModels)
    }

    /**
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway.
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     */
    override fun requestParameters(requestParameters: IResolvable) {
      cdkBuilder.requestParameters(requestParameters.let(IResolvable::unwrap))
    }

    /**
     * @param requestParameters A key-value map defining required or optional method request
     * parameters that can be accepted by API Gateway.
     * A key is a method request parameter name matching the pattern of
     * `method.request.{location}.{name}` , where `location` is `querystring` , `path` , or `header`
     * and `name` is a valid and unique parameter name. The value associated with the key is a Boolean
     * flag indicating whether the parameter is required ( `true` ) or optional ( `false` ). The method
     * request parameter names defined here are available in Integration to be mapped to integration
     * request parameters or templates.
     */
    override fun requestParameters(requestParameters: Map<String, Any>) {
      cdkBuilder.requestParameters(requestParameters)
    }

    /**
     * @param requestValidatorId The identifier of a RequestValidator for request validation.
     */
    override fun requestValidatorId(requestValidatorId: String) {
      cdkBuilder.requestValidatorId(requestValidatorId)
    }

    /**
     * @param resourceId The Resource identifier for the MethodResponse resource. 
     */
    override fun resourceId(resourceId: String) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param restApiId The string identifier of the associated RestApi. 
     */
    override fun restApiId(restApiId: String) {
      cdkBuilder.restApiId(restApiId)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnMethodProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnMethodProps,
  ) : CdkObject(cdkObject), CfnMethodProps {
    /**
     * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
     */
    override fun apiKeyRequired(): Any? = unwrap(this).getApiKeyRequired()

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
     */
    override fun authorizationScopes(): List<String> = unwrap(this).getAuthorizationScopes() ?:
        emptyList()

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
     */
    override fun authorizationType(): String? = unwrap(this).getAuthorizationType()

    /**
     * The identifier of an authorizer to use on this method.
     *
     * The method's authorization type must be `CUSTOM` or `COGNITO_USER_POOLS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-authorizerid)
     */
    override fun authorizerId(): String? = unwrap(this).getAuthorizerId()

    /**
     * The method's HTTP verb.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
     */
    override fun httpMethod(): String = unwrap(this).getHttpMethod()

    /**
     * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
     */
    override fun integration(): Any? = unwrap(this).getIntegration()

    /**
     * Gets a method response associated with a given HTTP status code.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
     */
    override fun methodResponses(): Any? = unwrap(this).getMethodResponses()

    /**
     * A human-friendly operation identifier for the method.
     *
     * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in
     * the `PetStore` example.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
     */
    override fun operationName(): String? = unwrap(this).getOperationName()

    /**
     * A key-value map specifying data schemas, represented by Model resources, (as the mapped
     * value) of the request payloads of given content types (as the mapping key).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
     */
    override fun requestModels(): Any? = unwrap(this).getRequestModels()

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
     */
    override fun requestParameters(): Any? = unwrap(this).getRequestParameters()

    /**
     * The identifier of a RequestValidator for request validation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
     */
    override fun requestValidatorId(): String? = unwrap(this).getRequestValidatorId()

    /**
     * The Resource identifier for the MethodResponse resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
     */
    override fun resourceId(): String = unwrap(this).getResourceId()

    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
     */
    override fun restApiId(): String = unwrap(this).getRestApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMethodProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnMethodProps):
        CfnMethodProps = CdkObjectWrappers.wrap(cdkObject) as? CfnMethodProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMethodProps):
        software.amazon.awscdk.services.apigateway.CfnMethodProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnMethodProps
  }
}
