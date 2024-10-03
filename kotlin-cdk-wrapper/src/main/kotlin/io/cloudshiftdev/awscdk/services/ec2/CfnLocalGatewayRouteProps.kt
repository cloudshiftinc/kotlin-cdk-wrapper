@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnLocalGatewayRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnLocalGatewayRouteProps cfnLocalGatewayRouteProps = CfnLocalGatewayRouteProps.builder()
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
public interface CfnLocalGatewayRouteProps {
  /**
   * The CIDR block used for destination matches.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock)
   */
  public fun destinationCidrBlock(): String

  /**
   * The ID of the local gateway route table.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid)
   */
  public fun localGatewayRouteTableId(): String

  /**
   * The ID of the virtual interface group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid)
   */
  public fun localGatewayVirtualInterfaceGroupId(): String? =
      unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

  /**
   * The ID of the network interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-networkinterfaceid)
   */
  public fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()

  /**
   * A builder for [CfnLocalGatewayRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationCidrBlock The CIDR block used for destination matches. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    public fun localGatewayRouteTableId(localGatewayRouteTableId: String)

    /**
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group.
     */
    public fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String)

    /**
     * @param networkInterfaceId The ID of the network interface.
     */
    public fun networkInterfaceId(networkInterfaceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps.builder()

    /**
     * @param destinationCidrBlock The CIDR block used for destination matches. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param localGatewayRouteTableId The ID of the local gateway route table. 
     */
    override fun localGatewayRouteTableId(localGatewayRouteTableId: String) {
      cdkBuilder.localGatewayRouteTableId(localGatewayRouteTableId)
    }

    /**
     * @param localGatewayVirtualInterfaceGroupId The ID of the virtual interface group.
     */
    override fun localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId: String) {
      cdkBuilder.localGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId)
    }

    /**
     * @param networkInterfaceId The ID of the network interface.
     */
    override fun networkInterfaceId(networkInterfaceId: String) {
      cdkBuilder.networkInterfaceId(networkInterfaceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps,
  ) : CdkObject(cdkObject),
      CfnLocalGatewayRouteProps {
    /**
     * The CIDR block used for destination matches.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-destinationcidrblock)
     */
    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    /**
     * The ID of the local gateway route table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayroutetableid)
     */
    override fun localGatewayRouteTableId(): String = unwrap(this).getLocalGatewayRouteTableId()

    /**
     * The ID of the virtual interface group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-localgatewayvirtualinterfacegroupid)
     */
    override fun localGatewayVirtualInterfaceGroupId(): String? =
        unwrap(this).getLocalGatewayVirtualInterfaceGroupId()

    /**
     * The ID of the network interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-localgatewayroute.html#cfn-ec2-localgatewayroute-networkinterfaceid)
     */
    override fun networkInterfaceId(): String? = unwrap(this).getNetworkInterfaceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocalGatewayRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps):
        CfnLocalGatewayRouteProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocalGatewayRouteProps
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocalGatewayRouteProps):
        software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnLocalGatewayRouteProps
  }
}
