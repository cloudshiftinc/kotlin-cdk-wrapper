@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnWarmPool
import software.amazon.awscdk.services.autoscaling.CfnWarmPoolProps

@CdkDslMarker
public class CfnWarmPoolPropsDsl {
  private val cdkBuilder: CfnWarmPoolProps.Builder = CfnWarmPoolProps.builder()

  public fun autoScalingGroupName(autoScalingGroupName: String) {
    cdkBuilder.autoScalingGroupName(autoScalingGroupName)
  }

  public fun instanceReusePolicy(instanceReusePolicy: IResolvable) {
    cdkBuilder.instanceReusePolicy(instanceReusePolicy)
  }

  public fun instanceReusePolicy(instanceReusePolicy: CfnWarmPool.InstanceReusePolicyProperty) {
    cdkBuilder.instanceReusePolicy(instanceReusePolicy)
  }

  public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
    cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
  }

  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  public fun poolState(poolState: String) {
    cdkBuilder.poolState(poolState)
  }

  public fun build(): CfnWarmPoolProps = cdkBuilder.build()
}
