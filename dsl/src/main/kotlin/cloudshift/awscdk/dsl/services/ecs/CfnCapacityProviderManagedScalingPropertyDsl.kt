@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnCapacityProvider

@CdkDslMarker
public class CfnCapacityProviderManagedScalingPropertyDsl {
  private val cdkBuilder: CfnCapacityProvider.ManagedScalingProperty.Builder =
      CfnCapacityProvider.ManagedScalingProperty.builder()

  public fun instanceWarmupPeriod(instanceWarmupPeriod: Number) {
    cdkBuilder.instanceWarmupPeriod(instanceWarmupPeriod)
  }

  public fun maximumScalingStepSize(maximumScalingStepSize: Number) {
    cdkBuilder.maximumScalingStepSize(maximumScalingStepSize)
  }

  public fun minimumScalingStepSize(minimumScalingStepSize: Number) {
    cdkBuilder.minimumScalingStepSize(minimumScalingStepSize)
  }

  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  public fun targetCapacity(targetCapacity: Number) {
    cdkBuilder.targetCapacity(targetCapacity)
  }

  public fun build(): CfnCapacityProvider.ManagedScalingProperty = cdkBuilder.build()
}
