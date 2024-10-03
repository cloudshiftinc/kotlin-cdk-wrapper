@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CfnTag
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
public interface CfnEventSourceMappingProps {
  /**
   * Specific configuration settings for an MSK event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
   */
  public fun amazonManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getAmazonManagedKafkaEventSourceConfig()

  /**
   * The maximum number of items to retrieve in a single batch.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
   */
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  /**
   * (Streams) If the function returns an error, split the batch in two and retry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
   */
  public fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

  /**
   * A configuration object that specifies the destination of an event after Lambda processes it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
   */
  public fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

  /**
   * Document db event source config.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
   */
  public fun documentDbEventSourceConfig(): Any? = unwrap(this).getDocumentDbEventSourceConfig()

  /**
   * Disables the event source mapping to pause polling and invocation.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * The Amazon Resource Name (ARN) of the event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
   */
  public fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

  /**
   * The filter criteria to control event filtering.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
   */
  public fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

  /**
   * The name of the Lambda function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
   */
  public fun functionName(): String

  /**
   * (Streams) A list of response types supported by the function.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
   */
  public fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
      emptyList()

  /**
   * The Amazon Resource Name (ARN) of the KMS key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-kmskeyarn)
   */
  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  /**
   * (Streams) The maximum amount of time to gather records before invoking the function, in
   * seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds)
   */
  public fun maximumBatchingWindowInSeconds(): Number? =
      unwrap(this).getMaximumBatchingWindowInSeconds()

  /**
   * (Streams) The maximum age of a record that Lambda sends to a function for processing.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
   */
  public fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

  /**
   * (Streams) The maximum number of times to retry when the function returns an error.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
   */
  public fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

  /**
   * (Streams) The number of batches to process from each shard concurrently.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
   */
  public fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

  /**
   * (ActiveMQ) A list of ActiveMQ queues.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
   */
  public fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

  /**
   * The scaling configuration for the event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
   */
  public fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

  /**
   * The configuration used by AWS Lambda to access a self-managed event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
   */
  public fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

  /**
   * Specific configuration settings for a Self-Managed Apache Kafka event source.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
   */
  public fun selfManagedKafkaEventSourceConfig(): Any? =
      unwrap(this).getSelfManagedKafkaEventSourceConfig()

  /**
   * A list of SourceAccessConfiguration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
   */
  public fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

  /**
   * The position in a stream from which to start reading.
   *
   * Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
   */
  public fun startingPosition(): String? = unwrap(this).getStartingPosition()

  /**
   * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time
   * seconds.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
   */
  public fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * (Kafka) A list of Kafka topics.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
   */
  public fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

  /**
   * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
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
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source.
     */
    public fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable)

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source.
     */
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty)

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9284c4da4983caa97612e7b01c42241967f360aa7dd95373593dc8311c6aa")
    public
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param batchSize The maximum number of items to retrieve in a single batch.
     */
    public fun batchSize(batchSize: Number)

    /**
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean)

    /**
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry.
     */
    public fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable)

    /**
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    public fun destinationConfig(destinationConfig: IResolvable)

    /**
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    public fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty)

    /**
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb5cce258aa75796eb59a269c1fef538aacd71fcc93528503b2b03792d5f23f4")
    public
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit)

    /**
     * @param documentDbEventSourceConfig Document db event source config.
     */
    public fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable)

    /**
     * @param documentDbEventSourceConfig Document db event source config.
     */
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty)

    /**
     * @param documentDbEventSourceConfig Document db event source config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d09fb314ca9893c0049527cb14bf2c10d2ff9b3b75d94621775da00c0e2ba4e7")
    public
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param enabled Disables the event source mapping to pause polling and invocation.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Disables the event source mapping to pause polling and invocation.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     */
    public fun eventSourceArn(eventSourceArn: String)

    /**
     * @param filterCriteria The filter criteria to control event filtering.
     */
    public fun filterCriteria(filterCriteria: IResolvable)

    /**
     * @param filterCriteria The filter criteria to control event filtering.
     */
    public fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty)

    /**
     * @param filterCriteria The filter criteria to control event filtering.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64d63e409c55293cf7b59494387d9651b3d5c3761ad44584ecbc98ce165317b3")
    public
        fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit)

    /**
     * @param functionName The name of the Lambda function. 
     */
    public fun functionName(functionName: String)

    /**
     * @param functionResponseTypes (Streams) A list of response types supported by the function.
     */
    public fun functionResponseTypes(functionResponseTypes: List<String>)

    /**
     * @param functionResponseTypes (Streams) A list of response types supported by the function.
     */
    public fun functionResponseTypes(vararg functionResponseTypes: String)

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key.
     */
    public fun kmsKeyArn(kmsKeyArn: String)

    /**
     * @param maximumBatchingWindowInSeconds (Streams) The maximum amount of time to gather records
     * before invoking the function, in seconds.
     */
    public fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number)

    /**
     * @param maximumRecordAgeInSeconds (Streams) The maximum age of a record that Lambda sends to a
     * function for processing.
     */
    public fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number)

    /**
     * @param maximumRetryAttempts (Streams) The maximum number of times to retry when the function
     * returns an error.
     */
    public fun maximumRetryAttempts(maximumRetryAttempts: Number)

    /**
     * @param parallelizationFactor (Streams) The number of batches to process from each shard
     * concurrently.
     */
    public fun parallelizationFactor(parallelizationFactor: Number)

    /**
     * @param queues (ActiveMQ) A list of ActiveMQ queues.
     */
    public fun queues(queues: List<String>)

    /**
     * @param queues (ActiveMQ) A list of ActiveMQ queues.
     */
    public fun queues(vararg queues: String)

    /**
     * @param scalingConfig The scaling configuration for the event source.
     */
    public fun scalingConfig(scalingConfig: IResolvable)

    /**
     * @param scalingConfig The scaling configuration for the event source.
     */
    public fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty)

    /**
     * @param scalingConfig The scaling configuration for the event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac8a6eb426933fb2b88b6b01a6b43a8fc38a35b3ca922d3fffb4555c7fc2d5e")
    public
        fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit)

    /**
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source.
     */
    public fun selfManagedEventSource(selfManagedEventSource: IResolvable)

    /**
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source.
     */
    public
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty)

    /**
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb957a59dc8c21d665025789b750dee782b2a8aa37584acb897dbc5107c9aea")
    public
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit)

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source.
     */
    public fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable)

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source.
     */
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty)

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4feb2b9834757a9de4c9819fab63badbd08a0b7d2d0f13a526f333ee91a347")
    public
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit)

    /**
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable)

    /**
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
     */
    public fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>)

    /**
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
     */
    public fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any)

    /**
     * @param startingPosition The position in a stream from which to start reading.
     * Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     */
    public fun startingPosition(startingPosition: String)

    /**
     * @param startingPositionTimestamp With StartingPosition set to AT_TIMESTAMP, the time from
     * which to start reading, in Unix time seconds.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param topics (Kafka) A list of Kafka topics.
     */
    public fun topics(topics: List<String>)

    /**
     * @param topics (Kafka) A list of Kafka topics.
     */
    public fun topics(vararg topics: String)

    /**
     * @param tumblingWindowInSeconds (Streams) Tumbling window (non-overlapping time window)
     * duration to perform aggregations.
     */
    public fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.Builder =
        software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps.builder()

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source.
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source.
     */
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig.let(CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Companion::unwrap))
    }

    /**
     * @param amazonManagedKafkaEventSourceConfig Specific configuration settings for an MSK event
     * source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("aee9284c4da4983caa97612e7b01c42241967f360aa7dd95373593dc8311c6aa")
    override
        fun amazonManagedKafkaEventSourceConfig(amazonManagedKafkaEventSourceConfig: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        amazonManagedKafkaEventSourceConfig(CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty(amazonManagedKafkaEventSourceConfig))

    /**
     * @param batchSize The maximum number of items to retrieve in a single batch.
     */
    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    /**
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry.
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: Boolean) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError)
    }

    /**
     * @param bisectBatchOnFunctionError (Streams) If the function returns an error, split the batch
     * in two and retry.
     */
    override fun bisectBatchOnFunctionError(bisectBatchOnFunctionError: IResolvable) {
      cdkBuilder.bisectBatchOnFunctionError(bisectBatchOnFunctionError.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    override fun destinationConfig(destinationConfig: IResolvable) {
      cdkBuilder.destinationConfig(destinationConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    override
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty) {
      cdkBuilder.destinationConfig(destinationConfig.let(CfnEventSourceMapping.DestinationConfigProperty.Companion::unwrap))
    }

    /**
     * @param destinationConfig A configuration object that specifies the destination of an event
     * after Lambda processes it.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb5cce258aa75796eb59a269c1fef538aacd71fcc93528503b2b03792d5f23f4")
    override
        fun destinationConfig(destinationConfig: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit):
        Unit = destinationConfig(CfnEventSourceMapping.DestinationConfigProperty(destinationConfig))

    /**
     * @param documentDbEventSourceConfig Document db event source config.
     */
    override fun documentDbEventSourceConfig(documentDbEventSourceConfig: IResolvable) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param documentDbEventSourceConfig Document db event source config.
     */
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty) {
      cdkBuilder.documentDbEventSourceConfig(documentDbEventSourceConfig.let(CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Companion::unwrap))
    }

    /**
     * @param documentDbEventSourceConfig Document db event source config.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d09fb314ca9893c0049527cb14bf2c10d2ff9b3b75d94621775da00c0e2ba4e7")
    override
        fun documentDbEventSourceConfig(documentDbEventSourceConfig: CfnEventSourceMapping.DocumentDBEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        documentDbEventSourceConfig(CfnEventSourceMapping.DocumentDBEventSourceConfigProperty(documentDbEventSourceConfig))

    /**
     * @param enabled Disables the event source mapping to pause polling and invocation.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Disables the event source mapping to pause polling and invocation.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventSourceArn The Amazon Resource Name (ARN) of the event source.
     */
    override fun eventSourceArn(eventSourceArn: String) {
      cdkBuilder.eventSourceArn(eventSourceArn)
    }

    /**
     * @param filterCriteria The filter criteria to control event filtering.
     */
    override fun filterCriteria(filterCriteria: IResolvable) {
      cdkBuilder.filterCriteria(filterCriteria.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param filterCriteria The filter criteria to control event filtering.
     */
    override fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty) {
      cdkBuilder.filterCriteria(filterCriteria.let(CfnEventSourceMapping.FilterCriteriaProperty.Companion::unwrap))
    }

    /**
     * @param filterCriteria The filter criteria to control event filtering.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("64d63e409c55293cf7b59494387d9651b3d5c3761ad44584ecbc98ce165317b3")
    override
        fun filterCriteria(filterCriteria: CfnEventSourceMapping.FilterCriteriaProperty.Builder.() -> Unit):
        Unit = filterCriteria(CfnEventSourceMapping.FilterCriteriaProperty(filterCriteria))

    /**
     * @param functionName The name of the Lambda function. 
     */
    override fun functionName(functionName: String) {
      cdkBuilder.functionName(functionName)
    }

    /**
     * @param functionResponseTypes (Streams) A list of response types supported by the function.
     */
    override fun functionResponseTypes(functionResponseTypes: List<String>) {
      cdkBuilder.functionResponseTypes(functionResponseTypes)
    }

    /**
     * @param functionResponseTypes (Streams) A list of response types supported by the function.
     */
    override fun functionResponseTypes(vararg functionResponseTypes: String): Unit =
        functionResponseTypes(functionResponseTypes.toList())

    /**
     * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key.
     */
    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    /**
     * @param maximumBatchingWindowInSeconds (Streams) The maximum amount of time to gather records
     * before invoking the function, in seconds.
     */
    override fun maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds: Number) {
      cdkBuilder.maximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds)
    }

    /**
     * @param maximumRecordAgeInSeconds (Streams) The maximum age of a record that Lambda sends to a
     * function for processing.
     */
    override fun maximumRecordAgeInSeconds(maximumRecordAgeInSeconds: Number) {
      cdkBuilder.maximumRecordAgeInSeconds(maximumRecordAgeInSeconds)
    }

    /**
     * @param maximumRetryAttempts (Streams) The maximum number of times to retry when the function
     * returns an error.
     */
    override fun maximumRetryAttempts(maximumRetryAttempts: Number) {
      cdkBuilder.maximumRetryAttempts(maximumRetryAttempts)
    }

    /**
     * @param parallelizationFactor (Streams) The number of batches to process from each shard
     * concurrently.
     */
    override fun parallelizationFactor(parallelizationFactor: Number) {
      cdkBuilder.parallelizationFactor(parallelizationFactor)
    }

    /**
     * @param queues (ActiveMQ) A list of ActiveMQ queues.
     */
    override fun queues(queues: List<String>) {
      cdkBuilder.queues(queues)
    }

    /**
     * @param queues (ActiveMQ) A list of ActiveMQ queues.
     */
    override fun queues(vararg queues: String): Unit = queues(queues.toList())

    /**
     * @param scalingConfig The scaling configuration for the event source.
     */
    override fun scalingConfig(scalingConfig: IResolvable) {
      cdkBuilder.scalingConfig(scalingConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param scalingConfig The scaling configuration for the event source.
     */
    override fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty) {
      cdkBuilder.scalingConfig(scalingConfig.let(CfnEventSourceMapping.ScalingConfigProperty.Companion::unwrap))
    }

    /**
     * @param scalingConfig The scaling configuration for the event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7ac8a6eb426933fb2b88b6b01a6b43a8fc38a35b3ca922d3fffb4555c7fc2d5e")
    override
        fun scalingConfig(scalingConfig: CfnEventSourceMapping.ScalingConfigProperty.Builder.() -> Unit):
        Unit = scalingConfig(CfnEventSourceMapping.ScalingConfigProperty(scalingConfig))

    /**
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source.
     */
    override fun selfManagedEventSource(selfManagedEventSource: IResolvable) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source.
     */
    override
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty) {
      cdkBuilder.selfManagedEventSource(selfManagedEventSource.let(CfnEventSourceMapping.SelfManagedEventSourceProperty.Companion::unwrap))
    }

    /**
     * @param selfManagedEventSource The configuration used by AWS Lambda to access a self-managed
     * event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("feb957a59dc8c21d665025789b750dee782b2a8aa37584acb897dbc5107c9aea")
    override
        fun selfManagedEventSource(selfManagedEventSource: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit):
        Unit =
        selfManagedEventSource(CfnEventSourceMapping.SelfManagedEventSourceProperty(selfManagedEventSource))

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source.
     */
    override fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: IResolvable) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source.
     */
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty) {
      cdkBuilder.selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig.let(CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Companion::unwrap))
    }

    /**
     * @param selfManagedKafkaEventSourceConfig Specific configuration settings for a Self-Managed
     * Apache Kafka event source.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fb4feb2b9834757a9de4c9819fab63badbd08a0b7d2d0f13a526f333ee91a347")
    override
        fun selfManagedKafkaEventSourceConfig(selfManagedKafkaEventSourceConfig: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder.() -> Unit):
        Unit =
        selfManagedKafkaEventSourceConfig(CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty(selfManagedKafkaEventSourceConfig))

    /**
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: IResolvable) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
     */
    override fun sourceAccessConfigurations(sourceAccessConfigurations: List<Any>) {
      cdkBuilder.sourceAccessConfigurations(sourceAccessConfigurations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param sourceAccessConfigurations A list of SourceAccessConfiguration.
     */
    override fun sourceAccessConfigurations(vararg sourceAccessConfigurations: Any): Unit =
        sourceAccessConfigurations(sourceAccessConfigurations.toList())

    /**
     * @param startingPosition The position in a stream from which to start reading.
     * Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     */
    override fun startingPosition(startingPosition: String) {
      cdkBuilder.startingPosition(startingPosition)
    }

    /**
     * @param startingPositionTimestamp With StartingPosition set to AT_TIMESTAMP, the time from
     * which to start reading, in Unix time seconds.
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param topics (Kafka) A list of Kafka topics.
     */
    override fun topics(topics: List<String>) {
      cdkBuilder.topics(topics)
    }

    /**
     * @param topics (Kafka) A list of Kafka topics.
     */
    override fun topics(vararg topics: String): Unit = topics(topics.toList())

    /**
     * @param tumblingWindowInSeconds (Streams) Tumbling window (non-overlapping time window)
     * duration to perform aggregations.
     */
    override fun tumblingWindowInSeconds(tumblingWindowInSeconds: Number) {
      cdkBuilder.tumblingWindowInSeconds(tumblingWindowInSeconds)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps,
  ) : CdkObject(cdkObject),
      CfnEventSourceMappingProps {
    /**
     * Specific configuration settings for an MSK event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-amazonmanagedkafkaeventsourceconfig)
     */
    override fun amazonManagedKafkaEventSourceConfig(): Any? =
        unwrap(this).getAmazonManagedKafkaEventSourceConfig()

    /**
     * The maximum number of items to retrieve in a single batch.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize)
     */
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    /**
     * (Streams) If the function returns an error, split the batch in two and retry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-bisectbatchonfunctionerror)
     */
    override fun bisectBatchOnFunctionError(): Any? = unwrap(this).getBisectBatchOnFunctionError()

    /**
     * A configuration object that specifies the destination of an event after Lambda processes it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-destinationconfig)
     */
    override fun destinationConfig(): Any? = unwrap(this).getDestinationConfig()

    /**
     * Document db event source config.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-documentdbeventsourceconfig)
     */
    override fun documentDbEventSourceConfig(): Any? = unwrap(this).getDocumentDbEventSourceConfig()

    /**
     * Disables the event source mapping to pause polling and invocation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The Amazon Resource Name (ARN) of the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn)
     */
    override fun eventSourceArn(): String? = unwrap(this).getEventSourceArn()

    /**
     * The filter criteria to control event filtering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-filtercriteria)
     */
    override fun filterCriteria(): Any? = unwrap(this).getFilterCriteria()

    /**
     * The name of the Lambda function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname)
     */
    override fun functionName(): String = unwrap(this).getFunctionName()

    /**
     * (Streams) A list of response types supported by the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionresponsetypes)
     */
    override fun functionResponseTypes(): List<String> = unwrap(this).getFunctionResponseTypes() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-kmskeyarn)
     */
    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * (Streams) The maximum amount of time to gather records before invoking the function, in
     * seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds)
     */
    override fun maximumBatchingWindowInSeconds(): Number? =
        unwrap(this).getMaximumBatchingWindowInSeconds()

    /**
     * (Streams) The maximum age of a record that Lambda sends to a function for processing.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumrecordageinseconds)
     */
    override fun maximumRecordAgeInSeconds(): Number? = unwrap(this).getMaximumRecordAgeInSeconds()

    /**
     * (Streams) The maximum number of times to retry when the function returns an error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumretryattempts)
     */
    override fun maximumRetryAttempts(): Number? = unwrap(this).getMaximumRetryAttempts()

    /**
     * (Streams) The number of batches to process from each shard concurrently.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-parallelizationfactor)
     */
    override fun parallelizationFactor(): Number? = unwrap(this).getParallelizationFactor()

    /**
     * (ActiveMQ) A list of ActiveMQ queues.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-queues)
     */
    override fun queues(): List<String> = unwrap(this).getQueues() ?: emptyList()

    /**
     * The scaling configuration for the event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-scalingconfig)
     */
    override fun scalingConfig(): Any? = unwrap(this).getScalingConfig()

    /**
     * The configuration used by AWS Lambda to access a self-managed event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedeventsource)
     */
    override fun selfManagedEventSource(): Any? = unwrap(this).getSelfManagedEventSource()

    /**
     * Specific configuration settings for a Self-Managed Apache Kafka event source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig)
     */
    override fun selfManagedKafkaEventSourceConfig(): Any? =
        unwrap(this).getSelfManagedKafkaEventSourceConfig()

    /**
     * A list of SourceAccessConfiguration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-sourceaccessconfigurations)
     */
    override fun sourceAccessConfigurations(): Any? = unwrap(this).getSourceAccessConfigurations()

    /**
     * The position in a stream from which to start reading.
     *
     * Required for Amazon Kinesis and Amazon DynamoDB Streams sources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition)
     */
    override fun startingPosition(): String? = unwrap(this).getStartingPosition()

    /**
     * With StartingPosition set to AT_TIMESTAMP, the time from which to start reading, in Unix time
     * seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingpositiontimestamp)
     */
    override fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * (Kafka) A list of Kafka topics.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-topics)
     */
    override fun topics(): List<String> = unwrap(this).getTopics() ?: emptyList()

    /**
     * (Streams) Tumbling window (non-overlapping time window) duration to perform aggregations.
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
