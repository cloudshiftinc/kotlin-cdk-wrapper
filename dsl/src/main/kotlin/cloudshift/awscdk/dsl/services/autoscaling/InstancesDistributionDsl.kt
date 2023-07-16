@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.InstancesDistribution
import software.amazon.awscdk.services.autoscaling.OnDemandAllocationStrategy
import software.amazon.awscdk.services.autoscaling.SpotAllocationStrategy

@CdkDslMarker
public class InstancesDistributionDsl {
  private val cdkBuilder: InstancesDistribution.Builder = InstancesDistribution.builder()

  public fun onDemandAllocationStrategy(onDemandAllocationStrategy: OnDemandAllocationStrategy) {
    cdkBuilder.onDemandAllocationStrategy(onDemandAllocationStrategy)
  }

  public fun onDemandBaseCapacity(onDemandBaseCapacity: Number) {
    cdkBuilder.onDemandBaseCapacity(onDemandBaseCapacity)
  }

  public fun onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity: Number) {
    cdkBuilder.onDemandPercentageAboveBaseCapacity(onDemandPercentageAboveBaseCapacity)
  }

  public fun spotAllocationStrategy(spotAllocationStrategy: SpotAllocationStrategy) {
    cdkBuilder.spotAllocationStrategy(spotAllocationStrategy)
  }

  public fun spotInstancePools(spotInstancePools: Number) {
    cdkBuilder.spotInstancePools(spotInstancePools)
  }

  public fun spotMaxPrice(spotMaxPrice: String) {
    cdkBuilder.spotMaxPrice(spotMaxPrice)
  }

  public fun build(): InstancesDistribution = cdkBuilder.build()
}
