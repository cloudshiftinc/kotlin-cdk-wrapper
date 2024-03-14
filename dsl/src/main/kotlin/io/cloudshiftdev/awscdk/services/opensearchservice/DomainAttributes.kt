package io.cloudshiftdev.awscdk.services.opensearchservice

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface DomainAttributes {
    /** The ARN of the Amazon OpenSearch Service domain. */
    public fun domainArn(): String

    /** The domain endpoint of the Amazon OpenSearch Service domain. */
    public fun domainEndpoint(): String

    /** A builder for [DomainAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param domainArn The ARN of the Amazon OpenSearch Service domain. */
        public fun domainArn(domainArn: String)

        /** @param domainEndpoint The domain endpoint of the Amazon OpenSearch Service domain. */
        public fun domainEndpoint(domainEndpoint: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.opensearchservice.DomainAttributes.Builder =
            software.amazon.awscdk.services.opensearchservice.DomainAttributes.builder()

        /** @param domainArn The ARN of the Amazon OpenSearch Service domain. */
        override fun domainArn(domainArn: String) {
            cdkBuilder.domainArn(domainArn)
        }

        /** @param domainEndpoint The domain endpoint of the Amazon OpenSearch Service domain. */
        override fun domainEndpoint(domainEndpoint: String) {
            cdkBuilder.domainEndpoint(domainEndpoint)
        }

        public fun build(): software.amazon.awscdk.services.opensearchservice.DomainAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes,
    ) : DomainAttributes {
        /** The ARN of the Amazon OpenSearch Service domain. */
        override fun domainArn(): String = unwrap(this).getDomainArn()

        /** The domain endpoint of the Amazon OpenSearch Service domain. */
        override fun domainEndpoint(): String = unwrap(this).getDomainEndpoint()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DomainAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.opensearchservice.DomainAttributes
        ): DomainAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DomainAttributes
        ): software.amazon.awscdk.services.opensearchservice.DomainAttributes =
            (wrapped as Wrapper).cdkObject
    }
}
