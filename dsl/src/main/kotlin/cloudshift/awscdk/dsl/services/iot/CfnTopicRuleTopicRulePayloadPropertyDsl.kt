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

  /**
   * @param actions The actions associated with the rule. 
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The actions associated with the rule. 
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * @param actions The actions associated with the rule. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param awsIotSqlVersion The version of the SQL rules engine to use when evaluating the rule.
   * The default value is 2015-10-08.
   */
  public fun awsIotSqlVersion(awsIotSqlVersion: String) {
    cdkBuilder.awsIotSqlVersion(awsIotSqlVersion)
  }

  /**
   * @param description The description of the rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param errorAction The action to take when an error occurs.
   */
  public fun errorAction(errorAction: IResolvable) {
    cdkBuilder.errorAction(errorAction)
  }

  /**
   * @param errorAction The action to take when an error occurs.
   */
  public fun errorAction(errorAction: CfnTopicRule.ActionProperty) {
    cdkBuilder.errorAction(errorAction)
  }

  /**
   * @param ruleDisabled Specifies whether the rule is disabled.
   */
  public fun ruleDisabled(ruleDisabled: Boolean) {
    cdkBuilder.ruleDisabled(ruleDisabled)
  }

  /**
   * @param ruleDisabled Specifies whether the rule is disabled.
   */
  public fun ruleDisabled(ruleDisabled: IResolvable) {
    cdkBuilder.ruleDisabled(ruleDisabled)
  }

  /**
   * @param sql The SQL statement used to query the topic. 
   * For more information, see [AWS IoT SQL
   * Reference](https://docs.aws.amazon.com/iot/latest/developerguide/iot-sql-reference.html) in the
   * *AWS IoT Developer Guide* .
   */
  public fun sql(sql: String) {
    cdkBuilder.sql(sql)
  }

  public fun build(): CfnTopicRule.TopicRulePayloadProperty {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
