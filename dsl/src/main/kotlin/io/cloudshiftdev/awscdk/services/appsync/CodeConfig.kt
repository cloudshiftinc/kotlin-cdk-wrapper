package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CodeConfig {
    /**
     * Inline code (mutually exclusive with `s3Location`).
     *
     * Default: - code is not inline code
     */
    public fun inlineCode(): String? = unwrap(this).getInlineCode()

    /**
     * The location of the code in S3 (mutually exclusive with `inlineCode`.
     *
     * Default: - code is not an s3 location
     */
    public fun s3Location(): String? = unwrap(this).getS3Location()

    /** A builder for [CodeConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param inlineCode Inline code (mutually exclusive with `s3Location`). */
        public fun inlineCode(inlineCode: String)

        /**
         * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`.
         */
        public fun s3Location(s3Location: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.appsync.CodeConfig.Builder =
            software.amazon.awscdk.services.appsync.CodeConfig.builder()

        /** @param inlineCode Inline code (mutually exclusive with `s3Location`). */
        override fun inlineCode(inlineCode: String) {
            cdkBuilder.inlineCode(inlineCode)
        }

        /**
         * @param s3Location The location of the code in S3 (mutually exclusive with `inlineCode`.
         */
        override fun s3Location(s3Location: String) {
            cdkBuilder.s3Location(s3Location)
        }

        public fun build(): software.amazon.awscdk.services.appsync.CodeConfig = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.appsync.CodeConfig,
    ) : CodeConfig {
        /**
         * Inline code (mutually exclusive with `s3Location`).
         *
         * Default: - code is not inline code
         */
        override fun inlineCode(): String? = unwrap(this).getInlineCode()

        /**
         * The location of the code in S3 (mutually exclusive with `inlineCode`.
         *
         * Default: - code is not an s3 location
         */
        override fun s3Location(): String? = unwrap(this).getS3Location()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): CodeConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.appsync.CodeConfig
        ): CodeConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: CodeConfig
        ): software.amazon.awscdk.services.appsync.CodeConfig = (wrapped as Wrapper).cdkObject
    }
}
