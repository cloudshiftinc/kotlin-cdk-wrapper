@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.ec2.*;
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
public open class CfnTransitGatewayMulticastDomainAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayMulticastDomainAssociationProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTransitGatewayMulticastDomainAssociationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTransitGatewayMulticastDomainAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTransitGatewayMulticastDomainAssociationProps(props)
  )

  /**
   * The ID of the resource.
   */
  public open fun attrResourceId(): String = unwrap(this).getAttrResourceId()

  /**
   * The type of resource, for example a VPC attachment.
   */
  public open fun attrResourceType(): String = unwrap(this).getAttrResourceType()

  /**
   * The state of the resource.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IDs of the subnets to associate with the transit gateway multicast domain.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  /**
   * The IDs of the subnets to associate with the transit gateway multicast domain.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * The ID of the transit gateway attachment.
   */
  public open fun transitGatewayAttachmentId(): String =
      unwrap(this).getTransitGatewayAttachmentId()

  /**
   * The ID of the transit gateway attachment.
   */
  public open fun transitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransitGatewayAttachmentId(`value`)
  }

  /**
   * The ID of the transit gateway multicast domain.
   */
  public open fun transitGatewayMulticastDomainId(): String =
      unwrap(this).getTransitGatewayMulticastDomainId()

  /**
   * The ID of the transit gateway multicast domain.
   */
  public open fun transitGatewayMulticastDomainId(`value`: String) {
    unwrap(this).setTransitGatewayMulticastDomainId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-subnetid)
     * @param subnetId The IDs of the subnets to associate with the transit gateway multicast
     * domain. 
     */
    public fun subnetId(subnetId: String)

    /**
     * The ID of the transit gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the transit gateway attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewaymulticastdomainid)
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    public fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation.Builder.create(scope,
        id)

    /**
     * The IDs of the subnets to associate with the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-subnetid)
     * @param subnetId The IDs of the subnets to associate with the transit gateway multicast
     * domain. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * The ID of the transit gateway attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the transit gateway attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * The ID of the transit gateway multicast domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewaymulticastdomainassociation.html#cfn-ec2-transitgatewaymulticastdomainassociation-transitgatewaymulticastdomainid)
     * @param transitGatewayMulticastDomainId The ID of the transit gateway multicast domain. 
     */
    override fun transitGatewayMulticastDomainId(transitGatewayMulticastDomainId: String) {
      cdkBuilder.transitGatewayMulticastDomainId(transitGatewayMulticastDomainId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayMulticastDomainAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayMulticastDomainAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation):
        CfnTransitGatewayMulticastDomainAssociation =
        CfnTransitGatewayMulticastDomainAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayMulticastDomainAssociation):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayMulticastDomainAssociation =
        wrapped.cdkObject
  }
}
