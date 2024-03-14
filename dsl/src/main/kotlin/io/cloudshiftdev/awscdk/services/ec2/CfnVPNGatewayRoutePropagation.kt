package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPNGatewayRoutePropagation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the VPN gateway.
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
   * The ID of the route table.
   */
  public open fun routeTableIds(): List<String> = unwrap(this).getRouteTableIds()

  /**
   * The ID of the route table.
   */
  public open fun routeTableIds(`value`: List<String>) {
    unwrap(this).setRouteTableIds(`value`)
  }

  /**
   * The ID of the route table.
   */
  public open fun routeTableIds(vararg `value`: String): Unit = routeTableIds(`value`.toList())

  /**
   * The ID of the virtual private gateway that is attached to a VPC.
   */
  public open fun vpnGatewayId(): String = unwrap(this).getVpnGatewayId()

  /**
   * The ID of the virtual private gateway that is attached to a VPC.
   */
  public open fun vpnGatewayId(`value`: String) {
    unwrap(this).setVpnGatewayId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPNGatewayRoutePropagation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     * @param routeTableIds The ID of the route table. 
     */
    public fun routeTableIds(routeTableIds: List<String>)

    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     * @param routeTableIds The ID of the route table. 
     */
    public fun routeTableIds(vararg routeTableIds: String)

    /**
     * The ID of the virtual private gateway that is attached to a VPC.
     *
     * The virtual private gateway must be attached to the same VPC that the routing tables are
     * associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway that is attached to a VPC. 
     */
    public fun vpnGatewayId(vpnGatewayId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.Builder.create(scope, id)

    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     * @param routeTableIds The ID of the route table. 
     */
    override fun routeTableIds(routeTableIds: List<String>) {
      cdkBuilder.routeTableIds(routeTableIds)
    }

    /**
     * The ID of the route table.
     *
     * The routing table must be associated with the same VPC that the virtual private gateway is
     * attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-routetableids)
     * @param routeTableIds The ID of the route table. 
     */
    override fun routeTableIds(vararg routeTableIds: String): Unit =
        routeTableIds(routeTableIds.toList())

    /**
     * The ID of the virtual private gateway that is attached to a VPC.
     *
     * The virtual private gateway must be attached to the same VPC that the routing tables are
     * associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpngatewayroutepropagation.html#cfn-ec2-vpngatewayroutepropagation-vpngatewayid)
     * @param vpnGatewayId The ID of the virtual private gateway that is attached to a VPC. 
     */
    override fun vpnGatewayId(vpnGatewayId: String) {
      cdkBuilder.vpnGatewayId(vpnGatewayId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNGatewayRoutePropagation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNGatewayRoutePropagation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation):
        CfnVPNGatewayRoutePropagation = CfnVPNGatewayRoutePropagation(cdkObject)

    internal fun unwrap(wrapped: CfnVPNGatewayRoutePropagation):
        software.amazon.awscdk.services.ec2.CfnVPNGatewayRoutePropagation = wrapped.cdkObject
  }
}
