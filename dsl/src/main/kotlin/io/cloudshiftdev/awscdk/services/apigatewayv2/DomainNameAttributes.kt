package io.cloudshiftdev.awscdk.services.apigatewayv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface DomainNameAttributes {
    /** domain name string. */
    public fun name(): String

    /** The domain name associated with the regional endpoint for this custom domain name. */
    public fun regionalDomainName(): String

    /** The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. */
    public fun regionalHostedZoneId(): String

    /** A builder for [DomainNameAttributes] */
    @CdkDslMarker
    public interface Builder {
        /** @param name domain name string. */
        public fun name(name: String)

        /**
         * @param regionalDomainName The domain name associated with the regional endpoint for this
         *   custom domain name.
         */
        public fun regionalDomainName(regionalDomainName: String)

        /**
         * @param regionalHostedZoneId The region-specific Amazon Route 53 Hosted Zone ID of the
         *   regional endpoint.
         */
        public fun regionalHostedZoneId(regionalHostedZoneId: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes.Builder =
            software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes.builder()

        /** @param name domain name string. */
        override fun name(name: String) {
            cdkBuilder.name(name)
        }

        /**
         * @param regionalDomainName The domain name associated with the regional endpoint for this
         *   custom domain name.
         */
        override fun regionalDomainName(regionalDomainName: String) {
            cdkBuilder.regionalDomainName(regionalDomainName)
        }

        /**
         * @param regionalHostedZoneId The region-specific Amazon Route 53 Hosted Zone ID of the
         *   regional endpoint.
         */
        override fun regionalHostedZoneId(regionalHostedZoneId: String) {
            cdkBuilder.regionalHostedZoneId(regionalHostedZoneId)
        }

        public fun build(): software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes =
            cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes,
    ) : DomainNameAttributes {
        /** domain name string. */
        override fun name(): String = unwrap(this).getName()

        /** The domain name associated with the regional endpoint for this custom domain name. */
        override fun regionalDomainName(): String = unwrap(this).getRegionalDomainName()

        /** The region-specific Amazon Route 53 Hosted Zone ID of the regional endpoint. */
        override fun regionalHostedZoneId(): String = unwrap(this).getRegionalHostedZoneId()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): DomainNameAttributes {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes
        ): DomainNameAttributes = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: DomainNameAttributes
        ): software.amazon.awscdk.services.apigatewayv2.DomainNameAttributes =
            (wrapped as Wrapper).cdkObject
    }
}
