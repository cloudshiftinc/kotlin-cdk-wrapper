@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Constructs `IS3Location` objects.
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
public abstract class S3Location internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
) : CdkObject(cdkObject) {
  /**
   * Called when the S3Location is bound to a StepFunctions task.
   *
   * @param task 
   * @param opts 
   */
  public open fun bind(task: ISageMakerTask, opts: S3LocationBindOptions): S3LocationConfig =
      unwrap(this).bind(task.let(ISageMakerTask::unwrap),
      opts.let(S3LocationBindOptions::unwrap)).let(S3LocationConfig::wrap)

  /**
   * Called when the S3Location is bound to a StepFunctions task.
   *
   * @param task 
   * @param opts 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8a32700fc05c9dd82704167e3dacafa7963c512c54b5f113cba18e137d46e22f")
  public open fun bind(task: ISageMakerTask, opts: S3LocationBindOptions.Builder.() -> Unit):
      S3LocationConfig = bind(task, S3LocationBindOptions(opts))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location,
  ) : S3Location(cdkObject)

  public companion object {
    public fun fromBucket(bucket: IBucket, keyPrefix: String): S3Location =
        software.amazon.awscdk.services.stepfunctions.tasks.S3Location.fromBucket(bucket.let(IBucket::unwrap),
        keyPrefix).let(S3Location::wrap)

    public fun fromJsonExpression(expression: String): S3Location =
        software.amazon.awscdk.services.stepfunctions.tasks.S3Location.fromJsonExpression(expression).let(S3Location::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.S3Location):
        S3Location = CdkObjectWrappers.wrap(cdkObject) as? S3Location ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: S3Location):
        software.amazon.awscdk.services.stepfunctions.tasks.S3Location = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.S3Location
  }
}
