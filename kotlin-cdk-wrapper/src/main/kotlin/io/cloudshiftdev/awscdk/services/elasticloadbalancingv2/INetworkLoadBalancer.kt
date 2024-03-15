@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface INetworkLoadBalancer : ILoadBalancerV2, IVpcEndpointServiceLoadBalancer,
    IConnectable {
  public fun addListener(arg0: String, arg1: BaseNetworkListenerProps): NetworkListener

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
  public fun addListener(arg0: String, arg1: BaseNetworkListenerProps.Builder.() -> Unit):
      NetworkListener

  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public fun metrics(): INetworkLoadBalancerMetrics

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer,
  ) : CdkObject(cdkObject), INetworkLoadBalancer {
    override fun addListener(arg0: String, arg1: BaseNetworkListenerProps): NetworkListener =
        unwrap(this).addListener(arg0,
        arg1.let(BaseNetworkListenerProps::unwrap)).let(NetworkListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
    override fun addListener(arg0: String, arg1: BaseNetworkListenerProps.Builder.() -> Unit):
        NetworkListener = addListener(arg0, BaseNetworkListenerProps(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    override fun metrics(): INetworkLoadBalancerMetrics =
        unwrap(this).getMetrics().let(INetworkLoadBalancerMetrics::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer):
        INetworkLoadBalancer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
  }
}
