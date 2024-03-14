package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersFrameOptions {
    /** The value of the X-Frame-Options HTTP response header. */
    public fun frameOption(): HeadersFrameOption

    /**
     * A Boolean that determines whether CloudFront overrides the X-Frame-Options HTTP response
     * header received from the origin with the one specified in this response headers policy.
     */
    public fun `override`(): Boolean

    /** A builder for [ResponseHeadersFrameOptions] */
    @CdkDslMarker
    public interface Builder {
        /** @param frameOption The value of the X-Frame-Options HTTP response header. */
        public fun frameOption(frameOption: HeadersFrameOption)

        /**
         * @param override A Boolean that determines whether CloudFront overrides the
         *   X-Frame-Options HTTP response header received from the origin with the one specified in
         *   this response headers policy.
         */
        public fun `override`(`override`: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions.Builder =
            software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions.builder()

        /** @param frameOption The value of the X-Frame-Options HTTP response header. */
        override fun frameOption(frameOption: HeadersFrameOption) {
            cdkBuilder.frameOption(frameOption.let(HeadersFrameOption::unwrap))
        }

        /**
         * @param override A Boolean that determines whether CloudFront overrides the
         *   X-Frame-Options HTTP response header received from the origin with the one specified in
         *   this response headers policy.
         */
        override fun `override`(`override`: Boolean) {
            cdkBuilder.`override`(`override`)
        }

        public fun build(): software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions,
    ) : ResponseHeadersFrameOptions {
        /** The value of the X-Frame-Options HTTP response header. */
        override fun frameOption(): HeadersFrameOption =
            unwrap(this).getFrameOption().let(HeadersFrameOption::wrap)

        /**
         * A Boolean that determines whether CloudFront overrides the X-Frame-Options HTTP response
         * header received from the origin with the one specified in this response headers policy.
         */
        override fun `override`(): Boolean = unwrap(this).getOverride()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersFrameOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions
        ): ResponseHeadersFrameOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ResponseHeadersFrameOptions
        ): software.amazon.awscdk.services.cloudfront.ResponseHeadersFrameOptions =
            (wrapped as Wrapper).cdkObject
    }
}
