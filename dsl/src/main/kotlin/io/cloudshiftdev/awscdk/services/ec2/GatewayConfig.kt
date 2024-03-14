package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface GatewayConfig {
    /** Availability Zone. */
    public fun az(): String

    /** Identity of gateway spawned by the provider. */
    public fun gatewayId(): String

    /** A builder for [GatewayConfig] */
    @CdkDslMarker
    public interface Builder {
        /** @param az Availability Zone. */
        public fun az(az: String)

        /** @param gatewayId Identity of gateway spawned by the provider. */
        public fun gatewayId(gatewayId: String)
    }

    private class BuilderImpl : Builder {
        private val cdkBuilder: software.amazon.awscdk.services.ec2.GatewayConfig.Builder =
            software.amazon.awscdk.services.ec2.GatewayConfig.builder()

        /** @param az Availability Zone. */
        override fun az(az: String) {
            cdkBuilder.az(az)
        }

        /** @param gatewayId Identity of gateway spawned by the provider. */
        override fun gatewayId(gatewayId: String) {
            cdkBuilder.gatewayId(gatewayId)
        }

        public fun build(): software.amazon.awscdk.services.ec2.GatewayConfig = cdkBuilder.build()
    }

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.GatewayConfig,
    ) : GatewayConfig {
        /** Availability Zone. */
        override fun az(): String = unwrap(this).getAz()

        /** Identity of gateway spawned by the provider. */
        override fun gatewayId(): String = unwrap(this).getGatewayId()
    }

    public companion object {
        init {}

        public operator fun invoke(block: Builder.() -> Unit = {}): GatewayConfig {
            val builderImpl = BuilderImpl()
            return Wrapper(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.ec2.GatewayConfig
        ): GatewayConfig = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: GatewayConfig
        ): software.amazon.awscdk.services.ec2.GatewayConfig = (wrapped as Wrapper).cdkObject
    }
}
