@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnMethod
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::Method` resource creates API Gateway methods that define the parameters and
 * body that clients must send in their requests.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
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
@CdkDslMarker
public class CfnMethodDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMethod.Builder = CfnMethod.Builder.create(scope, id)

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  private val _methodResponses: MutableList<Any> = mutableListOf()

  /**
   * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
   * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
   * this method. 
   */
  public fun apiKeyRequired(apiKeyRequired: Boolean) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  /**
   * A boolean flag specifying whether a valid ApiKey is required to invoke this method.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-apikeyrequired)
   * @param apiKeyRequired A boolean flag specifying whether a valid ApiKey is required to invoke
   * this method. 
   */
  public fun apiKeyRequired(apiKeyRequired: IResolvable) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

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
   * @param authorizationScopes A list of authorization scopes configured on the method. 
   */
  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

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
   * @param authorizationScopes A list of authorization scopes configured on the method. 
   */
  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

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
  public fun authorizationType(authorizationType: String) {
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
  public fun authorizerId(authorizerId: String) {
    cdkBuilder.authorizerId(authorizerId)
  }

  /**
   * The method's HTTP verb.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-httpmethod)
   * @param httpMethod The method's HTTP verb. 
   */
  public fun httpMethod(httpMethod: String) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
   * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
   * integration. 
   */
  public fun integration(integration: IResolvable) {
    cdkBuilder.integration(integration)
  }

  /**
   * Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock integration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-integration)
   * @param integration Represents an `HTTP` , `HTTP_PROXY` , `AWS` , `AWS_PROXY` , or Mock
   * integration. 
   */
  public fun integration(integration: CfnMethod.IntegrationProperty) {
    cdkBuilder.integration(integration)
  }

  /**
   * Gets a method response associated with a given HTTP status code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
   * @param methodResponses Gets a method response associated with a given HTTP status code. 
   */
  public fun methodResponses(vararg methodResponses: Any) {
    _methodResponses.addAll(listOf(*methodResponses))
  }

  /**
   * Gets a method response associated with a given HTTP status code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
   * @param methodResponses Gets a method response associated with a given HTTP status code. 
   */
  public fun methodResponses(methodResponses: Collection<Any>) {
    _methodResponses.addAll(methodResponses)
  }

  /**
   * Gets a method response associated with a given HTTP status code.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-methodresponses)
   * @param methodResponses Gets a method response associated with a given HTTP status code. 
   */
  public fun methodResponses(methodResponses: IResolvable) {
    cdkBuilder.methodResponses(methodResponses)
  }

  /**
   * A human-friendly operation identifier for the method.
   *
   * For example, you can assign the `operationName` of `ListPets` for the `GET /pets` method in the
   * `PetStore` example.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-operationname)
   * @param operationName A human-friendly operation identifier for the method. 
   */
  public fun operationName(operationName: String) {
    cdkBuilder.operationName(operationName)
  }

  /**
   * A key-value map specifying data schemas, represented by Model resources, (as the mapped value)
   * of the request payloads of given content types (as the mapping key).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
   * @param requestModels A key-value map specifying data schemas, represented by Model resources,
   * (as the mapped value) of the request payloads of given content types (as the mapping key). 
   */
  public fun requestModels(requestModels: Map<String, String>) {
    cdkBuilder.requestModels(requestModels)
  }

  /**
   * A key-value map specifying data schemas, represented by Model resources, (as the mapped value)
   * of the request payloads of given content types (as the mapping key).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestmodels)
   * @param requestModels A key-value map specifying data schemas, represented by Model resources,
   * (as the mapped value) of the request payloads of given content types (as the mapping key). 
   */
  public fun requestModels(requestModels: IResolvable) {
    cdkBuilder.requestModels(requestModels)
  }

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
   * @param requestParameters A key-value map defining required or optional method request
   * parameters that can be accepted by API Gateway. 
   */
  public fun requestParameters(requestParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(requestParameters)
    cdkBuilder.requestParameters(builder.map)
  }

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
   * @param requestParameters A key-value map defining required or optional method request
   * parameters that can be accepted by API Gateway. 
   */
  public fun requestParameters(requestParameters: Map<String, Any>) {
    cdkBuilder.requestParameters(requestParameters)
  }

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
   * @param requestParameters A key-value map defining required or optional method request
   * parameters that can be accepted by API Gateway. 
   */
  public fun requestParameters(requestParameters: IResolvable) {
    cdkBuilder.requestParameters(requestParameters)
  }

  /**
   * The identifier of a RequestValidator for request validation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-requestvalidatorid)
   * @param requestValidatorId The identifier of a RequestValidator for request validation. 
   */
  public fun requestValidatorId(requestValidatorId: String) {
    cdkBuilder.requestValidatorId(requestValidatorId)
  }

  /**
   * The Resource identifier for the MethodResponse resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-resourceid)
   * @param resourceId The Resource identifier for the MethodResponse resource. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * The string identifier of the associated RestApi.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-method.html#cfn-apigateway-method-restapiid)
   * @param restApiId The string identifier of the associated RestApi. 
   */
  public fun restApiId(restApiId: String) {
    cdkBuilder.restApiId(restApiId)
  }

  public fun build(): CfnMethod {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    if(_methodResponses.isNotEmpty()) cdkBuilder.methodResponses(_methodResponses)
    return cdkBuilder.build()
  }
}
