@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.amazon.awscdk.services.xray.CfnSamplingRuleProps

@CdkDslMarker
public class CfnSamplingRulePropsDsl {
  private val cdkBuilder: CfnSamplingRuleProps.Builder = CfnSamplingRuleProps.builder()

  private val _tags: MutableList<Any> = mutableListOf()

  public fun samplingRule(samplingRule: IResolvable) {
    cdkBuilder.samplingRule(samplingRule)
  }

  public fun samplingRule(samplingRule: CfnSamplingRule.SamplingRuleProperty) {
    cdkBuilder.samplingRule(samplingRule)
  }

  public fun tags(vararg tags: Any) {
    _tags.addAll(listOf(*tags))
  }

  public fun tags(tags: Collection<Any>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnSamplingRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
