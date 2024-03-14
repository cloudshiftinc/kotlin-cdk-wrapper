package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CachePolicy
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicy,
) : Resource(cdkObject), ICachePolicy {
    /** The ID of the cache policy. */
    public override fun cachePolicyId(): String = unwrap(this).getCachePolicyId()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.cloudfront.CachePolicy]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * A unique name to identify the cache policy.
         *
         * The name must only include '-', '_', or alphanumeric characters.
         *
         * Default: - generated from the `id`
         *
         * @param cachePolicyName A unique name to identify the cache policy.
         */
        public fun cachePolicyName(cachePolicyName: String)

        /**
         * A comment to describe the cache policy.
         *
         * Default: - no comment
         *
         * @param comment A comment to describe the cache policy.
         */
        public fun comment(comment: String)

        /**
         * Determines whether any cookies in viewer requests are included in the cache key and
         * automatically included in requests that CloudFront sends to the origin.
         *
         * Default: CacheCookieBehavior.none()
         *
         * @param cookieBehavior Determines whether any cookies in viewer requests are included in
         *   the cache key and automatically included in requests that CloudFront sends to the
         *   origin.
         */
        public fun cookieBehavior(cookieBehavior: CacheCookieBehavior)

        /**
         * The default amount of time for objects to stay in the CloudFront cache.
         *
         * Only used when the origin does not send Cache-Control or Expires headers with the object.
         *
         * Default: - The greater of 1 day and ``minTtl``
         *
         * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache.
         */
        public fun defaultTtl(defaultTtl: Duration)

        /**
         * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
         * `Accept-Encoding` header is 'br'.
         *
         * Default: false
         *
         * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
         *   header in the cache key when the `Accept-Encoding` header is 'br'.
         */
        public fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean)

        /**
         * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
         * `Accept-Encoding` header is 'gzip'.
         *
         * Default: false
         *
         * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding`
         *   header in the cache key when the `Accept-Encoding` header is 'gzip'.
         */
        public fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean)

        /**
         * Determines whether any HTTP headers are included in the cache key and automatically
         * included in requests that CloudFront sends to the origin.
         *
         * Default: CacheHeaderBehavior.none()
         *
         * @param headerBehavior Determines whether any HTTP headers are included in the cache key
         *   and automatically included in requests that CloudFront sends to the origin.
         */
        public fun headerBehavior(headerBehavior: CacheHeaderBehavior)

        /**
         * The maximum amount of time for objects to stay in the CloudFront cache.
         *
         * CloudFront uses this value only when the origin sends Cache-Control or Expires headers
         * with the object.
         *
         * Default: - The greater of 1 year and ``defaultTtl``
         *
         * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache.
         */
        public fun maxTtl(maxTtl: Duration)

        /**
         * The minimum amount of time for objects to stay in the CloudFront cache.
         *
         * Default: Duration.seconds(0)
         *
         * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache.
         */
        public fun minTtl(minTtl: Duration)

        /**
         * Determines whether any query strings are included in the cache key and automatically
         * included in requests that CloudFront sends to the origin.
         *
         * Default: CacheQueryStringBehavior.none()
         *
         * @param queryStringBehavior Determines whether any query strings are included in the cache
         *   key and automatically included in requests that CloudFront sends to the origin.
         */
        public fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.cloudfront.CachePolicy.Builder =
            software.amazon.awscdk.services.cloudfront.CachePolicy.Builder.create(scope, id)

        /**
         * A unique name to identify the cache policy.
         *
         * The name must only include '-', '_', or alphanumeric characters.
         *
         * Default: - generated from the `id`
         *
         * @param cachePolicyName A unique name to identify the cache policy.
         */
        override fun cachePolicyName(cachePolicyName: String) {
            cdkBuilder.cachePolicyName(cachePolicyName)
        }

        /**
         * A comment to describe the cache policy.
         *
         * Default: - no comment
         *
         * @param comment A comment to describe the cache policy.
         */
        override fun comment(comment: String) {
            cdkBuilder.comment(comment)
        }

        /**
         * Determines whether any cookies in viewer requests are included in the cache key and
         * automatically included in requests that CloudFront sends to the origin.
         *
         * Default: CacheCookieBehavior.none()
         *
         * @param cookieBehavior Determines whether any cookies in viewer requests are included in
         *   the cache key and automatically included in requests that CloudFront sends to the
         *   origin.
         */
        override fun cookieBehavior(cookieBehavior: CacheCookieBehavior) {
            cdkBuilder.cookieBehavior(cookieBehavior.let(CacheCookieBehavior::unwrap))
        }

        /**
         * The default amount of time for objects to stay in the CloudFront cache.
         *
         * Only used when the origin does not send Cache-Control or Expires headers with the object.
         *
         * Default: - The greater of 1 day and ``minTtl``
         *
         * @param defaultTtl The default amount of time for objects to stay in the CloudFront cache.
         */
        override fun defaultTtl(defaultTtl: Duration) {
            cdkBuilder.defaultTtl(defaultTtl.let(Duration::unwrap))
        }

        /**
         * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
         * `Accept-Encoding` header is 'br'.
         *
         * Default: false
         *
         * @param enableAcceptEncodingBrotli Whether to normalize and include the `Accept-Encoding`
         *   header in the cache key when the `Accept-Encoding` header is 'br'.
         */
        override fun enableAcceptEncodingBrotli(enableAcceptEncodingBrotli: Boolean) {
            cdkBuilder.enableAcceptEncodingBrotli(enableAcceptEncodingBrotli)
        }

        /**
         * Whether to normalize and include the `Accept-Encoding` header in the cache key when the
         * `Accept-Encoding` header is 'gzip'.
         *
         * Default: false
         *
         * @param enableAcceptEncodingGzip Whether to normalize and include the `Accept-Encoding`
         *   header in the cache key when the `Accept-Encoding` header is 'gzip'.
         */
        override fun enableAcceptEncodingGzip(enableAcceptEncodingGzip: Boolean) {
            cdkBuilder.enableAcceptEncodingGzip(enableAcceptEncodingGzip)
        }

        /**
         * Determines whether any HTTP headers are included in the cache key and automatically
         * included in requests that CloudFront sends to the origin.
         *
         * Default: CacheHeaderBehavior.none()
         *
         * @param headerBehavior Determines whether any HTTP headers are included in the cache key
         *   and automatically included in requests that CloudFront sends to the origin.
         */
        override fun headerBehavior(headerBehavior: CacheHeaderBehavior) {
            cdkBuilder.headerBehavior(headerBehavior.let(CacheHeaderBehavior::unwrap))
        }

        /**
         * The maximum amount of time for objects to stay in the CloudFront cache.
         *
         * CloudFront uses this value only when the origin sends Cache-Control or Expires headers
         * with the object.
         *
         * Default: - The greater of 1 year and ``defaultTtl``
         *
         * @param maxTtl The maximum amount of time for objects to stay in the CloudFront cache.
         */
        override fun maxTtl(maxTtl: Duration) {
            cdkBuilder.maxTtl(maxTtl.let(Duration::unwrap))
        }

        /**
         * The minimum amount of time for objects to stay in the CloudFront cache.
         *
         * Default: Duration.seconds(0)
         *
         * @param minTtl The minimum amount of time for objects to stay in the CloudFront cache.
         */
        override fun minTtl(minTtl: Duration) {
            cdkBuilder.minTtl(minTtl.let(Duration::unwrap))
        }

        /**
         * Determines whether any query strings are included in the cache key and automatically
         * included in requests that CloudFront sends to the origin.
         *
         * Default: CacheQueryStringBehavior.none()
         *
         * @param queryStringBehavior Determines whether any query strings are included in the cache
         *   key and automatically included in requests that CloudFront sends to the origin.
         */
        override fun queryStringBehavior(queryStringBehavior: CacheQueryStringBehavior) {
            cdkBuilder.queryStringBehavior(
                queryStringBehavior.let(CacheQueryStringBehavior::unwrap)
            )
        }

        public fun build(): software.amazon.awscdk.services.cloudfront.CachePolicy =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromCachePolicyId(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            cachePolicyId: String,
        ): ICachePolicy =
            software.amazon.awscdk.services.cloudfront.CachePolicy.fromCachePolicyId(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    cachePolicyId
                )
                .let(ICachePolicy::wrap)

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): CachePolicy {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return CachePolicy(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.CachePolicy
        ): CachePolicy = CachePolicy(cdkObject)

        internal fun unwrap(
            wrapped: CachePolicy
        ): software.amazon.awscdk.services.cloudfront.CachePolicy = wrapped.cdkObject
    }
}
