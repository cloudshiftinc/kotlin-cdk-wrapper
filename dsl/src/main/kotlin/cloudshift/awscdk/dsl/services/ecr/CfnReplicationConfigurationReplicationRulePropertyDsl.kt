@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecr.CfnReplicationConfiguration

@CdkDslMarker
public class CfnReplicationConfigurationReplicationRulePropertyDsl {
  private val cdkBuilder: CfnReplicationConfiguration.ReplicationRuleProperty.Builder =
      CfnReplicationConfiguration.ReplicationRuleProperty.builder()

  private val _destinations: MutableList<Any> = mutableListOf()

  private val _repositoryFilters: MutableList<Any> = mutableListOf()

  public fun destinations(vararg destinations: Any) {
    _destinations.addAll(listOf(*destinations))
  }

  public fun destinations(destinations: Collection<Any>) {
    _destinations.addAll(destinations)
  }

  public fun destinations(destinations: IResolvable) {
    cdkBuilder.destinations(destinations)
  }

  public fun repositoryFilters(vararg repositoryFilters: Any) {
    _repositoryFilters.addAll(listOf(*repositoryFilters))
  }

  public fun repositoryFilters(repositoryFilters: Collection<Any>) {
    _repositoryFilters.addAll(repositoryFilters)
  }

  public fun repositoryFilters(repositoryFilters: IResolvable) {
    cdkBuilder.repositoryFilters(repositoryFilters)
  }

  public fun build(): CfnReplicationConfiguration.ReplicationRuleProperty {
    if(_destinations.isNotEmpty()) cdkBuilder.destinations(_destinations)
    if(_repositoryFilters.isNotEmpty()) cdkBuilder.repositoryFilters(_repositoryFilters)
    return cdkBuilder.build()
  }
}
