@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspace
import software.constructs.Construct

/**
 * Use the `AWS::IoTTwinMaker::Workspace` resource to declare a workspace.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * CfnWorkspace cfnWorkspace = CfnWorkspace.Builder.create(this, "MyCfnWorkspace")
 * .role("role")
 * .s3Location("s3Location")
 * .workspaceId("workspaceId")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html)
 */
@CdkDslMarker
public class CfnWorkspaceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWorkspace.Builder = CfnWorkspace.Builder.create(scope, id)

  /**
   * The description of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-description)
   * @param description The description of the workspace. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ARN of the execution role associated with the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-role)
   * @param role The ARN of the execution role associated with the workspace. 
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  /**
   * The ARN of the S3 bucket where resources associated with the workspace are stored.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-s3location)
   * @param s3Location The ARN of the S3 bucket where resources associated with the workspace are
   * stored. 
   */
  public fun s3Location(s3Location: String) {
    cdkBuilder.s3Location(s3Location)
  }

  /**
   * Metadata that you can use to manage the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-tags)
   * @param tags Metadata that you can use to manage the workspace. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * The ID of the workspace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iottwinmaker-workspace.html#cfn-iottwinmaker-workspace-workspaceid)
   * @param workspaceId The ID of the workspace. 
   */
  public fun workspaceId(workspaceId: String) {
    cdkBuilder.workspaceId(workspaceId)
  }

  public fun build(): CfnWorkspace = cdkBuilder.build()
}
