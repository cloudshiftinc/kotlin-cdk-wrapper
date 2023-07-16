@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem

@CdkDslMarker
public class CfnCustomLineItemBillingPeriodRangePropertyDsl {
  private val cdkBuilder: CfnCustomLineItem.BillingPeriodRangeProperty.Builder =
      CfnCustomLineItem.BillingPeriodRangeProperty.builder()

  public fun exclusiveEndBillingPeriod(exclusiveEndBillingPeriod: String) {
    cdkBuilder.exclusiveEndBillingPeriod(exclusiveEndBillingPeriod)
  }

  public fun inclusiveStartBillingPeriod(inclusiveStartBillingPeriod: String) {
    cdkBuilder.inclusiveStartBillingPeriod(inclusiveStartBillingPeriod)
  }

  public fun build(): CfnCustomLineItem.BillingPeriodRangeProperty = cdkBuilder.build()
}
