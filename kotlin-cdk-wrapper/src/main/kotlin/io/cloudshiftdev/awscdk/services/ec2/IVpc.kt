@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.IVpc,
  ) : CdkObject(cdkObject), IVpc {
    /**
     * Adds a new client VPN endpoint to this VPC.
     *
     * @param id 
     * @param options 
     */
    override fun addClientVpnEndpoint(id: String, options: ClientVpnEndpointOptions):
        ClientVpnEndpoint = unwrap(this).addClientVpnEndpoint(id,
        options.let(ClientVpnEndpointOptions.Companion::unwrap)).let(ClientVpnEndpoint::wrap)

    /**
     * Adds a new client VPN endpoint to this VPC.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9867bb96829934449edc260a28ad25313b9e46415f161716411c1dc3f8a0777")
    override fun addClientVpnEndpoint(id: String,
        options: ClientVpnEndpointOptions.Builder.() -> Unit): ClientVpnEndpoint =
        addClientVpnEndpoint(id, ClientVpnEndpointOptions(options))

    /**
     * Adds a new Flow Log to this VPC.
     *
     * @param id 
     * @param options
     */
    override fun addFlowLog(id: String): FlowLog = unwrap(this).addFlowLog(id).let(FlowLog::wrap)

    /**
     * Adds a new Flow Log to this VPC.
     *
     * @param id 
     * @param options
     */
    override fun addFlowLog(id: String, options: FlowLogOptions): FlowLog =
        unwrap(this).addFlowLog(id,
        options.let(FlowLogOptions.Companion::unwrap)).let(FlowLog::wrap)

    /**
     * Adds a new Flow Log to this VPC.
     *
     * @param id 
     * @param options
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9694d439eff0a0b7410bef2929300223bfcd80e853da6012ab893a1556726e61")
    override fun addFlowLog(id: String, options: FlowLogOptions.Builder.() -> Unit): FlowLog =
        addFlowLog(id, FlowLogOptions(options))

    /**
     * Adds a new gateway endpoint to this VPC.
     *
     * @param id 
     * @param options 
     */
    override fun addGatewayEndpoint(id: String, options: GatewayVpcEndpointOptions):
        GatewayVpcEndpoint = unwrap(this).addGatewayEndpoint(id,
        options.let(GatewayVpcEndpointOptions.Companion::unwrap)).let(GatewayVpcEndpoint::wrap)

    /**
     * Adds a new gateway endpoint to this VPC.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0358f597f2d85d52f474246428a7d6b6a783f8b6e281584ba207e87da87ecfc9")
    override fun addGatewayEndpoint(id: String,
        options: GatewayVpcEndpointOptions.Builder.() -> Unit): GatewayVpcEndpoint =
        addGatewayEndpoint(id, GatewayVpcEndpointOptions(options))

    /**
     * Adds a new interface endpoint to this VPC.
     *
     * @param id 
     * @param options 
     */
    override fun addInterfaceEndpoint(id: String, options: InterfaceVpcEndpointOptions):
        InterfaceVpcEndpoint = unwrap(this).addInterfaceEndpoint(id,
        options.let(InterfaceVpcEndpointOptions.Companion::unwrap)).let(InterfaceVpcEndpoint::wrap)

    /**
     * Adds a new interface endpoint to this VPC.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5687c2ffc6f0ea79a369efbf6653613fa2d37983f1ceea66663564e5abbb9d87")
    override fun addInterfaceEndpoint(id: String,
        options: InterfaceVpcEndpointOptions.Builder.() -> Unit): InterfaceVpcEndpoint =
        addInterfaceEndpoint(id, InterfaceVpcEndpointOptions(options))

    /**
     * Adds a new VPN connection to this VPC.
     *
     * @param id 
     * @param options 
     */
    override fun addVpnConnection(id: String, options: VpnConnectionOptions): VpnConnection =
        unwrap(this).addVpnConnection(id,
        options.let(VpnConnectionOptions.Companion::unwrap)).let(VpnConnection::wrap)

    /**
     * Adds a new VPN connection to this VPC.
     *
     * @param id 
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9494479c72b80059e9912c1942267f6410024b87e77370ac10ee3b1e7201163")
    override fun addVpnConnection(id: String, options: VpnConnectionOptions.Builder.() -> Unit):
        VpnConnection = addVpnConnection(id, VpnConnectionOptions(options))

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * AZs for this VPC.
     */
    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    /**
     * Adds a VPN Gateway to this VPC.
     *
     * @param options 
     */
    override fun enableVpnGateway(options: EnableVpnGatewayOptions) {
      unwrap(this).enableVpnGateway(options.let(EnableVpnGatewayOptions.Companion::unwrap))
    }

    /**
     * Adds a VPN Gateway to this VPC.
     *
     * @param options 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0419d315196f5544d7f849797f4d6ab898040391ac4500e80dbee4e7772c698c")
    override fun enableVpnGateway(options: EnableVpnGatewayOptions.Builder.() -> Unit): Unit =
        enableVpnGateway(EnableVpnGatewayOptions(options))

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * Dependable that can be depended upon to force internet connectivity established on the VPC.
     */
    override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    /**
     * List of isolated subnets in this VPC.
     */
    override fun isolatedSubnets(): List<ISubnet> =
        unwrap(this).getIsolatedSubnets().map(ISubnet::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * List of private subnets in this VPC.
     */
    override fun privateSubnets(): List<ISubnet> =
        unwrap(this).getPrivateSubnets().map(ISubnet::wrap)

    /**
     * List of public subnets in this VPC.
     */
    override fun publicSubnets(): List<ISubnet> = unwrap(this).getPublicSubnets().map(ISubnet::wrap)

    /**
     * Return information on the subnets appropriate for the given selection strategy.
     *
     * Requires that at least one subnet is matched, throws a descriptive
     * error message otherwise.
     *
     * @param selection
     */
    override fun selectSubnets(): SelectedSubnets =
        unwrap(this).selectSubnets().let(SelectedSubnets::wrap)

    /**
     * Return information on the subnets appropriate for the given selection strategy.
     *
     * Requires that at least one subnet is matched, throws a descriptive
     * error message otherwise.
     *
     * @param selection
     */
    override fun selectSubnets(selection: SubnetSelection): SelectedSubnets =
        unwrap(this).selectSubnets(selection.let(SubnetSelection.Companion::unwrap)).let(SelectedSubnets::wrap)

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
    override fun selectSubnets(selection: SubnetSelection.Builder.() -> Unit): SelectedSubnets =
        selectSubnets(SubnetSelection(selection))

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * ARN for this VPC.
     */
    override fun vpcArn(): String = unwrap(this).getVpcArn()

    /**
     * CIDR range for this VPC.
     */
    override fun vpcCidrBlock(): String = unwrap(this).getVpcCidrBlock()

    /**
     * Identifier for this VPC.
     */
    override fun vpcId(): String = unwrap(this).getVpcId()

    /**
     * Identifier for the VPN gateway.
     */
    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpc): IVpc =
        CdkObjectWrappers.wrap(cdkObject) as? IVpc ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpc): software.amazon.awscdk.services.ec2.IVpc = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpc
  }
}
