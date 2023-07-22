@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.batch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobQueue

@CdkDslMarker
public class CfnJobQueueComputeEnvironmentOrderPropertyDsl {
  private val cdkBuilder: CfnJobQueue.ComputeEnvironmentOrderProperty.Builder =
      CfnJobQueue.ComputeEnvironmentOrderProperty.builder()

  /**
   * @param computeEnvironment The Amazon Resource Name (ARN) of the compute environment. 
   */
  public fun computeEnvironment(computeEnvironment: String) {
    cdkBuilder.computeEnvironment(computeEnvironment)
  }

  /**
   * @param order The order of the compute environment. 
   * Compute environments are tried in ascending order. For example, if two compute environments are
   * associated with a job queue, the compute environment with a lower `order` integer value is tried
   * for job placement first.
   */
  public fun order(order: Number) {
    cdkBuilder.order(order)
  }

  public fun build(): CfnJobQueue.ComputeEnvironmentOrderProperty = cdkBuilder.build()
}
