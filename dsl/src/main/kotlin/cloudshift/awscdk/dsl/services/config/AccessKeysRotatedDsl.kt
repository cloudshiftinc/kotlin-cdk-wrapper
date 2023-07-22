@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.config.AccessKeysRotated
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.constructs.Construct

@CdkDslMarker
public class AccessKeysRotatedDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: AccessKeysRotated.Builder = AccessKeysRotated.Builder.create(scope, id)

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
   * The maximum number of days within which the access keys must be rotated.
   *
   * Default: Duration.days(90)
   *
   * @param maxAge The maximum number of days within which the access keys must be rotated. 
   */
  public fun maxAge(maxAge: Duration) {
    cdkBuilder.maxAge(maxAge)
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

  public fun build(): AccessKeysRotated = cdkBuilder.build()
}
