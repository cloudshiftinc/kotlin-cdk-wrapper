package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnVPNConnectionRoute internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ec2.CfnVPNConnectionRoute,
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
    init {

    }

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
