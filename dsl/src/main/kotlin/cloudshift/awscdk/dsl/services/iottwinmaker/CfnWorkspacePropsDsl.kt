@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iottwinmaker.CfnWorkspaceProps

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
