@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The training details of the model.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TrainingDetailsProperty trainingDetailsProperty = TrainingDetailsProperty.builder()
 * .objectiveFunction(ObjectiveFunctionProperty.builder()
 * .function(FunctionProperty.builder()
 * .condition("condition")
 * .facet("facet")
 * .function("function")
 * .build())
 * .notes("notes")
 * .build())
 * .trainingJobDetails(TrainingJobDetailsProperty.builder()
 * .hyperParameters(List.of(TrainingHyperParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .trainingArn("trainingArn")
 * .trainingDatasets(List.of("trainingDatasets"))
 * .trainingEnvironment(TrainingEnvironmentProperty.builder()
 * .containerImage(List.of("containerImage"))
 * .build())
 * .trainingMetrics(List.of(TrainingMetricProperty.builder()
 * .name("name")
 * .value(123)
 * // the properties below are optional
 * .notes("notes")
 * .build()))
 * .userProvidedHyperParameters(List.of(TrainingHyperParameterProperty.builder()
 * .name("name")
 * .value("value")
 * .build()))
 * .userProvidedTrainingMetrics(List.of(TrainingMetricProperty.builder()
 * .name("name")
 * .value(123)
 * // the properties below are optional
 * .notes("notes")
 * .build()))
 * .build())
 * .trainingObservations("trainingObservations")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingdetails.html)
 */
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
