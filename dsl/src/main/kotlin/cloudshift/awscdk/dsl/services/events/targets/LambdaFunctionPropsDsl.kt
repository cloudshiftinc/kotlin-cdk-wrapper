@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.LambdaFunctionProps
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Number

@CdkDslMarker
public class LambdaFunctionPropsDsl {
    private val cdkBuilder: LambdaFunctionProps.Builder = LambdaFunctionProps.builder()

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

    public fun build(): LambdaFunctionProps = cdkBuilder.build()
}
