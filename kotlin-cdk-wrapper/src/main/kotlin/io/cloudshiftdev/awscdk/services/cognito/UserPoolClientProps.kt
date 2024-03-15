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

public interface UserPoolClientProps : UserPoolClientOptions {
  public fun userPool(): IUserPool

  @CdkDslMarker
  public interface Builder {
    public fun accessTokenValidity(accessTokenValidity: Duration)

    public fun authFlows(authFlows: AuthFlow)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31c00fb95139c9bad265ea6f1a4fd04a164637660d9c93124841e50458bc6ad")
    public fun authFlows(authFlows: AuthFlow.Builder.() -> Unit)

    public fun authSessionValidity(authSessionValidity: Duration)

    public fun disableOAuth(disableOAuth: Boolean)

    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    public fun generateSecret(generateSecret: Boolean)

    public fun idTokenValidity(idTokenValidity: Duration)

    public fun oAuth(oAuth: OAuthSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621d37efe4019acde8c371f44054d86129f0fa508b8f5e3e86957726bf5659fe")
    public fun oAuth(oAuth: OAuthSettings.Builder.() -> Unit)

    public fun preventUserExistenceErrors(preventUserExistenceErrors: Boolean)

    public fun readAttributes(readAttributes: ClientAttributes)

    public fun refreshTokenValidity(refreshTokenValidity: Duration)

    public
        fun supportedIdentityProviders(supportedIdentityProviders: List<UserPoolClientIdentityProvider>)

    public fun supportedIdentityProviders(vararg
        supportedIdentityProviders: UserPoolClientIdentityProvider)

    public fun userPool(userPool: IUserPool)

    public fun userPoolClientName(userPoolClientName: String)

    public fun writeAttributes(writeAttributes: ClientAttributes)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClientProps.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClientProps.builder()

    override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration::unwrap))
    }

    override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d31c00fb95139c9bad265ea6f1a4fd04a164637660d9c93124841e50458bc6ad")
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
    @JvmName("621d37efe4019acde8c371f44054d86129f0fa508b8f5e3e86957726bf5659fe")
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

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    override fun userPoolClientName(userPoolClientName: String) {
      cdkBuilder.userPoolClientName(userPoolClientName)
    }

    override fun writeAttributes(writeAttributes: ClientAttributes) {
      cdkBuilder.writeAttributes(writeAttributes.let(ClientAttributes::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClientProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientProps,
  ) : CdkObject(cdkObject), UserPoolClientProps {
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

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

    override fun userPoolClientName(): String? = unwrap(this).getUserPoolClientName()

    override fun writeAttributes(): ClientAttributes? =
        unwrap(this).getWriteAttributes()?.let(ClientAttributes::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserPoolClientProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClientProps):
        UserPoolClientProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserPoolClientProps):
        software.amazon.awscdk.services.cognito.UserPoolClientProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserPoolClientProps
  }
}
