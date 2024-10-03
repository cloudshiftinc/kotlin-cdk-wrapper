@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnVPNGatewayRoutePropagation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPNGatewayRoutePropagationProps cfnVPNGatewayRoutePropagationProps =
 * CfnVPNGatewayRoutePropagationProps.builder()
 * .routeTableIds(List.of("routeTableIds"))
 * .vpnGatewayId("vpnGatewayId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html)
 */
public interface CfnVPNGatewayRoutePropagationProps {
  /**
   * The ID of the route table.
   *
   * The routing table must be associated with the same VPC that the virtual private gateway is
   * attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
   */
  public fun routeTableIds(): List<String>

  /**
   * The ID of the virtual private gateway that is attached to a VPC.
   *
   * The virtual private gateway must be attached to the same VPC that the routing tables are
   * associated with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-vpngatewayid)
   */
  public fun vpnGatewayId(): String

  /**
   * A builder for [CfnVPNGatewayRoutePropagationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param routeTableIds The ID of the route table. 
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     */
    public fun routeTableIds(routeTableIds: List<String>)

    /**
     * @param routeTableIds The ID of the route table. 
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     */
    public fun routeTableIds(vararg routeTableIds: String)

    /**
     * @param vpnGatewayId The ID of the virtual private gateway that is attached to a VPC. 
     * The virtual private gateway must be attached to the same VPC that the routing tables are
     * associated with.
     */
    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps.builder()

    /**
     * @param routeTableIds The ID of the route table. 
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     */
    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    /**
     * @param routeTableIds The ID of the route table. 
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     */
    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    /**
     * @param vpnGatewayId The ID of the virtual private gateway that is attached to a VPC. 
     * The virtual private gateway must be attached to the same VPC that the routing tables are
     * associated with.
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps,
  ) : CdkObject(cdkObject),
      CfnVPNGatewayRoutePropagationProps {
    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     */
    override fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds()

    /**
     * The ID of the virtual private gateway that is attached to a VPC.
     *
     * The virtual private gateway must be attached to the same VPC that the routing tables are
     * associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-vpngatewayid)
     */
    override fun vpnGatewayId(): String = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNGatewayRoutePropagationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps):
        CfnVPNGatewayRoutePropagationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPNGatewayRoutePropagationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNGatewayRoutePropagationProps):
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagationProps
  }
}
