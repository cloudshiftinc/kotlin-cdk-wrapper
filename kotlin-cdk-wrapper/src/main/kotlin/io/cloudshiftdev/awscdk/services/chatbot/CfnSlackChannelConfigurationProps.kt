@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.chatbot

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSlackChannelConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.chatbot.*;
 * CfnSlackChannelConfigurationProps cfnSlackChannelConfigurationProps =
 * CfnSlackChannelConfigurationProps.builder()
 * .configurationName("configurationName")
 * .iamRoleArn("iamRoleArn")
 * .slackChannelId("slackChannelId")
 * .slackWorkspaceId("slackWorkspaceId")
 * // the properties below are optional
 * .customizationResourceArns(List.of("customizationResourceArns"))
 * .guardrailPolicies(List.of("guardrailPolicies"))
 * .loggingLevel("loggingLevel")
 * .snsTopicArns(List.of("snsTopicArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userRoleRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html)
 */
public interface CfnSlackChannelConfigurationProps {
  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
   */
  public fun configurationName(): String

  /**
   * Links a list of resource ARNs (for example, custom action ARNs) to a Slack channel
   * configuration for  .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-customizationresourcearns)
   */
  public fun customizationResourceArns(): List<String> = unwrap(this).getCustomizationResourceArns()
      ?: emptyList()

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   *
   * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-guardrailpolicies)
   */
  public fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?: emptyList()

  /**
   * The ARN of the IAM role that defines the permissions for  .
   *
   * This is a user-defined role that  will assume. This is not the service-linked role. For more
   * information, see [IAM Policies for  in chat
   * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
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
   * Link. The channel ID is the character string at the end of the URL. For example, `ABCBBLZZZ` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
   */
  public fun slackChannelId(): String

  /**
   * The ID of the Slack workspace authorized with  .
   *
   * To get the workspace ID, you must perform the initial authorization flow with Slack in the  in
   * chat applications console. Then you can copy and paste the workspace ID from the console. For more
   * details, see steps 1-3 in [Tutorial: Get started with
   * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/slack-setup.html#slack-client-setup)
   * in the *in chat applications User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid)
   */
  public fun slackWorkspaceId(): String

  /**
   * The ARNs of the SNS topics that deliver notifications to  .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
   */
  public fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  /**
   * The tags to add to the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Slack channel configuration for  .
     */
    public fun customizationResourceArns(customizationResourceArns: List<String>)

    /**
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Slack channel configuration for  .
     */
    public fun customizationResourceArns(vararg customizationResourceArns: String)

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
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for  . 
     * This is a user-defined role that  will assume. This is not the service-linked role. For more
     * information, see [IAM Policies for  in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
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
     * Link. The channel ID is the character string at the end of the URL. For example, `ABCBBLZZZ` .
     */
    public fun slackChannelId(slackChannelId: String)

    /**
     * @param slackWorkspaceId The ID of the Slack workspace authorized with  . 
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the 
     * in chat applications console. Then you can copy and paste the workspace ID from the console. For
     * more details, see steps 1-3 in [Tutorial: Get started with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/slack-setup.html#slack-client-setup)
     * in the *in chat applications User Guide* .
     */
    public fun slackWorkspaceId(slackWorkspaceId: String)

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to  .
     */
    public fun snsTopicArns(snsTopicArns: List<String>)

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to  .
     */
    public fun snsTopicArns(vararg snsTopicArns: String)

    /**
     * @param tags The tags to add to the configuration.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the configuration.
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Slack channel configuration for  .
     */
    override fun customizationResourceArns(customizationResourceArns: List<String>) {
      cdkBuilder.customizationResourceArns(customizationResourceArns)
    }

    /**
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Slack channel configuration for  .
     */
    override fun customizationResourceArns(vararg customizationResourceArns: String): Unit =
        customizationResourceArns(customizationResourceArns.toList())

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
     * @param iamRoleArn The ARN of the IAM role that defines the permissions for  . 
     * This is a user-defined role that  will assume. This is not the service-linked role. For more
     * information, see [IAM Policies for  in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
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
     * Link. The channel ID is the character string at the end of the URL. For example, `ABCBBLZZZ` .
     */
    override fun slackChannelId(slackChannelId: String) {
      cdkBuilder.slackChannelId(slackChannelId)
    }

    /**
     * @param slackWorkspaceId The ID of the Slack workspace authorized with  . 
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the 
     * in chat applications console. Then you can copy and paste the workspace ID from the console. For
     * more details, see steps 1-3 in [Tutorial: Get started with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/slack-setup.html#slack-client-setup)
     * in the *in chat applications User Guide* .
     */
    override fun slackWorkspaceId(slackWorkspaceId: String) {
      cdkBuilder.slackWorkspaceId(slackWorkspaceId)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to  .
     */
    override fun snsTopicArns(snsTopicArns: List<String>) {
      cdkBuilder.snsTopicArns(snsTopicArns)
    }

    /**
     * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to  .
     */
    override fun snsTopicArns(vararg snsTopicArns: String): Unit =
        snsTopicArns(snsTopicArns.toList())

    /**
     * @param tags The tags to add to the configuration.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the configuration.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
      cdkBuilder.userRoleRequired(userRoleRequired.let(IResolvable.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnSlackChannelConfigurationProps {
    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-configurationname)
     */
    override fun configurationName(): String = unwrap(this).getConfigurationName()

    /**
     * Links a list of resource ARNs (for example, custom action ARNs) to a Slack channel
     * configuration for  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-customizationresourcearns)
     */
    override fun customizationResourceArns(): List<String> =
        unwrap(this).getCustomizationResourceArns() ?: emptyList()

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
     * The ARN of the IAM role that defines the permissions for  .
     *
     * This is a user-defined role that  will assume. This is not the service-linked role. For more
     * information, see [IAM Policies for  in chat
     * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
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
     * Link. The channel ID is the character string at the end of the URL. For example, `ABCBBLZZZ` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackchannelid)
     */
    override fun slackChannelId(): String = unwrap(this).getSlackChannelId()

    /**
     * The ID of the Slack workspace authorized with  .
     *
     * To get the workspace ID, you must perform the initial authorization flow with Slack in the 
     * in chat applications console. Then you can copy and paste the workspace ID from the console. For
     * more details, see steps 1-3 in [Tutorial: Get started with
     * Slack](https://docs.aws.amazon.com/chatbot/latest/adminguide/slack-setup.html#slack-client-setup)
     * in the *in chat applications User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-slackworkspaceid)
     */
    override fun slackWorkspaceId(): String = unwrap(this).getSlackWorkspaceId()

    /**
     * The ARNs of the SNS topics that deliver notifications to  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-snstopicarns)
     */
    override fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-slackchannelconfiguration.html#cfn-chatbot-slackchannelconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

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
        CfnSlackChannelConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSlackChannelConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSlackChannelConfigurationProps):
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.chatbot.CfnSlackChannelConfigurationProps
  }
}
