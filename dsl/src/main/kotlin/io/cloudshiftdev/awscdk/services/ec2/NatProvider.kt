package io.cloudshiftdev.awscdk.services.ec2

import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class NatProvider
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.ec2.NatProvider,
) {
    /**
     * Called by the VPC to configure NAT.
     *
     * Don't call this directly, the VPC will call it automatically.
     *
     * @param options
     */
    public open fun configureNat(options: ConfigureNatOptions) {
        unwrap(this).configureNat(options.let(ConfigureNatOptions::unwrap))
    }

    /**
     * Called by the VPC to configure NAT.
     *
     * Don't call this directly, the VPC will call it automatically.
     *
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dd4e1c7dc445ecccb0628de1d2dc0402a07b93c21145f259b74eb40763acacfd")
    public open fun configureNat(options: ConfigureNatOptions.Builder.() -> Unit): Unit =
        configureNat(ConfigureNatOptions(options))

    /**
     * Configures subnet with the gateway.
     *
     * Don't call this directly, the VPC will call it automatically.
     *
     * @param subnet
     */
    public open fun configureSubnet(subnet: PrivateSubnet) {
        unwrap(this).configureSubnet(subnet.let(PrivateSubnet::unwrap))
    }

    /** Return list of gateways spawned by the provider. */
    public open fun configuredGateways(): List<GatewayConfig> =
        unwrap(this).getConfiguredGateways().map(GatewayConfig::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.ec2.NatProvider,
    ) : NatProvider(cdkObject)

    public companion object {
        public fun gateway(): NatProvider =
            software.amazon.awscdk.services.ec2.NatProvider.gateway().let(NatProvider::wrap)

        public fun gateway(props: NatGatewayProps): NatProvider =
            software.amazon.awscdk.services.ec2.NatProvider.gateway(
                    props.let(NatGatewayProps::unwrap)
                )
                .let(NatProvider::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("64b0328c12f8c57b834fc161debeb09c1a129907450a628bafc6db79ec2ad8b0")
        public fun gateway(props: NatGatewayProps.Builder.() -> Unit): NatProvider =
            gateway(NatGatewayProps(props))

        @Deprecated(message = "deprecated in CDK")
        public fun instance(props: NatInstanceProps): NatInstanceProvider =
            software.amazon.awscdk.services.ec2.NatProvider.instance(
                    props.let(NatInstanceProps::unwrap)
                )
                .let(NatInstanceProvider::wrap)

        @Deprecated(message = "deprecated in CDK")
        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("e4756f1ce29243f2902a18caf5bd16557796eeb80d8b08801724d9a08b9d659c")
        public fun instance(props: NatInstanceProps.Builder.() -> Unit): NatInstanceProvider =
            instance(NatInstanceProps(props))

        public fun instanceV2(props: NatInstanceProps): NatInstanceProviderV2 =
            software.amazon.awscdk.services.ec2.NatProvider.instanceV2(
                    props.let(NatInstanceProps::unwrap)
                )
                .let(NatInstanceProviderV2::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("68043635bfbcb6b4bfd37b41f8eae5b1f4bc7b843f1638eed2cd515d86b18eda")
        public fun instanceV2(props: NatInstanceProps.Builder.() -> Unit): NatInstanceProviderV2 =
            instanceV2(NatInstanceProps(props))

        internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.NatProvider): NatProvider =
            Wrapper(cdkObject)

        internal fun unwrap(wrapped: NatProvider): software.amazon.awscdk.services.ec2.NatProvider =
            (wrapped as Wrapper).cdkObject
    }
}
