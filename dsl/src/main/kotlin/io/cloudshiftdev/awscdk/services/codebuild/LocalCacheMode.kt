package io.cloudshiftdev.awscdk.services.codebuild

public enum class LocalCacheMode(
    private val cdkObject: software.amazon.awscdk.services.codebuild.LocalCacheMode,
) {
    SOURCE(software.amazon.awscdk.services.codebuild.LocalCacheMode.SOURCE),
    DOCKER_LAYER(software.amazon.awscdk.services.codebuild.LocalCacheMode.DOCKER_LAYER),
    CUSTOM(software.amazon.awscdk.services.codebuild.LocalCacheMode.CUSTOM),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codebuild.LocalCacheMode
        ): LocalCacheMode =
            when (cdkObject) {
                software.amazon.awscdk.services.codebuild.LocalCacheMode.SOURCE ->
                    LocalCacheMode.SOURCE
                software.amazon.awscdk.services.codebuild.LocalCacheMode.DOCKER_LAYER ->
                    LocalCacheMode.DOCKER_LAYER
                software.amazon.awscdk.services.codebuild.LocalCacheMode.CUSTOM ->
                    LocalCacheMode.CUSTOM
            }

        internal fun unwrap(
            wrapped: LocalCacheMode
        ): software.amazon.awscdk.services.codebuild.LocalCacheMode = wrapped.cdkObject
    }
}
