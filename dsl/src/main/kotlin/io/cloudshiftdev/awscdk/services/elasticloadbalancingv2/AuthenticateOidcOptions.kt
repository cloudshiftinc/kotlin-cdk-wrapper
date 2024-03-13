package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.SecretValue
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AuthenticateOidcOptions {
  public fun allowHttpsOutbound(): Boolean? = unwrap(this).getAllowHttpsOutbound()

  public fun authenticationRequestExtraParams(): Map<String, String> =
      unwrap(this).getAuthenticationRequestExtraParams() ?: emptyMap()

  public fun authorizationEndpoint(): String

  public fun clientId(): String

  public fun clientSecret(): SecretValue

  public fun issuer(): String

  public fun next(): ListenerAction

  public fun onUnauthenticatedRequest(): UnauthenticatedAction? =
      unwrap(this).getOnUnauthenticatedRequest()?.let(UnauthenticatedAction::wrap)

  public fun scope(): String? = unwrap(this).getScope()

  public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

  public fun sessionTimeout(): Duration? = unwrap(this).getSessionTimeout()?.let(Duration::wrap)

  public fun tokenEndpoint(): String

  public fun userInfoEndpoint(): String

  public interface Builder {
    public fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
    }

    public
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
    }

    public fun authorizationEndpoint(authorizationEndpoint: String) {
    }

    public fun clientId(clientId: String) {
    }

    public fun clientSecret(clientSecret: SecretValue) {
    }

    public fun issuer(issuer: String) {
    }

    public fun next(next: ListenerAction) {
    }

    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
    }

    public fun scope(scope: String) {
    }

    public fun sessionCookieName(sessionCookieName: String) {
    }

    public fun sessionTimeout(sessionTimeout: Duration) {
    }

    public fun tokenEndpoint(tokenEndpoint: String) {
    }

    public fun userInfoEndpoint(userInfoEndpoint: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions.builder()

    public override fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
      cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
    }

    public override
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
      cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    public override fun authorizationEndpoint(authorizationEndpoint: String) {
      cdkBuilder.authorizationEndpoint(authorizationEndpoint)
    }

    public override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    public override fun clientSecret(clientSecret: SecretValue) {
      cdkBuilder.clientSecret(clientSecret.let(SecretValue::unwrap))
    }

    public override fun issuer(issuer: String) {
      cdkBuilder.issuer(issuer)
    }

    public override fun next(next: ListenerAction) {
      cdkBuilder.next(next.let(ListenerAction::unwrap))
    }

    public override fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
      cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest.let(UnauthenticatedAction::unwrap))
    }

    public override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    public override fun sessionCookieName(sessionCookieName: String) {
      cdkBuilder.sessionCookieName(sessionCookieName)
    }

    public override fun sessionTimeout(sessionTimeout: Duration) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(Duration::unwrap))
    }

    public override fun tokenEndpoint(tokenEndpoint: String) {
      cdkBuilder.tokenEndpoint(tokenEndpoint)
    }

    public override fun userInfoEndpoint(userInfoEndpoint: String) {
      cdkBuilder.userInfoEndpoint(userInfoEndpoint)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions,
  ) : AuthenticateOidcOptions {
    public override fun allowHttpsOutbound(): Boolean? = unwrap(this).getAllowHttpsOutbound()

    public override fun authenticationRequestExtraParams(): Map<String, String> =
        unwrap(this).getAuthenticationRequestExtraParams() ?: emptyMap()

    public override fun authorizationEndpoint(): String = unwrap(this).getAuthorizationEndpoint()

    public override fun clientId(): String = unwrap(this).getClientId()

    public override fun clientSecret(): SecretValue =
        unwrap(this).getClientSecret().let(SecretValue::wrap)

    public override fun issuer(): String = unwrap(this).getIssuer()

    public override fun next(): ListenerAction = unwrap(this).getNext().let(ListenerAction::wrap)

    public override fun onUnauthenticatedRequest(): UnauthenticatedAction? =
        unwrap(this).getOnUnauthenticatedRequest()?.let(UnauthenticatedAction::wrap)

    public override fun scope(): String? = unwrap(this).getScope()

    public override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    public override fun sessionTimeout(): Duration? =
        unwrap(this).getSessionTimeout()?.let(Duration::wrap)

    public override fun tokenEndpoint(): String = unwrap(this).getTokenEndpoint()

    public override fun userInfoEndpoint(): String = unwrap(this).getUserInfoEndpoint()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateOidcOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions):
        AuthenticateOidcOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthenticateOidcOptions):
        software.amazon.awscdk.services.elasticloadbalancingv2.AuthenticateOidcOptions = (wrapped as
        Wrapper).cdkObject
  }
}
