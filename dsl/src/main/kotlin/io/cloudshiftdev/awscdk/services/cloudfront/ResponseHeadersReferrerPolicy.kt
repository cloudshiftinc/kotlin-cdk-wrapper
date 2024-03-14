package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface ResponseHeadersReferrerPolicy {
    /**
     * A Boolean that determines whether CloudFront overrides the Referrer-Policy HTTP response
     * header received from the origin with the one specified in this response headers policy.
     */
    public fun `override`(): Boolean

    /** The value of the Referrer-Policy HTTP response header. */
    public fun referrerPolicy(): HeadersReferrerPolicy

    /** A builder for [ResponseHeadersReferrerPolicy] */
    @CdkDslMarker
    public interface Builder {
        /**
         * @param override A Boolean that determines whether CloudFront overrides the
         *   Referrer-Policy HTTP response header received from the origin with the one specified in
         *   this response headers policy.
         */
        public fun `override`(`override`: Boolean)

        /** @param referrerPolicy The value of the Referrer-Policy HTTP response header. */
        public fun referrerPolicy(referrerPolicy: HeadersReferrerPolicy)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy.Builder =
            software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy.builder()

        /**
         * @param override A Boolean that determines whether CloudFront overrides the
         *   Referrer-Policy HTTP response header received from the origin with the one specified in
         *   this response headers policy.
         */
        override fun `override`(`override`: Boolean) {
            cdkBuilder.`override`(`override`)
        }

        /** @param referrerPolicy The value of the Referrer-Policy HTTP response header. */
        override fun referrerPolicy(referrerPolicy: HeadersReferrerPolicy) {
            cdkBuilder.referrerPolicy(referrerPolicy.let(HeadersReferrerPolicy::unwrap))
        }

        public fun build():
            software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy,
    ) : ResponseHeadersReferrerPolicy {
        /**
         * A Boolean that determines whether CloudFront overrides the Referrer-Policy HTTP response
         * header received from the origin with the one specified in this response headers policy.
         */
        override fun `override`(): Boolean = unwrap(this).getOverride()

        /** The value of the Referrer-Policy HTTP response header. */
        override fun referrerPolicy(): HeadersReferrerPolicy =
            unwrap(this).getReferrerPolicy().let(HeadersReferrerPolicy::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ResponseHeadersReferrerPolicy {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy
        ): ResponseHeadersReferrerPolicy = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ResponseHeadersReferrerPolicy
        ): software.amazon.awscdk.services.cloudfront.ResponseHeadersReferrerPolicy =
            (wrapped as Wrapper).cdkObject
    }
}
