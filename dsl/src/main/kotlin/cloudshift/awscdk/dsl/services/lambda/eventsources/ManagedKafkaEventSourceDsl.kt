@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSource
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class ManagedKafkaEventSourceDsl {
  private val cdkBuilder: ManagedKafkaEventSource.Builder = ManagedKafkaEventSource.Builder.create()

  private val _filters: MutableList<Map<String, Any>> = mutableListOf()

  /**
   * The largest number of records that AWS Lambda will retrieve from your event source at the time
   * of invoking your function.
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
   *
   * @param batchSize The largest number of records that AWS Lambda will retrieve from your event
   * source at the time of invoking your function. 
   */
  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  /**
   * An MSK cluster construct.
   *
   * @param clusterArn An MSK cluster construct. 
   */
  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

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
   * @param consumerGroupId The identifier for the Kafka consumer group to join. 
   */
  public fun consumerGroupId(consumerGroupId: String) {
    cdkBuilder.consumerGroupId(consumerGroupId)
  }

  /**
   * If the stream event source mapping should be enabled.
   *
   * Default: true
   *
   * @param enabled If the stream event source mapping should be enabled. 
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * Add filter criteria to Event Source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
   * @param filters Add filter criteria to Event Source. 
   */
  public fun filters(vararg filters: Map<String, Any>) {
    _filters.addAll(listOf(*filters))
  }

  /**
   * Add filter criteria to Event Source.
   *
   * Default: - none
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventfiltering.html)
   * @param filters Add filter criteria to Event Source. 
   */
  public fun filters(filters: Collection<Map<String, Any>>) {
    _filters.addAll(filters)
  }

  /**
   * The maximum amount of time to gather records before invoking the function.
   *
   * Maximum of Duration.minutes(5).
   *
   * Default: - Duration.seconds(0) for Kinesis, DynamoDB, and SQS event sources,
   * Duration.millis(500) for MSK, self-managed Kafka, and Amazon MQ.
   *
   * [Documentation](https://docs.aws.amazon.com/lambda/latest/dg/invocation-eventsourcemapping.html#invocation-eventsourcemapping-batching)
   * @param maxBatchingWindow The maximum amount of time to gather records before invoking the
   * function. 
   */
  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  /**
   * The secret with the Kafka credentials, see
   * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field is
   * required if your Kafka brokers are accessed over the Internet.
   *
   * Default: none
   *
   * @param secret The secret with the Kafka credentials, see
   * https://docs.aws.amazon.com/msk/latest/developerguide/msk-password.html for details This field is
   * required if your Kafka brokers are accessed over the Internet. 
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  /**
   * Where to begin consuming the stream.
   *
   * @param startingPosition Where to begin consuming the stream. 
   */
  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  /**
   * The Kafka topic to subscribe to.
   *
   * @param topic The Kafka topic to subscribe to. 
   */
  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  public fun build(): ManagedKafkaEventSource {
    if(_filters.isNotEmpty()) cdkBuilder.filters(_filters)
    return cdkBuilder.build()
  }
}
