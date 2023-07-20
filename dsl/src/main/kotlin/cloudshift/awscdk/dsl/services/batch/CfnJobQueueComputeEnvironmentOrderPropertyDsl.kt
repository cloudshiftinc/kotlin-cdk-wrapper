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

  public fun computeEnvironment(computeEnvironment: String) {
    cdkBuilder.computeEnvironment(computeEnvironment)
  }

  public fun order(order: Number) {
    cdkBuilder.order(order)
  }

  public fun build(): CfnJobQueue.ComputeEnvironmentOrderProperty = cdkBuilder.build()
}
