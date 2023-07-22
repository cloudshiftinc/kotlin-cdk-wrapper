@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelCard

/**
 * The overview of a training job.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * TrainingJobDetailsProperty trainingJobDetailsProperty = TrainingJobDetailsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-modelcard-trainingjobdetails.html)
 */
@CdkDslMarker
public class CfnModelCardTrainingJobDetailsPropertyDsl {
  private val cdkBuilder: CfnModelCard.TrainingJobDetailsProperty.Builder =
      CfnModelCard.TrainingJobDetailsProperty.builder()

  private val _hyperParameters: MutableList<Any> = mutableListOf()

  private val _trainingDatasets: MutableList<String> = mutableListOf()

  private val _trainingMetrics: MutableList<Any> = mutableListOf()

  private val _userProvidedHyperParameters: MutableList<Any> = mutableListOf()

  private val _userProvidedTrainingMetrics: MutableList<Any> = mutableListOf()

  /**
   * @param hyperParameters The hyper parameters used in the training job.
   */
  public fun hyperParameters(vararg hyperParameters: Any) {
    _hyperParameters.addAll(listOf(*hyperParameters))
  }

  /**
   * @param hyperParameters The hyper parameters used in the training job.
   */
  public fun hyperParameters(hyperParameters: Collection<Any>) {
    _hyperParameters.addAll(hyperParameters)
  }

  /**
   * @param hyperParameters The hyper parameters used in the training job.
   */
  public fun hyperParameters(hyperParameters: IResolvable) {
    cdkBuilder.hyperParameters(hyperParameters)
  }

  /**
   * @param trainingArn The SageMaker training job Amazon Resource Name (ARN).
   */
  public fun trainingArn(trainingArn: String) {
    cdkBuilder.trainingArn(trainingArn)
  }

  /**
   * @param trainingDatasets The location of the datasets used to train the model.
   */
  public fun trainingDatasets(vararg trainingDatasets: String) {
    _trainingDatasets.addAll(listOf(*trainingDatasets))
  }

  /**
   * @param trainingDatasets The location of the datasets used to train the model.
   */
  public fun trainingDatasets(trainingDatasets: Collection<String>) {
    _trainingDatasets.addAll(trainingDatasets)
  }

  /**
   * @param trainingEnvironment The SageMaker training job image URI.
   */
  public fun trainingEnvironment(trainingEnvironment: IResolvable) {
    cdkBuilder.trainingEnvironment(trainingEnvironment)
  }

  /**
   * @param trainingEnvironment The SageMaker training job image URI.
   */
  public fun trainingEnvironment(trainingEnvironment: CfnModelCard.TrainingEnvironmentProperty) {
    cdkBuilder.trainingEnvironment(trainingEnvironment)
  }

  /**
   * @param trainingMetrics The SageMaker training job results.
   */
  public fun trainingMetrics(vararg trainingMetrics: Any) {
    _trainingMetrics.addAll(listOf(*trainingMetrics))
  }

  /**
   * @param trainingMetrics The SageMaker training job results.
   */
  public fun trainingMetrics(trainingMetrics: Collection<Any>) {
    _trainingMetrics.addAll(trainingMetrics)
  }

  /**
   * @param trainingMetrics The SageMaker training job results.
   */
  public fun trainingMetrics(trainingMetrics: IResolvable) {
    cdkBuilder.trainingMetrics(trainingMetrics)
  }

  /**
   * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
   * training the model.
   */
  public fun userProvidedHyperParameters(vararg userProvidedHyperParameters: Any) {
    _userProvidedHyperParameters.addAll(listOf(*userProvidedHyperParameters))
  }

  /**
   * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
   * training the model.
   */
  public fun userProvidedHyperParameters(userProvidedHyperParameters: Collection<Any>) {
    _userProvidedHyperParameters.addAll(userProvidedHyperParameters)
  }

  /**
   * @param userProvidedHyperParameters Additional hyper parameters that you've specified when
   * training the model.
   */
  public fun userProvidedHyperParameters(userProvidedHyperParameters: IResolvable) {
    cdkBuilder.userProvidedHyperParameters(userProvidedHyperParameters)
  }

  /**
   * @param userProvidedTrainingMetrics Custom training job results.
   */
  public fun userProvidedTrainingMetrics(vararg userProvidedTrainingMetrics: Any) {
    _userProvidedTrainingMetrics.addAll(listOf(*userProvidedTrainingMetrics))
  }

  /**
   * @param userProvidedTrainingMetrics Custom training job results.
   */
  public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: Collection<Any>) {
    _userProvidedTrainingMetrics.addAll(userProvidedTrainingMetrics)
  }

  /**
   * @param userProvidedTrainingMetrics Custom training job results.
   */
  public fun userProvidedTrainingMetrics(userProvidedTrainingMetrics: IResolvable) {
    cdkBuilder.userProvidedTrainingMetrics(userProvidedTrainingMetrics)
  }

  public fun build(): CfnModelCard.TrainingJobDetailsProperty {
    if(_hyperParameters.isNotEmpty()) cdkBuilder.hyperParameters(_hyperParameters)
    if(_trainingDatasets.isNotEmpty()) cdkBuilder.trainingDatasets(_trainingDatasets)
    if(_trainingMetrics.isNotEmpty()) cdkBuilder.trainingMetrics(_trainingMetrics)
    if(_userProvidedHyperParameters.isNotEmpty())
        cdkBuilder.userProvidedHyperParameters(_userProvidedHyperParameters)
    if(_userProvidedTrainingMetrics.isNotEmpty())
        cdkBuilder.userProvidedTrainingMetrics(_userProvidedTrainingMetrics)
    return cdkBuilder.build()
  }
}
