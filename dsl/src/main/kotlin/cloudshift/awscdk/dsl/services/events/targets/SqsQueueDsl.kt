@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.SqsQueue
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class SqsQueueDsl(
  arg0: IQueue,
) {
  private val cdkBuilder: SqsQueue.Builder = SqsQueue.Builder.create(arg0)

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun message(message: RuleTargetInput) {
    cdkBuilder.message(message)
  }

  public fun messageGroupId(messageGroupId: String) {
    cdkBuilder.messageGroupId(messageGroupId)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): SqsQueue = cdkBuilder.build()
}
