@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import io.cloudshiftdev.awscdk.services.lambda.IEventSourceDlq
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Properties for a Kafka event source.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.kms.*;
 * import io.cloudshiftdev.awscdk.services.lambda.*;
 * import io.cloudshiftdev.awscdk.services.lambda.eventsources.*;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * IEventSourceDlq eventSourceDlq;
 * Object filters;
 * Key key;
 * Secret secret;
 * KafkaEventSourceProps kafkaEventSourceProps = KafkaEventSourceProps.builder()
 * .startingPosition(StartingPosition.TRIM_HORIZON)
 * .topic("topic")
 * // the properties below are optional
 * .batchSize(123)
 * .consumerGroupId("consumerGroupId")
 * .enabled(false)
 * .filterEncryption(key)
 * .filters(List.of(Map.of(
 * "filtersKey", filters)))
 * .maxBatchingWindow(Duration.minutes(30))
 * .onFailure(eventSourceDlq)
 * .secret(secret)
 * .build();
 * ```
 */
public interface KafkaEventSourceProps : BaseStreamEventSourceProps {
  /**
   * The identifier for the Kafka consumer group to join.
   *
   * The consumer group ID must be unique among all your Kafka event sources. After creating a Kafka
   * event source mapping with the consumer group ID specified, you cannot update this value.  The
   * value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/ *:_+=.&#64;-]*'.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
   */
  public fun consumerGroupId(): String? = unwrap(this).getConsumerGroupId()

  /**
   * Add Customer managed KMS key to encrypt Filter Criteria.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#aws-managed-cmk)
   */
  public fun filterEncryption(): IKey? = unwrap(this).getFilterEncryption()?.let(IKey::wrap)

  /**
   * Add filter criteria to Event Source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
   */
  public fun filters(): List<Map<String, Any>> = unwrap(this).getFilters() ?: emptyList()

  /**
   * Add an on Failure Destination for this Kafka event.
   *
   * SNS/SQS/S3 are supported
   *
   * Default: - discarded records are ignored
   */
  public fun onFailure(): IEventSourceDlq? = unwrap(this).getOnFailure()?.let(IEventSourceDlq::wrap)

  /**
   * The secret with the Kafka credentials, see
   * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field is
   * required if your Kafka brokers are accessed over the Internet.
   *
   * Default: none
   */
  public fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * The Kafka topic to subscribe to.
   */
  public fun topic(): String

  /**
   * A builder for [KafkaEventSourceProps]
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
     * @param consumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
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
     * @param topic The Kafka topic to subscribe to. 
     */
    public fun topic(topic: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps.builder()

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
     * @param consumerGroupId The identifier for the Kafka consumer group to join.
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
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
     * @param topic The Kafka topic to subscribe to. 
     */
    override fun topic(topic: String) {
      cdkBuilder.topic(topic)
    }

    public fun build(): software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps,
  ) : CdkObject(cdkObject),
      KafkaEventSourceProps {
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
     * The identifier for the Kafka consumer group to join.
     *
     * The consumer group ID must be unique among all your Kafka event sources. After creating a
     * Kafka event source mapping with the consumer group ID specified, you cannot update this value. 
     * The value must have a lenght between 1 and 200 and full the pattern '[a-zA-Z0-9-/
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
     * The Kafka topic to subscribe to.
     */
    override fun topic(): String = unwrap(this).getTopic()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KafkaEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps):
        KafkaEventSourceProps = CdkObjectWrappers.wrap(cdkObject) as? KafkaEventSourceProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: KafkaEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.KafkaEventSourceProps
  }
}
