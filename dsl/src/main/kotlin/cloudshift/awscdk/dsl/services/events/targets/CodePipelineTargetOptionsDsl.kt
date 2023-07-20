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
import software.amazon.awscdk.services.events.targets.CodePipelineTargetOptions
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Number

@CdkDslMarker
public class CodePipelineTargetOptionsDsl {
    private val cdkBuilder: CodePipelineTargetOptions.Builder = CodePipelineTargetOptions.builder()

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): CodePipelineTargetOptions = cdkBuilder.build()
}
