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
import software.constructs.Construct

@CdkDslMarker
public class CfnCustomLineItemDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCustomLineItem.Builder = CfnCustomLineItem.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The Amazon Resource Name (ARN) that references the billing group where the custom line item
   * applies to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billinggrouparn)
   * @param billingGroupArn The Amazon Resource Name (ARN) that references the billing group where
   * the custom line item applies to. 
   */
  public fun billingGroupArn(billingGroupArn: String) {
    cdkBuilder.billingGroupArn(billingGroupArn)
  }

  /**
   * A time range for which the custom line item is effective.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
   * @param billingPeriodRange A time range for which the custom line item is effective. 
   */
  public fun billingPeriodRange(billingPeriodRange: IResolvable) {
    cdkBuilder.billingPeriodRange(billingPeriodRange)
  }

  /**
   * A time range for which the custom line item is effective.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-billingperiodrange)
   * @param billingPeriodRange A time range for which the custom line item is effective. 
   */
  public fun billingPeriodRange(billingPeriodRange: CfnCustomLineItem.BillingPeriodRangeProperty) {
    cdkBuilder.billingPeriodRange(billingPeriodRange)
  }

  /**
   * The charge details of a custom line item.
   *
   * It should contain only one of `Flat` or `Percentage` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
   * @param customLineItemChargeDetails The charge details of a custom line item. 
   */
  public fun customLineItemChargeDetails(customLineItemChargeDetails: IResolvable) {
    cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
  }

  /**
   * The charge details of a custom line item.
   *
   * It should contain only one of `Flat` or `Percentage` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-customlineitemchargedetails)
   * @param customLineItemChargeDetails The charge details of a custom line item. 
   */
  public
      fun customLineItemChargeDetails(customLineItemChargeDetails: CfnCustomLineItem.CustomLineItemChargeDetailsProperty) {
    cdkBuilder.customLineItemChargeDetails(customLineItemChargeDetails)
  }

  /**
   * The custom line item's description.
   *
   * This is shown on the Bills page in association with the charge value.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-description)
   * @param description The custom line item's description. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The custom line item's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-name)
   * @param name The custom line item's name. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * A map that contains tag keys and tag values that are attached to a custom line item.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
   * @param tags A map that contains tag keys and tag values that are attached to a custom line
   * item. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * A map that contains tag keys and tag values that are attached to a custom line item.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-billingconductor-customlineitem.html#cfn-billingconductor-customlineitem-tags)
   * @param tags A map that contains tag keys and tag values that are attached to a custom line
   * item. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCustomLineItem {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
