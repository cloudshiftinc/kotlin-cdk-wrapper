@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iam.CfnUser

@CdkDslMarker
public class CfnUserLoginProfilePropertyDsl {
  private val cdkBuilder: CfnUser.LoginProfileProperty.Builder =
      CfnUser.LoginProfileProperty.builder()

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun passwordResetRequired(passwordResetRequired: Boolean) {
    cdkBuilder.passwordResetRequired(passwordResetRequired)
  }

  public fun passwordResetRequired(passwordResetRequired: IResolvable) {
    cdkBuilder.passwordResetRequired(passwordResetRequired)
  }

  public fun build(): CfnUser.LoginProfileProperty = cdkBuilder.build()
}
