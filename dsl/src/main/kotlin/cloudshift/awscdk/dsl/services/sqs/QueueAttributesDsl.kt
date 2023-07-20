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

package cloudshift.awscdk.dsl.services.sqs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sqs.QueueAttributes
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class QueueAttributesDsl {
    private val cdkBuilder: QueueAttributes.Builder = QueueAttributes.builder()

    public fun fifo(fifo: Boolean) {
        cdkBuilder.fifo(fifo)
    }

    public fun keyArn(keyArn: String) {
        cdkBuilder.keyArn(keyArn)
    }

    public fun queueArn(queueArn: String) {
        cdkBuilder.queueArn(queueArn)
    }

    public fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
    }

    public fun queueUrl(queueUrl: String) {
        cdkBuilder.queueUrl(queueUrl)
    }

    public fun build(): QueueAttributes = cdkBuilder.build()
}
