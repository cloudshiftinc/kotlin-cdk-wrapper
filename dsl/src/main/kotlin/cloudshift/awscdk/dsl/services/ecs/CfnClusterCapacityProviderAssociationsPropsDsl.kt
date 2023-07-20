@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnClusterCapacityProviderAssociationsProps

@CdkDslMarker
public class CfnClusterCapacityProviderAssociationsPropsDsl {
  private val cdkBuilder: CfnClusterCapacityProviderAssociationsProps.Builder =
      CfnClusterCapacityProviderAssociationsProps.builder()

  private val _capacityProviders: MutableList<String> = mutableListOf()

  private val _defaultCapacityProviderStrategy: MutableList<Any> = mutableListOf()

  public fun capacityProviders(vararg capacityProviders: String) {
    _capacityProviders.addAll(listOf(*capacityProviders))
  }

  public fun capacityProviders(capacityProviders: Collection<String>) {
    _capacityProviders.addAll(capacityProviders)
  }

  public fun cluster(cluster: String) {
    cdkBuilder.cluster(cluster)
  }

  public fun defaultCapacityProviderStrategy(vararg defaultCapacityProviderStrategy: Any) {
    _defaultCapacityProviderStrategy.addAll(listOf(*defaultCapacityProviderStrategy))
  }

  public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: Collection<Any>) {
    _defaultCapacityProviderStrategy.addAll(defaultCapacityProviderStrategy)
  }

  public fun defaultCapacityProviderStrategy(defaultCapacityProviderStrategy: IResolvable) {
    cdkBuilder.defaultCapacityProviderStrategy(defaultCapacityProviderStrategy)
  }

  public fun build(): CfnClusterCapacityProviderAssociationsProps {
    if(_capacityProviders.isNotEmpty()) cdkBuilder.capacityProviders(_capacityProviders)
    if(_defaultCapacityProviderStrategy.isNotEmpty())
        cdkBuilder.defaultCapacityProviderStrategy(_defaultCapacityProviderStrategy)
    return cdkBuilder.build()
  }
}
