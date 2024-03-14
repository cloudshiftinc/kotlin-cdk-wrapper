package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface RenderSignalsOptions {
    /**
     * The desiredCapacity of the ASG.
     *
     * Default: - desired capacity not configured
     */
    public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    /**
     * The minSize of the ASG.
     *
     * Default: - minCapacity not configured
     */
    public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    /** A builder for [RenderSignalsOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param desiredCapacity The desiredCapacity of the ASG. */
        public fun desiredCapacity(desiredCapacity: Number)

        /** @param minCapacity The minSize of the ASG. */
        public fun minCapacity(minCapacity: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.autoscaling.RenderSignalsOptions.Builder =
            software.amazon.awscdk.services.autoscaling.RenderSignalsOptions.builder()

        /** @param desiredCapacity The desiredCapacity of the ASG. */
        override fun desiredCapacity(desiredCapacity: Number) {
            cdkBuilder.desiredCapacity(desiredCapacity)
        }

        /** @param minCapacity The minSize of the ASG. */
        override fun minCapacity(minCapacity: Number) {
            cdkBuilder.minCapacity(minCapacity)
        }

        public fun build(): software.amazon.awscdk.services.autoscaling.RenderSignalsOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.autoscaling.RenderSignalsOptions,
    ) : RenderSignalsOptions {
        /**
         * The desiredCapacity of the ASG.
         *
         * Default: - desired capacity not configured
         */
        override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

        /**
         * The minSize of the ASG.
         *
         * Default: - minCapacity not configured
         */
        override fun minCapacity(): Number? = unwrap(this).getMinCapacity()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): RenderSignalsOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.autoscaling.RenderSignalsOptions
        ): RenderSignalsOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: RenderSignalsOptions
        ): software.amazon.awscdk.services.autoscaling.RenderSignalsOptions =
            (wrapped as Wrapper).cdkObject
    }
}
