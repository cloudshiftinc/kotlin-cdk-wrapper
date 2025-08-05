@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Auth provider settings for AppSync Event APIs.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.logs.*;
 * AppSyncAuthProvider apiKeyProvider = AppSyncAuthProvider.builder()
 * .authorizationType(AppSyncAuthorizationType.API_KEY)
 * .build();
 * EventApi api = EventApi.Builder.create(this, "api")
 * .apiName("Api")
 * .ownerContact("OwnerContact")
 * .authorizationConfig(EventApiAuthConfig.builder()
 * .authProviders(List.of(apiKeyProvider))
 * .connectionAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .defaultPublishAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .defaultSubscribeAuthModeTypes(List.of(AppSyncAuthorizationType.API_KEY))
 * .build())
 * .logConfig(AppSyncLogConfig.builder()
 * .fieldLogLevel(AppSyncFieldLogLevel.INFO)
 * .retention(RetentionDays.ONE_WEEK)
 * .build())
 * .build();
 * api.addChannelNamespace("default");
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/appsync/latest/eventapi/configure-event-api-auth.html)
 */
public interface AppSyncAuthProvider {
  /**
   * If authorizationType is `AuthorizationType.API_KEY`, this option can be configured.
   *
   * Default: - name: 'DefaultAPIKey'
   */
  public fun apiKeyConfig(): AppSyncApiKeyConfig? =
      unwrap(this).getApiKeyConfig()?.let(AppSyncApiKeyConfig::wrap)

  /**
   * One of possible authorization types AppSync supports.
   *
   * Default: - `AuthorizationType.API_KEY`
   */
  public fun authorizationType(): AppSyncAuthorizationType

  /**
   * If authorizationType is `AuthorizationType.USER_POOL`, this option is required.
   *
   * Default: - none
   */
  public fun cognitoConfig(): AppSyncCognitoConfig? =
      unwrap(this).getCognitoConfig()?.let(AppSyncCognitoConfig::wrap)

  /**
   * If authorizationType is `AuthorizationType.LAMBDA`, this option is required.
   *
   * Default: - none
   */
  public fun lambdaAuthorizerConfig(): AppSyncLambdaAuthorizerConfig? =
      unwrap(this).getLambdaAuthorizerConfig()?.let(AppSyncLambdaAuthorizerConfig::wrap)

  /**
   * If authorizationType is `AuthorizationType.OIDC`, this option is required.
   *
   * Default: - none
   */
  public fun openIdConnectConfig(): AppSyncOpenIdConnectConfig? =
      unwrap(this).getOpenIdConnectConfig()?.let(AppSyncOpenIdConnectConfig::wrap)

  /**
   * A builder for [AppSyncAuthProvider]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    public fun apiKeyConfig(apiKeyConfig: AppSyncApiKeyConfig)

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daf7e508e7dd27a7ea991c512bd6e0412dbb747668a91afe4e5791bc37e604eb")
    public fun apiKeyConfig(apiKeyConfig: AppSyncApiKeyConfig.Builder.() -> Unit)

    /**
     * @param authorizationType One of possible authorization types AppSync supports. 
     */
    public fun authorizationType(authorizationType: AppSyncAuthorizationType)

    /**
     * @param cognitoConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    public fun cognitoConfig(cognitoConfig: AppSyncCognitoConfig)

    /**
     * @param cognitoConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9967721d8f296894289a34fbcc5635298f56434cc094ffae0703f014447aa5f9")
    public fun cognitoConfig(cognitoConfig: AppSyncCognitoConfig.Builder.() -> Unit)

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: AppSyncLambdaAuthorizerConfig)

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7738782272a4776780421859b9349e067da3ed9e08f770917997a8807eb7976")
    public
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: AppSyncLambdaAuthorizerConfig.Builder.() -> Unit)

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    public fun openIdConnectConfig(openIdConnectConfig: AppSyncOpenIdConnectConfig)

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e4bef6b5c575e4a2d1d0dd4c1a2fce432324f054dffe59c83cc86168f79e53c")
    public
        fun openIdConnectConfig(openIdConnectConfig: AppSyncOpenIdConnectConfig.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncAuthProvider.Builder =
        software.amazon.awscdk.services.appsync.AppSyncAuthProvider.builder()

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    override fun apiKeyConfig(apiKeyConfig: AppSyncApiKeyConfig) {
      cdkBuilder.apiKeyConfig(apiKeyConfig.let(AppSyncApiKeyConfig.Companion::unwrap))
    }

    /**
     * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
     * configured.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("daf7e508e7dd27a7ea991c512bd6e0412dbb747668a91afe4e5791bc37e604eb")
    override fun apiKeyConfig(apiKeyConfig: AppSyncApiKeyConfig.Builder.() -> Unit): Unit =
        apiKeyConfig(AppSyncApiKeyConfig(apiKeyConfig))

    /**
     * @param authorizationType One of possible authorization types AppSync supports. 
     */
    override fun authorizationType(authorizationType: AppSyncAuthorizationType) {
      cdkBuilder.authorizationType(authorizationType.let(AppSyncAuthorizationType.Companion::unwrap))
    }

    /**
     * @param cognitoConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    override fun cognitoConfig(cognitoConfig: AppSyncCognitoConfig) {
      cdkBuilder.cognitoConfig(cognitoConfig.let(AppSyncCognitoConfig.Companion::unwrap))
    }

    /**
     * @param cognitoConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9967721d8f296894289a34fbcc5635298f56434cc094ffae0703f014447aa5f9")
    override fun cognitoConfig(cognitoConfig: AppSyncCognitoConfig.Builder.() -> Unit): Unit =
        cognitoConfig(AppSyncCognitoConfig(cognitoConfig))

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    override fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: AppSyncLambdaAuthorizerConfig) {
      cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig.let(AppSyncLambdaAuthorizerConfig.Companion::unwrap))
    }

    /**
     * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
     * is required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d7738782272a4776780421859b9349e067da3ed9e08f770917997a8807eb7976")
    override
        fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: AppSyncLambdaAuthorizerConfig.Builder.() -> Unit):
        Unit = lambdaAuthorizerConfig(AppSyncLambdaAuthorizerConfig(lambdaAuthorizerConfig))

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    override fun openIdConnectConfig(openIdConnectConfig: AppSyncOpenIdConnectConfig) {
      cdkBuilder.openIdConnectConfig(openIdConnectConfig.let(AppSyncOpenIdConnectConfig.Companion::unwrap))
    }

    /**
     * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
     * required.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e4bef6b5c575e4a2d1d0dd4c1a2fce432324f054dffe59c83cc86168f79e53c")
    override
        fun openIdConnectConfig(openIdConnectConfig: AppSyncOpenIdConnectConfig.Builder.() -> Unit):
        Unit = openIdConnectConfig(AppSyncOpenIdConnectConfig(openIdConnectConfig))

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncAuthProvider =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncAuthProvider,
  ) : CdkObject(cdkObject),
      AppSyncAuthProvider {
    /**
     * If authorizationType is `AuthorizationType.API_KEY`, this option can be configured.
     *
     * Default: - name: 'DefaultAPIKey'
     */
    override fun apiKeyConfig(): AppSyncApiKeyConfig? =
        unwrap(this).getApiKeyConfig()?.let(AppSyncApiKeyConfig::wrap)

    /**
     * One of possible authorization types AppSync supports.
     *
     * Default: - `AuthorizationType.API_KEY`
     */
    override fun authorizationType(): AppSyncAuthorizationType =
        unwrap(this).getAuthorizationType().let(AppSyncAuthorizationType::wrap)

    /**
     * If authorizationType is `AuthorizationType.USER_POOL`, this option is required.
     *
     * Default: - none
     */
    override fun cognitoConfig(): AppSyncCognitoConfig? =
        unwrap(this).getCognitoConfig()?.let(AppSyncCognitoConfig::wrap)

    /**
     * If authorizationType is `AuthorizationType.LAMBDA`, this option is required.
     *
     * Default: - none
     */
    override fun lambdaAuthorizerConfig(): AppSyncLambdaAuthorizerConfig? =
        unwrap(this).getLambdaAuthorizerConfig()?.let(AppSyncLambdaAuthorizerConfig::wrap)

    /**
     * If authorizationType is `AuthorizationType.OIDC`, this option is required.
     *
     * Default: - none
     */
    override fun openIdConnectConfig(): AppSyncOpenIdConnectConfig? =
        unwrap(this).getOpenIdConnectConfig()?.let(AppSyncOpenIdConnectConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncAuthProvider {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncAuthProvider):
        AppSyncAuthProvider = CdkObjectWrappers.wrap(cdkObject) as? AppSyncAuthProvider ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncAuthProvider):
        software.amazon.awscdk.services.appsync.AppSyncAuthProvider = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncAuthProvider
  }
}
