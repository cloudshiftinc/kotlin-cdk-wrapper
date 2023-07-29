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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

/**
 * A list of the replication groups.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticache.*;
 * RegionalConfigurationProperty regionalConfigurationProperty =
 * RegionalConfigurationProperty.builder()
 * .replicationGroupId("replicationGroupId")
 * .replicationGroupRegion("replicationGroupRegion")
 * .reshardingConfigurations(List.of(ReshardingConfigurationProperty.builder()
 * .nodeGroupId("nodeGroupId")
 * .preferredAvailabilityZones(List.of("preferredAvailabilityZones"))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-globalreplicationgroup-regionalconfiguration.html)
 */
@CdkDslMarker
public class CfnGlobalReplicationGroupRegionalConfigurationPropertyDsl {
    private val cdkBuilder: CfnGlobalReplicationGroup.RegionalConfigurationProperty.Builder =
        CfnGlobalReplicationGroup.RegionalConfigurationProperty.builder()

    private val _reshardingConfigurations: MutableList<Any> = mutableListOf()

    /** @param replicationGroupId The name of the secondary cluster. */
    public fun replicationGroupId(replicationGroupId: String) {
        cdkBuilder.replicationGroupId(replicationGroupId)
    }

    /** @param replicationGroupRegion The Amazon region where the cluster is stored. */
    public fun replicationGroupRegion(replicationGroupRegion: String) {
        cdkBuilder.replicationGroupRegion(replicationGroupRegion)
    }

    /**
     * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
     *   the configuration of a node group in the resharded cluster.
     */
    public fun reshardingConfigurations(vararg reshardingConfigurations: Any) {
        _reshardingConfigurations.addAll(listOf(*reshardingConfigurations))
    }

    /**
     * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
     *   the configuration of a node group in the resharded cluster.
     */
    public fun reshardingConfigurations(reshardingConfigurations: Collection<Any>) {
        _reshardingConfigurations.addAll(reshardingConfigurations)
    }

    /**
     * @param reshardingConfigurations A list of PreferredAvailabilityZones objects that specifies
     *   the configuration of a node group in the resharded cluster.
     */
    public fun reshardingConfigurations(reshardingConfigurations: IResolvable) {
        cdkBuilder.reshardingConfigurations(reshardingConfigurations)
    }

    public fun build(): CfnGlobalReplicationGroup.RegionalConfigurationProperty {
        if (_reshardingConfigurations.isNotEmpty())
            cdkBuilder.reshardingConfigurations(_reshardingConfigurations)
        return cdkBuilder.build()
    }
}
