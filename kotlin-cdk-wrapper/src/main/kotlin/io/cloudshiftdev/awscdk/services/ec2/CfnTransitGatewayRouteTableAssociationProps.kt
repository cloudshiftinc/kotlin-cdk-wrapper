@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTransitGatewayRouteTableAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayRouteTableAssociationProps cfnTransitGatewayRouteTableAssociationProps =
 * CfnTransitGatewayRouteTableAssociationProps.builder()
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayRouteTableId("transitGatewayRouteTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html)
 */
public interface CfnTransitGatewayRouteTableAssociationProps {
  /**
   * The ID of the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayattachmentid)
   */
  public fun transitGatewayAttachmentId(): String

  /**
   * The ID of the route table for the transit gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayroutetableid)
   */
  public fun transitGatewayRouteTableId(): String

  /**
   * A builder for [CfnTransitGatewayRouteTableAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * @param transitGatewayRouteTableId The ID of the route table for the transit gateway. 
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps.builder()

    /**
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * @param transitGatewayRouteTableId The ID of the route table for the transit gateway. 
     */
    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteTableAssociationProps {
    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayattachmentid)
     */
    override fun transitGatewayAttachmentId(): String = unwrap(this).getTransitGatewayAttachmentId()

    /**
     * The ID of the route table for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayroutetableid)
     */
    override fun transitGatewayRouteTableId(): String = unwrap(this).getTransitGatewayRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayRouteTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps):
        CfnTransitGatewayRouteTableAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableAssociationProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociationProps
  }
}
