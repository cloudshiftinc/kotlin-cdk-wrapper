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

package io.cloudshiftdev.awscdkdsl.services.redshift

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnEndpointAccess

/**
 * The security groups associated with the endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * VpcSecurityGroupProperty vpcSecurityGroupProperty = VpcSecurityGroupProperty.builder()
 * .status("status")
 * .vpcSecurityGroupId("vpcSecurityGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-redshift-endpointaccess-vpcsecuritygroup.html)
 */
@CdkDslMarker
public class CfnEndpointAccessVpcSecurityGroupPropertyDsl {
    private val cdkBuilder: CfnEndpointAccess.VpcSecurityGroupProperty.Builder =
        CfnEndpointAccess.VpcSecurityGroupProperty.builder()

    /** @param status The status of the endpoint. */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /** @param vpcSecurityGroupId The identifier of the VPC security group. */
    public fun vpcSecurityGroupId(vpcSecurityGroupId: String) {
        cdkBuilder.vpcSecurityGroupId(vpcSecurityGroupId)
    }

    public fun build(): CfnEndpointAccess.VpcSecurityGroupProperty = cdkBuilder.build()
}
