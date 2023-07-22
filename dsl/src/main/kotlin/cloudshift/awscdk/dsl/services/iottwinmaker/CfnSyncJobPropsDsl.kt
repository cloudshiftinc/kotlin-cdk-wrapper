@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps

@CdkDslMarker
public class CfnSyncJobPropsDsl {
  private val cdkBuilder: CfnSyncJobProps.Builder = CfnSyncJobProps.builder()

  /**
   * @param syncRole The SyncJob IAM role. 
   * This IAM role is used by the sync job to read from the syncSource, and create, update or delete
   * the corresponding resources.
   */
  public fun syncRole(syncRole: String) {
    cdkBuilder.syncRole(syncRole)
  }

  /**
   * @param syncSource The sync source. 
   *
   * Currently the only supported syncSoucre is `SITEWISE` .
   */
  public fun syncSource(syncSource: String) {
    cdkBuilder.syncSource(syncSource)
  }

  /**
   * @param tags Metadata you can use to manage the SyncJob.
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * @param workspaceId The ID of the workspace that contains the sync job. 
   */
  public fun workspaceId(workspaceId: String) {
    cdkBuilder.workspaceId(workspaceId)
  }

  public fun build(): CfnSyncJobProps = cdkBuilder.build()
}
