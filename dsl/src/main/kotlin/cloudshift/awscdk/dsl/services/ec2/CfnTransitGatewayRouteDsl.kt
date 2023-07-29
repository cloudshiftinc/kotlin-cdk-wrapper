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
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRoute
import software.constructs.Construct

/**
 * Specifies a static route for a transit gateway route table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayRoute cfnTransitGatewayRoute = CfnTransitGatewayRoute.Builder.create(this,
 * "MyCfnTransitGatewayRoute")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * // the properties below are optional
 * .blackhole(false)
 * .destinationCidrBlock("destinationCidrBlock")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRouteDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayRoute.Builder =
        CfnTransitGatewayRoute.Builder.create(scope, id)

    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     *
     * @param blackhole Indicates whether to drop traffic that matches this route.
     */
    public fun blackhole(blackhole: Boolean) {
        cdkBuilder.blackhole(blackhole)
    }

    /**
     * Indicates whether to drop traffic that matches this route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-blackhole)
     *
     * @param blackhole Indicates whether to drop traffic that matches this route.
     */
    public fun blackhole(blackhole: IResolvable) {
        cdkBuilder.blackhole(blackhole)
    }

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-destinationcidrblock)
     *
     * @param destinationCidrBlock The CIDR block used for destination matches.
     */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayattachmentid)
     *
     * @param transitGatewayAttachmentId The ID of the attachment.
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * The ID of the transit gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroute.html#cfn-ec2-transitgatewayroute-transitgatewayroutetableid)
     *
     * @param transitGatewayRouteTableId The ID of the transit gateway route table.
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
        cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): CfnTransitGatewayRoute = cdkBuilder.build()
}
