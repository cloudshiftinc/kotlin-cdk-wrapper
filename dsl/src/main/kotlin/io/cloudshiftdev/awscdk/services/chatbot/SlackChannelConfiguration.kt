package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.cloudwatch.Metric
import io.cloudshiftdev.awscdk.services.cloudwatch.MetricOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IManagedPolicy
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.logs.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SlackChannelConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.chatbot.SlackChannelConfiguration,
) : Resource(cdkObject), ISlackChannelConfiguration {
  /**
   * Adds a SNS topic that deliver notifications to AWS Chatbot.
   *
   * @param notificationTopic 
   */
  public open fun addNotificationTopic(notificationTopic: ITopic) {
    unwrap(this).addNotificationTopic(notificationTopic.let(ITopic::unwrap))
  }

  /**
   * Adds extra permission to iam-role of Slack channel configuration.
   *
   * @param statement 
   */
  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  /**
   * Adds extra permission to iam-role of Slack channel configuration.
   *
   * @param statement 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  /**
   * Returns a target configuration for notification rule.
   *
   * @param _scope 
   */
  public override fun bindAsNotificationRuleTarget(_scope: CloudshiftdevConstructsConstruct):
      NotificationRuleTargetConfig =
      unwrap(this).bindAsNotificationRuleTarget(_scope.let(CloudshiftdevConstructsConstruct::unwrap)).let(NotificationRuleTargetConfig::wrap)

  /**
   * The principal to grant permissions to.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  /**
   * Return the given named metric for this SlackChannelConfiguration.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  /**
   * Return the given named metric for this SlackChannelConfiguration.
   *
   * @param metricName 
   * @param props
   */
  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  /**
   * Return the given named metric for this SlackChannelConfiguration.
   *
   * @param metricName 
   * @param props
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  /**
   * The permission role of Slack channel configuration.
   */
  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  /**
   * The ARN of the Slack channel configuration In the form of
   * arn:aws:chatbot:{region}:{account}:chat-configuration/slack-channel/{slackChannelName}.
   */
  public override fun slackChannelConfigurationArn(): String =
      unwrap(this).getSlackChannelConfigurationArn()

  /**
   * The name of Slack channel configuration.
   */
  public override fun slackChannelConfigurationName(): String =
      unwrap(this).getSlackChannelConfigurationName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.chatbot.SlackChannelConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A list of IAM managed policies that are applied as channel guardrails.
     *
     * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is
     * not set.
     *
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails. 
     */
    public fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>)

    /**
     * A list of IAM managed policies that are applied as channel guardrails.
     *
     * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is
     * not set.
     *
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails. 
     */
    public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy)

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
    public fun logRetention(logRetention: RetentionDays)

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c861a99cf5abe84ce016f409329bbce6972ff1c929882e07f7e7a9791c13164")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - A new role is created.
     *
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy. 
     */
    public fun logRetentionRole(logRetentionRole: IRole)

    /**
     * Specifies the logging level for this configuration.
     *
     * This property affects the log entries pushed to Amazon CloudWatch Logs.
     *
     * Default: LoggingLevel.NONE
     *
     * @param loggingLevel Specifies the logging level for this configuration. 
     */
    public fun loggingLevel(loggingLevel: LoggingLevel)

    /**
     * The SNS topics that deliver notifications to AWS Chatbot.
     *
     * Default: None
     *
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot. 
     */
    public fun notificationTopics(notificationTopics: List<ITopic>)

    /**
     * The SNS topics that deliver notifications to AWS Chatbot.
     *
     * Default: None
     *
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot. 
     */
    public fun notificationTopics(vararg notificationTopics: ITopic)

    /**
     * The permission role of Slack channel configuration.
     *
     * Default: - A role will be created.
     *
     * @param role The permission role of Slack channel configuration. 
     */
    public fun role(role: IRole)

    /**
     * The name of Slack channel configuration.
     *
     * @param slackChannelConfigurationName The name of Slack channel configuration. 
     */
    public fun slackChannelConfigurationName(slackChannelConfigurationName: String)

    /**
     * The ID of the Slack channel.
     *
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link.
     * The channel ID is the 9-character string at the end of the URL. For example, ABCBBLZZZ.
     *
     * @param slackChannelId The ID of the Slack channel. 
     */
    public fun slackChannelId(slackChannelId: String)

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
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot. 
     */
    public fun slackWorkspaceId(slackWorkspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.Builder =
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.Builder.create(scope, id)

    /**
     * A list of IAM managed policies that are applied as channel guardrails.
     *
     * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is
     * not set.
     *
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails. 
     */
    override fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies.map(IManagedPolicy::unwrap))
    }

    /**
     * A list of IAM managed policies that are applied as channel guardrails.
     *
     * Default: - The AWS managed 'AdministratorAccess' policy is applied as a default if this is
     * not set.
     *
     * @param guardrailPolicies A list of IAM managed policies that are applied as channel
     * guardrails. 
     */
    override fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy): Unit =
        guardrailPolicies(guardrailPolicies.toList())

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
    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    /**
     * When log retention is specified, a custom resource attempts to create the CloudWatch log
     * group.
     *
     * These options control the retry policy when interacting with CloudWatch APIs.
     *
     * Default: - Default AWS SDK retry options.
     *
     * @param logRetentionRetryOptions When log retention is specified, a custom resource attempts
     * to create the CloudWatch log group. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c861a99cf5abe84ce016f409329bbce6972ff1c929882e07f7e7a9791c13164")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    /**
     * The IAM role for the Lambda function associated with the custom resource that sets the
     * retention policy.
     *
     * Default: - A new role is created.
     *
     * @param logRetentionRole The IAM role for the Lambda function associated with the custom
     * resource that sets the retention policy. 
     */
    override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole::unwrap))
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
    override fun loggingLevel(loggingLevel: LoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(LoggingLevel::unwrap))
    }

    /**
     * The SNS topics that deliver notifications to AWS Chatbot.
     *
     * Default: None
     *
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot. 
     */
    override fun notificationTopics(notificationTopics: List<ITopic>) {
      cdkBuilder.notificationTopics(notificationTopics.map(ITopic::unwrap))
    }

    /**
     * The SNS topics that deliver notifications to AWS Chatbot.
     *
     * Default: None
     *
     * @param notificationTopics The SNS topics that deliver notifications to AWS Chatbot. 
     */
    override fun notificationTopics(vararg notificationTopics: ITopic): Unit =
        notificationTopics(notificationTopics.toList())

    /**
     * The permission role of Slack channel configuration.
     *
     * Default: - A role will be created.
     *
     * @param role The permission role of Slack channel configuration. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * The name of Slack channel configuration.
     *
     * @param slackChannelConfigurationName The name of Slack channel configuration. 
     */
    override fun slackChannelConfigurationName(slackChannelConfigurationName: String) {
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
    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

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
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot. 
     */
    override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    public fun build(): software.amazon.awscdk.services.chatbot.SlackChannelConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromSlackChannelConfigurationArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      slackChannelConfigurationArn: String,
    ): ISlackChannelConfiguration =
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.fromSlackChannelConfigurationArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, slackChannelConfigurationArn).let(ISlackChannelConfiguration::wrap)

    public fun metricAll(metricName: String): Metric =
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.metricAll(metricName).let(Metric::wrap)

    public fun metricAll(metricName: String, props: MetricOptions): Metric =
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.metricAll(metricName,
        props.let(MetricOptions::unwrap)).let(Metric::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc2edb7e8860d33b2c02a5d62b7557e31ca2fd399a100f3532bebaf81fa8a856")
    public fun metricAll(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
        metricAll(metricName, MetricOptions(props))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): SlackChannelConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return SlackChannelConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.SlackChannelConfiguration):
        SlackChannelConfiguration = SlackChannelConfiguration(cdkObject)

    internal fun unwrap(wrapped: SlackChannelConfiguration):
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration = wrapped.cdkObject
  }
}
