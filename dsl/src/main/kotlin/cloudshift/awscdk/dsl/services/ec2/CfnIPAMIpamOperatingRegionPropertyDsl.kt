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
import software.amazon.awscdk.services.ec2.CfnIPAM

/**
 * The operating Regions for an IPAM.
 *
 * Operating Regions are AWS Regions where the IPAM is allowed to manage IP address CIDRs. IPAM only
 * discovers and monitors resources in the AWS Regions you select as operating Regions.
 *
 * For more information about operating Regions, see
 * [Create an IPAM](https://docs.aws.amazon.com//vpc/latest/ipam/create-ipam.html) in the *Amazon
 * VPC IPAM User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * IpamOperatingRegionProperty ipamOperatingRegionProperty = IpamOperatingRegionProperty.builder()
 * .regionName("regionName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ipam-ipamoperatingregion.html)
 */
@CdkDslMarker
public class CfnIPAMIpamOperatingRegionPropertyDsl {
    private val cdkBuilder: CfnIPAM.IpamOperatingRegionProperty.Builder =
        CfnIPAM.IpamOperatingRegionProperty.builder()

    /** @param regionName The name of the operating Region. */
    public fun regionName(regionName: String) {
        cdkBuilder.regionName(regionName)
    }

    public fun build(): CfnIPAM.IpamOperatingRegionProperty = cdkBuilder.build()
}
