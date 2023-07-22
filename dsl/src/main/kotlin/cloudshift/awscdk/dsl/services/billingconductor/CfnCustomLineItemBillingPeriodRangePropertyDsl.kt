@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem

@CdkDslMarker
public class CfnCustomLineItemBillingPeriodRangePropertyDsl {
  private val cdkBuilder: CfnCustomLineItem.BillingPeriodRangeProperty.Builder =
      CfnCustomLineItem.BillingPeriodRangeProperty.builder()

  /**
   * @param exclusiveEndBillingPeriod The exclusive end billing period that defines a billing period
   * range where a custom line is applied.
   */
  public fun exclusiveEndBillingPeriod(exclusiveEndBillingPeriod: String) {
    cdkBuilder.exclusiveEndBillingPeriod(exclusiveEndBillingPeriod)
  }

  /**
   * @param inclusiveStartBillingPeriod The inclusive start billing period that defines a billing
   * period range where a custom line is applied.
   */
  public fun inclusiveStartBillingPeriod(inclusiveStartBillingPeriod: String) {
    cdkBuilder.inclusiveStartBillingPeriod(inclusiveStartBillingPeriod)
  }

  public fun build(): CfnCustomLineItem.BillingPeriodRangeProperty = cdkBuilder.build()
}
