@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListener

@CdkDslMarker
public class CfnListenerActionPropertyDsl {
  private val cdkBuilder: CfnListener.ActionProperty.Builder = CfnListener.ActionProperty.builder()

  public fun authenticateCognitoConfig(authenticateCognitoConfig: IResolvable) {
    cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig)
  }

  public
      fun authenticateCognitoConfig(authenticateCognitoConfig: CfnListener.AuthenticateCognitoConfigProperty) {
    cdkBuilder.authenticateCognitoConfig(authenticateCognitoConfig)
  }

  public fun authenticateOidcConfig(authenticateOidcConfig: IResolvable) {
    cdkBuilder.authenticateOidcConfig(authenticateOidcConfig)
  }

  public
      fun authenticateOidcConfig(authenticateOidcConfig: CfnListener.AuthenticateOidcConfigProperty) {
    cdkBuilder.authenticateOidcConfig(authenticateOidcConfig)
  }

  public fun fixedResponseConfig(fixedResponseConfig: IResolvable) {
    cdkBuilder.fixedResponseConfig(fixedResponseConfig)
  }

  public fun fixedResponseConfig(fixedResponseConfig: CfnListener.FixedResponseConfigProperty) {
    cdkBuilder.fixedResponseConfig(fixedResponseConfig)
  }

  public fun forwardConfig(forwardConfig: IResolvable) {
    cdkBuilder.forwardConfig(forwardConfig)
  }

  public fun forwardConfig(forwardConfig: CfnListener.ForwardConfigProperty) {
    cdkBuilder.forwardConfig(forwardConfig)
  }

  public fun order(order: Number) {
    cdkBuilder.order(order)
  }

  public fun redirectConfig(redirectConfig: IResolvable) {
    cdkBuilder.redirectConfig(redirectConfig)
  }

  public fun redirectConfig(redirectConfig: CfnListener.RedirectConfigProperty) {
    cdkBuilder.redirectConfig(redirectConfig)
  }

  public fun targetGroupArn(targetGroupArn: String) {
    cdkBuilder.targetGroupArn(targetGroupArn)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnListener.ActionProperty = cdkBuilder.build()
}
