@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.globalaccelerator

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.globalaccelerator.AcceleratorAttributes

/**
 * Attributes required to import an existing accelerator to the stack.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.globalaccelerator.*;
 * AcceleratorAttributes acceleratorAttributes = AcceleratorAttributes.builder()
 * .acceleratorArn("acceleratorArn")
 * .dnsName("dnsName")
 * // the properties below are optional
 * .dualStackDnsName("dualStackDnsName")
 * .ipv4Addresses(List.of("ipv4Addresses"))
 * .ipv6Addresses(List.of("ipv6Addresses"))
 * .build();
 * ```
 */
@CdkDslMarker
public class AcceleratorAttributesDsl {
    private val cdkBuilder: AcceleratorAttributes.Builder = AcceleratorAttributes.builder()

    private val _ipv4Addresses: MutableList<String> = mutableListOf()

    private val _ipv6Addresses: MutableList<String> = mutableListOf()

    /** @param acceleratorArn The ARN of the accelerator. */
    public fun acceleratorArn(acceleratorArn: String) {
        cdkBuilder.acceleratorArn(acceleratorArn)
    }

    /** @param dnsName The DNS name of the accelerator. */
    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    /**
     * @param dualStackDnsName The DNS name that points to the dual-stack accelerator's four static
     *   IP addresses: two IPv4 addresses and two IPv6 addresses.
     */
    public fun dualStackDnsName(dualStackDnsName: String) {
        cdkBuilder.dualStackDnsName(dualStackDnsName)
    }

    /** @param ipv4Addresses The array of IPv4 addresses in the IP address set. */
    public fun ipv4Addresses(vararg ipv4Addresses: String) {
        _ipv4Addresses.addAll(listOf(*ipv4Addresses))
    }

    /** @param ipv4Addresses The array of IPv4 addresses in the IP address set. */
    public fun ipv4Addresses(ipv4Addresses: Collection<String>) {
        _ipv4Addresses.addAll(ipv4Addresses)
    }

    /** @param ipv6Addresses The array of IPv6 addresses in the IP address set. */
    public fun ipv6Addresses(vararg ipv6Addresses: String) {
        _ipv6Addresses.addAll(listOf(*ipv6Addresses))
    }

    /** @param ipv6Addresses The array of IPv6 addresses in the IP address set. */
    public fun ipv6Addresses(ipv6Addresses: Collection<String>) {
        _ipv6Addresses.addAll(ipv6Addresses)
    }

    public fun build(): AcceleratorAttributes {
        if (_ipv4Addresses.isNotEmpty()) cdkBuilder.ipv4Addresses(_ipv4Addresses)
        if (_ipv6Addresses.isNotEmpty()) cdkBuilder.ipv6Addresses(_ipv6Addresses)
        return cdkBuilder.build()
    }
}
