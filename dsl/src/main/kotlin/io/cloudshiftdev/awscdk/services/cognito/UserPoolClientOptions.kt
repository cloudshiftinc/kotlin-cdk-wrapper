package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
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

  public interface Builder {
    public fun accessTokenValidity(accessTokenValidity: Duration) {
    }

    public fun authFlows(authFlows: AuthFlow) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0cfe2ae57a5e682b93a6d8a3d510e0640d6c40c202e1b130a0098d653a7d12")
    public fun authFlows(authFlows: AuthFlow.Builder.() -> Unit) {
    }

    public fun authSessionValidity(authSessionValidity: Duration) {
    }

    public fun disableOAuth(disableOAuth: Boolean) {
    }

    public fun enableTokenRevocation(enableTokenRevocation: Boolean) {
    }

    public fun generateSecret(generateSecret: Boolean) {
    }

    public fun idTokenValidity(idTokenValidity: Duration) {
    }

    public fun oAuth(oAuth: OAuthSettings) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa4601c197d8996c76173a2c079517708a09b12b5cbab765a15be3d4c1a5f52d")
    public fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit) {
    }

    public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
    }

    public fun readAttributes(readAttributes: ClientAttributes) {
    }

    public fun refreshTokenValidity(refreshTokenValidity: Duration) {
    }

    public
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>) {
    }

    public fun userPoolClientName(userPoolClientName: String) {
    }

    public fun writeAttributes(writeAttributes: ClientAttributes) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClientOptions.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClientOptions.builder()

    public override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration::unwrap))
    }

    public override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2b0cfe2ae57a5e682b93a6d8a3d510e0640d6c40c202e1b130a0098d653a7d12")
    public override fun authFlows(authFlows: AuthFlow.Builder.() -> Unit): Unit =
        authFlows(AuthFlow(authFlows))

    public override fun authSessionValidity(authSessionValidity: Duration) {
      cdkBuilder.authSessionValidity(authSessionValidity.let(Duration::unwrap))
    }

    public override fun disableOAuth(disableOAuth: Boolean) {
      cdkBuilder.disableOAuth(disableOAuth)
    }

    public override fun enableTokenRevocation(enableTokenRevocation: Boolean) {
      cdkBuilder.enableTokenRevocation(enableTokenRevocation)
    }

    public override fun generateSecret(generateSecret: Boolean) {
      cdkBuilder.generateSecret(generateSecret)
    }

    public override fun idTokenValidity(idTokenValidity: Duration) {
      cdkBuilder.idTokenValidity(idTokenValidity.let(Duration::unwrap))
    }

    public override fun oAuth(oAuth: OAuthSettings) {
      cdkBuilder.oAuth(oAuth.let(OAuthSettings::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aa4601c197d8996c76173a2c079517708a09b12b5cbab765a15be3d4c1a5f52d")
    public override fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit): Unit =
        oAuth(OAuthSettings(oAuth))

    public override fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean) {
      cdkBuilder.preventUserExistenceErrors(preventUserExistenceErrors)
    }

    public override fun readAttributes(readAttributes: ClientAttributes) {
      cdkBuilder.readAttributes(readAttributes.let(ClientAttributes::unwrap))
    }

    public override fun refreshTokenValidity(refreshTokenValidity: Duration) {
      cdkBuilder.refreshTokenValidity(refreshTokenValidity.let(Duration::unwrap))
    }

    public override
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>) {
      cdkBuilder.supportedIdentityProviders(supportedIdentityProviders.map(UserPoolClientIdentityProvider::unwrap))
    }

    public override fun userPoolClientName(userPoolClientName: String) {
      cdkBuilder.userPoolClientName(userPoolClientName)
    }

    public override fun writeAttributes(writeAttributes: ClientAttributes) {
      cdkBuilder.writeAttributes(writeAttributes.let(ClientAttributes::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClientOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientOptions,
  ) : UserPoolClientOptions {
    public override fun accessTokenValidity(): Duration? =
        unwrap(this).getAccessTokenValidity()?.let(Duration::wrap)

    public override fun authFlows(): AuthFlow? = unwrap(this).getAuthFlows()?.let(AuthFlow::wrap)

    public override fun authSessionValidity(): Duration? =
        unwrap(this).getAuthSessionValidity()?.let(Duration::wrap)

    public override fun disableOAuth(): Boolean? = unwrap(this).getDisableOAuth()

    public override fun enableTokenRevocation(): Boolean? = unwrap(this).getEnableTokenRevocation()

    public override fun generateSecret(): Boolean? = unwrap(this).getGenerateSecret()

    public override fun idTokenValidity(): Duration? =
        unwrap(this).getIdTokenValidity()?.let(Duration::wrap)

    public override fun oAuth(): OAuthSettings? = unwrap(this).getOAuth()?.let(OAuthSettings::wrap)

    public override fun preventUserExistenceErrors(): Boolean? =
        unwrap(this).getPreventUserExistenceErrors()

    public override fun readAttributes(): ClientAttributes? =
        unwrap(this).getReadAttributes()?.let(ClientAttributes::wrap)

    public override fun refreshTokenValidity(): Duration? =
        unwrap(this).getRefreshTokenValidity()?.let(Duration::wrap)

    public override fun supportedIdentityProviders(): List<UserPoolClientIdentityProvider> =
        unwrap(this).getSupportedIdentityProviders()?.map(UserPoolClientIdentityProvider::wrap) ?:
        emptyList()

    public override fun userPoolClientName(): String? = unwrap(this).getUserPoolClientName()

    public override fun writeAttributes(): ClientAttributes? =
        unwrap(this).getWriteAttributes()?.let(ClientAttributes::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolClientOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientOptions):
        UserPoolClientOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientOptions):
        software.amazon.awscdk.services.cognito.UserPoolClientOptions = (wrapped as
        Wrapper).cdkObject
  }
}
