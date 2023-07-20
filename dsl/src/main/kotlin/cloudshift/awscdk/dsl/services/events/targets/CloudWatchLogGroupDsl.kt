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
import software.amazon.awscdk.services.events.targets.CloudWatchLogGroup
import software.amazon.awscdk.services.events.targets.LogGroupTargetInput
import software.amazon.awscdk.services.logs.ILogGroup
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Deprecated
import kotlin.Number

@CdkDslMarker
public class CloudWatchLogGroupDsl(
    logGroup: ILogGroup,
) {
    private val cdkBuilder: CloudWatchLogGroup.Builder = CloudWatchLogGroup.Builder.create(logGroup)

    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun event(event: RuleTargetInput) {
        cdkBuilder.event(event)
    }

    public fun logEvent(logEvent: LogGroupTargetInput) {
        cdkBuilder.logEvent(logEvent)
    }

    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): CloudWatchLogGroup = cdkBuilder.build()
}
