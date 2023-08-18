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
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGatewayProps

/**
 * Properties for defining a `CfnEgressOnlyInternetGateway`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnEgressOnlyInternetGatewayProps cfnEgressOnlyInternetGatewayProps =
 * CfnEgressOnlyInternetGatewayProps.builder()
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
 */
@CdkDslMarker
public class CfnEgressOnlyInternetGatewayPropsDsl {
    private val cdkBuilder: CfnEgressOnlyInternetGatewayProps.Builder =
        CfnEgressOnlyInternetGatewayProps.builder()

    /** @param vpcId The ID of the VPC for which to create the egress-only internet gateway. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnEgressOnlyInternetGatewayProps = cdkBuilder.build()
}
