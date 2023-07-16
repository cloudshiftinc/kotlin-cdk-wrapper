@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule

@CdkDslMarker
public class CfnPricingRuleTieringPropertyDsl {
  private val cdkBuilder: CfnPricingRule.TieringProperty.Builder =
      CfnPricingRule.TieringProperty.builder()

  public fun freeTier(freeTier: IResolvable) {
    cdkBuilder.freeTier(freeTier)
  }

  public fun freeTier(freeTier: CfnPricingRule.FreeTierProperty) {
    cdkBuilder.freeTier(freeTier)
  }

  public fun build(): CfnPricingRule.TieringProperty = cdkBuilder.build()
}
