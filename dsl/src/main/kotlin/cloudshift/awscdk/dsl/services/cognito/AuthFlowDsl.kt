@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.AuthFlow

/**
 * Types of authentication flow.
 *
 * Example:
 *
 * ```
 * UserPool pool = new UserPool(this, "pool");
 * pool.addClient("app-client", UserPoolClientOptions.builder()
 * .authFlows(AuthFlow.builder()
 * .userPassword(true)
 * .userSrp(true)
 * .build())
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/cognito/latest/developerguide/amazon-cognito-user-pools-authentication-flow.html)
 */
@CdkDslMarker
public class AuthFlowDsl {
  private val cdkBuilder: AuthFlow.Builder = AuthFlow.builder()

  /**
   * @param adminUserPassword Enable admin based user password authentication flow.
   */
  public fun adminUserPassword(adminUserPassword: Boolean) {
    cdkBuilder.adminUserPassword(adminUserPassword)
  }

  /**
   * @param custom Enable custom authentication flow.
   */
  public fun custom(custom: Boolean) {
    cdkBuilder.custom(custom)
  }

  /**
   * @param userPassword Enable auth using username &amp; password.
   */
  public fun userPassword(userPassword: Boolean) {
    cdkBuilder.userPassword(userPassword)
  }

  /**
   * @param userSrp Enable SRP based authentication.
   */
  public fun userSrp(userSrp: Boolean) {
    cdkBuilder.userSrp(userSrp)
  }

  public fun build(): AuthFlow = cdkBuilder.build()
}
