@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnTopicRule

@CdkDslMarker
public class CfnTopicRuleTopicRulePayloadPropertyDsl {
  private val cdkBuilder: CfnTopicRule.TopicRulePayloadProperty.Builder =
      CfnTopicRule.TopicRulePayloadProperty.builder()

  private val _actions: MutableList<Any> = mutableListOf()

  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  public fun awsIotSqlVersion(awsIotSqlVersion: String) {
    cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun errorAction(errorAction: IResolvable) {
    cdkBuilder.errorAction(errorAction)
  }

  public fun errorAction(errorAction: CfnTopicRule.ActionProperty) {
    cdkBuilder.errorAction(errorAction)
  }

  public fun ruleDisabled(ruleDisabled: Boolean) {
    cdkBuilder.ruleDisabled(ruleDisabled)
  }

  public fun ruleDisabled(ruleDisabled: IResolvable) {
    cdkBuilder.ruleDisabled(ruleDisabled)
  }

  public fun sql(sql: String) {
    cdkBuilder.sql(sql)
  }

  public fun build(): CfnTopicRule.TopicRulePayloadProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
