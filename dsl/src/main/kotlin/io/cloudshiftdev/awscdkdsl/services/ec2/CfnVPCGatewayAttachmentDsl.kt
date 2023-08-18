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
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachment
import software.constructs.Construct

/**
 * Attaches an internet gateway, or a virtual private gateway to a VPC, enabling connectivity
 * between the internet and the VPC.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCGatewayAttachment cfnVPCGatewayAttachment = CfnVPCGatewayAttachment.Builder.create(this,
 * "MyCfnVPCGatewayAttachment")
 * .vpcId("vpcId")
 * // the properties below are optional
 * .internetGatewayId("internetGatewayId")
 * .vpnGatewayId("vpnGatewayId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html)
 */
@CdkDslMarker
public class CfnVPCGatewayAttachmentDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnVPCGatewayAttachment.Builder =
        CfnVPCGatewayAttachment.Builder.create(scope, id)

    /**
     * The ID of the internet gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-internetgatewayid)
     *
     * @param internetGatewayId The ID of the internet gateway.
     */
    public fun internetGatewayId(internetGatewayId: String) {
        cdkBuilder.internetGatewayId(internetGatewayId)
    }

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpcid)
     *
     * @param vpcId The ID of the VPC.
     */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    /**
     * The ID of the virtual private gateway.
     *
     * You must specify either `InternetGatewayId` or `VpnGatewayId` , but not both.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpcgatewayattachment.html#cfn-ec2-vpcgatewayattachment-vpngatewayid)
     *
     * @param vpnGatewayId The ID of the virtual private gateway.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): CfnVPCGatewayAttachment = cdkBuilder.build()
}
