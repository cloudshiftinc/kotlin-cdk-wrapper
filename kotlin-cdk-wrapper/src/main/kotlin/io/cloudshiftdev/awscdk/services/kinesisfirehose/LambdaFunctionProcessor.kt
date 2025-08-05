@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisfirehose

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Size
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.Number
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.lambda.IFunction as CloudshiftdevAwscdkServicesLambdaIFunction
import software.amazon.awscdk.services.lambda.IFunction as AmazonAwscdkServicesLambdaIFunction

/**
 * Use an AWS Lambda function to transform records.
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
public open class LambdaFunctionProcessor(
  cdkObject: software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor,
) : CdkObject(cdkObject),
    IDataProcessor {
  public constructor(lambdaFunction: CloudshiftdevAwscdkServicesLambdaIFunction) :
      this(software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor(lambdaFunction.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap))
  )

  public constructor(lambdaFunction: CloudshiftdevAwscdkServicesLambdaIFunction,
      props: DataProcessorProps) :
      this(software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor(lambdaFunction.let(CloudshiftdevAwscdkServicesLambdaIFunction.Companion::unwrap),
      props.let(DataProcessorProps.Companion::unwrap))
  )

  public constructor(lambdaFunction: CloudshiftdevAwscdkServicesLambdaIFunction,
      props: DataProcessorProps.Builder.() -> Unit) : this(lambdaFunction, DataProcessorProps(props)
  )

  /**
   * Binds this processor to a destination of a delivery stream.
   *
   * Implementers should use this method to grant processor invocation permissions to the provided
   * stream and return the
   * necessary configuration to register as a processor.
   *
   * @param _scope 
   * @param options 
   */
  public override fun bind(scope: Construct, options: DataProcessorBindOptions): DataProcessorConfig
      = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      options.let(DataProcessorBindOptions.Companion::unwrap)).let(DataProcessorConfig::wrap)

  /**
   * Binds this processor to a destination of a delivery stream.
   *
   * Implementers should use this method to grant processor invocation permissions to the provided
   * stream and return the
   * necessary configuration to register as a processor.
   *
   * @param _scope 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ddee5c54a61fd62f1739692d90a65cc63b37887a677215acfca7573c35cecb08")
  public override fun bind(scope: Construct, options: DataProcessorBindOptions.Builder.() -> Unit):
      DataProcessorConfig = bind(scope, DataProcessorBindOptions(options))

  /**
   * The constructor props of the LambdaFunctionProcessor.
   */
  public override fun props(): DataProcessorProps =
      unwrap(this).getProps().let(DataProcessorProps::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.kinesisfirehose.LambdaFunctionProcessor].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The length of time Amazon Data Firehose will buffer incoming data before calling the
     * processor.
     *
     * s
     *
     * Default: Duration.minutes(1)
     *
     * @param bufferInterval The length of time Amazon Data Firehose will buffer incoming data
     * before calling the processor. 
     */
    public fun bufferInterval(bufferInterval: Duration)

    /**
     * The amount of incoming data Amazon Data Firehose will buffer before calling the processor.
     *
     * Default: Size.mebibytes(3)
     *
     * @param bufferSize The amount of incoming data Amazon Data Firehose will buffer before calling
     * the processor. 
     */
    public fun bufferSize(bufferSize: Size)

    /**
     * The number of times Amazon Data Firehose will retry the processor invocation after a failure
     * due to network timeout or invocation limits.
     *
     * Default: 3
     *
     * @param retries The number of times Amazon Data Firehose will retry the processor invocation
     * after a failure due to network timeout or invocation limits. 
     */
    public fun retries(retries: Number)
  }

  private class BuilderImpl(
    lambdaFunction: AmazonAwscdkServicesLambdaIFunction,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor.Builder =
        software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor.Builder.create(lambdaFunction)

    /**
     * The length of time Amazon Data Firehose will buffer incoming data before calling the
     * processor.
     *
     * s
     *
     * Default: Duration.minutes(1)
     *
     * @param bufferInterval The length of time Amazon Data Firehose will buffer incoming data
     * before calling the processor. 
     */
    override fun bufferInterval(bufferInterval: Duration) {
      cdkBuilder.bufferInterval(bufferInterval.let(Duration.Companion::unwrap))
    }

    /**
     * The amount of incoming data Amazon Data Firehose will buffer before calling the processor.
     *
     * Default: Size.mebibytes(3)
     *
     * @param bufferSize The amount of incoming data Amazon Data Firehose will buffer before calling
     * the processor. 
     */
    override fun bufferSize(bufferSize: Size) {
      cdkBuilder.bufferSize(bufferSize.let(Size.Companion::unwrap))
    }

    /**
     * The number of times Amazon Data Firehose will retry the processor invocation after a failure
     * due to network timeout or invocation limits.
     *
     * Default: 3
     *
     * @param retries The number of times Amazon Data Firehose will retry the processor invocation
     * after a failure due to network timeout or invocation limits. 
     */
    override fun retries(retries: Number) {
      cdkBuilder.retries(retries)
    }

    public fun build(): software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(lambdaFunction: CloudshiftdevAwscdkServicesLambdaIFunction,
        block: Builder.() -> Unit = {}): LambdaFunctionProcessor {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesLambdaIFunction.unwrap(lambdaFunction))
      return LambdaFunctionProcessor(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor):
        LambdaFunctionProcessor = LambdaFunctionProcessor(cdkObject)

    internal fun unwrap(wrapped: LambdaFunctionProcessor):
        software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor = wrapped.cdkObject
        as software.amazon.awscdk.services.kinesisfirehose.LambdaFunctionProcessor
  }
}
