package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnMicrosoftTeamsChannelConfiguration internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun configurationName(): String = unwrap(this).getConfigurationName()

  public open fun configurationName(`value`: String) {
    unwrap(this).setConfigurationName(`value`)
  }

  public open fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
      emptyList()

  public open fun guardrailPolicies(`value`: List<String>) {
    unwrap(this).setGuardrailPolicies(`value`)
  }

  public open fun guardrailPolicies(vararg `value`: String): Unit =
      guardrailPolicies(`value`.toList())

  public open fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  public open fun loggingLevel(`value`: String) {
    unwrap(this).setLoggingLevel(`value`)
  }

  public open fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  public open fun snsTopicArns(`value`: List<String>) {
    unwrap(this).setSnsTopicArns(`value`)
  }

  public open fun snsTopicArns(vararg `value`: String): Unit = snsTopicArns(`value`.toList())

  public open fun teamId(): String = unwrap(this).getTeamId()

  public open fun teamId(`value`: String) {
    unwrap(this).setTeamId(`value`)
  }

  public open fun teamsChannelId(): String = unwrap(this).getTeamsChannelId()

  public open fun teamsChannelId(`value`: String) {
    unwrap(this).setTeamsChannelId(`value`)
  }

  public open fun teamsTenantId(): String = unwrap(this).getTeamsTenantId()

  public open fun teamsTenantId(`value`: String) {
    unwrap(this).setTeamsTenantId(`value`)
  }

  public open fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  public open fun userRoleRequired(`value`: Boolean) {
    unwrap(this).setUserRoleRequired(`value`)
  }

  public open fun userRoleRequired(`value`: IResolvable) {
    unwrap(this).setUserRoleRequired(`value`.let(IResolvable::unwrap))
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration.Builder =
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration.Builder.create(scope,
        id)

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
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMicrosoftTeamsChannelConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMicrosoftTeamsChannelConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration):
        CfnMicrosoftTeamsChannelConfiguration = CfnMicrosoftTeamsChannelConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftTeamsChannelConfiguration):
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration =
        wrapped.cdkObject
  }
}
