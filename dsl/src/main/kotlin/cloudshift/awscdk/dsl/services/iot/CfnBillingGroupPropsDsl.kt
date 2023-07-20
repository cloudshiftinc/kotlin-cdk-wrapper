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

@CdkDslMarker
public class CfnBillingGroupPropsDsl {
  private val cdkBuilder: CfnBillingGroupProps.Builder = CfnBillingGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun billingGroupName(billingGroupName: String) {
    cdkBuilder.billingGroupName(billingGroupName)
  }

  public fun billingGroupProperties(billingGroupProperties: IResolvable) {
    cdkBuilder.billingGroupProperties(billingGroupProperties)
  }

  public
      fun billingGroupProperties(billingGroupProperties: CfnBillingGroup.BillingGroupPropertiesProperty) {
    cdkBuilder.billingGroupProperties(billingGroupProperties)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnBillingGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
