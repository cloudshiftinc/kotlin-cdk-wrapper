package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
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
  /**
   * Amazon Resource Name (ARN) of the configuration.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the configuration.
   */
  public open fun configurationName(): String = unwrap(this).getConfigurationName()

  /**
   * The name of the configuration.
   */
  public open fun configurationName(`value`: String) {
    unwrap(this).setConfigurationName(`value`)
  }

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   */
  public open fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
      emptyList()

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   */
  public open fun guardrailPolicies(`value`: List<String>) {
    unwrap(this).setGuardrailPolicies(`value`)
  }

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   */
  public open fun guardrailPolicies(vararg `value`: String): Unit =
      guardrailPolicies(`value`.toList())

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   */
  public open fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   */
  public open fun iamRoleArn(`value`: String) {
    unwrap(this).setIamRoleArn(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Specifies the logging level for this configuration.
   *
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public open fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  /**
   * Specifies the logging level for this configuration.
   *
   * This property affects the log entries pushed to Amazon CloudWatch Logs.
   */
  public open fun loggingLevel(`value`: String) {
    unwrap(this).setLoggingLevel(`value`)
  }

  /**
   * The ID of the Slack channel.
   */
  public open fun slackChannelId(): String = unwrap(this).getSlackChannelId()

  /**
   * The ID of the Slack channel.
   */
  public open fun slackChannelId(`value`: String) {
    unwrap(this).setSlackChannelId(`value`)
  }

  /**
   * The ID of the Slack workspace authorized with AWS Chatbot .
   */
  public open fun slackWorkspaceId(): String = unwrap(this).getSlackWorkspaceId()

  /**
   * The ID of the Slack workspace authorized with AWS Chatbot .
   */
  public open fun slackWorkspaceId(`value`: String) {
    unwrap(this).setSlackWorkspaceId(`value`)
  }

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   */
  public open fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   */
  public open fun snsTopicArns(`value`: List<String>) {
    unwrap(this).setSnsTopicArns(`value`)
  }

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   */
  public open fun snsTopicArns(vararg `value`: String): Unit = snsTopicArns(`value`.toList())

  /**
   * Enables use of a user role requirement in your chat configuration.
   */
  public open fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  /**
   * Enables use of a user role requirement in your chat configuration.
   */
  public open fun userRoleRequired(`value`: Boolean) {
    unwrap(this).setUserRoleRequired(`value`)
  }

  /**
   * Enables use of a user role requirement in your chat configuration.
   */
  public open fun userRoleRequired(`value`: IResolvable) {
    unwrap(this).setUserRoleRequired(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.chatbot.CfnSlackChannelConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
     * @param configurationName The name of the configuration. 
     */
    public fun configurationName(configurationName: String)

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    public fun guardrailPolicies(guardrailPolicies: List<String>)

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    public fun guardrailPolicies(vararg guardrailPolicies: String)

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * Specifies the logging level for this configuration. This property affects the log entries
     * pushed to Amazon CloudWatch Logs.
     *
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel)
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs. 
     */
    public fun loggingLevel(loggingLevel: String)

    /**
     * The ID of the Slack channel.
     *
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link. The channel ID is the 9-character string at the end of the URL. For example, `ABCBBLZZZ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
     * @param slackChannelId The ID of the Slack channel. 
     */
    public fun slackChannelId(slackChannelId: String)

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot .
     *
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console. Then you can copy and paste the workspace ID from the console. For more
     * details, see steps 1-4 in [Setting Up AWS Chatbot with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro) in the
     * *AWS Chatbot User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid)
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot . 
     */
    public fun slackWorkspaceId(slackWorkspaceId: String)

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    public fun snsTopicArns(snsTopicArns: List<String>)

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    public fun snsTopicArns(vararg snsTopicArns: String)

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    public fun userRoleRequired(userRoleRequired: Boolean)

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    public fun userRoleRequired(userRoleRequired: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration.Builder =
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfiguration.Builder.create(scope,
        id)

    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
     * @param configurationName The name of the configuration. 
     */
    override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    override fun guardrailPolicies(guardrailPolicies: List<String>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies)
    }

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
     */
    override fun guardrailPolicies(vararg guardrailPolicies: String): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn)
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * Specifies the logging level for this configuration. This property affects the log entries
     * pushed to Amazon CloudWatch Logs.
     *
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel)
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs. 
     */
    override fun loggingLevel(loggingLevel: String) {
      cdkBuilder.loggingLevel(loggingLevel)
    }

    /**
     * The ID of the Slack channel.
     *
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link. The channel ID is the 9-character string at the end of the URL. For example, `ABCBBLZZZ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
     * @param slackChannelId The ID of the Slack channel. 
     */
    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

    /**
     * The ID of the Slack workspace authorized with AWS Chatbot .
     *
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console. Then you can copy and paste the workspace ID from the console. For more
     * details, see steps 1-4 in [Setting Up AWS Chatbot with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro) in the
     * *AWS Chatbot User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid)
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot . 
     */
    override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
     */
    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
     */
    override fun userRoleRequired(userRoleRequired: IResolvable) {
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
