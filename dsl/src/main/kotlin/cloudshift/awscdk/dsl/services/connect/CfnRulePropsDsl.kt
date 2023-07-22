@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnRule
import software.amazon.awscdk.services.connect.CfnRuleProps

@CdkDslMarker
public class CfnRulePropsDsl {
  private val cdkBuilder: CfnRuleProps.Builder = CfnRuleProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param actions A list of actions to be run when the rule is triggered. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param actions A list of actions to be run when the rule is triggered. 
   */
  public fun actions(actions: CfnRule.ActionsProperty) {
    cdkBuilder.actions(actions)
  }

  /**
   * @param function The conditions of the rule. 
   */
  public fun function(function: String) {
    cdkBuilder.function(function)
  }

  /**
   * @param instanceArn The Amazon Resource Name (ARN) of the instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param name The name of the rule. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param publishStatus The publish status of the rule. 
   * *Allowed values* : `DRAFT` | `PUBLISHED`
   */
  public fun publishStatus(publishStatus: String) {
    cdkBuilder.publishStatus(publishStatus)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param triggerEventSource The event source to trigger the rule. 
   */
  public fun triggerEventSource(triggerEventSource: IResolvable) {
    cdkBuilder.triggerEventSource(triggerEventSource)
  }

  /**
   * @param triggerEventSource The event source to trigger the rule. 
   */
  public fun triggerEventSource(triggerEventSource: CfnRule.RuleTriggerEventSourceProperty) {
    cdkBuilder.triggerEventSource(triggerEventSource)
  }

  public fun build(): CfnRuleProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
