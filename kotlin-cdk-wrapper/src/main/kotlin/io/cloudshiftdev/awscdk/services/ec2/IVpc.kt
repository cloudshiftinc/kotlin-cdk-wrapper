@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IDependable
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IVpc : IResource {
  public fun addClientVpnEndpoint(arg0: String, arg1: ClientVpnEndpointOptions): ClientVpnEndpoint

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9867bb96829934449edc260a28ad25313b9e46415f161716411c1dc3f8a0777")
  public fun addClientVpnEndpoint(arg0: String, arg1: ClientVpnEndpointOptions.Builder.() -> Unit):
      ClientVpnEndpoint

  public fun addFlowLog(arg0: String): FlowLog

  public fun addFlowLog(arg0: String, arg1: FlowLogOptions): FlowLog

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9694d439eff0a0b7410bef2929300223bfcd80e853da6012ab893a1556726e61")
  public fun addFlowLog(arg0: String, arg1: FlowLogOptions.Builder.() -> Unit): FlowLog

  public fun addGatewayEndpoint(arg0: String, arg1: GatewayVpcEndpointOptions): GatewayVpcEndpoint

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0358f597f2d85d52f474246428a7d6b6a783f8b6e281584ba207e87da87ecfc9")
  public fun addGatewayEndpoint(arg0: String, arg1: GatewayVpcEndpointOptions.Builder.() -> Unit):
      GatewayVpcEndpoint

  public fun addInterfaceEndpoint(arg0: String, arg1: InterfaceVpcEndpointOptions):
      InterfaceVpcEndpoint

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5687c2ffc6f0ea79a369efbf6653613fa2d37983f1ceea66663564e5abbb9d87")
  public fun addInterfaceEndpoint(arg0: String,
      arg1: InterfaceVpcEndpointOptions.Builder.() -> Unit): InterfaceVpcEndpoint

  public fun addVpnConnection(arg0: String, arg1: VpnConnectionOptions): VpnConnection

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f9494479c72b80059e9912c1942267f6410024b87e77370ac10ee3b1e7201163")
  public fun addVpnConnection(arg0: String, arg1: VpnConnectionOptions.Builder.() -> Unit):
      VpnConnection

  public fun availabilityZones(): List<String>

  public fun enableVpnGateway(arg0: EnableVpnGatewayOptions)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0419d315196f5544d7f849797f4d6ab898040391ac4500e80dbee4e7772c698c")
  public fun enableVpnGateway(arg0: EnableVpnGatewayOptions.Builder.() -> Unit)

  public fun internetConnectivityEstablished(): IDependable

  public fun isolatedSubnets(): List<ISubnet>

  public fun privateSubnets(): List<ISubnet>

  public fun publicSubnets(): List<ISubnet>

  public fun selectSubnets(): SelectedSubnets

  public fun selectSubnets(arg0: SubnetSelection): SelectedSubnets

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3ff24695b1c0049f856a227bcf1aebd4677ac82763e86022909a5eedb23a1da4")
  public fun selectSubnets(arg0: SubnetSelection.Builder.() -> Unit): SelectedSubnets

  public fun vpcArn(): String

  public fun vpcCidrBlock(): String

  public fun vpcId(): String

  public fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.IVpc,
  ) : CdkObject(cdkObject), IVpc {
    override fun addClientVpnEndpoint(arg0: String, arg1: ClientVpnEndpointOptions):
        ClientVpnEndpoint = unwrap(this).addClientVpnEndpoint(arg0,
        arg1.let(ClientVpnEndpointOptions::unwrap)).let(ClientVpnEndpoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9867bb96829934449edc260a28ad25313b9e46415f161716411c1dc3f8a0777")
    override fun addClientVpnEndpoint(arg0: String,
        arg1: ClientVpnEndpointOptions.Builder.() -> Unit): ClientVpnEndpoint =
        addClientVpnEndpoint(arg0, ClientVpnEndpointOptions(arg1))

    override fun addFlowLog(arg0: String): FlowLog =
        unwrap(this).addFlowLog(arg0).let(FlowLog::wrap)

    override fun addFlowLog(arg0: String, arg1: FlowLogOptions): FlowLog =
        unwrap(this).addFlowLog(arg0, arg1.let(FlowLogOptions::unwrap)).let(FlowLog::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9694d439eff0a0b7410bef2929300223bfcd80e853da6012ab893a1556726e61")
    override fun addFlowLog(arg0: String, arg1: FlowLogOptions.Builder.() -> Unit): FlowLog =
        addFlowLog(arg0, FlowLogOptions(arg1))

    override fun addGatewayEndpoint(arg0: String, arg1: GatewayVpcEndpointOptions):
        GatewayVpcEndpoint = unwrap(this).addGatewayEndpoint(arg0,
        arg1.let(GatewayVpcEndpointOptions::unwrap)).let(GatewayVpcEndpoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0358f597f2d85d52f474246428a7d6b6a783f8b6e281584ba207e87da87ecfc9")
    override fun addGatewayEndpoint(arg0: String,
        arg1: GatewayVpcEndpointOptions.Builder.() -> Unit): GatewayVpcEndpoint =
        addGatewayEndpoint(arg0, GatewayVpcEndpointOptions(arg1))

    override fun addInterfaceEndpoint(arg0: String, arg1: InterfaceVpcEndpointOptions):
        InterfaceVpcEndpoint = unwrap(this).addInterfaceEndpoint(arg0,
        arg1.let(InterfaceVpcEndpointOptions::unwrap)).let(InterfaceVpcEndpoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5687c2ffc6f0ea79a369efbf6653613fa2d37983f1ceea66663564e5abbb9d87")
    override fun addInterfaceEndpoint(arg0: String,
        arg1: InterfaceVpcEndpointOptions.Builder.() -> Unit): InterfaceVpcEndpoint =
        addInterfaceEndpoint(arg0, InterfaceVpcEndpointOptions(arg1))

    override fun addVpnConnection(arg0: String, arg1: VpnConnectionOptions): VpnConnection =
        unwrap(this).addVpnConnection(arg0,
        arg1.let(VpnConnectionOptions::unwrap)).let(VpnConnection::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f9494479c72b80059e9912c1942267f6410024b87e77370ac10ee3b1e7201163")
    override fun addVpnConnection(arg0: String, arg1: VpnConnectionOptions.Builder.() -> Unit):
        VpnConnection = addVpnConnection(arg0, VpnConnectionOptions(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun availabilityZones(): List<String> = unwrap(this).getAvailabilityZones()

    override fun enableVpnGateway(arg0: EnableVpnGatewayOptions) {
      unwrap(this).enableVpnGateway(arg0.let(EnableVpnGatewayOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0419d315196f5544d7f849797f4d6ab898040391ac4500e80dbee4e7772c698c")
    override fun enableVpnGateway(arg0: EnableVpnGatewayOptions.Builder.() -> Unit): Unit =
        enableVpnGateway(EnableVpnGatewayOptions(arg0))

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun internetConnectivityEstablished(): IDependable =
        unwrap(this).getInternetConnectivityEstablished().let(IDependable::wrap)

    override fun isolatedSubnets(): List<ISubnet> =
        unwrap(this).getIsolatedSubnets().map(ISubnet::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun privateSubnets(): List<ISubnet> =
        unwrap(this).getPrivateSubnets().map(ISubnet::wrap)

    override fun publicSubnets(): List<ISubnet> = unwrap(this).getPublicSubnets().map(ISubnet::wrap)

    override fun selectSubnets(): SelectedSubnets =
        unwrap(this).selectSubnets().let(SelectedSubnets::wrap)

    override fun selectSubnets(arg0: SubnetSelection): SelectedSubnets =
        unwrap(this).selectSubnets(arg0.let(SubnetSelection::unwrap)).let(SelectedSubnets::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ff24695b1c0049f856a227bcf1aebd4677ac82763e86022909a5eedb23a1da4")
    override fun selectSubnets(arg0: SubnetSelection.Builder.() -> Unit): SelectedSubnets =
        selectSubnets(SubnetSelection(arg0))

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpcArn(): String = unwrap(this).getVpcArn()

    override fun vpcCidrBlock(): String = unwrap(this).getVpcCidrBlock()

    override fun vpcId(): String = unwrap(this).getVpcId()

    override fun vpnGatewayId(): String? = unwrap(this).getVpnGatewayId()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.IVpc): IVpc =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IVpc): software.amazon.awscdk.services.ec2.IVpc = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.IVpc
  }
}
