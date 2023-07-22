@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnFirewallPolicy

/**
 * The traffic filtering behavior of a firewall policy, defined in a collection of stateless and
 * stateful rule groups and other settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * FirewallPolicyProperty firewallPolicyProperty = FirewallPolicyProperty.builder()
 * .statelessDefaultActions(List.of("statelessDefaultActions"))
 * .statelessFragmentDefaultActions(List.of("statelessFragmentDefaultActions"))
 * // the properties below are optional
 * .policyVariables(PolicyVariablesProperty.builder()
 * .ruleVariables(Map.of(
 * "ruleVariablesKey", Map.of(
 * "definition", List.of("definition"))))
 * .build())
 * .statefulDefaultActions(List.of("statefulDefaultActions"))
 * .statefulEngineOptions(StatefulEngineOptionsProperty.builder()
 * .ruleOrder("ruleOrder")
 * .streamExceptionPolicy("streamExceptionPolicy")
 * .build())
 * .statefulRuleGroupReferences(List.of(StatefulRuleGroupReferenceProperty.builder()
 * .resourceArn("resourceArn")
 * // the properties below are optional
 * .override(StatefulRuleGroupOverrideProperty.builder()
 * .action("action")
 * .build())
 * .priority(123)
 * .build()))
 * .statelessCustomActions(List.of(CustomActionProperty.builder()
 * .actionDefinition(ActionDefinitionProperty.builder()
 * .publishMetricAction(PublishMetricActionProperty.builder()
 * .dimensions(List.of(DimensionProperty.builder()
 * .value("value")
 * .build()))
 * .build())
 * .build())
 * .actionName("actionName")
 * .build()))
 * .statelessRuleGroupReferences(List.of(StatelessRuleGroupReferenceProperty.builder()
 * .priority(123)
 * .resourceArn("resourceArn")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-firewallpolicy-firewallpolicy.html)
 */
@CdkDslMarker
public class CfnFirewallPolicyFirewallPolicyPropertyDsl {
  private val cdkBuilder: CfnFirewallPolicy.FirewallPolicyProperty.Builder =
      CfnFirewallPolicy.FirewallPolicyProperty.builder()

  private val _statefulDefaultActions: MutableList<String> = mutableListOf()

  private val _statefulRuleGroupReferences: MutableList<Any> = mutableListOf()

  private val _statelessCustomActions: MutableList<Any> = mutableListOf()

  private val _statelessDefaultActions: MutableList<String> = mutableListOf()

  private val _statelessFragmentDefaultActions: MutableList<String> = mutableListOf()

  private val _statelessRuleGroupReferences: MutableList<Any> = mutableListOf()

  /**
   * @param policyVariables Contains variables that you can use to override default Suricata
   * settings in your firewall policy.
   */
  public fun policyVariables(policyVariables: IResolvable) {
    cdkBuilder.policyVariables(policyVariables)
  }

  /**
   * @param policyVariables Contains variables that you can use to override default Suricata
   * settings in your firewall policy.
   */
  public fun policyVariables(policyVariables: CfnFirewallPolicy.PolicyVariablesProperty) {
    cdkBuilder.policyVariables(policyVariables)
  }

  /**
   * @param statefulDefaultActions The default actions to take on a packet that doesn't match any
   * stateful rules.
   * The stateful default action is optional, and is only valid when using the strict rule order.
   *
   * Valid values of the stateful default action:
   *
   * * aws:drop_strict
   * * aws:drop_established
   * * aws:alert_strict
   * * aws:alert_established
   *
   * For more information, see [Strict evaluation
   * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
   * in the *AWS Network Firewall Developer Guide* .
   */
  public fun statefulDefaultActions(vararg statefulDefaultActions: String) {
    _statefulDefaultActions.addAll(listOf(*statefulDefaultActions))
  }

  /**
   * @param statefulDefaultActions The default actions to take on a packet that doesn't match any
   * stateful rules.
   * The stateful default action is optional, and is only valid when using the strict rule order.
   *
   * Valid values of the stateful default action:
   *
   * * aws:drop_strict
   * * aws:drop_established
   * * aws:alert_strict
   * * aws:alert_established
   *
   * For more information, see [Strict evaluation
   * order](https://docs.aws.amazon.com/network-firewall/latest/developerguide/suricata-rule-evaluation-order.html#suricata-strict-rule-evaluation-order.html)
   * in the *AWS Network Firewall Developer Guide* .
   */
  public fun statefulDefaultActions(statefulDefaultActions: Collection<String>) {
    _statefulDefaultActions.addAll(statefulDefaultActions)
  }

  /**
   * @param statefulEngineOptions Additional options governing how Network Firewall handles stateful
   * rules.
   * The stateful rule groups that you use in your policy must have stateful rule options settings
   * that are compatible with these settings.
   */
  public fun statefulEngineOptions(statefulEngineOptions: IResolvable) {
    cdkBuilder.statefulEngineOptions(statefulEngineOptions)
  }

  /**
   * @param statefulEngineOptions Additional options governing how Network Firewall handles stateful
   * rules.
   * The stateful rule groups that you use in your policy must have stateful rule options settings
   * that are compatible with these settings.
   */
  public
      fun statefulEngineOptions(statefulEngineOptions: CfnFirewallPolicy.StatefulEngineOptionsProperty) {
    cdkBuilder.statefulEngineOptions(statefulEngineOptions)
  }

  /**
   * @param statefulRuleGroupReferences References to the stateful rule groups that are used in the
   * policy.
   * These define the inspection criteria in stateful rules.
   */
  public fun statefulRuleGroupReferences(vararg statefulRuleGroupReferences: Any) {
    _statefulRuleGroupReferences.addAll(listOf(*statefulRuleGroupReferences))
  }

  /**
   * @param statefulRuleGroupReferences References to the stateful rule groups that are used in the
   * policy.
   * These define the inspection criteria in stateful rules.
   */
  public fun statefulRuleGroupReferences(statefulRuleGroupReferences: Collection<Any>) {
    _statefulRuleGroupReferences.addAll(statefulRuleGroupReferences)
  }

  /**
   * @param statefulRuleGroupReferences References to the stateful rule groups that are used in the
   * policy.
   * These define the inspection criteria in stateful rules.
   */
  public fun statefulRuleGroupReferences(statefulRuleGroupReferences: IResolvable) {
    cdkBuilder.statefulRuleGroupReferences(statefulRuleGroupReferences)
  }

  /**
   * @param statelessCustomActions The custom action definitions that are available for use in the
   * firewall policy's `StatelessDefaultActions` setting.
   * You name each custom action that you define, and then you can use it by name in your default
   * actions specifications.
   */
  public fun statelessCustomActions(vararg statelessCustomActions: Any) {
    _statelessCustomActions.addAll(listOf(*statelessCustomActions))
  }

  /**
   * @param statelessCustomActions The custom action definitions that are available for use in the
   * firewall policy's `StatelessDefaultActions` setting.
   * You name each custom action that you define, and then you can use it by name in your default
   * actions specifications.
   */
  public fun statelessCustomActions(statelessCustomActions: Collection<Any>) {
    _statelessCustomActions.addAll(statelessCustomActions)
  }

  /**
   * @param statelessCustomActions The custom action definitions that are available for use in the
   * firewall policy's `StatelessDefaultActions` setting.
   * You name each custom action that you define, and then you can use it by name in your default
   * actions specifications.
   */
  public fun statelessCustomActions(statelessCustomActions: IResolvable) {
    cdkBuilder.statelessCustomActions(statelessCustomActions)
  }

  /**
   * @param statelessDefaultActions The actions to take on a packet if it doesn't match any of the
   * stateless rules in the policy. 
   * If you want non-matching packets to be forwarded for stateful inspection, specify
   * `aws:forward_to_sfe` .
   *
   * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or `aws:forward_to_sfe`
   * . In addition, you can specify custom actions that are compatible with your standard section
   * choice.
   *
   * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
   * “customActionName”]` . For information about compatibility, see the custom action descriptions.
   */
  public fun statelessDefaultActions(vararg statelessDefaultActions: String) {
    _statelessDefaultActions.addAll(listOf(*statelessDefaultActions))
  }

  /**
   * @param statelessDefaultActions The actions to take on a packet if it doesn't match any of the
   * stateless rules in the policy. 
   * If you want non-matching packets to be forwarded for stateful inspection, specify
   * `aws:forward_to_sfe` .
   *
   * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or `aws:forward_to_sfe`
   * . In addition, you can specify custom actions that are compatible with your standard section
   * choice.
   *
   * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
   * “customActionName”]` . For information about compatibility, see the custom action descriptions.
   */
  public fun statelessDefaultActions(statelessDefaultActions: Collection<String>) {
    _statelessDefaultActions.addAll(statelessDefaultActions)
  }

  /**
   * @param statelessFragmentDefaultActions The actions to take on a fragmented packet if it doesn't
   * match any of the stateless rules in the policy. 
   * If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
   * `aws:forward_to_sfe` .
   *
   * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or `aws:forward_to_sfe`
   * . In addition, you can specify custom actions that are compatible with your standard section
   * choice.
   *
   * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
   * “customActionName”]` . For information about compatibility, see the custom action descriptions.
   */
  public fun statelessFragmentDefaultActions(vararg statelessFragmentDefaultActions: String) {
    _statelessFragmentDefaultActions.addAll(listOf(*statelessFragmentDefaultActions))
  }

  /**
   * @param statelessFragmentDefaultActions The actions to take on a fragmented packet if it doesn't
   * match any of the stateless rules in the policy. 
   * If you want non-matching fragmented packets to be forwarded for stateful inspection, specify
   * `aws:forward_to_sfe` .
   *
   * You must specify one of the standard actions: `aws:pass` , `aws:drop` , or `aws:forward_to_sfe`
   * . In addition, you can specify custom actions that are compatible with your standard section
   * choice.
   *
   * For example, you could specify `["aws:pass"]` or you could specify `["aws:pass",
   * “customActionName”]` . For information about compatibility, see the custom action descriptions.
   */
  public fun statelessFragmentDefaultActions(statelessFragmentDefaultActions: Collection<String>) {
    _statelessFragmentDefaultActions.addAll(statelessFragmentDefaultActions)
  }

  /**
   * @param statelessRuleGroupReferences References to the stateless rule groups that are used in
   * the policy.
   * These define the matching criteria in stateless rules.
   */
  public fun statelessRuleGroupReferences(vararg statelessRuleGroupReferences: Any) {
    _statelessRuleGroupReferences.addAll(listOf(*statelessRuleGroupReferences))
  }

  /**
   * @param statelessRuleGroupReferences References to the stateless rule groups that are used in
   * the policy.
   * These define the matching criteria in stateless rules.
   */
  public fun statelessRuleGroupReferences(statelessRuleGroupReferences: Collection<Any>) {
    _statelessRuleGroupReferences.addAll(statelessRuleGroupReferences)
  }

  /**
   * @param statelessRuleGroupReferences References to the stateless rule groups that are used in
   * the policy.
   * These define the matching criteria in stateless rules.
   */
  public fun statelessRuleGroupReferences(statelessRuleGroupReferences: IResolvable) {
    cdkBuilder.statelessRuleGroupReferences(statelessRuleGroupReferences)
  }

  public fun build(): CfnFirewallPolicy.FirewallPolicyProperty {
    if(_statefulDefaultActions.isNotEmpty())
        cdkBuilder.statefulDefaultActions(_statefulDefaultActions)
    if(_statefulRuleGroupReferences.isNotEmpty())
        cdkBuilder.statefulRuleGroupReferences(_statefulRuleGroupReferences)
    if(_statelessCustomActions.isNotEmpty())
        cdkBuilder.statelessCustomActions(_statelessCustomActions)
    if(_statelessDefaultActions.isNotEmpty())
        cdkBuilder.statelessDefaultActions(_statelessDefaultActions)
    if(_statelessFragmentDefaultActions.isNotEmpty())
        cdkBuilder.statelessFragmentDefaultActions(_statelessFragmentDefaultActions)
    if(_statelessRuleGroupReferences.isNotEmpty())
        cdkBuilder.statelessRuleGroupReferences(_statelessRuleGroupReferences)
    return cdkBuilder.build()
  }
}
