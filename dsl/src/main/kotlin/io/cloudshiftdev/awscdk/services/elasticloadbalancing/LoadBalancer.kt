package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class LoadBalancer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer,
) : Resource(cdkObject), IConnectable {
  public open fun addListener(listener: LoadBalancerListener): ListenerPort =
      unwrap(this).addListener(listener.let(LoadBalancerListener::unwrap)).let(ListenerPort::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("478e00efcdf2fe91cab796f82f9fd27022c9a7f8c2a29b388826de6894902089")
  public open fun addListener(listener: LoadBalancerListener.Builder.() -> Unit): ListenerPort =
      addListener(LoadBalancerListener(listener))

  public open fun addTarget(target: ILoadBalancerTarget) {
    unwrap(this).addTarget(target.let(ILoadBalancerTarget::unwrap))
  }

  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  public open fun listenerPorts(): List<ListenerPort> =
      unwrap(this).getListenerPorts().map(ListenerPort::wrap)

  public open fun loadBalancerCanonicalHostedZoneName(): String =
      unwrap(this).getLoadBalancerCanonicalHostedZoneName()

  public open fun loadBalancerCanonicalHostedZoneNameId(): String =
      unwrap(this).getLoadBalancerCanonicalHostedZoneNameId()

  public open fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  public open fun loadBalancerSourceSecurityGroupGroupName(): String =
      unwrap(this).getLoadBalancerSourceSecurityGroupGroupName()

  public open fun loadBalancerSourceSecurityGroupOwnerAlias(): String =
      unwrap(this).getLoadBalancerSourceSecurityGroupOwnerAlias()

  public interface Builder {
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc15462f5800028ee0a73413d8b335b4c9e1cb463c6aa6f737fbb07b0abf0e5a")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit) {
    }

    public fun crossZone(crossZone: Boolean) {
    }

    public fun healthCheck(healthCheck: HealthCheck) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65a99da1eca4ee4376bd14619a95df3d7c739a2d0c286c02a3d8077f18049e33")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit) {
    }

    public fun internetFacing(internetFacing: Boolean) {
    }

    public fun listeners(listeners: List<LoadBalancerListener>) {
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b46623007ae2024844912d743e1a99d7ddcac10babc527493533fc1010a669d9")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit) {
    }

    public fun targets(targets: List<ILoadBalancerTarget>) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer.Builder.create(scope, id)

    public override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(CfnLoadBalancer.AccessLoggingPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc15462f5800028ee0a73413d8b335b4c9e1cb463c6aa6f737fbb07b0abf0e5a")
    public override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(CfnLoadBalancer.AccessLoggingPolicyProperty(accessLoggingPolicy))

    public override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    public override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65a99da1eca4ee4376bd14619a95df3d7c739a2d0c286c02a3d8077f18049e33")
    public override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    public override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    public override fun listeners(listeners: List<LoadBalancerListener>) {
      cdkBuilder.listeners(listeners.map(LoadBalancerListener::unwrap))
    }

    public override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b46623007ae2024844912d743e1a99d7ddcac10babc527493533fc1010a669d9")
    public override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    public override fun targets(targets: List<ILoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(ILoadBalancerTarget::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): LoadBalancer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return LoadBalancer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer):
        LoadBalancer = LoadBalancer(cdkObject)

    internal fun unwrap(wrapped: LoadBalancer):
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer = wrapped.cdkObject
  }
}
