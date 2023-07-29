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
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies an IPv6 address in an Amazon EC2 launch template.
 *
 * `Ipv6Add` is a property of
 * [AWS::EC2::LaunchTemplate NetworkInterface](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-networkinterface.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * Ipv6AddProperty ipv6AddProperty = Ipv6AddProperty.builder()
 * .ipv6Address("ipv6Address")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-ipv6add.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateIpv6AddPropertyDsl {
    private val cdkBuilder: CfnLaunchTemplate.Ipv6AddProperty.Builder =
        CfnLaunchTemplate.Ipv6AddProperty.builder()

    /**
     * @param ipv6Address One or more specific IPv6 addresses from the IPv6 CIDR block range of your
     *   subnet. You can't use this option if you're specifying a number of IPv6 addresses.
     */
    public fun ipv6Address(ipv6Address: String) {
        cdkBuilder.ipv6Address(ipv6Address)
    }

    public fun build(): CfnLaunchTemplate.Ipv6AddProperty = cdkBuilder.build()
}
