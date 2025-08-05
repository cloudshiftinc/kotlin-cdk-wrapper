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
 * .schemaRegistryConfig(SchemaRegistryConfigProperty.builder()
 * .accessConfigs(List.of(SchemaRegistryAccessConfigProperty.builder()
 * .type("type")
 * .uri("uri")
 * .build()))
 * .eventRecordFormat("eventRecordFormat")
 * .schemaRegistryUri("schemaRegistryUri")
 * .schemaValidationConfigs(List.of(SchemaValidationConfigProperty.builder()
 * .attribute("attribute")
 * .build()))
 * .build())
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
 * .metricsConfig(MetricsConfigProperty.builder()
 * .metrics(List.of("metrics"))
 * .build())
 * .parallelizationFactor(123)
 * .provisionedPollerConfig(ProvisionedPollerConfigProperty.builder()
 * .maximumPollers(123)
 * .minimumPollers(123)
 * .build())
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
 * .schemaRegistryConfig(SchemaRegistryConfigProperty.builder()
 * .accessConfigs(List.of(SchemaRegistryAccessConfigProperty.builder()
 * .type("type")
 * .uri("uri")
 * .build()))
 * .eventRecordFormat("eventRecordFormat")
 * .schemaRegistryUri("schemaRegistryUri")
 * .schemaValidationConfigs(List.of(SchemaValidationConfigProperty.builder()
 * .attribute("attribute")
 * .build()))
 * .build())
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
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specific configuration settings for an Amazon Managed Streaming for Apache Kafka (Amazon MSK)
   * event source.
   */
  public open
      fun amazonManagedKafkaEventSourceConfig(`value`: AmazonManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setAmazonManagedKafkaEventSourceConfig(`value`.let(AmazonManagedKafkaEventSourceConfigProperty.Companion::unwrap))
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
   * The Amazon Resource Name (ARN) of the event source mapping.
   */
  public open fun attrEventSourceMappingArn(): String = unwrap(this).getAttrEventSourceMappingArn()

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
    unwrap(this).setBisectBatchOnFunctionError(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

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
    unwrap(this).setDestinationConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * (Kinesis, DynamoDB Streams, Amazon MSK, and self-managed Apache Kafka event sources only) A
   * configuration object that specifies the destination of an event after Lambda processes it.
   */
  public open fun destinationConfig(`value`: DestinationConfigProperty) {
    unwrap(this).setDestinationConfig(`value`.let(DestinationConfigProperty.Companion::unwrap))
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
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specific configuration settings for a DocumentDB event source.
   */
  public open fun documentDbEventSourceConfig(`value`: DocumentDBEventSourceConfigProperty) {
    unwrap(this).setDocumentDbEventSourceConfig(`value`.let(DocumentDBEventSourceConfigProperty.Companion::unwrap))
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
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  public open fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  public open fun filterCriteria(`value`: IResolvable) {
    unwrap(this).setFilterCriteria(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An object that defines the filter criteria that determine whether Lambda should process an
   * event.
   */
  public open fun filterCriteria(`value`: FilterCriteriaProperty) {
    unwrap(this).setFilterCriteria(`value`.let(FilterCriteriaProperty.Companion::unwrap))
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
   * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the event
   * source mapping.
   */
  public open fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

  /**
   * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the event
   * source mapping.
   */
  public open fun functionResponseTypes(`value`: List<String>) {
    unwrap(this).setFunctionResponseTypes(`value`)
  }

  /**
   * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the event
   * source mapping.
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
   * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that Lambda uses to
   * encrypt your function's [filter
   * criteria](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-basics)
   * .
   */
  public open fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that Lambda uses to
   * encrypt your function's [filter
   * criteria](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-basics)
   * .
   */
  public open fun kmsKeyArn(`value`: String) {
    unwrap(this).setKmsKeyArn(`value`)
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
   * The metrics configuration for your event source.
   */
  public open fun metricsConfig(): Any? = unwrap(this).getMetricsConfig()

  /**
   * The metrics configuration for your event source.
   */
  public open fun metricsConfig(`value`: IResolvable) {
    unwrap(this).setMetricsConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The metrics configuration for your event source.
   */
  public open fun metricsConfig(`value`: MetricsConfigProperty) {
    unwrap(this).setMetricsConfig(`value`.let(MetricsConfigProperty.Companion::unwrap))
  }

  /**
   * The metrics configuration for your event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ed277a84ea92de0cea7599fceebecb2de790ec36521626c3ff1570e0f031ee33")
  public open fun metricsConfig(`value`: MetricsConfigProperty.Builder.() -> Unit): Unit =
      metricsConfig(MetricsConfigProperty(`value`))

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
   * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
   * event source.
   */
  public open fun provisionedPollerConfig(): Any? = unwrap(this).getProvisionedPollerConfig()

  /**
   * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
   * event source.
   */
  public open fun provisionedPollerConfig(`value`: IResolvable) {
    unwrap(this).setProvisionedPollerConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
   * event source.
   */
  public open fun provisionedPollerConfig(`value`: ProvisionedPollerConfigProperty) {
    unwrap(this).setProvisionedPollerConfig(`value`.let(ProvisionedPollerConfigProperty.Companion::unwrap))
  }

  /**
   * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
   * event source.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("21782b747ee503439e38706111f341318f67612f4e3eda1097011a39603b898c")
  public open
      fun provisionedPollerConfig(`value`: ProvisionedPollerConfigProperty.Builder.() -> Unit): Unit
      = provisionedPollerConfig(ProvisionedPollerConfigProperty(`value`))

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
    unwrap(this).setScalingConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * (Amazon SQS only) The scaling configuration for the event source.
   */
  public open fun scalingConfig(`value`: ScalingConfigProperty) {
    unwrap(this).setScalingConfig(`value`.let(ScalingConfigProperty.Companion::unwrap))
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
    unwrap(this).setSelfManagedEventSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The self-managed Apache Kafka cluster for your event source.
   */
  public open fun selfManagedEventSource(`value`: SelfManagedEventSourceProperty) {
    unwrap(this).setSelfManagedEventSource(`value`.let(SelfManagedEventSourceProperty.Companion::unwrap))
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
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specific configuration settings for a self-managed Apache Kafka event source.
   */
  public open
      fun selfManagedKafkaEventSourceConfig(`value`: SelfManagedKafkaEventSourceConfigProperty) {
    unwrap(this).setSelfManagedKafkaEventSourceConfig(`value`.let(SelfManagedKafkaEventSourceConfigProperty.Companion::unwrap))
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
    unwrap(this).setSourceAccessConfigurations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * An array of the authentication protocol, VPC components, or virtual host to secure and define
   * your event source.
   */
  public open fun sourceAccessConfigurations(`value`: List<Any>) {
    unwrap(this).setSourceAccessConfigurations(`value`.map{CdkObjectWrappers.unwrap(it)})
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
   * A list of tags to add to the event source mapping.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of tags to add to the event source mapping.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of tags to add to the event source mapping.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

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
     *
     * When using `BisectBatchOnFunctionError` , check the `BatchSize` parameter in the `OnFailure`
     * destination message's metadata. The `BatchSize` could be greater than 1 since Lambda
     * consolidates failed messages metadata when writing to the `OnFailure` destination.
     *
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
     *
     * When using `BisectBatchOnFunctionError` , check the `BatchSize` parameter in the `OnFailure`
     * destination message's metadata. The `BatchSize` could be greater than 1 since Lambda
     * consolidates failed messages metadata when writing to the `OnFailure` destination.
     *
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
     * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the
     * event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Kinesis, DynamoDB Streams, and SQS) A list of current response
     * type enums applied to the event source mapping. 
     */
    public fun functionResponseTypes(functionResponseTypes: List<String>)

    /**
     * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the
     * event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Kinesis, DynamoDB Streams, and SQS) A list of current response
     * type enums applied to the event source mapping. 
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String)

    /**
     * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that Lambda uses
     * to encrypt your function's [filter
     * criteria](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-basics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-kmskeyarn)
     * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key
     * that Lambda uses to encrypt your function's [filter
     * criteria](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-basics)
     * . 
     */
    public fun kmsKeyArn(kmsKeyArn: String)

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
     * The metrics configuration for your event source.
     *
     * For more information, see [Event source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-metricsconfig)
     * @param metricsConfig The metrics configuration for your event source. 
     */
    public fun metricsConfig(metricsConfig: IResolvable)

    /**
     * The metrics configuration for your event source.
     *
     * For more information, see [Event source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-metricsconfig)
     * @param metricsConfig The metrics configuration for your event source. 
     */
    public fun metricsConfig(metricsConfig: MetricsConfigProperty)

    /**
     * The metrics configuration for your event source.
     *
     * For more information, see [Event source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-metricsconfig)
     * @param metricsConfig The metrics configuration for your event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d0fa49c69861d788f4e7357c9fcbb55035dcc3648a3e9dde378372edac33fa1")
    public fun metricsConfig(metricsConfig: MetricsConfigProperty.Builder.() -> Unit)

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
     * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
     * event source.
     *
     * For more information, see [provisioned
     * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig)
     * @param provisionedPollerConfig (Amazon MSK and self-managed Apache Kafka only) The
     * provisioned mode configuration for the event source. 
     */
    public fun provisionedPollerConfig(provisionedPollerConfig: IResolvable)

    /**
     * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
     * event source.
     *
     * For more information, see [provisioned
     * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig)
     * @param provisionedPollerConfig (Amazon MSK and self-managed Apache Kafka only) The
     * provisioned mode configuration for the event source. 
     */
    public fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfigProperty)

    /**
     * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
     * event source.
     *
     * For more information, see [provisioned
     * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig)
     * @param provisionedPollerConfig (Amazon MSK and self-managed Apache Kafka only) The
     * provisioned mode configuration for the event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b215111ab3d4f75b36197045dbc98da664e690dbe1679af16c41f86fb8f93be")
    public
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfigProperty.Builder.() -> Unit)

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
     * A list of tags to add to the event source mapping.
     *
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags A list of tags to add to the event source mapping. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of tags to add to the event source mapping.
     *
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags A list of tags to add to the event source mapping. 
     */
    public fun tags(vararg tags: CfnTag)

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
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(AmazonManagedKafkaEventSourceConfigProperty.Companion::unwrap))
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
     *
     * When using `BisectBatchOnFunctionError` , check the `BatchSize` parameter in the `OnFailure`
     * destination message's metadata. The `BatchSize` could be greater than 1 since Lambda
     * consolidates failed messages metadata when writing to the `OnFailure` destination.
     *
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
     *
     * When using `BisectBatchOnFunctionError` , check the `BatchSize` parameter in the `OnFailure`
     * destination message's metadata. The `BatchSize` could be greater than 1 since Lambda
     * consolidates failed messages metadata when writing to the `OnFailure` destination.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     * @param bisectBatchOnFunctionError (Kinesis and DynamoDB Streams only) If the function returns
     * an error, split the batch in two and retry. 
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.destinationConfig(destinationConfig.let(DestinationConfigProperty.Companion::unwrap))
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
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(DocumentDBEventSourceConfigProperty.Companion::unwrap))
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
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.filterCriteria(filterCriteria.let(FilterCriteriaProperty.Companion::unwrap))
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
     * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the
     * event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Kinesis, DynamoDB Streams, and SQS) A list of current response
     * type enums applied to the event source mapping. 
     */
    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    /**
     * (Kinesis, DynamoDB Streams, and SQS) A list of current response type enums applied to the
     * event source mapping.
     *
     * Valid Values: `ReportBatchItemFailures`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     * @param functionResponseTypes (Kinesis, DynamoDB Streams, and SQS) A list of current response
     * type enums applied to the event source mapping. 
     */
    override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
        functionResponseTypes(functionResponseTypes.toList())

    /**
     * The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key that Lambda uses
     * to encrypt your function's [filter
     * criteria](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-basics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-kmskeyarn)
     * @param kmsKeyArn The ARN of the AWS Key Management Service ( AWS KMS ) customer managed key
     * that Lambda uses to encrypt your function's [filter
     * criteria](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html#filtering-basics)
     * . 
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
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
     * The metrics configuration for your event source.
     *
     * For more information, see [Event source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-metricsconfig)
     * @param metricsConfig The metrics configuration for your event source. 
     */
    override fun metricsConfig(metricsConfig: IResolvable) {
      cdkBuilder.metricsConfig(metricsConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * The metrics configuration for your event source.
     *
     * For more information, see [Event source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-metricsconfig)
     * @param metricsConfig The metrics configuration for your event source. 
     */
    override fun metricsConfig(metricsConfig: MetricsConfigProperty) {
      cdkBuilder.metricsConfig(metricsConfig.let(MetricsConfigProperty.Companion::unwrap))
    }

    /**
     * The metrics configuration for your event source.
     *
     * For more information, see [Event source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-metricsconfig)
     * @param metricsConfig The metrics configuration for your event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7d0fa49c69861d788f4e7357c9fcbb55035dcc3648a3e9dde378372edac33fa1")
    override fun metricsConfig(metricsConfig: MetricsConfigProperty.Builder.() -> Unit): Unit =
        metricsConfig(MetricsConfigProperty(metricsConfig))

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
     * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
     * event source.
     *
     * For more information, see [provisioned
     * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig)
     * @param provisionedPollerConfig (Amazon MSK and self-managed Apache Kafka only) The
     * provisioned mode configuration for the event source. 
     */
    override fun provisionedPollerConfig(provisionedPollerConfig: IResolvable) {
      cdkBuilder.provisionedPollerConfig(provisionedPollerConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
     * event source.
     *
     * For more information, see [provisioned
     * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig)
     * @param provisionedPollerConfig (Amazon MSK and self-managed Apache Kafka only) The
     * provisioned mode configuration for the event source. 
     */
    override fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfigProperty) {
      cdkBuilder.provisionedPollerConfig(provisionedPollerConfig.let(ProvisionedPollerConfigProperty.Companion::unwrap))
    }

    /**
     * (Amazon MSK and self-managed Apache Kafka only) The provisioned mode configuration for the
     * event source.
     *
     * For more information, see [provisioned
     * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig)
     * @param provisionedPollerConfig (Amazon MSK and self-managed Apache Kafka only) The
     * provisioned mode configuration for the event source. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0b215111ab3d4f75b36197045dbc98da664e690dbe1679af16c41f86fb8f93be")
    override
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfigProperty.Builder.() -> Unit):
        Unit = provisionedPollerConfig(ProvisionedPollerConfigProperty(provisionedPollerConfig))

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
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.scalingConfig(scalingConfig.let(ScalingConfigProperty.Companion::unwrap))
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
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * The self-managed Apache Kafka cluster for your event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     * @param selfManagedEventSource The self-managed Apache Kafka cluster for your event source. 
     */
    override fun selfManagedEventSource(selfManagedEventSource: SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(SelfManagedEventSourceProperty.Companion::unwrap))
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
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(SelfManagedKafkaEventSourceConfigProperty.Companion::unwrap))
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
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable.Companion::unwrap))
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
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map{CdkObjectWrappers.unwrap(it)})
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
     * A list of tags to add to the event source mapping.
     *
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags A list of tags to add to the event source mapping. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of tags to add to the event source mapping.
     *
     *
     * You must have the `lambda:TagResource` , `lambda:UntagResource` , and `lambda:ListTags`
     * permissions for your [IAM
     * principal](https://docs.aws.amazon.com/IAM/latest/UserGuide/id_roles_terms-and-concepts.html) to
     * manage the AWS CloudFormation stack. If you don't have these permissions, there might be
     * unexpected behavior with stack-level tags propagating to the resource during resource creation
     * and update.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     * @param tags A list of tags to add to the event source mapping. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
   * .schemaRegistryConfig(SchemaRegistryConfigProperty.builder()
   * .accessConfigs(List.of(SchemaRegistryAccessConfigProperty.builder()
   * .type("type")
   * .uri("uri")
   * .build()))
   * .eventRecordFormat("eventRecordFormat")
   * .schemaRegistryUri("schemaRegistryUri")
   * .schemaValidationConfigs(List.of(SchemaValidationConfigProperty.builder()
   * .attribute("attribute")
   * .build()))
   * .build())
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
     * Specific configuration settings for a Kafka schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig-schemaregistryconfig)
     */
    public fun schemaRegistryConfig(): Any? = unwrap(this).getSchemaRegistryConfig()

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

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      public fun schemaRegistryConfig(schemaRegistryConfig: IResolvable)

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      public fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty)

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb1b46c9563a771cad305a1b367162f8ffa10b32b3b667fa6618083885b9dc19")
      public
          fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty.Builder.() -> Unit)
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

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      override fun schemaRegistryConfig(schemaRegistryConfig: IResolvable) {
        cdkBuilder.schemaRegistryConfig(schemaRegistryConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      override fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty) {
        cdkBuilder.schemaRegistryConfig(schemaRegistryConfig.let(SchemaRegistryConfigProperty.Companion::unwrap))
      }

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fb1b46c9563a771cad305a1b367162f8ffa10b32b3b667fa6618083885b9dc19")
      override
          fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty.Builder.() -> Unit):
          Unit = schemaRegistryConfig(SchemaRegistryConfigProperty(schemaRegistryConfig))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty,
    ) : CdkObject(cdkObject),
        AmazonManagedKafkaEventSourceConfigProperty {
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

      /**
       * Specific configuration settings for a Kafka schema registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig-schemaregistryconfig)
       */
      override fun schemaRegistryConfig(): Any? = unwrap(this).getSchemaRegistryConfig()
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
   * For more information, see [Adding a
   * destination](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async-retain-records.html#invocation-async-destinations)
   * .
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
        cdkBuilder.onFailure(onFailure.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param onFailure The destination configuration for failed invocations.
       */
      override fun onFailure(onFailure: OnFailureProperty) {
        cdkBuilder.onFailure(onFailure.let(OnFailureProperty.Companion::unwrap))
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
    ) : CdkObject(cdkObject),
        DestinationConfigProperty {
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
    ) : CdkObject(cdkObject),
        DocumentDBEventSourceConfigProperty {
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
    ) : CdkObject(cdkObject),
        EndpointsProperty {
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
        cdkBuilder.filters(filters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filters A list of filters.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters.map{CdkObjectWrappers.unwrap(it)})
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
    ) : CdkObject(cdkObject),
        FilterCriteriaProperty {
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
    ) : CdkObject(cdkObject),
        FilterProperty {
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
   * The metrics configuration for your event source.
   *
   * Use this configuration object to define which metrics you want your event source mapping to
   * produce.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * MetricsConfigProperty metricsConfigProperty = MetricsConfigProperty.builder()
   * .metrics(List.of("metrics"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-metricsconfig.html)
   */
  public interface MetricsConfigProperty {
    /**
     * The metrics you want your event source mapping to produce.
     *
     * Include `EventCount` to receive event source mapping metrics related to the number of events
     * processed by your event source mapping. For more information about these metrics, see [Event
     * source mapping
     * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-metricsconfig.html#cfn-lambda-eventsourcemapping-metricsconfig-metrics)
     */
    public fun metrics(): List<String> = unwrap(this).getMetrics() ?: emptyList()

    /**
     * A builder for [MetricsConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param metrics The metrics you want your event source mapping to produce.
       * Include `EventCount` to receive event source mapping metrics related to the number of
       * events processed by your event source mapping. For more information about these metrics, see
       * [Event source mapping
       * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
       * .
       */
      public fun metrics(metrics: List<String>)

      /**
       * @param metrics The metrics you want your event source mapping to produce.
       * Include `EventCount` to receive event source mapping metrics related to the number of
       * events processed by your event source mapping. For more information about these metrics, see
       * [Event source mapping
       * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
       * .
       */
      public fun metrics(vararg metrics: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty.builder()

      /**
       * @param metrics The metrics you want your event source mapping to produce.
       * Include `EventCount` to receive event source mapping metrics related to the number of
       * events processed by your event source mapping. For more information about these metrics, see
       * [Event source mapping
       * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
       * .
       */
      override fun metrics(metrics: List<String>) {
        cdkBuilder.metrics(metrics)
      }

      /**
       * @param metrics The metrics you want your event source mapping to produce.
       * Include `EventCount` to receive event source mapping metrics related to the number of
       * events processed by your event source mapping. For more information about these metrics, see
       * [Event source mapping
       * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
       * .
       */
      override fun metrics(vararg metrics: String): Unit = metrics(metrics.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty,
    ) : CdkObject(cdkObject),
        MetricsConfigProperty {
      /**
       * The metrics you want your event source mapping to produce.
       *
       * Include `EventCount` to receive event source mapping metrics related to the number of
       * events processed by your event source mapping. For more information about these metrics, see
       * [Event source mapping
       * metrics](https://docs.aws.amazon.com/lambda/latest/dg/monitoring-metrics-types.html#event-source-mapping-metrics)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-metricsconfig.html#cfn-lambda-eventsourcemapping-metricsconfig-metrics)
       */
      override fun metrics(): List<String> = unwrap(this).getMetrics() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetricsConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty):
          MetricsConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? MetricsConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetricsConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.MetricsConfigProperty
    }
  }

  /**
   * A destination for events that failed processing.
   *
   * For more information, see [Adding a
   * destination](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async-retain-records.html#invocation-async-destinations)
   * .
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
     * To retain records of unsuccessful [asynchronous
     * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
     * , you can configure an Amazon SNS topic, Amazon SQS queue, Amazon S3 bucket, Lambda function, or
     * Amazon EventBridge event bus as the destination.
     *
     * To retain records of failed invocations from
     * [Kinesis](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html) ,
     * [DynamoDB](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html) , [self-managed
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
       * To retain records of unsuccessful [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Amazon S3 bucket, Lambda function,
       * or Amazon EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from
       * [Kinesis](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html) ,
       * [DynamoDB](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html) , [self-managed
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
       * To retain records of unsuccessful [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Amazon S3 bucket, Lambda function,
       * or Amazon EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from
       * [Kinesis](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html) ,
       * [DynamoDB](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html) , [self-managed
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
    ) : CdkObject(cdkObject),
        OnFailureProperty {
      /**
       * The Amazon Resource Name (ARN) of the destination resource.
       *
       * To retain records of unsuccessful [asynchronous
       * invocations](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html#invocation-async-destinations)
       * , you can configure an Amazon SNS topic, Amazon SQS queue, Amazon S3 bucket, Lambda function,
       * or Amazon EventBridge event bus as the destination.
       *
       * To retain records of failed invocations from
       * [Kinesis](https://docs.aws.amazon.com/lambda/latest/dg/with-kinesis.html) ,
       * [DynamoDB](https://docs.aws.amazon.com/lambda/latest/dg/with-ddb.html) , [self-managed
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
   * The [provisioned
   * mode](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-provisioned-mode)
   * configuration for the event source. Use provisioned mode to customize the minimum and maximum
   * number of event pollers for your event source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * ProvisionedPollerConfigProperty provisionedPollerConfigProperty =
   * ProvisionedPollerConfigProperty.builder()
   * .maximumPollers(123)
   * .minimumPollers(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-provisionedpollerconfig.html)
   */
  public interface ProvisionedPollerConfigProperty {
    /**
     * The maximum number of event pollers this event source can scale up to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-provisionedpollerconfig.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig-maximumpollers)
     */
    public fun maximumPollers(): Number? = unwrap(this).getMaximumPollers()

    /**
     * The minimum number of event pollers this event source can scale down to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-provisionedpollerconfig.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig-minimumpollers)
     */
    public fun minimumPollers(): Number? = unwrap(this).getMinimumPollers()

    /**
     * A builder for [ProvisionedPollerConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximumPollers The maximum number of event pollers this event source can scale up
       * to.
       */
      public fun maximumPollers(maximumPollers: Number)

      /**
       * @param minimumPollers The minimum number of event pollers this event source can scale down
       * to.
       */
      public fun minimumPollers(minimumPollers: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty.builder()

      /**
       * @param maximumPollers The maximum number of event pollers this event source can scale up
       * to.
       */
      override fun maximumPollers(maximumPollers: Number) {
        cdkBuilder.maximumPollers(maximumPollers)
      }

      /**
       * @param minimumPollers The minimum number of event pollers this event source can scale down
       * to.
       */
      override fun minimumPollers(minimumPollers: Number) {
        cdkBuilder.minimumPollers(minimumPollers)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty,
    ) : CdkObject(cdkObject),
        ProvisionedPollerConfigProperty {
      /**
       * The maximum number of event pollers this event source can scale up to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-provisionedpollerconfig.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig-maximumpollers)
       */
      override fun maximumPollers(): Number? = unwrap(this).getMaximumPollers()

      /**
       * The minimum number of event pollers this event source can scale down to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-provisionedpollerconfig.html#cfn-lambda-eventsourcemapping-provisionedpollerconfig-minimumpollers)
       */
      override fun minimumPollers(): Number? = unwrap(this).getMinimumPollers()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ProvisionedPollerConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty):
          ProvisionedPollerConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ProvisionedPollerConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProvisionedPollerConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.ProvisionedPollerConfigProperty
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
    ) : CdkObject(cdkObject),
        ScalingConfigProperty {
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
   * Specific access configuration settings that tell Lambda how to authenticate with your schema
   * registry.
   *
   * If you're working with an AWS Glue schema registry, don't provide authentication details in
   * this object. Instead, ensure that your execution role has the required permissions for Lambda to
   * access your cluster.
   *
   * If you're working with a Confluent schema registry, choose the authentication method in the
   * `Type` field, and provide the AWS Secrets Manager secret ARN in the `URI` field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SchemaRegistryAccessConfigProperty schemaRegistryAccessConfigProperty =
   * SchemaRegistryAccessConfigProperty.builder()
   * .type("type")
   * .uri("uri")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryaccessconfig.html)
   */
  public interface SchemaRegistryAccessConfigProperty {
    /**
     * The type of authentication Lambda uses to access your schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryaccessconfig.html#cfn-lambda-eventsourcemapping-schemaregistryaccessconfig-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * The URI of the secret (Secrets Manager secret ARN) to authenticate with your schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryaccessconfig.html#cfn-lambda-eventsourcemapping-schemaregistryaccessconfig-uri)
     */
    public fun uri(): String? = unwrap(this).getUri()

    /**
     * A builder for [SchemaRegistryAccessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type The type of authentication Lambda uses to access your schema registry.
       */
      public fun type(type: String)

      /**
       * @param uri The URI of the secret (Secrets Manager secret ARN) to authenticate with your
       * schema registry.
       */
      public fun uri(uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty.builder()

      /**
       * @param type The type of authentication Lambda uses to access your schema registry.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      /**
       * @param uri The URI of the secret (Secrets Manager secret ARN) to authenticate with your
       * schema registry.
       */
      override fun uri(uri: String) {
        cdkBuilder.uri(uri)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty,
    ) : CdkObject(cdkObject),
        SchemaRegistryAccessConfigProperty {
      /**
       * The type of authentication Lambda uses to access your schema registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryaccessconfig.html#cfn-lambda-eventsourcemapping-schemaregistryaccessconfig-type)
       */
      override fun type(): String? = unwrap(this).getType()

      /**
       * The URI of the secret (Secrets Manager secret ARN) to authenticate with your schema
       * registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryaccessconfig.html#cfn-lambda-eventsourcemapping-schemaregistryaccessconfig-uri)
       */
      override fun uri(): String? = unwrap(this).getUri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SchemaRegistryAccessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty):
          SchemaRegistryAccessConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SchemaRegistryAccessConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaRegistryAccessConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryAccessConfigProperty
    }
  }

  /**
   * Specific configuration settings for a Kafka schema registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SchemaRegistryConfigProperty schemaRegistryConfigProperty =
   * SchemaRegistryConfigProperty.builder()
   * .accessConfigs(List.of(SchemaRegistryAccessConfigProperty.builder()
   * .type("type")
   * .uri("uri")
   * .build()))
   * .eventRecordFormat("eventRecordFormat")
   * .schemaRegistryUri("schemaRegistryUri")
   * .schemaValidationConfigs(List.of(SchemaValidationConfigProperty.builder()
   * .attribute("attribute")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html)
   */
  public interface SchemaRegistryConfigProperty {
    /**
     * An array of access configuration objects that tell Lambda how to authenticate with your
     * schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-accessconfigs)
     */
    public fun accessConfigs(): Any? = unwrap(this).getAccessConfigs()

    /**
     * The record format that Lambda delivers to your function after schema validation.
     *
     * * Choose `JSON` to have Lambda deliver the record to your function as a standard JSON object.
     * * Choose `SOURCE` to have Lambda deliver the record to your function in its original source
     * format. Lambda removes all schema metadata, such as the schema ID, before sending the record to
     * your function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-eventrecordformat)
     */
    public fun eventRecordFormat(): String? = unwrap(this).getEventRecordFormat()

    /**
     * The URI for your schema registry. The correct URI format depends on the type of schema
     * registry you're using.
     *
     * * For AWS Glue schema registries, use the ARN of the registry.
     * * For Confluent schema registries, use the URL of the registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-schemaregistryuri)
     */
    public fun schemaRegistryUri(): String? = unwrap(this).getSchemaRegistryUri()

    /**
     * An array of schema validation configuration objects, which tell Lambda the message attributes
     * you want to validate and filter using your schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-schemavalidationconfigs)
     */
    public fun schemaValidationConfigs(): Any? = unwrap(this).getSchemaValidationConfigs()

    /**
     * A builder for [SchemaRegistryConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessConfigs An array of access configuration objects that tell Lambda how to
       * authenticate with your schema registry.
       */
      public fun accessConfigs(accessConfigs: IResolvable)

      /**
       * @param accessConfigs An array of access configuration objects that tell Lambda how to
       * authenticate with your schema registry.
       */
      public fun accessConfigs(accessConfigs: List<Any>)

      /**
       * @param accessConfigs An array of access configuration objects that tell Lambda how to
       * authenticate with your schema registry.
       */
      public fun accessConfigs(vararg accessConfigs: Any)

      /**
       * @param eventRecordFormat The record format that Lambda delivers to your function after
       * schema validation.
       * * Choose `JSON` to have Lambda deliver the record to your function as a standard JSON
       * object.
       * * Choose `SOURCE` to have Lambda deliver the record to your function in its original source
       * format. Lambda removes all schema metadata, such as the schema ID, before sending the record
       * to your function.
       */
      public fun eventRecordFormat(eventRecordFormat: String)

      /**
       * @param schemaRegistryUri The URI for your schema registry. The correct URI format depends
       * on the type of schema registry you're using.
       * * For AWS Glue schema registries, use the ARN of the registry.
       * * For Confluent schema registries, use the URL of the registry.
       */
      public fun schemaRegistryUri(schemaRegistryUri: String)

      /**
       * @param schemaValidationConfigs An array of schema validation configuration objects, which
       * tell Lambda the message attributes you want to validate and filter using your schema registry.
       */
      public fun schemaValidationConfigs(schemaValidationConfigs: IResolvable)

      /**
       * @param schemaValidationConfigs An array of schema validation configuration objects, which
       * tell Lambda the message attributes you want to validate and filter using your schema registry.
       */
      public fun schemaValidationConfigs(schemaValidationConfigs: List<Any>)

      /**
       * @param schemaValidationConfigs An array of schema validation configuration objects, which
       * tell Lambda the message attributes you want to validate and filter using your schema registry.
       */
      public fun schemaValidationConfigs(vararg schemaValidationConfigs: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty.builder()

      /**
       * @param accessConfigs An array of access configuration objects that tell Lambda how to
       * authenticate with your schema registry.
       */
      override fun accessConfigs(accessConfigs: IResolvable) {
        cdkBuilder.accessConfigs(accessConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param accessConfigs An array of access configuration objects that tell Lambda how to
       * authenticate with your schema registry.
       */
      override fun accessConfigs(accessConfigs: List<Any>) {
        cdkBuilder.accessConfigs(accessConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param accessConfigs An array of access configuration objects that tell Lambda how to
       * authenticate with your schema registry.
       */
      override fun accessConfigs(vararg accessConfigs: Any): Unit =
          accessConfigs(accessConfigs.toList())

      /**
       * @param eventRecordFormat The record format that Lambda delivers to your function after
       * schema validation.
       * * Choose `JSON` to have Lambda deliver the record to your function as a standard JSON
       * object.
       * * Choose `SOURCE` to have Lambda deliver the record to your function in its original source
       * format. Lambda removes all schema metadata, such as the schema ID, before sending the record
       * to your function.
       */
      override fun eventRecordFormat(eventRecordFormat: String) {
        cdkBuilder.eventRecordFormat(eventRecordFormat)
      }

      /**
       * @param schemaRegistryUri The URI for your schema registry. The correct URI format depends
       * on the type of schema registry you're using.
       * * For AWS Glue schema registries, use the ARN of the registry.
       * * For Confluent schema registries, use the URL of the registry.
       */
      override fun schemaRegistryUri(schemaRegistryUri: String) {
        cdkBuilder.schemaRegistryUri(schemaRegistryUri)
      }

      /**
       * @param schemaValidationConfigs An array of schema validation configuration objects, which
       * tell Lambda the message attributes you want to validate and filter using your schema registry.
       */
      override fun schemaValidationConfigs(schemaValidationConfigs: IResolvable) {
        cdkBuilder.schemaValidationConfigs(schemaValidationConfigs.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param schemaValidationConfigs An array of schema validation configuration objects, which
       * tell Lambda the message attributes you want to validate and filter using your schema registry.
       */
      override fun schemaValidationConfigs(schemaValidationConfigs: List<Any>) {
        cdkBuilder.schemaValidationConfigs(schemaValidationConfigs.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param schemaValidationConfigs An array of schema validation configuration objects, which
       * tell Lambda the message attributes you want to validate and filter using your schema registry.
       */
      override fun schemaValidationConfigs(vararg schemaValidationConfigs: Any): Unit =
          schemaValidationConfigs(schemaValidationConfigs.toList())

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty,
    ) : CdkObject(cdkObject),
        SchemaRegistryConfigProperty {
      /**
       * An array of access configuration objects that tell Lambda how to authenticate with your
       * schema registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-accessconfigs)
       */
      override fun accessConfigs(): Any? = unwrap(this).getAccessConfigs()

      /**
       * The record format that Lambda delivers to your function after schema validation.
       *
       * * Choose `JSON` to have Lambda deliver the record to your function as a standard JSON
       * object.
       * * Choose `SOURCE` to have Lambda deliver the record to your function in its original source
       * format. Lambda removes all schema metadata, such as the schema ID, before sending the record
       * to your function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-eventrecordformat)
       */
      override fun eventRecordFormat(): String? = unwrap(this).getEventRecordFormat()

      /**
       * The URI for your schema registry. The correct URI format depends on the type of schema
       * registry you're using.
       *
       * * For AWS Glue schema registries, use the ARN of the registry.
       * * For Confluent schema registries, use the URL of the registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-schemaregistryuri)
       */
      override fun schemaRegistryUri(): String? = unwrap(this).getSchemaRegistryUri()

      /**
       * An array of schema validation configuration objects, which tell Lambda the message
       * attributes you want to validate and filter using your schema registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemaregistryconfig.html#cfn-lambda-eventsourcemapping-schemaregistryconfig-schemavalidationconfigs)
       */
      override fun schemaValidationConfigs(): Any? = unwrap(this).getSchemaValidationConfigs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaRegistryConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty):
          SchemaRegistryConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SchemaRegistryConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaRegistryConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaRegistryConfigProperty
    }
  }

  /**
   * Specific schema validation configuration settings that tell Lambda the message attributes you
   * want to validate and filter using your schema registry.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lambda.*;
   * SchemaValidationConfigProperty schemaValidationConfigProperty =
   * SchemaValidationConfigProperty.builder()
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemavalidationconfig.html)
   */
  public interface SchemaValidationConfigProperty {
    /**
     * The attributes you want your schema registry to validate and filter for.
     *
     * If you selected `JSON` as the `EventRecordFormat` , Lambda also deserializes the selected
     * message attributes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemavalidationconfig.html#cfn-lambda-eventsourcemapping-schemavalidationconfig-attribute)
     */
    public fun attribute(): String? = unwrap(this).getAttribute()

    /**
     * A builder for [SchemaValidationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The attributes you want your schema registry to validate and filter for.
       * If you selected `JSON` as the `EventRecordFormat` , Lambda also deserializes the selected
       * message attributes.
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty.Builder
          =
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty.builder()

      /**
       * @param attribute The attributes you want your schema registry to validate and filter for.
       * If you selected `JSON` as the `EventRecordFormat` , Lambda also deserializes the selected
       * message attributes.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty,
    ) : CdkObject(cdkObject),
        SchemaValidationConfigProperty {
      /**
       * The attributes you want your schema registry to validate and filter for.
       *
       * If you selected `JSON` as the `EventRecordFormat` , Lambda also deserializes the selected
       * message attributes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-schemavalidationconfig.html#cfn-lambda-eventsourcemapping-schemavalidationconfig-attribute)
       */
      override fun attribute(): String? = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaValidationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty):
          SchemaValidationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SchemaValidationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaValidationConfigProperty):
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SchemaValidationConfigProperty
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
        cdkBuilder.endpoints(endpoints.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
       * format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
       */
      override fun endpoints(endpoints: EndpointsProperty) {
        cdkBuilder.endpoints(endpoints.let(EndpointsProperty.Companion::unwrap))
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
    ) : CdkObject(cdkObject),
        SelfManagedEventSourceProperty {
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
   * .schemaRegistryConfig(SchemaRegistryConfigProperty.builder()
   * .accessConfigs(List.of(SchemaRegistryAccessConfigProperty.builder()
   * .type("type")
   * .uri("uri")
   * .build()))
   * .eventRecordFormat("eventRecordFormat")
   * .schemaRegistryUri("schemaRegistryUri")
   * .schemaValidationConfigs(List.of(SchemaValidationConfigProperty.builder()
   * .attribute("attribute")
   * .build()))
   * .build())
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
     * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka-process.html#services-smaa-topic-add)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig-consumergroupid)
     */
    public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

    /**
     * Specific configuration settings for a Kafka schema registry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig-schemaregistryconfig)
     */
    public fun schemaRegistryConfig(): Any? = unwrap(this).getSchemaRegistryConfig()

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
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka-process.html#services-smaa-topic-add)
       * .
       */
      public fun consumerGroupId(consumerGroupId: String)

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      public fun schemaRegistryConfig(schemaRegistryConfig: IResolvable)

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      public fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty)

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8c619e39be7a161e99b2035536e9355069d963b8c721cce67764ed1e4127e37")
      public
          fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty.Builder.() -> Unit)
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
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka-process.html#services-smaa-topic-add)
       * .
       */
      override fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
      }

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      override fun schemaRegistryConfig(schemaRegistryConfig: IResolvable) {
        cdkBuilder.schemaRegistryConfig(schemaRegistryConfig.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      override fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty) {
        cdkBuilder.schemaRegistryConfig(schemaRegistryConfig.let(SchemaRegistryConfigProperty.Companion::unwrap))
      }

      /**
       * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b8c619e39be7a161e99b2035536e9355069d963b8c721cce67764ed1e4127e37")
      override
          fun schemaRegistryConfig(schemaRegistryConfig: SchemaRegistryConfigProperty.Builder.() -> Unit):
          Unit = schemaRegistryConfig(SchemaRegistryConfigProperty(schemaRegistryConfig))

      public fun build():
          software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty,
    ) : CdkObject(cdkObject),
        SelfManagedKafkaEventSourceConfigProperty {
      /**
       * The identifier for the Kafka consumer group to join.
       *
       * The consumer group ID must be unique among all your Kafka event sources. After creating a
       * Kafka event source mapping with the consumer group ID specified, you cannot update this value.
       * For more information, see [Customizable consumer group
       * ID](https://docs.aws.amazon.com/lambda/latest/dg/with-kafka-process.html#services-smaa-topic-add)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig-consumergroupid)
       */
      override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

      /**
       * Specific configuration settings for a Kafka schema registry.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig-schemaregistryconfig)
       */
      override fun schemaRegistryConfig(): Any? = unwrap(this).getSchemaRegistryConfig()
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
    ) : CdkObject(cdkObject),
        SourceAccessConfigurationProperty {
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
