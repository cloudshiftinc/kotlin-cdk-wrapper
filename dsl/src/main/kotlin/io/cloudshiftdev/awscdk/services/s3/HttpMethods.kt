package io.cloudshiftdev.awscdk.services.s3

public enum class HttpMethods(
    private val cdkObject: software.amazon.awscdk.services.s3.HttpMethods,
) {
    GET(software.amazon.awscdk.services.s3.HttpMethods.GET),
    PUT(software.amazon.awscdk.services.s3.HttpMethods.PUT),
    HEAD(software.amazon.awscdk.services.s3.HttpMethods.HEAD),
    POST(software.amazon.awscdk.services.s3.HttpMethods.POST),
    DELETE(software.amazon.awscdk.services.s3.HttpMethods.DELETE),
    ;

    public companion object {
        internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.HttpMethods): HttpMethods =
            when (cdkObject) {
                software.amazon.awscdk.services.s3.HttpMethods.GET -> HttpMethods.GET
                software.amazon.awscdk.services.s3.HttpMethods.PUT -> HttpMethods.PUT
                software.amazon.awscdk.services.s3.HttpMethods.HEAD -> HttpMethods.HEAD
                software.amazon.awscdk.services.s3.HttpMethods.POST -> HttpMethods.POST
                software.amazon.awscdk.services.s3.HttpMethods.DELETE -> HttpMethods.DELETE
            }

        internal fun unwrap(wrapped: HttpMethods): software.amazon.awscdk.services.s3.HttpMethods =
            wrapped.cdkObject
    }
}
