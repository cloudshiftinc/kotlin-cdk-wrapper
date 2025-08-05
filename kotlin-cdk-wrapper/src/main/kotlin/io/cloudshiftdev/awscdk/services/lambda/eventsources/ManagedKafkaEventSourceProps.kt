@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.ISchemaRegistry
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for a MSK event source.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.secretsmanager.Secret;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.ManagedKafkaEventSource;
 * Function myFunction;
 * // Your MSK cluster arn
 * String clusterArn =
 * "arn:aws:kafka:us-east-1:0123456789019:cluster/SalesCluster/abcd1234-abcd-cafe-abab-9876543210ab-4";
 * // The Kafka topic you want to subscribe to
 * String topic = "some-cool-topic";
 * // The secret that allows access to your MSK cluster
 * // You still have to make sure that it is associated with your cluster as described in the
 * documentation
 * Secret secret = Secret.Builder.create(this,
 * "Secret").secretName("AmazonMSK_KafkaSecret").build();
 * myFunction.addEventSource(ManagedKafkaEventSource.Builder.create()
 * .clusterArn(clusterArn)
 * .topic(topic)
 * .secret(secret)
 * .batchSize(100) // default
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .build());
 * ```
 */
public interface ManagedKafkaEventSourceProps : KafkaEventSourceProps {
  /**
   * An MSK cluster construct.
   */
  public fun clusterArn(): String

  /**
   * A builder for [ManagedKafkaEventSourceProps]
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
     * @param clusterArn An MSK cluster construct. 
     */
    public fun clusterArn(clusterArn: String)

    /**
     * @param consumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a length between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     */
    public fun consumerGroupId(consumerGroupId: String)

    /**
     * @param enabled If the stream event source mapping should be enabled.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param filterEncryption Add Customer managed KMS key to encrypt Filter Criteria.
     */
    public fun filterEncryption(filterEncryption: IKey)

    /**
     * @param filters Add filter criteria to Event Source.
     */
    public fun filters(filters: List<Map<String, Any>>)

    /**
     * @param filters Add filter criteria to Event Source.
     */
    public fun filters(vararg filters: Map<String, Any>)

    /**
     * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
     * function.
     * Maximum of Duration.minutes(5).
     */
    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    /**
     * @param onFailure Add an on Failure Destination for this Kafka event.
     * SNS/SQS/S3 are supported
     */
    public fun onFailure(onFailure: IEventSourceDlq)

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
    @JvmName("efd806b601382156f057dbdc15b8be68afc0030a102a07ca26b33992871c9e12")
    public
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit)

    /**
     * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
     */
    public fun schemaRegistryConfig(schemaRegistryConfig: ISchemaRegistry)

    /**
     * @param secret The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     */
    public fun secret(secret: ISecret)

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    public fun startingPosition(startingPosition: StartingPosition)

    /**
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds.
     */
    public fun startingPositionTimestamp(startingPositionTimestamp: Number)

    /**
     * @param topic The Kafka topic to subscribe to. 
     */
    public fun topic(topic: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps.builder()

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
     * @param clusterArn An MSK cluster construct. 
     */
    override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    /**
     * @param consumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a length between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     */
    override fun consumerGroupId(consumerGroupId: String) {
      cdkBuilder.consumerGroupId(consumerGroupId)
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
     * @param filters Add filter criteria to Event Source.
     */
    override fun filters(filters: List<Map<String, Any>>) {
      cdkBuilder.filters(filters)
    }

    /**
     * @param filters Add filter criteria to Event Source.
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
     * @param onFailure Add an on Failure Destination for this Kafka event.
     * SNS/SQS/S3 are supported
     */
    override fun onFailure(onFailure: IEventSourceDlq) {
      cdkBuilder.onFailure(onFailure.let(IEventSourceDlq.Companion::unwrap))
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
    @JvmName("efd806b601382156f057dbdc15b8be68afc0030a102a07ca26b33992871c9e12")
    override
        fun provisionedPollerConfig(provisionedPollerConfig: ProvisionedPollerConfig.Builder.() -> Unit):
        Unit = provisionedPollerConfig(ProvisionedPollerConfig(provisionedPollerConfig))

    /**
     * @param schemaRegistryConfig Specific configuration settings for a Kafka schema registry.
     */
    override fun schemaRegistryConfig(schemaRegistryConfig: ISchemaRegistry) {
      cdkBuilder.schemaRegistryConfig(schemaRegistryConfig.let(ISchemaRegistry.Companion::unwrap))
    }

    /**
     * @param secret The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    /**
     * @param startingPosition Where to begin consuming the stream. 
     */
    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition.Companion::unwrap))
    }

    /**
     * @param startingPositionTimestamp The time from which to start reading, in Unix time seconds.
     */
    override fun startingPositionTimestamp(startingPositionTimestamp: Number) {
      cdkBuilder.startingPositionTimestamp(startingPositionTimestamp)
    }

    /**
     * @param topic The Kafka topic to subscribe to. 
     */
    override fun topic(topic: String) {
      cdkBuilder.topic(topic)
    }

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps,
  ) : CdkObject(cdkObject),
      ManagedKafkaEventSourceProps {
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
     * An MSK cluster construct.
     */
    override fun clusterArn(): String = unwrap(this).getClusterArn()

    /**
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a length between 1 and 200 and full the pattern '[a-zA-Z0-9-/
     * *:_+=.&#64;-]*'.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
     */
    override fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

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
     * Add filter criteria to Event Source.
     *
     * Default: - none
     *
     * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
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
     * Add an on Failure Destination for this Kafka event.
     *
     * SNS/SQS/S3 are supported
     *
     * Default: - discarded records are ignored
     */
    override fun onFailure(): IEventSourceDlq? =
        unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

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
     * Specific configuration settings for a Kafka schema registry.
     *
     * Default: - none
     */
    override fun schemaRegistryConfig(): ISchemaRegistry? =
        unwrap(this).getSchemaRegistryConfig()?.let(ISchemaRegistry::wrap)

    /**
     * The secret with the Kafka credentials, see
     * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field
     * is required if your Kafka brokers are accessed over the Internet.
     *
     * Default: none
     */
    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    /**
     * Where to begin consuming the stream.
     */
    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)

    /**
     * The time from which to start reading, in Unix time seconds.
     *
     * Default: - no timestamp
     */
    override fun startingPositionTimestamp(): Number? = unwrap(this).getStartingPositionTimestamp()

    /**
     * The Kafka topic to subscribe to.
     */
    override fun topic(): String = unwrap(this).getTopic()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManagedKafkaEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps):
        ManagedKafkaEventSourceProps = CdkObjectWrappers.wrap(cdkObject) as?
        ManagedKafkaEventSourceProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManagedKafkaEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps
  }
}
