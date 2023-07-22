@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.apigateway.RequestContext

/**
 * Configure what must be included in the `requestContext`.
 *
 * More details can be found at mapping templates documentation.
 *
 * Example:
 *
 * ```
 * StepFunctionsRestApi.Builder.create(this, "StepFunctionsRestApi")
 * .stateMachine(machine)
 * .headers(true)
 * .path(false)
 * .querystring(false)
 * .authorizer(false)
 * .requestContext(RequestContext.builder()
 * .caller(true)
 * .user(true)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/apigateway/latest/developerguide/api-gateway-mapping-template-reference.html)
 */
@CdkDslMarker
public class RequestContextDsl {
  private val cdkBuilder: RequestContext.Builder = RequestContext.builder()

  /**
   * @param accountId Represents the information of $context.identity.accountId.
   * Whether the AWS account of the API owner should be included in the request context
   */
  public fun accountId(accountId: Boolean) {
    cdkBuilder.accountId(accountId)
  }

  /**
   * @param apiId Represents the information of $context.apiId.
   * Whether the identifier API Gateway assigns to your API should be included in the request
   * context.
   */
  public fun apiId(apiId: Boolean) {
    cdkBuilder.apiId(apiId)
  }

  /**
   * @param apiKey Represents the information of $context.identity.apiKey.
   * Whether the API key associated with the request should be included in request context.
   */
  public fun apiKey(apiKey: Boolean) {
    cdkBuilder.apiKey(apiKey)
  }

  /**
   * @param authorizerPrincipalId Represents the information of $context.authorizer.principalId.
   * Whether the principal user identifier associated with the token sent by the client and returned
   * from an API Gateway Lambda authorizer should be included in the request context.
   */
  public fun authorizerPrincipalId(authorizerPrincipalId: Boolean) {
    cdkBuilder.authorizerPrincipalId(authorizerPrincipalId)
  }

  /**
   * @param caller Represents the information of $context.identity.caller.
   * Whether the principal identifier of the caller that signed the request should be included in
   * the request context.
   * Supported for resources that use IAM authorization.
   */
  public fun caller(caller: Boolean) {
    cdkBuilder.caller(caller)
  }

  /**
   * @param cognitoAuthenticationProvider Represents the information of
   * $context.identity.cognitoAuthenticationProvider.
   * Whether the list of the Amazon Cognito authentication providers used by the caller making the
   * request should be included in the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   */
  public fun cognitoAuthenticationProvider(cognitoAuthenticationProvider: Boolean) {
    cdkBuilder.cognitoAuthenticationProvider(cognitoAuthenticationProvider)
  }

  /**
   * @param cognitoAuthenticationType Represents the information of
   * $context.identity.cognitoAuthenticationType.
   * Whether the Amazon Cognito authentication type of the caller making the request should be
   * included in the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   * Possible values include authenticated for authenticated identities and unauthenticated for
   * unauthenticated identities.
   */
  public fun cognitoAuthenticationType(cognitoAuthenticationType: Boolean) {
    cdkBuilder.cognitoAuthenticationType(cognitoAuthenticationType)
  }

  /**
   * @param cognitoIdentityId Represents the information of $context.identity.cognitoIdentityId.
   * Whether the Amazon Cognito identity ID of the caller making the request should be included in
   * the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   */
  public fun cognitoIdentityId(cognitoIdentityId: Boolean) {
    cdkBuilder.cognitoIdentityId(cognitoIdentityId)
  }

  /**
   * @param cognitoIdentityPoolId Represents the information of
   * $context.identity.cognitoIdentityPoolId.
   * Whether the Amazon Cognito identity pool ID of the caller making the request should be included
   * in the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   */
  public fun cognitoIdentityPoolId(cognitoIdentityPoolId: Boolean) {
    cdkBuilder.cognitoIdentityPoolId(cognitoIdentityPoolId)
  }

  /**
   * @param httpMethod Represents the information of $context.httpMethod.
   * Whether the HTTP method used should be included in the request context.
   * Valid values include: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.
   */
  public fun httpMethod(httpMethod: Boolean) {
    cdkBuilder.httpMethod(httpMethod)
  }

  /**
   * @param requestId Represents the information of $context.requestId.
   * Whether the ID for the request should be included in the request context.
   */
  public fun requestId(requestId: Boolean) {
    cdkBuilder.requestId(requestId)
  }

  /**
   * @param resourceId Represents the information of $context.resourceId.
   * Whether the identifier that API Gateway assigns to your resource should be included in the
   * request context.
   */
  public fun resourceId(resourceId: Boolean) {
    cdkBuilder.resourceId(resourceId)
  }

  /**
   * @param resourcePath Represents the information of $context.resourcePath.
   * Whether the path to the resource should be included in the request context.
   */
  public fun resourcePath(resourcePath: Boolean) {
    cdkBuilder.resourcePath(resourcePath)
  }

  /**
   * @param sourceIp Represents the information of $context.identity.sourceIp.
   * Whether the source IP address of the immediate TCP connection making the request
   * to API Gateway endpoint should be included in the request context.
   */
  public fun sourceIp(sourceIp: Boolean) {
    cdkBuilder.sourceIp(sourceIp)
  }

  /**
   * @param stage Represents the information of $context.stage.
   * Whether the deployment stage of the API request should be included in the request context.
   */
  public fun stage(stage: Boolean) {
    cdkBuilder.stage(stage)
  }

  /**
   * @param user Represents the information of $context.identity.user.
   * Whether the principal identifier of the user that will be authorized should be included in the
   * request context.
   * Supported for resources that use IAM authorization.
   */
  public fun user(user: Boolean) {
    cdkBuilder.user(user)
  }

  /**
   * @param userAgent Represents the information of $context.identity.userAgent.
   * Whether the User-Agent header of the API caller should be included in the request context.
   */
  public fun userAgent(userAgent: Boolean) {
    cdkBuilder.userAgent(userAgent)
  }

  /**
   * @param userArn Represents the information of $context.identity.userArn.
   * Whether the Amazon Resource Name (ARN) of the effective user identified after authentication
   * should be included in the request context.
   */
  public fun userArn(userArn: Boolean) {
    cdkBuilder.userArn(userArn)
  }

  public fun build(): RequestContext = cdkBuilder.build()
}
