package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.IVpcEndpointServiceLoadBalancer
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface INetworkLoadBalancer : ILoadBalancerV2, IVpcEndpointServiceLoadBalancer,
    IConnectable {
  public fun addListener(arg0: String, arg1: BaseNetworkListenerProps): NetworkListener

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
  public fun addListener(arg0: String, arg1: BaseNetworkListenerProps.Builder.() -> Unit):
      NetworkListener

  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public fun metrics(): INetworkLoadBalancerMetrics

  public fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?: emptyList()

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer,
  ) : INetworkLoadBalancer {
    public override fun addListener(arg0: String, arg1: BaseNetworkListenerProps): NetworkListener =
        unwrap(this).addListener(arg0,
        arg1.let(BaseNetworkListenerProps::unwrap)).let(NetworkListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a41b0d86a8d4886847b1c4ec80b30640a2d7a8098f577ff54f0dca337543d349")
    public override fun addListener(arg0: String,
        arg1: BaseNetworkListenerProps.Builder.() -> Unit): NetworkListener = addListener(arg0,
        BaseNetworkListenerProps(arg1))

    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    public override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    public override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    public override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    public override fun metrics(): INetworkLoadBalancerMetrics =
        unwrap(this).getMetrics().let(INetworkLoadBalancerMetrics::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun securityGroups(): List<String> = unwrap(this).getSecurityGroups() ?:
        emptyList()

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    public override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer):
        INetworkLoadBalancer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INetworkLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer = (wrapped as
        Wrapper).cdkObject
  }
}
