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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteProps

/**
 * Properties for defining a `CfnTransitGatewayRoute`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteProps cfnTransitGatewayRouteProps = CfnTransitGatewayRouteProps.builder()
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
public class CfnTransitGatewayRoutePropsDsl {
    private val cdkBuilder: CfnTransitGatewayRouteProps.Builder =
        CfnTransitGatewayRouteProps.builder()

    /** @param blackhole Indicates whether to drop traffic that matches this route. */
    public fun blackhole(blackhole: Boolean) {
        cdkBuilder.blackhole(blackhole)
    }

    /** @param blackhole Indicates whether to drop traffic that matches this route. */
    public fun blackhole(blackhole: IResolvable) {
        cdkBuilder.blackhole(blackhole)
    }

    /** @param destinationCidrBlock The CIDR block used for destination matches. */
    public fun destinationCidrBlock(destinationCidrBlock: String) {
        cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /** @param transitGatewayAttachmentId The ID of the attachment. */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /** @param transitGatewayRouteTableId The ID of the transit gateway route table. */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
        cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): CfnTransitGatewayRouteProps = cdkBuilder.build()
}
