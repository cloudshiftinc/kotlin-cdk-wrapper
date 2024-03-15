@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.actions

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cognito.IUserPool
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolClient
import io.cloudshiftdev.awscdk.services.cognito.IUserPoolDomain
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.IApplicationListener
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ListenerAction
import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.IConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public open class AuthenticateCognitoAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction,
) : ListenerAction(cdkObject) {
  public override fun bind(scope: Construct, listener: IApplicationListener) {
    unwrap(this).bind(scope.let(Construct::unwrap), listener.let(IApplicationListener::unwrap))
  }

  public override fun bind(
    scope: Construct,
    listener: IApplicationListener,
    associatingConstruct: IConstruct,
  ) {
    unwrap(this).bind(scope.let(Construct::unwrap), listener.let(IApplicationListener::unwrap),
        associatingConstruct.let(IConstruct::unwrap))
  }

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
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction.Builder.create()

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
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthenticateCognitoAction {
      val builderImpl = BuilderImpl()
      return AuthenticateCognitoAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction):
        AuthenticateCognitoAction = AuthenticateCognitoAction(cdkObject)

    internal fun unwrap(wrapped: AuthenticateCognitoAction):
        software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoAction =
        wrapped.cdkObject
  }
}
