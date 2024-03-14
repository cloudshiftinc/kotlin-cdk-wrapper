package io.cloudshiftdev.awscdk.services.cloudfront

public enum class HttpVersion(
    private val cdkObject: software.amazon.awscdk.services.cloudfront.HttpVersion,
) {
    HTTP1_1(software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP1_1),
    HTTP2(software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP2),
    HTTP2_AND_3(software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP2_AND_3),
    HTTP3(software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP3),
    ;

    public companion object {
        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.HttpVersion
        ): HttpVersion =
            when (cdkObject) {
                software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP1_1 ->
                    HttpVersion.HTTP1_1
                software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP2 -> HttpVersion.HTTP2
                software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP2_AND_3 ->
                    HttpVersion.HTTP2_AND_3
                software.amazon.awscdk.services.cloudfront.HttpVersion.HTTP3 -> HttpVersion.HTTP3
            }

        internal fun unwrap(
            wrapped: HttpVersion
        ): software.amazon.awscdk.services.cloudfront.HttpVersion = wrapped.cdkObject
    }
}
