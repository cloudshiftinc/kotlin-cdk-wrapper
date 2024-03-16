@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specify the training algorithm and algorithm-specific metadata.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTrainingJob.Builder.create(this, "TrainSagemaker")
 * .trainingJobName(JsonPath.stringAt("$.JobName"))
 * .algorithmSpecification(AlgorithmSpecification.builder()
 * .algorithmName("BlazingText")
 * .trainingInputMode(InputMode.FILE)
 * .build())
 * .inputDataConfig(List.of(Channel.builder()
 * .channelName("train")
 * .dataSource(DataSource.builder()
 * .s3DataSource(S3DataSource.builder()
 * .s3DataType(S3DataType.S3_PREFIX)
 * .s3Location(S3Location.fromJsonExpression("$.S3Bucket"))
 * .build())
 * .build())
 * .build()))
 * .outputDataConfig(OutputDataConfig.builder()
 * .s3OutputLocation(S3Location.fromBucket(Bucket.fromBucketName(this, "Bucket", "mybucket"),
 * "myoutputpath"))
 * .build())
 * .resourceConfig(ResourceConfig.builder()
 * .instanceCount(1)
 * .instanceType(new InstanceType(JsonPath.stringAt("$.InstanceType")))
 * .volumeSize(Size.gibibytes(50))
 * .build()) // optional: default is 1 instance of EC2 `M4.XLarge` with `10GB` volume
 * .stoppingCondition(StoppingCondition.builder()
 * .maxRuntime(Duration.hours(2))
 * .build())
 * .build();
 * ```
 */
public interface AlgorithmSpecification {
  /**
   * Name of the algorithm resource to use for the training job.
   *
   * This must be an algorithm resource that you created or subscribe to on AWS Marketplace.
   * If you specify a value for this parameter, you can't specify a value for TrainingImage.
   *
   * Default: - No algorithm is specified
   */
  public fun algorithmName(): String? = unwrap(this).getAlgorithmName()

  /**
   * List of metric definition objects.
   *
   * Each object specifies the metric name and regular expressions used to parse algorithm logs.
   *
   * Default: - No metrics
   */
  public fun metricDefinitions(): List<MetricDefinition> =
      unwrap(this).getMetricDefinitions()?.map(MetricDefinition::wrap) ?: emptyList()

  /**
   * Registry path of the Docker image that contains the training algorithm.
   *
   * Default: - No Docker image is specified
   */
  public fun trainingImage(): DockerImage? = unwrap(this).getTrainingImage()?.let(DockerImage::wrap)

  /**
   * Input mode that the algorithm supports.
   *
   * Default: 'File' mode
   */
  public fun trainingInputMode(): InputMode? =
      unwrap(this).getTrainingInputMode()?.let(InputMode::wrap)

  /**
   * A builder for [AlgorithmSpecification]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param algorithmName Name of the algorithm resource to use for the training job.
     * This must be an algorithm resource that you created or subscribe to on AWS Marketplace.
     * If you specify a value for this parameter, you can't specify a value for TrainingImage.
     */
    public fun algorithmName(algorithmName: String)

    /**
     * @param metricDefinitions List of metric definition objects.
     * Each object specifies the metric name and regular expressions used to parse algorithm logs.
     */
    public fun metricDefinitions(metricDefinitions: List<MetricDefinition>)

    /**
     * @param metricDefinitions List of metric definition objects.
     * Each object specifies the metric name and regular expressions used to parse algorithm logs.
     */
    public fun metricDefinitions(vararg metricDefinitions: MetricDefinition)

    /**
     * @param trainingImage Registry path of the Docker image that contains the training algorithm.
     */
    public fun trainingImage(trainingImage: DockerImage)

    /**
     * @param trainingInputMode Input mode that the algorithm supports.
     */
    public fun trainingInputMode(trainingInputMode: InputMode)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification.builder()

    /**
     * @param algorithmName Name of the algorithm resource to use for the training job.
     * This must be an algorithm resource that you created or subscribe to on AWS Marketplace.
     * If you specify a value for this parameter, you can't specify a value for TrainingImage.
     */
    override fun algorithmName(algorithmName: String) {
      cdkBuilder.algorithmName(algorithmName)
    }

    /**
     * @param metricDefinitions List of metric definition objects.
     * Each object specifies the metric name and regular expressions used to parse algorithm logs.
     */
    override fun metricDefinitions(metricDefinitions: List<MetricDefinition>) {
      cdkBuilder.metricDefinitions(metricDefinitions.map(MetricDefinition::unwrap))
    }

    /**
     * @param metricDefinitions List of metric definition objects.
     * Each object specifies the metric name and regular expressions used to parse algorithm logs.
     */
    override fun metricDefinitions(vararg metricDefinitions: MetricDefinition): Unit =
        metricDefinitions(metricDefinitions.toList())

    /**
     * @param trainingImage Registry path of the Docker image that contains the training algorithm.
     */
    override fun trainingImage(trainingImage: DockerImage) {
      cdkBuilder.trainingImage(trainingImage.let(DockerImage::unwrap))
    }

    /**
     * @param trainingInputMode Input mode that the algorithm supports.
     */
    override fun trainingInputMode(trainingInputMode: InputMode) {
      cdkBuilder.trainingInputMode(trainingInputMode.let(InputMode::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification,
  ) : CdkObject(cdkObject), AlgorithmSpecification {
    /**
     * Name of the algorithm resource to use for the training job.
     *
     * This must be an algorithm resource that you created or subscribe to on AWS Marketplace.
     * If you specify a value for this parameter, you can't specify a value for TrainingImage.
     *
     * Default: - No algorithm is specified
     */
    override fun algorithmName(): String? = unwrap(this).getAlgorithmName()

    /**
     * List of metric definition objects.
     *
     * Each object specifies the metric name and regular expressions used to parse algorithm logs.
     *
     * Default: - No metrics
     */
    override fun metricDefinitions(): List<MetricDefinition> =
        unwrap(this).getMetricDefinitions()?.map(MetricDefinition::wrap) ?: emptyList()

    /**
     * Registry path of the Docker image that contains the training algorithm.
     *
     * Default: - No Docker image is specified
     */
    override fun trainingImage(): DockerImage? =
        unwrap(this).getTrainingImage()?.let(DockerImage::wrap)

    /**
     * Input mode that the algorithm supports.
     *
     * Default: 'File' mode
     */
    override fun trainingInputMode(): InputMode? =
        unwrap(this).getTrainingInputMode()?.let(InputMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AlgorithmSpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification):
        AlgorithmSpecification = CdkObjectWrappers.wrap(cdkObject) as AlgorithmSpecification

    internal fun unwrap(wrapped: AlgorithmSpecification):
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.AlgorithmSpecification
  }
}
