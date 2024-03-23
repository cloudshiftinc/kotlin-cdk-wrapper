@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnTransitGatewayMulticastDomainAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnTransitGatewayMulticastDomainAssociationProps cfnTransitGatewayMulticastDomainAssociationProps
 * = CfnTransitGatewayMulticastDomainAssociationProps.builder()
 * .subnetId("subnetId")
 * .transitGatewayAttachmentId("transitGatewayAttachmentId")
 * .transitGatewayMulticastDomainId("transitGatewayMulticastDomainId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html)
 */
public interface CfnTransitGatewayMulticastDomainAssociationProps {
  /**
   * The IDs of the subnets to associate with the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-subnetid)
   */
  public fun subnetId(): String

  /**
   * The ID of the transit gateway attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewayattachmentid)
   */
  public fun transitGatewayAttachmentId(): String

  /**
   * The ID of the transit gateway multicast domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewaymulticastdomainid)
   */
  public fun transitGatewayMulticastDomainId(): String

  /**
   * A builder for [CfnTransitGatewayMulticastDomainAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param subnetId The IDs of the subnets to associate with the transit gateway multicast
     * domain. 
     */
    public fun subnetId(subnetId: String)

    /**
     * @param transitGatewayAttachmentId The ID of the transit gateway attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps.Builder
        =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps.builder()

    /**
     * @param subnetId The IDs of the subnets to associate with the transit gateway multicast
     * domain. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param transitGatewayAttachmentId The ID of the transit gateway attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayMulticastDomainAssociationProps {
    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-subnetid)
     */
    override fun subnetId(): String = unwrap(this).getSubnetId()

    /**
     * The ID of the transit gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewayattachmentid)
     */
    override fun transitGatewayAttachmentId(): String = unwrap(this).getTransitGatewayAttachmentId()

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewaymulticastdomainid)
     */
    override fun transitGatewayMulticastDomainId(): String =
        unwrap(this).getTransitGatewayMulticastDomainId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayMulticastDomainAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps):
        CfnTransitGatewayMulticastDomainAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTransitGatewayMulticastDomainAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastDomainAssociationProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociationProps
  }
}
