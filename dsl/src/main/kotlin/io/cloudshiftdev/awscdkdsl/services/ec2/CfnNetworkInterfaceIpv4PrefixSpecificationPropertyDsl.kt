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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnNetworkInterface

/**
 * Describes an IPv4 prefix.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Ipv4PrefixSpecificationProperty ipv4PrefixSpecificationProperty =
 * Ipv4PrefixSpecificationProperty.builder()
 * .ipv4Prefix("ipv4Prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv4prefixspecification.html)
 */
@CdkDslMarker
public class CfnNetworkInterfaceIpv4PrefixSpecificationPropertyDsl {
    private val cdkBuilder: CfnNetworkInterface.Ipv4PrefixSpecificationProperty.Builder =
        CfnNetworkInterface.Ipv4PrefixSpecificationProperty.builder()

    /**
     * @param ipv4Prefix The IPv4 prefix. For information, see
     *   [Assigning prefixes to Amazon EC2 network interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun ipv4Prefix(ipv4Prefix: String) {
        cdkBuilder.ipv4Prefix(ipv4Prefix)
    }

    public fun build(): CfnNetworkInterface.Ipv4PrefixSpecificationProperty = cdkBuilder.build()
}
