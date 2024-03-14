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

public open class CfnSlackChannelConfiguration internal constructor(
  private val cdkObject: software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration,
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

  public open fun slackChannelId(): String = unwrap(this).getSlackChannelId()

  public open fun slackChannelId(`value`: String) {
    unwrap(this).setSlackChannelId(`value`)
  }

  public open fun slackWorkspaceId(): String = unwrap(this).getSlackWorkspaceId()

  public open fun slackWorkspaceId(`value`: String) {
    unwrap(this).setSlackWorkspaceId(`value`)
  }

  public open fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  public open fun snsTopicArns(`value`: List<String>) {
    unwrap(this).setSnsTopicArns(`value`)
  }

  public open fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  public open fun userRoleRequired(`value`: Boolean) {
    unwrap(this).setUserRoleRequired(`value`)
  }

  public open fun userRoleRequired(`value`: IResolvable) {
    unwrap(this).setUserRoleRequired(`value`.let(IResolvable::unwrap))
  }

  public interface Builder {
    public fun configurationName(configurationName: String) {
    }

    public fun guardrailPolicies(guardrailPolicies: List<String>) {
    }

    public fun iamRoleArn(iamRoleArn: String) {
    }

    public fun loggingLevel(loggingLevel: String) {
    }

    public fun slackChannelId(slackChannelId: String) {
    }

    public fun slackWorkspaceId(slackWorkspaceId: String) {
    }

    public fun snsTopicArns(snsTopicArns: List<String>) {
    }

    public fun userRoleRequired(userRoleRequired: Boolean) {
    }

    public fun userRoleRequired(userRoleRequired: IResolvable) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration.Builder =
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration.Builder.create(scope,
        id)

    public override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    public override fun guardrailPolicies(guardrailPolicies: List<String>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies)
    }

    public override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    public override fun loggingLevel(loggingLevel: String) {
      cdkBuilder.loggingLevel(loggingLevel)
    }

    public override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

    public override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    public override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    public override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    public override fun userRoleRequired(userRoleRequired: IResolvable) {
      cdkBuilder.userRoleRequired(userRoleRequired.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSlackChannelConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSlackChannelConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration):
        CfnSlackChannelConfiguration = CfnSlackChannelConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfiguration):
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration = wrapped.cdkObject
  }
}
