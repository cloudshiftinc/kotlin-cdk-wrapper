@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cognito.AuthFlow
import software.amazon.awscdk.services.cognito.ClientAttributes
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.OAuthSettings
import software.amazon.awscdk.services.cognito.UserPoolClientIdentityProvider
import software.amazon.awscdk.services.cognito.UserPoolClientProps

@CdkDslMarker
public class UserPoolClientPropsDsl {
  private val cdkBuilder: UserPoolClientProps.Builder = UserPoolClientProps.builder()

  private val _supportedIdentityProviders: MutableList<UserPoolClientIdentityProvider> =
      mutableListOf()

  public fun accessTokenValidity(accessTokenValidity: Duration) {
    cdkBuilder.accessTokenValidity(accessTokenValidity)
  }

  public fun authFlows(block: AuthFlowDsl.() -> Unit = {}) {
    val builder = AuthFlowDsl()
    builder.apply(block)
    cdkBuilder.authFlows(builder.build())
  }

  public fun authFlows(authFlows: AuthFlow) {
    cdkBuilder.authFlows(authFlows)
  }

  public fun authSessionValidity(authSessionValidity: Duration) {
    cdkBuilder.authSessionValidity(authSessionValidity)
  }

  public fun disableOAuth(disableOAuth: Boolean) {
    cdkBuilder.disableOAuth(disableOAuth)
  }

  public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
    cdkBuilder.enableTokenRevocation(enableTokenRevocation)
  }

  public fun generateSecret(generateSecret: Boolean) {
    cdkBuilder.generateSecret(generateSecret)
  }

  public fun idTokenValidity(idTokenValidity: Duration) {
    cdkBuilder.idTokenValidity(idTokenValidity)
  }

  public fun oAuth(block: OAuthSettingsDsl.() -> Unit = {}) {
    val builder = OAuthSettingsDsl()
    builder.apply(block)
    cdkBuilder.oAuth(builder.build())
  }

  public fun oAuth(oAuth: OAuthSettings) {
    cdkBuilder.oAuth(oAuth)
  }

  public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
    cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
  }

  public fun readAttributes(readAttributes: ClientAttributes) {
    cdkBuilder.readAttributes(readAttributes)
  }

  public fun refreshTokenValidity(refreshTokenValidity: Duration) {
    cdkBuilder.refreshTokenValidity(refreshTokenValidity)
  }

  public fun supportedIdentityProviders(vararg
      supportedIdentityProviders: UserPoolClientIdentityProvider) {
    _supportedIdentityProviders.addAll(listOf(*supportedIdentityProviders))
  }

  public
      fun supportedIdentityProviders(supportedIdentityProviders: Collection<UserPoolClientIdentityProvider>) {
    _supportedIdentityProviders.addAll(supportedIdentityProviders)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun userPoolClientName(userPoolClientName: String) {
    cdkBuilder.userPoolClientName(userPoolClientName)
  }

  public fun writeAttributes(writeAttributes: ClientAttributes) {
    cdkBuilder.writeAttributes(writeAttributes)
  }

  public fun build(): UserPoolClientProps {
    if(_supportedIdentityProviders.isNotEmpty())
        cdkBuilder.supportedIdentityProviders(_supportedIdentityProviders)
    return cdkBuilder.build()
  }
}
