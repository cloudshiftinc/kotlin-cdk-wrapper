package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface CfnTransitGatewayRouteTablePropagationProps {
  /**
   * The ID of the attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid)
   */
  public fun transitGatewayAttachmentId(): String

  /**
   * The ID of the propagation route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid)
   */
  public fun transitGatewayRouteTableId(): String

  /**
   * A builder for [CfnTransitGatewayRouteTablePropagationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    public fun transitGatewayAttachmentId(transitGatewayAttachmentId: String)

    /**
     * @param transitGatewayRouteTableId The ID of the propagation route table. 
     */
    public fun transitGatewayRouteTableId(transitGatewayRouteTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps.builder()

    /**
     * @param transitGatewayAttachmentId The ID of the attachment. 
     */
    override fun transitGatewayAttachmentId(transitGatewayAttachmentId: String) {
      cdkBuilder.transitGatewayAttachmentId(transitGatewayAttachmentId)
    }

    /**
     * @param transitGatewayRouteTableId The ID of the propagation route table. 
     */
    override fun transitGatewayRouteTableId(transitGatewayRouteTableId: String) {
      cdkBuilder.transitGatewayRouteTableId(transitGatewayRouteTableId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayRouteTablePropagationProps {
    /**
     * The ID of the attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayattachmentid)
     */
    override fun transitGatewayAttachmentId(): String = unwrap(this).getTransitGatewayAttachmentId()

    /**
     * The ID of the propagation route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-transitgatewayroutetablepropagation.html#cfn-ec2-transitgatewayroutetablepropagation-transitgatewayroutetableid)
     */
    override fun transitGatewayRouteTableId(): String = unwrap(this).getTransitGatewayRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnTransitGatewayRouteTablePropagationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps):
        CfnTransitGatewayRouteTablePropagationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayRouteTablePropagationProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnTransitGatewayRouteTablePropagationProps
  }
}
