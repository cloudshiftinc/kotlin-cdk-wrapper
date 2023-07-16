@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticache.CfnGlobalReplicationGroup

@CdkDslMarker
public class CfnGlobalReplicationGroupRegionalConfigurationPropertyDsl {
  private val cdkBuilder: CfnGlobalReplicationGroup.RegionalConfigurationProperty.Builder =
      CfnGlobalReplicationGroup.RegionalConfigurationProperty.builder()

  private val _reshardingConfigurations: MutableList<Any> = mutableListOf()

  public fun replicationGroupId(replicationGroupId: String) {
    cdkBuilder.replicationGroupId(replicationGroupId)
  }

  public fun replicationGroupRegion(replicationGroupRegion: String) {
    cdkBuilder.replicationGroupRegion(replicationGroupRegion)
  }

  public fun reshardingConfigurations(vararg reshardingConfigurations: Any) {
    _reshardingConfigurations.addAll(listOf(*reshardingConfigurations))
  }

  public fun reshardingConfigurations(reshardingConfigurations: Collection<Any>) {
    _reshardingConfigurations.addAll(reshardingConfigurations)
  }

  public fun reshardingConfigurations(reshardingConfigurations: IResolvable) {
    cdkBuilder.reshardingConfigurations(reshardingConfigurations)
  }

  public fun build(): CfnGlobalReplicationGroup.RegionalConfigurationProperty {
    if(_reshardingConfigurations.isNotEmpty())
        cdkBuilder.reshardingConfigurations(_reshardingConfigurations)
    return cdkBuilder.build()
  }
}
