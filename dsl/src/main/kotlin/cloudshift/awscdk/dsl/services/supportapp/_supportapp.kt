@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.supportapp.CfnAccountAlias
import software.amazon.awscdk.services.supportapp.CfnAccountAliasProps
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackChannelConfigurationProps
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps
import software.constructs.Construct

public object supportapp {
  /**
   * You can use the `AWS::SupportApp::AccountAlias` resource to specify your AWS account when you
   * configure the AWS Support App in Slack.
   *
   * Your alias name appears on the AWS Support App page in the Support Center Console and in
   * messages from the AWS Support App. You can use this alias to identify the account you've
   * configured with the AWS Support App .
   *
   * For more information, see [AWS Support App in
   * Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html) in the
   * *AWS Support User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.supportapp.*;
   * CfnAccountAlias cfnAccountAlias = CfnAccountAlias.Builder.create(this, "MyCfnAccountAlias")
   * .accountAlias("accountAlias")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html)
   */
  public inline fun cfnAccountAlias(
    scope: Construct,
    id: String,
    block: CfnAccountAliasDsl.() -> Unit = {},
  ): CfnAccountAlias {
    val builder = CfnAccountAliasDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAccountAlias`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.supportapp.*;
   * CfnAccountAliasProps cfnAccountAliasProps = CfnAccountAliasProps.builder()
   * .accountAlias("accountAlias")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-accountalias.html)
   */
  public inline fun cfnAccountAliasProps(block: CfnAccountAliasPropsDsl.() -> Unit = {}):
      CfnAccountAliasProps {
    val builder = CfnAccountAliasPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * You can use the `AWS::SupportApp::SlackChannelConfiguration` resource to specify your AWS
   * account when you configure the AWS Support App .
   *
   * This resource includes the following information:
   *
   * * The Slack channel name and ID
   * * The team ID in Slack
   * * The Amazon Resource Name (ARN) of the AWS Identity and Access Management ( IAM ) role
   * * Whether you want the AWS Support App to notify you when your support cases are created,
   * updated, resolved, or reopened
   * * The case severity that you want to get notified for
   *
   * For more information, see the following topics in the *AWS Support User Guide* :
   *
   * * [AWS Support App in
   * Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html)
   * * [Creating AWS Support App in Slack resources with AWS
   * CloudFormation](https://docs.aws.amazon.com/awssupport/latest/user/creating-resources-with-cloudformation.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.supportapp.*;
   * CfnSlackChannelConfiguration cfnSlackChannelConfiguration =
   * CfnSlackChannelConfiguration.Builder.create(this, "MyCfnSlackChannelConfiguration")
   * .channelId("channelId")
   * .channelRoleArn("channelRoleArn")
   * .notifyOnCaseSeverity("notifyOnCaseSeverity")
   * .teamId("teamId")
   * // the properties below are optional
   * .channelName("channelName")
   * .notifyOnAddCorrespondenceToCase(false)
   * .notifyOnCreateOrReopenCase(false)
   * .notifyOnResolveCase(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html)
   */
  public inline fun cfnSlackChannelConfiguration(
    scope: Construct,
    id: String,
    block: CfnSlackChannelConfigurationDsl.() -> Unit = {},
  ): CfnSlackChannelConfiguration {
    val builder = CfnSlackChannelConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSlackChannelConfiguration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.supportapp.*;
   * CfnSlackChannelConfigurationProps cfnSlackChannelConfigurationProps =
   * CfnSlackChannelConfigurationProps.builder()
   * .channelId("channelId")
   * .channelRoleArn("channelRoleArn")
   * .notifyOnCaseSeverity("notifyOnCaseSeverity")
   * .teamId("teamId")
   * // the properties below are optional
   * .channelName("channelName")
   * .notifyOnAddCorrespondenceToCase(false)
   * .notifyOnCreateOrReopenCase(false)
   * .notifyOnResolveCase(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackchannelconfiguration.html)
   */
  public inline
      fun cfnSlackChannelConfigurationProps(block: CfnSlackChannelConfigurationPropsDsl.() -> Unit =
      {}): CfnSlackChannelConfigurationProps {
    val builder = CfnSlackChannelConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * You can use the `AWS::SupportApp::SlackWorkspaceConfiguration` resource to specify your Slack
   * workspace configuration.
   *
   * This resource configures your AWS account so that you can use the specified Slack workspace in
   * the AWS Support App . This resource includes the following information:
   *
   * * The team ID for the Slack workspace
   * * The version ID of the resource to use with AWS CloudFormation
   *
   * For more information, see the following topics in the *AWS Support User Guide* :
   *
   * * [AWS Support App in
   * Slack](https://docs.aws.amazon.com/awssupport/latest/user/aws-support-app-for-slack.html)
   * * [Creating AWS Support App in Slack resources with AWS
   * CloudFormation](https://docs.aws.amazon.com/awssupport/latest/user/creating-resources-with-cloudformation.html)
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.supportapp.*;
   * CfnSlackWorkspaceConfiguration cfnSlackWorkspaceConfiguration =
   * CfnSlackWorkspaceConfiguration.Builder.create(this, "MyCfnSlackWorkspaceConfiguration")
   * .teamId("teamId")
   * // the properties below are optional
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html)
   */
  public inline fun cfnSlackWorkspaceConfiguration(
    scope: Construct,
    id: String,
    block: CfnSlackWorkspaceConfigurationDsl.() -> Unit = {},
  ): CfnSlackWorkspaceConfiguration {
    val builder = CfnSlackWorkspaceConfigurationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSlackWorkspaceConfiguration`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.supportapp.*;
   * CfnSlackWorkspaceConfigurationProps cfnSlackWorkspaceConfigurationProps =
   * CfnSlackWorkspaceConfigurationProps.builder()
   * .teamId("teamId")
   * // the properties below are optional
   * .versionId("versionId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html)
   */
  public inline
      fun cfnSlackWorkspaceConfigurationProps(block: CfnSlackWorkspaceConfigurationPropsDsl.() -> Unit
      = {}): CfnSlackWorkspaceConfigurationProps {
    val builder = CfnSlackWorkspaceConfigurationPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
