@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.xray

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.xray.CfnSamplingRule
import software.constructs.Construct

@CdkDslMarker
public class CfnSamplingRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSamplingRule.Builder = CfnSamplingRule.Builder.create(scope, id)

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

  public fun build(): CfnSamplingRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
