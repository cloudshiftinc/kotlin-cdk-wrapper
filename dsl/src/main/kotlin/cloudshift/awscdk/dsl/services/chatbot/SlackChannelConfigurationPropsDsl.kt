@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.logs.LogRetentionRetryOptionsDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.chatbot.LoggingLevel
import software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
import software.amazon.awscdk.services.iam.IManagedPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.logs.LogRetentionRetryOptions
import software.amazon.awscdk.services.logs.RetentionDays
import software.amazon.awscdk.services.sns.ITopic

@CdkDslMarker
public class SlackChannelConfigurationPropsDsl {
  private val cdkBuilder: SlackChannelConfigurationProps.Builder =
      SlackChannelConfigurationProps.builder()

  private val _guardrailPolicies: MutableList<IManagedPolicy> = mutableListOf()

  private val _notificationTopics: MutableList<ITopic> = mutableListOf()

  /**
   * @param guardrailPolicies A list of IAM managed policies that are applied as channel guardrails.
   */
  public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy) {
    _guardrailPolicies.addAll(listOf(*guardrailPolicies))
  }

  /**
   * @param guardrailPolicies A list of IAM managed policies that are applied as channel guardrails.
   */
  public fun guardrailPolicies(guardrailPolicies: Collection<IManagedPolicy>) {
    _guardrailPolicies.addAll(guardrailPolicies)
  }

  /**
   * @param logRetention The number of days log events are kept in CloudWatch Logs.
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `INFINITE`.
   */
  public fun logRetention(logRetention: RetentionDays) {
    cdkBuilder.logRetention(logRetention)
  }

  /**
   * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts to
   * create the CloudWatch log group.
   * These options control the retry policy when interacting with CloudWatch APIs.
   */
  public
      fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptionsDsl.() -> Unit
      = {}) {
    val builder = LogRetentionRetryOptionsDsl()
    builder.apply(logRetentionRetryOptions)
    cdkBuilder.logRetentionRetryOptions(builder.build())
  }

  /**
   * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts to
   * create the CloudWatch log group.
   * These options control the retry policy when interacting with CloudWatch APIs.
   */
  public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
    cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions)
  }

  /**
   * @param logRetentionRole The IAM role for the Lambda function associated with the custom
   * resource that sets the retention policy.
   */
  public fun logRetentionRole(logRetentionRole: IRole) {
    cdkBuilder.logRetentionRole(logRetentionRole)
  }

  /**
   * @param loggingLevel Specifies the logging level for this configuration.
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public fun loggingLevel(loggingLevel: LoggingLevel) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot.
   */
  public fun notificationTopics(vararg notificationTopics: ITopic) {
    _notificationTopics.addAll(listOf(*notificationTopics))
  }

  /**
   * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot.
   */
  public fun notificationTopics(notificationTopics: Collection<ITopic>) {
    _notificationTopics.addAll(notificationTopics)
  }

  /**
   * @param role The permission role of Slack channel configuration.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param slackChannelConfigurationName The name of Slack channel configuration. 
   */
  public fun slackChannelConfigurationName(slackChannelConfigurationName: String) {
    cdkBuilder.slackChannelConfigurationName(slackChannelConfigurationName)
  }

  /**
   * @param slackChannelId The ID of the Slack channel. 
   * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
   * Link.
   * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
   */
  public fun slackChannelId(slackChannelId: String) {
    cdkBuilder.slackChannelId(slackChannelId)
  }

  /**
   * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot. 
   * To get the workspace ID, you must perform the initial authorization flow with Slack in the AWS
   * Chatbot console.
   * Then you can copy and paste the workspace ID from the console.
   * For more details, see steps 1-4 in Setting Up AWS Chatbot with Slack in the AWS Chatbot User
   * Guide.
   */
  public fun slackWorkspaceId(slackWorkspaceId: String) {
    cdkBuilder.slackWorkspaceId(slackWorkspaceId)
  }

  public fun build(): SlackChannelConfigurationProps {
    if(_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
    if(_notificationTopics.isNotEmpty()) cdkBuilder.notificationTopics(_notificationTopics)
    return cdkBuilder.build()
  }
}
