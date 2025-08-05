@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.Unit

/**
 * Configure the data processor.
 *
 * Example:
 *
 * ```
 * Bucket bucket;
 * // Provide a Lambda function that will transform records before delivery, with custom
 * // buffering and retry configuration
 * Function lambdaFunction = Function.Builder.create(this, "Processor")
 * .runtime(Runtime.NODEJS_LATEST)
 * .handler("index.handler")
 * .code(Code.fromAsset(join(__dirname, "process-records")))
 * .build();
 * LambdaFunctionProcessor lambdaProcessor = LambdaFunctionProcessor.Builder.create(lambdaFunction)
 * .bufferInterval(Duration.minutes(5))
 * .bufferSize(Size.mebibytes(5))
 * .retries(5)
 * .build();
 * S3Bucket s3Destination = S3Bucket.Builder.create(bucket)
 * .processor(lambdaProcessor)
 * .build();
 * DeliveryStream.Builder.create(this, "Delivery Stream")
 * .destination(s3Destination)
 * .build();
 * ```
 */
public interface DataProcessorProps {
  /**
   * The length of time Amazon Data Firehose will buffer incoming data before calling the processor.
   *
   * s
   *
   * Default: Duration.minutes(1)
   */
  public fun bufferInterval(): Duration? = unwrap(this).getBufferInterval()?.let(Duration::wrap)

  /**
   * The amount of incoming data Amazon Data Firehose will buffer before calling the processor.
   *
   * Default: Size.mebibytes(3)
   */
  public fun bufferSize(): Size? = unwrap(this).getBufferSize()?.let(Size::wrap)

  /**
   * The number of times Amazon Data Firehose will retry the processor invocation after a failure
   * due to network timeout or invocation limits.
   *
   * Default: 3
   */
  public fun retries(): Number? = unwrap(this).getRetries()

  /**
   * A builder for [DataProcessorProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bufferInterval The length of time Amazon Data Firehose will buffer incoming data
     * before calling the processor.
     * s
     */
    public fun bufferInterval(bufferInterval: Duration)

    /**
     * @param bufferSize The amount of incoming data Amazon Data Firehose will buffer before calling
     * the processor.
     */
    public fun bufferSize(bufferSize: Size)

    /**
     * @param retries The number of times Amazon Data Firehose will retry the processor invocation
     * after a failure due to network timeout or invocation limits.
     */
    public fun retries(retries: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps.Builder =
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps.builder()

    /**
     * @param bufferInterval The length of time Amazon Data Firehose will buffer incoming data
     * before calling the processor.
     * s
     */
    override fun bufferInterval(bufferInterval: Duration) {
      cdkBuilder.bufferInterval(bufferInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param bufferSize The amount of incoming data Amazon Data Firehose will buffer before calling
     * the processor.
     */
    override fun bufferSize(bufferSize: Size) {
      cdkBuilder.bufferSize(bufferSize.let(Size.Companion::unwrap))
    }

    /**
     * @param retries The number of times Amazon Data Firehose will retry the processor invocation
     * after a failure due to network timeout or invocation limits.
     */
    override fun retries(retries: Number) {
      cdkBuilder.retries(retries)
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps,
  ) : CdkObject(cdkObject),
      DataProcessorProps {
    /**
     * The length of time Amazon Data Firehose will buffer incoming data before calling the
     * processor.
     *
     * s
     *
     * Default: Duration.minutes(1)
     */
    override fun bufferInterval(): Duration? = unwrap(this).getBufferInterval()?.let(Duration::wrap)

    /**
     * The amount of incoming data Amazon Data Firehose will buffer before calling the processor.
     *
     * Default: Size.mebibytes(3)
     */
    override fun bufferSize(): Size? = unwrap(this).getBufferSize()?.let(Size::wrap)

    /**
     * The number of times Amazon Data Firehose will retry the processor invocation after a failure
     * due to network timeout or invocation limits.
     *
     * Default: 3
     */
    override fun retries(): Number? = unwrap(this).getRetries()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataProcessorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps):
        DataProcessorProps = CdkObjectWrappers.wrap(cdkObject) as? DataProcessorProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataProcessorProps):
        software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.kinesisfirehose.DataProcessorProps
  }
}
