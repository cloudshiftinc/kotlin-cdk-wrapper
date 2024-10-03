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
 * Specifies a network route to add to a Client VPN endpoint.
 *
 * Each Client VPN endpoint has a route table that describes the available destination network
 * routes. Each route in the route table specifies the path for traffic to specific resources or
 * networks.
 *
 * A target network association must be created before you can specify a route. If you're setting up
 * all the components of a Client VPN endpoint at the same time, you must use the [DependsOn
 * Attribute](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-attribute-dependson.html)
 * to declare a dependency on the `AWS::EC2::ClientVpnTargetNetworkAssociation` resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnClientVpnRoute cfnClientVpnRoute = CfnClientVpnRoute.Builder.create(this,
 * "MyCfnClientVpnRoute")
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
public open class CfnClientVpnRoute(
  cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRoute,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClientVpnRouteProps,
  ) :
      this(software.amazon.awscdk.services.ec2.CfnClientVpnRoute(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnClientVpnRouteProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnClientVpnRouteProps.Builder.() -> Unit,
  ) : this(scope, id, CfnClientVpnRouteProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the Client VPN endpoint to which to add the route.
   */
  public open fun clientVpnEndpointId(): String = unwrap(this).getClientVpnEndpointId()

  /**
   * The ID of the Client VPN endpoint to which to add the route.
   */
  public open fun clientVpnEndpointId(`value`: String) {
    unwrap(this).setClientVpnEndpointId(`value`)
  }

  /**
   * A brief description of the route.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A brief description of the route.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The IPv4 address range, in CIDR notation, of the route destination.
   *
   * For example:.
   */
  public open fun destinationCidrBlock(): String = unwrap(this).getDestinationCidrBlock()

  /**
   * The IPv4 address range, in CIDR notation, of the route destination.
   *
   * For example:.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ID of the subnet through which you want to route traffic.
   */
  public open fun targetVpcSubnetId(): String = unwrap(this).getTargetVpcSubnetId()

  /**
   * The ID of the subnet through which you want to route traffic.
   */
  public open fun targetVpcSubnetId(`value`: String) {
    unwrap(this).setTargetVpcSubnetId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnClientVpnRoute].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the Client VPN endpoint to which to add the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-clientvpnendpointid)
     * @param clientVpnEndpointId The ID of the Client VPN endpoint to which to add the route. 
     */
    public fun clientVpnEndpointId(clientVpnEndpointId: String)

    /**
     * A brief description of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-description)
     * @param description A brief description of the route. 
     */
    public fun description(description: String)

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
     * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route
     * destination. For example:. 
     */
    public fun destinationCidrBlock(destinationCidrBlock: String)

    /**
     * The ID of the subnet through which you want to route traffic.
     *
     * The specified subnet must be an existing target network of the Client VPN endpoint.
     *
     * Alternatively, if you're adding a route for the local network, specify `local` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-targetvpcsubnetid)
     * @param targetVpcSubnetId The ID of the subnet through which you want to route traffic. 
     */
    public fun targetVpcSubnetId(targetVpcSubnetId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnClientVpnRoute.Builder =
        software.amazon.awscdk.services.ec2.CfnClientVpnRoute.Builder.create(scope, id)

    /**
     * The ID of the Client VPN endpoint to which to add the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-clientvpnendpointid)
     * @param clientVpnEndpointId The ID of the Client VPN endpoint to which to add the route. 
     */
    override fun clientVpnEndpointId(clientVpnEndpointId: String) {
      cdkBuilder.clientVpnEndpointId(clientVpnEndpointId)
    }

    /**
     * A brief description of the route.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-description)
     * @param description A brief description of the route. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

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
     * @param destinationCidrBlock The IPv4 address range, in CIDR notation, of the route
     * destination. For example:. 
     */
    override fun destinationCidrBlock(destinationCidrBlock: String) {
      cdkBuilder.destinationCidrBlock(destinationCidrBlock)
    }

    /**
     * The ID of the subnet through which you want to route traffic.
     *
     * The specified subnet must be an existing target network of the Client VPN endpoint.
     *
     * Alternatively, if you're adding a route for the local network, specify `local` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-clientvpnroute.html#cfn-ec2-clientvpnroute-targetvpcsubnetid)
     * @param targetVpcSubnetId The ID of the subnet through which you want to route traffic. 
     */
    override fun targetVpcSubnetId(targetVpcSubnetId: String) {
      cdkBuilder.targetVpcSubnetId(targetVpcSubnetId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnClientVpnRoute = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnClientVpnRoute.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnClientVpnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnClientVpnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnClientVpnRoute):
        CfnClientVpnRoute = CfnClientVpnRoute(cdkObject)

    internal fun unwrap(wrapped: CfnClientVpnRoute):
        software.amazon.awscdk.services.ec2.CfnClientVpnRoute = wrapped.cdkObject as
        software.amazon.awscdk.services.ec2.CfnClientVpnRoute
  }
}
