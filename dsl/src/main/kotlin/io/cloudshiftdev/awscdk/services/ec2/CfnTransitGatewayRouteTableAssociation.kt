package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTransitGatewayRouteTableAssociation internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the attachment.
   */
  public open fun transitGatewayAttachmentId(): String =
      unwrap(this).getTransitGatewayAttachmentId()

  /**
   * The ID of the attachment.
   */
  public open fun transitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransitGatewayAttachmentId(`value`)
  }

  /**
   * The ID of the route table for the transit gateway.
   */
  public open fun transitGatewayRouteTableId(): String =
      unwrap(this).getTransitGatewayRouteTableId()

  /**
   * The ID of the route table for the transit gateway.
   */
  public open fun transitGatewayRouteTableId(`value`: String) {
    unwrap(this).setTransitGatewayRouteTableId(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * The ID of the route table for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayroutetableid)
     * @param transitGatewayRouteTableId The ID of the route table for the transit gateway. 
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation.Builder.create(scope,
        id)

    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayattachmentid)
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * The ID of the route table for the transit gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetableassociation.html#cfn-ec2-transitgatewayroutetableassociation-transitgatewayroutetableid)
     * @param transitGatewayRouteTableId The ID of the route table for the transit gateway. 
     */
    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayRouteTableAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayRouteTableAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation):
        CfnTransitGatewayRouteTableAssociation = CfnTransitGatewayRouteTableAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTableAssociation):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTableAssociation =
        wrapped.cdkObject
  }
}
