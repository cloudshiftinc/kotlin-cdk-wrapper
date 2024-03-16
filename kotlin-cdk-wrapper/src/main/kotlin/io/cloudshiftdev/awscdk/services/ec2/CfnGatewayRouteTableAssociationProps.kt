@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnGatewayRouteTableAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnGatewayRouteTableAssociationProps cfnGatewayRouteTableAssociationProps =
 * CfnGatewayRouteTableAssociationProps.builder()
 * .gatewayId("gatewayId")
 * .routeTableId("routeTableId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html)
 */
public interface CfnGatewayRouteTableAssociationProps {
  /**
   * The ID of the gateway.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid)
   */
  public fun gatewayId(): String

  /**
   * The ID of the route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid)
   */
  public fun routeTableId(): String

  /**
   * A builder for [CfnGatewayRouteTableAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param gatewayId The ID of the gateway. 
     */
    public fun gatewayId(gatewayId: String)

    /**
     * @param routeTableId The ID of the route table. 
     */
    public fun routeTableId(routeTableId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps.builder()

    /**
     * @param gatewayId The ID of the gateway. 
     */
    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    /**
     * @param routeTableId The ID of the route table. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps,
  ) : CdkObject(cdkObject), CfnGatewayRouteTableAssociationProps {
    /**
     * The ID of the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid)
     */
    override fun gatewayId(): String = unwrap(this).getGatewayId()

    /**
     * The ID of the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid)
     */
    override fun routeTableId(): String = unwrap(this).getRouteTableId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnGatewayRouteTableAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps):
        CfnGatewayRouteTableAssociationProps = CdkObjectWrappers.wrap(cdkObject) as
        CfnGatewayRouteTableAssociationProps

    internal fun unwrap(wrapped: CfnGatewayRouteTableAssociationProps):
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociationProps
  }
}
