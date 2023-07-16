@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssmcontacts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ssmcontacts.CfnPlan

@CdkDslMarker
public class CfnPlanContactTargetInfoPropertyDsl {
  private val cdkBuilder: CfnPlan.ContactTargetInfoProperty.Builder =
      CfnPlan.ContactTargetInfoProperty.builder()

  public fun contactId(contactId: String) {
    cdkBuilder.contactId(contactId)
  }

  public fun isEssential(isEssential: Boolean) {
    cdkBuilder.isEssential(isEssential)
  }

  public fun isEssential(isEssential: IResolvable) {
    cdkBuilder.isEssential(isEssential)
  }

  public fun build(): CfnPlan.ContactTargetInfoProperty = cdkBuilder.build()
}
