@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleMonitoringInputPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.MonitoringInputProperty.Builder =
      CfnMonitoringSchedule.MonitoringInputProperty.builder()

  public fun batchTransformInput(batchTransformInput: IResolvable) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public
      fun batchTransformInput(batchTransformInput: CfnMonitoringSchedule.BatchTransformInputProperty) {
    cdkBuilder.batchTransformInput(batchTransformInput)
  }

  public fun endpointInput(endpointInput: IResolvable) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun endpointInput(endpointInput: CfnMonitoringSchedule.EndpointInputProperty) {
    cdkBuilder.endpointInput(endpointInput)
  }

  public fun build(): CfnMonitoringSchedule.MonitoringInputProperty = cdkBuilder.build()
}
