@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.cognito.KeepOriginalAttrs

/**
 * Attributes that will be kept until the user verifies the changed attribute.
 *
 * Example:
 *
 * ```
 * UserPool.Builder.create(this, "myuserpool")
 * // ...
 * .signInAliases(SignInAliases.builder().username(true).build())
 * .autoVerify(AutoVerifiedAttrs.builder().email(true).phone(true).build())
 * .keepOriginal(KeepOriginalAttrs.builder()
 * .email(true)
 * .phone(true)
 * .build())
 * .build();
 * ```
 */
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
