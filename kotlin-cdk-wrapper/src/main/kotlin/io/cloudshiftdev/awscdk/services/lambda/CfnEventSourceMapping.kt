@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
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
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Lambda::EventSourceMapping` resource creates a mapping between an event source and an
 * AWS Lambda function.
 *
 * Lambda reads items from the event source and triggers the function.
 *
 * For details about each event source type, see the following topics. In particular, each of the
 * topics describes the required and optional parameters for the specific event source.
 *
 * * [Configuring a Dynamo DB stream as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html#services-dynamodb-eventsourcemapping)
 * * [Configuring a Kinesis stream as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html#services-kinesis-eventsourcemapping)
 * * [Configuring an SQS queue as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-eventsource)
 * * [Configuring an MQ broker as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/with-mq.html#services-mq-eventsourcemapping)
 * * [Configuring MSK as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html)
 * * [Configuring Self-Managed Apache Kafka as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/kafka-smaa.html)
 * * [Configuring Amazon DocumentDB as an event
 * source](https://docs.aws.amazon.com/lambda/latest/dg/with-documentdb.html)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
public open class CfnEventSourceMapping(
  cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSourceMappingProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnEventSourceMapping(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnEventSourceMappingProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSourceMappingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventSourceMappingProps(props)
  )

  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   */
  public open fun amazonManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getAmazonManagedKafkaEventSourceConfig()

  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   */
  public open fun amazonManagedKafkaEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   */
  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(AmazonManagedKafkaEventSourceConfigProperty::unwrap))
  }

  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0546eaf5ec0de25dc1ef0f4eff69e33135c5ee55d069c75ed61f58ff872041ff")
  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
      Unit =
      amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty(`value`))

  /**
   * The event source mapping's ID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The maximum number of records in each batch that Lambda pulls from your stream or queue and
   * sends to your function.
   */
  public open fun batchSize(): Number? = unwrap(this).getBatchSize()

  /**
   * The maximum number of records in each batch that Lambda pulls from your stream or queue and
   * sends to your function.
   */
  public open fun batchSize(`value`: Number) {
    unwrap(this).setBatchSize(`value`)
  }

  /**
   * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
   * and retry.
   */
  public open fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

  /**
   * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
   * and retry.
   */
  public open fun bisectBatchOnFunctionError(`value`: Boolean) {
    unwrap(this).setBisectBatchOnFunctionError(`value`)
  }

  /**
   * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
   * and retry.
   */
  public open fun bisectBatchOnFunctionError(`value`: IResolvable) {
    unwrap(this).setBisectBatchOnFunctionError(`value`.let(IResolvable::unwrap))
  }

  /**
   * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
   * configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  /**
   * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
   * configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(`value`: IResolvable) {
    unwrap(this).setDestinationConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
   * configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(`value`: DestinationConfigProperty) {
    unwrap(this).setDestinationConfig(`value`.let(DestinationConfigProperty::unwrap))
  }

  /**
   * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
   * configuration object that specifies the destination of an event after Lambda processes it.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e0727d1f2ac82afd02c9afa0002bf881a9e6a16e5e752856fc1a751310a91530")
  public open fun destinationConfig(`value`: DestinationConfigProperty.Builder.() -> Unit): Unit =
      destinationConfig(DestinationConfigProperty(`value`))

  /**
   * Specific configuration settings for a DocumentDB event source.
   */
  public open fun documentDbEventSourceConfig(): Any? =
      unwrap(this).getDocumentDbEventSourceConfig()

  /**
   * Specific configuration settings for a DocumentDB event source.
   */
  public open fun documentDbEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specific configuration settings for a DocumentDB event source.
   */
  public open fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(DocumentDBEventSourceConfigProperty::unwrap))
  }

  /**
   * Specific configuration settings for a DocumentDB event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b5d7540aaff5f4c337bd3e3c466ea3553153047b3199251b7d4dc6152d421f8")
  public open
      fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
      Unit = documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty(`value`))

  /**
   * When true, the event source mapping is active.
   *
   * When false, Lambda pauses polling and invocation.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * When true, the event source mapping is active.
   *
   * When false, Lambda pauses polling and invocation.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * When true, the event source mapping is active.
   *
   * When false, Lambda pauses polling and invocation.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the event source.
   */
  public open fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

  /**
   * The Amazon Resource Name (ARN) of the event source.
   */
  public open fun eventSourceArn(`value`: String) {
    unwrap(this).setEventSourceArn(`value`)
  }

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  public open fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  public open fun filterCriteria(`value`: IResolvable) {
    unwrap(this).setFilterCriteria(`value`.let(IResolvable::unwrap))
  }

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  public open fun filterCriteria(`value`: FilterCriteriaProperty) {
    unwrap(this).setFilterCriteria(`value`.let(FilterCriteriaProperty::unwrap))
  }

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc31923467be09d3b1d86cf808a6a14758970152c4f89da54949ef9fb9cf1dd8")
  public open fun filterCriteria(`value`: FilterCriteriaProperty.Builder.() -> Unit): Unit =
      filterCriteria(FilterCriteriaProperty(`value`))

  /**
   * The name or ARN of the Lambda function.
   */
  public open fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * The name or ARN of the Lambda function.
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   * (Streams and SQS) A list of current response type enums applied to the event source mapping.
   */
  public open fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

  /**
   * (Streams and SQS) A list of current response type enums applied to the event source mapping.
   */
  public open fun functionResponseTypes(`value`: List<String>) {
    unwrap(this).setFunctionResponseTypes(`value`)
  }

  /**
   * (Streams and SQS) A list of current response type enums applied to the event source mapping.
   */
  public open fun functionResponseTypes(vararg `value`: String): Unit =
      functionResponseTypes(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The maximum amount of time, in seconds, that Lambda spends gathering records before invoking
   * the function.
   */
  public open fun maximumBatchingWindowInSeconds(): Number? =
      unwrap(this).getMaximumBatchingWindowInSeconds()

  /**
   * The maximum amount of time, in seconds, that Lambda spends gathering records before invoking
   * the function.
   */
  public open fun maximumBatchingWindowInSeconds(`value`: Number) {
    unwrap(this).setMaximumBatchingWindowInSeconds(`value`)
  }

  /**
   * (Kinesis and DynamoDB Streams only) Discard records older than the specified age.
   */
  public open fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

  /**
   * (Kinesis and DynamoDB Streams only) Discard records older than the specified age.
   */
  public open fun maximumRecordAgeInSeconds(`value`: Number) {
    unwrap(this).setMaximumRecordAgeInSeconds(`value`)
  }

  /**
   * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
   */
  public open fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  /**
   * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
   */
  public open fun maximumRetryAttempts(`value`: Number) {
    unwrap(this).setMaximumRetryAttempts(`value`)
  }

  /**
   * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
   * shard.
   */
  public open fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  /**
   * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
   * shard.
   */
  public open fun parallelizationFactor(`value`: Number) {
    unwrap(this).setParallelizationFactor(`value`)
  }

  /**
   * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
   */
  public open fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

  /**
   * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
   */
  public open fun queues(`value`: List<String>) {
    unwrap(this).setQueues(`value`)
  }

  /**
   * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
   */
  public open fun queues(vararg `value`: String): Unit = queues(`value`.toList())

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   */
  public open fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   */
  public open fun scalingConfig(`value`: IResolvable) {
    unwrap(this).setScalingConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   */
  public open fun scalingConfig(`value`: ScalingConfigProperty) {
    unwrap(this).setScalingConfig(`value`.let(ScalingConfigProperty::unwrap))
  }

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7f38e41aa1e31160bdb25d297001323779fbc20a75f265e5d9d84a5dde4abf8")
  public open fun scalingConfig(`value`: ScalingConfigProperty.Builder.() -> Unit): Unit =
      scalingConfig(ScalingConfigProperty(`value`))

  /**
   * The self-managed Apache Kafka cluster for your event source.
   */
  public open fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

  /**
   * The self-managed Apache Kafka cluster for your event source.
   */
  public open fun selfManagedEventSource(`value`: IResolvable) {
    unwrap(this).setSelfManagedEventSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The self-managed Apache Kafka cluster for your event source.
   */
  public open fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty) {
    unwrap(this).setSelfManagedEventSource(`value`.let(SelfManagedEventSourceProperty::unwrap))
  }

  /**
   * The self-managed Apache Kafka cluster for your event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ded22c9cf40efe353eb906200eb2e3d2b16224de530e6e175fb9f5582fbcd80a")
  public open
      fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty.Builder.() -> Unit): Unit =
      selfManagedEventSource(SelfManagedEventSourceProperty(`value`))

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   */
  public open fun selfManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getSelfManagedKafkaEventSourceConfig()

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   */
  public open fun selfManagedKafkaEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   */
  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(SelfManagedKafkaEventSourceConfigProperty::unwrap))
  }

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a57a37ea1790f9844a931862b87c174d0128222ac406a0c5f427e774c75f2e6")
  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
      Unit = selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty(`value`))

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   */
  public open fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   */
  public open fun sourceAccessConfigurations(`value`: IResolvable) {
    unwrap(this).setSourceAccessConfigurations(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   */
  public open fun sourceAccessConfigurations(`value`: List<Any>) {
    unwrap(this).setSourceAccessConfigurations(`value`)
  }

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   */
  public open fun sourceAccessConfigurations(vararg `value`: Any): Unit =
      sourceAccessConfigurations(`value`.toList())

  /**
   * The position in a stream from which to start reading.
   *
   * Required for Amazon Kinesis and Amazon DynamoDB.
   */
  public open fun startingPosition(): String? = unwrap(this).getStartingPosition()

  /**
   * The position in a stream from which to start reading.
   *
   * Required for Amazon Kinesis and Amazon DynamoDB.
   */
  public open fun startingPosition(`value`: String) {
    unwrap(this).setStartingPosition(`value`)
  }

  /**
   * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
   * time seconds.
   */
  public open fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  /**
   * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
   * time seconds.
   */
  public open fun startingPositionTimestamp(`value`: Number) {
    unwrap(this).setStartingPositionTimestamp(`value`)
  }

  /**
   * The name of the Kafka topic.
   */
  public open fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  /**
   * The name of the Kafka topic.
   */
  public open fun topics(`value`: List<String>) {
    unwrap(this).setTopics(`value`)
  }

  /**
   * The name of the Kafka topic.
   */
  public open fun topics(vararg `value`: String): Unit = topics(`value`.toList())

  /**
   * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for DynamoDB
   * and Kinesis Streams event sources.
   */
  public open fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()

  /**
   * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for DynamoDB
   * and Kinesis Streams event sources.
   */
  public open fun tumblingWindowInSeconds(`value`: Number) {
    unwrap(this).setTumblingWindowInSeconds(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lambda.CfnEventSourceMapping].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source. 
     */
    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable)

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source. 
     */
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty)

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a18729a436a40c6ab3d5a14bf28967743c4f06ebf58a4c3399a07176c1be7fa")
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

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
     * @param batchSize The maximum number of records in each batch that Lambda pulls from your
     * stream or queue and sends to your function. 
     */
    public fun batchSize(batchSize: Number)

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry. 
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry. 
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    public fun destinationConfig(destinationConfig: IResolvable)

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    public fun destinationConfig(destinationConfig: DestinationConfigProperty)

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1365091f9febe46c1e47ec28c4a9206a26547b34731f5baf261a0af4eaa6b6")
    public fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit)

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source. 
     */
    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable)

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source. 
     */
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty)

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3b3fe70f00ec954d7ece91179c11a46159eb84371098c41dbdad143a0d405a0")
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation. 
     */
    public fun enabled(enabled: IResolvable)

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
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
     */
    public fun eventSourceArn(eventSourceArn: String)

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event. 
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event. 
     */
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty)

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916dc1790836cb4d0d61fbac02ff601607532a144ed6fba129679e6bf27e1e3c")
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * The name or ARN of the Lambda function.
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
     * @param functionName The name or ARN of the Lambda function. 
     */
    public fun functionName(functionName: String)

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping. 
     */
    public fun functionResponseTypes(functionResponseTypes: List<String>)

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping. 
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String)

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
     * @param maximumBatchingWindowInSeconds The maximum amount of time, in seconds, that Lambda
     * spends gathering records before invoking the function. 
     */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

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
     * @param maximumRecordAgeInSeconds (Kinesis and DynamoDB Streams only) Discard records older
     * than the specified age. 
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

    /**
     * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
     *
     * The default value is -1,
     * which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite,
     * Lambda retries failed records until the record expires in the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     * @param maximumRetryAttempts (Kinesis and DynamoDB Streams only) Discard records after the
     * specified number of retries. 
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    /**
     * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
     * shard.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     * @param parallelizationFactor (Kinesis and DynamoDB Streams only) The number of batches to
     * process concurrently from each shard. 
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume. 
     */
    public fun queues(queues: List<String>)

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume. 
     */
    public fun queues(vararg queues: String)

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. 
     */
    public fun scalingConfig(scalingConfig: IResolvable)

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. 
     */
    public fun scalingConfig(scalingConfig: ScalingConfigProperty)

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3b9f703fbf78497da8a3697e58d20913edff366643d85f736a432c376080e")
    public fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit)

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    public fun selfManagedEventSource(selfManagedEventSource: IResolvable)

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    public fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty)

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("338dd05b1ecb9f9b6cac5db40b22f8a8756113fd3faf8ec5704f4aa12283dda4")
    public
        fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty.Builder.() -> Unit)

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source. 
     */
    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable)

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source. 
     */
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty)

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98f5b4474f72c44225b79c9d86688eedd8ec8f540ead775e215a15e7562423d3")
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source. 
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable)

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source. 
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>)

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source. 
     */
    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any)

    /**
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon
     * DynamoDB.
     *
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     * @param startingPosition The position in a stream from which to start reading. Required for
     * Amazon Kinesis and Amazon DynamoDB. 
     */
    public fun startingPosition(startingPosition: String)

    /**
     * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
     * time seconds.
     *
     * `StartingPositionTimestamp` cannot be in the future.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     * from which to start reading, in Unix time seconds. 
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics The name of the Kafka topic. 
     */
    public fun topics(topics: List<String>)

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics The name of the Kafka topic. 
     */
    public fun topics(vararg topics: String)

    /**
     * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for
     * DynamoDB and Kinesis Streams event sources.
     *
     * A value of 0 seconds indicates no tumbling window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
     * @param tumblingWindowInSeconds (Kinesis and DynamoDB Streams only) The duration in seconds of
     * a processing window for DynamoDB and Kinesis Streams event sources. 
     */
    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.Builder =
        software.amazon.awscdk.services.lambda.CfnEventSourceMapping.Builder.create(scope, id)

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source. 
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source. 
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(AmazonManagedKafkaEventSourceConfigProperty::unwrap))
    }

    /**
     * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
     * event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an Amazon
     * Managed Streaming for Apache Kafka (Amazon MSK) event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a18729a436a40c6ab3d5a14bf28967743c4f06ebf58a4c3399a07176c1be7fa")
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty(amazonManagedKafkaEventSourceConfig))

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
     * @param batchSize The maximum number of records in each batch that Lambda pulls from your
     * stream or queue and sends to your function. 
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry. 
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * (Kinesis and DynamoDB Streams only) If the function returns an error, split the batch in two
     * and retry.
     *
     * The default value is false.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry. 
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable::unwrap))
    }

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable::unwrap))
    }

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty::unwrap))
    }

    /**
     * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
     * configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache
     * Kafka event sources only) A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1365091f9febe46c1e47ec28c4a9206a26547b34731f5baf261a0af4eaa6b6")
    override fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source. 
     */
    override fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source. 
     */
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(DocumentDBEventSourceConfigProperty::unwrap))
    }

    /**
     * Specific configuration settings for a DocumentDB event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Specific configuration settings for a DocumentDB event
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3b3fe70f00ec954d7ece91179c11a46159eb84371098c41dbdad143a0d405a0")
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty(documentDbEventSourceConfig))

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * When true, the event source mapping is active. When false, Lambda pauses polling and
     * invocation.
     *
     * Default: True
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled When true, the event source mapping is active. When false, Lambda pauses
     * polling and invocation. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

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
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
     */
    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event. 
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable::unwrap))
    }

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event. 
     */
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty::unwrap))
    }

    /**
     * An object that defines the filter criteria that determine whether Lambda should process an
     * event.
     *
     * For more information, see [Lambda event
     * filtering](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria An object that defines the filter criteria that determine whether
     * Lambda should process an event. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916dc1790836cb4d0d61fbac02ff601607532a144ed6fba129679e6bf27e1e3c")
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit): Unit =
        filterCriteria(FilterCriteriaProperty(filterCriteria))

    /**
     * The name or ARN of the Lambda function.
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
     * @param functionName The name or ARN of the Lambda function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping. 
     */
    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    /**
     * (Streams and SQS) A list of current response type enums applied to the event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams and SQS) A list of current response type enums applied
     * to the event source mapping. 
     */
    override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
        functionResponseTypes(functionResponseTypes.toList())

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
     * @param maximumBatchingWindowInSeconds The maximum amount of time, in seconds, that Lambda
     * spends gathering records before invoking the function. 
     */
    override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

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
     * @param maximumRecordAgeInSeconds (Kinesis and DynamoDB Streams only) Discard records older
     * than the specified age. 
     */
    override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * (Kinesis and DynamoDB Streams only) Discard records after the specified number of retries.
     *
     * The default value is -1,
     * which sets the maximum number of retries to infinite. When MaximumRetryAttempts is infinite,
     * Lambda retries failed records until the record expires in the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     * @param maximumRetryAttempts (Kinesis and DynamoDB Streams only) Discard records after the
     * specified number of retries. 
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * (Kinesis and DynamoDB Streams only) The number of batches to process concurrently from each
     * shard.
     *
     * The default value is 1.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     * @param parallelizationFactor (Kinesis and DynamoDB Streams only) The number of batches to
     * process concurrently from each shard. 
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume. 
     */
    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    /**
     * (Amazon MQ) The name of the Amazon MQ broker destination queue to consume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (Amazon MQ) The name of the Amazon MQ broker destination queue to consume. 
     */
    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. 
     */
    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable::unwrap))
    }

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. 
     */
    override fun scalingConfig(scalingConfig: ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(ScalingConfigProperty::unwrap))
    }

    /**
     * (Amazon SQS only) The scaling configuration for the event source.
     *
     * For more information, see [Configuring maximum concurrency for Amazon SQS event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html#events-sqs-max-concurrency)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig (Amazon SQS only) The scaling configuration for the event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3b9f703fbf78497da8a3697e58d20913edff366643d85f736a432c376080e")
    override fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit): Unit =
        scalingConfig(ScalingConfigProperty(scalingConfig))

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    override fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable::unwrap))
    }

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    override fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(SelfManagedEventSourceProperty::unwrap))
    }

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("338dd05b1ecb9f9b6cac5db40b22f8a8756113fd3faf8ec5704f4aa12283dda4")
    override
        fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty.Builder.() -> Unit):
        Unit = selfManagedEventSource(SelfManagedEventSourceProperty(selfManagedEventSource))

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source. 
     */
    override fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable::unwrap))
    }

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source. 
     */
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(SelfManagedKafkaEventSourceConfigProperty::unwrap))
    }

    /**
     * Specific configuration settings for a self-managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a self-managed
     * Apache Kafka event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98f5b4474f72c44225b79c9d86688eedd8ec8f540ead775e215a15e7562423d3")
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty(selfManagedKafkaEventSourceConfig))

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source. 
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable::unwrap))
    }

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source. 
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations)
    }

    /**
     * An array of the authentication protocol, VPC components, or virtual host to secure and define
     * your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations An array of the authentication protocol, VPC components, or
     * virtual host to secure and define your event source. 
     */
    override fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    /**
     * The position in a stream from which to start reading. Required for Amazon Kinesis and Amazon
     * DynamoDB.
     *
     * * *LATEST* - Read only new records.
     * * *TRIM_HORIZON* - Process all available records.
     * * *AT_TIMESTAMP* - Specify a time from which to start reading records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     * @param startingPosition The position in a stream from which to start reading. Required for
     * Amazon Kinesis and Amazon DynamoDB. 
     */
    override fun startingPosition(startingPosition: String) {
      cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * With `StartingPosition` set to `AT_TIMESTAMP` , the time from which to start reading, in Unix
     * time seconds.
     *
     * `StartingPositionTimestamp` cannot be in the future.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     * @param startingPositionTimestamp With `StartingPosition` set to `AT_TIMESTAMP` , the time
     * from which to start reading, in Unix time seconds. 
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics The name of the Kafka topic. 
     */
    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    /**
     * The name of the Kafka topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics The name of the Kafka topic. 
     */
    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    /**
     * (Kinesis and DynamoDB Streams only) The duration in seconds of a processing window for
     * DynamoDB and Kinesis Streams event sources.
     *
     * A value of 0 seconds indicates no tumbling window.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
     * @param tumblingWindowInSeconds (Kinesis and DynamoDB Streams only) The duration in seconds of
     * a processing window for DynamoDB and Kinesis Streams event sources. 
     */
    override fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
      cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventSourceMapping =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lambda.CfnEventSourceMapping.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnEventSourceMapping {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnEventSourceMapping(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping):
        CfnEventSourceMapping = CfnEventSourceMapping(cdkObject)

    internal fun unwrap(wrapped: CfnEventSourceMapping):
        software.amazon.awscdk.services.lambda.CfnEventSourceMapping = wrapped.cdkObject as
        software.amazon.awscdk.services.lambda.CfnEventSourceMapping
  }

  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * AmazonManagedKafkaEventSourceConfigProperty amazonManagedKafkaEventSourceConfigProperty =
   * AmazonManagedKafkaEventSourceConfigProperty.builder()
   * .consumerGroupId("consumerGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig.html)
   */
  public interface AmazonManagedKafkaEventSourceConfigProperty {
    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig-consumergroupid)
     */
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    /**
     * A builder for [AmazonManagedKafkaEventSourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param consumerGroupId The identifier for the Kafka consumer group to join.
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
       * .
       */
      public fun consumerGroupId(consumerGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.builder()

      /**
       * @param consumerGroupId The identifier for the Kafka consumer group to join.
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
       * .
       */
      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty,
    ) : CdkObject(cdkObject), AmazonManagedKafkaEventSourceConfigProperty {
      /**
       * The identifier for the Kafka consumer group to join.
       *
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig-consumergroupid)
       */
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonManagedKafkaEventSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty):
          AmazonManagedKafkaEventSourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmazonManagedKafkaEventSourceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonManagedKafkaEventSourceConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
    }
  }

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * DestinationConfigProperty destinationConfigProperty = DestinationConfigProperty.builder()
   * .onFailure(OnFailureProperty.builder()
   * .destination("destination")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-destinationconfig.html)
   */
  public interface DestinationConfigProperty {
    /**
     * The destination configuration for failed invocations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-destinationconfig.html#cfn-lambda-eventsourcemapping-destinationconfig-onfailure)
     */
    public fun onFailure(): Any? = unwrap(this).getOnFailure()

    /**
     * A builder for [DestinationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      public fun onFailure(onFailure: IResolvable)

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      public fun onFailure(onFailure: OnFailureProperty)

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("284a94b85ae136287cec3526f52f06be29bceaf51b2211a83f73e8de76313ce2")
      public fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty.builder()

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable::unwrap))
      }

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      override fun onFailure(onFailure: OnFailureProperty) {
        cdkBuilder.onFailure(onFailure.let(OnFailureProperty::unwrap))
      }

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("284a94b85ae136287cec3526f52f06be29bceaf51b2211a83f73e8de76313ce2")
      override fun onFailure(onFailure: OnFailureProperty.Builder.() -> Unit): Unit =
          onFailure(OnFailureProperty(onFailure))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty,
    ) : CdkObject(cdkObject), DestinationConfigProperty {
      /**
       * The destination configuration for failed invocations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-destinationconfig.html#cfn-lambda-eventsourcemapping-destinationconfig-onfailure)
       */
      override fun onFailure(): Any? = unwrap(this).getOnFailure()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DestinationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty):
          DestinationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DestinationConfigProperty
    }
  }

  /**
   * Specific configuration settings for a DocumentDB event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * DocumentDBEventSourceConfigProperty documentDBEventSourceConfigProperty =
   * DocumentDBEventSourceConfigProperty.builder()
   * .collectionName("collectionName")
   * .databaseName("databaseName")
   * .fullDocument("fullDocument")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html)
   */
  public interface DocumentDBEventSourceConfigProperty {
    /**
     * The name of the collection to consume within the database.
     *
     * If you do not specify a collection, Lambda consumes all collections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-collectionname)
     */
    public fun collectionName(): String? = unwrap(this).getCollectionName()

    /**
     * The name of the database to consume within the DocumentDB cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Determines what DocumentDB sends to your event stream during document update operations.
     *
     * If set to UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy of
     * the entire document. Otherwise, DocumentDB sends only a partial document that contains the
     * changes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-fulldocument)
     */
    public fun fullDocument(): String? = unwrap(this).getFullDocument()

    /**
     * A builder for [DocumentDBEventSourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param collectionName The name of the collection to consume within the database.
       * If you do not specify a collection, Lambda consumes all collections.
       */
      public fun collectionName(collectionName: String)

      /**
       * @param databaseName The name of the database to consume within the DocumentDB cluster.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param fullDocument Determines what DocumentDB sends to your event stream during document
       * update operations.
       * If set to UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy
       * of the entire document. Otherwise, DocumentDB sends only a partial document that contains the
       * changes.
       */
      public fun fullDocument(fullDocument: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.builder()

      /**
       * @param collectionName The name of the collection to consume within the database.
       * If you do not specify a collection, Lambda consumes all collections.
       */
      override fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
      }

      /**
       * @param databaseName The name of the database to consume within the DocumentDB cluster.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param fullDocument Determines what DocumentDB sends to your event stream during document
       * update operations.
       * If set to UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy
       * of the entire document. Otherwise, DocumentDB sends only a partial document that contains the
       * changes.
       */
      override fun fullDocument(fullDocument: String) {
        cdkBuilder.fullDocument(fullDocument)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty,
    ) : CdkObject(cdkObject), DocumentDBEventSourceConfigProperty {
      /**
       * The name of the collection to consume within the database.
       *
       * If you do not specify a collection, Lambda consumes all collections.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-collectionname)
       */
      override fun collectionName(): String? = unwrap(this).getCollectionName()

      /**
       * The name of the database to consume within the DocumentDB cluster.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Determines what DocumentDB sends to your event stream during document update operations.
       *
       * If set to UpdateLookup, DocumentDB sends a delta describing the changes, along with a copy
       * of the entire document. Otherwise, DocumentDB sends only a partial document that contains the
       * changes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-fulldocument)
       */
      override fun fullDocument(): String? = unwrap(this).getFullDocument()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentDBEventSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty):
          DocumentDBEventSourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentDBEventSourceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentDBEventSourceConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty
    }
  }

  /**
   * The list of bootstrap servers for your Kafka brokers in the following format:
   * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * EndpointsProperty endpointsProperty = EndpointsProperty.builder()
   * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-endpoints.html)
   */
  public interface EndpointsProperty {
    /**
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-endpoints.html#cfn-lambda-eventsourcemapping-endpoints-kafkabootstrapservers)
     */
    public fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers() ?:
        emptyList()

    /**
     * A builder for [EndpointsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kafkaBootstrapServers The list of bootstrap servers for your Kafka brokers in the
       * following format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)

      /**
       * @param kafkaBootstrapServers The list of bootstrap servers for your Kafka brokers in the
       * following format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.builder()

      /**
       * @param kafkaBootstrapServers The list of bootstrap servers for your Kafka brokers in the
       * following format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
        cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
      }

      /**
       * @param kafkaBootstrapServers The list of bootstrap servers for your Kafka brokers in the
       * following format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      override fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String): Unit =
          kafkaBootstrapServers(kafkaBootstrapServers.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty,
    ) : CdkObject(cdkObject), EndpointsProperty {
      /**
       * The list of bootstrap servers for your Kafka brokers in the following format:
       * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-endpoints.html#cfn-lambda-eventsourcemapping-endpoints-kafkabootstrapservers)
       */
      override fun kafkaBootstrapServers(): List<String> = unwrap(this).getKafkaBootstrapServers()
          ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty):
          EndpointsProperty = CdkObjectWrappers.wrap(cdkObject) as? EndpointsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointsProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty
    }
  }

  /**
   * An object that contains the filters for an event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * FilterCriteriaProperty filterCriteriaProperty = FilterCriteriaProperty.builder()
   * .filters(List.of(FilterProperty.builder()
   * .pattern("pattern")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filtercriteria.html)
   */
  public interface FilterCriteriaProperty {
    /**
     * A list of filters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filtercriteria.html#cfn-lambda-eventsourcemapping-filtercriteria-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * A builder for [FilterCriteriaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filters A list of filters.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters A list of filters.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters A list of filters.
       */
      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty.builder()

      /**
       * @param filters A list of filters.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      /**
       * @param filters A list of filters.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      /**
       * @param filters A list of filters.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty,
    ) : CdkObject(cdkObject), FilterCriteriaProperty {
      /**
       * A list of filters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filtercriteria.html#cfn-lambda-eventsourcemapping-filtercriteria-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty):
          FilterCriteriaProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterCriteriaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterCriteriaProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty
    }
  }

  /**
   * A structure within a `FilterCriteria` object that defines an event filtering pattern.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * FilterProperty filterProperty = FilterProperty.builder()
   * .pattern("pattern")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filter.html)
   */
  public interface FilterProperty {
    /**
     * A filter pattern.
     *
     * For more information on the syntax of a filter pattern, see [Filter rule
     * syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filter.html#cfn-lambda-eventsourcemapping-filter-pattern)
     */
    public fun pattern(): String? = unwrap(this).getPattern()

    /**
     * A builder for [FilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param pattern A filter pattern.
       * For more information on the syntax of a filter pattern, see [Filter rule
       * syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax)
       * .
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty.builder()

      /**
       * @param pattern A filter pattern.
       * For more information on the syntax of a filter pattern, see [Filter rule
       * syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax)
       * .
       */
      override fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty,
    ) : CdkObject(cdkObject), FilterProperty {
      /**
       * A filter pattern.
       *
       * For more information on the syntax of a filter pattern, see [Filter rule
       * syntax](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-syntax)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-filter.html#cfn-lambda-eventsourcemapping-filter-pattern)
       */
      override fun pattern(): String? = unwrap(this).getPattern()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty):
          FilterProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty
    }
  }

  /**
   * A destination for events that failed processing.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * OnFailureProperty onFailureProperty = OnFailureProperty.builder()
   * .destination("destination")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html)
   */
  public interface OnFailureProperty {
    /**
     * The Amazon Resource Name (ARN) of the destination resource.
     *
     * To retain records of [asynchronous
     * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
     * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
     * EventBridge event bus as the destination.
     *
     * To retain records of failed invocations from [Kinesis and DynamoDB event
     * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
     * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
     *
     * To retain records of failed invocations from [self-managed
     * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
     * or [Amazon
     * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
     * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
     * destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html#cfn-lambda-eventsourcemapping-onfailure-destination)
     */
    public fun destination(): String? = unwrap(this).getDestination()

    /**
     * A builder for [OnFailureProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource.
       * To retain records of [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
       * EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from [Kinesis and DynamoDB event
       * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
       * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
       *
       * To retain records of failed invocations from [self-managed
       * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
       * or [Amazon
       * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
       * destination.
       */
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.builder()

      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource.
       * To retain records of [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
       * EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from [Kinesis and DynamoDB event
       * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
       * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
       *
       * To retain records of failed invocations from [self-managed
       * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
       * or [Amazon
       * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
       * destination.
       */
      override fun destination(destination: String) {
        cdkBuilder.destination(destination)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty,
    ) : CdkObject(cdkObject), OnFailureProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination resource.
       *
       * To retain records of [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Lambda function, or Amazon
       * EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from [Kinesis and DynamoDB event
       * sources](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#event-source-mapping-destinations)
       * , you can configure an Amazon SNS topic or Amazon SQS queue as the destination.
       *
       * To retain records of failed invocations from [self-managed
       * Kafka](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka.html#services-smaa-onfailure-destination)
       * or [Amazon
       * MSK](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-onfailure-destination)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, or Amazon S3 bucket as the
       * destination.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html#cfn-lambda-eventsourcemapping-onfailure-destination)
       */
      override fun destination(): String? = unwrap(this).getDestination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): OnFailureProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty):
          OnFailureProperty = CdkObjectWrappers.wrap(cdkObject) as? OnFailureProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: OnFailureProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty
    }
  }

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   *
   * To remove the configuration, pass an empty value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * ScalingConfigProperty scalingConfigProperty = ScalingConfigProperty.builder()
   * .maximumConcurrency(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-scalingconfig.html)
   */
  public interface ScalingConfigProperty {
    /**
     * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-scalingconfig.html#cfn-lambda-eventsourcemapping-scalingconfig-maximumconcurrency)
     */
    public fun maximumConcurrency(): Number? = unwrap(this).getMaximumConcurrency()

    /**
     * A builder for [ScalingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumConcurrency Limits the number of concurrent instances that the Amazon SQS
       * event source can invoke.
       */
      public fun maximumConcurrency(maximumConcurrency: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty.builder()

      /**
       * @param maximumConcurrency Limits the number of concurrent instances that the Amazon SQS
       * event source can invoke.
       */
      override fun maximumConcurrency(maximumConcurrency: Number) {
        cdkBuilder.maximumConcurrency(maximumConcurrency)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty,
    ) : CdkObject(cdkObject), ScalingConfigProperty {
      /**
       * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-scalingconfig.html#cfn-lambda-eventsourcemapping-scalingconfig-maximumconcurrency)
       */
      override fun maximumConcurrency(): Number? = unwrap(this).getMaximumConcurrency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ScalingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty):
          ScalingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? ScalingConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScalingConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty
    }
  }

  /**
   * The self-managed Apache Kafka cluster for your event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SelfManagedEventSourceProperty selfManagedEventSourceProperty =
   * SelfManagedEventSourceProperty.builder()
   * .endpoints(EndpointsProperty.builder()
   * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedeventsource.html)
   */
  public interface SelfManagedEventSourceProperty {
    /**
     * The list of bootstrap servers for your Kafka brokers in the following format:
     * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedeventsource.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource-endpoints)
     */
    public fun endpoints(): Any? = unwrap(this).getEndpoints()

    /**
     * A builder for [SelfManagedEventSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      public fun endpoints(endpoints: IResolvable)

      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      public fun endpoints(endpoints: EndpointsProperty)

      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e698f9f1f113c096b2840307c27cfc7d5cb23bd03b30dc2ed0d25276ace3f91")
      public fun endpoints(endpoints: EndpointsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty.builder()

      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      override fun endpoints(endpoints: IResolvable) {
        cdkBuilder.endpoints(endpoints.let(IResolvable::unwrap))
      }

      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      override fun endpoints(endpoints: EndpointsProperty) {
        cdkBuilder.endpoints(endpoints.let(EndpointsProperty::unwrap))
      }

      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e698f9f1f113c096b2840307c27cfc7d5cb23bd03b30dc2ed0d25276ace3f91")
      override fun endpoints(endpoints: EndpointsProperty.Builder.() -> Unit): Unit =
          endpoints(EndpointsProperty(endpoints))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty,
    ) : CdkObject(cdkObject), SelfManagedEventSourceProperty {
      /**
       * The list of bootstrap servers for your Kafka brokers in the following format:
       * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedeventsource.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource-endpoints)
       */
      override fun endpoints(): Any? = unwrap(this).getEndpoints()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SelfManagedEventSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty):
          SelfManagedEventSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SelfManagedEventSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedEventSourceProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedEventSourceProperty
    }
  }

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SelfManagedKafkaEventSourceConfigProperty selfManagedKafkaEventSourceConfigProperty =
   * SelfManagedKafkaEventSourceConfigProperty.builder()
   * .consumerGroupId("consumerGroupId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
   */
  public interface SelfManagedKafkaEventSourceConfigProperty {
    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
     * For more information, see [Customizable consumer group
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig-consumergroupid)
     */
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    /**
     * A builder for [SelfManagedKafkaEventSourceConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param consumerGroupId The identifier for the Kafka consumer group to join.
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
       * .
       */
      public fun consumerGroupId(consumerGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder()

      /**
       * @param consumerGroupId The identifier for the Kafka consumer group to join.
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
       * .
       */
      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty,
    ) : CdkObject(cdkObject), SelfManagedKafkaEventSourceConfigProperty {
      /**
       * The identifier for the Kafka consumer group to join.
       *
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig-consumergroupid)
       */
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SelfManagedKafkaEventSourceConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty):
          SelfManagedKafkaEventSourceConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SelfManagedKafkaEventSourceConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelfManagedKafkaEventSourceConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
    }
  }

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SourceAccessConfigurationProperty sourceAccessConfigurationProperty =
   * SourceAccessConfigurationProperty.builder()
   * .type("type")
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html)
   */
  public interface SourceAccessConfigurationProperty {
    /**
     * The type of authentication protocol, VPC components, or virtual host for your event source.
     * For example: `"Type":"SASL_SCRAM_512_AUTH"` .
     *
     * * `BASIC_AUTH` – (Amazon MQ) The AWS Secrets Manager secret that stores your broker
     * credentials.
     * * `BASIC_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your secret key used
     * for SASL/PLAIN authentication of your Apache Kafka brokers.
     * * `VPC_SUBNET` – (Self-managed Apache Kafka) The subnets associated with your VPC. Lambda
     * connects to these subnets to fetch data from your self-managed Apache Kafka cluster.
     * * `VPC_SECURITY_GROUP` – (Self-managed Apache Kafka) The VPC security group used to manage
     * access to your self-managed Apache Kafka brokers.
     * * `SASL_SCRAM_256_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your secret
     * key used for SASL SCRAM-256 authentication of your self-managed Apache Kafka brokers.
     * * `SASL_SCRAM_512_AUTH` – (Amazon MSK, Self-managed Apache Kafka) The Secrets Manager ARN of
     * your secret key used for SASL SCRAM-512 authentication of your self-managed Apache Kafka
     * brokers.
     * * `VIRTUAL_HOST` –- (RabbitMQ) The name of the virtual host in your RabbitMQ broker. Lambda
     * uses this RabbitMQ host as the event source. This property cannot be specified in an
     * UpdateEventSourceMapping API call.
     * * `CLIENT_CERTIFICATE_TLS_AUTH` – (Amazon MSK, self-managed Apache Kafka) The Secrets Manager
     * ARN of your secret key containing the certificate chain (X.509 PEM), private key (PKCS#8 PEM),
     * and private key password (optional) used for mutual TLS authentication of your MSK/Apache Kafka
     * brokers.
     * * `SERVER_ROOT_CA_CERTIFICATE` – (Self-managed Apache Kafka) The Secrets Manager ARN of your
     * secret key containing the root CA certificate (X.509 PEM) used for TLS encryption of your Apache
     * Kafka brokers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The value for your chosen configuration in `Type` .
     *
     * For example: `"URI":
     * "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-uri)
     */
    public fun uri(): String? = unwrap(this).getUri()

    /**
     * A builder for [SourceAccessConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of authentication protocol, VPC components, or virtual host for your
       * event source. For example: `"Type":"SASL_SCRAM_512_AUTH"` .
       * * `BASIC_AUTH` – (Amazon MQ) The AWS Secrets Manager secret that stores your broker
       * credentials.
       * * `BASIC_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your secret key
       * used for SASL/PLAIN authentication of your Apache Kafka brokers.
       * * `VPC_SUBNET` – (Self-managed Apache Kafka) The subnets associated with your VPC. Lambda
       * connects to these subnets to fetch data from your self-managed Apache Kafka cluster.
       * * `VPC_SECURITY_GROUP` – (Self-managed Apache Kafka) The VPC security group used to manage
       * access to your self-managed Apache Kafka brokers.
       * * `SASL_SCRAM_256_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your
       * secret key used for SASL SCRAM-256 authentication of your self-managed Apache Kafka brokers.
       * * `SASL_SCRAM_512_AUTH` – (Amazon MSK, Self-managed Apache Kafka) The Secrets Manager ARN
       * of your secret key used for SASL SCRAM-512 authentication of your self-managed Apache Kafka
       * brokers.
       * * `VIRTUAL_HOST` –- (RabbitMQ) The name of the virtual host in your RabbitMQ broker. Lambda
       * uses this RabbitMQ host as the event source. This property cannot be specified in an
       * UpdateEventSourceMapping API call.
       * * `CLIENT_CERTIFICATE_TLS_AUTH` – (Amazon MSK, self-managed Apache Kafka) The Secrets
       * Manager ARN of your secret key containing the certificate chain (X.509 PEM), private key
       * (PKCS#8 PEM), and private key password (optional) used for mutual TLS authentication of your
       * MSK/Apache Kafka brokers.
       * * `SERVER_ROOT_CA_CERTIFICATE` – (Self-managed Apache Kafka) The Secrets Manager ARN of
       * your secret key containing the root CA certificate (X.509 PEM) used for TLS encryption of your
       * Apache Kafka brokers.
       */
      public fun type(type: String)

      /**
       * @param uri The value for your chosen configuration in `Type` .
       * For example: `"URI":
       * "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"` .
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.builder()

      /**
       * @param type The type of authentication protocol, VPC components, or virtual host for your
       * event source. For example: `"Type":"SASL_SCRAM_512_AUTH"` .
       * * `BASIC_AUTH` – (Amazon MQ) The AWS Secrets Manager secret that stores your broker
       * credentials.
       * * `BASIC_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your secret key
       * used for SASL/PLAIN authentication of your Apache Kafka brokers.
       * * `VPC_SUBNET` – (Self-managed Apache Kafka) The subnets associated with your VPC. Lambda
       * connects to these subnets to fetch data from your self-managed Apache Kafka cluster.
       * * `VPC_SECURITY_GROUP` – (Self-managed Apache Kafka) The VPC security group used to manage
       * access to your self-managed Apache Kafka brokers.
       * * `SASL_SCRAM_256_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your
       * secret key used for SASL SCRAM-256 authentication of your self-managed Apache Kafka brokers.
       * * `SASL_SCRAM_512_AUTH` – (Amazon MSK, Self-managed Apache Kafka) The Secrets Manager ARN
       * of your secret key used for SASL SCRAM-512 authentication of your self-managed Apache Kafka
       * brokers.
       * * `VIRTUAL_HOST` –- (RabbitMQ) The name of the virtual host in your RabbitMQ broker. Lambda
       * uses this RabbitMQ host as the event source. This property cannot be specified in an
       * UpdateEventSourceMapping API call.
       * * `CLIENT_CERTIFICATE_TLS_AUTH` – (Amazon MSK, self-managed Apache Kafka) The Secrets
       * Manager ARN of your secret key containing the certificate chain (X.509 PEM), private key
       * (PKCS#8 PEM), and private key password (optional) used for mutual TLS authentication of your
       * MSK/Apache Kafka brokers.
       * * `SERVER_ROOT_CA_CERTIFICATE` – (Self-managed Apache Kafka) The Secrets Manager ARN of
       * your secret key containing the root CA certificate (X.509 PEM) used for TLS encryption of your
       * Apache Kafka brokers.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param uri The value for your chosen configuration in `Type` .
       * For example: `"URI":
       * "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"` .
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty,
    ) : CdkObject(cdkObject), SourceAccessConfigurationProperty {
      /**
       * The type of authentication protocol, VPC components, or virtual host for your event source.
       * For example: `"Type":"SASL_SCRAM_512_AUTH"` .
       *
       * * `BASIC_AUTH` – (Amazon MQ) The AWS Secrets Manager secret that stores your broker
       * credentials.
       * * `BASIC_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your secret key
       * used for SASL/PLAIN authentication of your Apache Kafka brokers.
       * * `VPC_SUBNET` – (Self-managed Apache Kafka) The subnets associated with your VPC. Lambda
       * connects to these subnets to fetch data from your self-managed Apache Kafka cluster.
       * * `VPC_SECURITY_GROUP` – (Self-managed Apache Kafka) The VPC security group used to manage
       * access to your self-managed Apache Kafka brokers.
       * * `SASL_SCRAM_256_AUTH` – (Self-managed Apache Kafka) The Secrets Manager ARN of your
       * secret key used for SASL SCRAM-256 authentication of your self-managed Apache Kafka brokers.
       * * `SASL_SCRAM_512_AUTH` – (Amazon MSK, Self-managed Apache Kafka) The Secrets Manager ARN
       * of your secret key used for SASL SCRAM-512 authentication of your self-managed Apache Kafka
       * brokers.
       * * `VIRTUAL_HOST` –- (RabbitMQ) The name of the virtual host in your RabbitMQ broker. Lambda
       * uses this RabbitMQ host as the event source. This property cannot be specified in an
       * UpdateEventSourceMapping API call.
       * * `CLIENT_CERTIFICATE_TLS_AUTH` – (Amazon MSK, self-managed Apache Kafka) The Secrets
       * Manager ARN of your secret key containing the certificate chain (X.509 PEM), private key
       * (PKCS#8 PEM), and private key password (optional) used for mutual TLS authentication of your
       * MSK/Apache Kafka brokers.
       * * `SERVER_ROOT_CA_CERTIFICATE` – (Self-managed Apache Kafka) The Secrets Manager ARN of
       * your secret key containing the root CA certificate (X.509 PEM) used for TLS encryption of your
       * Apache Kafka brokers.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The value for your chosen configuration in `Type` .
       *
       * For example: `"URI":
       * "arn:aws:secretsmanager:us-east-1:01234567890:secret:MyBrokerSecretName"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-uri)
       */
      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SourceAccessConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty):
          SourceAccessConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SourceAccessConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SourceAccessConfigurationProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty
    }
  }
}
