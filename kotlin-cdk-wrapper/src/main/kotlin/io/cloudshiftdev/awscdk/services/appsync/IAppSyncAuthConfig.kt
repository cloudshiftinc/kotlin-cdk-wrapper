@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Exposes methods for defining authorization config for AppSync APIs.
 */
public interface IAppSyncAuthConfig {
  /**
   * Set up Cognito Authorization configuration for AppSync APIs.
   *
   * @param config
   */
  public fun setupCognitoConfig(): Any

  /**
   * Set up Cognito Authorization configuration for AppSync APIs.
   *
   * @param config
   */
  public fun setupCognitoConfig(config: AppSyncCognitoConfig): Any

  /**
   * Set up Cognito Authorization configuration for AppSync APIs.
   *
   * @param config
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f8cbeadf13174d8e2f72a7d4f900dc5a3a9d5398e916cfe3dc4e7026a17bee2a")
  public fun setupCognitoConfig(config: AppSyncCognitoConfig.Builder.() -> Unit): Any

  /**
   * Set up Lambda Authorization configuration AppSync APIs.
   *
   * @param config
   */
  public fun setupLambdaAuthorizerConfig(): Any

  /**
   * Set up Lambda Authorization configuration AppSync APIs.
   *
   * @param config
   */
  public fun setupLambdaAuthorizerConfig(config: AppSyncLambdaAuthorizerConfig): Any

  /**
   * Set up Lambda Authorization configuration AppSync APIs.
   *
   * @param config
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("25b256a3b0986fe8f25c74dd32cb01a2bd526b4b157c1638c759e1cee8d210e1")
  public fun setupLambdaAuthorizerConfig(config: AppSyncLambdaAuthorizerConfig.Builder.() -> Unit):
      Any

  /**
   * Set up OIDC Authorization configuration for AppSync APIs.
   *
   * @param config
   */
  public fun setupOpenIdConnectConfig(): Any

  /**
   * Set up OIDC Authorization configuration for AppSync APIs.
   *
   * @param config
   */
  public fun setupOpenIdConnectConfig(config: AppSyncOpenIdConnectConfig): Any

  /**
   * Set up OIDC Authorization configuration for AppSync APIs.
   *
   * @param config
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2ba8c5ed812e93a85152b6220b77dfde95597d693caa7d931d232c59cbf20e54")
  public fun setupOpenIdConnectConfig(config: AppSyncOpenIdConnectConfig.Builder.() -> Unit): Any

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.IAppSyncAuthConfig,
  ) : CdkObject(cdkObject),
      IAppSyncAuthConfig {
    /**
     * Set up Cognito Authorization configuration for AppSync APIs.
     *
     * @param config
     */
    override fun setupCognitoConfig(): Any = unwrap(this).setupCognitoConfig()

    /**
     * Set up Cognito Authorization configuration for AppSync APIs.
     *
     * @param config
     */
    override fun setupCognitoConfig(config: AppSyncCognitoConfig): Any =
        unwrap(this).setupCognitoConfig(config.let(AppSyncCognitoConfig.Companion::unwrap))

    /**
     * Set up Cognito Authorization configuration for AppSync APIs.
     *
     * @param config
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f8cbeadf13174d8e2f72a7d4f900dc5a3a9d5398e916cfe3dc4e7026a17bee2a")
    override fun setupCognitoConfig(config: AppSyncCognitoConfig.Builder.() -> Unit): Any =
        setupCognitoConfig(AppSyncCognitoConfig(config))

    /**
     * Set up Lambda Authorization configuration AppSync APIs.
     *
     * @param config
     */
    override fun setupLambdaAuthorizerConfig(): Any = unwrap(this).setupLambdaAuthorizerConfig()

    /**
     * Set up Lambda Authorization configuration AppSync APIs.
     *
     * @param config
     */
    override fun setupLambdaAuthorizerConfig(config: AppSyncLambdaAuthorizerConfig): Any =
        unwrap(this).setupLambdaAuthorizerConfig(config.let(AppSyncLambdaAuthorizerConfig.Companion::unwrap))

    /**
     * Set up Lambda Authorization configuration AppSync APIs.
     *
     * @param config
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("25b256a3b0986fe8f25c74dd32cb01a2bd526b4b157c1638c759e1cee8d210e1")
    override
        fun setupLambdaAuthorizerConfig(config: AppSyncLambdaAuthorizerConfig.Builder.() -> Unit):
        Any = setupLambdaAuthorizerConfig(AppSyncLambdaAuthorizerConfig(config))

    /**
     * Set up OIDC Authorization configuration for AppSync APIs.
     *
     * @param config
     */
    override fun setupOpenIdConnectConfig(): Any = unwrap(this).setupOpenIdConnectConfig()

    /**
     * Set up OIDC Authorization configuration for AppSync APIs.
     *
     * @param config
     */
    override fun setupOpenIdConnectConfig(config: AppSyncOpenIdConnectConfig): Any =
        unwrap(this).setupOpenIdConnectConfig(config.let(AppSyncOpenIdConnectConfig.Companion::unwrap))

    /**
     * Set up OIDC Authorization configuration for AppSync APIs.
     *
     * @param config
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ba8c5ed812e93a85152b6220b77dfde95597d693caa7d931d232c59cbf20e54")
    override fun setupOpenIdConnectConfig(config: AppSyncOpenIdConnectConfig.Builder.() -> Unit):
        Any = setupOpenIdConnectConfig(AppSyncOpenIdConnectConfig(config))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IAppSyncAuthConfig):
        IAppSyncAuthConfig = CdkObjectWrappers.wrap(cdkObject) as? IAppSyncAuthConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAppSyncAuthConfig):
        software.amazon.awscdk.services.appsync.IAppSyncAuthConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.IAppSyncAuthConfig
  }
}
