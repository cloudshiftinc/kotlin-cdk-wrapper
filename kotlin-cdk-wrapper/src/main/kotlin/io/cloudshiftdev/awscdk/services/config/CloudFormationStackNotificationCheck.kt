@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.config

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
public open class CloudFormationStackNotificationCheck(
  cdkObject: software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck,
) : ManagedRule(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CloudFormationStackNotificationCheckProps,
  ) :
      this(software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CloudFormationStackNotificationCheckProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CloudFormationStackNotificationCheckProps.Builder.() -> Unit,
  ) : this(scope, id, CloudFormationStackNotificationCheckProps(props)
  )

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.config.CloudFormationStackNotificationCheck].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule. 
     */
    public fun configRuleName(configRuleName: String)

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule. 
     */
    public fun description(description: String)

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
     */
    public fun inputParameters(inputParameters: Map<String, Any>)

    /**
     * The maximum frequency at which the AWS Config rule runs evaluations.
     *
     * Default: MaximumExecutionFrequency.TWENTY_FOUR_HOURS
     *
     * @param maximumExecutionFrequency The maximum frequency at which the AWS Config rule runs
     * evaluations. 
     */
    public fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency)

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
     */
    public fun ruleScope(ruleScope: RuleScope)

    /**
     * A list of allowed topics.
     *
     * At most 5 topics.
     *
     * Default: - No topics.
     *
     * @param topics A list of allowed topics. 
     */
    public fun topics(topics: List<ITopic>)

    /**
     * A list of allowed topics.
     *
     * At most 5 topics.
     *
     * Default: - No topics.
     *
     * @param topics A list of allowed topics. 
     */
    public fun topics(vararg topics: ITopic)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck.Builder =
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck.Builder.create(scope,
        id)

    /**
     * A name for the AWS Config rule.
     *
     * Default: - CloudFormation generated name
     *
     * @param configRuleName A name for the AWS Config rule. 
     */
    override fun configRuleName(configRuleName: String) {
      cdkBuilder.configRuleName(configRuleName)
    }

    /**
     * A description about this AWS Config rule.
     *
     * Default: - No description
     *
     * @param description A description about this AWS Config rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Input parameter values that are passed to the AWS Config rule.
     *
     * Default: - No input parameters
     *
     * @param inputParameters Input parameter values that are passed to the AWS Config rule. 
     */
    override fun inputParameters(inputParameters: Map<String, Any>) {
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
    override fun maximumExecutionFrequency(maximumExecutionFrequency: MaximumExecutionFrequency) {
      cdkBuilder.maximumExecutionFrequency(maximumExecutionFrequency.let(MaximumExecutionFrequency::unwrap))
    }

    /**
     * Defines which resources trigger an evaluation for an AWS Config rule.
     *
     * Default: - evaluations for the rule are triggered when any resource in the recording group
     * changes.
     *
     * @param ruleScope Defines which resources trigger an evaluation for an AWS Config rule. 
     */
    override fun ruleScope(ruleScope: RuleScope) {
      cdkBuilder.ruleScope(ruleScope.let(RuleScope::unwrap))
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
    override fun topics(topics: List<ITopic>) {
      cdkBuilder.topics(topics.map(ITopic::unwrap))
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
    override fun topics(vararg topics: ITopic): Unit = topics(topics.toList())

    public fun build(): software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
        = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CloudFormationStackNotificationCheck {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CloudFormationStackNotificationCheck(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck):
        CloudFormationStackNotificationCheck = CloudFormationStackNotificationCheck(cdkObject)

    internal fun unwrap(wrapped: CloudFormationStackNotificationCheck):
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck =
        wrapped.cdkObject as
        software.amazon.awscdk.services.config.CloudFormationStackNotificationCheck
  }
}
