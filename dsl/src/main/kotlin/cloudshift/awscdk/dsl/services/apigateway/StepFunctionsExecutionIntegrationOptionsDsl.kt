@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.apigateway.ConnectionType
import software.amazon.awscdk.services.apigateway.ContentHandling
import software.amazon.awscdk.services.apigateway.IVpcLink
import software.amazon.awscdk.services.apigateway.IntegrationResponse
import software.amazon.awscdk.services.apigateway.PassthroughBehavior
import software.amazon.awscdk.services.apigateway.RequestContext
import software.amazon.awscdk.services.apigateway.StepFunctionsExecutionIntegrationOptions
import software.amazon.awscdk.services.iam.IRole

/**
 * Options when configuring Step Functions synchronous integration with Rest API.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.apigateway.*;
 * import software.amazon.awscdk.services.iam.*;
 * Role role;
 * VpcLink vpcLink;
 * StepFunctionsExecutionIntegrationOptions stepFunctionsExecutionIntegrationOptions =
 * StepFunctionsExecutionIntegrationOptions.builder()
 * .authorizer(false)
 * .cacheKeyParameters(List.of("cacheKeyParameters"))
 * .cacheNamespace("cacheNamespace")
 * .connectionType(ConnectionType.INTERNET)
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .credentialsPassthrough(false)
 * .credentialsRole(role)
 * .headers(false)
 * .integrationResponses(List.of(IntegrationResponse.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .contentHandling(ContentHandling.CONVERT_TO_BINARY)
 * .responseParameters(Map.of(
 * "responseParametersKey", "responseParameters"))
 * .responseTemplates(Map.of(
 * "responseTemplatesKey", "responseTemplates"))
 * .selectionPattern("selectionPattern")
 * .build()))
 * .passthroughBehavior(PassthroughBehavior.WHEN_NO_MATCH)
 * .path(false)
 * .querystring(false)
 * .requestContext(RequestContext.builder()
 * .accountId(false)
 * .apiId(false)
 * .apiKey(false)
 * .authorizerPrincipalId(false)
 * .caller(false)
 * .cognitoAuthenticationProvider(false)
 * .cognitoAuthenticationType(false)
 * .cognitoIdentityId(false)
 * .cognitoIdentityPoolId(false)
 * .httpMethod(false)
 * .requestId(false)
 * .resourceId(false)
 * .resourcePath(false)
 * .sourceIp(false)
 * .stage(false)
 * .user(false)
 * .userAgent(false)
 * .userArn(false)
 * .build())
 * .requestParameters(Map.of(
 * "requestParametersKey", "requestParameters"))
 * .requestTemplates(Map.of(
 * "requestTemplatesKey", "requestTemplates"))
 * .timeout(Duration.minutes(30))
 * .vpcLink(vpcLink)
 * .build();
 * ```
 */
@CdkDslMarker
public class StepFunctionsExecutionIntegrationOptionsDsl {
  private val cdkBuilder: StepFunctionsExecutionIntegrationOptions.Builder =
      StepFunctionsExecutionIntegrationOptions.builder()

  private val _cacheKeyParameters: MutableList<String> = mutableListOf()

  private val _integrationResponses: MutableList<IntegrationResponse> = mutableListOf()

  /**
   * @param authorizer If the whole authorizer object, including custom context values should be in
   * the execution input.
   * The execution input will include a new key `authorizer`:
   *
   * {
   * "body": {},
   * "authorizer": {
   * "key": "value"
   * }
   * }
   */
  public fun authorizer(authorizer: Boolean) {
    cdkBuilder.authorizer(authorizer)
  }

  /**
   * @param cacheKeyParameters A list of request parameters whose values are to be cached.
   * It determines
   * request parameters that will make it into the cache key.
   */
  public fun cacheKeyParameters(vararg cacheKeyParameters: String) {
    _cacheKeyParameters.addAll(listOf(*cacheKeyParameters))
  }

  /**
   * @param cacheKeyParameters A list of request parameters whose values are to be cached.
   * It determines
   * request parameters that will make it into the cache key.
   */
  public fun cacheKeyParameters(cacheKeyParameters: Collection<String>) {
    _cacheKeyParameters.addAll(cacheKeyParameters)
  }

  /**
   * @param cacheNamespace An API-specific tag group of related cached parameters.
   */
  public fun cacheNamespace(cacheNamespace: String) {
    cdkBuilder.cacheNamespace(cacheNamespace)
  }

  /**
   * @param connectionType The type of network connection to the integration endpoint.
   */
  public fun connectionType(connectionType: ConnectionType) {
    cdkBuilder.connectionType(connectionType)
  }

  /**
   * @param contentHandling Specifies how to handle request payload content type conversions.
   */
  public fun contentHandling(contentHandling: ContentHandling) {
    cdkBuilder.contentHandling(contentHandling)
  }

  /**
   * @param credentialsPassthrough Requires that the caller's identity be passed through from the
   * request.
   */
  public fun credentialsPassthrough(credentialsPassthrough: Boolean) {
    cdkBuilder.credentialsPassthrough(credentialsPassthrough)
  }

  /**
   * @param credentialsRole An IAM role that API Gateway assumes.
   * Mutually exclusive with `credentialsPassThrough`.
   */
  public fun credentialsRole(credentialsRole: IRole) {
    cdkBuilder.credentialsRole(credentialsRole)
  }

  /**
   * @param headers Check if header is to be included inside the execution input.
   * The execution input will include a new key `headers`:
   *
   * {
   * "body": {},
   * "headers": {
   * "header1": "value",
   * "header2": "value"
   * }
   * }
   */
  public fun headers(headers: Boolean) {
    cdkBuilder.headers(headers)
  }

  /**
   * @param integrationResponses The response that API Gateway provides after a method's backend
   * completes processing a request.
   * API Gateway intercepts the response from the
   * backend so that you can control how API Gateway surfaces backend
   * responses. For example, you can map the backend status codes to codes
   * that you define.
   */
  public fun integrationResponses(integrationResponses: IntegrationResponseDsl.() -> Unit) {
    _integrationResponses.add(IntegrationResponseDsl().apply(integrationResponses).build())
  }

  /**
   * @param integrationResponses The response that API Gateway provides after a method's backend
   * completes processing a request.
   * API Gateway intercepts the response from the
   * backend so that you can control how API Gateway surfaces backend
   * responses. For example, you can map the backend status codes to codes
   * that you define.
   */
  public fun integrationResponses(integrationResponses: Collection<IntegrationResponse>) {
    _integrationResponses.addAll(integrationResponses)
  }

  /**
   * @param passthroughBehavior Specifies the pass-through behavior for incoming requests based on
   * the Content-Type header in the request, and the available mapping templates specified as the
   * requestTemplates property on the Integration resource.
   * There are three valid values: WHEN_NO_MATCH, WHEN_NO_TEMPLATES, and
   * NEVER.
   */
  public fun passthroughBehavior(passthroughBehavior: PassthroughBehavior) {
    cdkBuilder.passthroughBehavior(passthroughBehavior)
  }

  /**
   * @param path Check if path is to be included inside the execution input.
   * The execution input will include a new key `path`:
   *
   * {
   * "body": {},
   * "path": {
   * "resourceName": "resourceValue"
   * }
   * }
   */
  public fun path(path: Boolean) {
    cdkBuilder.path(path)
  }

  /**
   * @param querystring Check if querystring is to be included inside the execution input.
   * The execution input will include a new key `queryString`:
   *
   * {
   * "body": {},
   * "querystring": {
   * "key": "value"
   * }
   * }
   */
  public fun querystring(querystring: Boolean) {
    cdkBuilder.querystring(querystring)
  }

  /**
   * @param requestContext Which details of the incoming request must be passed onto the underlying
   * state machine, such as, account id, user identity, request id, etc.
   * The execution input will include a new key `requestContext`:
   *
   * {
   * "body": {},
   * "requestContext": {
   * "key": "value"
   * }
   * }
   */
  public fun requestContext(requestContext: RequestContextDsl.() -> Unit = {}) {
    val builder = RequestContextDsl()
    builder.apply(requestContext)
    cdkBuilder.requestContext(builder.build())
  }

  /**
   * @param requestContext Which details of the incoming request must be passed onto the underlying
   * state machine, such as, account id, user identity, request id, etc.
   * The execution input will include a new key `requestContext`:
   *
   * {
   * "body": {},
   * "requestContext": {
   * "key": "value"
   * }
   * }
   */
  public fun requestContext(requestContext: RequestContext) {
    cdkBuilder.requestContext(requestContext)
  }

  /**
   * @param requestParameters The request parameters that API Gateway sends with the backend
   * request.
   * Specify request parameters as key-value pairs (string-to-string
   * mappings), with a destination as the key and a source as the value.
   *
   * Specify the destination by using the following pattern
   * integration.request.location.name, where location is querystring, path,
   * or header, and name is a valid, unique parameter name.
   *
   * The source must be an existing method request parameter or a static
   * value. You must enclose static values in single quotation marks and
   * pre-encode these values based on their destination in the request.
   */
  public fun requestParameters(requestParameters: Map<String, String>) {
    cdkBuilder.requestParameters(requestParameters)
  }

  /**
   * @param requestTemplates A map of Apache Velocity templates that are applied on the request
   * payload.
   * The template that API Gateway uses is based on the value of the
   * Content-Type header that's sent by the client. The content type value is
   * the key, and the template is the value (specified as a string), such as
   * the following snippet:
   *
   * ```
   * { "application/json": "{ \"statusCode\": 200 }" }
   * ```
   */
  public fun requestTemplates(requestTemplates: Map<String, String>) {
    cdkBuilder.requestTemplates(requestTemplates)
  }

  /**
   * @param timeout The maximum amount of time an integration will run before it returns without a
   * response.
   * Must be between 50 milliseconds and 29 seconds.
   */
  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  /**
   * @param vpcLink The VpcLink used for the integration.
   * Required if connectionType is VPC_LINK
   */
  public fun vpcLink(vpcLink: IVpcLink) {
    cdkBuilder.vpcLink(vpcLink)
  }

  public fun build(): StepFunctionsExecutionIntegrationOptions {
    if(_cacheKeyParameters.isNotEmpty()) cdkBuilder.cacheKeyParameters(_cacheKeyParameters)
    if(_integrationResponses.isNotEmpty()) cdkBuilder.integrationResponses(_integrationResponses)
    return cdkBuilder.build()
  }
}
