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
import software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation
import software.constructs.Construct

/**
 * Associates the specified attachment with the specified transit gateway route table.
 *
 * You can associate one route table with an attachment.
 *
 * Before you can update the route table associated with an attachment, you must disassociate the
 * transit gateway route table that is currently associated with the attachment. First update the
 * stack to remove the associated transit gateway route table, and then update the stack with the ID
 * of the new transit gateway route table to associate.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTableAssociation cfnTransitGatewayRouteTableAssociation =
 * CfnTransitGatewayRouteTableAssociation.Builder.create(this,
 * "MyCfnTransitGatewayRouteTableAssociation")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html)
 */
@CdkDslMarker
public class CfnTransitGatewayRouteTableAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTransitGatewayRouteTableAssociation.Builder =
        CfnTransitGatewayRouteTableAssociation.Builder.create(scope, id)

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayattachmentid)
     *
     * @param transitGatewayAttachmentId The ID of the attachment.
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
        cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * The ID of the route table for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayroutetableid)
     *
     * @param transitGatewayRouteTableId The ID of the route table for the transit gateway.
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
        cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): CfnTransitGatewayRouteTableAssociation = cdkBuilder.build()
}
