@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appsync

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appsync.ApiKeyConfig
import software.amazon.awscdk.services.appsync.AuthorizationMode
import software.amazon.awscdk.services.appsync.AuthorizationType
import software.amazon.awscdk.services.appsync.LambdaAuthorizerConfig
import software.amazon.awscdk.services.appsync.OpenIdConnectConfig
import software.amazon.awscdk.services.appsync.UserPoolConfig

@CdkDslMarker
public class AuthorizationModeDsl {
  private val cdkBuilder: AuthorizationMode.Builder = AuthorizationMode.builder()

  /**
   * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
   * configured.
   */
  public fun apiKeyConfig(apiKeyConfig: ApiKeyConfigDsl.() -> Unit = {}) {
    val builder = ApiKeyConfigDsl()
    builder.apply(apiKeyConfig)
    cdkBuilder.apiKeyConfig(builder.build())
  }

  /**
   * @param apiKeyConfig If authorizationType is `AuthorizationType.API_KEY`, this option can be
   * configured.
   */
  public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig) {
    cdkBuilder.apiKeyConfig(apiKeyConfig)
  }

  /**
   * @param authorizationType One of possible four values AppSync supports. 
   */
  public fun authorizationType(authorizationType: AuthorizationType) {
    cdkBuilder.authorizationType(authorizationType)
  }

  /**
   * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
   * is required.
   */
  public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfigDsl.() -> Unit =
      {}) {
    val builder = LambdaAuthorizerConfigDsl()
    builder.apply(lambdaAuthorizerConfig)
    cdkBuilder.lambdaAuthorizerConfig(builder.build())
  }

  /**
   * @param lambdaAuthorizerConfig If authorizationType is `AuthorizationType.LAMBDA`, this option
   * is required.
   */
  public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig) {
    cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
  }

  /**
   * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
   * required.
   */
  public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfigDsl.() -> Unit = {}) {
    val builder = OpenIdConnectConfigDsl()
    builder.apply(openIdConnectConfig)
    cdkBuilder.openIdConnectConfig(builder.build())
  }

  /**
   * @param openIdConnectConfig If authorizationType is `AuthorizationType.OIDC`, this option is
   * required.
   */
  public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig) {
    cdkBuilder.openIdConnectConfig(openIdConnectConfig)
  }

  /**
   * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
   * required.
   */
  public fun userPoolConfig(userPoolConfig: UserPoolConfigDsl.() -> Unit = {}) {
    val builder = UserPoolConfigDsl()
    builder.apply(userPoolConfig)
    cdkBuilder.userPoolConfig(builder.build())
  }

  /**
   * @param userPoolConfig If authorizationType is `AuthorizationType.USER_POOL`, this option is
   * required.
   */
  public fun userPoolConfig(userPoolConfig: UserPoolConfig) {
    cdkBuilder.userPoolConfig(userPoolConfig)
  }

  public fun build(): AuthorizationMode = cdkBuilder.build()
}
