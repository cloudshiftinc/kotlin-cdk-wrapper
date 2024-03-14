package io.cloudshiftdev.awscdk.services.batch

public enum class ImagePullPolicy(
    private val cdkObject: software.amazon.awscdk.services.batch.ImagePullPolicy,
) {
    ALWAYS(software.amazon.awscdk.services.batch.ImagePullPolicy.ALWAYS),
    IF_NOT_PRESENT(software.amazon.awscdk.services.batch.ImagePullPolicy.IF_NOT_PRESENT),
    NEVER(software.amazon.awscdk.services.batch.ImagePullPolicy.NEVER),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.batch.ImagePullPolicy
        ): ImagePullPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.batch.ImagePullPolicy.ALWAYS ->
                    ImagePullPolicy.ALWAYS
                software.amazon.awscdk.services.batch.ImagePullPolicy.IF_NOT_PRESENT ->
                    ImagePullPolicy.IF_NOT_PRESENT
                software.amazon.awscdk.services.batch.ImagePullPolicy.NEVER -> ImagePullPolicy.NEVER
            }

        internal fun unwrap(
            wrapped: ImagePullPolicy
        ): software.amazon.awscdk.services.batch.ImagePullPolicy = wrapped.cdkObject
    }
}
