@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnInferenceExperiment

@CdkDslMarker
public class CfnInferenceExperimentInferenceExperimentSchedulePropertyDsl {
  private val cdkBuilder: CfnInferenceExperiment.InferenceExperimentScheduleProperty.Builder =
      CfnInferenceExperiment.InferenceExperimentScheduleProperty.builder()

  public fun endTime(endTime: String) {
    cdkBuilder.endTime(endTime)
  }

  public fun startTime(startTime: String) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): CfnInferenceExperiment.InferenceExperimentScheduleProperty =
      cdkBuilder.build()
}
