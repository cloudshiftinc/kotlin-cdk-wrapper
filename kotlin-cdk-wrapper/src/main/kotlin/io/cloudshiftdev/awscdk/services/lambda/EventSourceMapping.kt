@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines a Lambda EventSourceMapping resource.
 *
 * Usually, you won't need to define the mapping yourself. This will usually be done by
 * event sources. For example, to add an SQS event source to a function:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.sqs.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * Function handler;
 * Queue queue;
 * handler.addEventSource(new SqsEventSource(queue));
 * ```
 *
 * The `SqsEventSource` class will automatically create the mapping, and will also
 * modify the Lambda's execution role so it can consume messages from the queue.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * IEventSourceDlq eventSourceDlq;
 * Object filters;
 * Function function_;
 * Key key;
 * ISchemaRegistry schemaRegistry;
 * SourceAccessConfigurationType sourceAccessConfigurationType;
 * EventSourceMapping eventSourceMapping = EventSourceMapping.Builder.create(this,
 * "MyEventSourceMapping")
 * .target(function_)
 * // the properties below are optional
 * .batchSize(123)
 * .bisectBatchOnError(false)
 * .enabled(false)
 * .eventSourceArn("eventSourceArn")
 * .filterEncryption(key)
 * .filters(List.of(Map.of(
 * "filtersKey", filters)))
 * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
 * .kafkaConsumerGroupId("kafkaConsumerGroupId")
 * .kafkaTopic("kafkaTopic")
 * .maxBatchingWindow(Duration.minutes(30))
 * .maxConcurrency(123)
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
 * .schemaRegistryConfig(schemaRegistry)
 * .sourceAccessConfigurations(List.of(SourceAccessConfiguration.builder()
 * .type(sourceAccessConfigurationType)
 * .uri("uri")
 * .build()))
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .startingPositionTimestamp(123)
 * .supportS3OnFailureDestination(false)
 * .tumblingWindow(Duration.minutes(30))
 * .build();
 * ```
 */
public open class EventSourceMapping(
  cdkObject: software.amazon.awscdk.services.lambda.EventSourceMapping,
) : Resource(cdkObject),
    IEventSourceMapping {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventSourceMappingProps,
  ) :
      this(software.amazon.awscdk.services.lambda.EventSourceMapping(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EventSourceMappingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EventSourceMappingProps.Builder.() -> Unit,
  ) : this(scope, id, EventSourceMappingProps(props)
  )

  /**
   * The ARN of the event source mapping (i.e.
   * arn:aws:lambda:region:account-id:event-source-mapping/event-source-mapping-id).
   */
  public override fun eventSourceMappingArn(): String = unwrap(this).getEventSourceMappingArn()

  /**
   * The identifier for this EventSourceMapping.
   */
  public override fun eventSourceMappingId(): String = unwrap(this).getEventSourceMappingId()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.EventSourceMapping].
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
     * Valid Range: Minimum value of 1. Maximum value of 10000.
     *
     * Default: - Amazon Kinesis, Amazon DynamoDB, and Amazon MSK is 100 records.
     * The default for Amazon SQS is 10 messages. For standard SQS queues, the maximum is 10,000.
     * For FIFO SQS queues, the maximum is 10.
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
     * Set to false to disable the event source upon creation.
     *
     * Default: true
     *
     * @param enabled Set to false to disable the event source upon creation. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * Any record added to
     * this stream can invoke the Lambda function.
     *
     * Default: - not set if using a self managed Kafka cluster, throws an error otherwise
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
     */
    public fun eventSourceArn(eventSourceArn: String)

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
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
     * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.example.com:9096`.
     *
     * Default: - none
     *
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself. 
     */
    public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)

    /**
     * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
     * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.example.com:9096`.
     *
     * Default: - none
     *
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself. 
     */
    public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String)

    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * The value must have a length between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'. For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
     * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join. 
     */
    public fun kafkaConsumerGroupId(kafkaConsumerGroupId: String)

    /**
     * The name of the Kafka topic.
     *
     * Default: - no topic
     *
     * @param kafkaTopic The name of the Kafka topic. 
     */
    public fun kafkaTopic(kafkaTopic: String)

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5)
     *
     * Default: Duration.seconds(0)
     *
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * The maximum concurrency setting limits the number of concurrent instances of the function
     * that an Amazon SQS event source can invoke.
     *
     * Default: - No specific limit.
     *
     * @see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of
     * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke. 
     */
    public fun maxConcurrency(maxConcurrency: Number)

    /**
     * The maximum age of a record that Lambda sends to a function for processing.
     *
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * Default: - infinite or until the record expires.
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
    @JvmName("a87a0de80e00cd1b8513ad96261f4c527250e2df95335ad9f8e135d3fe0a3212")
    public fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit)

    /**
     * An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: discarded records are ignored
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
    @JvmName("a1dd99830ee8d8106c7b2c98ccc59f593f1755654548de277ffd813bbaa9b8ec")
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
     * The maximum number of times to retry when the function returns an error.
     *
     * Set to `undefined` if you want lambda to keep retrying infinitely or until
     * the record expires.
     *
     * Valid Range:
     *
     * * Minimum value of 0
     * * Maximum value of 10000
     *
     * Default: - infinite or until the record expires.
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Specific configuration settings for a Kafka schema registry.
     *
     * Default: - none
     *
     * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry. 
     */
    public fun schemaRegistryConfig(schemaRegistryConfig: ISchemaRegistry)

    /**
     * Specific settings like the authentication protocol or the VPC components to secure access to
     * your event source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source. 
     */
    public
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>)

    /**
     * Specific settings like the authentication protocol or the VPC components to secure access to
     * your event source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source. 
     */
    public fun sourceAccessConfigurations(vararg
        sourceAccessConfigurations: SourceAccessConfiguration)

    /**
     * The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda should start reading.
     *
     * Default: - no starting position
     *
     * [Documentation](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType)
     * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda
     * should start reading. 
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
     * Check if support S3 onfailure destination(OFD).
     *
     * Kinesis, DynamoDB, MSK and self managed kafka event support S3 OFD
     *
     * Default: false
     *
     * @param supportS3OnFailureDestination Check if support S3 onfailure destination(OFD). 
     */
    public fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean)

    /**
     * The target AWS Lambda function.
     *
     * @param target The target AWS Lambda function. 
     */
    public fun target(target: IFunction)

    /**
     * The size of the tumbling windows to group records sent to DynamoDB or Kinesis.
     *
     * Default: - None
     *
     * @see <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
     * Valid Range: 0 - 15
     * minutes">https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
     * Valid Range: 0 - 15 minutes</a>
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis. 
     */
    public fun tumblingWindow(tumblingWindow: Duration)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.EventSourceMapping.Builder =
        software.amazon.awscdk.services.lambda.EventSourceMapping.Builder.create(scope, id)

    /**
     * The largest number of records that AWS Lambda will retrieve from your event source at the
     * time of invoking your function.
     *
     * Your function receives an
     * event with all the retrieved records.
     *
     * Valid Range: Minimum value of 1. Maximum value of 10000.
     *
     * Default: - Amazon Kinesis, Amazon DynamoDB, and Amazon MSK is 100 records.
     * The default for Amazon SQS is 10 messages. For standard SQS queues, the maximum is 10,000.
     * For FIFO SQS queues, the maximum is 10.
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
     * Set to false to disable the event source upon creation.
     *
     * Default: true
     *
     * @param enabled Set to false to disable the event source upon creation. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * Any record added to
     * this stream can invoke the Lambda function.
     *
     * Default: - not set if using a self managed Kafka cluster, throws an error otherwise
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
     */
    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
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
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * @param filters Add filter criteria to Event Source. 
     */
    override fun filters(vararg filters: Map<String, Any>): Unit = filters(filters.toList())

    /**
     * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
     * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.example.com:9096`.
     *
     * Default: - none
     *
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself. 
     */
    override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
      cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
    }

    /**
     * A list of host and port pairs that are the addresses of the Kafka brokers in a self managed
     * "bootstrap" Kafka cluster that a Kafka client connects to initially to bootstrap itself.
     *
     * They are in the format `abc.example.com:9096`.
     *
     * Default: - none
     *
     * @param kafkaBootstrapServers A list of host and port pairs that are the addresses of the
     * Kafka brokers in a self managed "bootstrap" Kafka cluster that a Kafka client connects to
     * initially to bootstrap itself. 
     */
    override fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String): Unit =
        kafkaBootstrapServers(kafkaBootstrapServers.toList())

    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * The value must have a length between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'. For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id).
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
     * @param kafkaConsumerGroupId The identifier for the Kafka consumer group to join. 
     */
    override fun kafkaConsumerGroupId(kafkaConsumerGroupId: String) {
      cdkBuilder.kafkaConsumerGroupId(kafkaConsumerGroupId)
    }

    /**
     * The name of the Kafka topic.
     *
     * Default: - no topic
     *
     * @param kafkaTopic The name of the Kafka topic. 
     */
    override fun kafkaTopic(kafkaTopic: String) {
      cdkBuilder.kafkaTopic(kafkaTopic)
    }

    /**
     * The maximum amount of time to gather records before invoking the function.
     *
     * Maximum of Duration.minutes(5)
     *
     * Default: Duration.seconds(0)
     *
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function. 
     */
    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration.Companion::unwrap))
    }

    /**
     * The maximum concurrency setting limits the number of concurrent instances of the function
     * that an Amazon SQS event source can invoke.
     *
     * Default: - No specific limit.
     *
     * @see <a
     * href="https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of
     * 1000.">https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency
     * Valid Range: Minimum value of 2. Maximum value of 1000.</a>
     * @param maxConcurrency The maximum concurrency setting limits the number of concurrent
     * instances of the function that an Amazon SQS event source can invoke. 
     */
    override fun maxConcurrency(maxConcurrency: Number) {
      cdkBuilder.maxConcurrency(maxConcurrency)
    }

    /**
     * The maximum age of a record that Lambda sends to a function for processing.
     *
     * Valid Range:
     *
     * * Minimum value of 60 seconds
     * * Maximum value of 7 days
     *
     * Default: - infinite or until the record expires.
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
    @JvmName("a87a0de80e00cd1b8513ad96261f4c527250e2df95335ad9f8e135d3fe0a3212")
    override fun metricsConfig(metricsConfig: MetricsConfig.Builder.() -> Unit): Unit =
        metricsConfig(MetricsConfig(metricsConfig))

    /**
     * An Amazon S3, Amazon SQS queue or Amazon SNS topic destination for discarded records.
     *
     * Default: discarded records are ignored
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
    @JvmName("a1dd99830ee8d8106c7b2c98ccc59f593f1755654548de277ffd813bbaa9b8ec")
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
     * The maximum number of times to retry when the function returns an error.
     *
     * Set to `undefined` if you want lambda to keep retrying infinitely or until
     * the record expires.
     *
     * Valid Range:
     *
     * * Minimum value of 0
     * * Maximum value of 10000
     *
     * Default: - infinite or until the record expires.
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     * 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Specific configuration settings for a Kafka schema registry.
     *
     * Default: - none
     *
     * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry. 
     */
    override fun schemaRegistryConfig(schemaRegistryConfig: ISchemaRegistry) {
      cdkBuilder.schemaRegistryConfig(schemaRegistryConfig.let(ISchemaRegistry.Companion::unwrap))
    }

    /**
     * Specific settings like the authentication protocol or the VPC components to secure access to
     * your event source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source. 
     */
    override
        fun sourceAccessConfigurations(sourceAccessConfigurations: List<SourceAccessConfiguration>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map(SourceAccessConfiguration.Companion::unwrap))
    }

    /**
     * Specific settings like the authentication protocol or the VPC components to secure access to
     * your event source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
     * @param sourceAccessConfigurations Specific settings like the authentication protocol or the
     * VPC components to secure access to your event source. 
     */
    override fun sourceAccessConfigurations(vararg
        sourceAccessConfigurations: SourceAccessConfiguration): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    /**
     * The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda should start reading.
     *
     * Default: - no starting position
     *
     * [Documentation](https://docs.aws.amazon.com/kinesis/latest/APIReference/API_GetShardIterator.html#Kinesis-GetShardIterator-request-ShardIteratorType)
     * @param startingPosition The position in the DynamoDB, Kinesis or MSK stream where AWS Lambda
     * should start reading. 
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
     * Check if support S3 onfailure destination(OFD).
     *
     * Kinesis, DynamoDB, MSK and self managed kafka event support S3 OFD
     *
     * Default: false
     *
     * @param supportS3OnFailureDestination Check if support S3 onfailure destination(OFD). 
     */
    override fun supportS3OnFailureDestination(supportS3OnFailureDestination: Boolean) {
      cdkBuilder.supportS3OnFailureDestination(supportS3OnFailureDestination)
    }

    /**
     * The target AWS Lambda function.
     *
     * @param target The target AWS Lambda function. 
     */
    override fun target(target: IFunction) {
      cdkBuilder.target(target.let(IFunction.Companion::unwrap))
    }

    /**
     * The size of the tumbling windows to group records sent to DynamoDB or Kinesis.
     *
     * Default: - None
     *
     * @see <a href="https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
     * Valid Range: 0 - 15
     * minutes">https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-ddb-windows
     * Valid Range: 0 - 15 minutes</a>
     * @param tumblingWindow The size of the tumbling windows to group records sent to DynamoDB or
     * Kinesis. 
     */
    override fun tumblingWindow(tumblingWindow: Duration) {
      cdkBuilder.tumblingWindow(tumblingWindow.let(Duration.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.lambda.EventSourceMapping =
        cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.lambda.EventSourceMapping.PROPERTY_INJECTION_ID

    public fun fromEventSourceMappingId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eventSourceMappingId: String,
    ): IEventSourceMapping =
        software.amazon.awscdk.services.lambda.EventSourceMapping.fromEventSourceMappingId(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, eventSourceMappingId).let(IEventSourceMapping::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EventSourceMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EventSourceMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.EventSourceMapping):
        EventSourceMapping = EventSourceMapping(cdkObject)

    internal fun unwrap(wrapped: EventSourceMapping):
        software.amazon.awscdk.services.lambda.EventSourceMapping = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.EventSourceMapping
  }
}
