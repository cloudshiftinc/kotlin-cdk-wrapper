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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

/**
 * A list of `PreferredAvailabilityZones` objects that specifies the configuration of a node group
 * in the resharded cluster.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * ReshardingConfigurationProperty reshardingConfigurationProperty =
 * ReshardingConfigurationProperty.builder()
 * .nodeGroupId("nodeGroupId")
 * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-reshardingconfiguration.html)
 */
@CdkDslMarker
public class CfnGlobalReplicationGroupReshardingConfigurationPropertyDsl {
    private val cdkBuilder: CfnGlobalReplicationGroup.ReshardingConfigurationProperty.Builder =
        CfnGlobalReplicationGroup.ReshardingConfigurationProperty.builder()

    private val _preferredAvailabilityZones: MutableList<String> = mutableListOf()

    /**
     * @param nodeGroupId Either the ElastiCache for Redis supplied 4-digit id or a user supplied id
     *   for the node group these configuration values apply to.
     */
    public fun nodeGroupId(nodeGroupId: String) {
        cdkBuilder.nodeGroupId(nodeGroupId)
    }

    /**
     * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in
     *   this cluster.
     */
    public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String) {
        _preferredAvailabilityZones.addAll(listOf(*preferredAvailabilityZones))
    }

    /**
     * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in
     *   this cluster.
     */
    public fun preferredAvailabilityZones(preferredAvailabilityZones: Collection<String>) {
        _preferredAvailabilityZones.addAll(preferredAvailabilityZones)
    }

    public fun build(): CfnGlobalReplicationGroup.ReshardingConfigurationProperty {
        if (_preferredAvailabilityZones.isNotEmpty())
            cdkBuilder.preferredAvailabilityZones(_preferredAvailabilityZones)
        return cdkBuilder.build()
    }
}
