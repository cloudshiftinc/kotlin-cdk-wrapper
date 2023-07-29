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

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.sqs.QueueAttributes

/**
 * Reference to a queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sqs.*;
 * QueueAttributes queueAttributes = QueueAttributes.builder()
 * .queueArn("queueArn")
 * // the properties below are optional
 * .fifo(false)
 * .keyArn("keyArn")
 * .queueName("queueName")
 * .queueUrl("queueUrl")
 * .build();
 * ```
 */
@CdkDslMarker
public class QueueAttributesDsl {
    private val cdkBuilder: QueueAttributes.Builder = QueueAttributes.builder()

    /**
     * @param fifo Whether this queue is an Amazon SQS FIFO queue. If false, this is a standard
     *   queue. In case of a FIFO queue which is imported from a token, this value has to be
     *   explicitly set to true.
     */
    public fun fifo(fifo: Boolean) {
        cdkBuilder.fifo(fifo)
    }

    /** @param keyArn KMS encryption key, if this queue is server-side encrypted by a KMS key. */
    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    /** @param queueArn The ARN of the queue. */
    public fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
    }

    /** @param queueName The name of the queue. */
    public fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
    }

    /** @param queueUrl The URL of the queue. */
    public fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
    }

    public fun build(): QueueAttributes = cdkBuilder.build()
}
