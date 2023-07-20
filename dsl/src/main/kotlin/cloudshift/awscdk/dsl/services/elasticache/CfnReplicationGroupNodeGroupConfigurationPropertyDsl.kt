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
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnReplicationGroupNodeGroupConfigurationPropertyDsl {
    private val cdkBuilder: CfnReplicationGroup.NodeGroupConfigurationProperty.Builder =
        CfnReplicationGroup.NodeGroupConfigurationProperty.builder()

    private val _replicaAvailabilityZones: MutableList<String> = mutableListOf()

    public fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
    }

    public fun primaryAvailabilityZone(primaryAvailabilityZone: String) {
        cdkBuilder.primaryAvailabilityZone(primaryAvailabilityZone)
    }

    public fun replicaAvailabilityZones(vararg replicaAvailabilityZones: String) {
        _replicaAvailabilityZones.addAll(listOf(*replicaAvailabilityZones))
    }

    public fun replicaAvailabilityZones(replicaAvailabilityZones: Collection<String>) {
        _replicaAvailabilityZones.addAll(replicaAvailabilityZones)
    }

    public fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
    }

    public fun slots(slots: String) {
        cdkBuilder.slots(slots)
    }

    public fun build(): CfnReplicationGroup.NodeGroupConfigurationProperty {
        if (_replicaAvailabilityZones.isNotEmpty()) {
            cdkBuilder.replicaAvailabilityZones(_replicaAvailabilityZones)
        }
        return cdkBuilder.build()
    }
}
