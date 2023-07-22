@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.constructs.Construct

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
@CdkDslMarker
public class CfnSlackWorkspaceConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSlackWorkspaceConfiguration.Builder =
      CfnSlackWorkspaceConfiguration.Builder.create(scope, id)

  /**
   * The team ID in Slack.
   *
   * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-teamid)
   * @param teamId The team ID in Slack. 
   */
  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  /**
   * An identifier used to update an existing Slack workspace configuration in AWS CloudFormation ,
   * such as `100` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-supportapp-slackworkspaceconfiguration.html#cfn-supportapp-slackworkspaceconfiguration-versionid)
   * @param versionId An identifier used to update an existing Slack workspace configuration in AWS
   * CloudFormation , such as `100` . 
   */
  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnSlackWorkspaceConfiguration = cdkBuilder.build()
}
