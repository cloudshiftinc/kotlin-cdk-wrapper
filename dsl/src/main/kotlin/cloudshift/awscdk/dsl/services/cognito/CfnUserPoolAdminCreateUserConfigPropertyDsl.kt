@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolAdminCreateUserConfigPropertyDsl {
  private val cdkBuilder: CfnUserPool.AdminCreateUserConfigProperty.Builder =
      CfnUserPool.AdminCreateUserConfigProperty.builder()

  /**
   * @param allowAdminCreateUserOnly Set to `True` if only the administrator is allowed to create
   * user profiles.
   * Set to `False` if users can sign themselves up via an app.
   */
  public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean) {
    cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
  }

  /**
   * @param allowAdminCreateUserOnly Set to `True` if only the administrator is allowed to create
   * user profiles.
   * Set to `False` if users can sign themselves up via an app.
   */
  public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable) {
    cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
  }

  /**
   * @param inviteMessageTemplate The message template to be used for the welcome message to new
   * users.
   * See also [Customizing User Invitation
   * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
   * .
   */
  public fun inviteMessageTemplate(inviteMessageTemplate: IResolvable) {
    cdkBuilder.inviteMessageTemplate(inviteMessageTemplate)
  }

  /**
   * @param inviteMessageTemplate The message template to be used for the welcome message to new
   * users.
   * See also [Customizing User Invitation
   * Messages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-customizations.html#cognito-user-pool-settings-user-invitation-message-customization)
   * .
   */
  public
      fun inviteMessageTemplate(inviteMessageTemplate: CfnUserPool.InviteMessageTemplateProperty) {
    cdkBuilder.inviteMessageTemplate(inviteMessageTemplate)
  }

  /**
   * @param unusedAccountValidityDays The user account expiration limit, in days, after which a new
   * account that hasn't signed in is no longer usable.
   * To reset the account after that time limit, you must call `AdminCreateUser` again, specifying
   * `"RESEND"` for the `MessageAction` parameter. The default value for this parameter is 7.
   *
   *
   * If you set a value for `TemporaryPasswordValidityDays` in `PasswordPolicy` , that value will be
   * used, and `UnusedAccountValidityDays` will be no longer be an available parameter for that user
   * pool.
   */
  public fun unusedAccountValidityDays(unusedAccountValidityDays: Number) {
    cdkBuilder.unusedAccountValidityDays(unusedAccountValidityDays)
  }

  public fun build(): CfnUserPool.AdminCreateUserConfigProperty = cdkBuilder.build()
}
