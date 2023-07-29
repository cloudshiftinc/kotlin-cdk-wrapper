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
import software.amazon.awscdk.services.ec2.CfnVPCGatewayAttachmentProps

/**
 * Properties for defining a `CfnVPCGatewayAttachment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnVPCGatewayAttachmentProps cfnVPCGatewayAttachmentProps =
 * CfnVPCGatewayAttachmentProps.builder()
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
public class CfnVPCGatewayAttachmentPropsDsl {
    private val cdkBuilder: CfnVPCGatewayAttachmentProps.Builder =
        CfnVPCGatewayAttachmentProps.builder()

    /**
     * @param internetGatewayId The ID of the internet gateway. You must specify either
     *   `InternetGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun internetGatewayId(internetGatewayId: String) {
        cdkBuilder.internetGatewayId(internetGatewayId)
    }

    /** @param vpcId The ID of the VPC. */
    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    /**
     * @param vpnGatewayId The ID of the virtual private gateway. You must specify either
     *   `InternetGatewayId` or `VpnGatewayId` , but not both.
     */
    public fun vpnGatewayId(vpnGatewayId: String) {
        cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): CfnVPCGatewayAttachmentProps = cdkBuilder.build()
}
