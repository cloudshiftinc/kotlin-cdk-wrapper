package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ApplicationLoadBalancerProps {
  public fun domainName(): String? = unwrap(this).getDomainName()

  public fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  public fun listeners(): List<ApplicationListenerProps>

  public fun name(): String

  public fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()

  public interface Builder {
    public fun domainName(domainName: String)

    public fun domainZone(domainZone: IHostedZone)

    public fun idleTimeout(idleTimeout: Duration)

    public fun listeners(listeners: List<ApplicationListenerProps>)

    public fun listeners(vararg listeners: ApplicationListenerProps)

    public fun name(name: String)

    public fun publicLoadBalancer(publicLoadBalancer: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps.builder()

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone::unwrap))
    }

    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration::unwrap))
    }

    override fun listeners(listeners: List<ApplicationListenerProps>) {
      cdkBuilder.listeners(listeners.map(ApplicationListenerProps::unwrap))
    }

    override fun listeners(vararg listeners: ApplicationListenerProps): Unit =
        listeners(listeners.toList())

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject:
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps,
  ) : ApplicationLoadBalancerProps {
    override fun domainName(): String? = unwrap(this).getDomainName()

    override fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    override fun listeners(): List<ApplicationListenerProps> =
        unwrap(this).getListeners().map(ApplicationListenerProps::wrap)

    override fun name(): String = unwrap(this).getName()

    override fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps):
        ApplicationLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps = (wrapped as
        Wrapper).cdkObject
  }
}
