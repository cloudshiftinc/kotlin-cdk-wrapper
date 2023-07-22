@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.config

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
import software.amazon.awscdk.services.config.MaximumExecutionFrequency
import software.amazon.awscdk.services.config.RuleScope
import software.amazon.awscdk.services.sns.ITopic
import software.constructs.Construct

/**
 * Checks whether your CloudFormation stacks are sending event notifications to a SNS topic.
 *
 * Optionally checks whether specified SNS topics are used.
 *
 * Example:
 *
 * ```
 * // topics to which CloudFormation stacks may send event notifications
 * Topic topic1 = new Topic(this, "AllowedTopic1");
 * Topic topic2 = new Topic(this, "AllowedTopic2");
 * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
 * // non-compliant if CloudFormation stack does not send notifications to 'topic1' or 'topic2'
 * CloudFormationStackNotificationCheck.Builder.create(this, "NotificationCheck")
 * .topics(List.of(topic1, topic2))
 * .build();
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/config/latest/developerguide/cloudformation-stack-notification-check.html)
 */
@CdkDslMarker
public class CloudFormationStackNotificationCheckDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CloudFormationStackNotificationCheck.Builder =
      CloudFormationStackNotificationCheck.Builder.create(scope, id)

  private val _topics: MutableList<ITopic> = mutableListOf()

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

  /**
   * A list of allowed topics.
   *
   * At most 5 topics.
   *
   * Default: - No topics.
   *
   * @param topics A list of allowed topics. 
   */
  public fun topics(vararg topics: ITopic) {
    _topics.addAll(listOf(*topics))
  }

  /**
   * A list of allowed topics.
   *
   * At most 5 topics.
   *
   * Default: - No topics.
   *
   * @param topics A list of allowed topics. 
   */
  public fun topics(topics: Collection<ITopic>) {
    _topics.addAll(topics)
  }

  public fun build(): CloudFormationStackNotificationCheck {
    if(_topics.isNotEmpty()) cdkBuilder.topics(_topics)
    return cdkBuilder.build()
  }
}
