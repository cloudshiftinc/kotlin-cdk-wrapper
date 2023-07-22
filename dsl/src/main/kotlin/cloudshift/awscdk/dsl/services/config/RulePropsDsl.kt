@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleProps
import software.amazon.awscdk.services.config.RuleScope

/**
 * Construction properties for a new rule.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.config.*;
 * Object inputParameters;
 * RuleScope ruleScope;
 * RuleProps ruleProps = RuleProps.builder()
 * .configRuleName("configRuleName")
 * .description("description")
 * .inputParameters(Map.of(
 * "inputParametersKey", inputParameters))
 * .maximumExecutionFrequency(MaximumExecutionFrequency.ONE_HOUR)
 * .ruleScope(ruleScope)
 * .build();
 * ```
 */
@CdkDslMarker
public class RulePropsDsl {
  private val cdkBuilder: RuleProps.Builder = RuleProps.builder()

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
   * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
   */
  public fun ruleScope(ruleScope: RuleScope) {
    cdkBuilder.ruleScope(ruleScope)
  }

  public fun build(): RuleProps = cdkBuilder.build()
}
