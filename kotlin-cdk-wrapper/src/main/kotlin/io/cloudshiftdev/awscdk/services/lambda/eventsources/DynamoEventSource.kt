@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.awscdk.services.dynamodb.ITable as CloudshiftdevAwscdkServicesDynamodbITable
import software.amazon.awscdk.services.dynamodb.ITable as AmazonAwscdkServicesDynamodbITable

/**
 * Use an Amazon DynamoDB stream as an event source for AWS Lambda.
 *
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
 * .filters(List.of(FilterCriteria.filter(Map.of("eventName", FilterRule.isEqual("INSERT")))))
 * .build());
 * ```
 */
public open class DynamoEventSource(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource,
) : StreamEventSource(cdkObject) {
  public constructor(table: CloudshiftdevAwscdkServicesDynamodbITable,
      props: DynamoEventSourceProps) :
      this(software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource(table.let(CloudshiftdevAwscdkServicesDynamodbITable.Companion::unwrap),
      props.let(DynamoEventSourceProps.Companion::unwrap))
  )

  public constructor(table: CloudshiftdevAwscdkServicesDynamodbITable,
      props: DynamoEventSourceProps.Builder.() -> Unit) : this(table, DynamoEventSourceProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.eventsources.DynamoEventSource].
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
     * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: - discarded records are ignored
     *
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records. 
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
     * Maximum number of retry attempts Valid Range: * Minimum value of 0 * Maximum value of 10000.
     *
     * The default value is -1, which sets the maximum number of retries to infinite.
     * When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     *
     * Default: -1
     *
     * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
     * Maximum value of 10000. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Where to begin consuming the stream.
     *
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)

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
    table: AmazonAwscdkServicesDynamodbITable,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource.Builder =
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource.Builder.create(table)

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
     * An Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: - discarded records are ignored
     *
     * @param onFailure An Amazon SQS queue or Amazon SNS topic destination for discarded records. 
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
     * Maximum number of retry attempts Valid Range: * Minimum value of 0 * Maximum value of 10000.
     *
     * The default value is -1, which sets the maximum number of retries to infinite.
     * When MaximumRetryAttempts is infinite, Lambda retries failed records until
     * the record expires in the event source.
     *
     * Default: -1
     *
     * @param retryAttempts Maximum number of retry attempts Valid Range: * Minimum value of 0 *
     * Maximum value of 10000. 
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

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(table: CloudshiftdevAwscdkServicesDynamodbITable,
        block: Builder.() -> Unit = {}): DynamoEventSource {
      val builderImpl = BuilderImpl(CloudshiftdevAwscdkServicesDynamodbITable.unwrap(table))
      return DynamoEventSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource):
        DynamoEventSource = DynamoEventSource(cdkObject)

    internal fun unwrap(wrapped: DynamoEventSource):
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.DynamoEventSource
  }
}
