@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
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

/**
 * The set of properties for streaming event sources shared by Dynamo and Kinesis.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * IEventSourceDlq eventSourceDlq;
 * Object filters;
 * Key key;
 * StreamEventSourceProps streamEventSourceProps = StreamEventSourceProps.builder()
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * // the properties below are optional
 * .batchSize(123)
 * .bisectBatchOnError(false)
 * .enabled(false)
 * .filterEncryption(key)
 * .filters(List.of(Map.of(
 * "filtersKey", filters)))
 * .maxBatchingWindow(Duration.minutes(30))
 * .maxRecordAge(Duration.minutes(30))
 * .metricsConfig(MetricsConfig.builder()
 * .metrics(List.of(MetricType.EVENT_COUNT))
 * .build())
 * .onFailure(eventSourceDlq)
 * .parallelizationFactor(123)
 * .provisionedPollerConfig(ProvisionedPollerConfig.builder()
 * .maximumPollers(123)
 * .minimumPollers(123)
 * .build())
 * .reportBatchItemFailures(false)
 * .retryAttempts(123)
 * .tumblingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
public interface StreamEventSourceProps : BaseStreamEventSourceProps {
  /**
   * If the function returns an error, split the batch in two and retry.
   *
   * Default: false
   */
  public fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

  /**
   * Add Customer managed KMS key to encrypt Filter Criteria.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
   */
  public fun filterEncryption(): IKey? = unwrap(this).getFilterEncryption()?.let(IKey::wrap)

  /**
   * Add filter criteria option.
   *
   * Default: - None
   */
  public fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

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
   */
  public fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

  /**
   * Configuration for enhanced monitoring metrics collection When specified, enables collection of
   * additional metrics for the stream event source.
   *
   * Default: - Enhanced monitoring is disabled
   */
  public fun metricsConfig(): MetricsConfig? =
      unwrap(this).getMetricsConfig()?.let(MetricsConfig::wrap)

  /**
   * An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded records.
   *
   * Default: - discarded records are ignored
   */
  public fun onFailure(): IEventSourceDlq? = unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

  /**
   * The number of batches to process from each shard concurrently.
   *
   * Valid Range:
   *
   * * Minimum value of 1
   * * Maximum value of 10
   *
   * Default: 1
   */
  public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  /**
   * Allow functions to return partially successful responses for a batch of records.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
   */
  public fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

  /**
   * Maximum number of retry attempts.
   *
   * Set to -1 for infinite retries (until the record expires in the event source).
   *
   * Valid Range: -1 (infinite) or 0 to 10000
   *
   * Default: -1 (infinite retries)
   */
  public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * The size of the tumbling windows to group records sent to DynamoDB or Kinesis Valid Range: 0 -
   * 15 minutes.
   *
   * Default: - None
   */
  public fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)

  /**
   * A builder for [StreamEventSourceProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
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
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     */
    public fun bisectBatchOnError(bisectBatchOnError: Boolean)

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria.
     */
    public fun filterEncryption(filterEncryption: IKey)

    /**
     * @param filters Add filter criteria option.
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * @param filters Add filter criteria option.
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     * processing.
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * The default value is -1, which sets the maximum age to infinite.
     * When the value is set to infinite, Lambda never discards old records.
     * Record are valid until it expires in the event source.
     */
    public fun maxRecordAge(maxRecordAge: Duration)

    /**
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source.
     */
    public fun metricsConfig(metricsConfig: MetricsConfig)

    /**
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7ba9b157b71b8aaf10216cf3b3261d0ce2f5002ebf82c5d4b7efa4e901a845b")
    public fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit)

    /**
     * @param onFailure An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded
     * records.
     */
    public fun onFailure(onFailure: IEventSourceDlq)

    /**
     * @param parallelizationFactor The number of batches to process from each shard concurrently.
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source.
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     */
    public fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig)

    /**
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source.
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18b827622a2f733a936ccb25336446ca601083b19a13d81adee22a0a60ea2b9")
    public
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit)

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

    /**
     * @param retryAttempts Maximum number of retry attempts.
     * Set to -1 for infinite retries (until the record expires in the event source).
     *
     * Valid Range: -1 (infinite) or 0 to 10000
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)

    /**
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis Valid Range: 0 - 15 minutes.
     */
    public fun tumblingWindow(tumblingWindow: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps.builder()

    /**
     * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
     * source at the time of invoking your function.
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
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bisectBatchOnError If the function returns an error, split the batch in two and retry.
     */
    override fun bisectBatchOnError(bisectBatchOnError: Boolean) {
      cdkBuilder.bisectBatchOnError(bisectBatchOnError)
    }

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria.
     */
    override fun filterEncryption(filterEncryption: IKey) {
      cdkBuilder.filterEncryption(filterEncryption.let(IKey.Companion::unwrap))
    }

    /**
     * @param filters Add filter criteria option.
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param filters Add filter criteria option.
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration.Companion::unwrap))
    }

    /**
     * @param maxRecordAge The maximum age of a record that Lambda sends to a function for
     * processing.
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * The default value is -1, which sets the maximum age to infinite.
     * When the value is set to infinite, Lambda never discards old records.
     * Record are valid until it expires in the event source.
     */
    override fun maxRecordAge(maxRecordAge: Duration) {
      cdkBuilder.maxRecordAge(maxRecordAge.let(Duration.Companion::unwrap))
    }

    /**
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source.
     */
    override fun metricsConfig(metricsConfig: MetricsConfig) {
      cdkBuilder.metricsConfig(metricsConfig.let(MetricsConfig.Companion::unwrap))
    }

    /**
     * @param metricsConfig Configuration for enhanced monitoring metrics collection When specified,
     * enables collection of additional metrics for the stream event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a7ba9b157b71b8aaf10216cf3b3261d0ce2f5002ebf82c5d4b7efa4e901a845b")
    override fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit): Unit =
        metricsConfig(MetricsConfig(metricsConfig))

    /**
     * @param onFailure An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded
     * records.
     */
    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq.Companion::unwrap))
    }

    /**
     * @param parallelizationFactor The number of batches to process from each shard concurrently.
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source.
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     */
    override fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig) {
      cdkBuilder.provisionedPollerConfig(provisionedPollerConfig.let(ProvisionedPollerConfig.Companion::unwrap))
    }

    /**
     * @param provisionedPollerConfig Configuration for provisioned pollers that read from the event
     * source.
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e18b827622a2f733a936ccb25336446ca601083b19a13d81adee22a0a60ea2b9")
    override
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit):
        Unit = provisionedPollerConfig(ProvisionedPollerConfig(provisionedPollerConfig))

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    override fun reportBatchItemFailures(reportBatchItemFailures: Boolean) {
      cdkBuilder.reportBatchItemFailures(reportBatchItemFailures)
    }

    /**
     * @param retryAttempts Maximum number of retry attempts.
     * Set to -1 for infinite retries (until the record expires in the event source).
     *
     * Valid Range: -1 (infinite) or 0 to 10000
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition.Companion::unwrap))
    }

    /**
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis Valid Range: 0 - 15 minutes.
     */
    override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps,
  ) : CdkObject(cdkObject),
      StreamEventSourceProps {
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
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * If the function returns an error, split the batch in two and retry.
     *
     * Default: false
     */
    override fun bisectBatchOnError(): Boolean? = unwrap(this).getBisectBatchOnError()

    /**
     * If the stream event source mapping should be enabled.
     *
     * Default: true
     */
    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    /**
     * Add Customer managed KMS key to encrypt Filter Criteria.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
     */
    override fun filterEncryption(): IKey? = unwrap(this).getFilterEncryption()?.let(IKey::wrap)

    /**
     * Add filter criteria option.
     *
     * Default: - None
     */
    override fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5).
     *
     * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
     * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
     */
    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

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
     */
    override fun maxRecordAge(): Duration? = unwrap(this).getMaxRecordAge()?.let(Duration::wrap)

    /**
     * Configuration for enhanced monitoring metrics collection When specified, enables collection
     * of additional metrics for the stream event source.
     *
     * Default: - Enhanced monitoring is disabled
     */
    override fun metricsConfig(): MetricsConfig? =
        unwrap(this).getMetricsConfig()?.let(MetricsConfig::wrap)

    /**
     * An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: - discarded records are ignored
     */
    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

    /**
     * The number of batches to process from each shard concurrently.
     *
     * Valid Range:
     *
     * * Minimum value of 1
     * * Maximum value of 10
     *
     * Default: 1
     */
    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * Configuration for provisioned pollers that read from the event source.
     *
     * When specified, allows control over the minimum and maximum number of pollers
     * that can be provisioned to process events from the source.
     *
     * Default: - no provisioned pollers
     */
    override fun provisionedPollerConfig(): ProvisionedPollerConfig? =
        unwrap(this).getProvisionedPollerConfig()?.let(ProvisionedPollerConfig::wrap)

    /**
     * Allow functions to return partially successful responses for a batch of records.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-batchfailurereporting)
     */
    override fun reportBatchItemFailures(): Boolean? = unwrap(this).getReportBatchItemFailures()

    /**
     * Maximum number of retry attempts.
     *
     * Set to -1 for infinite retries (until the record expires in the event source).
     *
     * Valid Range: -1 (infinite) or 0 to 10000
     *
     * Default: -1 (infinite retries)
     */
    override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * Where to begin consuming the stream.
     */
    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)

    /**
     * The size of the tumbling windows to group records sent to DynamoDB or Kinesis Valid Range:
     * 0 - 15 minutes.
     *
     * Default: - None
     */
    override fun tumblingWindow(): Duration? = unwrap(this).getTumblingWindow()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps):
        StreamEventSourceProps = CdkObjectWrappers.wrap(cdkObject) as? StreamEventSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSourceProps
  }
}
