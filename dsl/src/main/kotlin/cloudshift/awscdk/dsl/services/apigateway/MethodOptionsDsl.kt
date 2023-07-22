@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.apigateway.AuthorizationType
import software.amazon.awscdk.services.apigateway.IAuthorizer
import software.amazon.awscdk.services.apigateway.IModel
import software.amazon.awscdk.services.apigateway.IRequestValidator
import software.amazon.awscdk.services.apigateway.MethodOptions
import software.amazon.awscdk.services.apigateway.MethodResponse
import software.amazon.awscdk.services.apigateway.RequestValidatorOptions

@CdkDslMarker
public class MethodOptionsDsl {
  private val cdkBuilder: MethodOptions.Builder = MethodOptions.builder()

  private val _authorizationScopes: MutableList<String> = mutableListOf()

  private val _methodResponses: MutableList<MethodResponse> = mutableListOf()

  /**
   * @param apiKeyRequired Indicates whether the method requires clients to submit a valid API key.
   */
  public fun apiKeyRequired(apiKeyRequired: Boolean) {
    cdkBuilder.apiKeyRequired(apiKeyRequired)
  }

  /**
   * @param authorizationScopes A list of authorization scopes configured on the method.
   * The scopes are used with
   * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
   */
  public fun authorizationScopes(vararg authorizationScopes: String) {
    _authorizationScopes.addAll(listOf(*authorizationScopes))
  }

  /**
   * @param authorizationScopes A list of authorization scopes configured on the method.
   * The scopes are used with
   * a COGNITO_USER_POOLS authorizer to authorize the method invocation.
   */
  public fun authorizationScopes(authorizationScopes: Collection<String>) {
    _authorizationScopes.addAll(authorizationScopes)
  }

  /**
   * @param authorizationType Method authorization. If the value is set of `Custom`, an `authorizer`
   * must also be specified.
   * If you're using one of the authorizers that are available via the `Authorizer` class, such as
   * `Authorizer#token()`,
   * it is recommended that this option not be specified. The authorizer will take care of setting
   * the correct authorization type.
   * However, specifying an authorization type using this property that conflicts with what is
   * expected by the `Authorizer`
   * will result in an error.
   */
  public fun authorizationType(authorizationType: AuthorizationType) {
    cdkBuilder.authorizationType(authorizationType)
  }

  /**
   * @param authorizer If `authorizationType` is `Custom`, this specifies the ID of the method
   * authorizer resource.
   * If specified, the value of `authorizationType` must be set to `Custom`
   */
  public fun authorizer(authorizer: IAuthorizer) {
    cdkBuilder.authorizer(authorizer)
  }

  /**
   * @param methodResponses The responses that can be sent to the client who calls the method.
   */
  public fun methodResponses(methodResponses: MethodResponseDsl.() -> Unit) {
    _methodResponses.add(MethodResponseDsl().apply(methodResponses).build())
  }

  /**
   * @param methodResponses The responses that can be sent to the client who calls the method.
   */
  public fun methodResponses(methodResponses: Collection<MethodResponse>) {
    _methodResponses.addAll(methodResponses)
  }

  /**
   * @param operationName A friendly operation name for the method.
   * For example, you can assign the
   * OperationName of ListPets for the GET /pets method.
   */
  public fun operationName(operationName: String) {
    cdkBuilder.operationName(operationName)
  }

  /**
   * @param requestModels The models which describe data structure of request payload.
   * When
   * combined with `requestValidator` or `requestValidatorOptions`, the service
   * will validate the API request payload before it reaches the API's Integration (including
   * proxies).
   * Specify `requestModels` as key-value pairs, with a content type
   * (e.g. `'application/json'`) as the key and an API Gateway Model as the value.
   */
  public fun requestModels(requestModels: Map<String, IModel>) {
    cdkBuilder.requestModels(requestModels)
  }

  /**
   * @param requestParameters The request parameters that API Gateway accepts.
   * Specify request parameters
   * as key-value pairs (string-to-Boolean mapping), with a source as the key and
   * a Boolean as the value. The Boolean specifies whether a parameter is required.
   * A source must match the format method.request.location.name, where the location
   * is querystring, path, or header, and name is a valid, unique parameter name.
   */
  public fun requestParameters(requestParameters: Map<String, Boolean>) {
    cdkBuilder.requestParameters(requestParameters)
  }

  /**
   * @param requestValidator The ID of the associated request validator.
   * Only one of `requestValidator` or `requestValidatorOptions` must be specified.
   * Works together with `requestModels` or `requestParameters` to validate
   * the request before it reaches integration like Lambda Proxy Integration.
   */
  public fun requestValidator(requestValidator: IRequestValidator) {
    cdkBuilder.requestValidator(requestValidator)
  }

  /**
   * @param requestValidatorOptions Request validator options to create new validator Only one of
   * `requestValidator` or `requestValidatorOptions` must be specified.
   * Works together with `requestModels` or `requestParameters` to validate
   * the request before it reaches integration like Lambda Proxy Integration.
   */
  public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptionsDsl.() -> Unit
      = {}) {
    val builder = RequestValidatorOptionsDsl()
    builder.apply(requestValidatorOptions)
    cdkBuilder.requestValidatorOptions(builder.build())
  }

  /**
   * @param requestValidatorOptions Request validator options to create new validator Only one of
   * `requestValidator` or `requestValidatorOptions` must be specified.
   * Works together with `requestModels` or `requestParameters` to validate
   * the request before it reaches integration like Lambda Proxy Integration.
   */
  public fun requestValidatorOptions(requestValidatorOptions: RequestValidatorOptions) {
    cdkBuilder.requestValidatorOptions(requestValidatorOptions)
  }

  public fun build(): MethodOptions {
    if(_authorizationScopes.isNotEmpty()) cdkBuilder.authorizationScopes(_authorizationScopes)
    if(_methodResponses.isNotEmpty()) cdkBuilder.methodResponses(_methodResponses)
    return cdkBuilder.build()
  }
}
