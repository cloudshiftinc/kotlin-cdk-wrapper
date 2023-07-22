@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.CustomPolicyProps
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope

@CdkDslMarker
public class CustomPolicyPropsDsl {
  private val cdkBuilder: CustomPolicyProps.Builder = CustomPolicyProps.builder()

  /**
   * @param configRuleName A name for the AWS Config rule.
   */
  public fun configRuleName(configRuleName: String) {
    cdkBuilder.configRuleName(configRuleName)
  }

  /**
   * @param description A description about this AWS Config rule.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param enableDebugLog The boolean expression for enabling debug logging for your AWS Config
   * Custom Policy rule.
   */
  public fun enableDebugLog(enableDebugLog: Boolean) {
    cdkBuilder.enableDebugLog(enableDebugLog)
  }

  /**
   * @param inputParameters Input parameter values that are passed to the AWS Config rule.
   */
  public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(inputParameters)
    cdkBuilder.inputParameters(builder.map)
  }

  /**
   * @param inputParameters Input parameter values that are passed to the AWS Config rule.
   */
  public fun inputParameters(inputParameters: Map<String, Any>) {
    cdkBuilder.inputParameters(inputParameters)
  }

  /**
   * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
   * evaluations.
   */
  public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  /**
   * @param policyText The policy definition containing the logic for your AWS Config Custom Policy
   * rule. 
   */
  public fun policyText(policyText: String) {
    cdkBuilder.policyText(policyText)
  }

  /**
   * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
   */
  public fun ruleScope(ruleScope: RuleScope) {
    cdkBuilder.ruleScope(ruleScope)
  }

  public fun build(): CustomPolicyProps = cdkBuilder.build()
}
