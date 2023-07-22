@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

@CdkDslMarker
public class CfnGlobalReplicationGroupReshardingConfigurationPropertyDsl {
  private val cdkBuilder: CfnGlobalReplicationGroup.ReshardingConfigurationProperty.Builder =
      CfnGlobalReplicationGroup.ReshardingConfigurationProperty.builder()

  private val _preferredAvailabilityZones: MutableList<String> = mutableListOf()

  /**
   * @param nodeGroupId Either the ElastiCache for Redis supplied 4-digit id or a user supplied id
   * for the node group these configuration values apply to.
   */
  public fun nodeGroupId(nodeGroupId: String) {
    cdkBuilder.nodeGroupId(nodeGroupId)
  }

  /**
   * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in this
   * cluster.
   */
  public fun preferredAvailabilityZones(vararg preferredAvailabilityZones: String) {
    _preferredAvailabilityZones.addAll(listOf(*preferredAvailabilityZones))
  }

  /**
   * @param preferredAvailabilityZones A list of preferred availability zones for the nodes in this
   * cluster.
   */
  public fun preferredAvailabilityZones(preferredAvailabilityZones: Collection<String>) {
    _preferredAvailabilityZones.addAll(preferredAvailabilityZones)
  }

  public fun build(): CfnGlobalReplicationGroup.ReshardingConfigurationProperty {
    if(_preferredAvailabilityZones.isNotEmpty())
        cdkBuilder.preferredAvailabilityZones(_preferredAvailabilityZones)
    return cdkBuilder.build()
  }
}
