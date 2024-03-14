package io.cloudshiftdev.awscdk.services.s3

public abstract class TargetObjectKeyFormat
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.s3.TargetObjectKeyFormat,
) {
    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.s3.TargetObjectKeyFormat,
    ) : TargetObjectKeyFormat(cdkObject)

    public companion object {
        public fun partitionedPrefix(): TargetObjectKeyFormat =
            software.amazon.awscdk.services.s3.TargetObjectKeyFormat.partitionedPrefix()
                .let(TargetObjectKeyFormat::wrap)

        public fun partitionedPrefix(dateSource: PartitionDateSource): TargetObjectKeyFormat =
            software.amazon.awscdk.services.s3.TargetObjectKeyFormat.partitionedPrefix(
                    dateSource.let(PartitionDateSource::unwrap)
                )
                .let(TargetObjectKeyFormat::wrap)

        public fun simplePrefix(): TargetObjectKeyFormat =
            software.amazon.awscdk.services.s3.TargetObjectKeyFormat.simplePrefix()
                .let(TargetObjectKeyFormat::wrap)

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.s3.TargetObjectKeyFormat
        ): TargetObjectKeyFormat = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TargetObjectKeyFormat
        ): software.amazon.awscdk.services.s3.TargetObjectKeyFormat = (wrapped as Wrapper).cdkObject
    }
}
