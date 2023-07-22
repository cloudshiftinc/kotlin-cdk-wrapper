@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation
import software.constructs.Construct

/**
 * Associates the specified subnets and transit gateway attachments with the specified transit
 * gateway multicast domain.
 *
 * The transit gateway attachment must be in the available state before you can add a resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnTransitGatewayMulticastDomainAssociation cfnTransitGatewayMulticastDomainAssociation =
 * CfnTransitGatewayMulticastDomainAssociation.Builder.create(this,
 * "MyCfnTransitGatewayMulticastDomainAssociation")
 * .subnetId("subnetId")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html)
 */
@CdkDslMarker
public class CfnTransitGatewayMulticastDomainAssociationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTransitGatewayMulticastDomainAssociation.Builder =
      CfnTransitGatewayMulticastDomainAssociation.Builder.create(scope, id)

  /**
   * The IDs of the subnets to associate with the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-subnetid)
   * @param subnetId The IDs of the subnets to associate with the transit gateway multicast domain. 
   */
  public fun subnetId(subnetId: String) {
    cdkBuilder.subnetId(subnetId)
  }

  /**
   * The ID of the transit gateway attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewayattachmentid)
   * @param transitGatewayAttachmentId The ID of the transit gateway attachment. 
   */
  public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
    cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
  }

  /**
   * The ID of the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewaymulticastdomainid)
   * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
   */
  public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
    cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
  }

  public fun build(): CfnTransitGatewayMulticastDomainAssociation = cdkBuilder.build()
}
