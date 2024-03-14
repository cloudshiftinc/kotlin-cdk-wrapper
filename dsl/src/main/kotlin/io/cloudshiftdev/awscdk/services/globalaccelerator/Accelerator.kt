package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Accelerator
internal constructor(
    private val cdkObject: software.amazon.awscdk.services.globalaccelerator.Accelerator,
) : Resource(cdkObject), IAccelerator {
    /** The ARN of the accelerator. */
    public override fun acceleratorArn(): String = unwrap(this).getAcceleratorArn()

    /**
     * Add a listener to the accelerator.
     *
     * @param id
     * @param options
     */
    public open fun addListener(id: String, options: ListenerOptions): Listener =
        unwrap(this).addListener(id, options.let(ListenerOptions::unwrap)).let(Listener::wrap)

    /**
     * Add a listener to the accelerator.
     *
     * @param id
     * @param options
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3a537d56cd609f4e030fbd8e6b8a3bdde515eef17250a02dd94781d6a97f6c33")
    public open fun addListener(id: String, options: ListenerOptions.Builder.() -> Unit): Listener =
        addListener(id, ListenerOptions(options))

    /**
     * The Domain Name System (DNS) name that Global Accelerator creates that points to your
     * accelerator's static IP addresses.
     */
    public override fun dnsName(): String = unwrap(this).getDnsName()

    /**
     * The DNS name that points to the dual-stack accelerator's four static IP addresses: two IPv4
     * addresses and two IPv6 addresses.
     */
    public override fun dualStackDnsName(): String? = unwrap(this).getDualStackDnsName()

    /** The array of IPv4 addresses in the IP address set. */
    public override fun ipv4Addresses(): List<String> =
        unwrap(this).getIpv4Addresses() ?: emptyList()

    /** The array of IPv6 addresses in the IP address set. */
    public override fun ipv6Addresses(): List<String> =
        unwrap(this).getIpv6Addresses() ?: emptyList()

    /** A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.Accelerator]. */
    @CdkDslMarker
    public interface Builder {
        /**
         * The name of the accelerator.
         *
         * Default: - resource ID
         *
         * @param acceleratorName The name of the accelerator.
         */
        public fun acceleratorName(acceleratorName: String)

        /**
         * Indicates whether the accelerator is enabled.
         *
         * Default: true
         *
         * @param enabled Indicates whether the accelerator is enabled.
         */
        public fun enabled(enabled: Boolean)

        /**
         * The IP address type that an accelerator supports.
         *
         * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
         *
         * Default: - "IPV4"
         *
         * @param ipAddressType The IP address type that an accelerator supports.
         */
        public fun ipAddressType(ipAddressType: IpAddressType)

        /**
         * IP addresses associated with the accelerator.
         *
         * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you
         * can choose IP addresses from your own pool to use for the accelerator's static IP
         * addresses when you create an accelerator. You can specify one or two addresses, separated
         * by a comma. Do not include the /32 suffix.
         *
         * Only one IP address from each of your IP address ranges can be used for each accelerator.
         * If you specify only one IP address from your IP address range, Global Accelerator assigns
         * a second static IP address for the accelerator from the AWS IP address pool.
         *
         * Note that you can't update IP addresses for an existing accelerator. To change them, you
         * must create a new accelerator with the new addresses.
         *
         * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
         *
         * @param ipAddresses IP addresses associated with the accelerator.
         */
        public fun ipAddresses(ipAddresses: List<String>)

        /**
         * IP addresses associated with the accelerator.
         *
         * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you
         * can choose IP addresses from your own pool to use for the accelerator's static IP
         * addresses when you create an accelerator. You can specify one or two addresses, separated
         * by a comma. Do not include the /32 suffix.
         *
         * Only one IP address from each of your IP address ranges can be used for each accelerator.
         * If you specify only one IP address from your IP address range, Global Accelerator assigns
         * a second static IP address for the accelerator from the AWS IP address pool.
         *
         * Note that you can't update IP addresses for an existing accelerator. To change them, you
         * must create a new accelerator with the new addresses.
         *
         * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
         *
         * @param ipAddresses IP addresses associated with the accelerator.
         */
        public fun ipAddresses(vararg ipAddresses: String)
    }

    private class BuilderImpl(
        scope: SoftwareConstructsConstruct,
        id: String,
    ) : Builder {
        private val cdkBuilder:
            software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder =
            software.amazon.awscdk.services.globalaccelerator.Accelerator.Builder.create(scope, id)

        /**
         * The name of the accelerator.
         *
         * Default: - resource ID
         *
         * @param acceleratorName The name of the accelerator.
         */
        override fun acceleratorName(acceleratorName: String) {
            cdkBuilder.acceleratorName(acceleratorName)
        }

        /**
         * Indicates whether the accelerator is enabled.
         *
         * Default: true
         *
         * @param enabled Indicates whether the accelerator is enabled.
         */
        override fun enabled(enabled: Boolean) {
            cdkBuilder.enabled(enabled)
        }

        /**
         * The IP address type that an accelerator supports.
         *
         * For a standard accelerator, the value can be IPV4 or DUAL_STACK.
         *
         * Default: - "IPV4"
         *
         * @param ipAddressType The IP address type that an accelerator supports.
         */
        override fun ipAddressType(ipAddressType: IpAddressType) {
            cdkBuilder.ipAddressType(ipAddressType.let(IpAddressType::unwrap))
        }

        /**
         * IP addresses associated with the accelerator.
         *
         * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you
         * can choose IP addresses from your own pool to use for the accelerator's static IP
         * addresses when you create an accelerator. You can specify one or two addresses, separated
         * by a comma. Do not include the /32 suffix.
         *
         * Only one IP address from each of your IP address ranges can be used for each accelerator.
         * If you specify only one IP address from your IP address range, Global Accelerator assigns
         * a second static IP address for the accelerator from the AWS IP address pool.
         *
         * Note that you can't update IP addresses for an existing accelerator. To change them, you
         * must create a new accelerator with the new addresses.
         *
         * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
         *
         * @param ipAddresses IP addresses associated with the accelerator.
         */
        override fun ipAddresses(ipAddresses: List<String>) {
            cdkBuilder.ipAddresses(ipAddresses)
        }

        /**
         * IP addresses associated with the accelerator.
         *
         * Optionally, if you've added your own IP address pool to Global Accelerator (BYOIP), you
         * can choose IP addresses from your own pool to use for the accelerator's static IP
         * addresses when you create an accelerator. You can specify one or two addresses, separated
         * by a comma. Do not include the /32 suffix.
         *
         * Only one IP address from each of your IP address ranges can be used for each accelerator.
         * If you specify only one IP address from your IP address range, Global Accelerator assigns
         * a second static IP address for the accelerator from the AWS IP address pool.
         *
         * Note that you can't update IP addresses for an existing accelerator. To change them, you
         * must create a new accelerator with the new addresses.
         *
         * Default: - undefined. IP addresses will be from Amazon's pool of IP addresses.
         *
         * @param ipAddresses IP addresses associated with the accelerator.
         */
        override fun ipAddresses(vararg ipAddresses: String): Unit =
            ipAddresses(ipAddresses.toList())

        public fun build(): software.amazon.awscdk.services.globalaccelerator.Accelerator =
            cdkBuilder.build()
    }

    public companion object {
        public fun fromAcceleratorAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: AcceleratorAttributes,
        ): IAccelerator =
            software.amazon.awscdk.services.globalaccelerator.Accelerator.fromAcceleratorAttributes(
                    scope.let(CloudshiftdevConstructsConstruct::unwrap),
                    id,
                    attrs.let(AcceleratorAttributes::unwrap)
                )
                .let(IAccelerator::wrap)

        @Suppress("INAPPLICABLE_JVM_NAME")
        @JvmName("8baed08c541ab0b2afcc742de4fe7296b53dea3fc9b6ce5fdfb9dc99c2a62385")
        public fun fromAcceleratorAttributes(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            attrs: AcceleratorAttributes.Builder.() -> Unit,
        ): IAccelerator = fromAcceleratorAttributes(scope, id, AcceleratorAttributes(attrs))

        public operator fun invoke(
            scope: CloudshiftdevConstructsConstruct,
            id: String,
            block: Builder.() -> Unit = {},
        ): Accelerator {
            val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
            return Accelerator(builderImpl.apply(block).build())
        }

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.globalaccelerator.Accelerator
        ): Accelerator = Accelerator(cdkObject)

        internal fun unwrap(
            wrapped: Accelerator
        ): software.amazon.awscdk.services.globalaccelerator.Accelerator = wrapped.cdkObject
    }
}
