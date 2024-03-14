package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.Boolean
import kotlin.Unit

public interface RequestContext {
  public fun accountId(): Boolean? = unwrap(this).getAccountId()

  public fun apiId(): Boolean? = unwrap(this).getApiId()

  public fun apiKey(): Boolean? = unwrap(this).getApiKey()

  public fun authorizerPrincipalId(): Boolean? = unwrap(this).getAuthorizerPrincipalId()

  public fun caller(): Boolean? = unwrap(this).getCaller()

  public fun cognitoAuthenticationProvider(): Boolean? =
      unwrap(this).getCognitoAuthenticationProvider()

  public fun cognitoAuthenticationType(): Boolean? = unwrap(this).getCognitoAuthenticationType()

  public fun cognitoIdentityId(): Boolean? = unwrap(this).getCognitoIdentityId()

  public fun cognitoIdentityPoolId(): Boolean? = unwrap(this).getCognitoIdentityPoolId()

  public fun httpMethod(): Boolean? = unwrap(this).getHttpMethod()

  public fun requestId(): Boolean? = unwrap(this).getRequestId()

  public fun resourceId(): Boolean? = unwrap(this).getResourceId()

  public fun resourcePath(): Boolean? = unwrap(this).getResourcePath()

  public fun sourceIp(): Boolean? = unwrap(this).getSourceIp()

  public fun stage(): Boolean? = unwrap(this).getStage()

  public fun user(): Boolean? = unwrap(this).getUser()

  public fun userAgent(): Boolean? = unwrap(this).getUserAgent()

  public fun userArn(): Boolean? = unwrap(this).getUserArn()

  public interface Builder {
    public fun accountId(accountId: Boolean) {
    }

    public fun apiId(apiId: Boolean) {
    }

    public fun apiKey(apiKey: Boolean) {
    }

    public fun authorizerPrincipalId(authorizerPrincipalId: Boolean) {
    }

    public fun caller(caller: Boolean) {
    }

    public fun cognitoAuthenticationProvider(cognitoAuthenticationProvider: Boolean) {
    }

    public fun cognitoAuthenticationType(cognitoAuthenticationType: Boolean) {
    }

    public fun cognitoIdentityId(cognitoIdentityId: Boolean) {
    }

    public fun cognitoIdentityPoolId(cognitoIdentityPoolId: Boolean) {
    }

    public fun httpMethod(httpMethod: Boolean) {
    }

    public fun requestId(requestId: Boolean) {
    }

    public fun resourceId(resourceId: Boolean) {
    }

    public fun resourcePath(resourcePath: Boolean) {
    }

    public fun sourceIp(sourceIp: Boolean) {
    }

    public fun stage(stage: Boolean) {
    }

    public fun user(user: Boolean) {
    }

    public fun userAgent(userAgent: Boolean) {
    }

    public fun userArn(userArn: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.RequestContext.Builder =
        software.amazon.awscdk.services.apigateway.RequestContext.builder()

    public override fun accountId(accountId: Boolean) {
      cdkBuilder.accountId(accountId)
    }

    public override fun apiId(apiId: Boolean) {
      cdkBuilder.apiId(apiId)
    }

    public override fun apiKey(apiKey: Boolean) {
      cdkBuilder.apiKey(apiKey)
    }

    public override fun authorizerPrincipalId(authorizerPrincipalId: Boolean) {
      cdkBuilder.authorizerPrincipalId(authorizerPrincipalId)
    }

    public override fun caller(caller: Boolean) {
      cdkBuilder.caller(caller)
    }

    public override fun cognitoAuthenticationProvider(cognitoAuthenticationProvider: Boolean) {
      cdkBuilder.cognitoAuthenticationProvider(cognitoAuthenticationProvider)
    }

    public override fun cognitoAuthenticationType(cognitoAuthenticationType: Boolean) {
      cdkBuilder.cognitoAuthenticationType(cognitoAuthenticationType)
    }

    public override fun cognitoIdentityId(cognitoIdentityId: Boolean) {
      cdkBuilder.cognitoIdentityId(cognitoIdentityId)
    }

    public override fun cognitoIdentityPoolId(cognitoIdentityPoolId: Boolean) {
      cdkBuilder.cognitoIdentityPoolId(cognitoIdentityPoolId)
    }

    public override fun httpMethod(httpMethod: Boolean) {
      cdkBuilder.httpMethod(httpMethod)
    }

    public override fun requestId(requestId: Boolean) {
      cdkBuilder.requestId(requestId)
    }

    public override fun resourceId(resourceId: Boolean) {
      cdkBuilder.resourceId(resourceId)
    }

    public override fun resourcePath(resourcePath: Boolean) {
      cdkBuilder.resourcePath(resourcePath)
    }

    public override fun sourceIp(sourceIp: Boolean) {
      cdkBuilder.sourceIp(sourceIp)
    }

    public override fun stage(stage: Boolean) {
      cdkBuilder.stage(stage)
    }

    public override fun user(user: Boolean) {
      cdkBuilder.user(user)
    }

    public override fun userAgent(userAgent: Boolean) {
      cdkBuilder.userAgent(userAgent)
    }

    public override fun userArn(userArn: Boolean) {
      cdkBuilder.userArn(userArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.RequestContext =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.RequestContext,
  ) : RequestContext {
    public override fun accountId(): Boolean? = unwrap(this).getAccountId()

    public override fun apiId(): Boolean? = unwrap(this).getApiId()

    public override fun apiKey(): Boolean? = unwrap(this).getApiKey()

    public override fun authorizerPrincipalId(): Boolean? = unwrap(this).getAuthorizerPrincipalId()

    public override fun caller(): Boolean? = unwrap(this).getCaller()

    public override fun cognitoAuthenticationProvider(): Boolean? =
        unwrap(this).getCognitoAuthenticationProvider()

    public override fun cognitoAuthenticationType(): Boolean? =
        unwrap(this).getCognitoAuthenticationType()

    public override fun cognitoIdentityId(): Boolean? = unwrap(this).getCognitoIdentityId()

    public override fun cognitoIdentityPoolId(): Boolean? = unwrap(this).getCognitoIdentityPoolId()

    public override fun httpMethod(): Boolean? = unwrap(this).getHttpMethod()

    public override fun requestId(): Boolean? = unwrap(this).getRequestId()

    public override fun resourceId(): Boolean? = unwrap(this).getResourceId()

    public override fun resourcePath(): Boolean? = unwrap(this).getResourcePath()

    public override fun sourceIp(): Boolean? = unwrap(this).getSourceIp()

    public override fun stage(): Boolean? = unwrap(this).getStage()

    public override fun user(): Boolean? = unwrap(this).getUser()

    public override fun userAgent(): Boolean? = unwrap(this).getUserAgent()

    public override fun userArn(): Boolean? = unwrap(this).getUserArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RequestContext {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.RequestContext):
        RequestContext = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RequestContext):
        software.amazon.awscdk.services.apigateway.RequestContext = (wrapped as Wrapper).cdkObject
  }
}
