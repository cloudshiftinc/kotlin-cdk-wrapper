@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.CustomRule
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.lambda.IFunction
import software.constructs.Construct

/**
 * A new custom rule.
 *
 * Example:
 *
 * ```
 * // Lambda function containing logic that evaluates compliance with the rule.
 * Function evalComplianceFn = Function.Builder.create(this, "CustomFunction")
 * .code(AssetCode.fromInline("exports.handler = (event) =&gt; console.log(event);"))
 * .handler("index.handler")
 * .runtime(Runtime.NODEJS_18_X)
 * .build();
 * // A custom rule that runs on configuration changes of EC2 instances
 * CustomRule customRule = CustomRule.Builder.create(this, "Custom")
 * .configurationChanges(true)
 * .lambdaFunction(evalComplianceFn)
 * .ruleScope(RuleScope.fromResource(ResourceType.EC2_INSTANCE))
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomRuleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CustomRule.Builder = CustomRule.Builder.create(scope, id)

  /**
   * A name for the AWS Config rule.
   *
   * Default: - CloudFormation generated name
   *
   * @param configRuleName A name for the AWS Config rule. 
   */
  public fun configRuleName(configRuleName: String) {
    cdkBuilder.configRuleName(configRuleName)
  }

  /**
   * Whether to run the rule on configuration changes.
   *
   * Default: false
   *
   * @param configurationChanges Whether to run the rule on configuration changes. 
   */
  public fun configurationChanges(configurationChanges: Boolean) {
    cdkBuilder.configurationChanges(configurationChanges)
  }

  /**
   * A description about this AWS Config rule.
   *
   * Default: - No description
   *
   * @param description A description about this AWS Config rule. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * Input parameter values that are passed to the AWS Config rule.
   *
   * Default: - No input parameters
   *
   * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
   */
  public fun inputParameters(inputParameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(inputParameters)
    cdkBuilder.inputParameters(builder.map)
  }

  /**
   * Input parameter values that are passed to the AWS Config rule.
   *
   * Default: - No input parameters
   *
   * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
   */
  public fun inputParameters(inputParameters: Map<String, Any>) {
    cdkBuilder.inputParameters(inputParameters)
  }

  /**
   * The Lambda function to run.
   *
   * @param lambdaFunction The Lambda function to run. 
   */
  public fun lambdaFunction(lambdaFunction: IFunction) {
    cdkBuilder.lambdaFunction(lambdaFunction)
  }

  /**
   * The maximum frequency at which the AWS Config rule runs evaluations.
   *
   * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
   *
   * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
   * evaluations. 
   */
  public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
    cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency)
  }

  /**
   * Whether to run the rule on a fixed frequency.
   *
   * Default: false
   *
   * @param periodic Whether to run the rule on a fixed frequency. 
   */
  public fun periodic(periodic: Boolean) {
    cdkBuilder.periodic(periodic)
  }

  /**
   * Defines which resources trigger an evaluation for an AWS Config rule.
   *
   * Default: - evaluations for the rule are triggered when any resource in the recording group
   * changes.
   *
   * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
   */
  public fun ruleScope(ruleScope: RuleScope) {
    cdkBuilder.ruleScope(ruleScope)
  }

  public fun build(): CustomRule = cdkBuilder.build()
}
