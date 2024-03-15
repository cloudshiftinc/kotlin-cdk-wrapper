@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.iam.IManagedPolicy
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.logs.LogRetentionRetryOptions
import io.cloudshiftdev.awscdk.services.logs.RetentionDays
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface SlackChannelConfigurationProps {
  public fun guardrailPolicies(): List<IManagedPolicy> =
      unwrap(this).getGuardrailPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

  public fun logRetention(): RetentionDays? =
      unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

  public fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
      unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

  public fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

  public fun loggingLevel(): LoggingLevel? = unwrap(this).getLoggingLevel()?.let(LoggingLevel::wrap)

  public fun notificationTopics(): List<ITopic> =
      unwrap(this).getNotificationTopics()?.map(ITopic::wrap) ?: emptyList()

  public fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

  public fun slackChannelConfigurationName(): String

  public fun slackChannelId(): String

  public fun slackWorkspaceId(): String

  @CdkDslMarker
  public interface Builder {
    public fun guardrailPolicies(guardrailPolicies: List<IManagedPolicy>)

    public fun guardrailPolicies(vararg guardrailPolicies: IManagedPolicy)

    public fun logRetention(logRetention: RetentionDays)

    public fun logRetentionRetryOptions(logRetentionRetryOptions: LogRetentionRetryOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5e9ec46878bd112f533b9e28359a309396b08db70ea32d88296cd3f9164b12f7")
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps.builder()

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
    @JvmName("5e9ec46878bd112f533b9e28359a309396b08db70ea32d88296cd3f9164b12f7")
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

    public fun build(): software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.chatbot.SlackChannelConfigurationProps,
  ) : CdkObject(cdkObject), SlackChannelConfigurationProps {
    override fun guardrailPolicies(): List<IManagedPolicy> =
        unwrap(this).getGuardrailPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

    override fun logRetention(): RetentionDays? =
        unwrap(this).getLogRetention()?.let(RetentionDays::wrap)

    override fun logRetentionRetryOptions(): LogRetentionRetryOptions? =
        unwrap(this).getLogRetentionRetryOptions()?.let(LogRetentionRetryOptions::wrap)

    override fun logRetentionRole(): IRole? = unwrap(this).getLogRetentionRole()?.let(IRole::wrap)

    override fun loggingLevel(): LoggingLevel? =
        unwrap(this).getLoggingLevel()?.let(LoggingLevel::wrap)

    override fun notificationTopics(): List<ITopic> =
        unwrap(this).getNotificationTopics()?.map(ITopic::wrap) ?: emptyList()

    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    override fun slackChannelConfigurationName(): String =
        unwrap(this).getSlackChannelConfigurationName()

    override fun slackChannelId(): String = unwrap(this).getSlackChannelId()

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
