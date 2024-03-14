package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface StageSynthesisOptions {
    /**
     * Force a re-synth, even if the stage has already been synthesized.
     *
     * This is used by tests to allow for incremental verification of the output. Do not use in
     * production.
     *
     * Default: false
     */
    public fun force(): Boolean? = unwrap(this).getForce()

    /**
     * Should we skip construct validation.
     *
     * Default: - false
     */
    public fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

    /**
     * Whether the stack should be validated after synthesis to check for error metadata.
     *
     * Default: - false
     */
    public fun validateOnSynthesis(): Boolean? = unwrap(this).getValidateOnSynthesis()

    /** A builder for [StageSynthesisOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param force Force a re-synth, even if the stage has already been synthesized. This is
         *   used by tests to allow for incremental verification of the output. Do not use in
         *   production.
         */
        public fun force(force: Boolean)

        /** @param skipValidation Should we skip construct validation. */
        public fun skipValidation(skipValidation: Boolean)

        /**
         * @param validateOnSynthesis Whether the stack should be validated after synthesis to check
         *   for error metadata.
         */
        public fun validateOnSynthesis(validateOnSynthesis: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.StageSynthesisOptions.Builder =
            software.amazon.awscdk.StageSynthesisOptions.builder()

        /**
         * @param force Force a re-synth, even if the stage has already been synthesized. This is
         *   used by tests to allow for incremental verification of the output. Do not use in
         *   production.
         */
        override fun force(force: Boolean) {
            cdkBuilder.force(force)
        }

        /** @param skipValidation Should we skip construct validation. */
        override fun skipValidation(skipValidation: Boolean) {
            cdkBuilder.skipValidation(skipValidation)
        }

        /**
         * @param validateOnSynthesis Whether the stack should be validated after synthesis to check
         *   for error metadata.
         */
        override fun validateOnSynthesis(validateOnSynthesis: Boolean) {
            cdkBuilder.validateOnSynthesis(validateOnSynthesis)
        }

        public fun build(): software.amazon.awscdk.StageSynthesisOptions = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.StageSynthesisOptions,
    ) : StageSynthesisOptions {
        /**
         * Force a re-synth, even if the stage has already been synthesized.
         *
         * This is used by tests to allow for incremental verification of the output. Do not use in
         * production.
         *
         * Default: false
         */
        override fun force(): Boolean? = unwrap(this).getForce()

        /**
         * Should we skip construct validation.
         *
         * Default: - false
         */
        override fun skipValidation(): Boolean? = unwrap(this).getSkipValidation()

        /**
         * Whether the stack should be validated after synthesis to check for error metadata.
         *
         * Default: - false
         */
        override fun validateOnSynthesis(): Boolean? = unwrap(this).getValidateOnSynthesis()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): StageSynthesisOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.StageSynthesisOptions
        ): StageSynthesisOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: StageSynthesisOptions
        ): software.amazon.awscdk.StageSynthesisOptions = (wrapped as Wrapper).cdkObject
    }
}
