@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnBillingGroup
import software.amazon.awscdk.services.iot.CfnBillingGroupProps

/**
 * Properties for defining a `CfnBillingGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnBillingGroupProps cfnBillingGroupProps = CfnBillingGroupProps.builder()
 * .billingGroupName("billingGroupName")
 * .billingGroupProperties(BillingGroupPropertiesProperty.builder()
 * .billingGroupDescription("billingGroupDescription")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-billinggroup.html)
 */
@CdkDslMarker
public class CfnBillingGroupPropsDsl {
  private val cdkBuilder: CfnBillingGroupProps.Builder = CfnBillingGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param billingGroupName The name of the billing group.
   */
  public fun billingGroupName(billingGroupName: String) {
    cdkBuilder.billingGroupName(billingGroupName)
  }

  /**
   * @param billingGroupProperties The properties of the billing group.
   */
  public fun billingGroupProperties(billingGroupProperties: IResolvable) {
    cdkBuilder.billingGroupProperties(billingGroupProperties)
  }

  /**
   * @param billingGroupProperties The properties of the billing group.
   */
  public
      fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty) {
    cdkBuilder.billingGroupProperties(billingGroupProperties)
  }

  /**
   * @param tags Metadata which can be used to manage the billing group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata which can be used to manage the billing group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnBillingGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
