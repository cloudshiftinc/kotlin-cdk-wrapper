@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.supportapp

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.supportapp.CfnSlackWorkspaceConfigurationProps

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
@CdkDslMarker
public class CfnSlackWorkspaceConfigurationPropsDsl {
  private val cdkBuilder: CfnSlackWorkspaceConfigurationProps.Builder =
      CfnSlackWorkspaceConfigurationProps.builder()

  /**
   * @param teamId The team ID in Slack. 
   * This ID uniquely identifies a Slack workspace, such as `T012ABCDEFG` .
   */
  public fun teamId(teamId: String) {
    cdkBuilder.teamId(teamId)
  }

  /**
   * @param versionId An identifier used to update an existing Slack workspace configuration in AWS
   * CloudFormation , such as `100` .
   */
  public fun versionId(versionId: String) {
    cdkBuilder.versionId(versionId)
  }

  public fun build(): CfnSlackWorkspaceConfigurationProps = cdkBuilder.build()
}
