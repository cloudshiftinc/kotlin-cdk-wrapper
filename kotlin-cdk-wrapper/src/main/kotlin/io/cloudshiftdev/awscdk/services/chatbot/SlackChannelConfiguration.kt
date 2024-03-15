@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class SlackChannelConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.chatbot.SlackChannelConfiguration,
) : Resource(cdkObject), ISlackChannelConfiguration {
  public open fun addNotificationTopic(notificationTopic: ITopic) {
    unwrap(this).addNotificationTopic(notificationTopic.let(ITopic::unwrap))
  }

  public override fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public override fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public override fun bindAsNotificationRuleTarget(_scope: CloudshiftdevConstructsConstruct):
      NotificationRuleTargetConfig =
      unwrap(this).bindAsNotificationRuleTarget(_scope.let(CloudshiftdevConstructsConstruct::unwrap)).let(NotificationRuleTargetConfig::wrap)

  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  public override fun metric(metricName: String): Metric =
      unwrap(this).metric(metricName).let(Metric::wrap)

  public override fun metric(metricName: String, props: MetricOptions): Metric =
      unwrap(this).metric(metricName, props.let(MetricOptions::unwrap)).let(Metric::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("629ccc2b9ed0d0686ac72be3c432836a76a92f56ab45dae83dc2e318f17ba80c")
  public override fun metric(metricName: String, props: MetricOptions.Builder.() -> Unit): Metric =
      metric(metricName, MetricOptions(props))

  public override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public override fun slackChannelConfigurationArn(): String =
      unwrap(this).getSlackChannelConfigurationArn()

  public override fun slackChannelConfigurationName(): String =
      unwrap(this).getSlackChannelConfigurationName()

  @CdkDslMarker
  public interface Builder {
    public fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>)

    public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy)

    public fun logRetention(logRetention: RetentionDays)

    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c861a99cf5abe84ce016f409329bbce6972ff1c929882e07f7e7a9791c13164")
    public
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit)

    public fun logRetentionRole(logRetentionRole: IRole)

    public fun loggingLevel(loggingLevel: LoggingLevel)

    public fun notificationTopics(notificationTopics: List<ITopic>)

    public fun notificationTopics(vararg notificationTopics: ITopic)

    public fun role(role: IRole)

    public fun slackChannelConfigurationName(slackChannelConfigurationName: String)

    public fun slackChannelId(slackChannelId: String)

    public fun slackWorkspaceId(slackWorkspaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.Builder =
        software.amazon.awscdk.services.chatbot.SlackChannelConfiguration.Builder.create(scope, id)

    override fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies.map(IManagedPolicy::unwrap))
    }

    override fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    override fun logRetention(logRetention: RetentionDays) {
      cdkBuilder.logRetention(logRetention.let(RetentionDays::unwrap))
    }

    override fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions) {
      cdkBuilder.logRetentionRetryOptions(logRetentionRetryOptions.let(LogRetentionRetryOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2c861a99cf5abe84ce016f409329bbce6972ff1c929882e07f7e7a9791c13164")
    override
        fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions.Builder.() -> Unit):
        Unit = logRetentionRetryOptions(LogRetentionRetryOptions(logRetentionRetryOptions))

    override fun logRetentionRole(logRetentionRole: IRole) {
      cdkBuilder.logRetentionRole(logRetentionRole.let(IRole::unwrap))
    }

    override fun loggingLevel(loggingLevel: LoggingLevel) {
      cdkBuilder.loggingLevel(loggingLevel.let(LoggingLevel::unwrap))
    }

    override fun notificationTopics(notificationTopics: List<ITopic>) {
      cdkBuilder.notificationTopics(notificationTopics.map(ITopic::unwrap))
    }

    override fun notificationTopics(vararg notificationTopics: ITopic): Unit =
        notificationTopics(notificationTopics.toList())

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun slackChannelConfigurationName(slackChannelConfigurationName: String) {
      cdkBuilder.slackChannelConfigurationName(slackChannelConfigurationName)
    }

    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

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

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
