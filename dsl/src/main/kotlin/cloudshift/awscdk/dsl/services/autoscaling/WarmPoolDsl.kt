@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.autoscaling.IAutoScalingGroup
import software.amazon.awscdk.services.autoscaling.PoolState
import software.amazon.awscdk.services.autoscaling.WarmPool
import software.constructs.Construct

/**
 * Define a warm pool.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.autoscaling.*;
 * AutoScalingGroup autoScalingGroup;
 * WarmPool warmPool = WarmPool.Builder.create(this, "MyWarmPool")
 * .autoScalingGroup(autoScalingGroup)
 * // the properties below are optional
 * .maxGroupPreparedCapacity(123)
 * .minSize(123)
 * .poolState(PoolState.HIBERNATED)
 * .reuseOnScaleIn(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class WarmPoolDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: WarmPool.Builder = WarmPool.Builder.create(scope, id)

  /**
   * The Auto Scaling group to add the warm pool to.
   *
   * @param autoScalingGroup The Auto Scaling group to add the warm pool to. 
   */
  public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    cdkBuilder.autoScalingGroup(autoScalingGroup)
  }

  /**
   * The maximum number of instances that are allowed to be in the warm pool or in any state except
   * Terminated for the Auto Scaling group.
   *
   * If the value is not specified, Amazon EC2 Auto Scaling launches and maintains
   * the difference between the group's maximum capacity and its desired capacity.
   *
   * Default: - max size of the Auto Scaling group
   *
   * @param maxGroupPreparedCapacity The maximum number of instances that are allowed to be in the
   * warm pool or in any state except Terminated for the Auto Scaling group. 
   */
  public fun maxGroupPreparedCapacity(maxGroupPreparedCapacity: Number) {
    cdkBuilder.maxGroupPreparedCapacity(maxGroupPreparedCapacity)
  }

  /**
   * The minimum number of instances to maintain in the warm pool.
   *
   * Default: 0
   *
   * @param minSize The minimum number of instances to maintain in the warm pool. 
   */
  public fun minSize(minSize: Number) {
    cdkBuilder.minSize(minSize)
  }

  /**
   * The instance state to transition to after the lifecycle actions are complete.
   *
   * Default: PoolState.STOPPED
   *
   * @param poolState The instance state to transition to after the lifecycle actions are complete. 
   */
  public fun poolState(poolState: PoolState) {
    cdkBuilder.poolState(poolState)
  }

  /**
   * Indicates whether instances in the Auto Scaling group can be returned to the warm pool on scale
   * in.
   *
   * If the value is not specified, instances in the Auto Scaling group will be terminated
   * when the group scales in.
   *
   * Default: false
   *
   * @param reuseOnScaleIn Indicates whether instances in the Auto Scaling group can be returned to
   * the warm pool on scale in. 
   */
  public fun reuseOnScaleIn(reuseOnScaleIn: Boolean) {
    cdkBuilder.reuseOnScaleIn(reuseOnScaleIn)
  }

  public fun build(): WarmPool = cdkBuilder.build()
}
