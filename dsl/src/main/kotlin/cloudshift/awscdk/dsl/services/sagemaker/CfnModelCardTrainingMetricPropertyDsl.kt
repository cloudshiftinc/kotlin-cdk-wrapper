@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardTrainingMetricPropertyDsl {
  private val cdkBuilder: CfnModelCard.TrainingMetricProperty.Builder =
      CfnModelCard.TrainingMetricProperty.builder()

  /**
   * @param name The name of the result from the SageMaker training job. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param notes Any additional notes describing the result of the training job.
   */
  public fun notes(notes: String) {
    cdkBuilder.notes(notes)
  }

  /**
   * @param value The value of a result from the SageMaker training job. 
   */
  public fun `value`(`value`: Number) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnModelCard.TrainingMetricProperty = cdkBuilder.build()
}
