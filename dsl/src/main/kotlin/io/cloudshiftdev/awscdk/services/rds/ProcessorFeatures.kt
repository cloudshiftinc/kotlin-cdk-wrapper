package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface ProcessorFeatures {
    /**
     * The number of CPU core.
     *
     * Default: - the default number of CPU cores for the chosen instance class.
     */
    public fun coreCount(): Number? = unwrap(this).getCoreCount()

    /**
     * The number of threads per core.
     *
     * Default: - the default number of threads per core for the chosen instance class.
     */
    public fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()

    /** A builder for [ProcessorFeatures] */
    @CdkDslMarker
    public interface Builder {
        /** @param coreCount The number of CPU core. */
        public fun coreCount(coreCount: Number)

        /** @param threadsPerCore The number of threads per core. */
        public fun threadsPerCore(threadsPerCore: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.rds.ProcessorFeatures.Builder =
            software.amazon.awscdk.services.rds.ProcessorFeatures.builder()

        /** @param coreCount The number of CPU core. */
        override fun coreCount(coreCount: Number) {
            cdkBuilder.coreCount(coreCount)
        }

        /** @param threadsPerCore The number of threads per core. */
        override fun threadsPerCore(threadsPerCore: Number) {
            cdkBuilder.threadsPerCore(threadsPerCore)
        }

        public fun build(): software.amazon.awscdk.services.rds.ProcessorFeatures =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.rds.ProcessorFeatures,
    ) : ProcessorFeatures {
        /**
         * The number of CPU core.
         *
         * Default: - the default number of CPU cores for the chosen instance class.
         */
        override fun coreCount(): Number? = unwrap(this).getCoreCount()

        /**
         * The number of threads per core.
         *
         * Default: - the default number of threads per core for the chosen instance class.
         */
        override fun threadsPerCore(): Number? = unwrap(this).getThreadsPerCore()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ProcessorFeatures {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.rds.ProcessorFeatures
        ): ProcessorFeatures = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ProcessorFeatures
        ): software.amazon.awscdk.services.rds.ProcessorFeatures = (wrapped as Wrapper).cdkObject
    }
}
