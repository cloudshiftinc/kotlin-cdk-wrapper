@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * The settings for updates to user attributes.
 *
 * These settings include the property `AttributesRequireVerificationBeforeUpdate` ,
 * a user-pool setting that tells Amazon Cognito how to handle changes to the value of your users'
 * email address and phone number attributes. For
 * more information, see [Verifying updates to email addresses and phone
 * numbers](https://docs.aws.amazon.com/cognito/latest/developerguide/user-pool-settings-email-phone-verification.html#user-pool-settings-verifications-verify-attribute-updates)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * UserAttributeUpdateSettingsProperty userAttributeUpdateSettingsProperty =
 * UserAttributeUpdateSettingsProperty.builder()
 * .attributesRequireVerificationBeforeUpdate(List.of("attributesRequireVerificationBeforeUpdate"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-userattributeupdatesettings.html)
 */
@CdkDslMarker
public class CfnUserPoolUserAttributeUpdateSettingsPropertyDsl {
  private val cdkBuilder: CfnUserPool.UserAttributeUpdateSettingsProperty.Builder =
      CfnUserPool.UserAttributeUpdateSettingsProperty.builder()

  private val _attributesRequireVerificationBeforeUpdate: MutableList<String> = mutableListOf()

  /**
   * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies their email
   * address, phone number, or both before Amazon Cognito updates the value of that attribute. 
   * When you update a user attribute that has this option activated, Amazon Cognito sends a
   * verification message to the new phone number or email address. Amazon Cognito doesn’t change the
   * value of the attribute until your user responds to the verification message and confirms the new
   * value.
   *
   * You can verify an updated email address or phone number with a
   * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
   * API request. You can also call the
   * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
   * API and set `email_verified` or `phone_number_verified` to true.
   *
   * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require that
   * your users verify attribute changes before Amazon Cognito updates them. In a user pool where
   * `AttributesRequireVerificationBeforeUpdate` is false, API operations that change attribute values
   * can immediately update a user’s `email` or `phone_number` attribute.
   */
  public fun attributesRequireVerificationBeforeUpdate(vararg
      attributesRequireVerificationBeforeUpdate: String) {
    _attributesRequireVerificationBeforeUpdate.addAll(listOf(*attributesRequireVerificationBeforeUpdate))
  }

  /**
   * @param attributesRequireVerificationBeforeUpdate Requires that your user verifies their email
   * address, phone number, or both before Amazon Cognito updates the value of that attribute. 
   * When you update a user attribute that has this option activated, Amazon Cognito sends a
   * verification message to the new phone number or email address. Amazon Cognito doesn’t change the
   * value of the attribute until your user responds to the verification message and confirms the new
   * value.
   *
   * You can verify an updated email address or phone number with a
   * [VerifyUserAttribute](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_VerifyUserAttribute.html)
   * API request. You can also call the
   * [AdminUpdateUserAttributes](https://docs.aws.amazon.com/cognito-user-identity-pools/latest/APIReference/API_AdminUpdateUserAttributes.html)
   * API and set `email_verified` or `phone_number_verified` to true.
   *
   * When `AttributesRequireVerificationBeforeUpdate` is false, your user pool doesn't require that
   * your users verify attribute changes before Amazon Cognito updates them. In a user pool where
   * `AttributesRequireVerificationBeforeUpdate` is false, API operations that change attribute values
   * can immediately update a user’s `email` or `phone_number` attribute.
   */
  public
      fun attributesRequireVerificationBeforeUpdate(attributesRequireVerificationBeforeUpdate: Collection<String>) {
    _attributesRequireVerificationBeforeUpdate.addAll(attributesRequireVerificationBeforeUpdate)
  }

  public fun build(): CfnUserPool.UserAttributeUpdateSettingsProperty {
    if(_attributesRequireVerificationBeforeUpdate.isNotEmpty())
        cdkBuilder.attributesRequireVerificationBeforeUpdate(_attributesRequireVerificationBeforeUpdate)
    return cdkBuilder.build()
  }
}
