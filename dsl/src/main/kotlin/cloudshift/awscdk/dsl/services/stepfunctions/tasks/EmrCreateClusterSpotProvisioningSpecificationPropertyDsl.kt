@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.EmrCreateCluster

@CdkDslMarker
public class EmrCreateClusterSpotProvisioningSpecificationPropertyDsl {
  private val cdkBuilder: EmrCreateCluster.SpotProvisioningSpecificationProperty.Builder =
      EmrCreateCluster.SpotProvisioningSpecificationProperty.builder()

  /**
   * @param allocationStrategy Specifies the strategy to use in launching Spot Instance fleets.
   */
  public fun allocationStrategy(allocationStrategy: EmrCreateCluster.SpotAllocationStrategy) {
    cdkBuilder.allocationStrategy(allocationStrategy)
  }

  /**
   * @param blockDurationMinutes The defined duration for Spot instances (also known as Spot blocks)
   * in minutes.
   */
  public fun blockDurationMinutes(blockDurationMinutes: Number) {
    cdkBuilder.blockDurationMinutes(blockDurationMinutes)
  }

  /**
   * @param timeoutAction The action to take when TargetSpotCapacity has not been fulfilled when the
   * TimeoutDurationMinutes has expired. 
   */
  public fun timeoutAction(timeoutAction: EmrCreateCluster.SpotTimeoutAction) {
    cdkBuilder.timeoutAction(timeoutAction)
  }

  /**
   * @param timeoutDurationMinutes The spot provisioning timeout period in minutes. 
   */
  public fun timeoutDurationMinutes(timeoutDurationMinutes: Number) {
    cdkBuilder.timeoutDurationMinutes(timeoutDurationMinutes)
  }

  public fun build(): EmrCreateCluster.SpotProvisioningSpecificationProperty = cdkBuilder.build()
}
