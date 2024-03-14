package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface TriggerProps {
    /**
     * Provides the filter criteria and the source stage for the repository event that starts the
     * pipeline, such as Git tags.
     *
     * Default: - no configuration.
     */
    public fun gitConfiguration(): GitConfiguration? =
        unwrap(this).getGitConfiguration()?.let(GitConfiguration::wrap)

    /**
     * The source provider for the event, such as connections configured for a repository with Git
     * tags, for the specified trigger configuration.
     */
    public fun providerType(): ProviderType

    /** A builder for [TriggerProps] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param gitConfiguration Provides the filter criteria and the source stage for the
         *   repository event that starts the pipeline, such as Git tags.
         */
        public fun gitConfiguration(gitConfiguration: GitConfiguration)

        /**
         * @param gitConfiguration Provides the filter criteria and the source stage for the
         *   repository event that starts the pipeline, such as Git tags.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b85b1726b85e5b4a3b1361634b4df38a127b13a300f38da15ac1fd974942c800")
        public fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit)

        /**
         * @param providerType The source provider for the event, such as connections configured for
         *   a repository with Git tags, for the specified trigger configuration.
         */
        public fun providerType(providerType: ProviderType)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.codepipeline.TriggerProps.Builder =
            software.amazon.awscdk.services.codepipeline.TriggerProps.builder()

        /**
         * @param gitConfiguration Provides the filter criteria and the source stage for the
         *   repository event that starts the pipeline, such as Git tags.
         */
        override fun gitConfiguration(gitConfiguration: GitConfiguration) {
            cdkBuilder.gitConfiguration(gitConfiguration.let(GitConfiguration::unwrap))
        }

        /**
         * @param gitConfiguration Provides the filter criteria and the source stage for the
         *   repository event that starts the pipeline, such as Git tags.
         */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("b85b1726b85e5b4a3b1361634b4df38a127b13a300f38da15ac1fd974942c800")
        override fun gitConfiguration(gitConfiguration: GitConfiguration.Builder.() -> Unit): Unit =
            gitConfiguration(GitConfiguration(gitConfiguration))

        /**
         * @param providerType The source provider for the event, such as connections configured for
         *   a repository with Git tags, for the specified trigger configuration.
         */
        override fun providerType(providerType: ProviderType) {
            cdkBuilder.providerType(providerType.let(ProviderType::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.codepipeline.TriggerProps =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.codepipeline.TriggerProps,
    ) : TriggerProps {
        /**
         * Provides the filter criteria and the source stage for the repository event that starts
         * the pipeline, such as Git tags.
         *
         * Default: - no configuration.
         */
        override fun gitConfiguration(): GitConfiguration? =
            unwrap(this).getGitConfiguration()?.let(GitConfiguration::wrap)

        /**
         * The source provider for the event, such as connections configured for a repository with
         * Git tags, for the specified trigger configuration.
         */
        override fun providerType(): ProviderType =
            unwrap(this).getProviderType().let(ProviderType::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): TriggerProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codepipeline.TriggerProps
        ): TriggerProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: TriggerProps
        ): software.amazon.awscdk.services.codepipeline.TriggerProps =
            (wrapped as Wrapper).cdkObject
    }
}
