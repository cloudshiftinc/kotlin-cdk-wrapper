@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem

@CdkDslMarker
public class CfnCustomLineItemCustomLineItemChargeDetailsPropertyDsl {
  private val cdkBuilder: CfnCustomLineItem.CustomLineItemChargeDetailsProperty.Builder =
      CfnCustomLineItem.CustomLineItemChargeDetailsProperty.builder()

  /**
   * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
   * custom line item.
   */
  public fun flat(flat: IResolvable) {
    cdkBuilder.flat(flat)
  }

  /**
   * @param flat A `CustomLineItemFlatChargeDetails` that describes the charge details of a flat
   * custom line item.
   */
  public fun flat(flat: CfnCustomLineItem.CustomLineItemFlatChargeDetailsProperty) {
    cdkBuilder.flat(flat)
  }

  /**
   * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge details
   * of a percentage custom line item.
   */
  public fun percentage(percentage: IResolvable) {
    cdkBuilder.percentage(percentage)
  }

  /**
   * @param percentage A `CustomLineItemPercentageChargeDetails` that describes the charge details
   * of a percentage custom line item.
   */
  public
      fun percentage(percentage: CfnCustomLineItem.CustomLineItemPercentageChargeDetailsProperty) {
    cdkBuilder.percentage(percentage)
  }

  /**
   * @param type The type of the custom line item that indicates whether the charge is a fee or
   * credit. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnCustomLineItem.CustomLineItemChargeDetailsProperty = cdkBuilder.build()
}
