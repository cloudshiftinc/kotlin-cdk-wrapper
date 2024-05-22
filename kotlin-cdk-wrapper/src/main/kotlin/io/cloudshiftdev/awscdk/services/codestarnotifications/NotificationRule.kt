@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new notification rule.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.codestarnotifications.*;
 * import io.cloudshiftdev.awscdk.services.codebuild.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * import io.cloudshiftdev.awscdk.services.chatbot.*;
 * PipelineProject project = new PipelineProject(this, "MyProject");
 * Topic topic = new Topic(this, "MyTopic1");
 * SlackChannelConfiguration slack = SlackChannelConfiguration.Builder.create(this,
 * "MySlackChannel")
 * .slackChannelConfigurationName("YOUR_CHANNEL_NAME")
 * .slackWorkspaceId("YOUR_SLACK_WORKSPACE_ID")
 * .slackChannelId("YOUR_SLACK_CHANNEL_ID")
 * .build();
 * NotificationRule rule = NotificationRule.Builder.create(this, "NotificationRule")
 * .source(project)
 * .events(List.of("codebuild-project-build-state-succeeded",
 * "codebuild-project-build-state-failed"))
 * .targets(List.of(topic))
 * .build();
 * rule.addTarget(slack);
 * ```
 */
public open class NotificationRule(
  cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRule,
) : Resource(cdkObject), INotificationRule {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NotificationRuleProps,
  ) :
      this(software.amazon.awscdk.services.codestarnotifications.NotificationRule(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(NotificationRuleProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: NotificationRuleProps.Builder.() -> Unit,
  ) : this(scope, id, NotificationRuleProps(props)
  )

  /**
   * Adds target to notification rule.
   *
   * @param target The SNS topic or AWS Chatbot Slack target. 
   */
  public override fun addTarget(target: INotificationRuleTarget): Boolean =
      unwrap(this).addTarget(target.let(INotificationRuleTarget.Companion::unwrap))

  /**
   * The ARN of the notification rule (i.e.
   * arn:aws:codestar-notifications:::notificationrule/01234abcde).
   */
  public override fun notificationRuleArn(): String = unwrap(this).getNotificationRuleArn()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The level of detail to include in the notifications for this resource.
     *
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * Default: DetailType.FULL
     *
     * @param detailType The level of detail to include in the notifications for this resource. 
     */
    public fun detailType(detailType: DetailType)

    /**
     * The status of the notification rule.
     *
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     *
     * Default: true
     *
     * @param enabled The status of the notification rule. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     * @param events A list of event types associated with this notification rule. 
     */
    public fun events(events: List<String>)

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     * @param events A list of event types associated with this notification rule. 
     */
    public fun events(vararg events: String)

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account.
     *
     * Default: - generated from the `id`
     *
     * @param notificationRuleName The name for the notification rule. 
     */
    public fun notificationRuleName(notificationRuleName: String)

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
     *
     * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
     * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
     * @param source The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     */
    public fun source(source: INotificationRuleSource)

    /**
     * The targets to register for the notification destination.
     *
     * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
     *
     * @param targets The targets to register for the notification destination. 
     */
    public fun targets(targets: List<INotificationRuleTarget>)

    /**
     * The targets to register for the notification destination.
     *
     * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
     *
     * @param targets The targets to register for the notification destination. 
     */
    public fun targets(vararg targets: INotificationRuleTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRule.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRule.Builder.create(scope,
        id)

    /**
     * The level of detail to include in the notifications for this resource.
     *
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * Default: DetailType.FULL
     *
     * @param detailType The level of detail to include in the notifications for this resource. 
     */
    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType.Companion::unwrap))
    }

    /**
     * The status of the notification rule.
     *
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     *
     * Default: true
     *
     * @param enabled The status of the notification rule. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     * @param events A list of event types associated with this notification rule. 
     */
    override fun events(events: List<String>) {
      cdkBuilder.events(events)
    }

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     * @param events A list of event types associated with this notification rule. 
     */
    override fun events(vararg events: String): Unit = events(events.toList())

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account.
     *
     * Default: - generated from the `id`
     *
     * @param notificationRuleName The name for the notification rule. 
     */
    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
     *
     * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
     * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
     * @param source The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     */
    override fun source(source: INotificationRuleSource) {
      cdkBuilder.source(source.let(INotificationRuleSource.Companion::unwrap))
    }

    /**
     * The targets to register for the notification destination.
     *
     * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
     *
     * @param targets The targets to register for the notification destination. 
     */
    override fun targets(targets: List<INotificationRuleTarget>) {
      cdkBuilder.targets(targets.map(INotificationRuleTarget.Companion::unwrap))
    }

    /**
     * The targets to register for the notification destination.
     *
     * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
     *
     * @param targets The targets to register for the notification destination. 
     */
    override fun targets(vararg targets: INotificationRuleTarget): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.codestarnotifications.NotificationRule =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromNotificationRuleArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      notificationRuleArn: String,
    ): INotificationRule =
        software.amazon.awscdk.services.codestarnotifications.NotificationRule.fromNotificationRuleArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, notificationRuleArn).let(INotificationRule::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): NotificationRule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return NotificationRule(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRule):
        NotificationRule = NotificationRule(cdkObject)

    internal fun unwrap(wrapped: NotificationRule):
        software.amazon.awscdk.services.codestarnotifications.NotificationRule = wrapped.cdkObject
        as software.amazon.awscdk.services.codestarnotifications.NotificationRule
  }
}
