package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface ActionArtifactBounds {
    /**  */
    public fun maxInputs(): Number

    /**  */
    public fun maxOutputs(): Number

    /**  */
    public fun minInputs(): Number

    /**  */
    public fun minOutputs(): Number

    /** A builder for [ActionArtifactBounds] */
    @CdkDslMarker
    public interface Builder {
        /** @param maxInputs the value to be set. */
        public fun maxInputs(maxInputs: Number)

        /** @param maxOutputs the value to be set. */
        public fun maxOutputs(maxOutputs: Number)

        /** @param minInputs the value to be set. */
        public fun minInputs(minInputs: Number)

        /** @param minOutputs the value to be set. */
        public fun minOutputs(minOutputs: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.Builder =
            software.amazon.awscdk.services.codepipeline.ActionArtifactBounds.builder()

        /** @param maxInputs the value to be set. */
        override fun maxInputs(maxInputs: Number) {
            cdkBuilder.maxInputs(maxInputs)
        }

        /** @param maxOutputs the value to be set. */
        override fun maxOutputs(maxOutputs: Number) {
            cdkBuilder.maxOutputs(maxOutputs)
        }

        /** @param minInputs the value to be set. */
        override fun minInputs(minInputs: Number) {
            cdkBuilder.minInputs(minInputs)
        }

        /** @param minOutputs the value to be set. */
        override fun minOutputs(minOutputs: Number) {
            cdkBuilder.minOutputs(minOutputs)
        }

        public fun build(): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds,
    ) : ActionArtifactBounds {
        /**  */
        override fun maxInputs(): Number = unwrap(this).getMaxInputs()

        /**  */
        override fun maxOutputs(): Number = unwrap(this).getMaxOutputs()

        /**  */
        override fun minInputs(): Number = unwrap(this).getMinInputs()

        /**  */
        override fun minOutputs(): Number = unwrap(this).getMinOutputs()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ActionArtifactBounds {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.codepipeline.ActionArtifactBounds
        ): ActionArtifactBounds = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ActionArtifactBounds
        ): software.amazon.awscdk.services.codepipeline.ActionArtifactBounds =
            (wrapped as Wrapper).cdkObject
    }
}
