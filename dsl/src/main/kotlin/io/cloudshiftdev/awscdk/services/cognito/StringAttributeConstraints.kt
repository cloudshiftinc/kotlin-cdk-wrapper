package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.Unit

public interface StringAttributeConstraints {
    /**
     * Maximum length of this attribute.
     *
     * Default: 2048
     */
    public fun maxLen(): Number? = unwrap(this).getMaxLen()

    /**
     * Minimum length of this attribute.
     *
     * Default: 0
     */
    public fun minLen(): Number? = unwrap(this).getMinLen()

    /** A builder for [StringAttributeConstraints] */
    @CdkDslMarker
    public interface Builder {
        /** @param maxLen Maximum length of this attribute. */
        public fun maxLen(maxLen: Number)

        /** @param minLen Minimum length of this attribute. */
        public fun minLen(minLen: Number)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cognito.StringAttributeConstraints.Builder =
            software.amazon.awscdk.services.cognito.StringAttributeConstraints.builder()

        /** @param maxLen Maximum length of this attribute. */
        override fun maxLen(maxLen: Number) {
            cdkBuilder.maxLen(maxLen)
        }

        /** @param minLen Minimum length of this attribute. */
        override fun minLen(minLen: Number) {
            cdkBuilder.minLen(minLen)
        }

        public fun build(): software.amazon.awscdk.services.cognito.StringAttributeConstraints =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.cognito.StringAttributeConstraints,
    ) : StringAttributeConstraints {
        /**
         * Maximum length of this attribute.
         *
         * Default: 2048
         */
        override fun maxLen(): Number? = unwrap(this).getMaxLen()

        /**
         * Minimum length of this attribute.
         *
         * Default: 0
         */
        override fun minLen(): Number? = unwrap(this).getMinLen()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): StringAttributeConstraints {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cognito.StringAttributeConstraints
        ): StringAttributeConstraints = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: StringAttributeConstraints
        ): software.amazon.awscdk.services.cognito.StringAttributeConstraints =
            (wrapped as Wrapper).cdkObject
    }
}
