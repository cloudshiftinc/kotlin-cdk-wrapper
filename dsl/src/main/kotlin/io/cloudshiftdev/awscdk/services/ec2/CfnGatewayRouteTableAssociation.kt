package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGatewayRouteTableAssociation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ID of the route table association.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * The ID of the gateway.
   */
  public open fun gatewayId(): String = unwrap(this).getGatewayId()

  /**
   * The ID of the gateway.
   */
  public open fun gatewayId(`value`: String) {
    unwrap(this).setGatewayId(`value`)
  }

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
  public open fun routeTableId(): String = unwrap(this).getRouteTableId()

  /**
   * The ID of the route table.
   */
  public open fun routeTableId(`value`: String) {
    unwrap(this).setRouteTableId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnGatewayRouteTableAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid)
     * @param gatewayId The ID of the gateway. 
     */
    public fun gatewayId(gatewayId: String)

    /**
     * The ID of the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid)
     * @param routeTableId The ID of the route table. 
     */
    public fun routeTableId(routeTableId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.Builder =
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.Builder.create(scope,
        id)

    /**
     * The ID of the gateway.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-gatewayid)
     * @param gatewayId The ID of the gateway. 
     */
    override fun gatewayId(gatewayId: String) {
      cdkBuilder.gatewayId(gatewayId)
    }

    /**
     * The ID of the route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-gatewayroutetableassociation.html#cfn-ec2-gatewayroutetableassociation-routetableid)
     * @param routeTableId The ID of the route table. 
     */
    override fun routeTableId(routeTableId: String) {
      cdkBuilder.routeTableId(routeTableId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGatewayRouteTableAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGatewayRouteTableAssociation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation):
        CfnGatewayRouteTableAssociation = CfnGatewayRouteTableAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnGatewayRouteTableAssociation):
        software.amazon.awscdk.services.ec2.CfnGatewayRouteTableAssociation = wrapped.cdkObject
  }
}
