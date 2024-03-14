package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnSlackChannelConfigurationProps {
  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
   */
  public fun configurationName(): String

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   *
   * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
   */
  public fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?: emptyList()

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   *
   * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked role.
   * For more information, see [IAM Policies for AWS
   * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn)
   */
  public fun iamRoleArn(): String

  /**
   * Specifies the logging level for this configuration. This property affects the log entries
   * pushed to Amazon CloudWatch Logs.
   *
   * Logging levels include `ERROR` , `INFO` , or `NONE` .
   *
   * Default: - "NONE"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel)
   */
  public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  /**
   * The ID of the Slack channel.
   *
   * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
   * Link. The channel ID is the 9-character string at the end of the URL. For example, `ABCBBLZZZ` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
   */
  public fun slackChannelId(): String

  /**
   * The ID of the Slack workspace authorized with AWS Chatbot .
   *
   * To get the workspace ID, you must perform the initial authorization flow with Slack in the AWS
   * Chatbot console. Then you can copy and paste the workspace ID from the console. For more details,
   * see steps 1-4 in [Setting Up AWS Chatbot with
   * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro) in the
   * *AWS Chatbot User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid)
   */
  public fun slackWorkspaceId(): String

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
   */
  public fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  /**
   * Enables use of a user role requirement in your chat configuration.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
   */
  public fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  /**
   * A builder for [CfnSlackChannelConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationName The name of the configuration. 
     */
    public fun configurationName(configurationName: String)

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    public fun guardrailPolicies(guardrailPolicies: List<String>)

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    public fun guardrailPolicies(vararg guardrailPolicies: String)

    /**
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     */
    public fun iamRoleArn(iamRoleArn: String)

    /**
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs.
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     */
    public fun loggingLevel(loggingLevel: String)

    /**
     * @param slackChannelId The ID of the Slack channel. 
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link. The channel ID is the 9-character string at the end of the URL. For example, `ABCBBLZZZ` .
     */
    public fun slackChannelId(slackChannelId: String)

    /**
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot . 
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console. Then you can copy and paste the workspace ID from the console. For more
     * details, see steps 1-4 in [Setting Up AWS Chatbot with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro) in the
     * *AWS Chatbot User Guide* .
     */
    public fun slackWorkspaceId(slackWorkspaceId: String)

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(snsTopicArns: List<String>)

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    public fun snsTopicArns(vararg snsTopicArns: String)

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: Boolean)

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    public fun userRoleRequired(userRoleRequired: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps.builder()

    /**
     * @param configurationName The name of the configuration. 
     */
    override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    override fun guardrailPolicies(guardrailPolicies: List<String>) {
      cdkBuilder.guardrailPolicies(guardrailPolicies)
    }

    /**
     * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails.
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     */
    override fun guardrailPolicies(vararg guardrailPolicies: String): Unit =
        guardrailPolicies(guardrailPolicies.toList())

    /**
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     */
    override fun iamRoleArn(iamRoleArn: String) {
      cdkBuilder.iamRoleArn(iamRoleArn)
    }

    /**
     * @param loggingLevel Specifies the logging level for this configuration. This property affects
     * the log entries pushed to Amazon CloudWatch Logs.
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     */
    override fun loggingLevel(loggingLevel: String) {
      cdkBuilder.loggingLevel(loggingLevel)
    }

    /**
     * @param slackChannelId The ID of the Slack channel. 
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link. The channel ID is the 9-character string at the end of the URL. For example, `ABCBBLZZZ` .
     */
    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

    /**
     * @param slackWorkspaceId The ID of the Slack workspace authorized with AWS Chatbot . 
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the
     * AWS Chatbot console. Then you can copy and paste the workspace ID from the console. For more
     * details, see steps 1-4 in [Setting Up AWS Chatbot with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/setting-up.html#Setup_intro) in the
     * *AWS Chatbot User Guide* .
     */
    override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     */
    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
    override fun userRoleRequired(userRoleRequired: Boolean) {
      cdkBuilder.userRoleRequired(userRoleRequired)
    }

    /**
     * @param userRoleRequired Enables use of a user role requirement in your chat configuration.
     */
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
    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
     */
    override fun configurationName(): String = unwrap(this).getConfigurationName()

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
     */
    override fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?:
        emptyList()

    /**
     * The ARN of the IAM role that defines the permissions for AWS Chatbot .
     *
     * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked
     * role. For more information, see [IAM Policies for AWS
     * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-iamrolearn)
     */
    override fun iamRoleArn(): String = unwrap(this).getIamRoleArn()

    /**
     * Specifies the logging level for this configuration. This property affects the log entries
     * pushed to Amazon CloudWatch Logs.
     *
     * Logging levels include `ERROR` , `INFO` , or `NONE` .
     *
     * Default: - "NONE"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-logginglevel)
     */
    override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * The ID of the Slack channel.
     *
     * To get the ID, open Slack, right click on the channel name in the left pane, then choose Copy
     * Link. The channel ID is the 9-character string at the end of the URL. For example, `ABCBBLZZZ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
     */
    override fun slackChannelId(): String = unwrap(this).getSlackChannelId()

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
     */
    override fun slackWorkspaceId(): String = unwrap(this).getSlackWorkspaceId()

    /**
     * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     */
    override fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-userrolerequired)
     */
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
