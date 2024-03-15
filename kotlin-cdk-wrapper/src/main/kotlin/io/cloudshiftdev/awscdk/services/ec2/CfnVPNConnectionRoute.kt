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
 * Specifies a static route for a VPN connection between an existing virtual private gateway and a
 * VPN customer gateway.
 *
 * The static route allows traffic to be routed from the virtual private gateway to the VPN customer
 * gateway.
 *
 * For more information, see [AWS Site-to-Site
 * VPN](https://docs.aws.amazon.com/vpn/latest/s2svpn/VPC_VPN.html) in the *AWS Site-to-Site VPN User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVPNConnectionRoute cfnVPNConnectionRoute = CfnVPNConnectionRoute.Builder.create(this,
 * "MyCfnVPNConnectionRoute")
 * .destinationCidrBlock("destinationCidrBlock")
 * .vpnConnectionId("vpnConnectionId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html)
 */
public open class CfnVPNConnectionRoute internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The CIDR block associated with the local subnet of the customer network.
   */
  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  /**
   * The CIDR block associated with the local subnet of the customer network.
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
   * The ID of the VPN connection.
   */
  public open fun vpnConnectionId(): String = unwrap(this).getVpnConnectionId()

  /**
   * The ID of the VPN connection.
   */
  public open fun vpnConnectionId(`value`: String) {
    unwrap(this).setVpnConnectionId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnVPNConnectionRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The CIDR block associated with the local subnet of the customer network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-destinationcidrblock)
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     * network. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * The ID of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-vpnconnectionid)
     * @param vpnConnectionId The ID of the VPN connection. 
     */
    public fun vpnConnectionId(vpnConnectionId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute.Builder.create(scope, id)

    /**
     * The CIDR block associated with the local subnet of the customer network.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-destinationcidrblock)
     * @param destinationCidrBlock The CIDR block associated with the local subnet of the customer
     * network. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the VPN connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-vpnconnectionroute.html#cfn-ec2-vpnconnectionroute-vpnconnectionid)
     * @param vpnConnectionId The ID of the VPN connection. 
     */
    override fun vpnConnectionId(vpnConnectionId: String) {
      cdkBuilder.vpnConnectionId(vpnConnectionId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnVPNConnectionRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnVPNConnectionRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute):
        CfnVPNConnectionRoute = CfnVPNConnectionRoute(cdkObject)

    internal fun unwrap(wrapped: CfnVPNConnectionRoute):
        software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute = wrapped.cdkObject
  }
}
