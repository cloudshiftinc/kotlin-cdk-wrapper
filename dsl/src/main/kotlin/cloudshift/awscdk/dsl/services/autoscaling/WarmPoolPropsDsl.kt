@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PoolState
import software.amazon.awscdk.services.autoscaling.WarmPoolProps

@CdkDslMarker
public class WarmPoolPropsDsl {
  private val cdkBuilder: WarmPoolProps.Builder = WarmPoolProps.builder()

  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
    cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun poolState(poolState: PoolState) {
    cdkBuilder.poolState(poolState)
  }

  public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
    cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
  }

  public fun build(): WarmPoolProps = cdkBuilder.build()
}
