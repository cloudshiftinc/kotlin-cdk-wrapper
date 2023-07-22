@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iot.CfnBillingGroup

@CdkDslMarker
public class CfnBillingGroupBillingGroupPropertiesPropertyDsl {
  private val cdkBuilder: CfnBillingGroup.BillingGroupPropertiesProperty.Builder =
      CfnBillingGroup.BillingGroupPropertiesProperty.builder()

  /**
   * @param billingGroupDescription The description of the billing group.
   */
  public fun billingGroupDescription(billingGroupDescription: String) {
    cdkBuilder.billingGroupDescription(billingGroupDescription)
  }

  public fun build(): CfnBillingGroup.BillingGroupPropertiesProperty = cdkBuilder.build()
}
