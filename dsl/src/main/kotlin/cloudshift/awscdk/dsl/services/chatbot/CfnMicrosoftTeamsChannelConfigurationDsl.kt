@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.chatbot

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.chatbot.CfnMicrosoftTeamsChannelConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnMicrosoftTeamsChannelConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMicrosoftTeamsChannelConfiguration.Builder =
      CfnMicrosoftTeamsChannelConfiguration.Builder.create(scope, id)

  private val _guardrailPolicies: MutableList<String> = mutableListOf()

  private val _snsTopicArns: MutableList<String> = mutableListOf()

  /**
   * The name of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-configurationname)
   * @param configurationName The name of the configuration. 
   */
  public fun configurationName(configurationName: String) {
    cdkBuilder.configurationName(configurationName)
  }

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   *
   * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
   * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
   */
  public fun guardrailPolicies(vararg guardrailPolicies: String) {
    _guardrailPolicies.addAll(listOf(*guardrailPolicies))
  }

  /**
   * The list of IAM policy ARNs that are applied as channel guardrails.
   *
   * The AWS managed 'AdministratorAccess' policy is applied as a default if this is not set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-guardrailpolicies)
   * @param guardrailPolicies The list of IAM policy ARNs that are applied as channel guardrails. 
   */
  public fun guardrailPolicies(guardrailPolicies: Collection<String>) {
    _guardrailPolicies.addAll(guardrailPolicies)
  }

  /**
   * The ARN of the IAM role that defines the permissions for AWS Chatbot .
   *
   * This is a user-defined role that AWS Chatbot will assume. This is not the service-linked role.
   * For more information, see [IAM Policies for AWS
   * Chatbot](https://docs.aws.amazon.com/chatbot/latest/adminguide/chatbot-iam-policies.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-iamrolearn)
   * @param iamRoleArn The ARN of the IAM role that defines the permissions for AWS Chatbot . 
   */
  public fun iamRoleArn(iamRoleArn: String) {
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-logginglevel)
   * @param loggingLevel Specifies the logging level for this configuration. This property affects
   * the log entries pushed to Amazon CloudWatch Logs. 
   */
  public fun loggingLevel(loggingLevel: String) {
    cdkBuilder.loggingLevel(loggingLevel)
  }

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
   * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
   */
  public fun snsTopicArns(vararg snsTopicArns: String) {
    _snsTopicArns.addAll(listOf(*snsTopicArns))
  }

  /**
   * The ARNs of the SNS topics that deliver notifications to AWS Chatbot .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-snstopicarns)
   * @param snsTopicArns The ARNs of the SNS topics that deliver notifications to AWS Chatbot . 
   */
  public fun snsTopicArns(snsTopicArns: Collection<String>) {
    _snsTopicArns.addAll(snsTopicArns)
  }

  /**
   * The ID of the Microsoft Team authorized with AWS Chatbot .
   *
   * To get the team ID, you must perform the initial authorization flow with Microsoft Teams in the
   * AWS Chatbot console. Then you can copy and paste the team ID from the console. For more details,
   * see steps 1-4 in [Get started with Microsoft
   * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
   * in the *AWS Chatbot Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamid)
   * @param teamId The ID of the Microsoft Team authorized with AWS Chatbot . 
   */
  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  /**
   * The ID of the Microsoft Teams channel.
   *
   * To get the channel ID, open Microsoft Teams, right click on the channel name in the left pane,
   * then choose Copy. An example of the channel ID syntax is:
   * `19%3ab6ef35dc342d56ba5654e6fc6d25a071%40thread.tacv2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamschannelid)
   * @param teamsChannelId The ID of the Microsoft Teams channel. 
   */
  public fun teamsChannelId(teamsChannelId: String) {
    cdkBuilder.teamsChannelId(teamsChannelId)
  }

  /**
   * The ID of the Microsoft Teams tenant.
   *
   * To get the tenant ID, you must perform the initial authorization flow with Microsoft Teams in
   * the AWS Chatbot console. Then you can copy and paste the tenant ID from the console. For more
   * details, see steps 1-4 in [Get started with Microsoft
   * Teams](https://docs.aws.amazon.com/chatbot/latest/adminguide/teams-setup.html#teams-client-setup)
   * in the *AWS Chatbot Administrator Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-teamstenantid)
   * @param teamsTenantId The ID of the Microsoft Teams tenant. 
   */
  public fun teamsTenantId(teamsTenantId: String) {
    cdkBuilder.teamsTenantId(teamsTenantId)
  }

  /**
   * Enables use of a user role requirement in your chat configuration.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
   * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
   */
  public fun userRoleRequired(userRoleRequired: Boolean) {
    cdkBuilder.userRoleRequired(userRoleRequired)
  }

  /**
   * Enables use of a user role requirement in your chat configuration.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-chatbot-microsoftteamschannelconfiguration.html#cfn-chatbot-microsoftteamschannelconfiguration-userrolerequired)
   * @param userRoleRequired Enables use of a user role requirement in your chat configuration. 
   */
  public fun userRoleRequired(userRoleRequired: IResolvable) {
    cdkBuilder.userRoleRequired(userRoleRequired)
  }

  public fun build(): CfnMicrosoftTeamsChannelConfiguration {
    if(_guardrailPolicies.isNotEmpty()) cdkBuilder.guardrailPolicies(_guardrailPolicies)
    if(_snsTopicArns.isNotEmpty()) cdkBuilder.snsTopicArns(_snsTopicArns)
    return cdkBuilder.build()
  }
}
