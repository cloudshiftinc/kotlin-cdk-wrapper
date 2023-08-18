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
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the IPv6 address for the instance.
 *
 * `InstanceIpv6Address` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * InstanceIpv6AddressProperty instanceIpv6AddressProperty = InstanceIpv6AddressProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-instanceipv6address.html)
 */
@CdkDslMarker
public class CfnInstanceInstanceIpv6AddressPropertyDsl {
    private val cdkBuilder: CfnInstance.InstanceIpv6AddressProperty.Builder =
        CfnInstance.InstanceIpv6AddressProperty.builder()

    /** @param ipv6Address The IPv6 address. */
    public fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
    }

    public fun build(): CfnInstance.InstanceIpv6AddressProperty = cdkBuilder.build()
}
