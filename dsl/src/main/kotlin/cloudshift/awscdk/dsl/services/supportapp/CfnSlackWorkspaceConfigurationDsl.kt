@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfiguration
import software.constructs.Construct

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
