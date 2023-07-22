@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.KeepOriginalAttrs

@CdkDslMarker
public class KeepOriginalAttrsDsl {
  private val cdkBuilder: KeepOriginalAttrs.Builder = KeepOriginalAttrs.builder()

  /**
   * @param email Whether the email address of the user should remain the original value until the
   * new email address is verified.
   */
  public fun email(email: Boolean) {
    cdkBuilder.email(email)
  }

  /**
   * @param phone Whether the phone number of the user should remain the original value until the
   * new phone number is verified.
   */
  public fun phone(phone: Boolean) {
    cdkBuilder.phone(phone)
  }

  public fun build(): KeepOriginalAttrs = cdkBuilder.build()
}
