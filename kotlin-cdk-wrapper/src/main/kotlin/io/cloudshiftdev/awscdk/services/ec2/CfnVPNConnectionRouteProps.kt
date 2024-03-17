@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnVPNConnectionRoute`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPNConnectionRouteProps cfnVPNConnectionRouteProps = CfnVPNConnectionRouteProps.builder()
 * .destinationCidrBlock("destinationCidrBlock")
 * .vpnConnectionId("vpnConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html)
 */
public interface CfnVPNConnectionRouteProps {
  /**
   * The CIDR block associated with the local subnet of the customer network.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-destinationcidrblock)
   */
  public fun destinationCidrBlock(): String

  /**
   * The ID of the VPN connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-vpnconnectionid)
   */
  public fun vpnConnectionId(): String

  /**
   * A builder for [CfnVPNConnectionRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     * network. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * @param vpnConnectionId The ID of the VPN connection. 
     */
    public fun vpnConnectionId(vpnConnectionId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps.builder()

    /**
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     * network. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * @param vpnConnectionId The ID of the VPN connection. 
     */
    override fun vpnConnectionId(vpnConnectionId: String) {
      cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps,
  ) : CdkObject(cdkObject), CfnVPNConnectionRouteProps {
    /**
     * The CIDR block associated with the local subnet of the customer network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-destinationcidrblock)
     */
    override fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

    /**
     * The ID of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-vpnconnectionid)
     */
    override fun vpnConnectionId(): String = unwrap(this).getVpnConnectionId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVPNConnectionRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps):
        CfnVPNConnectionRouteProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVPNConnectionRouteProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnectionRouteProps):
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVPNConnectionRouteProps
  }
}
