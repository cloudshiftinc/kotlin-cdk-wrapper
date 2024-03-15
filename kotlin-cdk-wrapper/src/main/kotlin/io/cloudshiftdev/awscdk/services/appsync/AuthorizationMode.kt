@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AuthorizationMode {
  public fun apiKeyConfig(): ApiKeyConfig? = unwrap(this).getApiKeyConfig()?.let(ApiKeyConfig::wrap)

  public fun authorizationType(): AuthorizationType

  public fun lambdaAuthorizerConfig(): LambdaAuthorizerConfig? =
      unwrap(this).getLambdaAuthorizerConfig()?.let(LambdaAuthorizerConfig::wrap)

  public fun openIdConnectConfig(): OpenIdConnectConfig? =
      unwrap(this).getOpenIdConnectConfig()?.let(OpenIdConnectConfig::wrap)

  public fun userPoolConfig(): UserPoolConfig? =
      unwrap(this).getUserPoolConfig()?.let(UserPoolConfig::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4371ceabb7f0a9b5a4574b725b014db5966e68a83b9be4fd7ccc7d083a72b043")
    public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig.Builder.() -> Unit)

    public fun authorizationType(authorizationType: AuthorizationType)

    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b3f1011e4f408d221b274e884d75957bcb637cbf2e641c78b9e460eb420818")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig.Builder.() -> Unit)

    public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733f52ec080536587ecfd6470ab668c6665e4b24245a35ae375d57b1c8f713c1")
    public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig.Builder.() -> Unit)

    public fun userPoolConfig(userPoolConfig: UserPoolConfig)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("884d21b096950310300302627079903d44541f4aa77bc05904629f48354593b6")
    public fun userPoolConfig(userPoolConfig: UserPoolConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AuthorizationMode.Builder =
        software.amazon.awscdk.services.appsync.AuthorizationMode.builder()

    override fun apiKeyConfig(apiKeyConfig: ApiKeyConfig) {
      cdkBuilder.apiKeyConfig(apiKeyConfig.let(ApiKeyConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4371ceabb7f0a9b5a4574b725b014db5966e68a83b9be4fd7ccc7d083a72b043")
    override fun apiKeyConfig(apiKeyConfig: ApiKeyConfig.Builder.() -> Unit): Unit =
        apiKeyConfig(ApiKeyConfig(apiKeyConfig))

    override fun authorizationType(authorizationType: AuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AuthorizationType::unwrap))
    }

    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(LambdaAuthorizerConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b3f1011e4f408d221b274e884d75957bcb637cbf2e641c78b9e460eb420818")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig.Builder.() -> Unit):
        Unit = lambdaAuthorizerConfig(LambdaAuthorizerConfig(lambdaAuthorizerConfig))

    override fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(OpenIdConnectConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733f52ec080536587ecfd6470ab668c6665e4b24245a35ae375d57b1c8f713c1")
    override fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig.Builder.() -> Unit):
        Unit = openIdConnectConfig(OpenIdConnectConfig(openIdConnectConfig))

    override fun userPoolConfig(userPoolConfig: UserPoolConfig) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(UserPoolConfig::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("884d21b096950310300302627079903d44541f4aa77bc05904629f48354593b6")
    override fun userPoolConfig(userPoolConfig: UserPoolConfig.Builder.() -> Unit): Unit =
        userPoolConfig(UserPoolConfig(userPoolConfig))

    public fun build(): software.amazon.awscdk.services.appsync.AuthorizationMode =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.AuthorizationMode,
  ) : CdkObject(cdkObject), AuthorizationMode {
    override fun apiKeyConfig(): ApiKeyConfig? =
        unwrap(this).getApiKeyConfig()?.let(ApiKeyConfig::wrap)

    override fun authorizationType(): AuthorizationType =
        unwrap(this).getAuthorizationType().let(AuthorizationType::wrap)

    override fun lambdaAuthorizerConfig(): LambdaAuthorizerConfig? =
        unwrap(this).getLambdaAuthorizerConfig()?.let(LambdaAuthorizerConfig::wrap)

    override fun openIdConnectConfig(): OpenIdConnectConfig? =
        unwrap(this).getOpenIdConnectConfig()?.let(OpenIdConnectConfig::wrap)

    override fun userPoolConfig(): UserPoolConfig? =
        unwrap(this).getUserPoolConfig()?.let(UserPoolConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationMode {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AuthorizationMode):
        AuthorizationMode = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationMode):
        software.amazon.awscdk.services.appsync.AuthorizationMode = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.AuthorizationMode
  }
}
