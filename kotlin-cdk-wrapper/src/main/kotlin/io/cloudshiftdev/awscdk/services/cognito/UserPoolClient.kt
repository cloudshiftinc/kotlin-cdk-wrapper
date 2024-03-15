@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class UserPoolClient internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cognito.UserPoolClient,
) : Resource(cdkObject), IUserPoolClient {
  public open fun oAuthFlows(): OAuthFlows = unwrap(this).getOAuthFlows().let(OAuthFlows::wrap)

  public override fun userPoolClientId(): String = unwrap(this).getUserPoolClientId()

  public open fun userPoolClientName(): String = unwrap(this).getUserPoolClientName()

  public override fun userPoolClientSecret(): SecretValue =
      unwrap(this).getUserPoolClientSecret().let(SecretValue::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessTokenValidity(accessTokenValidity: Duration)

    public fun authFlows(authFlows: AuthFlow)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba14b3785c393a90f5f7281966ce647938ca9352287cfa5fa83557e18297ed19")
    public fun authFlows(authFlows: AuthFlow.Builder.() -> Unit)

    public fun authSessionValidity(authSessionValidity: Duration)

    public fun disableOAuth(disableOAuth: Boolean)

    public fun enableTokenRevocation(enableTokenRevocation: Boolean)

    public fun generateSecret(generateSecret: Boolean)

    public fun idTokenValidity(idTokenValidity: Duration)

    public fun oAuth(oAuth: OAuthSettings)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("22e0c75887cff0caf44dc059347f5d22050bdcb0bfcc6b08a98f5c506aa29a0c")
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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserPoolClient.Builder =
        software.amazon.awscdk.services.cognito.UserPoolClient.Builder.create(scope, id)

    override fun accessTokenValidity(accessTokenValidity: Duration) {
      cdkBuilder.accessTokenValidity(accessTokenValidity.let(Duration::unwrap))
    }

    override fun authFlows(authFlows: AuthFlow) {
      cdkBuilder.authFlows(authFlows.let(AuthFlow::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ba14b3785c393a90f5f7281966ce647938ca9352287cfa5fa83557e18297ed19")
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
    @JvmName("22e0c75887cff0caf44dc059347f5d22050bdcb0bfcc6b08a98f5c506aa29a0c")
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

    public fun build(): software.amazon.awscdk.services.cognito.UserPoolClient = cdkBuilder.build()
  }

  public companion object {
    public fun fromUserPoolClientId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      userPoolClientId: String,
    ): IUserPoolClient =
        software.amazon.awscdk.services.cognito.UserPoolClient.fromUserPoolClientId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, userPoolClientId).let(IUserPoolClient::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): UserPoolClient {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return UserPoolClient(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserPoolClient):
        UserPoolClient = UserPoolClient(cdkObject)

    internal fun unwrap(wrapped: UserPoolClient):
        software.amazon.awscdk.services.cognito.UserPoolClient = wrapped.cdkObject
  }
}
