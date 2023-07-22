@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnContact

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
