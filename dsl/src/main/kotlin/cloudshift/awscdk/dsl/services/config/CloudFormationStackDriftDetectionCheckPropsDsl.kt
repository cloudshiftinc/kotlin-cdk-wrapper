@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.services.config.CloudFormationStackDriftDetectionCheckProps
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.iam.IRole

@CdkDslMarker
public class CloudFormationStackDriftDetectionCheckPropsDsl {
  private val cdkBuilder: CloudFormationStackDriftDetectionCheckProps.Builder =
      CloudFormationStackDriftDetectionCheckProps.builder()

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
   * @param ownStackOnly Whether to check only the stack where this rule is deployed.
   */
  public fun ownStackOnly(ownStackOnly: Boolean) {
    cdkBuilder.ownStackOnly(ownStackOnly)
  }

  /**
   * @param role The IAM role to use for this rule.
   * It must have permissions to detect drift
   * for AWS CloudFormation stacks. Ensure to attach `config.amazonaws.com` trusted
   * permissions and `ReadOnlyAccess` policy permissions. For specific policy permissions,
   * refer to
   * https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
   */
  public fun ruleScope(ruleScope: RuleScope) {
    cdkBuilder.ruleScope(ruleScope)
  }

  public fun build(): CloudFormationStackDriftDetectionCheckProps = cdkBuilder.build()
}
