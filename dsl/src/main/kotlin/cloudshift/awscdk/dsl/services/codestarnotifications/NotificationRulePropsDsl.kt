@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codestarnotifications

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codestarnotifications.DetailType
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleSource
import software.amazon.awscdk.services.codestarnotifications.INotificationRuleTarget
import software.amazon.awscdk.services.codestarnotifications.NotificationRuleProps

/**
 * Properties for a new notification rule.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.codestarnotifications.*;
 * import software.amazon.awscdk.services.codebuild.*;
 * import software.amazon.awscdk.services.sns.*;
 * import software.amazon.awscdk.services.chatbot.*;
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
@CdkDslMarker
public class NotificationRulePropsDsl {
  private val cdkBuilder: NotificationRuleProps.Builder = NotificationRuleProps.builder()

  private val _events: MutableList<String> = mutableListOf()

  private val _targets: MutableList<INotificationRuleTarget> = mutableListOf()

  /**
   * @param detailType The level of detail to include in the notifications for this resource.
   * BASIC will include only the contents of the event as it would appear in AWS CloudWatch.
   * FULL will include any supplemental information provided by AWS CodeStar Notifications and/or
   * the service for the resource for which the notification is created.
   */
  public fun detailType(detailType: DetailType) {
    cdkBuilder.detailType(detailType)
  }

  /**
   * @param enabled The status of the notification rule.
   * If the enabled is set to DISABLED, notifications aren't sent for the notification rule.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param events A list of event types associated with this notification rule. 
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   */
  public fun events(vararg events: String) {
    _events.addAll(listOf(*events))
  }

  /**
   * @param events A list of event types associated with this notification rule. 
   * For a complete list of event types and IDs, see Notification concepts in the Developer Tools
   * Console User Guide.
   */
  public fun events(events: Collection<String>) {
    _events.addAll(events)
  }

  /**
   * @param notificationRuleName The name for the notification rule.
   * Notification rule names must be unique in your AWS account.
   */
  public fun notificationRuleName(notificationRuleName: String) {
    cdkBuilder.notificationRuleName(notificationRuleName)
  }

  /**
   * @param source The Amazon Resource Name (ARN) of the resource to associate with the notification
   * rule. 
   * Currently, Supported sources include pipelines in AWS CodePipeline, build projects in AWS
   * CodeBuild, and repositories in AWS CodeCommit in this L2 constructor.
   */
  public fun source(source: INotificationRuleSource) {
    cdkBuilder.source(source)
  }

  /**
   * @param targets The targets to register for the notification destination.
   */
  public fun targets(vararg targets: INotificationRuleTarget) {
    _targets.addAll(listOf(*targets))
  }

  /**
   * @param targets The targets to register for the notification destination.
   */
  public fun targets(targets: Collection<INotificationRuleTarget>) {
    _targets.addAll(targets)
  }

  public fun build(): NotificationRuleProps {
    if(_events.isNotEmpty()) cdkBuilder.events(_events)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
