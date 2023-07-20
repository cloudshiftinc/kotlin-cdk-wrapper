@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.iottwinmaker.CfnSyncJobProps

@CdkDslMarker
public class CfnSyncJobPropsDsl {
  private val cdkBuilder: CfnSyncJobProps.Builder = CfnSyncJobProps.builder()

  public fun syncRole(syncRole: String) {
    cdkBuilder.syncRole(syncRole)
  }

  public fun syncSource(syncSource: String) {
    cdkBuilder.syncSource(syncSource)
  }

  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  public fun workspaceId(workspaceId: String) {
    cdkBuilder.workspaceId(workspaceId)
  }

  public fun build(): CfnSyncJobProps = cdkBuilder.build()
}
