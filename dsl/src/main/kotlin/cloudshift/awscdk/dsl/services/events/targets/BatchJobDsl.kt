@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.BatchJob
import software.amazon.awscdk.services.sqs.IQueue
import software.constructs.IConstruct

@CdkDslMarker
public class BatchJobDsl(
  arg0: String,
  arg1: IConstruct,
  arg2: String,
  arg3: IConstruct,
) {
  private val cdkBuilder: BatchJob.Builder = BatchJob.Builder.create(arg0, arg1, arg2, arg3)

  public fun attempts(attempts: Number) {
    cdkBuilder.attempts(attempts)
  }

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  public fun jobName(jobName: String) {
    cdkBuilder.jobName(jobName)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun size(size: Number) {
    cdkBuilder.size(size)
  }

  public fun build(): BatchJob = cdkBuilder.build()
}
