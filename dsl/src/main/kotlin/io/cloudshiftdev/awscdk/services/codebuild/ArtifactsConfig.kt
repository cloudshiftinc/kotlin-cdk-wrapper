package io.cloudshiftdev.awscdk.services.codebuild

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface ArtifactsConfig {
    /** The low-level CloudFormation artifacts property. */
    public fun artifactsProperty(): CfnProject.ArtifactsProperty

    /** A builder for [ArtifactsConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param artifactsProperty The low-level CloudFormation artifacts property. */
        public fun artifactsProperty(artifactsProperty: CfnProject.ArtifactsProperty)

        /** @param artifactsProperty The low-level CloudFormation artifacts property. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("fd8935f7ad6245680de0de4af3f7d1be4f61f6e9d9c33c6c82b2fad8ef785825")
        public fun artifactsProperty(
            artifactsProperty: CfnProject.ArtifactsProperty.Builder.() -> Unit
        )
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.codebuild.ArtifactsConfig.Builder =
            software.amazon.awscdk.services.codebuild.ArtifactsConfig.builder()

        /** @param artifactsProperty The low-level CloudFormation artifacts property. */
        override fun artifactsProperty(artifactsProperty: CfnProject.ArtifactsProperty) {
            cdkBuilder.artifactsProperty(
                artifactsProperty.let(CfnProject.ArtifactsProperty::unwrap)
            )
        }

        /** @param artifactsProperty The low-level CloudFormation artifacts property. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("fd8935f7ad6245680de0de4af3f7d1be4f61f6e9d9c33c6c82b2fad8ef785825")
        override fun artifactsProperty(
            artifactsProperty: CfnProject.ArtifactsProperty.Builder.() -> Unit
        ): Unit = artifactsProperty(CfnProject.ArtifactsProperty(artifactsProperty))

        public fun build(): software.amazon.awscdk.services.codebuild.ArtifactsConfig =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.codebuild.ArtifactsConfig,
    ) : ArtifactsConfig {
        /** The low-level CloudFormation artifacts property. */
        override fun artifactsProperty(): CfnProject.ArtifactsProperty =
            unwrap(this).getArtifactsProperty().let(CfnProject.ArtifactsProperty::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codebuild.ArtifactsConfig
        ): ArtifactsConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ArtifactsConfig
        ): software.amazon.awscdk.services.codebuild.ArtifactsConfig =
            (wrapped as Wrapper).cdkObject
    }
}
