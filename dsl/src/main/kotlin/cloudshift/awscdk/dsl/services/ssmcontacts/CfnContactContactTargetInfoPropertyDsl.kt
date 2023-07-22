@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

/**
 * The contact that Incident Manager is engaging during an incident.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ssmcontacts.*;
 * ContactTargetInfoProperty contactTargetInfoProperty = ContactTargetInfoProperty.builder()
 * .contactId("contactId")
 * .isEssential(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmcontacts-contact-contacttargetinfo.html)
 */
@CdkDslMarker
public class CfnContactContactTargetInfoPropertyDsl {
  private val cdkBuilder: CfnContact.ContactTargetInfoProperty.Builder =
      CfnContact.ContactTargetInfoProperty.builder()

  /**
   * @param contactId The Amazon Resource Name (ARN) of the contact. 
   */
  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  /**
   * @param isEssential A Boolean value determining if the contact's acknowledgement stops the
   * progress of stages in the plan. 
   */
  public fun isEssential(isEssential: Boolean) {
    cdkBuilder.isEssential(isEssential)
  }

  /**
   * @param isEssential A Boolean value determining if the contact's acknowledgement stops the
   * progress of stages in the plan. 
   */
  public fun isEssential(isEssential: IResolvable) {
    cdkBuilder.isEssential(isEssential)
  }

  public fun build(): CfnContact.ContactTargetInfoProperty = cdkBuilder.build()
}
