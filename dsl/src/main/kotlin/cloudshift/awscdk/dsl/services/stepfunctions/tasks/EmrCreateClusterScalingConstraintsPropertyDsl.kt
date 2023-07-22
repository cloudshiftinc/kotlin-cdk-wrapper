@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterScalingConstraintsPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.ScalingConstraintsProperty.Builder =
      EmrCreateCluster.ScalingConstraintsProperty.builder()

  /**
   * @param maxCapacity The upper boundary of EC2 instances in an instance group beyond which
   * scaling activities are not allowed to grow. 
   * Scale-out
   * activities will not add instances beyond this boundary.
   */
  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  /**
   * @param minCapacity The lower boundary of EC2 instances in an instance group below which scaling
   * activities are not allowed to shrink. 
   * Scale-in
   * activities will not terminate instances below this boundary.
   */
  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): EmrCreateCluster.ScalingConstraintsProperty = cdkBuilder.build()
}
