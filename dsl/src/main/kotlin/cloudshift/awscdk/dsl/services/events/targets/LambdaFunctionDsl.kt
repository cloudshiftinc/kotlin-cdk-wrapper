@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.LambdaFunction
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.sqs.IQueue

@CdkDslMarker
public class LambdaFunctionDsl(
  handler: IFunction,
) {
  private val cdkBuilder: LambdaFunction.Builder = LambdaFunction.Builder.create(handler)

  public fun deadLetterQueue(deadLetterQueue: IQueue) {
    cdkBuilder.deadLetterQueue(deadLetterQueue)
  }

  public fun event(event: RuleTargetInput) {
    cdkBuilder.event(event)
  }

  public fun maxEventAge(maxEventAge: Duration) {
    cdkBuilder.maxEventAge(maxEventAge)
  }

  public fun retryAttempts(retryAttempts: Number) {
    cdkBuilder.retryAttempts(retryAttempts)
  }

  public fun build(): LambdaFunction = cdkBuilder.build()
}
