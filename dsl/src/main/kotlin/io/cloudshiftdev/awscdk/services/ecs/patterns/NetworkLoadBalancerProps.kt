package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NetworkLoadBalancerProps {
  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

  public fun listeners(): List<NetworkListenerProps>

  public fun name(): String

  public fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()

  public interface Builder {
    public fun domainName(domainName: String) {
    }

    public fun domainZone(domainZone: IHostedZone) {
    }

    public fun listeners(listeners: List<NetworkListenerProps>) {
    }

    public fun name(name: String) {
    }

    public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps.builder()

    public override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    public override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone::unwrap))
    }

    public override fun listeners(listeners: List<NetworkListenerProps>) {
      cdkBuilder.listeners(listeners.map(NetworkListenerProps::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps,
  ) : NetworkLoadBalancerProps {
    public override fun domainName(): String? = unwrap(this).getDomainName()

    public override fun domainZone(): IHostedZone? =
        unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

    public override fun listeners(): List<NetworkListenerProps> =
        unwrap(this).getListeners().map(NetworkListenerProps::wrap)

    public override fun name(): String = unwrap(this).getName()

    public override fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps):
        NetworkLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps = (wrapped as
        Wrapper).cdkObject
  }
}
