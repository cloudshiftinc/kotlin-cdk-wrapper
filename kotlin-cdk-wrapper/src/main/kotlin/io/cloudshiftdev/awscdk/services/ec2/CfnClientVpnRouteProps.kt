@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnClientVpnRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnClientVpnRouteProps cfnClientVpnRouteProps = CfnClientVpnRouteProps.builder()
 * .clientVpnEndpointId("clientVpnEndpointId")
 * .destinationCidrBlock("destinationCidrBlock")
 * .targetVpcSubnetId("targetVpcSubnetId")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html)
 */
public interface CfnClientVpnRouteProps {
  /**
   * The ID of the Client VPN endpoint to which to add the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-clientvpnendpointid)
   */
  public fun clientVpnEndpointId(): String

  /**
   * A brief description of the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The IPv4 address range, in CIDR notation, of the route destination. For example:.
   *
   * * To add a route for Internet access, enter `0.0.0.0/0`
   * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
   * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
   * CIDR range
   * * To add a route for the local network, enter the client CIDR range
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-destinationcidrblock)
   */
  public fun destinationCidrBlock(): String

  /**
   * The ID of the subnet through which you want to route traffic.
   *
   * The specified subnet must be an existing target network of the Client VPN endpoint.
   *
   * Alternatively, if you're adding a route for the local network, specify `local` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-targetvpcsubnetid)
   */
  public fun targetVpcSubnetId(): String

  /**
   * A builder for [CfnClientVpnRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clientVpnEndpointId The ID of the Client VPN endpoint to which to add the route. 
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    /**
     * @param description A brief description of the route.
     */
    public fun description(description: String)

    /**
     * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route
     * destination. For example:. 
     * * To add a route for Internet access, enter `0.0.0.0/0`
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
     * CIDR range
     * * To add a route for the local network, enter the client CIDR range
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param targetVpcSubnetId The ID of the subnet through which you want to route traffic. 
     * The specified subnet must be an existing target network of the Client VPN endpoint.
     *
     * Alternatively, if you're adding a route for the local network, specify `local` .
     */
    public fun targetVpcSubnetId(targetVpcSubnetId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps.builder()

    /**
     * @param clientVpnEndpointId The ID of the Client VPN endpoint to which to add the route. 
     */
    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * @param description A brief description of the route.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route
     * destination. For example:. 
     * * To add a route for Internet access, enter `0.0.0.0/0`
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
     * CIDR range
     * * To add a route for the local network, enter the client CIDR range
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param targetVpcSubnetId The ID of the subnet through which you want to route traffic. 
     * The specified subnet must be an existing target network of the Client VPN endpoint.
     *
     * Alternatively, if you're adding a route for the local network, specify `local` .
     */
    override fun targetVpcSubnetId(targetVpcSubnetId: String) {
      cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps,
  ) : CdkObject(cdkObject), CfnClientVpnRouteProps {
    /**
     * The ID of the Client VPN endpoint to which to add the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-clientvpnendpointid)
     */
    override fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

    /**
     * A brief description of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The IPv4 address range, in CIDR notation, of the route destination. For example:.
     *
     * * To add a route for Internet access, enter `0.0.0.0/0`
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN connection's IPv4
     * CIDR range
     * * To add a route for the local network, enter the client CIDR range
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-destinationcidrblock)
     */
    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    /**
     * The ID of the subnet through which you want to route traffic.
     *
     * The specified subnet must be an existing target network of the Client VPN endpoint.
     *
     * Alternatively, if you're adding a route for the local network, specify `local` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-targetvpcsubnetid)
     */
    override fun targetVpcSubnetId(): String = unwrap(this).getTargetVpcSubnetId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnClientVpnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps):
        CfnClientVpnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnRouteProps):
        software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnClientVpnRouteProps
  }
}
