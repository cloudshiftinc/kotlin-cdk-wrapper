@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnEventSourceMapping`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
public interface CfnEventSourceMappingProps {
  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
   */
  public fun amazonManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getAmazonManagedKafkaEventSourceConfig()

  /**
   * The maximum number of records in each batch that Lambda pulls from your stream or queue and
   * sends to your function.
   *
   * Lambda passes all of the records in the batch to the function in a single call, up to the
   * payload limit for synchronous invocation (6 MB).
   *
   * * *Amazon Kinesis* – Default 100. Max 10,000.
   * * *Amazon DynamoDB Streams* – Default 100. Max 10,000.
   * * *Amazon Simple Queue Service* – Default 10. For standard queues the max is 10,000. For FIFO
   * queues the max is 10.
   * * *Amazon Managed Streaming for Apache Kafka* – Default 100. Max 10,000.
   * * *Self-managed Apache Kafka* – Default 100. Max 10,000.
   * * *Amazon MQ (ActiveMQ and RabbitMQ)* – Default 100. Max 10,000.
   * * *DocumentDB* – Default 100. Max 10,000.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
   */
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  /**
   * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
   * and retry.
   *
   * The default value is false.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
   */
  public fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

  /**
   * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
   * configuration object that specifies the destination of an event after Lambda processes it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
   */
  public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  /**
   * Specific configuration settings for a DocumentDB event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
   */
  public fun documentDbEventSourceConfig(): Any? = unwrap(this).getDocumentDbEventSourceConfig()

  /**
   * When true, the event source mapping is active. When false, Lambda pauses polling and
   * invocation.
   *
   * Default: True
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The Amazon Resource Name (ARN) of the event source.
   *
   * * *Amazon Kinesis* – The ARN of the data stream or a stream consumer.
   * * *Amazon DynamoDB Streams* – The ARN of the stream.
   * * *Amazon Simple Queue Service* – The ARN of the queue.
   * * *Amazon Managed Streaming for Apache Kafka* – The ARN of the cluster or the ARN of the VPC
   * connection (for [cross-account event source
   * mappings](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#msk-multi-vpc) ).
   * * *Amazon MQ* – The ARN of the broker.
   * * *Amazon DocumentDB* – The ARN of the DocumentDB change stream.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
   */
  public fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   *
   * For more information, see [Lambda event
   * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
   */
  public fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  /**
   * The name of the Lambda function.
   *
   * **Name formats** - *Function name* – `MyFunction` .
   *
   * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
   * * *Version or Alias ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD` .
   * * *Partial ARN* – `123456789012:function:MyFunction` .
   *
   * The length constraint applies only to the full ARN. If you specify only the function name, it's
   * limited to 64 characters in length.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
   */
  public fun functionName(): String

  /**
   * (Streams and SQS) A list of current response type enums applied to the event source mapping.
   *
   * Valid Values: `ReportBatchItemFailures`
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
   */
  public fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

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
   */
  public fun maximumBatchingWindowInSeconds(): Number? =
      unwrap(this).getMaximumBatchingWindowInSeconds()

  /**
   * (Kinesis and DynamoDB Streams only) Discard records older than the specified age.
   *
   * The default value is -1,
   * which sets the maximum age to infinite. When the value is set to infinite, Lambda never
   * discards old records.
   *
   *
   * The minimum valid value for maximum record age is 60s. Although values less than 60 and greater
   * than -1 fall within the parameter's absolute range, they are not allowed
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
   */
  public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

  /**
   * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
   *
   * The default value is -1,
   * which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite,
   * Lambda retries failed records until the record expires in the event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
   */
  public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  /**
   * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
   * shard.
   *
   * The default value is 1.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
   */
  public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  /**
   * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
   */
  public fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   *
   * For more information, see [Configuring maximum concurrency for Amazon SQS event
   * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
   */
  public fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  /**
   * The self-managed Apache Kafka cluster for your event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
   */
  public fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
   */
  public fun selfManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getSelfManagedKafkaEventSourceConfig()

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
   */
  public fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

  /**
   * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon
   * DynamoDB.
   *
   * * *LATEST* - Read only new records.
   * * *TRIM_HORIZON* - Process all available records.
   * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
   */
  public fun startingPosition(): String? = unwrap(this).getStartingPosition()

  /**
   * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
   * time seconds.
   *
   * `StartingPositionTimestamp` cannot be in the future.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
   */
  public fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  /**
   * The name of the Kafka topic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
   */
  public fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  /**
   * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for DynamoDB
   * and Kinesis Streams event sources.
   *
   * A value of 0 seconds indicates no tumbling window.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
   */
  public fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()

  /**
   * A builder for [CfnEventSourceMappingProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable)

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty)

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9284c4da4983caa97612e7b01c42241967f360aa7dd95373593dc8311c6aa")
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param batchSize The maximum number of records in each batch that Lambda pulls from your
     * stream or queue and sends to your function.
     * Lambda passes all of the records in the batch to the function in a single call, up to the
     * payload limit for synchronous invocation (6 MB).
     *
     * * *Amazon Kinesis* – Default 100. Max 10,000.
     * * *Amazon DynamoDB Streams* – Default 100. Max 10,000.
     * * *Amazon Simple Queue Service* – Default 10. For standard queues the max is 10,000. For FIFO
     * queues the max is 10.
     * * *Amazon Managed Streaming for Apache Kafka* – Default 100. Max 10,000.
     * * *Self-managed Apache Kafka* – Default 100. Max 10,000.
     * * *Amazon MQ (ActiveMQ and RabbitMQ)* – Default 100. Max 10,000.
     * * *DocumentDB* – Default 100. Max 10,000.
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry.
     * The default value is false.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

    /**
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry.
     * The default value is false.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    public fun destinationConfig(destinationConfig: IResolvable)

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    public fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty)

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb5cce258aa75796eb59a269c1fef538aacd71fcc93528503b2b03792d5f23f4")
    public
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit)

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source.
     */
    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable)

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source.
     */
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty)

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d09fb314ca9893c0049527cb14bf2c10d2ff9b3b75d94621775da00c0e2ba4e7")
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation.
     * Default: True
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation.
     * Default: True
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     * * *Amazon Kinesis* – The ARN of the data stream or a stream consumer.
     * * *Amazon DynamoDB Streams* – The ARN of the stream.
     * * *Amazon Simple Queue Service* – The ARN of the queue.
     * * *Amazon Managed Streaming for Apache Kafka* – The ARN of the cluster or the ARN of the VPC
     * connection (for [cross-account event source
     * mappings](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#msk-multi-vpc) ).
     * * *Amazon MQ* – The ARN of the broker.
     * * *Amazon DocumentDB* – The ARN of the DocumentDB change stream.
     */
    public fun eventSourceArn(eventSourceArn: String)

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event.
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event.
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     */
    public fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty)

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event.
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64d63e409c55293cf7b59494387d9651b3d5c3761ad44584ecbc98ce165317b3")
    public
        fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * @param functionName The name of the Lambda function. 
     * **Name formats** - *Function name* – `MyFunction` .
     *
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Version or Alias ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD` .
     * * *Partial ARN* – `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name,
     * it's limited to 64 characters in length.
     */
    public fun functionName(functionName: String)

    /**
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping.
     * Valid Values: `ReportBatchItemFailures`
     */
    public fun functionResponseTypes(functionResponseTypes: List<String>)

    /**
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping.
     * Valid Values: `ReportBatchItemFailures`
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String)

    /**
     * @param maximumBatchingWindowInSeconds The maximum amount of time, in seconds, that Lambda
     * spends gathering records before invoking the function.
     * *Default ( Kinesis , DynamoDB , Amazon SQS event sources)* : 0
     *
     * *Default ( Amazon MSK , Kafka, Amazon MQ , Amazon DocumentDB event sources)* : 500 ms
     *
     * *Related setting:* For Amazon SQS event sources, when you set `BatchSize` to a value greater
     * than 10, you must set `MaximumBatchingWindowInSeconds` to at least 1.
     */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

    /**
     * @param maximumRecordAgeInSeconds (Kinesis and DynamoDB Streams only) Discard records older
     * than the specified age.
     * The default value is -1,
     * which sets the maximum age to infinite. When the value is set to infinite, Lambda never
     * discards old records.
     *
     *
     * The minimum valid value for maximum record age is 60s. Although values less than 60 and
     * greater than -1 fall within the parameter's absolute range, they are not allowed
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

    /**
     * @param maximumRetryAttempts (Kinesis and DynamoDB Streams only) Discard records after the
     * specified number of retries.
     * The default value is -1,
     * which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite,
     * Lambda retries failed records until the record expires in the event source.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    /**
     * @param parallelizationFactor (Kinesis and DynamoDB Streams only) The number of batches to
     * process concurrently from each shard.
     * The default value is 1.
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */
    public fun queues(queues: List<String>)

    /**
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */
    public fun queues(vararg queues: String)

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     */
    public fun scalingConfig(scalingConfig: IResolvable)

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     */
    public fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty)

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac8a6eb426933fb2b88b6b01a6b43a8fc38a35b3ca922d3fffb4555c7fc2d5e")
    public
        fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit)

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    public fun selfManagedEventSource(selfManagedEventSource: IResolvable)

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    public
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty)

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb957a59dc8c21d665025789b750dee782b2a8aa37584acb897dbc5107c9aea")
    public
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit)

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source.
     */
    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable)

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source.
     */
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty)

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4feb2b9834757a9de4c9819fab63badbd08a0b7d2d0f13a526f333ee91a347")
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable)

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>)

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source.
     */
    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any)

    /**
     * @param startingPosition The position in a stream from which to start reading. Required for
     * Amazon Kinesis and Amazon DynamoDB.
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     */
    public fun startingPosition(startingPosition: String)

    /**
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     * from which to start reading, in Unix time seconds.
     * `StartingPositionTimestamp` cannot be in the future.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * @param topics The name of the Kafka topic.
     */
    public fun topics(topics: List<String>)

    /**
     * @param topics The name of the Kafka topic.
     */
    public fun topics(vararg topics: String)

    /**
     * @param tumblingWindowInSeconds (Kinesis and DynamoDB Streams only) The duration in seconds of
     * a processing window for DynamoDB and Kinesis Streams event sources.
     * A value of 0 seconds indicates no tumbling window.
     */
    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder =
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.builder()

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty::unwrap))
    }

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9284c4da4983caa97612e7b01c42241967f360aa7dd95373593dc8311c6aa")
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        amazonManagedKafkaEventSourceConfig(CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty(amazonManagedKafkaEventSourceConfig))

    /**
     * @param batchSize The maximum number of records in each batch that Lambda pulls from your
     * stream or queue and sends to your function.
     * Lambda passes all of the records in the batch to the function in a single call, up to the
     * payload limit for synchronous invocation (6 MB).
     *
     * * *Amazon Kinesis* – Default 100. Max 10,000.
     * * *Amazon DynamoDB Streams* – Default 100. Max 10,000.
     * * *Amazon Simple Queue Service* – Default 10. For standard queues the max is 10,000. For FIFO
     * queues the max is 10.
     * * *Amazon Managed Streaming for Apache Kafka* – Default 100. Max 10,000.
     * * *Self-managed Apache Kafka* – Default 100. Max 10,000.
     * * *Amazon MQ (ActiveMQ and RabbitMQ)* – Default 100. Max 10,000.
     * * *DocumentDB* – Default 100. Max 10,000.
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry.
     * The default value is false.
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry.
     * The default value is false.
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable::unwrap))
    }

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
    }

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    override
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(CfnEventSourceMapping.DestinationConfigProperty::unwrap))
    }

    /**
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb5cce258aa75796eb59a269c1fef538aacd71fcc93528503b2b03792d5f23f4")
    override
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(CfnEventSourceMapping.DestinationConfigProperty(destinationConfig))

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source.
     */
    override fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source.
     */
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(CfnEventSourceMapping.DocumentDBEventSourceConfigProperty::unwrap))
    }

    /**
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d09fb314ca9893c0049527cb14bf2c10d2ff9b3b75d94621775da00c0e2ba4e7")
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        documentDbEventSourceConfig(CfnEventSourceMapping.DocumentDBEventSourceConfigProperty(documentDbEventSourceConfig))

    /**
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation.
     * Default: True
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation.
     * Default: True
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     * * *Amazon Kinesis* – The ARN of the data stream or a stream consumer.
     * * *Amazon DynamoDB Streams* – The ARN of the stream.
     * * *Amazon Simple Queue Service* – The ARN of the queue.
     * * *Amazon Managed Streaming for Apache Kafka* – The ARN of the cluster or the ARN of the VPC
     * connection (for [cross-account event source
     * mappings](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#msk-multi-vpc) ).
     * * *Amazon MQ* – The ARN of the broker.
     * * *Amazon DocumentDB* – The ARN of the DocumentDB change stream.
     */
    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event.
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event.
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     */
    override fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(CfnEventSourceMapping.FilterCriteriaProperty::unwrap))
    }

    /**
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event.
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64d63e409c55293cf7b59494387d9651b3d5c3761ad44584ecbc98ce165317b3")
    override
        fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(CfnEventSourceMapping.FilterCriteriaProperty(filterCriteria))

    /**
     * @param functionName The name of the Lambda function. 
     * **Name formats** - *Function name* – `MyFunction` .
     *
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Version or Alias ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD` .
     * * *Partial ARN* – `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name,
     * it's limited to 64 characters in length.
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping.
     * Valid Values: `ReportBatchItemFailures`
     */
    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    /**
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping.
     * Valid Values: `ReportBatchItemFailures`
     */
    override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
        functionResponseTypes(functionResponseTypes.toList())

    /**
     * @param maximumBatchingWindowInSeconds The maximum amount of time, in seconds, that Lambda
     * spends gathering records before invoking the function.
     * *Default ( Kinesis , DynamoDB , Amazon SQS event sources)* : 0
     *
     * *Default ( Amazon MSK , Kafka, Amazon MQ , Amazon DocumentDB event sources)* : 500 ms
     *
     * *Related setting:* For Amazon SQS event sources, when you set `BatchSize` to a value greater
     * than 10, you must set `MaximumBatchingWindowInSeconds` to at least 1.
     */
    override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * @param maximumRecordAgeInSeconds (Kinesis and DynamoDB Streams only) Discard records older
     * than the specified age.
     * The default value is -1,
     * which sets the maximum age to infinite. When the value is set to infinite, Lambda never
     * discards old records.
     *
     *
     * The minimum valid value for maximum record age is 60s. Although values less than 60 and
     * greater than -1 fall within the parameter's absolute range, they are not allowed
     */
    override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts (Kinesis and DynamoDB Streams only) Discard records after the
     * specified number of retries.
     * The default value is -1,
     * which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite,
     * Lambda retries failed records until the record expires in the event source.
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * @param parallelizationFactor (Kinesis and DynamoDB Streams only) The number of batches to
     * process concurrently from each shard.
     * The default value is 1.
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */
    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    /**
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     */
    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     */
    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     */
    override fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(CfnEventSourceMapping.ScalingConfigProperty::unwrap))
    }

    /**
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source.
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac8a6eb426933fb2b88b6b01a6b43a8fc38a35b3ca922d3fffb4555c7fc2d5e")
    override
        fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit):
        Unit = scalingConfig(CfnEventSourceMapping.ScalingConfigProperty(scalingConfig))

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    override fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable::unwrap))
    }

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    override
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(CfnEventSourceMapping.SelfManagedEventSourceProperty::unwrap))
    }

    /**
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb957a59dc8c21d665025789b750dee782b2a8aa37584acb897dbc5107c9aea")
    override
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit):
        Unit =
        selfManagedEventSource(CfnEventSourceMapping.SelfManagedEventSourceProperty(selfManagedEventSource))

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source.
     */
    override fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source.
     */
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty::unwrap))
    }

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4feb2b9834757a9de4c9819fab63badbd08a0b7d2d0f13a526f333ee91a347")
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        selfManagedKafkaEventSourceConfig(CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty(selfManagedKafkaEventSourceConfig))

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source.
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable::unwrap))
    }

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source.
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    /**
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source.
     */
    override fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    /**
     * @param startingPosition The position in a stream from which to start reading. Required for
     * Amazon Kinesis and Amazon DynamoDB.
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     */
    override fun startingPosition(startingPosition: String) {
      cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     * from which to start reading, in Unix time seconds.
     * `StartingPositionTimestamp` cannot be in the future.
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * @param topics The name of the Kafka topic.
     */
    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    /**
     * @param topics The name of the Kafka topic.
     */
    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    /**
     * @param tumblingWindowInSeconds (Kinesis and DynamoDB Streams only) The duration in seconds of
     * a processing window for DynamoDB and Kinesis Streams event sources.
     * A value of 0 seconds indicates no tumbling window.
     */
    override fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
      cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps,
  ) : CdkObject(cdkObject), CfnEventSourceMappingProps {
    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     */
    override fun amazonManagedKafkaEventSourceConfig(): Any? =
        unwrap(this).getAmazonManagedKafkaEventSourceConfig()

    /**
     * The maximum number of records in each batch that Lambda pulls from your stream or queue and
     * sends to your function.
     *
     * Lambda passes all of the records in the batch to the function in a single call, up to the
     * payload limit for synchronous invocation (6 MB).
     *
     * * *Amazon Kinesis* – Default 100. Max 10,000.
     * * *Amazon DynamoDB Streams* – Default 100. Max 10,000.
     * * *Amazon Simple Queue Service* – Default 10. For standard queues the max is 10,000. For FIFO
     * queues the max is 10.
     * * *Amazon Managed Streaming for Apache Kafka* – Default 100. Max 10,000.
     * * *Self-managed Apache Kafka* – Default 100. Max 10,000.
     * * *Amazon MQ (ActiveMQ and RabbitMQ)* – Default 100. Max 10,000.
     * * *DocumentDB* – Default 100. Max 10,000.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     */
    override fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     */
    override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     */
    override fun documentDbEventSourceConfig(): Any? = unwrap(this).getDocumentDbEventSourceConfig()

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * * *Amazon Kinesis* – The ARN of the data stream or a stream consumer.
     * * *Amazon DynamoDB Streams* – The ARN of the stream.
     * * *Amazon Simple Queue Service* – The ARN of the queue.
     * * *Amazon Managed Streaming for Apache Kafka* – The ARN of the cluster or the ARN of the VPC
     * connection (for [cross-account event source
     * mappings](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#msk-multi-vpc) ).
     * * *Amazon MQ* – The ARN of the broker.
     * * *Amazon DocumentDB* – The ARN of the DocumentDB change stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
     */
    override fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     */
    override fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

    /**
     * The name of the Lambda function.
     *
     * **Name formats** - *Function name* – `MyFunction` .
     *
     * * *Function ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction` .
     * * *Version or Alias ARN* – `arn:aws:lambda:us-west-2:123456789012:function:MyFunction:PROD` .
     * * *Partial ARN* – `123456789012:function:MyFunction` .
     *
     * The length constraint applies only to the full ARN. If you specify only the function name,
     * it's limited to 64 characters in length.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     */
    override fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
        emptyList()

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
     */
    override fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * (Kinesis and DynamoDB Streams only) Discard records older than the specified age.
     *
     * The default value is -1,
     * which sets the maximum age to infinite. When the value is set to infinite, Lambda never
     * discards old records.
     *
     *
     * The minimum valid value for maximum record age is 60s. Although values less than 60 and
     * greater than -1 fall within the parameter's absolute range, they are not allowed
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
     */
    override fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    /**
     * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
     *
     * The default value is -1,
     * which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite,
     * Lambda retries failed records until the record expires in the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     */
    override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
     * shard.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     */
    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     */
    override fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     */
    override fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     */
    override fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     */
    override fun selfManagedKafkaEventSourceConfig(): Any? =
        unwrap(this).getSelfManagedKafkaEventSourceConfig()

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     */
    override fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

    /**
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon
     * DynamoDB.
     *
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     */
    override fun startingPosition(): String? = unwrap(this).getStartingPosition()

    /**
     * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
     * time seconds.
     *
     * `StartingPositionTimestamp` cannot be in the future.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     */
    override fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     */
    override fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

    /**
     * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for
     * DynamoDB and Kinesis Streams event sources.
     *
     * A value of 0 seconds indicates no tumbling window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
     */
    override fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEventSourceMappingProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps):
        CfnEventSourceMappingProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnEventSourceMappingProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEventSourceMappingProps):
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
  }
}
