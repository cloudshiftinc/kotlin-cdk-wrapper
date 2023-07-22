@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.logs.LogRetentionRetryOptionsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.chatbot.LoggingLevel
import software.amazon.awscdk.services.chatbot.SlackChannelConfiguration
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.sns.ITopic
import software.constructs.Construct

/**
 * A new Slack channel configuration.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.chatbot.*;
 * Project project;
 * SlackChannelConfiguration target = SlackChannelConfiguration.Builder.create(this,
 * "MySlackChannel")
 * .slackChannelConfigurationName("YOUR_CHANNEL_NAME")
 * .slackWorkspaceId("YOUR_SLACK_WORKSPACE_ID")
 * .slackChannelId("YOUR_SLACK_CHANNEL_ID")
 * .build();
 * INotificationRule rule = project.notifyOnBuildSucceeded("NotifyOnBuildSucceeded", target);
 * ```
 */
@CdkDslMarker
public class SlackChannelConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: SlackChannelConfiguration.Builder =
      SlackChannelConfiguration.Builder.create(scope, id)

  private val _guardrailPolicies: MutableList<IManagedPolicy> = mutableListOf()

  private val _notificationTopics: MutableList<ITopic> = mutableListOf()

  /**
   * A list of IAM managed policies that are applied as channel guardrails.
   *
   * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is not
   * set.
   *
   * @param guardrailPolicies A list of IAM managed policies that are applied as channel guardrails.
   * 
   */
  public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy) {
    _guardrailPolicies.addAll(listOf(*guardrailPolicies))
  }

  /**
   * A list of IAM managed policies that are applied as channel guardrails.
   *
   * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is not
   * set.
   *
   * @param guardrailPolicies A list of IAM managed policies that are applied as channel guardrails.
   * 
   */
  public fun guardrailPolicies(guardrailPolicies: Collection<IManagedPolicy>) {
    _guardrailPolicies.addAll(guardrailPolicies)
  }

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `INFINITE`.
   *
   * Default: logs.RetentionDays.INFINITE
   *
   * @param logRetention The number of days log events are kept in CloudWatch Logs. 
   */
  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  /**
   * When log retention is specified, a custom resource attempts to create the CloudWatch log group.
   *
   * These options control the retry policy when interacting with CloudWatch APIs.
   *
   * Default: - Default AWS SDK retry options.
   *
   * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts to
   * create the CloudWatch log group. 
   */
  public
      fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptionsDsl.() -> Unit
      = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(logRetentionRetryOptions)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  /**
   * When log retention is specified, a custom resource attempts to create the CloudWatch log group.
   *
   * These options control the retry policy when interacting with CloudWatch APIs.
   *
   * Default: - Default AWS SDK retry options.
   *
   * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts to
   * create the CloudWatch log group. 
   */
  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - A new role is created.
   *
   * @param logRetentionRole The IAM role for the Lambda function associated with the custom
   * resource that sets the retention policy. 
   */
  public fun logRetentionRole(logRetentionRole: IRole) {
    cdkBuilder.logRetentionRole(logRetentionRole)
  }

  /**
   * Specifies the logging level for this configuration.
   *
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   *
   * Default: LoggingLevel.NONE
   *
   * @param loggingLevel Specifies the logging level for this configuration. 
   */
  public fun loggingLevel(loggingLevel: LoggingLevel) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * The SNS topics that deliver notifications to AWS Chatbot.
   *
   * Default: None
   *
   * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot. 
   */
  public fun notificationTopics(vararg notificationTopics: ITopic) {
    _notificationTopics.addAll(listOf(*notificationTopics))
  }

  /**
   * The SNS topics that deliver notifications to AWS Chatbot.
   *
   * Default: None
   *
   * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot. 
   */
  public fun notificationTopics(notificationTopics: Collection<ITopic>) {
    _notificationTopics.addAll(notificationTopics)
  }

  /**
   * The permission role of Slack channel configuration.
   *
   * Default: - A role will be created.
   *
   * @param role The permission role of Slack channel configuration. 
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * The name of Slack channel configuration.
   *
   * @param slackChannelConfigurationName The name of Slack channel configuration. 
   */
  public fun slackChannelConfigurationName(slackChannelConfigurationName: String) {
    cdkBuilder.slackChannelConfigurationName(slackChannelConfigurationName)
  }

  /**
   * The ID of the Slack channel.
   *
   * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
   * Link.
   * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
   *
   * @param slackChannelId The ID of the Slack channel. 
   */
  public fun slackChannelId(slackChannelId: String) {
    cdkBuilder.slackChannelId(slackChannelId)
  }

  /**
   * The ID of the Slack workspace authorized with AWS Chatbot.
   *
   * To get the workspace ID, you must perform the initial authorization flow with Slack in the AWS
   * Chatbot console.
   * Then you can copy and paste the workspace ID from the console.
   * For more details, see steps 1-4 in Setting Up AWS Chatbot with Slack in the AWS Chatbot User
   * Guide.
   *
   * [Documentation](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro)
   * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot. 
   */
  public fun slackWorkspaceId(slackWorkspaceId: String) {
    cdkBuilder.slackWorkspaceId(slackWorkspaceId)
  }

  public fun build(): SlackChannelConfiguration {
    if(_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
    if(_notificationTopics.isNotEmpty()) cdkBuilder.notificationTopics(_notificationTopics)
    return cdkBuilder.build()
  }
}
