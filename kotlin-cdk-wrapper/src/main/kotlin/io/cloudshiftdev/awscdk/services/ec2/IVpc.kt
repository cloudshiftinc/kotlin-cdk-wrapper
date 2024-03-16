@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 *
 */
public interface IVpc : IResource {
  /**
   * Adds a new client VPN endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  public fun addClientVpnEndpoint(id: String, options: ClientVpnEndpointOptions): ClientVpnEndpoint

  /**
   * Adds a new client VPN endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9867bb96829934449edc260a28ad25313b9e46415f161716411c1dc3f8a0777")
  public fun addClientVpnEndpoint(id: String, options: ClientVpnEndpointOptions.Builder.() -> Unit):
      ClientVpnEndpoint

  /**
   * Adds a new Flow Log to this VPC.
   *
   * @param id 
   * @param options
   */
  public fun addFlowLog(id: String): FlowLog

  /**
   * Adds a new Flow Log to this VPC.
   *
   * @param id 
   * @param options
   */
  public fun addFlowLog(id: String, options: FlowLogOptions): FlowLog

  /**
   * Adds a new Flow Log to this VPC.
   *
   * @param id 
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9694d439eff0a0b7410bef2929300223bfcd80e853da6012ab893a1556726e61")
  public fun addFlowLog(id: String, options: FlowLogOptions.Builder.() -> Unit): FlowLog

  /**
   * Adds a new gateway endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  public fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions): GatewayVpcEndpoint

  /**
   * Adds a new gateway endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0358f597f2d85d52f474246428a7d6b6a783f8b6e281584ba207e87da87ecfc9")
  public fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions.Builder.() -> Unit):
      GatewayVpcEndpoint

  /**
   * Adds a new interface endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  public fun addInterfaceEndpoint(id: String, options: InterfaceVpcEndpointOptions):
      InterfaceVpcEndpoint

  /**
   * Adds a new interface endpoint to this VPC.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5687c2ffc6f0ea79a369efbf6653613fa2d37983f1ceea66663564e5abbb9d87")
  public fun addInterfaceEndpoint(id: String,
      options: InterfaceVpcEndpointOptions.Builder.() -> Unit): InterfaceVpcEndpoint

  /**
   * Adds a new VPN connection to this VPC.
   *
   * @param id 
   * @param options 
   */
  public fun addVpnConnection(id: String, options: VpnConnectionOptions): VpnConnection

  /**
   * Adds a new VPN connection to this VPC.
   *
   * @param id 
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9494479c72b80059e9912c1942267f6410024b87e77370ac10ee3b1e7201163")
  public fun addVpnConnection(id: String, options: VpnConnectionOptions.Builder.() -> Unit):
      VpnConnection

  /**
   * AZs for this VPC.
   */
  public fun availabilityZones(): List<String>

  /**
   * Adds a VPN Gateway to this VPC.
   *
   * @param options 
   */
  public fun enableVpnGateway(options: EnableVpnGatewayOptions)

  /**
   * Adds a VPN Gateway to this VPC.
   *
   * @param options 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0419d315196f5544d7f849797f4d6ab898040391ac4500e80dbee4e7772c698c")
  public fun enableVpnGateway(options: EnableVpnGatewayOptions.Builder.() -> Unit)

  /**
   * Dependable that can be depended upon to force internet connectivity established on the VPC.
   */
  public fun internetConnectivityEstablished(): IDependable

  /**
   * List of isolated subnets in this VPC.
   */
  public fun isolatedSubnets(): List<ISubnet>

  /**
   * List of private subnets in this VPC.
   */
  public fun privateSubnets(): List<ISubnet>

  /**
   * List of public subnets in this VPC.
   */
  public fun publicSubnets(): List<ISubnet>

  /**
   * Return information on the subnets appropriate for the given selection strategy.
   *
   * Requires that at least one subnet is matched, throws a descriptive
   * error message otherwise.
   *
   * @param selection
   */
  public fun selectSubnets(): SelectedSubnets

  /**
   * Return information on the subnets appropriate for the given selection strategy.
   *
   * Requires that at least one subnet is matched, throws a descriptive
   * error message otherwise.
   *
   * @param selection
   */
  public fun selectSubnets(selection: SubnetSelection): SelectedSubnets

  /**
   * Return information on the subnets appropriate for the given selection strategy.
   *
   * Requires that at least one subnet is matched, throws a descriptive
   * error message otherwise.
   *
   * @param selection
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ff24695b1c0049f856a227bcf1aebd4677ac82763e86022909a5eedb23a1da4")
  public fun selectSubnets(selection: SubnetSelection.Builder.() -> Unit): SelectedSubnets

  /**
   * ARN for this VPC.
   */
  public fun vpcArn(): String

  /**
   * CIDR range for this VPC.
   */
  public fun vpcCidrBlock(): String

  /**
   * Identifier for this VPC.
   */
  public fun vpcId(): String

  /**
   * Identifier for the VPN gateway.
   */
  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpc): IVpc =
        CdkObjectWrappers.wrap(cdkObject) as IVpc

    internal fun unwrap(wrapped: IVpc): software.amazon.awscdk.services.ec2.IVpc = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpc
  }
}
