package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface VpnGatewayProps {
    /**
     * Explicitly specify an Asn or let aws pick an Asn for you.
     *
     * Default: 65000
     */
    public fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

    /** Default type ipsec.1. */
    public fun type(): String

    /** A builder for [VpnGatewayProps] */
    @CdkDslMarker
    public interface Builder {
        /** @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you. */
        public fun amazonSideAsn(amazonSideAsn: Number)

        /** @param type Default type ipsec.1. */
        public fun type(type: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.VpnGatewayProps.Builder =
            software.amazon.awscdk.services.ec2.VpnGatewayProps.builder()

        /** @param amazonSideAsn Explicitly specify an Asn or let aws pick an Asn for you. */
        override fun amazonSideAsn(amazonSideAsn: Number) {
            cdkBuilder.amazonSideAsn(amazonSideAsn)
        }

        /** @param type Default type ipsec.1. */
        override fun type(type: String) {
            cdkBuilder.type(type)
        }

        public fun build(): software.amazon.awscdk.services.ec2.VpnGatewayProps = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.VpnGatewayProps,
    ) : VpnGatewayProps {
        /**
         * Explicitly specify an Asn or let aws pick an Asn for you.
         *
         * Default: 65000
         */
        override fun amazonSideAsn(): Number? = unwrap(this).getAmazonSideAsn()

        /** Default type ipsec.1. */
        override fun type(): String = unwrap(this).getType()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): VpnGatewayProps {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.VpnGatewayProps
        ): VpnGatewayProps = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: VpnGatewayProps
        ): software.amazon.awscdk.services.ec2.VpnGatewayProps = (wrapped as Wrapper).cdkObject
    }
}
