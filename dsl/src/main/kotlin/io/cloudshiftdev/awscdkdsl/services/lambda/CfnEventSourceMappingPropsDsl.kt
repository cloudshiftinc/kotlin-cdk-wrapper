@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps

/**
 * Properties for defining a `CfnEventSourceMapping`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnEventSourceMappingProps cfnEventSourceMappingProps = CfnEventSourceMappingProps.builder()
 * .functionName("functionName")
 * // the properties below are optional
 * .amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty.builder()
 * .consumerGroupId("consumerGroupId")
 * .build())
 * .batchSize(123)
 * .bisectBatchOnFunctionError(false)
 * .destinationConfig(DestinationConfigProperty.builder()
 * .onFailure(OnFailureProperty.builder()
 * .destination("destination")
 * .build())
 * .build())
 * .documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty.builder()
 * .collectionName("collectionName")
 * .databaseName("databaseName")
 * .fullDocument("fullDocument")
 * .build())
 * .enabled(false)
 * .eventSourceArn("eventSourceArn")
 * .filterCriteria(FilterCriteriaProperty.builder()
 * .filters(List.of(FilterProperty.builder()
 * .pattern("pattern")
 * .build()))
 * .build())
 * .functionResponseTypes(List.of("functionResponseTypes"))
 * .maximumBatchingWindowInSeconds(123)
 * .maximumRecordAgeInSeconds(123)
 * .maximumRetryAttempts(123)
 * .parallelizationFactor(123)
 * .queues(List.of("queues"))
 * .scalingConfig(ScalingConfigProperty.builder()
 * .maximumConcurrency(123)
 * .build())
 * .selfManagedEventSource(SelfManagedEventSourceProperty.builder()
 * .endpoints(EndpointsProperty.builder()
 * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
 * .build())
 * .build())
 * .selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty.builder()
 * .consumerGroupId("consumerGroupId")
 * .build())
 * .sourceAccessConfigurations(List.of(SourceAccessConfigurationProperty.builder()
 * .type("type")
 * .uri("uri")
 * .build()))
 * .startingPosition("startingPosition")
 * .startingPositionTimestamp(123)
 * .topics(List.of("topics"))
 * .tumblingWindowInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingPropsDsl {
    private val cdkBuilder: CfnEventSourceMappingProps.Builder =
        CfnEventSourceMappingProps.builder()

    private val _functionResponseTypes: MutableList<String> = mutableListOf()

    private val _queues: MutableList<String> = mutableListOf()

    private val _sourceAccessConfigurations: MutableList<Any> = mutableListOf()

    private val _topics: MutableList<String> = mutableListOf()

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     *   Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    public fun amazonManagedKafkaEventSourceConfig(
        amazonManagedKafkaEventSourceConfig: IResolvable
    ) {
        cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig)
    }

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     *   Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    public fun amazonManagedKafkaEventSourceConfig(
        amazonManagedKafkaEventSourceConfig:
            CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
    ) {
        cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig)
    }

    /**
     * @param batchSize The maximum number of records in each batch that Lambda pulls from your
     *   stream or queue and sends to your function. Lambda passes all of the records in the batch
     *   to the function in a single call, up to the payload limit for synchronous invocation (6
     *   MB).
     * * *Amazon Kinesis* – Default 100. Max 10,000.
     * * *Amazon DynamoDB Streams* – Default 100. Max 10,000.
     * * *Amazon Simple Queue Service* – Default 10. For standard queues the max is 10,000. For FIFO
     *   queues the max is 10.
     * * *Amazon Managed Streaming for Apache Kafka* – Default 100. Max 10,000.
     * * *Self-managed Apache Kafka* – Default 100. Max 10,000.
     * * *Amazon MQ (ActiveMQ and RabbitMQ)* – Default 100. Max 10,000.
     * * *DocumentDB* – Default 100. Max 10,000.
     */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     *   an error, split the batch in two and retry. The default value is false.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     *   an error, split the batch in two and retry. The default value is false.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     *   Kafka event sources only) A configuration object that specifies the destination of an event
     *   after Lambda processes it.
     */
    public fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     *   Kafka event sources only) A configuration object that specifies the destination of an event
     *   after Lambda processes it.
     */
    public fun destinationConfig(
        destinationConfig: CfnEventSourceMapping.DestinationConfigProperty
    ) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     *   source.
     */
    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
        cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig)
    }

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     *   source.
     */
    public fun documentDbEventSourceConfig(
        documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
    ) {
        cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig)
    }

    /**
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     *   polling and invocation. Default: True
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     *   polling and invocation. Default: True
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     * * *Amazon Kinesis* – The ARN of the data stream or a stream consumer.
     * * *Amazon DynamoDB Streams* – The ARN of the stream.
     * * *Amazon Simple Queue Service* – The ARN of the queue.
     * * *Amazon Managed Streaming for Apache Kafka* – The ARN of the cluster or the ARN of the VPC
     *   connection (for
     *   [cross-account event source mappings](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#msk-multi-vpc)
     *   ).
     * * *Amazon MQ* – The ARN of the broker.
     * * *Amazon DocumentDB* – The ARN of the DocumentDB change stream.
     */
    public fun eventSourceArn(eventSourceArn: String) {
        cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     *   Lambda should process an event. For more information, see
     *   [Lambda event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     *   .
     */
    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     *   Lambda should process an event. For more information, see
     *   [Lambda event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     *   .
     */
    public fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /**
     * @param functionName The name of the Lambda function. **Name formats** - *Function name* –
     *   `MyFunction` .
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Version or Alias ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD` .
     * * *Partial ARN* – `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name,
     * it's limited to 64 characters in length.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     *   to the event source mapping. Valid Values: `ReportBatchItemFailures`
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String) {
        _functionResponseTypes.addAll(listOf(*functionResponseTypes))
    }

    /**
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     *   to the event source mapping. Valid Values: `ReportBatchItemFailures`
     */
    public fun functionResponseTypes(functionResponseTypes: Collection<String>) {
        _functionResponseTypes.addAll(functionResponseTypes)
    }

    /**
     * @param maximumBatchingWindowInSeconds The maximum amount of time, in seconds, that Lambda
     *   spends gathering records before invoking the function. *Default ( Kinesis , DynamoDB ,
     *   Amazon SQS event sources)* : 0
     *
     * *Default ( Amazon MSK , Kafka, Amazon MQ , Amazon DocumentDB event sources)* : 500 ms
     *
     * *Related setting:* For Amazon SQS event sources, when you set `BatchSize` to a value greater
     * than 10, you must set `MaximumBatchingWindowInSeconds` to at least 1.
     */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * @param maximumRecordAgeInSeconds (Kinesis and DynamoDB Streams only) Discard records older
     *   than the specified age. The default value is -1, which sets the maximum age to infinite.
     *   When the value is set to infinite, Lambda never discards old records.
     *
     * The minimum valid value for maximum record age is 60s. Although values less than 60 and
     * greater than -1 fall within the parameter's absolute range, they are not allowed
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts (Kinesis and DynamoDB Streams only) Discard records after the
     *   specified number of retries. The default value is -1, which sets the maximum number of
     *   retries to infinite. When MaximumRetryAttempts is infinite, Lambda retries failed records
     *   until the record expires in the event source.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * @param parallelizationFactor (Kinesis and DynamoDB Streams only) The number of batches to
     *   process concurrently from each shard. The default value is 1.
     */
    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /** @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume. */
    public fun queues(vararg queues: String) {
        _queues.addAll(listOf(*queues))
    }

    /** @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume. */
    public fun queues(queues: Collection<String>) {
        _queues.addAll(queues)
    }

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. For
     *   more information, see
     *   [Configuring maximum concurrency for Amazon SQS event sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     *   .
     */
    public fun scalingConfig(scalingConfig: IResolvable) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. For
     *   more information, see
     *   [Configuring maximum concurrency for Amazon SQS event sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     *   .
     */
    public fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    public fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
        cdkBuilder.selfManagedEventSource(selfManagedEventSource)
    }

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    public fun selfManagedEventSource(
        selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty
    ) {
        cdkBuilder.selfManagedEventSource(selfManagedEventSource)
    }

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     *   Apache Kafka event source.
     */
    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
        cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig)
    }

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     *   Apache Kafka event source.
     */
    public fun selfManagedKafkaEventSourceConfig(
        selfManagedKafkaEventSourceConfig:
            CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
    ) {
        cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig)
    }

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     *   virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any) {
        _sourceAccessConfigurations.addAll(listOf(*sourceAccessConfigurations))
    }

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     *   virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: Collection<Any>) {
        _sourceAccessConfigurations.addAll(sourceAccessConfigurations)
    }

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     *   virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
        cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    /**
     * @param startingPosition The position in a stream from which to start reading. Required for
     *   Amazon Kinesis and Amazon DynamoDB.
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     */
    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     *   from which to start reading, in Unix time seconds. `StartingPositionTimestamp` cannot be in
     *   the future.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /** @param topics The name of the Kafka topic. */
    public fun topics(vararg topics: String) {
        _topics.addAll(listOf(*topics))
    }

    /** @param topics The name of the Kafka topic. */
    public fun topics(topics: Collection<String>) {
        _topics.addAll(topics)
    }

    /**
     * @param tumblingWindowInSeconds (Kinesis and DynamoDB Streams only) The duration in seconds of
     *   a processing window for DynamoDB and Kinesis Streams event sources. A value of 0 seconds
     *   indicates no tumbling window.
     */
    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
        cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): CfnEventSourceMappingProps {
        if (_functionResponseTypes.isNotEmpty())
            cdkBuilder.functionResponseTypes(_functionResponseTypes)
        if (_queues.isNotEmpty()) cdkBuilder.queues(_queues)
        if (_sourceAccessConfigurations.isNotEmpty())
            cdkBuilder.sourceAccessConfigurations(_sourceAccessConfigurations)
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
