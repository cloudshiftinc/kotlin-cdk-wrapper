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

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint

/**
 * Contains the virtual private cloud (VPC) configuration for the specified access point.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3outposts.*;
 * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3outposts-accesspoint-vpcconfiguration.html)
 */
@CdkDslMarker
public class CfnAccessPointVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.VpcConfigurationProperty.Builder =
        CfnAccessPoint.VpcConfigurationProperty.builder()

    /** @param vpcId The ID of the VPC configuration. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnAccessPoint.VpcConfigurationProperty = cdkBuilder.build()
}
