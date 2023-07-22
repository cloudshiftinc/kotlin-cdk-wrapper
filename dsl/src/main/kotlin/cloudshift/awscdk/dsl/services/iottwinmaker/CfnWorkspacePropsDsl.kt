@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps

/**
 * Properties for defining a `CfnWorkspace`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * CfnWorkspaceProps cfnWorkspaceProps = CfnWorkspaceProps.builder()
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
public class CfnWorkspacePropsDsl {
  private val cdkBuilder: CfnWorkspaceProps.Builder = CfnWorkspaceProps.builder()

  /**
   * @param description The description of the workspace.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param role The ARN of the execution role associated with the workspace. 
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  /**
   * @param s3Location The ARN of the S3 bucket where resources associated with the workspace are
   * stored. 
   */
  public fun s3Location(s3Location: String) {
    cdkBuilder.s3Location(s3Location)
  }

  /**
   * @param tags Metadata that you can use to manage the workspace.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param workspaceId The ID of the workspace. 
   */
  public fun workspaceId(workspaceId: String) {
    cdkBuilder.workspaceId(workspaceId)
  }

  public fun build(): CfnWorkspaceProps = cdkBuilder.build()
}
