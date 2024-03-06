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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.globalaccelerator.AcceleratorProps
import software.amazon.awscdk.services.globalaccelerator.IpAddressType

/**
 * Construct properties of the Accelerator.
 *
 * Example:
 * ```
 * Accelerator accelerator = Accelerator.Builder.create(this, "Accelerator")
 * .ipAddresses(List.of("1.1.1.1", "2.2.2.2"))
 * .ipAddressType(IpAddressType.IPV4)
 * .build();
 * ```
 */
@CdkDslMarker
public class AcceleratorPropsDsl {
    private val cdkBuilder: AcceleratorProps.Builder = AcceleratorProps.builder()

    private val _ipAddresses: MutableList<String> = mutableListOf()

    /** @param acceleratorName The name of the accelerator. */
    public fun acceleratorName(acceleratorName: String) {
        cdkBuilder.acceleratorName(acceleratorName)
    }

    /** @param enabled Indicates whether the accelerator is enabled. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * @param ipAddressType The IP address type that an accelerator supports. For a standard
     *   accelerator, the value can be IPV4 or DUAL_STACK.
     */
    public fun ipAddressType(ipAddressType: IpAddressType) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param ipAddresses IP addresses associated with the accelerator. Optionally, if you've added
     *   your own IP address pool to Global Accelerator (BYOIP), you can choose IP addresses from
     *   your own pool to use for the accelerator's static IP addresses when you create an
     *   accelerator. You can specify one or two addresses, separated by a comma. Do not include the
     *   /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a
     * second static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     */
    public fun ipAddresses(vararg ipAddresses: String) {
        _ipAddresses.addAll(listOf(*ipAddresses))
    }

    /**
     * @param ipAddresses IP addresses associated with the accelerator. Optionally, if you've added
     *   your own IP address pool to Global Accelerator (BYOIP), you can choose IP addresses from
     *   your own pool to use for the accelerator's static IP addresses when you create an
     *   accelerator. You can specify one or two addresses, separated by a comma. Do not include the
     *   /32 suffix.
     *
     * Only one IP address from each of your IP address ranges can be used for each accelerator. If
     * you specify only one IP address from your IP address range, Global Accelerator assigns a
     * second static IP address for the accelerator from the AWS IP address pool.
     *
     * Note that you can't update IP addresses for an existing accelerator. To change them, you must
     * create a new accelerator with the new addresses.
     */
    public fun ipAddresses(ipAddresses: Collection<String>) {
        _ipAddresses.addAll(ipAddresses)
    }

    public fun build(): AcceleratorProps {
        if (_ipAddresses.isNotEmpty()) cdkBuilder.ipAddresses(_ipAddresses)
        return cdkBuilder.build()
    }
}
