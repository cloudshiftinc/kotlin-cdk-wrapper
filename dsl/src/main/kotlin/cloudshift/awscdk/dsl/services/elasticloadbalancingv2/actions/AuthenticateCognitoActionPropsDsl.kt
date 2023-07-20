@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.cognito.IUserPoolClient
import software.amazon.awscdk.services.cognito.IUserPoolDomain
import software.amazon.awscdk.services.elasticloadbalancingv2.ListenerAction
import software.amazon.awscdk.services.elasticloadbalancingv2.UnauthenticatedAction
import software.amazon.awscdk.services.elasticloadbalancingv2.actions.AuthenticateCognitoActionProps

@CdkDslMarker
public class AuthenticateCognitoActionPropsDsl {
  private val cdkBuilder: AuthenticateCognitoActionProps.Builder =
      AuthenticateCognitoActionProps.builder()

  public fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
    cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
  }

  public
      fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
    cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
  }

  public fun next(next: ListenerAction) {
    cdkBuilder.next(next)
  }

  public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
    cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
  }

  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun sessionCookieName(sessionCookieName: String) {
    cdkBuilder.sessionCookieName(sessionCookieName)
  }

  public fun sessionTimeout(sessionTimeout: Duration) {
    cdkBuilder.sessionTimeout(sessionTimeout)
  }

  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  public fun userPoolClient(userPoolClient: IUserPoolClient) {
    cdkBuilder.userPoolClient(userPoolClient)
  }

  public fun userPoolDomain(userPoolDomain: IUserPoolDomain) {
    cdkBuilder.userPoolDomain(userPoolDomain)
  }

  public fun build(): AuthenticateCognitoActionProps = cdkBuilder.build()
}
