package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.List

public interface ResponseCustomHeadersBehavior {
    /** The list of HTTP response headers and their values. */
    public fun customHeaders(): List<ResponseCustomHeader>

    /** A builder for [ResponseCustomHeadersBehavior] */
    @CdkDslMarker
    public interface Builder {
        /** @param customHeaders The list of HTTP response headers and their values. */
        public fun customHeaders(customHeaders: List<ResponseCustomHeader>)

        /** @param customHeaders The list of HTTP response headers and their values. */
        public fun customHeaders(vararg customHeaders: ResponseCustomHeader)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.Builder =
            software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior.builder()

        /** @param customHeaders The list of HTTP response headers and their values. */
        override fun customHeaders(customHeaders: List<ResponseCustomHeader>) {
            cdkBuilder.customHeaders(customHeaders.map(ResponseCustomHeader::unwrap))
        }

        /** @param customHeaders The list of HTTP response headers and their values. */
        override fun customHeaders(vararg customHeaders: ResponseCustomHeader): Unit =
            customHeaders(customHeaders.toList())

        public fun build():
            software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject:
            software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior,
    ) : ResponseCustomHeadersBehavior {
        /** The list of HTTP response headers and their values. */
        override fun customHeaders(): List<ResponseCustomHeader> =
            unwrap(this).getCustomHeaders().map(ResponseCustomHeader::wrap)
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): ResponseCustomHeadersBehavior {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior
        ): ResponseCustomHeadersBehavior = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: ResponseCustomHeadersBehavior
        ): software.amazon.awscdk.services.cloudfront.ResponseCustomHeadersBehavior =
            (wrapped as Wrapper).cdkObject
    }
}
