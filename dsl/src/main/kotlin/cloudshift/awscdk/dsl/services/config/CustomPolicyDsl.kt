@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.CustomPolicy
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.constructs.Construct

/**
 * A new custom policy.
 *
 * Example:
 *
 * ```
 * String samplePolicyText = "\n# This rule checks if point in time recovery (PITR) is enabled on
 * active Amazon DynamoDB tables\nlet status = ['ACTIVE']\n\nrule tableisactive when\n    resourceType
 * == \"AWS::DynamoDB::Table\" {\n    configuration.tableStatus == %status\n}\n\nrule checkcompliance
 * when\n    resourceType == \"AWS::DynamoDB::Table\"\n    tableisactive {\n        let pitr =
 * supplementaryConfiguration.ContinuousBackupsDescription.pointInTimeRecoveryDescription.pointInTimeRecoveryStatus\n
 *        %pitr == \"ENABLED\"\n}\n";
 * CustomPolicy.Builder.create(this, "Custom")
 * .policyText(samplePolicyText)
 * .enableDebugLog(true)
 * .ruleScope(RuleScope.fromResources(List.of(ResourceType.DYNAMODB_TABLE)))
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CustomPolicy.Builder = CustomPolicy.Builder.create(scope, id)

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
   * The boolean expression for enabling debug logging for your AWS Config Custom Policy rule.
   *
   * Default: false
   *
   * @param enableDebugLog The boolean expression for enabling debug logging for your AWS Config
   * Custom Policy rule. 
   */
  public fun enableDebugLog(enableDebugLog: Boolean) {
    cdkBuilder.enableDebugLog(enableDebugLog)
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
   * The policy definition containing the logic for your AWS Config Custom Policy rule.
   *
   * @param policyText The policy definition containing the logic for your AWS Config Custom Policy
   * rule. 
   */
  public fun policyText(policyText: String) {
    cdkBuilder.policyText(policyText)
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

  public fun build(): CustomPolicy = cdkBuilder.build()
}
