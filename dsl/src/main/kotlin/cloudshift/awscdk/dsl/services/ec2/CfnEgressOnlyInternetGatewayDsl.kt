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
import software.amazon.awscdk.services.ec2.CfnEgressOnlyInternetGateway
import software.constructs.Construct

/**
 * [IPv6 only] Specifies an egress-only internet gateway for your VPC.
 *
 * An egress-only internet gateway is used to enable outbound communication over IPv6 from instances
 * in your VPC to the internet, and prevents hosts outside of your VPC from initiating an IPv6
 * connection with your instance.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnEgressOnlyInternetGateway cfnEgressOnlyInternetGateway =
 * CfnEgressOnlyInternetGateway.Builder.create(this, "MyCfnEgressOnlyInternetGateway")
 * .vpcId("vpcId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html)
 */
@CdkDslMarker
public class CfnEgressOnlyInternetGatewayDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEgressOnlyInternetGateway.Builder =
        CfnEgressOnlyInternetGateway.Builder.create(scope, id)

    /**
     * The ID of the VPC for which to create the egress-only internet gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-egressonlyinternetgateway.html#cfn-ec2-egressonlyinternetgateway-vpcid)
     *
     * @param vpcId The ID of the VPC for which to create the egress-only internet gateway.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): CfnEgressOnlyInternetGateway = cdkBuilder.build()
}
