@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import software.constructs.Construct

@CdkDslMarker
public class CfnListenerRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnListenerRule.Builder = CfnListenerRule.Builder.create(scope, id)

  private val _actions: MutableList<Any> = mutableListOf()

  private val _conditions: MutableList<Any> = mutableListOf()

  /**
   * The actions.
   *
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
   * @param actions The actions. 
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * The actions.
   *
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
   * @param actions The actions. 
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * The actions.
   *
   * The rule must include exactly one of the following types of actions: `forward` ,
   * `fixed-response` , or `redirect` , and it must be the last action to be performed. If the rule is
   * for an HTTPS listener, it can also optionally include an authentication action.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-actions)
   * @param actions The actions. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * The conditions.
   *
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
   * @param conditions The conditions. 
   */
  public fun conditions(vararg conditions: Any) {
    _conditions.addAll(listOf(*conditions))
  }

  /**
   * The conditions.
   *
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
   * @param conditions The conditions. 
   */
  public fun conditions(conditions: Collection<Any>) {
    _conditions.addAll(conditions)
  }

  /**
   * The conditions.
   *
   * The rule can optionally include up to one of each of the following conditions:
   * `http-request-method` , `host-header` , `path-pattern` , and `source-ip` . A rule can also
   * optionally include one or more of each of the following conditions: `http-header` and
   * `query-string` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-conditions)
   * @param conditions The conditions. 
   */
  public fun conditions(conditions: IResolvable) {
    cdkBuilder.conditions(conditions)
  }

  /**
   * The Amazon Resource Name (ARN) of the listener.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-listenerarn)
   * @param listenerArn The Amazon Resource Name (ARN) of the listener. 
   */
  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  /**
   * The rule priority. A listener can't have multiple rules with the same priority.
   *
   * If you try to reorder rules by updating their priorities, do not specify a new priority if an
   * existing rule already uses this priority, as this can cause an error. If you need to reuse a
   * priority with a different rule, you must remove it as a priority first, and then specify it in a
   * subsequent update.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-listenerrule.html#cfn-elasticloadbalancingv2-listenerrule-priority)
   * @param priority The rule priority. A listener can't have multiple rules with the same priority.
   * 
   */
  public fun priority(priority: Number) {
    cdkBuilder.priority(priority)
  }

  public fun build(): CfnListenerRule {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    if(_conditions.isNotEmpty()) cdkBuilder.conditions(_conditions)
    return cdkBuilder.build()
  }
}
