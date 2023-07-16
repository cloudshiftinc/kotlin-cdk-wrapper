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

  public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: Boolean) {
    cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
  }

  public fun allowAdminCreateUserOnly(allowAdminCreateUserOnly: IResolvable) {
    cdkBuilder.allowAdminCreateUserOnly(allowAdminCreateUserOnly)
  }

  public fun inviteMessageTemplate(inviteMessageTemplate: IResolvable) {
    cdkBuilder.inviteMessageTemplate(inviteMessageTemplate)
  }

  public
      fun inviteMessageTemplate(inviteMessageTemplate: CfnUserPool.InviteMessageTemplateProperty) {
    cdkBuilder.inviteMessageTemplate(inviteMessageTemplate)
  }

  public fun unusedAccountValidityDays(unusedAccountValidityDays: Number) {
    cdkBuilder.unusedAccountValidityDays(unusedAccountValidityDays)
  }

  public fun build(): CfnUserPool.AdminCreateUserConfigProperty = cdkBuilder.build()
}
