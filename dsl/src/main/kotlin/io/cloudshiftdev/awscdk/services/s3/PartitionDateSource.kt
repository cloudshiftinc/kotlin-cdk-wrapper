package io.cloudshiftdev.awscdk.services.s3

public enum class PartitionDateSource(
    private val cdkObject: software.amazon.awscdk.services.s3.PartitionDateSource,
) {
    EVENT_TIME(software.amazon.awscdk.services.s3.PartitionDateSource.EVENT_TIME),
    DELIVERY_TIME(software.amazon.awscdk.services.s3.PartitionDateSource.DELIVERY_TIME),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.PartitionDateSource
        ): PartitionDateSource =
            when (cdkObject) {
                software.amazon.awscdk.services.s3.PartitionDateSource.EVENT_TIME ->
                    PartitionDateSource.EVENT_TIME
                software.amazon.awscdk.services.s3.PartitionDateSource.DELIVERY_TIME ->
                    PartitionDateSource.DELIVERY_TIME
            }

        internal fun unwrap(
            wrapped: PartitionDateSource
        ): software.amazon.awscdk.services.s3.PartitionDateSource = wrapped.cdkObject
    }
}
