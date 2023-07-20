@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup
import kotlin.String

@CdkDslMarker
public class CfnGlobalReplicationGroupGlobalReplicationGroupMemberPropertyDsl {
    private val cdkBuilder: CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.Builder =
        CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty.builder()

    public fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
    }

    public fun replicationGroupRegion(replicationGroupRegion: String) {
        cdkBuilder.replicationGroupRegion(replicationGroupRegion)
    }

    public fun role(role: String) {
        cdkBuilder.role(role)
    }

    public fun build(): CfnGlobalReplicationGroup.GlobalReplicationGroupMemberProperty =
        cdkBuilder.build()
}
