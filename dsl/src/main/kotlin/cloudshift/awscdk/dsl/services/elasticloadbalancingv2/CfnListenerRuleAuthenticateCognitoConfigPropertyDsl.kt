@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

@CdkDslMarker
public class CfnListenerRuleAuthenticateCognitoConfigPropertyDsl {
  private val cdkBuilder: CfnListenerRule.AuthenticateCognitoConfigProperty.Builder =
      CfnListenerRule.AuthenticateCognitoConfigProperty.builder()

  public
      fun authenticationRequestExtraParams(authenticationRequestExtraParams: Map<String, String>) {
    cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
  }

  public fun authenticationRequestExtraParams(authenticationRequestExtraParams: IResolvable) {
    cdkBuilder.authenticationRequestExtraParams(authenticationRequestExtraParams)
  }

  public fun onUnauthenticatedRequest(onUnauthenticatedRequest: String) {
    cdkBuilder.onUnauthenticatedRequest(onUnauthenticatedRequest)
  }

  public fun scope(scope: String) {
    cdkBuilder.scope(scope)
  }

  public fun sessionCookieName(sessionCookieName: String) {
    cdkBuilder.sessionCookieName(sessionCookieName)
  }

  public fun sessionTimeout(sessionTimeout: Number) {
    cdkBuilder.sessionTimeout(sessionTimeout)
  }

  public fun userPoolArn(userPoolArn: String) {
    cdkBuilder.userPoolArn(userPoolArn)
  }

  public fun userPoolClientId(userPoolClientId: String) {
    cdkBuilder.userPoolClientId(userPoolClientId)
  }

  public fun userPoolDomain(userPoolDomain: String) {
    cdkBuilder.userPoolDomain(userPoolDomain)
  }

  public fun build(): CfnListenerRule.AuthenticateCognitoConfigProperty = cdkBuilder.build()
}
