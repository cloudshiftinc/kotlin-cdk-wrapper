package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersContentTypeOptions {
    /**
     * A Boolean that determines whether CloudFront overrides the X-Content-Type-Options HTTP
     * response header received from the origin with the one specified in this response headers
     * policy.
     */
    public fun `override`(): Boolean

    /** A builder for [ResponseHeadersContentTypeOptions] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param override A Boolean that determines whether CloudFront overrides the
         *   X-Content-Type-Options HTTP response header received from the origin with the one
         *   specified in this response headers policy.
         */
        public fun `override`(`override`: Boolean)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.Builder =
            software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions.builder()

        /**
         * @param override A Boolean that determines whether CloudFront overrides the
         *   X-Content-Type-Options HTTP response header received from the origin with the one
         *   specified in this response headers policy.
         */
        override fun `override`(`override`: Boolean) {
            cdkBuilder.`override`(`override`)
        }

        public fun build():
            software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions,
    ) : ResponseHeadersContentTypeOptions {
        /**
         * A Boolean that determines whether CloudFront overrides the X-Content-Type-Options HTTP
         * response header received from the origin with the one specified in this response headers
         * policy.
         */
        override fun `override`(): Boolean = unwrap(this).getOverride()
    }

    public companion object {
        init {}

        public operator fun invoke(
            block: Builder.() -> Unit = {}
        ): ResponseHeadersContentTypeOptions {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions
        ): ResponseHeadersContentTypeOptions = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ResponseHeadersContentTypeOptions
        ): software.amazon.awscdk.services.cloudfront.ResponseHeadersContentTypeOptions =
            (wrapped as Wrapper).cdkObject
    }
}
