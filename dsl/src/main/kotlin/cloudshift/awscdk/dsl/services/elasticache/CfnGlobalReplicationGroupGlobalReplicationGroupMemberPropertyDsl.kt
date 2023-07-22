@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

/**
 * A member of a Global datastore.
 *
 * It contains the Replication Group Id, the Amazon region and the role of the replication group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * GlobalReplicationGroupMemberProperty globalReplicationGroupMemberProperty =
 * GlobalReplicationGroupMemberProperty.builder()
 * .replicationGroupId("replicationGroupId")
 * .replicationGroupRegion("replicationGroupRegion")
 * .role("role")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-globalreplicationgroupmember.html)
 */
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
