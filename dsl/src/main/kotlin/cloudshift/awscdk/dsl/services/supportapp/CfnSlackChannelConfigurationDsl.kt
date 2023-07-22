@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnSlackChannelConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSlackChannelConfiguration.Builder =
      CfnSlackChannelConfiguration.Builder.create(scope, id)

  /**
   * The channel ID in Slack.
   *
   * This ID identifies a channel within a Slack workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelid)
   * @param channelId The channel ID in Slack. 
   */
  public fun channelId(channelId: String) {
    cdkBuilder.channelId(channelId)
  }

  /**
   * The channel name in Slack.
   *
   * This is the channel where you invite the AWS Support App .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelname)
   * @param channelName The channel name in Slack. 
   */
  public fun channelName(channelName: String) {
    cdkBuilder.channelName(channelName)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role for this Slack channel configuration.
   *
   * The AWS Support App uses this role to perform AWS Support and Service Quotas actions on your
   * behalf.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-channelrolearn)
   * @param channelRoleArn The Amazon Resource Name (ARN) of the IAM role for this Slack channel
   * configuration. 
   */
  public fun channelRoleArn(channelRoleArn: String) {
    cdkBuilder.channelRoleArn(channelRoleArn)
  }

  /**
   * Whether to get notified when a correspondence is added to your support cases.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
   * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
   * to your support cases. 
   */
  public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: Boolean) {
    cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
  }

  /**
   * Whether to get notified when a correspondence is added to your support cases.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonaddcorrespondencetocase)
   * @param notifyOnAddCorrespondenceToCase Whether to get notified when a correspondence is added
   * to your support cases. 
   */
  public fun notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase: IResolvable) {
    cdkBuilder.notifyOnAddCorrespondenceToCase(notifyOnAddCorrespondenceToCase)
  }

  /**
   * The case severity for your support cases that you want to receive notifications.
   *
   * You can specify `none` , `all` , or `high` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncaseseverity)
   * @param notifyOnCaseSeverity The case severity for your support cases that you want to receive
   * notifications. 
   */
  public fun notifyOnCaseSeverity(notifyOnCaseSeverity: String) {
    cdkBuilder.notifyOnCaseSeverity(notifyOnCaseSeverity)
  }

  /**
   * Whether to get notified when your support cases are created or reopened.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
   * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
   * or reopened. 
   */
  public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: Boolean) {
    cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
  }

  /**
   * Whether to get notified when your support cases are created or reopened.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyoncreateorreopencase)
   * @param notifyOnCreateOrReopenCase Whether to get notified when your support cases are created
   * or reopened. 
   */
  public fun notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase: IResolvable) {
    cdkBuilder.notifyOnCreateOrReopenCase(notifyOnCreateOrReopenCase)
  }

  /**
   * Whether to get notified when your support cases are resolved.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
   * @param notifyOnResolveCase Whether to get notified when your support cases are resolved. 
   */
  public fun notifyOnResolveCase(notifyOnResolveCase: Boolean) {
    cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
  }

  /**
   * Whether to get notified when your support cases are resolved.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-notifyonresolvecase)
   * @param notifyOnResolveCase Whether to get notified when your support cases are resolved. 
   */
  public fun notifyOnResolveCase(notifyOnResolveCase: IResolvable) {
    cdkBuilder.notifyOnResolveCase(notifyOnResolveCase)
  }

  /**
   * The team ID in Slack.
   *
   * This ID uniquely identifies a Slack workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html#cfn-supportapp-slackchannelconfiguration-teamid)
   * @param teamId The team ID in Slack. 
   */
  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  public fun build(): CfnSlackChannelConfiguration = cdkBuilder.build()
}
