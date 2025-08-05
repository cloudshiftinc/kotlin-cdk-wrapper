@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.MetricsConfig
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.awscdk.services.kinesis.IStreamConsumer as CloudshiftdevAwscdkServicesKinesisIStreamConsumer
import software.amazon.awscdk.services.kinesis.IStreamConsumer as AmazonAwscdkServicesKinesisIStreamConsumer

/**
 * Use an Amazon Kinesis stream consumer as an event source for AWS Lambda.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesis.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.KinesisConsumerEventSource;
 * Function myFunction;
 * Stream stream = new Stream(this, "MyStream");
 * StreamConsumer streamConsumer = StreamConsumer.Builder.create(this, "MyStreamConsumer")
 * .stream(stream)
 * .streamConsumerName("MyStreamConsumer")
 * .build();
 * myFunction.addEventSource(KinesisConsumerEventSource.Builder.create(streamConsumer)
 * .batchSize(100) // default
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .build());
 * ```
 */
public open class KinesisConsumerEventSource(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource,
) : StreamEventSource(cdkObject) {
  public constructor(streamConsumer: CloudshiftdevAwscdkServicesKinesisIStreamConsumer,
      props: KinesisEventSourceProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource(streamConsumer.let(CloudshiftdevAwscdkServicesKinesisIStreamConsumer.Companion::unwrap),
      props.let(KinesisEventSourceProps.Companion::unwrap))
  )

  public constructor(streamConsumer: CloudshiftdevAwscdkServicesKinesisIStreamConsumer,
      props: KinesisEventSourceProps.Builder.() -> Unit) : this(streamConsumer,
      KinesisEventSourceProps(props)
  )

  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction.Companion::unwrap))
  }

  /**
   * The ARN for this EventSourceMapping.
   */
  public open fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

  /**
   * The identifier for this EventSourceMapping.
   */
  public open fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

  /**
   *
   */
  public open fun streamConsumer(): CloudshiftdevAwscdkServicesKinesisIStreamConsumer =
      unwrap(this).getStreamConsumer().let(CloudshiftdevAwscdkServicesKinesisIStreamConsumer::wrap)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.lambda.eventsources.KinesisConsumerEventSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     *
     *
     * Default: 100
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function. 
     */
    public fun batchSize(batchSize: Number)

    /**
     * If the function returns an error, split the batch in two and retry.
     *
     * Default: false
     *
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     * 
     */
    public fun bisectBatchOnError(bisectBatchOnError: Boolean)

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     *
     * @param enabled If the stream event source mapping should be enabled. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Add Customer managed KMS key to encrypt Filter Criteria.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria. 
     */
    public fun filterEncryption(filterEncryption: IKey)

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * The maximum age of a record that Lambda sends to a function for processing.
     *
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * The default value is -1, which sets the maximum age to infinite.
     * When the value is set to infinite, Lambda never discards old records.
     * Record are valid until it expires in the event source.
     *
     * Default: -1
     *
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     * processing. 
     */
    public fun maxRecordAge(maxRecordAge: Duration)

    /**
     * Configuration for enhanced monitoring metrics collection When specified, enables collection
     * of additional metrics for the stream event source.
     *
     * Default: - Enhanced monitoring is disabled
     *
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source. 
     */
    public fun metricsConfig(metricsConfig: MetricsConfig)

    /**
     * Configuration for enhanced monitoring metrics collection When specified, enables collection
     * of additional metrics for the stream event source.
     *
     * Default: - Enhanced monitoring is disabled
     *
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e189b9b467c770d57eb16577d5694c463ef5d5f658d392a019af157425b2c41")
    public fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit)

    /**
     * An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: - discarded records are ignored
     *
     * @param onFailure An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded
     * records. 
     */
    public fun onFailure(onFailure: IEventSourceDlq)

    /**
     * The number of batches to process from each shard concurrently.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     *
     * Default: 1
     *
     * @param parallelizationFactor The number of batches to process from each shard concurrently. 
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * Configuration for provisioned pollers that read from the event source.
     *
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     *
     * Default: - no provisioned pollers
     *
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source. 
     */
    public fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig)

    /**
     * Configuration for provisioned pollers that read from the event source.
     *
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     *
     * Default: - no provisioned pollers
     *
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9328356f53862c5022b6fd6d7a22c162894f82e9cd90f0157dd4761aee62ffde")
    public
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit)

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records. 
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

    /**
     * Maximum number of retry attempts.
     *
     * Set to -1 for infinite retries (until the record expires in the event source).
     *
     * Valid Range: -1 (infinite) or 0 to 10000
     *
     * Default: -1 (infinite retries)
     *
     * @param retryAttempts Maximum number of retry attempts. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Where to begin consuming the stream.
     *
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)

    /**
     * The time from which to start reading, in Unix time seconds.
     *
     * Default: - no timestamp
     *
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds. 
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * The size of the tumbling windows to group records sent to DynamoDB or Kinesis Valid Range:
     * 0 - 15 minutes.
     *
     * Default: - None
     *
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis Valid Range: 0 - 15 minutes. 
     */
    public fun tumblingWindow(tumblingWindow: Duration)
  }

  private class BuilderImpl(
    streamConsumer: AmazonAwscdkServicesKinesisIStreamConsumer,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource.Builder.create(streamConsumer)

    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of:
     *
     * * 1000 for `DynamoEventSource`
     * * 10000 for `KinesisEventSource`, `ManagedKafkaEventSource` and `SelfManagedKafkaEventSource`
     *
     *
     * Default: 100
     *
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function. 
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * If the function returns an error, split the batch in two and retry.
     *
     * Default: false
     *
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     * 
     */
    override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
      cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     *
     * @param enabled If the stream event source mapping should be enabled. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Add Customer managed KMS key to encrypt Filter Criteria.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria. 
     */
    override fun filterEncryption(filterEncryption: IKey) {
      cdkBuilder.filterEncryption(filterEncryption.let(IKey.Companion::unwrap))
    }

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * Add filter criteria option.
     *
     * Default: - None
     *
     * @param filters Add filter criteria option. 
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum age of a record that Lambda sends to a function for processing.
     *
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * The default value is -1, which sets the maximum age to infinite.
     * When the value is set to infinite, Lambda never discards old records.
     * Record are valid until it expires in the event source.
     *
     * Default: -1
     *
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     * processing. 
     */
    override fun maxRecordAge(maxRecordAge: Duration) {
      cdkBuilder.maxRecordAge(maxRecordAge.let(Duration.Companion::unwrap))
    }

    /**
     * Configuration for enhanced monitoring metrics collection When specified, enables collection
     * of additional metrics for the stream event source.
     *
     * Default: - Enhanced monitoring is disabled
     *
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source. 
     */
    override fun metricsConfig(metricsConfig: MetricsConfig) {
      cdkBuilder.metricsConfig(metricsConfig.let(MetricsConfig.Companion::unwrap))
    }

    /**
     * Configuration for enhanced monitoring metrics collection When specified, enables collection
     * of additional metrics for the stream event source.
     *
     * Default: - Enhanced monitoring is disabled
     *
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e189b9b467c770d57eb16577d5694c463ef5d5f658d392a019af157425b2c41")
    override fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit): Unit =
        metricsConfig(MetricsConfig(metricsConfig))

    /**
     * An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: - discarded records are ignored
     *
     * @param onFailure An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded
     * records. 
     */
    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq.Companion::unwrap))
    }

    /**
     * The number of batches to process from each shard concurrently.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     *
     * Default: 1
     *
     * @param parallelizationFactor The number of batches to process from each shard concurrently. 
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * Configuration for provisioned pollers that read from the event source.
     *
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     *
     * Default: - no provisioned pollers
     *
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source. 
     */
    override fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig) {
      cdkBuilder.provisionedPollerConfig(provisionedPollerConfig.let(ProvisionedPollerConfig.Companion::unwrap))
    }

    /**
     * Configuration for provisioned pollers that read from the event source.
     *
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     *
     * Default: - no provisioned pollers
     *
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9328356f53862c5022b6fd6d7a22c162894f82e9cd90f0157dd4761aee62ffde")
    override
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit):
        Unit = provisionedPollerConfig(ProvisionedPollerConfig(provisionedPollerConfig))

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records. 
     */
    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    /**
     * Maximum number of retry attempts.
     *
     * Set to -1 for infinite retries (until the record expires in the event source).
     *
     * Valid Range: -1 (infinite) or 0 to 10000
     *
     * Default: -1 (infinite retries)
     *
     * @param retryAttempts Maximum number of retry attempts. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Where to begin consuming the stream.
     *
     * @param startingPosition Where to begin consuming the stream. 
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition.Companion::unwrap))
    }

    /**
     * The time from which to start reading, in Unix time seconds.
     *
     * Default: - no timestamp
     *
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds. 
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * The size of the tumbling windows to group records sent to DynamoDB or Kinesis Valid Range:
     * 0 - 15 minutes.
     *
     * Default: - None
     *
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis Valid Range: 0 - 15 minutes. 
     */
    override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(streamConsumer: CloudshiftdevAwscdkServicesKinesisIStreamConsumer,
        block: Builder.() -> Unit = {}): KinesisConsumerEventSource {
      val builderImpl =
          BuilderImpl(CloudshiftdevAwscdkServicesKinesisIStreamConsumer.unwrap(streamConsumer))
      return KinesisConsumerEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource):
        KinesisConsumerEventSource = KinesisConsumerEventSource(cdkObject)

    internal fun unwrap(wrapped: KinesisConsumerEventSource):
        software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource =
        wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.KinesisConsumerEventSource
  }
}
