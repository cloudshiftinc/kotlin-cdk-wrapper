@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

/**
 * Configures the timeout and maximum number of retries for processing a transform job invocation.
 *
 * Example:
 *
 * ```
 * SageMakerCreateTransformJob.Builder.create(this, "Batch Inference")
 * .transformJobName("MyTransformJob")
 * .modelName("MyModelName")
 * .modelClientOptions(ModelClientOptions.builder()
 * .invocationsMaxRetries(3) // default is 0
 * .invocationsTimeout(Duration.minutes(5))
 * .build())
 * .transformInput(TransformInput.builder()
 * .transformDataSource(TransformDataSource.builder()
 * .s3DataSource(TransformS3DataSource.builder()
 * .s3Uri("s3://inputbucket/train")
 * .s3DataType(S3DataType.S3_PREFIX)
 * .build())
 * .build())
 * .build())
 * .transformOutput(TransformOutput.builder()
 * .s3OutputPath("s3://outputbucket/TransformJobOutputPath")
 * .build())
 * .transformResources(TransformResources.builder()
 * .instanceCount(1)
 * .instanceType(InstanceType.of(InstanceClass.M4, InstanceSize.XLARGE))
 * .build())
 * .build();
 * ```
 */
public interface ModelClientOptions {
  /**
   * The maximum number of retries when invocation requests are failing.
   *
   * Default: 0
   */
  public fun invocationsMaxRetries(): Number? = unwrap(this).getInvocationsMaxRetries()

  /**
   * The timeout duration for an invocation request.
   *
   * Default: Duration.minutes(1)
   */
  public fun invocationsTimeout(): Duration? =
      unwrap(this).getInvocationsTimeout()?.let(Duration::wrap)

  /**
   * A builder for [ModelClientOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param invocationsMaxRetries The maximum number of retries when invocation requests are
     * failing.
     */
    public fun invocationsMaxRetries(invocationsMaxRetries: Number)

    /**
     * @param invocationsTimeout The timeout duration for an invocation request.
     */
    public fun invocationsTimeout(invocationsTimeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions.builder()

    /**
     * @param invocationsMaxRetries The maximum number of retries when invocation requests are
     * failing.
     */
    override fun invocationsMaxRetries(invocationsMaxRetries: Number) {
      cdkBuilder.invocationsMaxRetries(invocationsMaxRetries)
    }

    /**
     * @param invocationsTimeout The timeout duration for an invocation request.
     */
    override fun invocationsTimeout(invocationsTimeout: Duration) {
      cdkBuilder.invocationsTimeout(invocationsTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions,
  ) : CdkObject(cdkObject), ModelClientOptions {
    /**
     * The maximum number of retries when invocation requests are failing.
     *
     * Default: 0
     */
    override fun invocationsMaxRetries(): Number? = unwrap(this).getInvocationsMaxRetries()

    /**
     * The timeout duration for an invocation request.
     *
     * Default: Duration.minutes(1)
     */
    override fun invocationsTimeout(): Duration? =
        unwrap(this).getInvocationsTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ModelClientOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions):
        ModelClientOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ModelClientOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions
  }
}
