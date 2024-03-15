@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSlackChannelConfigurationProps {
  public fun configurationName(): String

  public fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?: emptyList()

  public fun iamRoleArn(): String

  public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  public fun slackChannelId(): String

  public fun slackWorkspaceId(): String

  public fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  public fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  @CdkDslMarker
  public interface Builder {
    public fun configurationName(configurationName: String)

    public fun guardrailPolicies(guardrailPolicies: List<String>)

    public fun guardrailPolicies(vararg guardrailPolicies: String)

    public fun iamRoleArn(iamRoleArn: String)

    public fun loggingLevel(loggingLevel: String)

    public fun slackChannelId(slackChannelId: String)

    public fun slackWorkspaceId(slackWorkspaceId: String)

    public fun snsTopicArns(snsTopicArns: List<String>)

    public fun snsTopicArns(vararg snsTopicArns: String)

    public fun userRoleRequired(userRoleRequired: Boolean)

    public fun userRoleRequired(userRoleRequired: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps.builder()

    override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    override fun guardrailPolicies(guardrailPolicies: List<String>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies)
    }

    override fun guardrailPolicies(vararg guardrailPolicies: String): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    override fun loggingLevel(loggingLevel: String) {
      cdkBuilder.loggingLevel(loggingLevel)
    }

    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

    override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    override fun userRoleRequired(userRoleRequired: IResolvable) {
      cdkBuilder.userRoleRequired(userRoleRequired.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps,
  ) : CdkObject(cdkObject), CfnSlackChannelConfigurationProps {
    override fun configurationName(): String = unwrap(this).getConfigurationName()

    override fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
        emptyList()

    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    override fun slackChannelId(): String = unwrap(this).getSlackChannelId()

    override fun slackWorkspaceId(): String = unwrap(this).getSlackWorkspaceId()

    override fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

    override fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSlackChannelConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps):
        CfnSlackChannelConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfigurationProps):
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps
  }
}
