@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnUser

@CdkDslMarker
public class CfnUserUserPhoneConfigPropertyDsl {
  private val cdkBuilder: CfnUser.UserPhoneConfigProperty.Builder =
      CfnUser.UserPhoneConfigProperty.builder()

  /**
   * @param afterContactWorkTimeLimit The After Call Work (ACW) timeout setting, in seconds.
   *
   * When returned by a `SearchUsers` call, `AfterContactWorkTimeLimit` is returned in milliseconds.
   */
  public fun afterContactWorkTimeLimit(afterContactWorkTimeLimit: Number) {
    cdkBuilder.afterContactWorkTimeLimit(afterContactWorkTimeLimit)
  }

  /**
   * @param autoAccept The Auto accept setting.
   */
  public fun autoAccept(autoAccept: Boolean) {
    cdkBuilder.autoAccept(autoAccept)
  }

  /**
   * @param autoAccept The Auto accept setting.
   */
  public fun autoAccept(autoAccept: IResolvable) {
    cdkBuilder.autoAccept(autoAccept)
  }

  /**
   * @param deskPhoneNumber The phone number for the user's desk phone.
   */
  public fun deskPhoneNumber(deskPhoneNumber: String) {
    cdkBuilder.deskPhoneNumber(deskPhoneNumber)
  }

  /**
   * @param phoneType The phone type. 
   */
  public fun phoneType(phoneType: String) {
    cdkBuilder.phoneType(phoneType)
  }

  public fun build(): CfnUser.UserPhoneConfigProperty = cdkBuilder.build()
}
