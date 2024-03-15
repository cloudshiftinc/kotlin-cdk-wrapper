@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolDomain
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ListenerAction
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface AuthenticateCognitoActionProps {
  public fun allowHttpsOutbound(): Boolean? = unwrap(this).getAllowHttpsOutbound()

  public fun authenticationRequestExtraParams(): Map<String, String> =
      unwrap(this).getAuthenticationRequestExtraParams() ?: emptyMap()

  public fun next(): ListenerAction

  public fun onUnauthenticatedRequest(): UnauthenticatedAction? =
      unwrap(this).getOnUnauthenticatedRequest()?.let(UnauthenticatedAction::wrap)

  public fun scope(): String? = unwrap(this).getScope()

  public fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

  public fun sessionTimeout(): Duration? = unwrap(this).getSessionTimeout()?.let(Duration::wrap)

  public fun userPool(): IUserPool

  public fun userPoolClient(): IUserPoolClient

  public fun userPoolDomain(): IUserPoolDomain

  @CdkDslMarker
  public interface Builder {
    public fun allowHttpsOutbound(allowHttpsOutbound: Boolean)

    public
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>)

    public fun next(next: ListenerAction)

    public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction)

    public fun scope(scope: String)

    public fun sessionCookieName(sessionCookieName: String)

    public fun sessionTimeout(sessionTimeout: Duration)

    public fun userPool(userPool: IUserPool)

    public fun userPoolClient(userPoolClient: IUserPoolClient)

    public fun userPoolDomain(userPoolDomain: IUserPoolDomain)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps.builder()

    override fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
      cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
    }

    override
        fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
      cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
    }

    override fun next(next: ListenerAction) {
      cdkBuilder.next(next.let(ListenerAction::unwrap))
    }

    override fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
      cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest.let(UnauthenticatedAction::unwrap))
    }

    override fun scope(scope: String) {
      cdkBuilder.scope(scope)
    }

    override fun sessionCookieName(sessionCookieName: String) {
      cdkBuilder.sessionCookieName(sessionCookieName)
    }

    override fun sessionTimeout(sessionTimeout: Duration) {
      cdkBuilder.sessionTimeout(sessionTimeout.let(Duration::unwrap))
    }

    override fun userPool(userPool: IUserPool) {
      cdkBuilder.userPool(userPool.let(IUserPool::unwrap))
    }

    override fun userPoolClient(userPoolClient: IUserPoolClient) {
      cdkBuilder.userPoolClient(userPoolClient.let(IUserPoolClient::unwrap))
    }

    override fun userPoolDomain(userPoolDomain: IUserPoolDomain) {
      cdkBuilder.userPoolDomain(userPoolDomain.let(IUserPoolDomain::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps,
  ) : CdkObject(cdkObject), AuthenticateCognitoActionProps {
    override fun allowHttpsOutbound(): Boolean? = unwrap(this).getAllowHttpsOutbound()

    override fun authenticationRequestExtraParams(): Map<String, String> =
        unwrap(this).getAuthenticationRequestExtraParams() ?: emptyMap()

    override fun next(): ListenerAction = unwrap(this).getNext().let(ListenerAction::wrap)

    override fun onUnauthenticatedRequest(): UnauthenticatedAction? =
        unwrap(this).getOnUnauthenticatedRequest()?.let(UnauthenticatedAction::wrap)

    override fun scope(): String? = unwrap(this).getScope()

    override fun sessionCookieName(): String? = unwrap(this).getSessionCookieName()

    override fun sessionTimeout(): Duration? = unwrap(this).getSessionTimeout()?.let(Duration::wrap)

    override fun userPool(): IUserPool = unwrap(this).getUserPool().let(IUserPool::wrap)

    override fun userPoolClient(): IUserPoolClient =
        unwrap(this).getUserPoolClient().let(IUserPoolClient::wrap)

    override fun userPoolDomain(): IUserPoolDomain =
        unwrap(this).getUserPoolDomain().let(IUserPoolDomain::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateCognitoActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps):
        AuthenticateCognitoActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthenticateCognitoActionProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps
  }
}
