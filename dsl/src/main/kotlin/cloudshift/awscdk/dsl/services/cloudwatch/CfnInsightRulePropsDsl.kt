@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.cloudwatch.CfnInsightRuleProps

@CdkDslMarker
public class CfnInsightRulePropsDsl {
  private val cdkBuilder: CfnInsightRuleProps.Builder = CfnInsightRuleProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun ruleBody(ruleBody: String) {
    cdkBuilder.ruleBody(ruleBody)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun ruleState(ruleState: String) {
    cdkBuilder.ruleState(ruleState)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnInsightRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
