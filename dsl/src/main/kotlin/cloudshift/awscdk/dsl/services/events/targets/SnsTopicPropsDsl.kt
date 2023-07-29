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
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.SnsTopicProps
import software.amazon.awscdk.services.sqs.IQueue

/**
 * Customize the SNS Topic Event Target.
 *
 * Example:
 * ```
 * Rule onCommitRule;
 * Topic topic;
 * onCommitRule.addTarget(SnsTopic.Builder.create(topic)
 * .message(RuleTargetInput.fromText(String.format("A commit was pushed to the repository %s on
 * branch %s", ReferenceEvent.getRepositoryName(), ReferenceEvent.getReferenceName())))
 * .build());
 * ```
 */
@CdkDslMarker
public class SnsTopicPropsDsl {
    private val cdkBuilder: SnsTopicProps.Builder = SnsTopicProps.builder()

    /**
     * @param deadLetterQueue The SQS queue to be used as deadLetterQueue. Check out the
     *   [considerations for using a dead-letter queue](https://docs.aws.amazon.com/eventbridge/latest/userguide/rule-dlq.html#dlq-considerations).
     *   The events not successfully delivered are automatically retried for a specified period of
     *   time, depending on the retry policy of the target. If an event is not delivered before all
     *   retry attempts are exhausted, it will be sent to the dead letter queue.
     */
    public fun deadLetterQueue(deadLetterQueue: IQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    /**
     * @param maxEventAge The maximum age of a request that Lambda sends to a function for
     *   processing. Minimum value of 60. Maximum value of 86400.
     */
    public fun maxEventAge(maxEventAge: Duration) {
        cdkBuilder.maxEventAge(maxEventAge)
    }

    /** @param message The message to send to the topic. */
    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    /**
     * @param retryAttempts The maximum number of times to retry when the function returns an error.
     *   Minimum value of 0. Maximum value of 185.
     */
    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun build(): SnsTopicProps = cdkBuilder.build()
}
