package io.cloudshiftdev.awscdk.services.cloudfront

public enum class HeadersReferrerPolicy(
    private val cdkObject: software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy,
) {
    NO_REFERRER(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.NO_REFERRER),
    NO_REFERRER_WHEN_DOWNGRADE(
        software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.NO_REFERRER_WHEN_DOWNGRADE
    ),
    ORIGIN(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.ORIGIN),
    ORIGIN_WHEN_CROSS_ORIGIN(
        software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.ORIGIN_WHEN_CROSS_ORIGIN
    ),
    SAME_ORIGIN(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.SAME_ORIGIN),
    STRICT_ORIGIN(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.STRICT_ORIGIN),
    STRICT_ORIGIN_WHEN_CROSS_ORIGIN(
        software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy
            .STRICT_ORIGIN_WHEN_CROSS_ORIGIN
    ),
    UNSAFE_URL(software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.UNSAFE_URL),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy
        ): HeadersReferrerPolicy =
            when (cdkObject) {
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.NO_REFERRER ->
                    HeadersReferrerPolicy.NO_REFERRER
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy
                    .NO_REFERRER_WHEN_DOWNGRADE -> HeadersReferrerPolicy.NO_REFERRER_WHEN_DOWNGRADE
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.ORIGIN ->
                    HeadersReferrerPolicy.ORIGIN
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy
                    .ORIGIN_WHEN_CROSS_ORIGIN -> HeadersReferrerPolicy.ORIGIN_WHEN_CROSS_ORIGIN
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.SAME_ORIGIN ->
                    HeadersReferrerPolicy.SAME_ORIGIN
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.STRICT_ORIGIN ->
                    HeadersReferrerPolicy.STRICT_ORIGIN
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy
                    .STRICT_ORIGIN_WHEN_CROSS_ORIGIN ->
                    HeadersReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN
                software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy.UNSAFE_URL ->
                    HeadersReferrerPolicy.UNSAFE_URL
            }

        internal fun unwrap(
            wrapped: HeadersReferrerPolicy
        ): software.amazon.awscdk.services.cloudfront.HeadersReferrerPolicy = wrapped.cdkObject
    }
}
