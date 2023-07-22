@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItem
import software.amazon.awscdk.services.billingconductor.CfnCustomLineItemProps

@CdkDslMarker
public class CfnCustomLineItemPropsDsl {
  private val cdkBuilder: CfnCustomLineItemProps.Builder = CfnCustomLineItemProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
   * the custom line item applies to. 
   */
  public fun billingGroupArn(billingGroupArn: String) {
    cdkBuilder.billingGroupArn(billingGroupArn)
  }

  /**
   * @param billingPeriodRange A time range for which the custom line item is effective.
   */
  public fun billingPeriodRange(billingPeriodRange: IResolvable) {
    cdkBuilder.billingPeriodRange(billingPeriodRange)
  }

  /**
   * @param billingPeriodRange A time range for which the custom line item is effective.
   */
  public fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty) {
    cdkBuilder.billingPeriodRange(billingPeriodRange)
  }

  /**
   * @param customLineItemChargeDetails The charge details of a custom line item.
   * It should contain only one of `Flat` or `Percentage` .
   */
  public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
    cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
  }

  /**
   * @param customLineItemChargeDetails The charge details of a custom line item.
   * It should contain only one of `Flat` or `Percentage` .
   */
  public
      fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty) {
    cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
  }

  /**
   * @param description The custom line item's description.
   * This is shown on the Bills page in association with the charge value.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The custom line item's name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags A map that contains tag keys and tag values that are attached to a custom line
   * item.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A map that contains tag keys and tag values that are attached to a custom line
   * item.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCustomLineItemProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
