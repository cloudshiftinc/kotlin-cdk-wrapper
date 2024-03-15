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

public interface CfnMicrosoftTeamsChannelConfigurationProps {
  public fun configurationName(): String

  public fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?: emptyList()

  public fun iamRoleArn(): String

  public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  public fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  public fun teamId(): String

  public fun teamsChannelId(): String

  public fun teamsTenantId(): String

  public fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  @CdkDslMarker
  public interface Builder {
    public fun configurationName(configurationName: String)

    public fun guardrailPolicies(guardrailPolicies: List<String>)

    public fun guardrailPolicies(vararg guardrailPolicies: String)

    public fun iamRoleArn(iamRoleArn: String)

    public fun loggingLevel(loggingLevel: String)

    public fun snsTopicArns(snsTopicArns: List<String>)

    public fun snsTopicArns(vararg snsTopicArns: String)

    public fun teamId(teamId: String)

    public fun teamsChannelId(teamsChannelId: String)

    public fun teamsTenantId(teamsTenantId: String)

    public fun userRoleRequired(userRoleRequired: Boolean)

    public fun userRoleRequired(userRoleRequired: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps.builder()

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

    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    override fun teamsChannelId(teamsChannelId: String) {
      cdkBuilder.teamsChannelId(teamsChannelId)
    }

    override fun teamsTenantId(teamsTenantId: String) {
      cdkBuilder.teamsTenantId(teamsTenantId)
    }

    override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    override fun userRoleRequired(userRoleRequired: IResolvable) {
      cdkBuilder.userRoleRequired(userRoleRequired.let(IResolvable::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps,
  ) : CdkObject(cdkObject), CfnMicrosoftTeamsChannelConfigurationProps {
    override fun configurationName(): String = unwrap(this).getConfigurationName()

    override fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
        emptyList()

    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    override fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

    override fun teamId(): String = unwrap(this).getTeamId()

    override fun teamsChannelId(): String = unwrap(this).getTeamsChannelId()

    override fun teamsTenantId(): String = unwrap(this).getTeamsTenantId()

    override fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnMicrosoftTeamsChannelConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps):
        CfnMicrosoftTeamsChannelConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftTeamsChannelConfigurationProps):
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps
  }
}
