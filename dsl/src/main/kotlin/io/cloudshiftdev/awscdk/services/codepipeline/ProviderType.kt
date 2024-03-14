package io.cloudshiftdev.awscdk.services.codepipeline

public enum class ProviderType(
    private val cdkObject: software.amazon.awscdk.services.codepipeline.ProviderType,
) {
    CODE_STAR_SOURCE_CONNECTION(
        software.amazon.awscdk.services.codepipeline.ProviderType.CODE_STAR_SOURCE_CONNECTION
    ),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codepipeline.ProviderType
        ): ProviderType =
            when (cdkObject) {
                software.amazon.awscdk.services.codepipeline.ProviderType
                    .CODE_STAR_SOURCE_CONNECTION -> ProviderType.CODE_STAR_SOURCE_CONNECTION
            }

        internal fun unwrap(
            wrapped: ProviderType
        ): software.amazon.awscdk.services.codepipeline.ProviderType = wrapped.cdkObject
    }
}
