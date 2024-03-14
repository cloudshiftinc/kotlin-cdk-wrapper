package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface RequestContext {
  /**
   * Represents the information of $context.identity.accountId.
   *
   * Whether the AWS account of the API owner should be included in the request context
   *
   * Default: false
   */
  public fun accountId(): Boolean? = unwrap(this).getAccountId()

  /**
   * Represents the information of $context.apiId.
   *
   * Whether the identifier API Gateway assigns to your API should be included in the request
   * context.
   *
   * Default: false
   */
  public fun apiId(): Boolean? = unwrap(this).getApiId()

  /**
   * Represents the information of $context.identity.apiKey.
   *
   * Whether the API key associated with the request should be included in request context.
   *
   * Default: false
   */
  public fun apiKey(): Boolean? = unwrap(this).getApiKey()

  /**
   * Represents the information of $context.authorizer.principalId.
   *
   * Whether the principal user identifier associated with the token sent by the client and returned
   * from an API Gateway Lambda authorizer should be included in the request context.
   *
   * Default: false
   */
  public fun authorizerPrincipalId(): Boolean? = unwrap(this).getAuthorizerPrincipalId()

  /**
   * Represents the information of $context.identity.caller.
   *
   * Whether the principal identifier of the caller that signed the request should be included in
   * the request context.
   * Supported for resources that use IAM authorization.
   *
   * Default: false
   */
  public fun caller(): Boolean? = unwrap(this).getCaller()

  /**
   * Represents the information of $context.identity.cognitoAuthenticationProvider.
   *
   * Whether the list of the Amazon Cognito authentication providers used by the caller making the
   * request should be included in the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   *
   * Default: false
   */
  public fun cognitoAuthenticationProvider(): Boolean? =
      unwrap(this).getCognitoAuthenticationProvider()

  /**
   * Represents the information of $context.identity.cognitoAuthenticationType.
   *
   * Whether the Amazon Cognito authentication type of the caller making the request should be
   * included in the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   * Possible values include authenticated for authenticated identities and unauthenticated for
   * unauthenticated identities.
   *
   * Default: false
   */
  public fun cognitoAuthenticationType(): Boolean? = unwrap(this).getCognitoAuthenticationType()

  /**
   * Represents the information of $context.identity.cognitoIdentityId.
   *
   * Whether the Amazon Cognito identity ID of the caller making the request should be included in
   * the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   *
   * Default: false
   */
  public fun cognitoIdentityId(): Boolean? = unwrap(this).getCognitoIdentityId()

  /**
   * Represents the information of $context.identity.cognitoIdentityPoolId.
   *
   * Whether the Amazon Cognito identity pool ID of the caller making the request should be included
   * in the request context.
   * Available only if the request was signed with Amazon Cognito credentials.
   *
   * Default: false
   */
  public fun cognitoIdentityPoolId(): Boolean? = unwrap(this).getCognitoIdentityPoolId()

  /**
   * Represents the information of $context.httpMethod.
   *
   * Whether the HTTP method used should be included in the request context.
   * Valid values include: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.
   *
   * Default: false
   */
  public fun httpMethod(): Boolean? = unwrap(this).getHttpMethod()

  /**
   * Represents the information of $context.requestId.
   *
   * Whether the ID for the request should be included in the request context.
   *
   * Default: false
   */
  public fun requestId(): Boolean? = unwrap(this).getRequestId()

  /**
   * Represents the information of $context.resourceId.
   *
   * Whether the identifier that API Gateway assigns to your resource should be included in the
   * request context.
   *
   * Default: false
   */
  public fun resourceId(): Boolean? = unwrap(this).getResourceId()

  /**
   * Represents the information of $context.resourcePath.
   *
   * Whether the path to the resource should be included in the request context.
   *
   * Default: false
   */
  public fun resourcePath(): Boolean? = unwrap(this).getResourcePath()

  /**
   * Represents the information of $context.identity.sourceIp.
   *
   * Whether the source IP address of the immediate TCP connection making the request
   * to API Gateway endpoint should be included in the request context.
   *
   * Default: false
   */
  public fun sourceIp(): Boolean? = unwrap(this).getSourceIp()

  /**
   * Represents the information of $context.stage.
   *
   * Whether the deployment stage of the API request should be included in the request context.
   *
   * Default: false
   */
  public fun stage(): Boolean? = unwrap(this).getStage()

  /**
   * Represents the information of $context.identity.user.
   *
   * Whether the principal identifier of the user that will be authorized should be included in the
   * request context.
   * Supported for resources that use IAM authorization.
   *
   * Default: false
   */
  public fun user(): Boolean? = unwrap(this).getUser()

  /**
   * Represents the information of $context.identity.userAgent.
   *
   * Whether the User-Agent header of the API caller should be included in the request context.
   *
   * Default: false
   */
  public fun userAgent(): Boolean? = unwrap(this).getUserAgent()

  /**
   * Represents the information of $context.identity.userArn.
   *
   * Whether the Amazon Resource Name (ARN) of the effective user identified after authentication
   * should be included in the request context.
   *
   * Default: false
   */
  public fun userArn(): Boolean? = unwrap(this).getUserArn()

  /**
   * A builder for [RequestContext]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accountId Represents the information of $context.identity.accountId.
     * Whether the AWS account of the API owner should be included in the request context
     */
    public fun accountId(accountId: Boolean)

    /**
     * @param apiId Represents the information of $context.apiId.
     * Whether the identifier API Gateway assigns to your API should be included in the request
     * context.
     */
    public fun apiId(apiId: Boolean)

    /**
     * @param apiKey Represents the information of $context.identity.apiKey.
     * Whether the API key associated with the request should be included in request context.
     */
    public fun apiKey(apiKey: Boolean)

    /**
     * @param authorizerPrincipalId Represents the information of $context.authorizer.principalId.
     * Whether the principal user identifier associated with the token sent by the client and
     * returned
     * from an API Gateway Lambda authorizer should be included in the request context.
     */
    public fun authorizerPrincipalId(authorizerPrincipalId: Boolean)

    /**
     * @param caller Represents the information of $context.identity.caller.
     * Whether the principal identifier of the caller that signed the request should be included in
     * the request context.
     * Supported for resources that use IAM authorization.
     */
    public fun caller(caller: Boolean)

    /**
     * @param cognitoAuthenticationProvider Represents the information of
     * $context.identity.cognitoAuthenticationProvider.
     * Whether the list of the Amazon Cognito authentication providers used by the caller making the
     * request should be included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     */
    public fun cognitoAuthenticationProvider(cognitoAuthenticationProvider: Boolean)

    /**
     * @param cognitoAuthenticationType Represents the information of
     * $context.identity.cognitoAuthenticationType.
     * Whether the Amazon Cognito authentication type of the caller making the request should be
     * included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     * Possible values include authenticated for authenticated identities and unauthenticated for
     * unauthenticated identities.
     */
    public fun cognitoAuthenticationType(cognitoAuthenticationType: Boolean)

    /**
     * @param cognitoIdentityId Represents the information of $context.identity.cognitoIdentityId.
     * Whether the Amazon Cognito identity ID of the caller making the request should be included in
     * the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     */
    public fun cognitoIdentityId(cognitoIdentityId: Boolean)

    /**
     * @param cognitoIdentityPoolId Represents the information of
     * $context.identity.cognitoIdentityPoolId.
     * Whether the Amazon Cognito identity pool ID of the caller making the request should be
     * included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     */
    public fun cognitoIdentityPoolId(cognitoIdentityPoolId: Boolean)

    /**
     * @param httpMethod Represents the information of $context.httpMethod.
     * Whether the HTTP method used should be included in the request context.
     * Valid values include: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.
     */
    public fun httpMethod(httpMethod: Boolean)

    /**
     * @param requestId Represents the information of $context.requestId.
     * Whether the ID for the request should be included in the request context.
     */
    public fun requestId(requestId: Boolean)

    /**
     * @param resourceId Represents the information of $context.resourceId.
     * Whether the identifier that API Gateway assigns to your resource should be included in the
     * request context.
     */
    public fun resourceId(resourceId: Boolean)

    /**
     * @param resourcePath Represents the information of $context.resourcePath.
     * Whether the path to the resource should be included in the request context.
     */
    public fun resourcePath(resourcePath: Boolean)

    /**
     * @param sourceIp Represents the information of $context.identity.sourceIp.
     * Whether the source IP address of the immediate TCP connection making the request
     * to API Gateway endpoint should be included in the request context.
     */
    public fun sourceIp(sourceIp: Boolean)

    /**
     * @param stage Represents the information of $context.stage.
     * Whether the deployment stage of the API request should be included in the request context.
     */
    public fun stage(stage: Boolean)

    /**
     * @param user Represents the information of $context.identity.user.
     * Whether the principal identifier of the user that will be authorized should be included in
     * the request context.
     * Supported for resources that use IAM authorization.
     */
    public fun user(user: Boolean)

    /**
     * @param userAgent Represents the information of $context.identity.userAgent.
     * Whether the User-Agent header of the API caller should be included in the request context.
     */
    public fun userAgent(userAgent: Boolean)

    /**
     * @param userArn Represents the information of $context.identity.userArn.
     * Whether the Amazon Resource Name (ARN) of the effective user identified after authentication
     * should be included in the request context.
     */
    public fun userArn(userArn: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestContext.Builder =
        software.amazon.awscdk.services.apigateway.RequestContext.builder()

    /**
     * @param accountId Represents the information of $context.identity.accountId.
     * Whether the AWS account of the API owner should be included in the request context
     */
    override fun accountId(accountId: Boolean) {
      cdkBuilder.accountId(accountId)
    }

    /**
     * @param apiId Represents the information of $context.apiId.
     * Whether the identifier API Gateway assigns to your API should be included in the request
     * context.
     */
    override fun apiId(apiId: Boolean) {
      cdkBuilder.apiId(apiId)
    }

    /**
     * @param apiKey Represents the information of $context.identity.apiKey.
     * Whether the API key associated with the request should be included in request context.
     */
    override fun apiKey(apiKey: Boolean) {
      cdkBuilder.apiKey(apiKey)
    }

    /**
     * @param authorizerPrincipalId Represents the information of $context.authorizer.principalId.
     * Whether the principal user identifier associated with the token sent by the client and
     * returned
     * from an API Gateway Lambda authorizer should be included in the request context.
     */
    override fun authorizerPrincipalId(authorizerPrincipalId: Boolean) {
      cdkBuilder.authorizerPrincipalId(authorizerPrincipalId)
    }

    /**
     * @param caller Represents the information of $context.identity.caller.
     * Whether the principal identifier of the caller that signed the request should be included in
     * the request context.
     * Supported for resources that use IAM authorization.
     */
    override fun caller(caller: Boolean) {
      cdkBuilder.caller(caller)
    }

    /**
     * @param cognitoAuthenticationProvider Represents the information of
     * $context.identity.cognitoAuthenticationProvider.
     * Whether the list of the Amazon Cognito authentication providers used by the caller making the
     * request should be included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     */
    override fun cognitoAuthenticationProvider(cognitoAuthenticationProvider: Boolean) {
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
    override fun cognitoAuthenticationType(cognitoAuthenticationType: Boolean) {
      cdkBuilder.cognitoAuthenticationType(cognitoAuthenticationType)
    }

    /**
     * @param cognitoIdentityId Represents the information of $context.identity.cognitoIdentityId.
     * Whether the Amazon Cognito identity ID of the caller making the request should be included in
     * the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     */
    override fun cognitoIdentityId(cognitoIdentityId: Boolean) {
      cdkBuilder.cognitoIdentityId(cognitoIdentityId)
    }

    /**
     * @param cognitoIdentityPoolId Represents the information of
     * $context.identity.cognitoIdentityPoolId.
     * Whether the Amazon Cognito identity pool ID of the caller making the request should be
     * included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     */
    override fun cognitoIdentityPoolId(cognitoIdentityPoolId: Boolean) {
      cdkBuilder.cognitoIdentityPoolId(cognitoIdentityPoolId)
    }

    /**
     * @param httpMethod Represents the information of $context.httpMethod.
     * Whether the HTTP method used should be included in the request context.
     * Valid values include: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.
     */
    override fun httpMethod(httpMethod: Boolean) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param requestId Represents the information of $context.requestId.
     * Whether the ID for the request should be included in the request context.
     */
    override fun requestId(requestId: Boolean) {
      cdkBuilder.requestId(requestId)
    }

    /**
     * @param resourceId Represents the information of $context.resourceId.
     * Whether the identifier that API Gateway assigns to your resource should be included in the
     * request context.
     */
    override fun resourceId(resourceId: Boolean) {
      cdkBuilder.resourceId(resourceId)
    }

    /**
     * @param resourcePath Represents the information of $context.resourcePath.
     * Whether the path to the resource should be included in the request context.
     */
    override fun resourcePath(resourcePath: Boolean) {
      cdkBuilder.resourcePath(resourcePath)
    }

    /**
     * @param sourceIp Represents the information of $context.identity.sourceIp.
     * Whether the source IP address of the immediate TCP connection making the request
     * to API Gateway endpoint should be included in the request context.
     */
    override fun sourceIp(sourceIp: Boolean) {
      cdkBuilder.sourceIp(sourceIp)
    }

    /**
     * @param stage Represents the information of $context.stage.
     * Whether the deployment stage of the API request should be included in the request context.
     */
    override fun stage(stage: Boolean) {
      cdkBuilder.stage(stage)
    }

    /**
     * @param user Represents the information of $context.identity.user.
     * Whether the principal identifier of the user that will be authorized should be included in
     * the request context.
     * Supported for resources that use IAM authorization.
     */
    override fun user(user: Boolean) {
      cdkBuilder.user(user)
    }

    /**
     * @param userAgent Represents the information of $context.identity.userAgent.
     * Whether the User-Agent header of the API caller should be included in the request context.
     */
    override fun userAgent(userAgent: Boolean) {
      cdkBuilder.userAgent(userAgent)
    }

    /**
     * @param userArn Represents the information of $context.identity.userArn.
     * Whether the Amazon Resource Name (ARN) of the effective user identified after authentication
     * should be included in the request context.
     */
    override fun userArn(userArn: Boolean) {
      cdkBuilder.userArn(userArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestContext =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.RequestContext,
  ) : CdkObject(cdkObject), RequestContext {
    /**
     * Represents the information of $context.identity.accountId.
     *
     * Whether the AWS account of the API owner should be included in the request context
     *
     * Default: false
     */
    override fun accountId(): Boolean? = unwrap(this).getAccountId()

    /**
     * Represents the information of $context.apiId.
     *
     * Whether the identifier API Gateway assigns to your API should be included in the request
     * context.
     *
     * Default: false
     */
    override fun apiId(): Boolean? = unwrap(this).getApiId()

    /**
     * Represents the information of $context.identity.apiKey.
     *
     * Whether the API key associated with the request should be included in request context.
     *
     * Default: false
     */
    override fun apiKey(): Boolean? = unwrap(this).getApiKey()

    /**
     * Represents the information of $context.authorizer.principalId.
     *
     * Whether the principal user identifier associated with the token sent by the client and
     * returned
     * from an API Gateway Lambda authorizer should be included in the request context.
     *
     * Default: false
     */
    override fun authorizerPrincipalId(): Boolean? = unwrap(this).getAuthorizerPrincipalId()

    /**
     * Represents the information of $context.identity.caller.
     *
     * Whether the principal identifier of the caller that signed the request should be included in
     * the request context.
     * Supported for resources that use IAM authorization.
     *
     * Default: false
     */
    override fun caller(): Boolean? = unwrap(this).getCaller()

    /**
     * Represents the information of $context.identity.cognitoAuthenticationProvider.
     *
     * Whether the list of the Amazon Cognito authentication providers used by the caller making the
     * request should be included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     *
     * Default: false
     */
    override fun cognitoAuthenticationProvider(): Boolean? =
        unwrap(this).getCognitoAuthenticationProvider()

    /**
     * Represents the information of $context.identity.cognitoAuthenticationType.
     *
     * Whether the Amazon Cognito authentication type of the caller making the request should be
     * included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     * Possible values include authenticated for authenticated identities and unauthenticated for
     * unauthenticated identities.
     *
     * Default: false
     */
    override fun cognitoAuthenticationType(): Boolean? = unwrap(this).getCognitoAuthenticationType()

    /**
     * Represents the information of $context.identity.cognitoIdentityId.
     *
     * Whether the Amazon Cognito identity ID of the caller making the request should be included in
     * the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     *
     * Default: false
     */
    override fun cognitoIdentityId(): Boolean? = unwrap(this).getCognitoIdentityId()

    /**
     * Represents the information of $context.identity.cognitoIdentityPoolId.
     *
     * Whether the Amazon Cognito identity pool ID of the caller making the request should be
     * included in the request context.
     * Available only if the request was signed with Amazon Cognito credentials.
     *
     * Default: false
     */
    override fun cognitoIdentityPoolId(): Boolean? = unwrap(this).getCognitoIdentityPoolId()

    /**
     * Represents the information of $context.httpMethod.
     *
     * Whether the HTTP method used should be included in the request context.
     * Valid values include: DELETE, GET, HEAD, OPTIONS, PATCH, POST, and PUT.
     *
     * Default: false
     */
    override fun httpMethod(): Boolean? = unwrap(this).getHttpMethod()

    /**
     * Represents the information of $context.requestId.
     *
     * Whether the ID for the request should be included in the request context.
     *
     * Default: false
     */
    override fun requestId(): Boolean? = unwrap(this).getRequestId()

    /**
     * Represents the information of $context.resourceId.
     *
     * Whether the identifier that API Gateway assigns to your resource should be included in the
     * request context.
     *
     * Default: false
     */
    override fun resourceId(): Boolean? = unwrap(this).getResourceId()

    /**
     * Represents the information of $context.resourcePath.
     *
     * Whether the path to the resource should be included in the request context.
     *
     * Default: false
     */
    override fun resourcePath(): Boolean? = unwrap(this).getResourcePath()

    /**
     * Represents the information of $context.identity.sourceIp.
     *
     * Whether the source IP address of the immediate TCP connection making the request
     * to API Gateway endpoint should be included in the request context.
     *
     * Default: false
     */
    override fun sourceIp(): Boolean? = unwrap(this).getSourceIp()

    /**
     * Represents the information of $context.stage.
     *
     * Whether the deployment stage of the API request should be included in the request context.
     *
     * Default: false
     */
    override fun stage(): Boolean? = unwrap(this).getStage()

    /**
     * Represents the information of $context.identity.user.
     *
     * Whether the principal identifier of the user that will be authorized should be included in
     * the request context.
     * Supported for resources that use IAM authorization.
     *
     * Default: false
     */
    override fun user(): Boolean? = unwrap(this).getUser()

    /**
     * Represents the information of $context.identity.userAgent.
     *
     * Whether the User-Agent header of the API caller should be included in the request context.
     *
     * Default: false
     */
    override fun userAgent(): Boolean? = unwrap(this).getUserAgent()

    /**
     * Represents the information of $context.identity.userArn.
     *
     * Whether the Amazon Resource Name (ARN) of the effective user identified after authentication
     * should be included in the request context.
     *
     * Default: false
     */
    override fun userArn(): Boolean? = unwrap(this).getUserArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): RequestContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestContext):
        RequestContext = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestContext):
        software.amazon.awscdk.services.apigateway.RequestContext = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.RequestContext
  }
}
