@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.sqs.DeadLetterQueue
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Dead letter queue settings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * Queue queue;
 * DeadLetterQueue deadLetterQueue = DeadLetterQueue.builder()
 * .maxReceiveCount(123)
 * .queue(queue)
 * .build();
 * ```
 */
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
