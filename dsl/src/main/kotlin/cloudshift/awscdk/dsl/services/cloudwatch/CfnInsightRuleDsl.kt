@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudwatch.CfnInsightRule
import software.constructs.Construct

@CdkDslMarker
public class CfnInsightRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInsightRule.Builder = CfnInsightRule.Builder.create(scope, id)

  private val _tags: MutableList<Any> = mutableListOf()

  public fun ruleBody(ruleBody: String) {
    cdkBuilder.ruleBody(ruleBody)
  }

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun ruleState(ruleState: String) {
    cdkBuilder.ruleState(ruleState)
  }

  public fun tags(vararg tags: Any) {
    _tags.addAll(listOf(*tags))
  }

  public fun tags(tags: Collection<Any>) {
    _tags.addAll(tags)
  }

  public fun tags(tags: IResolvable) {
    cdkBuilder.tags(tags)
  }

  public fun build(): CfnInsightRule {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
