@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnMonitoringSchedule

@CdkDslMarker
public class CfnMonitoringScheduleStoppingConditionPropertyDsl {
  private val cdkBuilder: CfnMonitoringSchedule.StoppingConditionProperty.Builder =
      CfnMonitoringSchedule.StoppingConditionProperty.builder()

  public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
    cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
  }

  public fun build(): CfnMonitoringSchedule.StoppingConditionProperty = cdkBuilder.build()
}
