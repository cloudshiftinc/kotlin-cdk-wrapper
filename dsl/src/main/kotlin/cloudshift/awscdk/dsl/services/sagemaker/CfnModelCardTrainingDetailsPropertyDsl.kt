@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

@CdkDslMarker
public class CfnModelCardTrainingDetailsPropertyDsl {
  private val cdkBuilder: CfnModelCard.TrainingDetailsProperty.Builder =
      CfnModelCard.TrainingDetailsProperty.builder()

  /**
   * @param objectiveFunction The function that is optimized during model training.
   */
  public fun objectiveFunction(objectiveFunction: IResolvable) {
    cdkBuilder.objectiveFunction(objectiveFunction)
  }

  /**
   * @param objectiveFunction The function that is optimized during model training.
   */
  public fun objectiveFunction(objectiveFunction: CfnModelCard.ObjectiveFunctionProperty) {
    cdkBuilder.objectiveFunction(objectiveFunction)
  }

  /**
   * @param trainingJobDetails Details about any associated training jobs.
   */
  public fun trainingJobDetails(trainingJobDetails: IResolvable) {
    cdkBuilder.trainingJobDetails(trainingJobDetails)
  }

  /**
   * @param trainingJobDetails Details about any associated training jobs.
   */
  public fun trainingJobDetails(trainingJobDetails: CfnModelCard.TrainingJobDetailsProperty) {
    cdkBuilder.trainingJobDetails(trainingJobDetails)
  }

  /**
   * @param trainingObservations Any observations about training.
   */
  public fun trainingObservations(trainingObservations: String) {
    cdkBuilder.trainingObservations(trainingObservations)
  }

  public fun build(): CfnModelCard.TrainingDetailsProperty = cdkBuilder.build()
}
