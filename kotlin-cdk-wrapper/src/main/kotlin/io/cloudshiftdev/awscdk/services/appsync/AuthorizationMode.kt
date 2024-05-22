@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Interface to specify default or additional authorization(s).
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * GraphqlApi api = GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile("schema.graphql"))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder().authorizationType(AuthorizationType.IAM).build())
 * .build())
 * .build();
 * Rule rule = Rule.Builder.create(this, "Rule")
 * .schedule(Schedule.rate(Duration.hours(1)))
 * .build();
 * rule.addTarget(AppSync.Builder.create(api)
 * .graphQLOperation("mutation Publish($message: String!){ publish(message: $message) { message }
 * }")
 * .variables(RuleTargetInput.fromObject(Map.of(
 * "message", "hello world")))
 * .build());
 * ```
 */
public interface AuthorizationMode {
  /**
   * If authorizationType is `AuthorizationType.API_KEY`, this option can be configured.
   *
   * Default: - name: 'DefaultAPIKey' | description: 'Default API Key created by CDK'
   */
  public fun apiKeyConfig(): ApiKeyConfig? = unwrap(this).getApiKeyConfig()?.let(ApiKeyConfig::wrap)

  /**
   * One of possible four values AppSync supports.
   *
   * Default: - `AuthorizationType.API_KEY`
   *
   * [Documentation](https://docs.aws.amazon.com/appsync/latest/devguide/security.html)
   */
  public fun authorizationType(): AuthorizationType

  /**
   * If authorizationType is `AuthorizationType.LAMBDA`, this option is required.
   *
   * Default: - none
   */
  public fun lambdaAuthorizerConfig(): LambdaAuthorizerConfig? =
      unwrap(this).getLambdaAuthorizerConfig()?.let(LambdaAuthorizerConfig::wrap)

  /**
   * If authorizationType is `AuthorizationType.OIDC`, this option is required.
   *
   * Default: - none
   */
  public fun openIdConnectConfig(): OpenIdConnectConfig? =
      unwrap(this).getOpenIdConnectConfig()?.let(OpenIdConnectConfig::wrap)

  /**
   * If authorizationType is `AuthorizationType.USER_POOL`, this option is required.
   *
   * Default: - none
   */
  public fun userPoolConfig(): UserPoolConfig? =
      unwrap(this).getUserPoolConfig()?.let(UserPoolConfig::wrap)

  /**
   * A builder for [AuthorizationMode]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig)

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4371ceabb7f0a9b5a4574b725b014db5966e68a83b9be4fd7ccc7d083a72b043")
    public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig.Builder.() -> Unit)

    /**
     * @param authorizationType One of possible four values AppSync supports. 
     */
    public fun authorizationType(authorizationType: AuthorizationType)

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig)

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b3f1011e4f408d221b274e884d75957bcb637cbf2e641c78b9e460eb420818")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig.Builder.() -> Unit)

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig)

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733f52ec080536587ecfd6470ab668c6665e4b24245a35ae375d57b1c8f713c1")
    public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig.Builder.() -> Unit)

    /**
     * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    public fun userPoolConfig(userPoolConfig: UserPoolConfig)

    /**
     * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("884d21b096950310300302627079903d44541f4aa77bc05904629f48354593b6")
    public fun userPoolConfig(userPoolConfig: UserPoolConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AuthorizationMode.Builder =
        software.amazon.awscdk.services.appsync.AuthorizationMode.builder()

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    override fun apiKeyConfig(apiKeyConfig: ApiKeyConfig) {
      cdkBuilder.apiKeyConfig(apiKeyConfig.let(ApiKeyConfig.Companion::unwrap))
    }

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4371ceabb7f0a9b5a4574b725b014db5966e68a83b9be4fd7ccc7d083a72b043")
    override fun apiKeyConfig(apiKeyConfig: ApiKeyConfig.Builder.() -> Unit): Unit =
        apiKeyConfig(ApiKeyConfig(apiKeyConfig))

    /**
     * @param authorizationType One of possible four values AppSync supports. 
     */
    override fun authorizationType(authorizationType: AuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AuthorizationType.Companion::unwrap))
    }

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(LambdaAuthorizerConfig.Companion::unwrap))
    }

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("67b3f1011e4f408d221b274e884d75957bcb637cbf2e641c78b9e460eb420818")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig.Builder.() -> Unit):
        Unit = lambdaAuthorizerConfig(LambdaAuthorizerConfig(lambdaAuthorizerConfig))

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    override fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(OpenIdConnectConfig.Companion::unwrap))
    }

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("733f52ec080536587ecfd6470ab668c6665e4b24245a35ae375d57b1c8f713c1")
    override fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig.Builder.() -> Unit):
        Unit = openIdConnectConfig(OpenIdConnectConfig(openIdConnectConfig))

    /**
     * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    override fun userPoolConfig(userPoolConfig: UserPoolConfig) {
      cdkBuilder.userPoolConfig(userPoolConfig.let(UserPoolConfig.Companion::unwrap))
    }

    /**
     * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("884d21b096950310300302627079903d44541f4aa77bc05904629f48354593b6")
    override fun userPoolConfig(userPoolConfig: UserPoolConfig.Builder.() -> Unit): Unit =
        userPoolConfig(UserPoolConfig(userPoolConfig))

    public fun build(): software.amazon.awscdk.services.appsync.AuthorizationMode =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AuthorizationMode,
  ) : CdkObject(cdkObject), AuthorizationMode {
    /**
     * If authorizationType is `AuthorizationType.API_KEY`, this option can be configured.
     *
     * Default: - name: 'DefaultAPIKey' | description: 'Default API Key created by CDK'
     */
    override fun apiKeyConfig(): ApiKeyConfig? =
        unwrap(this).getApiKeyConfig()?.let(ApiKeyConfig::wrap)

    /**
     * One of possible four values AppSync supports.
     *
     * Default: - `AuthorizationType.API_KEY`
     *
     * [Documentation](https://docs.aws.amazon.com/appsync/latest/devguide/security.html)
     */
    override fun authorizationType(): AuthorizationType =
        unwrap(this).getAuthorizationType().let(AuthorizationType::wrap)

    /**
     * If authorizationType is `AuthorizationType.LAMBDA`, this option is required.
     *
     * Default: - none
     */
    override fun lambdaAuthorizerConfig(): LambdaAuthorizerConfig? =
        unwrap(this).getLambdaAuthorizerConfig()?.let(LambdaAuthorizerConfig::wrap)

    /**
     * If authorizationType is `AuthorizationType.OIDC`, this option is required.
     *
     * Default: - none
     */
    override fun openIdConnectConfig(): OpenIdConnectConfig? =
        unwrap(this).getOpenIdConnectConfig()?.let(OpenIdConnectConfig::wrap)

    /**
     * If authorizationType is `AuthorizationType.USER_POOL`, this option is required.
     *
     * Default: - none
     */
    override fun userPoolConfig(): UserPoolConfig? =
        unwrap(this).getUserPoolConfig()?.let(UserPoolConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationMode {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AuthorizationMode):
        AuthorizationMode = CdkObjectWrappers.wrap(cdkObject) as? AuthorizationMode ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationMode):
        software.amazon.awscdk.services.appsync.AuthorizationMode = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.appsync.AuthorizationMode
  }
}
