package io.cloudshiftdev.awscdk.services.kinesis

public enum class StreamMode(
    private val cdkObject: software.amazon.awscdk.services.kinesis.StreamMode,
) {
    PROVISIONED(software.amazon.awscdk.services.kinesis.StreamMode.PROVISIONED),
    ON_DEMAND(software.amazon.awscdk.services.kinesis.StreamMode.ON_DEMAND),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.kinesis.StreamMode
        ): StreamMode =
            when (cdkObject) {
                software.amazon.awscdk.services.kinesis.StreamMode.PROVISIONED ->
                    StreamMode.PROVISIONED
                software.amazon.awscdk.services.kinesis.StreamMode.ON_DEMAND -> StreamMode.ON_DEMAND
            }

        internal fun unwrap(
            wrapped: StreamMode
        ): software.amazon.awscdk.services.kinesis.StreamMode = wrapped.cdkObject
    }
}
