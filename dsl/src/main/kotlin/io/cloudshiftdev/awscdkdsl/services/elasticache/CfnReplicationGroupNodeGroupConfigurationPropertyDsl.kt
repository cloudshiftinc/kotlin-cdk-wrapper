@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.elasticache

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticache.CfnReplicationGroup

/**
 * `NodeGroupConfiguration` is a property of the `AWS::ElastiCache::ReplicationGroup` resource that
 * configures an Amazon ElastiCache (ElastiCache) Redis cluster node group.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * NodeGroupConfigurationProperty nodeGroupConfigurationProperty =
 * NodeGroupConfigurationProperty.builder()
 * .nodeGroupId("nodeGroupId")
 * .primaryAvailabilityZone("primaryAvailabilityZone")
 * .replicaAvailabilityZones(List.of("replicaAvailabilityZones"))
 * .replicaCount(123)
 * .slots("slots")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-replicationgroup-nodegroupconfiguration.html)
 */
@CdkDslMarker
public class CfnReplicationGroupNodeGroupConfigurationPropertyDsl {
    private val cdkBuilder: CfnReplicationGroup.NodeGroupConfigurationProperty.Builder =
        CfnReplicationGroup.NodeGroupConfigurationProperty.builder()

    private val _replicaAvailabilityZones: MutableList<String> = mutableListOf()

    /**
     * @param nodeGroupId Either the ElastiCache for Redis supplied 4-digit id or a user supplied id
     *   for the node group these configuration values apply to.
     */
    public fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
    }

    /**
     * @param primaryAvailabilityZone The Availability Zone where the primary node of this node
     *   group (shard) is launched.
     */
    public fun primaryAvailabilityZone(primaryAvailabilityZone: String) {
        cdkBuilder.primaryAvailabilityZone(primaryAvailabilityZone)
    }

    /**
     * @param replicaAvailabilityZones A list of Availability Zones to be used for the read
     *   replicas. The number of Availability Zones in this list must match the value of
     *   `ReplicaCount` or `ReplicasPerNodeGroup` if not specified.
     */
    public fun replicaAvailabilityZones(vararg replicaAvailabilityZones: String) {
        _replicaAvailabilityZones.addAll(listOf(*replicaAvailabilityZones))
    }

    /**
     * @param replicaAvailabilityZones A list of Availability Zones to be used for the read
     *   replicas. The number of Availability Zones in this list must match the value of
     *   `ReplicaCount` or `ReplicasPerNodeGroup` if not specified.
     */
    public fun replicaAvailabilityZones(replicaAvailabilityZones: Collection<String>) {
        _replicaAvailabilityZones.addAll(replicaAvailabilityZones)
    }

    /** @param replicaCount The number of read replica nodes in this node group (shard). */
    public fun replicaCount(replicaCount: Number) {
        cdkBuilder.replicaCount(replicaCount)
    }

    /**
     * @param slots A string of comma-separated values where the first set of values are the slot
     *   numbers (zero based), and the second set of values are the keyspaces for each slot. The
     *   following example specifies three slots (numbered 0, 1, and 2):
     *   `0,1,2,0-4999,5000-9999,10000-16,383` .
     *
     * If you don't specify a value, ElastiCache allocates keys equally among each slot.
     *
     * When you use an `UseOnlineResharding` update policy to update the number of node groups
     * without interruption, ElastiCache evenly distributes the keyspaces between the specified
     * number of slots. This cannot be updated later. Therefore, after updating the number of node
     * groups in this way, you should remove the value specified for the `Slots` property of each
     * `NodeGroupConfiguration` from the stack template, as it no longer reflects the actual values
     * in each node group. For more information, see
     * [UseOnlineResharding Policy](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-updatepolicy.html#cfn-attributes-updatepolicy-useonlineresharding)
     * .
     */
    public fun slots(slots: String) {
        cdkBuilder.slots(slots)
    }

    public fun build(): CfnReplicationGroup.NodeGroupConfigurationProperty {
        if (_replicaAvailabilityZones.isNotEmpty())
            cdkBuilder.replicaAvailabilityZones(_replicaAvailabilityZones)
        return cdkBuilder.build()
    }
}
