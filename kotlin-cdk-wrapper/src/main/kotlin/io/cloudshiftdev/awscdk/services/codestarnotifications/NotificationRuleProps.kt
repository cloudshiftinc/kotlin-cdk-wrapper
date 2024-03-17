@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarnotifications

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a new notification rule.
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
public interface NotificationRuleProps : NotificationRuleOptions {
  /**
   * A list of event types associated with this notification rule.
   *
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
   */
  public fun events(): List<String>

  /**
   * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
   *
   * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
   * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
   */
  public fun source(): INotificationRuleSource

  /**
   * The targets to register for the notification destination.
   *
   * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
   */
  public fun targets(): List<INotificationRuleTarget> =
      unwrap(this).getTargets()?.map(INotificationRuleTarget::wrap) ?: emptyList()

  /**
   * A builder for [NotificationRuleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    public fun detailType(detailType: DetailType)

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param events A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    public fun events(events: List<String>)

    /**
     * @param events A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    public fun events(vararg events: String)

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    public fun notificationRuleName(notificationRuleName: String)

    /**
     * @param source The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
     * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
     */
    public fun source(source: INotificationRuleSource)

    /**
     * @param targets The targets to register for the notification destination.
     */
    public fun targets(targets: List<INotificationRuleTarget>)

    /**
     * @param targets The targets to register for the notification destination.
     */
    public fun targets(vararg targets: INotificationRuleTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps.Builder =
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps.builder()

    /**
     * @param detailType The level of detail to include in the notifications for this resource.
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     */
    override fun detailType(detailType: DetailType) {
      cdkBuilder.detailType(detailType.let(DetailType::unwrap))
    }

    /**
     * @param enabled The status of the notification rule.
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param events A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    override fun events(events: List<String>) {
      cdkBuilder.events(events)
    }

    /**
     * @param events A list of event types associated with this notification rule. 
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     */
    override fun events(vararg events: String): Unit = events(events.toList())

    /**
     * @param notificationRuleName The name for the notification rule.
     * Notification rule names must be unique in your AWS account.
     */
    override fun notificationRuleName(notificationRuleName: String) {
      cdkBuilder.notificationRuleName(notificationRuleName)
    }

    /**
     * @param source The Amazon Resource Name (ARN) of the resource to associate with the
     * notification rule. 
     * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
     * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
     */
    override fun source(source: INotificationRuleSource) {
      cdkBuilder.source(source.let(INotificationRuleSource::unwrap))
    }

    /**
     * @param targets The targets to register for the notification destination.
     */
    override fun targets(targets: List<INotificationRuleTarget>) {
      cdkBuilder.targets(targets.map(INotificationRuleTarget::unwrap))
    }

    /**
     * @param targets The targets to register for the notification destination.
     */
    override fun targets(vararg targets: INotificationRuleTarget): Unit = targets(targets.toList())

    public fun build(): software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps,
  ) : CdkObject(cdkObject), NotificationRuleProps {
    /**
     * The level of detail to include in the notifications for this resource.
     *
     * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
     * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
     * the service for the resource for which the notification is created.
     *
     * Default: DetailType.FULL
     */
    override fun detailType(): DetailType? = unwrap(this).getDetailType()?.let(DetailType::wrap)

    /**
     * The status of the notification rule.
     *
     * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * A list of event types associated with this notification rule.
     *
     * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
     * Console User Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#concepts-api)
     */
    override fun events(): List<String> = unwrap(this).getEvents()

    /**
     * The name for the notification rule.
     *
     * Notification rule names must be unique in your AWS account.
     *
     * Default: - generated from the `id`
     */
    override fun notificationRuleName(): String? = unwrap(this).getNotificationRuleName()

    /**
     * The Amazon Resource Name (ARN) of the resource to associate with the notification rule.
     *
     * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
     * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codestarnotifications-notificationrule.html#cfn-codestarnotifications-notificationrule-resource)
     */
    override fun source(): INotificationRuleSource =
        unwrap(this).getSource().let(INotificationRuleSource::wrap)

    /**
     * The targets to register for the notification destination.
     *
     * Default: - No targets are added to the rule. Use `addTarget()` to add a target.
     */
    override fun targets(): List<INotificationRuleTarget> =
        unwrap(this).getTargets()?.map(INotificationRuleTarget::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationRuleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps):
        NotificationRuleProps = CdkObjectWrappers.wrap(cdkObject) as? NotificationRuleProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationRuleProps):
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps
  }
}
