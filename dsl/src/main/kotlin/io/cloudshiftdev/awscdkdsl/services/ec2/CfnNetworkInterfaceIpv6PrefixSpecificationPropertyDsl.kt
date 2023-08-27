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
 * Describes the IPv6 prefix.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Ipv6PrefixSpecificationProperty ipv6PrefixSpecificationProperty =
 * Ipv6PrefixSpecificationProperty.builder()
 * .ipv6Prefix("ipv6Prefix")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkinterface-ipv6prefixspecification.html)
 */
@CdkDslMarker
public class CfnNetworkInterfaceIpv6PrefixSpecificationPropertyDsl {
    private val cdkBuilder: CfnNetworkInterface.Ipv6PrefixSpecificationProperty.Builder =
        CfnNetworkInterface.Ipv6PrefixSpecificationProperty.builder()

    /**
     * @param ipv6Prefix The IPv6 prefix. For information, see
     *   [Assigning prefixes to Amazon EC2 network interfaces](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ec2-prefix-eni.html)
     *   in the *Amazon Elastic Compute Cloud User Guide* .
     */
    public fun ipv6Prefix(ipv6Prefix: String) {
        cdkBuilder.ipv6Prefix(ipv6Prefix)
    }

    public fun build(): CfnNetworkInterface.Ipv6PrefixSpecificationProperty = cdkBuilder.build()
}
