@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
import software.amazon.awscdk.services.stepfunctions.tasks.DockerImage
import software.amazon.awscdk.services.stepfunctions.tasks.InputMode
import software.amazon.awscdk.services.stepfunctions.tasks.MetricDefinition

@CdkDslMarker
public class AlgorithmSpecificationDsl {
  private val cdkBuilder: AlgorithmSpecification.Builder = AlgorithmSpecification.builder()

  private val _metricDefinitions: MutableList<MetricDefinition> = mutableListOf()

  /**
   * @param algorithmName Name of the algorithm resource to use for the training job.
   * This must be an algorithm resource that you created or subscribe to on AWS Marketplace.
   * If you specify a value for this parameter, you can't specify a value for TrainingImage.
   */
  public fun algorithmName(algorithmName: String) {
    cdkBuilder.algorithmName(algorithmName)
  }

  /**
   * @param metricDefinitions List of metric definition objects.
   * Each object specifies the metric name and regular expressions used to parse algorithm logs.
   */
  public fun metricDefinitions(metricDefinitions: MetricDefinitionDsl.() -> Unit) {
    _metricDefinitions.add(MetricDefinitionDsl().apply(metricDefinitions).build())
  }

  /**
   * @param metricDefinitions List of metric definition objects.
   * Each object specifies the metric name and regular expressions used to parse algorithm logs.
   */
  public fun metricDefinitions(metricDefinitions: Collection<MetricDefinition>) {
    _metricDefinitions.addAll(metricDefinitions)
  }

  /**
   * @param trainingImage Registry path of the Docker image that contains the training algorithm.
   */
  public fun trainingImage(trainingImage: DockerImage) {
    cdkBuilder.trainingImage(trainingImage)
  }

  /**
   * @param trainingInputMode Input mode that the algorithm supports.
   */
  public fun trainingInputMode(trainingInputMode: InputMode) {
    cdkBuilder.trainingInputMode(trainingInputMode)
  }

  public fun build(): AlgorithmSpecification {
    if(_metricDefinitions.isNotEmpty()) cdkBuilder.metricDefinitions(_metricDefinitions)
    return cdkBuilder.build()
  }
}
