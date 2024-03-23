@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Construction properties for a CloudFormationStackNotificationCheck.
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
 */
public interface CloudFormationStackNotificationCheckProps : RuleProps {
  /**
   * A list of allowed topics.
   *
   * At most 5 topics.
   *
   * Default: - No topics.
   */
  public fun topics(): List<ITopic> = unwrap(this).getTopics()?.map(ITopic::wrap) ?: emptyList()

  /**
   * A builder for [CloudFormationStackNotificationCheckProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configRuleName A name for the AWS Config rule.
     */
    public fun configRuleName(configRuleName: String)

    /**
     * @param description A description about this AWS Config rule.
     */
    public fun description(description: String)

    /**
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    public fun inputParameters(inputParameters: Map<String, Any>)

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    public fun ruleScope(ruleScope: RuleScope)

    /**
     * @param topics A list of allowed topics.
     * At most 5 topics.
     */
    public fun topics(topics: List<ITopic>)

    /**
     * @param topics A list of allowed topics.
     * At most 5 topics.
     */
    public fun topics(vararg topics: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps.builder()

    /**
     * @param configRuleName A name for the AWS Config rule.
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * @param description A description about this AWS Config rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param inputParameters Input parameter values that are passed to the AWS Config rule.
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
      cdkBuilder.inputParameters(inputParameters)
    }

    /**
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations.
     */
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    /**
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule.
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
    }

    /**
     * @param topics A list of allowed topics.
     * At most 5 topics.
     */
    override fun topics(topics: List<ITopic>) {
      cdkBuilder.topics(topics.map(ITopic::unwrap))
    }

    /**
     * @param topics A list of allowed topics.
     * At most 5 topics.
     */
    override fun topics(vararg topics: ITopic): Unit = topics(topics.toList())

    public fun build():
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps,
  ) : CdkObject(cdkObject), CloudFormationStackNotificationCheckProps {
    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     */
    override fun configRuleName(): String? = unwrap(this).getConfigRuleName()

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     */
    override fun inputParameters(): Map<String, Any> = unwrap(this).getInputParameters() ?:
        emptyMap()

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     */
    override fun maximumExecutionFrequency(): MaximumExecutionFrequency? =
        unwrap(this).getMaximumExecutionFrequency()?.let(MaximumExecutionFrequency::wrap)

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     */
    override fun ruleScope(): RuleScope? = unwrap(this).getRuleScope()?.let(RuleScope::wrap)

    /**
     * A list of allowed topics.
     *
     * At most 5 topics.
     *
     * Default: - No topics.
     */
    override fun topics(): List<ITopic> = unwrap(this).getTopics()?.map(ITopic::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CloudFormationStackNotificationCheckProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps):
        CloudFormationStackNotificationCheckProps = CdkObjectWrappers.wrap(cdkObject) as?
        CloudFormationStackNotificationCheckProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackNotificationCheckProps):
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheckProps
  }
}
