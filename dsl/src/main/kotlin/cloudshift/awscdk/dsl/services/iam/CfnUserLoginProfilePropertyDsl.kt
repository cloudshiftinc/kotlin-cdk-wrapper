@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnUser

/**
 * Creates a password for the specified user, giving the user the ability to access AWS services
 * through the AWS Management Console .
 *
 * For more information about managing passwords, see [Managing
 * Passwords](https://docs.aws.amazon.com/IAM/latest/UserGuide/Using_ManagingLogins.html) in the *IAM
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iam.*;
 * LoginProfileProperty loginProfileProperty = LoginProfileProperty.builder()
 * .password("password")
 * // the properties below are optional
 * .passwordResetRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html)
 */
@CdkDslMarker
public class CfnUserLoginProfilePropertyDsl {
  private val cdkBuilder: CfnUser.LoginProfileProperty.Builder =
      CfnUser.LoginProfileProperty.builder()

  /**
   * @param password The user's password. 
   */
  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  /**
   * @param passwordResetRequired Specifies whether the user is required to set a new password on
   * next sign-in.
   */
  public fun passwordResetRequired(passwordResetRequired: Boolean) {
    cdkBuilder.passwordResetRequired(passwordResetRequired)
  }

  /**
   * @param passwordResetRequired Specifies whether the user is required to set a new password on
   * next sign-in.
   */
  public fun passwordResetRequired(passwordResetRequired: IResolvable) {
    cdkBuilder.passwordResetRequired(passwordResetRequired)
  }

  public fun build(): CfnUser.LoginProfileProperty = cdkBuilder.build()
}
