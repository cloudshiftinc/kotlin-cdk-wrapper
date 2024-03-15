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
 * Creates a static route for the specified local gateway route table. You must specify one of the
 * following targets:.
 *
 * * `LocalGatewayVirtualInterfaceGroupId`
 * * `NetworkInterfaceId`
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnLocalGatewayRoute cfnLocalGatewayRoute = CfnLocalGatewayRoute.Builder.create(this,
 * "MyCfnLocalGatewayRoute")
 * .destinationCidrBlock("destinationCidrBlock")
 * .localGatewayRouteTableId("localGatewayRouteTableId")
 * // the properties below are optional
 * .localGatewayVirtualInterfaceGroupId("localGatewayVirtualInterfaceGroupId")
 * .networkInterfaceId("networkInterfaceId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html)
 */
public open class CfnLocalGatewayRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The state of the local gateway route table.
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * The type of local gateway route.
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * The CIDR block used for destination matches.
   */
  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  /**
   * The CIDR block used for destination matches.
   */
  public open fun destinationCidrBlock(`value`: String) {
    unwrap(this).setDestinationCidrBlock(`value`)
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
   * The ID of the local gateway route table.
   */
  public open fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

  /**
   * The ID of the local gateway route table.
   */
  public open fun localGatewayRouteTableId(`value`: String) {
    unwrap(this).setLocalGatewayRouteTableId(`value`)
  }

  /**
   * The ID of the virtual interface group.
   */
  public open fun localGatewayVirtualInterfaceGroupId(): String? =
      unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

  /**
   * The ID of the virtual interface group.
   */
  public open fun localGatewayVirtualInterfaceGroupId(`value`: String) {
    unwrap(this).setLocalGatewayVirtualInterfaceGroupId(`value`)
  }

  /**
   * The ID of the network interface.
   */
  public open fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * The ID of the network interface.
   */
  public open fun networkInterfaceId(`value`: String) {
    unwrap(this).setNetworkInterfaceId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnLocalGatewayRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock)
     * @param destinationCidrBlock The CIDR block used for destination matches. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid)
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid)
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. 
     */
    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String)

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-networkinterfaceid)
     * @param networkInterfaceId The ID of the network interface. 
     */
    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.Builder.create(scope, id)

    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock)
     * @param destinationCidrBlock The CIDR block used for destination matches. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid)
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid)
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group. 
     */
    override fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-networkinterfaceid)
     * @param networkInterfaceId The ID of the network interface. 
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocalGatewayRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocalGatewayRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute):
        CfnLocalGatewayRoute = CfnLocalGatewayRoute(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRoute):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRoute = wrapped.cdkObject
  }
}
