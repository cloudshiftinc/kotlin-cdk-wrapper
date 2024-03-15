@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface UserPoolClientOptions {
  public fun accessTokenValidity(): Duration? =
      unwrap(this).getAccessTokenValidity()?.let(Duration::wrap)

  public fun authFlows(): AuthFlow? = unwrap(this).getAuthFlows()?.let(AuthFlow::wrap)

  public fun authSessionValidity(): Duration? =
      unwrap(this).getAuthSessionValidity()?.let(Duration::wrap)

  public fun disableOAuth(): Boolean? = unwrap(this).getDisableOAuth()

  public fun enableTokenRevocation(): Boolean? = unwrap(this).getEnableTokenRevocation()

  public fun generateSecret(): Boolean? = unwrap(this).getGenerateSecret()

  public fun idTokenValidity(): Duration? = unwrap(this).getIdTokenValidity()?.let(Duration::wrap)

  public fun oAuth(): OAuthSettings? = unwrap(this).getOAuth()?.let(OAuthSettings::wrap)

  public fun preventUserExistenceErrors(): Boolean? = unwrap(this).getPreventUserExistenceErrors()

  public fun readAttributes(): ClientAttributes? =
      unwrap(this).getReadAttributes()?.let(ClientAttributes::wrap)

  public fun refreshTokenValidity(): Duration? =
      unwrap(this).getRefreshTokenValidity()?.let(Duration::wrap)

  public fun supportedIdentityProviders(): List<UserPoolClientIdentityProvider> =
      unwrap(this).getSupportedIdentityProviders()?.map(UserPoolClientIdentityProvider::wrap) ?:
      emptyList()

  public fun userPoolClientName(): String? = unwrap(this).getUserPoolClientName()

  public fun writeAttributes(): ClientAttributes? =
      unwrap(this).getWriteAttributes()?.let(ClientAttributes::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessTokenValidity(accessTokenValidity: Duration)

    public fun authFlows(authFlows: AuthFlow)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0cfe2ae57a5e682b93a6d8a3d510e0640d6c40c202e1b130a0098d653a7d12")
    public fun authFlows(authFlows: AuthFlow.Builder.() -> Unit)

    public fun authSessionValidity(authSessionValidity: Duration)

    public fun disableOAuth(disableOAuth: Boolean)

    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    public fun generateSecret(generateSecret: Boolean)

    public fun idTokenValidity(idTokenValidity: Duration)

    public fun oAuth(oAuth: OAuthSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa4601c197d8996c76173a2c079517708a09b12b5cbab765a15be3d4c1a5f52d")
    public fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit)

    public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean)

    public fun readAttributes(readAttributes: ClientAttributes)

    public fun refreshTokenValidity(refreshTokenValidity: Duration)

    public
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>)

    public fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider)

    public fun userPoolClientName(userPoolClientName: String)

    public fun writeAttributes(writeAttributes: ClientAttributes)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClientOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClientOptions.builder()

    override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration::unwrap))
    }

    override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0cfe2ae57a5e682b93a6d8a3d510e0640d6c40c202e1b130a0098d653a7d12")
    override fun authFlows(authFlows: AuthFlow.Builder.() -> Unit): Unit =
        authFlows(AuthFlow(authFlows))

    override fun authSessionValidity(authSessionValidity: Duration) {
      cdkBuilder.authSessionValidity(authSessionValidity.let(Duration::unwrap))
    }

    override fun disableOAuth(disableOAuth: Boolean) {
      cdkBuilder.disableOAuth(disableOAuth)
    }

    override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    override fun idTokenValidity(idTokenValidity: Duration) {
      cdkBuilder.idTokenValidity(idTokenValidity.let(Duration::unwrap))
    }

    override fun oAuth(oAuth: OAuthSettings) {
      cdkBuilder.oAuth(oAuth.let(OAuthSettings::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa4601c197d8996c76173a2c079517708a09b12b5cbab765a15be3d4c1a5f52d")
    override fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit): Unit = oAuth(OAuthSettings(oAuth))

    override fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    override fun readAttributes(readAttributes: ClientAttributes) {
      cdkBuilder.readAttributes(readAttributes.let(ClientAttributes::unwrap))
    }

    override fun refreshTokenValidity(refreshTokenValidity: Duration) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity.let(Duration::unwrap))
    }

    override
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders.map(UserPoolClientIdentityProvider::unwrap))
    }

    override fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider): Unit =
        supportedIdentityProviders(supportedIdentityProviders.toList())

    override fun userPoolClientName(userPoolClientName: String) {
      cdkBuilder.userPoolClientName(userPoolClientName)
    }

    override fun writeAttributes(writeAttributes: ClientAttributes) {
      cdkBuilder.writeAttributes(writeAttributes.let(ClientAttributes::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClientOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientOptions,
  ) : CdkObject(cdkObject), UserPoolClientOptions {
    override fun accessTokenValidity(): Duration? =
        unwrap(this).getAccessTokenValidity()?.let(Duration::wrap)

    override fun authFlows(): AuthFlow? = unwrap(this).getAuthFlows()?.let(AuthFlow::wrap)

    override fun authSessionValidity(): Duration? =
        unwrap(this).getAuthSessionValidity()?.let(Duration::wrap)

    override fun disableOAuth(): Boolean? = unwrap(this).getDisableOAuth()

    override fun enableTokenRevocation(): Boolean? = unwrap(this).getEnableTokenRevocation()

    override fun generateSecret(): Boolean? = unwrap(this).getGenerateSecret()

    override fun idTokenValidity(): Duration? =
        unwrap(this).getIdTokenValidity()?.let(Duration::wrap)

    override fun oAuth(): OAuthSettings? = unwrap(this).getOAuth()?.let(OAuthSettings::wrap)

    override fun preventUserExistenceErrors(): Boolean? =
        unwrap(this).getPreventUserExistenceErrors()

    override fun readAttributes(): ClientAttributes? =
        unwrap(this).getReadAttributes()?.let(ClientAttributes::wrap)

    override fun refreshTokenValidity(): Duration? =
        unwrap(this).getRefreshTokenValidity()?.let(Duration::wrap)

    override fun supportedIdentityProviders(): List<UserPoolClientIdentityProvider> =
        unwrap(this).getSupportedIdentityProviders()?.map(UserPoolClientIdentityProvider::wrap) ?:
        emptyList()

    override fun userPoolClientName(): String? = unwrap(this).getUserPoolClientName()

    override fun writeAttributes(): ClientAttributes? =
        unwrap(this).getWriteAttributes()?.let(ClientAttributes::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolClientOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientOptions):
        UserPoolClientOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientOptions):
        software.amazon.awscdk.services.cognito.UserPoolClientOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolClientOptions
  }
}
