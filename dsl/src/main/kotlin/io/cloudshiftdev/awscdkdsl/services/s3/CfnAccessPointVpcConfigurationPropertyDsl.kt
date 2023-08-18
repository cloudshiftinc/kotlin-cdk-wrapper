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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.s3.CfnAccessPoint

/**
 * The Virtual Private Cloud (VPC) configuration for this access point.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * VpcConfigurationProperty vpcConfigurationProperty = VpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-accesspoint-vpcconfiguration.html)
 */
@CdkDslMarker
public class CfnAccessPointVpcConfigurationPropertyDsl {
    private val cdkBuilder: CfnAccessPoint.VpcConfigurationProperty.Builder =
        CfnAccessPoint.VpcConfigurationProperty.builder()

    /**
     * @param vpcId If this field is specified, the access point will only allow connections from
     *   the specified VPC ID.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnAccessPoint.VpcConfigurationProperty = cdkBuilder.build()
}
