package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IManagedPolicy
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface SlackChannelConfigurationProps {
  /**
   * A list of IAM managed policies that are applied as channel guardrails.
   *
   * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is not
   * set.
   */
  public fun guardrailPolicies(): List<IManagedPolicy> =
      unwrap(this).getGuardrailPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

  /**
   * The number of days log events are kept in CloudWatch Logs.
   *
   * When updating
   * this property, unsetting it doesn't remove the log retention policy. To
   * remove the retention policy, set the value to `INFINITE`.
   *
   * Default: logs.RetentionDays.INFINITE
   */
  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  /**
   * When log retention is specified, a custom resource attempts to create the CloudWatch log group.
   *
   * These options control the retry policy when interacting with CloudWatch APIs.
   *
   * Default: - Default AWS SDK retry options.
   */
  public fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
      unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

  /**
   * The IAM role for the Lambda function associated with the custom resource that sets the
   * retention policy.
   *
   * Default: - A new role is created.
   */
  public fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

  /**
   * Specifies the logging level for this configuration.
   *
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   *
   * Default: LoggingLevel.NONE
   */
  public fun loggingLevel(): LoggingLevel? = unwrap(this).getLoggingLevel()?.let(LoggingLevel::wrap)

  /**
   * The SNS topics that deliver notifications to AWS Chatbot.
   *
   * Default: None
   */
  public fun notificationTopics(): List<ITopic> =
      unwrap(this).getNotificationTopics()?.map(ITopic::wrap) ?: emptyList()

  /**
   * The permission role of Slack channel configuration.
   *
   * Default: - A role will be created.
   */
  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The name of Slack channel configuration.
   */
  public fun slackChannelConfigurationName(): String

  /**
   * The ID of the Slack channel.
   *
   * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
   * Link.
   * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
   */
  public fun slackChannelId(): String

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
   */
  public fun slackWorkspaceId(): String

  /**
   * A builder for [SlackChannelConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails.
     */
    public fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>)

    /**
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails.
     */
    public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy)

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs.
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `INFINITE`.
     */
    public fun logRetention(logRetention: RetentionDays)

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e9ec46878bd112f533b9e28359a309396b08db70ea32d88296cd3f9164b12f7")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    /**
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy.
     */
    public fun logRetentionRole(logRetentionRole: IRole)

    /**
     * @param loggingLevel Specifies the logging level for this configuration.
     * This property affects the log entries pushed to Amazon CloudWatch Logs.
     */
    public fun loggingLevel(loggingLevel: LoggingLevel)

    /**
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot.
     */
    public fun notificationTopics(notificationTopics: List<ITopic>)

    /**
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot.
     */
    public fun notificationTopics(vararg notificationTopics: ITopic)

    /**
     * @param role The permission role of Slack channel configuration.
     */
    public fun role(role: IRole)

    /**
     * @param slackChannelConfigurationName The name of Slack channel configuration. 
     */
    public fun slackChannelConfigurationName(slackChannelConfigurationName: String)

    /**
     * @param slackChannelId The ID of the Slack channel. 
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link.
     * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     */
    public fun slackChannelId(slackChannelId: String)

    /**
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot. 
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console.
     * Then you can copy and paste the workspace ID from the console.
     * For more details, see steps 1-4 in Setting Up AWS Chatbot with Slack in the AWS Chatbot User
     * Guide.
     */
    public fun slackWorkspaceId(slackWorkspaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps.builder()

    /**
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails.
     */
    override fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies.map(IManagedPolicy::unwrap))
    }

    /**
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails.
     */
    override fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    /**
     * @param logRetention The number of days log events are kept in CloudWatch Logs.
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `INFINITE`.
     */
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     */
    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    /**
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group.
     * These options control the retry policy when interacting with CloudWatch APIs.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e9ec46878bd112f533b9e28359a309396b08db70ea32d88296cd3f9164b12f7")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    /**
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy.
     */
    override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole::unwrap))
    }

    /**
     * @param loggingLevel Specifies the logging level for this configuration.
     * This property affects the log entries pushed to Amazon CloudWatch Logs.
     */
    override fun loggingLevel(loggingLevel: LoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(LoggingLevel::unwrap))
    }

    /**
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot.
     */
    override fun notificationTopics(notificationTopics: List<ITopic>) {
      cdkBuilder.notificationTopics(notificationTopics.map(ITopic::unwrap))
    }

    /**
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot.
     */
    override fun notificationTopics(vararg notificationTopics: ITopic): Unit =
        notificationTopics(notificationTopics.toList())

    /**
     * @param role The permission role of Slack channel configuration.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param slackChannelConfigurationName The name of Slack channel configuration. 
     */
    override fun slackChannelConfigurationName(slackChannelConfigurationName: String) {
      cdkBuilder.slackChannelConfigurationName(slackChannelConfigurationName)
    }

    /**
     * @param slackChannelId The ID of the Slack channel. 
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link.
     * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     */
    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

    /**
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot. 
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console.
     * Then you can copy and paste the workspace ID from the console.
     * For more details, see steps 1-4 in Setting Up AWS Chatbot with Slack in the AWS Chatbot User
     * Guide.
     */
    override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    public fun build(): software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps,
  ) : CdkObject(cdkObject), SlackChannelConfigurationProps {
    /**
     * A list of IAM managed policies that are applied as channel guardrails.
     *
     * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is
     * not set.
     */
    override fun guardrailPolicies(): List<IManagedPolicy> =
        unwrap(this).getGuardrailPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

    /**
     * The number of days log events are kept in CloudWatch Logs.
     *
     * When updating
     * this property, unsetting it doesn't remove the log retention policy. To
     * remove the retention policy, set the value to `INFINITE`.
     *
     * Default: logs.RetentionDays.INFINITE
     */
    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * Default: - Default AWS SDK retry options.
     */
    override fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
        unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - A new role is created.
     */
    override fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

    /**
     * Specifies the logging level for this configuration.
     *
     * This property affects the log entries pushed to Amazon CloudWatch Logs.
     *
     * Default: LoggingLevel.NONE
     */
    override fun loggingLevel(): LoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(LoggingLevel::wrap)

    /**
     * The SNS topics that deliver notifications to AWS Chatbot.
     *
     * Default: None
     */
    override fun notificationTopics(): List<ITopic> =
        unwrap(this).getNotificationTopics()?.map(ITopic::wrap) ?: emptyList()

    /**
     * The permission role of Slack channel configuration.
     *
     * Default: - A role will be created.
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The name of Slack channel configuration.
     */
    override fun slackChannelConfigurationName(): String =
        unwrap(this).getSlackChannelConfigurationName()

    /**
     * The ID of the Slack channel.
     *
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link.
     * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     */
    override fun slackChannelId(): String = unwrap(this).getSlackChannelId()

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot.
     *
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console.
     * Then you can copy and paste the workspace ID from the console.
     * For more details, see steps 1-4 in Setting Up AWS Chatbot with Slack in the AWS Chatbot User
     * Guide.
     *
     * [Documentation](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro)
     */
    override fun slackWorkspaceId(): String = unwrap(this).getSlackWorkspaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SlackChannelConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps):
        SlackChannelConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SlackChannelConfigurationProps):
        software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps
  }
}
