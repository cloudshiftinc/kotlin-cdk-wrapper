@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnPricingRule

@CdkDslMarker
public class CfnPricingRuleFreeTierPropertyDsl {
  private val cdkBuilder: CfnPricingRule.FreeTierProperty.Builder =
      CfnPricingRule.FreeTierProperty.builder()

  /**
   * @param activated Activate or deactivate AWS Free Tier. 
   */
  public fun activated(activated: Boolean) {
    cdkBuilder.activated(activated)
  }

  /**
   * @param activated Activate or deactivate AWS Free Tier. 
   */
  public fun activated(activated: IResolvable) {
    cdkBuilder.activated(activated)
  }

  public fun build(): CfnPricingRule.FreeTierProperty = cdkBuilder.build()
}
