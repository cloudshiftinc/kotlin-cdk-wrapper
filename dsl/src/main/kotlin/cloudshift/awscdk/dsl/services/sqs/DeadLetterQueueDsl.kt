@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sqs.DeadLetterQueue
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class DeadLetterQueueDsl {
  private val cdkBuilder: DeadLetterQueue.Builder = DeadLetterQueue.builder()

  /**
   * @param maxReceiveCount The number of times a message can be unsuccesfully dequeued before being
   * moved to the dead-letter queue. 
   */
  public fun maxReceiveCount(maxReceiveCount: Number) {
    cdkBuilder.maxReceiveCount(maxReceiveCount)
  }

  /**
   * @param queue The dead-letter queue to which Amazon SQS moves messages after the value of
   * maxReceiveCount is exceeded. 
   */
  public fun queue(queue: IQueue) {
    cdkBuilder.queue(queue)
  }

  public fun build(): DeadLetterQueue = cdkBuilder.build()
}
