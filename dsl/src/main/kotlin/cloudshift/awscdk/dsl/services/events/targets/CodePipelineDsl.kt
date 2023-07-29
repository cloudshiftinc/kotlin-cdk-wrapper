@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codepipeline.IPipeline
import software.amazon.awscdk.services.events.targets.CodePipeline
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Allows the pipeline to be used as an EventBridge rule target.
 *
 * Example:
 * ```
 * // A pipeline being used as a target for a CloudWatch event rule.
 * import software.amazon.awscdk.services.events.targets.*;
 * import software.amazon.awscdk.services.events.*;
 * Pipeline pipeline;
 * // kick off the pipeline every day
 * Rule rule = Rule.Builder.create(this, "Daily")
 * .schedule(Schedule.rate(Duration.days(1)))
 * .build();
 * rule.addTarget(new CodePipeline(pipeline));
 * ```
 */
@CdkDslMarker
public class CodePipelineDsl(
    pipeline: IPipeline,
) {
    private val cdkBuilder: CodePipeline.Builder = CodePipeline.Builder.create(pipeline)

    /**
     * The SQS queue to be used as deadLetterQueue. Check out the
     * [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *
     * The events not successfully delivered are automatically retried for a specified period of
     * time, depending on the retry policy of the target. If an event is not delivered before all
     * retry attempts are exhausted, it will be sent to the dead letter queue.
     *
     * Default: - no dead-letter queue
     *
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * The role to assume before invoking the target (i.e., the pipeline) when the given rule is
     * triggered.
     *
     * Default: - a new role will be created
     *
     * @param eventRole The role to assume before invoking the target (i.e., the pipeline) when the
     *   given rule is triggered.
     */
    public fun eventRole(eventRole: IRole) {
        cdkBuilder.eventRole(eventRole)
    }

    /**
     * The maximum age of a request that Lambda sends to a function for processing.
     *
     * Minimum value of 60. Maximum value of 86400.
     *
     * Default: Duration.hours(24)
     *
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /**
     * The maximum number of times to retry when the function returns an error.
     *
     * Minimum value of 0. Maximum value of 185.
     *
     * Default: 185
     *
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): CodePipeline = cdkBuilder.build()
}
