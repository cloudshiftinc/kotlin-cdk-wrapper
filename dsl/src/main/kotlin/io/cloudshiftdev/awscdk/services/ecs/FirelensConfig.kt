package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface FirelensConfig {
    /**
     * Firelens options.
     *
     * Default: - no additional options
     */
    public fun options(): FirelensOptions? = unwrap(this).getOptions()?.let(FirelensOptions::wrap)

    /**
     * The log router to use.
     *
     * Default: - fluentbit
     */
    public fun type(): FirelensLogRouterType

    /** A builder for [FirelensConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param options Firelens options. */
        public fun options(options: FirelensOptions)

        /** @param options Firelens options. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7b2a56dc7893552029c77062db91cbc8d0a2a2f1898db47586a83f479af359a2")
        public fun options(options: FirelensOptions.Builder.() -> Unit)

        /** @param type The log router to use. */
        public fun type(type: FirelensLogRouterType)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ecs.FirelensConfig.Builder =
            software.amazon.awscdk.services.ecs.FirelensConfig.builder()

        /** @param options Firelens options. */
        override fun options(options: FirelensOptions) {
            cdkBuilder.options(options.let(FirelensOptions::unwrap))
        }

        /** @param options Firelens options. */
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("7b2a56dc7893552029c77062db91cbc8d0a2a2f1898db47586a83f479af359a2")
        override fun options(options: FirelensOptions.Builder.() -> Unit): Unit =
            options(FirelensOptions(options))

        /** @param type The log router to use. */
        override fun type(type: FirelensLogRouterType) {
            cdkBuilder.type(type.let(FirelensLogRouterType::unwrap))
        }

        public fun build(): software.amazon.awscdk.services.ecs.FirelensConfig = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ecs.FirelensConfig,
    ) : FirelensConfig {
        /**
         * Firelens options.
         *
         * Default: - no additional options
         */
        override fun options(): FirelensOptions? =
            unwrap(this).getOptions()?.let(FirelensOptions::wrap)

        /**
         * The log router to use.
         *
         * Default: - fluentbit
         */
        override fun type(): FirelensLogRouterType =
            unwrap(this).getType().let(FirelensLogRouterType::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): FirelensConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ecs.FirelensConfig
        ): FirelensConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: FirelensConfig
        ): software.amazon.awscdk.services.ecs.FirelensConfig = (wrapped as Wrapper).cdkObject
    }
}
