package io.cloudshiftdev.awscdk

public enum class BundlingFileAccess(
    private val cdkObject: software.amazon.awscdk.BundlingFileAccess,
) {
    VOLUME_COPY(software.amazon.awscdk.BundlingFileAccess.VOLUME_COPY),
    BIND_MOUNT(software.amazon.awscdk.BundlingFileAccess.BIND_MOUNT),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.BundlingFileAccess
        ): BundlingFileAccess =
            when (cdkObject) {
                software.amazon.awscdk.BundlingFileAccess.VOLUME_COPY ->
                    BundlingFileAccess.VOLUME_COPY
                software.amazon.awscdk.BundlingFileAccess.BIND_MOUNT ->
                    BundlingFileAccess.BIND_MOUNT
            }

        internal fun unwrap(
            wrapped: BundlingFileAccess
        ): software.amazon.awscdk.BundlingFileAccess = wrapped.cdkObject
    }
}
