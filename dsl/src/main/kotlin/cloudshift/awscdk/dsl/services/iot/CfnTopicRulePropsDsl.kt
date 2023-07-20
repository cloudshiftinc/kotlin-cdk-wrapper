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
import software.amazon.awscdk.services.iot.CfnTopicRule
import software.amazon.awscdk.services.iot.CfnTopicRuleProps

@CdkDslMarker
public class CfnTopicRulePropsDsl {
  private val cdkBuilder: CfnTopicRuleProps.Builder = CfnTopicRuleProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun ruleName(ruleName: String) {
    cdkBuilder.ruleName(ruleName)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun topicRulePayload(topicRulePayload: IResolvable) {
    cdkBuilder.topicRulePayload(topicRulePayload)
  }

  public fun topicRulePayload(topicRulePayload: CfnTopicRule.TopicRulePayloadProperty) {
    cdkBuilder.topicRulePayload(topicRulePayload)
  }

  public fun build(): CfnTopicRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
