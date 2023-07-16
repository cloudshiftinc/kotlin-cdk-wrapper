@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.ManagedKafkaEventSourceProps
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class ManagedKafkaEventSourcePropsDsl {
  private val cdkBuilder: ManagedKafkaEventSourceProps.Builder =
      ManagedKafkaEventSourceProps.builder()

  public fun batchSize(batchSize: Number) {
    cdkBuilder.batchSize(batchSize)
  }

  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  public fun consumerGroupId(consumerGroupId: String) {
    cdkBuilder.consumerGroupId(consumerGroupId)
  }

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun maxBatchingWindow(maxBatchingWindow: Duration) {
    cdkBuilder.maxBatchingWindow(maxBatchingWindow)
  }

  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun startingPosition(startingPosition: StartingPosition) {
    cdkBuilder.startingPosition(startingPosition)
  }

  public fun topic(topic: String) {
    cdkBuilder.topic(topic)
  }

  public fun build(): ManagedKafkaEventSourceProps = cdkBuilder.build()
}
