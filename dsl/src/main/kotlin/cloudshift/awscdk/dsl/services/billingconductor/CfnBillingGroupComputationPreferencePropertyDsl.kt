@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.billingconductor.CfnBillingGroup

@CdkDslMarker
public class CfnBillingGroupComputationPreferencePropertyDsl {
  private val cdkBuilder: CfnBillingGroup.ComputationPreferenceProperty.Builder =
      CfnBillingGroup.ComputationPreferenceProperty.builder()

  /**
   * @param pricingPlanArn The Amazon Resource Name (ARN) of the pricing plan used to compute the
   * AWS charges for a billing group. 
   */
  public fun pricingPlanArn(pricingPlanArn: String) {
    cdkBuilder.pricingPlanArn(pricingPlanArn)
  }

  public fun build(): CfnBillingGroup.ComputationPreferenceProperty = cdkBuilder.build()
}
