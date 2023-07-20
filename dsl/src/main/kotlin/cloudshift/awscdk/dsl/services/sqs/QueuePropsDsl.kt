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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.sqs.DeadLetterQueue
import software.amazon.awscdk.services.sqs.DeduplicationScope
import software.amazon.awscdk.services.sqs.FifoThroughputLimit
import software.amazon.awscdk.services.sqs.QueueEncryption
import software.amazon.awscdk.services.sqs.QueueProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class QueuePropsDsl {
    private val cdkBuilder: QueueProps.Builder = QueueProps.builder()

    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
        cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    public fun dataKeyReuse(dataKeyReuse: Duration) {
        cdkBuilder.dataKeyReuse(dataKeyReuse)
    }

    public fun deadLetterQueue(block: DeadLetterQueueDsl.() -> Unit = {}) {
        val builder = DeadLetterQueueDsl()
        builder.apply(block)
        cdkBuilder.deadLetterQueue(builder.build())
    }

    public fun deadLetterQueue(deadLetterQueue: DeadLetterQueue) {
        cdkBuilder.deadLetterQueue(deadLetterQueue)
    }

    public fun deduplicationScope(deduplicationScope: DeduplicationScope) {
        cdkBuilder.deduplicationScope(deduplicationScope)
    }

    public fun deliveryDelay(deliveryDelay: Duration) {
        cdkBuilder.deliveryDelay(deliveryDelay)
    }

    public fun encryption(encryption: QueueEncryption) {
        cdkBuilder.encryption(encryption)
    }

    public fun encryptionMasterKey(encryptionMasterKey: IKey) {
        cdkBuilder.encryptionMasterKey(encryptionMasterKey)
    }

    public fun enforceSsl(enforceSsl: Boolean) {
        cdkBuilder.enforceSsl(enforceSsl)
    }

    public fun fifo(fifo: Boolean) {
        cdkBuilder.fifo(fifo)
    }

    public fun fifoThroughputLimit(fifoThroughputLimit: FifoThroughputLimit) {
        cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
    }

    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
        cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    public fun queueName(queueName: String) {
        cdkBuilder.queueName(queueName)
    }

    public fun receiveMessageWaitTime(receiveMessageWaitTime: Duration) {
        cdkBuilder.receiveMessageWaitTime(receiveMessageWaitTime)
    }

    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    public fun retentionPeriod(retentionPeriod: Duration) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    public fun visibilityTimeout(visibilityTimeout: Duration) {
        cdkBuilder.visibilityTimeout(visibilityTimeout)
    }

    public fun build(): QueueProps = cdkBuilder.build()
}
