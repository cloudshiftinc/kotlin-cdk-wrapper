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

  public fun apiKeyConfig(block: ApiKeyConfigDsl.() -> Unit = {}) {
    val builder = ApiKeyConfigDsl()
    builder.apply(block)
    cdkBuilder.apiKeyConfig(builder.build())
  }

  public fun apiKeyConfig(apiKeyConfig: ApiKeyConfig) {
    cdkBuilder.apiKeyConfig(apiKeyConfig)
  }

  public fun authorizationType(authorizationType: AuthorizationType) {
    cdkBuilder.authorizationType(authorizationType)
  }

  public fun lambdaAuthorizerConfig(block: LambdaAuthorizerConfigDsl.() -> Unit = {}) {
    val builder = LambdaAuthorizerConfigDsl()
    builder.apply(block)
    cdkBuilder.lambdaAuthorizerConfig(builder.build())
  }

  public fun lambdaAuthorizerConfig(lambdaAuthorizerConfig: LambdaAuthorizerConfig) {
    cdkBuilder.lambdaAuthorizerConfig(lambdaAuthorizerConfig)
  }

  public fun openIdConnectConfig(block: OpenIdConnectConfigDsl.() -> Unit = {}) {
    val builder = OpenIdConnectConfigDsl()
    builder.apply(block)
    cdkBuilder.openIdConnectConfig(builder.build())
  }

  public fun openIdConnectConfig(openIdConnectConfig: OpenIdConnectConfig) {
    cdkBuilder.openIdConnectConfig(openIdConnectConfig)
  }

  public fun userPoolConfig(block: UserPoolConfigDsl.() -> Unit = {}) {
    val builder = UserPoolConfigDsl()
    builder.apply(block)
    cdkBuilder.userPoolConfig(builder.build())
  }

  public fun userPoolConfig(userPoolConfig: UserPoolConfig) {
    cdkBuilder.userPoolConfig(userPoolConfig)
  }

  public fun build(): AuthorizationMode = cdkBuilder.build()
}
