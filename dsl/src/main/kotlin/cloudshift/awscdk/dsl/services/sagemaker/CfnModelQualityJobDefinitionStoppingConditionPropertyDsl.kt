@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sagemaker.CfnModelQualityJobDefinition

@CdkDslMarker
public class CfnModelQualityJobDefinitionStoppingConditionPropertyDsl {
  private val cdkBuilder: CfnModelQualityJobDefinition.StoppingConditionProperty.Builder =
      CfnModelQualityJobDefinition.StoppingConditionProperty.builder()

  /**
   * @param maxRuntimeInSeconds The maximum length of time, in seconds, that a training or
   * compilation job can run before it is stopped. 
   * For compilation jobs, if the job does not complete during this time, a `TimeOut` error is
   * generated. We recommend starting with 900 seconds and increasing as necessary based on your model.
   *
   * For all other jobs, if the job does not complete during this time, SageMaker ends the job. When
   * `RetryStrategy` is specified in the job request, `MaxRuntimeInSeconds` specifies the maximum time
   * for all of the attempts in total, not each individual attempt. The default value is 1 day. The
   * maximum value is 28 days.
   *
   * The maximum time that a `TrainingJob` can run in total, including any time spent publishing
   * metrics or archiving and uploading models after it has been stopped, is 30 days.
   */
  public fun maxRuntimeInSeconds(maxRuntimeInSeconds: Number) {
    cdkBuilder.maxRuntimeInSeconds(maxRuntimeInSeconds)
  }

  public fun build(): CfnModelQualityJobDefinition.StoppingConditionProperty = cdkBuilder.build()
}
