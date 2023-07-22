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

  /**
   * @param allowHttpsOutbound Allow HTTPS outbound traffic to communicate with the IdP.
   * Set this property to false if the IP address used for the IdP endpoint is identifiable
   * and you want to control outbound traffic.
   * Then allow HTTPS outbound traffic to the IdP's IP address using the listener's `connections`
   * property.
   */
  public fun allowHttpsOutbound(allowHttpsOutbound: Boolean) {
    cdkBuilder.allowHttpsOutbound(allowHttpsOutbound)
  }

  /**
   * @param authenticationRequestExtraParams The query parameters (up to 10) to include in the
   * redirect request to the authorization endpoint.
   */
  public
      fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
    cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
  }

  /**
   * @param next What action to execute next. 
   * Multiple actions form a linked chain; the chain must always terminate in a
   * (weighted)forward, fixedResponse or redirect action.
   */
  public fun next(next: ListenerAction) {
    cdkBuilder.next(next)
  }

  /**
   * @param onUnauthenticatedRequest The behavior if the user is not authenticated.
   */
  public fun onUnauthenticatedRequest(onUnauthenticatedRequest: UnauthenticatedAction) {
    cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
  }

  /**
   * @param scope The set of user claims to be requested from the IdP.
   * To verify which scope values your IdP supports and how to separate multiple values, see the
   * documentation for your IdP.
   */
  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  /**
   * @param sessionCookieName The name of the cookie used to maintain session information.
   */
  public fun sessionCookieName(sessionCookieName: String) {
    cdkBuilder.sessionCookieName(sessionCookieName)
  }

  /**
   * @param sessionTimeout The maximum duration of the authentication session.
   */
  public fun sessionTimeout(sessionTimeout: Duration) {
    cdkBuilder.sessionTimeout(sessionTimeout)
  }

  /**
   * @param userPool The Amazon Cognito user pool. 
   */
  public fun userPool(userPool: IUserPool) {
    cdkBuilder.userPool(userPool)
  }

  /**
   * @param userPoolClient The Amazon Cognito user pool client. 
   */
  public fun userPoolClient(userPoolClient: IUserPoolClient) {
    cdkBuilder.userPoolClient(userPoolClient)
  }

  /**
   * @param userPoolDomain The domain prefix or fully-qualified domain name of the Amazon Cognito
   * user pool. 
   */
  public fun userPoolDomain(userPoolDomain: IUserPoolDomain) {
    cdkBuilder.userPoolDomain(userPoolDomain)
  }

  public fun build(): AuthenticateCognitoActionProps = cdkBuilder.build()
}
