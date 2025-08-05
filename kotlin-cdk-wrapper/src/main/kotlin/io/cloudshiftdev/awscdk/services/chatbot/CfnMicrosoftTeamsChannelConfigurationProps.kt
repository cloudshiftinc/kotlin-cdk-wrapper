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
 * Properties for defining a `CfnMicrosoftTeamsChannelConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.chatbot.*;
 * CfnMicrosoftTeamsChannelConfigurationProps cfnMicrosoftTeamsChannelConfigurationProps =
 * CfnMicrosoftTeamsChannelConfigurationProps.builder()
 * .configurationName("configurationName")
 * .iamRoleArn("iamRoleArn")
 * .teamId("teamId")
 * .teamsChannelId("teamsChannelId")
 * .teamsTenantId("teamsTenantId")
 * // the properties below are optional
 * .customizationResourceArns(List.of("customizationResourceArns"))
 * .guardrailPolicies(List.of("guardrailPolicies"))
 * .loggingLevel("loggingLevel")
 * .snsTopicArns(List.of("snsTopicArns"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .teamsChannelName("teamsChannelName")
 * .userRoleRequired(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html)
 */
public interface CfnMicrosoftTeamsChannelConfigurationProps {
  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
   */
  public fun configurationName(): String

  /**
   * Links a list of resource ARNs (for example, custom action ARNs) to a Microsoft Teams channel
   * configuration for  .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-customizationresourcearns)
   */
  public fun customizationResourceArns(): List<String> = unwrap(this).getCustomizationResourceArns()
      ?: emptyList()

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   *
   * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
   */
  public fun guardrailPolicies(): List<String> = unwrap(this).getGuardrailPolicies() ?: emptyList()

  /**
   * The ARN of the IAM role that defines the permissions for  .
   *
   * This is a user-defined role that  will assume. This is not the service-linked role. For more
   * information, see [IAM Policies for  in chat
   * applications](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
   */
  public fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

  /**
   * The ARNs of the SNS topics that deliver notifications to  .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
   */
  public fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

  /**
   * The tags to add to the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the Microsoft Team authorized with  .
   *
   * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in the
   *  in chat applications console. Then you can copy and paste the team ID from the console. For more
   * details, see steps 1-3 in [Tutorial: Get started with Microsoft
   * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
   * applications Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
   */
  public fun teamId(): String

  /**
   * The ID of the Microsoft Teams channel.
   *
   * To get the channel ID, open Microsoft Teams, right click on the channel name in the left pane,
   * then choose *Copy* . An example of the channel ID syntax is:
   * `19%3ab6ef35dc342d56ba5654e6fc6d25a071%40thread.tacv2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
   */
  public fun teamsChannelId(): String

  /**
   * The name of the Microsoft Teams channel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelname)
   */
  public fun teamsChannelName(): String? = unwrap(this).getTeamsChannelName()

  /**
   * The ID of the Microsoft Teams tenant.
   *
   * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
   * the  in chat applications console. Then you can copy and paste the tenant ID from the console. For
   * more details, see steps 1-3 in [Tutorial: Get started with Microsoft
   * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
   * applications Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
   */
  public fun teamsTenantId(): String

  /**
   * Enables use of a user role requirement in your chat configuration.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
   */
  public fun userRoleRequired(): Any? = unwrap(this).getUserRoleRequired()

  /**
   * A builder for [CfnMicrosoftTeamsChannelConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationName The name of the configuration. 
     */
    public fun configurationName(configurationName: String)

    /**
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Microsoft Teams channel configuration for  .
     */
    public fun customizationResourceArns(customizationResourceArns: List<String>)

    /**
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Microsoft Teams channel configuration for  .
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
     * @param teamId The ID of the Microsoft Team authorized with  . 
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the  in chat applications console. Then you can copy and paste the team ID from the console. For
     * more details, see steps 1-3 in [Tutorial: Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
     * applications Administrator Guide* .
     */
    public fun teamId(teamId: String)

    /**
     * @param teamsChannelId The ID of the Microsoft Teams channel. 
     * To get the channel ID, open Microsoft Teams, right click on the channel name in the left
     * pane, then choose *Copy* . An example of the channel ID syntax is:
     * `19%3ab6ef35dc342d56ba5654e6fc6d25a071%40thread.tacv2` .
     */
    public fun teamsChannelId(teamsChannelId: String)

    /**
     * @param teamsChannelName The name of the Microsoft Teams channel.
     */
    public fun teamsChannelName(teamsChannelName: String)

    /**
     * @param teamsTenantId The ID of the Microsoft Teams tenant. 
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the  in chat applications console. Then you can copy and paste the tenant ID from the console.
     * For more details, see steps 1-3 in [Tutorial: Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
     * applications Administrator Guide* .
     */
    public fun teamsTenantId(teamsTenantId: String)

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
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps.Builder =
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps.builder()

    /**
     * @param configurationName The name of the configuration. 
     */
    override fun configurationName(configurationName: String) {
      cdkBuilder.configurationName(configurationName)
    }

    /**
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Microsoft Teams channel configuration for  .
     */
    override fun customizationResourceArns(customizationResourceArns: List<String>) {
      cdkBuilder.customizationResourceArns(customizationResourceArns)
    }

    /**
     * @param customizationResourceArns Links a list of resource ARNs (for example, custom action
     * ARNs) to a Microsoft Teams channel configuration for  .
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
     * @param teamId The ID of the Microsoft Team authorized with  . 
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the  in chat applications console. Then you can copy and paste the team ID from the console. For
     * more details, see steps 1-3 in [Tutorial: Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
     * applications Administrator Guide* .
     */
    override fun teamId(teamId: String) {
      cdkBuilder.teamId(teamId)
    }

    /**
     * @param teamsChannelId The ID of the Microsoft Teams channel. 
     * To get the channel ID, open Microsoft Teams, right click on the channel name in the left
     * pane, then choose *Copy* . An example of the channel ID syntax is:
     * `19%3ab6ef35dc342d56ba5654e6fc6d25a071%40thread.tacv2` .
     */
    override fun teamsChannelId(teamsChannelId: String) {
      cdkBuilder.teamsChannelId(teamsChannelId)
    }

    /**
     * @param teamsChannelName The name of the Microsoft Teams channel.
     */
    override fun teamsChannelName(teamsChannelName: String) {
      cdkBuilder.teamsChannelName(teamsChannelName)
    }

    /**
     * @param teamsTenantId The ID of the Microsoft Teams tenant. 
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the  in chat applications console. Then you can copy and paste the tenant ID from the console.
     * For more details, see steps 1-3 in [Tutorial: Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
     * applications Administrator Guide* .
     */
    override fun teamsTenantId(teamsTenantId: String) {
      cdkBuilder.teamsTenantId(teamsTenantId)
    }

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

    public fun build():
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnMicrosoftTeamsChannelConfigurationProps {
    /**
     * The name of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
     */
    override fun configurationName(): String = unwrap(this).getConfigurationName()

    /**
     * Links a list of resource ARNs (for example, custom action ARNs) to a Microsoft Teams channel
     * configuration for  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-customizationresourcearns)
     */
    override fun customizationResourceArns(): List<String> =
        unwrap(this).getCustomizationResourceArns() ?: emptyList()

    /**
     * The list of IAM policy ARNs that are applied as channel guardrails.
     *
     * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
     */
    override fun loggingLevel(): String? = unwrap(this).getLoggingLevel()

    /**
     * The ARNs of the SNS topics that deliver notifications to  .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
     */
    override fun snsTopicArns(): List<String> = unwrap(this).getSnsTopicArns() ?: emptyList()

    /**
     * The tags to add to the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the Microsoft Team authorized with  .
     *
     * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in
     * the  in chat applications console. Then you can copy and paste the team ID from the console. For
     * more details, see steps 1-3 in [Tutorial: Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
     * applications Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
     */
    override fun teamId(): String = unwrap(this).getTeamId()

    /**
     * The ID of the Microsoft Teams channel.
     *
     * To get the channel ID, open Microsoft Teams, right click on the channel name in the left
     * pane, then choose *Copy* . An example of the channel ID syntax is:
     * `19%3ab6ef35dc342d56ba5654e6fc6d25a071%40thread.tacv2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
     */
    override fun teamsChannelId(): String = unwrap(this).getTeamsChannelId()

    /**
     * The name of the Microsoft Teams channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelname)
     */
    override fun teamsChannelName(): String? = unwrap(this).getTeamsChannelName()

    /**
     * The ID of the Microsoft Teams tenant.
     *
     * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
     * the  in chat applications console. Then you can copy and paste the tenant ID from the console.
     * For more details, see steps 1-3 in [Tutorial: Get started with Microsoft
     * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html) in the *in chat
     * applications Administrator Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
     */
    override fun teamsTenantId(): String = unwrap(this).getTeamsTenantId()

    /**
     * Enables use of a user role requirement in your chat configuration.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
     */
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
        CfnMicrosoftTeamsChannelConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMicrosoftTeamsChannelConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMicrosoftTeamsChannelConfigurationProps):
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfigurationProps
  }
}
