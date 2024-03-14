package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface IApplicationLoadBalancer : ILoadBalancerV2, IConnectable {
  public fun addListener(arg0: String, arg1: BaseApplicationListenerProps): ApplicationListener

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
  public fun addListener(arg0: String, arg1: BaseApplicationListenerProps.Builder.() -> Unit):
      ApplicationListener

  public fun ipAddressType(): IpAddressType? =
      unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

  public fun listeners(): List<ApplicationListener>

  public fun loadBalancerArn(): String

  public fun metrics(): IApplicationLoadBalancerMetrics

  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer,
  ) : IApplicationLoadBalancer {
    override fun addListener(arg0: String, arg1: BaseApplicationListenerProps): ApplicationListener
        = unwrap(this).addListener(arg0,
        arg1.let(BaseApplicationListenerProps::unwrap)).let(ApplicationListener::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4214bb0ef19ba7cc886c0c0c590fdb239a96d82b7e5e0b4b1bbe44fe0af6df0")
    override fun addListener(arg0: String, arg1: BaseApplicationListenerProps.Builder.() -> Unit):
        ApplicationListener = addListener(arg0, BaseApplicationListenerProps(arg1))

    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun ipAddressType(): IpAddressType? =
        unwrap(this).getIpAddressType()?.let(IpAddressType::wrap)

    override fun listeners(): List<ApplicationListener> =
        unwrap(this).getListeners().map(ApplicationListener::wrap)

    override fun loadBalancerArn(): String = unwrap(this).getLoadBalancerArn()

    override fun loadBalancerCanonicalHostedZoneId(): String =
        unwrap(this).getLoadBalancerCanonicalHostedZoneId()

    override fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

    override fun metrics(): IApplicationLoadBalancerMetrics =
        unwrap(this).getMetrics().let(IApplicationLoadBalancerMetrics::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer):
        IApplicationLoadBalancer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IApplicationLoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationLoadBalancer = (wrapped
        as Wrapper).cdkObject
  }
}
