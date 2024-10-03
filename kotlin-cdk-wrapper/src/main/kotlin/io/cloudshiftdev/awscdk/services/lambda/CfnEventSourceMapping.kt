@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
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
 * .kmsKeyArn("kmsKeyArn")
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
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .topics(List.of("topics"))
 * .tumblingWindowInSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html)
 */
public open class CfnEventSourceMapping(
  cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSourceMappingProps,
  ) :
      this(software.amazon.awscdk.services.lambda.CfnEventSourceMapping(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnEventSourceMappingProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnEventSourceMappingProps.Builder.() -> Unit,
  ) : this(scope, id, CfnEventSourceMappingProps(props)
  )

  /**
   * Specific configuration settings for an MSK event source.
   */
  public open fun amazonManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getAmazonManagedKafkaEventSourceConfig()

  /**
   * Specific configuration settings for an MSK event source.
   */
  public open fun amazonManagedKafkaEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specific configuration settings for an MSK event source.
   */
  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(AmazonManagedKafkaEventSourceConfigProperty.Companion::unwrap))
  }

  /**
   * Specific configuration settings for an MSK event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0546eaf5ec0de25dc1ef0f4eff69e33135c5ee55d069c75ed61f58ff872041ff")
  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
      Unit =
      amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty(`value`))

  /**
   *
   */
  public open fun attrEventSourceMappingArn(): String = unwrap(this).getAttrEventSourceMappingArn()

  /**
   * Event Source Mapping Identifier UUID.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The maximum number of items to retrieve in a single batch.
   */
  public open fun batchSize(): Number? = unwrap(this).getBatchSize()

  /**
   * The maximum number of items to retrieve in a single batch.
   */
  public open fun batchSize(`value`: Number) {
    unwrap(this).setBatchSize(`value`)
  }

  /**
   * (Streams) If the function returns an error, split the batch in two and retry.
   */
  public open fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

  /**
   * (Streams) If the function returns an error, split the batch in two and retry.
   */
  public open fun bisectBatchOnFunctionError(`value`: Boolean) {
    unwrap(this).setBisectBatchOnFunctionError(`value`)
  }

  /**
   * (Streams) If the function returns an error, split the batch in two and retry.
   */
  public open fun bisectBatchOnFunctionError(`value`: IResolvable) {
    unwrap(this).setBisectBatchOnFunctionError(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(`value`: IResolvable) {
    unwrap(this).setDestinationConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(`value`: DestinationConfigProperty) {
    unwrap(this).setDestinationConfig(`value`.let(DestinationConfigProperty.Companion::unwrap))
  }

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e0727d1f2ac82afd02c9afa0002bf881a9e6a16e5e752856fc1a751310a91530")
  public open fun destinationConfig(`value`: DestinationConfigProperty.Builder.() -> Unit): Unit =
      destinationConfig(DestinationConfigProperty(`value`))

  /**
   * Document db event source config.
   */
  public open fun documentDbEventSourceConfig(): Any? =
      unwrap(this).getDocumentDbEventSourceConfig()

  /**
   * Document db event source config.
   */
  public open fun documentDbEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Document db event source config.
   */
  public open fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(DocumentDBEventSourceConfigProperty.Companion::unwrap))
  }

  /**
   * Document db event source config.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b5d7540aaff5f4c337bd3e3c466ea3553153047b3199251b7d4dc6152d421f8")
  public open
      fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
      Unit = documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty(`value`))

  /**
   * Disables the event source mapping to pause polling and invocation.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Disables the event source mapping to pause polling and invocation.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Disables the event source mapping to pause polling and invocation.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
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
   * The filter criteria to control event filtering.
   */
  public open fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  /**
   * The filter criteria to control event filtering.
   */
  public open fun filterCriteria(`value`: IResolvable) {
    unwrap(this).setFilterCriteria(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The filter criteria to control event filtering.
   */
  public open fun filterCriteria(`value`: FilterCriteriaProperty) {
    unwrap(this).setFilterCriteria(`value`.let(FilterCriteriaProperty.Companion::unwrap))
  }

  /**
   * The filter criteria to control event filtering.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bc31923467be09d3b1d86cf808a6a14758970152c4f89da54949ef9fb9cf1dd8")
  public open fun filterCriteria(`value`: FilterCriteriaProperty.Builder.() -> Unit): Unit =
      filterCriteria(FilterCriteriaProperty(`value`))

  /**
   * The name of the Lambda function.
   */
  public open fun functionName(): String = unwrap(this).getFunctionName()

  /**
   * The name of the Lambda function.
   */
  public open fun functionName(`value`: String) {
    unwrap(this).setFunctionName(`value`)
  }

  /**
   * (Streams) A list of response types supported by the function.
   */
  public open fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

  /**
   * (Streams) A list of response types supported by the function.
   */
  public open fun functionResponseTypes(`value`: List<String>) {
    unwrap(this).setFunctionResponseTypes(`value`)
  }

  /**
   * (Streams) A list of response types supported by the function.
   */
  public open fun functionResponseTypes(vararg `value`: String): Unit =
      functionResponseTypes(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The Amazon Resource Name (ARN) of the KMS key.
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The Amazon Resource Name (ARN) of the KMS key.
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
  }

  /**
   * (Streams) The maximum amount of time to gather records before invoking the function, in
   * seconds.
   */
  public open fun maximumBatchingWindowInSeconds(): Number? =
      unwrap(this).getMaximumBatchingWindowInSeconds()

  /**
   * (Streams) The maximum amount of time to gather records before invoking the function, in
   * seconds.
   */
  public open fun maximumBatchingWindowInSeconds(`value`: Number) {
    unwrap(this).setMaximumBatchingWindowInSeconds(`value`)
  }

  /**
   * (Streams) The maximum age of a record that Lambda sends to a function for processing.
   */
  public open fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

  /**
   * (Streams) The maximum age of a record that Lambda sends to a function for processing.
   */
  public open fun maximumRecordAgeInSeconds(`value`: Number) {
    unwrap(this).setMaximumRecordAgeInSeconds(`value`)
  }

  /**
   * (Streams) The maximum number of times to retry when the function returns an error.
   */
  public open fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  /**
   * (Streams) The maximum number of times to retry when the function returns an error.
   */
  public open fun maximumRetryAttempts(`value`: Number) {
    unwrap(this).setMaximumRetryAttempts(`value`)
  }

  /**
   * (Streams) The number of batches to process from each shard concurrently.
   */
  public open fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  /**
   * (Streams) The number of batches to process from each shard concurrently.
   */
  public open fun parallelizationFactor(`value`: Number) {
    unwrap(this).setParallelizationFactor(`value`)
  }

  /**
   * (ActiveMQ) A list of ActiveMQ queues.
   */
  public open fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

  /**
   * (ActiveMQ) A list of ActiveMQ queues.
   */
  public open fun queues(`value`: List<String>) {
    unwrap(this).setQueues(`value`)
  }

  /**
   * (ActiveMQ) A list of ActiveMQ queues.
   */
  public open fun queues(vararg `value`: String): Unit = queues(`value`.toList())

  /**
   * The scaling configuration for the event source.
   */
  public open fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  /**
   * The scaling configuration for the event source.
   */
  public open fun scalingConfig(`value`: IResolvable) {
    unwrap(this).setScalingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The scaling configuration for the event source.
   */
  public open fun scalingConfig(`value`: ScalingConfigProperty) {
    unwrap(this).setScalingConfig(`value`.let(ScalingConfigProperty.Companion::unwrap))
  }

  /**
   * The scaling configuration for the event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c7f38e41aa1e31160bdb25d297001323779fbc20a75f265e5d9d84a5dde4abf8")
  public open fun scalingConfig(`value`: ScalingConfigProperty.Builder.() -> Unit): Unit =
      scalingConfig(ScalingConfigProperty(`value`))

  /**
   * The configuration used by AWS Lambda to access a self-managed event source.
   */
  public open fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

  /**
   * The configuration used by AWS Lambda to access a self-managed event source.
   */
  public open fun selfManagedEventSource(`value`: IResolvable) {
    unwrap(this).setSelfManagedEventSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The configuration used by AWS Lambda to access a self-managed event source.
   */
  public open fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty) {
    unwrap(this).setSelfManagedEventSource(`value`.let(SelfManagedEventSourceProperty.Companion::unwrap))
  }

  /**
   * The configuration used by AWS Lambda to access a self-managed event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ded22c9cf40efe353eb906200eb2e3d2b16224de530e6e175fb9f5582fbcd80a")
  public open
      fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty.Builder.() -> Unit): Unit =
      selfManagedEventSource(SelfManagedEventSourceProperty(`value`))

  /**
   * Specific configuration settings for a Self-Managed Apache Kafka event source.
   */
  public open fun selfManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getSelfManagedKafkaEventSourceConfig()

  /**
   * Specific configuration settings for a Self-Managed Apache Kafka event source.
   */
  public open fun selfManagedKafkaEventSourceConfig(`value`: IResolvable) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specific configuration settings for a Self-Managed Apache Kafka event source.
   */
  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(SelfManagedKafkaEventSourceConfigProperty.Companion::unwrap))
  }

  /**
   * Specific configuration settings for a Self-Managed Apache Kafka event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a57a37ea1790f9844a931862b87c174d0128222ac406a0c5f427e774c75f2e6")
  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
      Unit = selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty(`value`))

  /**
   * A list of SourceAccessConfiguration.
   */
  public open fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

  /**
   * A list of SourceAccessConfiguration.
   */
  public open fun sourceAccessConfigurations(`value`: IResolvable) {
    unwrap(this).setSourceAccessConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A list of SourceAccessConfiguration.
   */
  public open fun sourceAccessConfigurations(`value`: List<Any>) {
    unwrap(this).setSourceAccessConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A list of SourceAccessConfiguration.
   */
  public open fun sourceAccessConfigurations(vararg `value`: Any): Unit =
      sourceAccessConfigurations(`value`.toList())

  /**
   * The position in a stream from which to start reading.
   */
  public open fun startingPosition(): String? = unwrap(this).getStartingPosition()

  /**
   * The position in a stream from which to start reading.
   */
  public open fun startingPosition(`value`: String) {
    unwrap(this).setStartingPosition(`value`)
  }

  /**
   * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time
   * seconds.
   */
  public open fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  /**
   * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time
   * seconds.
   */
  public open fun startingPositionTimestamp(`value`: Number) {
    unwrap(this).setStartingPositionTimestamp(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * (Kafka) A list of Kafka topics.
   */
  public open fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  /**
   * (Kafka) A list of Kafka topics.
   */
  public open fun topics(`value`: List<String>) {
    unwrap(this).setTopics(`value`)
  }

  /**
   * (Kafka) A list of Kafka topics.
   */
  public open fun topics(vararg `value`: String): Unit = topics(`value`.toList())

  /**
   * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
   */
  public open fun tumblingWindowInSeconds(): Number? = unwrap(this).getTumblingWindowInSeconds()

  /**
   * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
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
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source. 
     */
    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable)

    /**
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source. 
     */
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty)

    /**
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a18729a436a40c6ab3d5a14bf28967743c4f06ebf58a4c3399a07176c1be7fa")
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * The maximum number of items to retrieve in a single batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
     * @param batchSize The maximum number of items to retrieve in a single batch. 
     */
    public fun batchSize(batchSize: Number)

    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry. 
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry. 
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    public fun destinationConfig(destinationConfig: IResolvable)

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    public fun destinationConfig(destinationConfig: DestinationConfigProperty)

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1365091f9febe46c1e47ec28c4a9206a26547b34731f5baf261a0af4eaa6b6")
    public fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit)

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Document db event source config. 
     */
    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable)

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Document db event source config. 
     */
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty)

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Document db event source config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3b3fe70f00ec954d7ece91179c11a46159eb84371098c41dbdad143a0d405a0")
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * Disables the event source mapping to pause polling and invocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled Disables the event source mapping to pause polling and invocation. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Disables the event source mapping to pause polling and invocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled Disables the event source mapping to pause polling and invocation. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
     */
    public fun eventSourceArn(eventSourceArn: String)

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria The filter criteria to control event filtering. 
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria The filter criteria to control event filtering. 
     */
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty)

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria The filter criteria to control event filtering. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916dc1790836cb4d0d61fbac02ff601607532a144ed6fba129679e6bf27e1e3c")
    public fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * The name of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
     * @param functionName The name of the Lambda function. 
     */
    public fun functionName(functionName: String)

    /**
     * (Streams) A list of response types supported by the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams) A list of response types supported by the function. 
     */
    public fun functionResponseTypes(functionResponseTypes: List<String>)

    /**
     * (Streams) A list of response types supported by the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams) A list of response types supported by the function. 
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String)

    /**
     * The Amazon Resource Name (ARN) of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key. 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * (Streams) The maximum amount of time to gather records before invoking the function, in
     * seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds)
     * @param maximumBatchingWindowInSeconds (Streams) The maximum amount of time to gather records
     * before invoking the function, in seconds. 
     */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

    /**
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
     * @param maximumRecordAgeInSeconds (Streams) The maximum age of a record that Lambda sends to a
     * function for processing. 
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

    /**
     * (Streams) The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     * @param maximumRetryAttempts (Streams) The maximum number of times to retry when the function
     * returns an error. 
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    /**
     * (Streams) The number of batches to process from each shard concurrently.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     * @param parallelizationFactor (Streams) The number of batches to process from each shard
     * concurrently. 
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (ActiveMQ) A list of ActiveMQ queues. 
     */
    public fun queues(queues: List<String>)

    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (ActiveMQ) A list of ActiveMQ queues. 
     */
    public fun queues(vararg queues: String)

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig The scaling configuration for the event source. 
     */
    public fun scalingConfig(scalingConfig: IResolvable)

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig The scaling configuration for the event source. 
     */
    public fun scalingConfig(scalingConfig: ScalingConfigProperty)

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig The scaling configuration for the event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3b9f703fbf78497da8a3697e58d20913edff366643d85f736a432c376080e")
    public fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit)

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source. 
     */
    public fun selfManagedEventSource(selfManagedEventSource: IResolvable)

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source. 
     */
    public fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty)

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("338dd05b1ecb9f9b6cac5db40b22f8a8756113fd3faf8ec5704f4aa12283dda4")
    public
        fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty.Builder.() -> Unit)

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source. 
     */
    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable)

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source. 
     */
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty)

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98f5b4474f72c44225b79c9d86688eedd8ec8f540ead775e215a15e7562423d3")
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration. 
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable)

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration. 
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>)

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration. 
     */
    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any)

    /**
     * The position in a stream from which to start reading.
     *
     * Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     * @param startingPosition The position in a stream from which to start reading. 
     */
    public fun startingPosition(startingPosition: String)

    /**
     * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time
     * seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     * @param startingPositionTimestamp With StartingPosition set to AT_TIMESTAMP, the time from
     * which to start reading, in Unix time seconds. 
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * (Kafka) A list of Kafka topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics (Kafka) A list of Kafka topics. 
     */
    public fun topics(topics: List<String>)

    /**
     * (Kafka) A list of Kafka topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics (Kafka) A list of Kafka topics. 
     */
    public fun topics(vararg topics: String)

    /**
     * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
     * @param tumblingWindowInSeconds (Streams) Tumbling window (non-overlapping time window)
     * duration to perform aggregations. 
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
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source. 
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source. 
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(AmazonManagedKafkaEventSourceConfigProperty.Companion::unwrap))
    }

    /**
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a18729a436a40c6ab3d5a14bf28967743c4f06ebf58a4c3399a07176c1be7fa")
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        amazonManagedKafkaEventSourceConfig(AmazonManagedKafkaEventSourceConfigProperty(amazonManagedKafkaEventSourceConfig))

    /**
     * The maximum number of items to retrieve in a single batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
     * @param batchSize The maximum number of items to retrieve in a single batch. 
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry. 
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry. 
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable.Companion::unwrap))
    }

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    override fun destinationConfig(destinationConfig: DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty.Companion::unwrap))
    }

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf1365091f9febe46c1e47ec28c4a9206a26547b34731f5baf261a0af4eaa6b6")
    override fun destinationConfig(destinationConfig: DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(DestinationConfigProperty(destinationConfig))

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Document db event source config. 
     */
    override fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Document db event source config. 
     */
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(DocumentDBEventSourceConfigProperty.Companion::unwrap))
    }

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     * @param documentDbEventSourceConfig Document db event source config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d3b3fe70f00ec954d7ece91179c11a46159eb84371098c41dbdad143a0d405a0")
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        documentDbEventSourceConfig(DocumentDBEventSourceConfigProperty(documentDbEventSourceConfig))

    /**
     * Disables the event source mapping to pause polling and invocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled Disables the event source mapping to pause polling and invocation. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Disables the event source mapping to pause polling and invocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     * @param enabled Disables the event source mapping to pause polling and invocation. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source. 
     */
    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria The filter criteria to control event filtering. 
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria The filter criteria to control event filtering. 
     */
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty.Companion::unwrap))
    }

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     * @param filterCriteria The filter criteria to control event filtering. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("916dc1790836cb4d0d61fbac02ff601607532a144ed6fba129679e6bf27e1e3c")
    override fun filterCriteria(filterCriteria: FilterCriteriaProperty.Builder.() -> Unit): Unit =
        filterCriteria(FilterCriteriaProperty(filterCriteria))

    /**
     * The name of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
     * @param functionName The name of the Lambda function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * (Streams) A list of response types supported by the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams) A list of response types supported by the function. 
     */
    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    /**
     * (Streams) A list of response types supported by the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Streams) A list of response types supported by the function. 
     */
    override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
        functionResponseTypes(functionResponseTypes.toList())

    /**
     * The Amazon Resource Name (ARN) of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-kmskeyarn)
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key. 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * (Streams) The maximum amount of time to gather records before invoking the function, in
     * seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds)
     * @param maximumBatchingWindowInSeconds (Streams) The maximum amount of time to gather records
     * before invoking the function, in seconds. 
     */
    override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
     * @param maximumRecordAgeInSeconds (Streams) The maximum age of a record that Lambda sends to a
     * function for processing. 
     */
    override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * (Streams) The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     * @param maximumRetryAttempts (Streams) The maximum number of times to retry when the function
     * returns an error. 
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * (Streams) The number of batches to process from each shard concurrently.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     * @param parallelizationFactor (Streams) The number of batches to process from each shard
     * concurrently. 
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (ActiveMQ) A list of ActiveMQ queues. 
     */
    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     * @param queues (ActiveMQ) A list of ActiveMQ queues. 
     */
    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig The scaling configuration for the event source. 
     */
    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig The scaling configuration for the event source. 
     */
    override fun scalingConfig(scalingConfig: ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(ScalingConfigProperty.Companion::unwrap))
    }

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     * @param scalingConfig The scaling configuration for the event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1ef3b9f703fbf78497da8a3697e58d20913edff366643d85f736a432c376080e")
    override fun scalingConfig(scalingConfig: ScalingConfigProperty.Builder.() -> Unit): Unit =
        scalingConfig(ScalingConfigProperty(scalingConfig))

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source. 
     */
    override fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source. 
     */
    override fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(SelfManagedEventSourceProperty.Companion::unwrap))
    }

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("338dd05b1ecb9f9b6cac5db40b22f8a8756113fd3faf8ec5704f4aa12283dda4")
    override
        fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty.Builder.() -> Unit):
        Unit = selfManagedEventSource(SelfManagedEventSourceProperty(selfManagedEventSource))

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source. 
     */
    override fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source. 
     */
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(SelfManagedKafkaEventSourceConfigProperty.Companion::unwrap))
    }

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("98f5b4474f72c44225b79c9d86688eedd8ec8f540ead775e215a15e7562423d3")
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        selfManagedKafkaEventSourceConfig(SelfManagedKafkaEventSourceConfigProperty(selfManagedKafkaEventSourceConfig))

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration. 
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration. 
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration. 
     */
    override fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    /**
     * The position in a stream from which to start reading.
     *
     * Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     * @param startingPosition The position in a stream from which to start reading. 
     */
    override fun startingPosition(startingPosition: String) {
      cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time
     * seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     * @param startingPositionTimestamp With StartingPosition set to AT_TIMESTAMP, the time from
     * which to start reading, in Unix time seconds. 
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * (Kafka) A list of Kafka topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics (Kafka) A list of Kafka topics. 
     */
    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    /**
     * (Kafka) A list of Kafka topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     * @param topics (Kafka) A list of Kafka topics. 
     */
    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    /**
     * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tumblingwindowinseconds)
     * @param tumblingWindowInSeconds (Streams) Tumbling window (non-overlapping time window)
     * duration to perform aggregations. 
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
   * Specific configuration settings for an MSK event source.
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
     * The identifier for the Kafka Consumer Group to join.
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
       * @param consumerGroupId The identifier for the Kafka Consumer Group to join.
       */
      public fun consumerGroupId(consumerGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.builder()

      /**
       * @param consumerGroupId The identifier for the Kafka Consumer Group to join.
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
    ) : CdkObject(cdkObject),
        AmazonManagedKafkaEventSourceConfigProperty {
      /**
       * The identifier for the Kafka Consumer Group to join.
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
     * A destination for records of invocations that failed processing.
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
       * @param onFailure A destination for records of invocations that failed processing.
       */
      public fun onFailure(onFailure: IResolvable)

      /**
       * @param onFailure A destination for records of invocations that failed processing.
       */
      public fun onFailure(onFailure: OnFailureProperty)

      /**
       * @param onFailure A destination for records of invocations that failed processing.
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
       * @param onFailure A destination for records of invocations that failed processing.
       */
      override fun onFailure(onFailure: IResolvable) {
        cdkBuilder.onFailure(onFailure.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onFailure A destination for records of invocations that failed processing.
       */
      override fun onFailure(onFailure: OnFailureProperty) {
        cdkBuilder.onFailure(onFailure.let(OnFailureProperty.Companion::unwrap))
      }

      /**
       * @param onFailure A destination for records of invocations that failed processing.
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
    ) : CdkObject(cdkObject),
        DestinationConfigProperty {
      /**
       * A destination for records of invocations that failed processing.
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
   * Document db event source config.
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
     * The collection name to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-collectionname)
     */
    public fun collectionName(): String? = unwrap(this).getCollectionName()

    /**
     * The database name to connect to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * Include full document in change stream response.
     *
     * The default option will only send the changes made to documents to Lambda. If you want the
     * complete document sent to Lambda, set this to UpdateLookup.
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
       * @param collectionName The collection name to connect to.
       */
      public fun collectionName(collectionName: String)

      /**
       * @param databaseName The database name to connect to.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param fullDocument Include full document in change stream response.
       * The default option will only send the changes made to documents to Lambda. If you want the
       * complete document sent to Lambda, set this to UpdateLookup.
       */
      public fun fullDocument(fullDocument: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.builder()

      /**
       * @param collectionName The collection name to connect to.
       */
      override fun collectionName(collectionName: String) {
        cdkBuilder.collectionName(collectionName)
      }

      /**
       * @param databaseName The database name to connect to.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param fullDocument Include full document in change stream response.
       * The default option will only send the changes made to documents to Lambda. If you want the
       * complete document sent to Lambda, set this to UpdateLookup.
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
    ) : CdkObject(cdkObject),
        DocumentDBEventSourceConfigProperty {
      /**
       * The collection name to connect to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-collectionname)
       */
      override fun collectionName(): String? = unwrap(this).getCollectionName()

      /**
       * The database name to connect to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-documentdbeventsourceconfig.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * Include full document in change stream response.
       *
       * The default option will only send the changes made to documents to Lambda. If you want the
       * complete document sent to Lambda, set this to UpdateLookup.
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
   * The endpoints used by AWS Lambda to access a self-managed event source.
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
     * A list of Kafka server endpoints.
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
       * @param kafkaBootstrapServers A list of Kafka server endpoints.
       */
      public fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>)

      /**
       * @param kafkaBootstrapServers A list of Kafka server endpoints.
       */
      public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty.builder()

      /**
       * @param kafkaBootstrapServers A list of Kafka server endpoints.
       */
      override fun kafkaBootstrapServers(kafkaBootstrapServers: List<String>) {
        cdkBuilder.kafkaBootstrapServers(kafkaBootstrapServers)
      }

      /**
       * @param kafkaBootstrapServers A list of Kafka server endpoints.
       */
      override fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String): Unit =
          kafkaBootstrapServers(kafkaBootstrapServers.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.EndpointsProperty,
    ) : CdkObject(cdkObject),
        EndpointsProperty {
      /**
       * A list of Kafka server endpoints.
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
   * The filter criteria to control event filtering.
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
     * List of filters of this FilterCriteria.
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
       * @param filters List of filters of this FilterCriteria.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters List of filters of this FilterCriteria.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters List of filters of this FilterCriteria.
       */
      public fun filters(vararg filters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty.builder()

      /**
       * @param filters List of filters of this FilterCriteria.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filters List of filters of this FilterCriteria.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filters List of filters of this FilterCriteria.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterCriteriaProperty,
    ) : CdkObject(cdkObject),
        FilterCriteriaProperty {
      /**
       * List of filters of this FilterCriteria.
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
   * The filter object that defines parameters for ESM filtering.
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
     * The filter pattern that defines which events should be passed for invocations.
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
       * @param pattern The filter pattern that defines which events should be passed for
       * invocations.
       */
      public fun pattern(pattern: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.FilterProperty.builder()

      /**
       * @param pattern The filter pattern that defines which events should be passed for
       * invocations.
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
    ) : CdkObject(cdkObject),
        FilterProperty {
      /**
       * The filter pattern that defines which events should be passed for invocations.
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
   * A destination for records of invocations that failed processing.
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
       */
      public fun destination(destination: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.Builder =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.OnFailureProperty.builder()

      /**
       * @param destination The Amazon Resource Name (ARN) of the destination resource.
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
    ) : CdkObject(cdkObject),
        OnFailureProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination resource.
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
   * The scaling configuration for the event source.
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
     * The maximum number of concurrent functions that an event source can invoke.
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
       * @param maximumConcurrency The maximum number of concurrent functions that an event source
       * can invoke.
       */
      public fun maximumConcurrency(maximumConcurrency: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ScalingConfigProperty.builder()

      /**
       * @param maximumConcurrency The maximum number of concurrent functions that an event source
       * can invoke.
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
    ) : CdkObject(cdkObject),
        ScalingConfigProperty {
      /**
       * The maximum number of concurrent functions that an event source can invoke.
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
   * The configuration used by AWS Lambda to access a self-managed event source.
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
     * The endpoints used by AWS Lambda to access a self-managed event source.
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
       * @param endpoints The endpoints used by AWS Lambda to access a self-managed event source.
       */
      public fun endpoints(endpoints: IResolvable)

      /**
       * @param endpoints The endpoints used by AWS Lambda to access a self-managed event source.
       */
      public fun endpoints(endpoints: EndpointsProperty)

      /**
       * @param endpoints The endpoints used by AWS Lambda to access a self-managed event source.
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
       * @param endpoints The endpoints used by AWS Lambda to access a self-managed event source.
       */
      override fun endpoints(endpoints: IResolvable) {
        cdkBuilder.endpoints(endpoints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param endpoints The endpoints used by AWS Lambda to access a self-managed event source.
       */
      override fun endpoints(endpoints: EndpointsProperty) {
        cdkBuilder.endpoints(endpoints.let(EndpointsProperty.Companion::unwrap))
      }

      /**
       * @param endpoints The endpoints used by AWS Lambda to access a self-managed event source.
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
    ) : CdkObject(cdkObject),
        SelfManagedEventSourceProperty {
      /**
       * The endpoints used by AWS Lambda to access a self-managed event source.
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
   * Specific configuration settings for a Self-Managed Apache Kafka event source.
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
     * The identifier for the Kafka Consumer Group to join.
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
       * @param consumerGroupId The identifier for the Kafka Consumer Group to join.
       */
      public fun consumerGroupId(consumerGroupId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder()

      /**
       * @param consumerGroupId The identifier for the Kafka Consumer Group to join.
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
    ) : CdkObject(cdkObject),
        SelfManagedKafkaEventSourceConfigProperty {
      /**
       * The identifier for the Kafka Consumer Group to join.
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
   * The configuration used by AWS Lambda to access event source.
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
     * The type of source access configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The URI for the source access configuration resource.
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
       * @param type The type of source access configuration.
       */
      public fun type(type: String)

      /**
       * @param uri The URI for the source access configuration resource.
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SourceAccessConfigurationProperty.builder()

      /**
       * @param type The type of source access configuration.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param uri The URI for the source access configuration resource.
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
    ) : CdkObject(cdkObject),
        SourceAccessConfigurationProperty {
      /**
       * The type of source access configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-sourceaccessconfiguration.html#cfn-lambda-eventsourcemapping-sourceaccessconfiguration-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The URI for the source access configuration resource.
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
