package io.cloudshiftdev.awscdk.services.sqs

public enum class FifoThroughputLimit(
    private val cdkObject: software.amazon.awscdk.services.sqs.FifoThroughputLimit,
) {
    PER_QUEUE(software.amazon.awscdk.services.sqs.FifoThroughputLimit.PER_QUEUE),
    PER_MESSAGE_GROUP_ID(
        software.amazon.awscdk.services.sqs.FifoThroughputLimit.PER_MESSAGE_GROUP_ID
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.sqs.FifoThroughputLimit
        ): FifoThroughputLimit =
            when (cdkObject) {
                software.amazon.awscdk.services.sqs.FifoThroughputLimit.PER_QUEUE ->
                    FifoThroughputLimit.PER_QUEUE
                software.amazon.awscdk.services.sqs.FifoThroughputLimit.PER_MESSAGE_GROUP_ID ->
                    FifoThroughputLimit.PER_MESSAGE_GROUP_ID
            }

        internal fun unwrap(
            wrapped: FifoThroughputLimit
        ): software.amazon.awscdk.services.sqs.FifoThroughputLimit = wrapped.cdkObject
    }
}
