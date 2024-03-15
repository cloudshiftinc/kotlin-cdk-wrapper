@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Specifies a limit to how long a model training job can run.
 *
 * When the job reaches the time limit, Amazon SageMaker ends the training job.
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
public interface StoppingCondition {
  /**
   * The maximum length of time, in seconds, that the training or compilation job can run.
   *
   * Default: - 1 hour
   */
  public fun maxRuntime(): Duration? = unwrap(this).getMaxRuntime()?.let(Duration::wrap)

  /**
   * A builder for [StoppingCondition]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param maxRuntime The maximum length of time, in seconds, that the training or compilation
     * job can run.
     */
    public fun maxRuntime(maxRuntime: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition.builder()

    /**
     * @param maxRuntime The maximum length of time, in seconds, that the training or compilation
     * job can run.
     */
    override fun maxRuntime(maxRuntime: Duration) {
      cdkBuilder.maxRuntime(maxRuntime.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition,
  ) : CdkObject(cdkObject), StoppingCondition {
    /**
     * The maximum length of time, in seconds, that the training or compilation job can run.
     *
     * Default: - 1 hour
     */
    override fun maxRuntime(): Duration? = unwrap(this).getMaxRuntime()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StoppingCondition {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition):
        StoppingCondition = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StoppingCondition):
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.StoppingCondition
  }
}
