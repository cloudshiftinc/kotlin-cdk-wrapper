package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLocalGatewayRouteTableVPCAssociationProps {
  /**
   * The ID of the local gateway route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-localgatewayroutetableid)
   */
  public fun localGatewayRouteTableId(): String

  /**
   * The tags assigned to the association.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the VPC.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-vpcid)
   */
  public fun vpcId(): String

  /**
   * A builder for [CfnLocalGatewayRouteTableVPCAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    /**
     * @param tags The tags assigned to the association.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the association.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcId The ID of the VPC. 
     */
    public fun vpcId(vpcId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps.builder()

    /**
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /**
     * @param tags The tags assigned to the association.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the association.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcId The ID of the VPC. 
     */
    override fun vpcId(vpcId: String) {
      cdkBuilder.vpcId(vpcId)
    }

    public fun build():
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps,
  ) : CdkObject(cdkObject), CfnLocalGatewayRouteTableVPCAssociationProps {
    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-localgatewayroutetableid)
     */
    override fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

    /**
     * The tags assigned to the association.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroutetablevpcassociation.html#cfn-ec2-localgatewayroutetablevpcassociation-vpcid)
     */
    override fun vpcId(): String = unwrap(this).getVpcId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnLocalGatewayRouteTableVPCAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps):
        CfnLocalGatewayRouteTableVPCAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteTableVPCAssociationProps):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteTableVPCAssociationProps
  }
}
