@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.SfnStateMachine
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue
import software.amazon.awscdk.services.stepfunctions.IStateMachine

@CdkDslMarker
public class SfnStateMachineDsl(
  machine: IStateMachine,
) {
  private val cdkBuilder: SfnStateMachine.Builder = SfnStateMachine.Builder.create(machine)

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun input(input: RuleTargetInput) {
    cdkBuilder.input(input)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): SfnStateMachine = cdkBuilder.build()
}
