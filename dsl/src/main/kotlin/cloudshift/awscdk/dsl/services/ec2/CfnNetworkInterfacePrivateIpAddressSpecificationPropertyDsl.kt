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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnNetworkInterface

/**
 * Describes a secondary private IPv4 address for a network interface.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * PrivateIpAddressSpecificationProperty privateIpAddressSpecificationProperty =
 * PrivateIpAddressSpecificationProperty.builder()
 * .primary(false)
 * .privateIpAddress("privateIpAddress")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-privateipaddressspecification.html)
 */
@CdkDslMarker
public class CfnNetworkInterfacePrivateIpAddressSpecificationPropertyDsl {
    private val cdkBuilder: CfnNetworkInterface.PrivateIpAddressSpecificationProperty.Builder =
        CfnNetworkInterface.PrivateIpAddressSpecificationProperty.builder()

    /**
     * @param primary Sets the private IP address as the primary private address. You can set only
     *   one primary private IP address. If you don't specify a primary private IP address, Amazon
     *   EC2 automatically assigns a primary private IP address.
     */
    public fun primary(primary: Boolean) {
        cdkBuilder.primary(primary)
    }

    /**
     * @param primary Sets the private IP address as the primary private address. You can set only
     *   one primary private IP address. If you don't specify a primary private IP address, Amazon
     *   EC2 automatically assigns a primary private IP address.
     */
    public fun primary(primary: IResolvable) {
        cdkBuilder.primary(primary)
    }

    /** @param privateIpAddress The private IP address of the network interface. */
    public fun privateIpAddress(privateIpAddress: String) {
        cdkBuilder.privateIpAddress(privateIpAddress)
    }

    public fun build(): CfnNetworkInterface.PrivateIpAddressSpecificationProperty =
        cdkBuilder.build()
}
