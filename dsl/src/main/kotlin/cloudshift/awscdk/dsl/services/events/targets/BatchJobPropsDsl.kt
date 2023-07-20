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
import software.amazon.awscdk.services.events.targets.BatchJobProps
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class BatchJobPropsDsl {
    private val cdkBuilder: BatchJobProps.Builder = BatchJobProps.builder()

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

    public fun build(): BatchJobProps = cdkBuilder.build()
}
