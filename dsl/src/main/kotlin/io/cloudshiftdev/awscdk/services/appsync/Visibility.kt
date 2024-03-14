package io.cloudshiftdev.awscdk.services.appsync

public enum class Visibility(
    private val cdkObject: software.amazon.awscdk.services.appsync.Visibility,
) {
    GLOBAL(software.amazon.awscdk.services.appsync.Visibility.GLOBAL),
    PRIVATE(software.amazon.awscdk.services.appsync.Visibility.PRIVATE),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.Visibility
        ): Visibility =
            when (cdkObject) {
                software.amazon.awscdk.services.appsync.Visibility.GLOBAL -> Visibility.GLOBAL
                software.amazon.awscdk.services.appsync.Visibility.PRIVATE -> Visibility.PRIVATE
            }

        internal fun unwrap(
            wrapped: Visibility
        ): software.amazon.awscdk.services.appsync.Visibility = wrapped.cdkObject
    }
}
