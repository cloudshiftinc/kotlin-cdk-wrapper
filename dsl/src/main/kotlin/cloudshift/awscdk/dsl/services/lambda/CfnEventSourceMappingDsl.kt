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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.constructs.Construct

/**
 * The `AWS::Lambda::EventSourceMapping` resource creates a mapping between an event source and an
 * AWS Lambda function.
 *
 * Lambda reads items from the event source and triggers the function.
 *
 * For details about each event source type, see the following topics. In particular, each of the
 * topics describes the required and optional parameters for the specific event source.
 * * [Configuring a Dynamo DB stream as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-dynamodb-eventsourcemapping)
 * * [Configuring a Kinesis stream as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html#services-kinesis-eventsourcemapping)
 * * [Configuring an SQS queue as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-eventsource)
 * * [Configuring an MQ broker as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-mq.html#services-mq-eventsourcemapping)
 * * [Configuring MSK as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html)
 * * [Configuring Self-Managed Apache Kafka as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/kafka-smaa.html)
 * * [Configuring Amazon DocumentDB as an event
 *   source](https://docs.aws.amazon.com/lambda/latest/dg/with-documentdb.html)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * CfnEventSourceMapping cfnEventSourceMapping = CfnEventSourceMapping.Builder.create(this,
 * "MyCfnEventSourceMapping")
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
public class CfnEventSourceMappingDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEventSourceMapping.Builder =
        CfnEventSourceMapping.Builder.create(scope, id)

    private val _functionResponseTypes: MutableList<String> = mutableListOf()

    private val _queues: MutableList<String> = mutableListOf()

    private val _sourceAccessConfigurations: MutableList<Any> = mutableListOf()

    private val _topics: MutableList<String> = mutableListOf()

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     *
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     *   Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    public fun amazonManagedKafkaEventSourceConfig(
        amazonManagedKafkaEventSourceConfig: IResolvable
    ) {
        cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig)
    }

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     *
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
     * The maximum number of records in each batch that Lambda pulls from your stream or queue and
     * sends to your function.
     *
     * Lambda passes all of the records in the batch to the function in a single call, up to the
     * payload limit for synchronous invocation (6 MB).
     * * *Amazon Kinesis* – Default 100. Max 10,000.
     * * *Amazon DynamoDB Streams* – Default 100. Max 10,000.
     * * *Amazon Simple Queue Service* – Default 10. For standard queues the max is 10,000. For FIFO
     *   queues the max is 10.
     * * *Amazon Managed Streaming for Apache Kafka* – Default 100. Max 10,000.
     * * *Self-managed Apache Kafka* – Default 100. Max 10,000.
     * * *Amazon MQ (ActiveMQ and RabbitMQ)* – Default 100. Max 10,000.
     * * *DocumentDB* – Default 100. Max 10,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
     *
     * @param batchSize The maximum number of records in each batch that Lambda pulls from your
     *   stream or queue and sends to your function.
     */
    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     *
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     *   an error, split the batch in two and retry.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     *
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     *   an error, split the batch in two and retry.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
        cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * (Kinesis and DynamoDB Streams only) An Amazon SQS queue or Amazon SNS topic destination for
     * discarded records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     *
     * @param destinationConfig (Kinesis and DynamoDB Streams only) An Amazon SQS queue or Amazon
     *   SNS topic destination for discarded records.
     */
    public fun destinationConfig(destinationConfig: IResolvable) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /**
     * (Kinesis and DynamoDB Streams only) An Amazon SQS queue or Amazon SNS topic destination for
     * discarded records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     *
     * @param destinationConfig (Kinesis and DynamoDB Streams only) An Amazon SQS queue or Amazon
     *   SNS topic destination for discarded records.
     */
    public fun destinationConfig(
        destinationConfig: CfnEventSourceMapping.DestinationConfigProperty
    ) {
        cdkBuilder.destinationConfig(destinationConfig)
    }

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     *
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     *   source.
     */
    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
        cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig)
    }

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     *
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     *   source.
     */
    public fun documentDbEventSourceConfig(
        documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
    ) {
        cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig)
    }

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     *
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     *   polling and invocation.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     *
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     *   polling and invocation.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The Amazon Resource Name (ARN) of the event source.
     * * *Amazon Kinesis* – The ARN of the data stream or a stream consumer.
     * * *Amazon DynamoDB Streams* – The ARN of the stream.
     * * *Amazon Simple Queue Service* – The ARN of the queue.
     * * *Amazon Managed Streaming for Apache Kafka* – The ARN of the cluster.
     * * *Amazon MQ* – The ARN of the broker.
     * * *Amazon DocumentDB* – The ARN of the DocumentDB change stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
     *
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     */
    public fun eventSourceArn(eventSourceArn: String) {
        cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see
     * [Lambda event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     *
     * @param filterCriteria An object that defines the filter criteria that determine whether
     *   Lambda should process an event.
     */
    public fun filterCriteria(filterCriteria: IResolvable) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see
     * [Lambda event filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     *
     * @param filterCriteria An object that defines the filter criteria that determine whether
     *   Lambda should process an event.
     */
    public fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty) {
        cdkBuilder.filterCriteria(filterCriteria)
    }

    /**
     * The name of the Lambda function.
     *
     * **Name formats** - *Function name* – `MyFunction` .
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Version or Alias ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD` .
     * * *Partial ARN* – `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name,
     * it's limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
     *
     * @param functionName The name of the Lambda function.
     */
    public fun functionName(functionName: String) {
        cdkBuilder.functionName(functionName)
    }

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     *
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     *   to the event source mapping.
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String) {
        _functionResponseTypes.addAll(listOf(*functionResponseTypes))
    }

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     *
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     *   to the event source mapping.
     */
    public fun functionResponseTypes(functionResponseTypes: Collection<String>) {
        _functionResponseTypes.addAll(functionResponseTypes)
    }

    /**
     * The maximum amount of time, in seconds, that Lambda spends gathering records before invoking
     * the function.
     *
     * *Default ( Kinesis , DynamoDB , Amazon SQS event sources)* : 0
     *
     * *Default ( Amazon MSK , Kafka, Amazon MQ , Amazon DocumentDB event sources)* : 500 ms
     *
     * *Related setting:* For Amazon SQS event sources, when you set `BatchSize` to a value greater
     * than 10, you must set `MaximumBatchingWindowInSeconds` to at least 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds)
     *
     * @param maximumBatchingWindowInSeconds The maximum amount of time, in seconds, that Lambda
     *   spends gathering records before invoking the function.
     */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
        cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * (Kinesis and DynamoDB Streams only) Discard records older than the specified age.
     *
     * The default value is -1, which sets the maximum age to infinite. When the value is set to
     * infinite, Lambda never discards old records.
     *
     * The minimum valid value for maximum record age is 60s. Although values less than 60 and
     * greater than -1 fall within the parameter's absolute range, they are not allowed
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
     *
     * @param maximumRecordAgeInSeconds (Kinesis and DynamoDB Streams only) Discard records older
     *   than the specified age.
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
        cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
     *
     * The default value is -1, which sets the maximum number of retries to infinite. When
     * MaximumRetryAttempts is infinite, Lambda retries failed records until the record expires in
     * the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     *
     * @param maximumRetryAttempts (Kinesis and DynamoDB Streams only) Discard records after the
     *   specified number of retries.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number) {
        cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
     * shard.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     *
     * @param parallelizationFactor (Kinesis and DynamoDB Streams only) The number of batches to
     *   process concurrently from each shard.
     */
    public fun parallelizationFactor(parallelizationFactor: Number) {
        cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     *
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */
    public fun queues(vararg queues: String) {
        _queues.addAll(listOf(*queues))
    }

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     *
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */
    public fun queues(queues: Collection<String>) {
        _queues.addAll(queues)
    }

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see
     * [Configuring maximum concurrency for Amazon SQS event sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     *
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     */
    public fun scalingConfig(scalingConfig: IResolvable) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see
     * [Configuring maximum concurrency for Amazon SQS event sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     *
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     */
    public fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty) {
        cdkBuilder.scalingConfig(scalingConfig)
    }

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     *
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    public fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
        cdkBuilder.selfManagedEventSource(selfManagedEventSource)
    }

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     *
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    public fun selfManagedEventSource(
        selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty
    ) {
        cdkBuilder.selfManagedEventSource(selfManagedEventSource)
    }

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     *
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     *   Apache Kafka event source.
     */
    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
        cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig)
    }

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     *
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
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     *
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     *   virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any) {
        _sourceAccessConfigurations.addAll(listOf(*sourceAccessConfigurations))
    }

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     *
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     *   virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: Collection<Any>) {
        _sourceAccessConfigurations.addAll(sourceAccessConfigurations)
    }

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     *
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     *   virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
        cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    /**
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon
     * DynamoDB.
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     *
     * @param startingPosition The position in a stream from which to start reading. Required for
     *   Amazon Kinesis and Amazon DynamoDB.
     */
    public fun startingPosition(startingPosition: String) {
        cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
     * time seconds.
     *
     * `StartingPositionTimestamp` cannot be in the future.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     *
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     *   from which to start reading, in Unix time seconds.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number) {
        cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     *
     * @param topics The name of the Kafka topic.
     */
    public fun topics(vararg topics: String) {
        _topics.addAll(listOf(*topics))
    }

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     *
     * @param topics The name of the Kafka topic.
     */
    public fun topics(topics: Collection<String>) {
        _topics.addAll(topics)
    }

    /**
     * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for
     * DynamoDB and Kinesis Streams event sources.
     *
     * A value of 0 seconds indicates no tumbling window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
     *
     * @param tumblingWindowInSeconds (Kinesis and DynamoDB Streams only) The duration in seconds of
     *   a processing window for DynamoDB and Kinesis Streams event sources.
     */
    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
        cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): CfnEventSourceMapping {
        if (_functionResponseTypes.isNotEmpty())
            cdkBuilder.functionResponseTypes(_functionResponseTypes)
        if (_queues.isNotEmpty()) cdkBuilder.queues(_queues)
        if (_sourceAccessConfigurations.isNotEmpty())
            cdkBuilder.sourceAccessConfigurations(_sourceAccessConfigurations)
        if (_topics.isNotEmpty()) cdkBuilder.topics(_topics)
        return cdkBuilder.build()
    }
}
