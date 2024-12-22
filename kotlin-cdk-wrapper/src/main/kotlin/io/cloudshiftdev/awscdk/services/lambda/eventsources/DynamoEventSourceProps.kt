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
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.dynamodb.*;
 * Function fn;
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder()
 * .name("id")
 * .type(AttributeType.STRING)
 * .build())
 * .stream(StreamViewType.NEW_IMAGE)
 * .build();
 * fn.addEventSource(DynamoEventSource.Builder.create(table)
 * .startingPosition(StartingPosition.LATEST)
 * .metricsConfig(MetricsConfig.builder()
 * .metrics(List.of(MetricType.EVENT_COUNT))
 * .build())
 * .build());
 * ```
 */
public interface DynamoEventSourceProps : StreamEventSourceProps {
  /**
   * A builder for [DynamoEventSourceProps]
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
    @JvmName("a71bd09c9a3af1453bec5269c25b88daa94744d1e637c33651ebbc055fa35206")
    public fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit)

    /**
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records.
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
    @JvmName("225c52c0e063b4ccdacc8c0c0e829bb1b0160be88304420949dda0787a751a1d")
    public
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit)

    /**
     * @param reportBatchItemFailures Allow functions to return partially successful responses for a
     * batch of records.
     */
    public fun reportBatchItemFailures(reportBatchItemFailures: Boolean)

    /**
     * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
     * Maximum value of 10000.
     * The default value is -1, which sets the maximum number of retries to infinite.
     * When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
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
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps.builder()

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
    @JvmName("a71bd09c9a3af1453bec5269c25b88daa94744d1e637c33651ebbc055fa35206")
    override fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit): Unit =
        metricsConfig(MetricsConfig(metricsConfig))

    /**
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records.
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
    @JvmName("225c52c0e063b4ccdacc8c0c0e829bb1b0160be88304420949dda0787a751a1d")
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
     * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
     * Maximum value of 10000.
     * The default value is -1, which sets the maximum number of retries to infinite.
     * When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
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

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps,
  ) : CdkObject(cdkObject),
      DynamoEventSourceProps {
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
     * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
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
     * Maximum number of retry attempts Valid Range: * Minimum value of 0 * Maximum value of 10000.
     *
     * The default value is -1, which sets the maximum number of retries to infinite.
     * When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     *
     * Default: -1
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
    public operator fun invoke(block: Builder.() -> Unit = {}): DynamoEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps):
        DynamoEventSourceProps = CdkObjectWrappers.wrap(cdkObject) as? DynamoEventSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DynamoEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSourceProps
  }
}
