@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

@CdkDslMarker
public class CfnGlobalReplicationGroupGlobalReplicationGroupMemberPropertyDsl {
  private val cdkBuilder: CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder =
      CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.builder()

  /**
   * @param replicationGroupId The replication group id of the Global datastore member.
   */
  public fun replicationGroupId(replicationGroupId: String) {
    cdkBuilder.replicationGroupId(replicationGroupId)
  }

  /**
   * @param replicationGroupRegion The Amazon region of the Global datastore member.
   */
  public fun replicationGroupRegion(replicationGroupRegion: String) {
    cdkBuilder.replicationGroupRegion(replicationGroupRegion)
  }

  /**
   * @param role Indicates the role of the replication group, `PRIMARY` or `SECONDARY` .
   */
  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun build(): CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty =
      cdkBuilder.build()
}
