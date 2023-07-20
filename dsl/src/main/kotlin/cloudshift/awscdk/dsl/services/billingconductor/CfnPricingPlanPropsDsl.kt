@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.billingconductor

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.billingconductor.CfnPricingPlanProps

@CdkDslMarker
public class CfnPricingPlanPropsDsl {
  private val cdkBuilder: CfnPricingPlanProps.Builder = CfnPricingPlanProps.builder()

  private val _pricingRuleArns: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun pricingRuleArns(vararg pricingRuleArns: String) {
    _pricingRuleArns.addAll(listOf(*pricingRuleArns))
  }

  public fun pricingRuleArns(pricingRuleArns: Collection<String>) {
    _pricingRuleArns.addAll(pricingRuleArns)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnPricingPlanProps {
    if(_pricingRuleArns.isNotEmpty()) cdkBuilder.pricingRuleArns(_pricingRuleArns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
