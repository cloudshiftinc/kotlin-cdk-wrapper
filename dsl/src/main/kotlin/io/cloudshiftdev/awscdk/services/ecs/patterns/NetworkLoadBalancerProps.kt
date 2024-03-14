package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface NetworkLoadBalancerProps {
  /**
   * The domain name for the service, e.g. "api.example.com.".
   *
   * Default: - No domain name.
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The Route53 hosted zone for the domain, e.g. "example.com.".
   *
   * Default: - No Route53 hosted domain zone.
   */
  public fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

  /**
   * Listeners (at least one listener) attached to this load balancer.
   *
   * Default: - none
   */
  public fun listeners(): List<NetworkListenerProps>

  /**
   * Name of the load balancer.
   */
  public fun name(): String

  /**
   * Determines whether the Load Balancer will be internet-facing.
   *
   * Default: true
   */
  public fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()

  /**
   * A builder for [NetworkLoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName The domain name for the service, e.g. "api.example.com.".
     */
    public fun domainName(domainName: String)

    /**
     * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.".
     */
    public fun domainZone(domainZone: IHostedZone)

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    public fun listeners(listeners: List<NetworkListenerProps>)

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    public fun listeners(vararg listeners: NetworkListenerProps)

    /**
     * @param name Name of the load balancer. 
     */
    public fun name(name: String)

    /**
     * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing.
     */
    public fun publicLoadBalancer(publicLoadBalancer: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps.builder()

    /**
     * @param domainName The domain name for the service, e.g. "api.example.com.".
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainZone The Route53 hosted zone for the domain, e.g. "example.com.".
     */
    override fun domainZone(domainZone: IHostedZone) {
      cdkBuilder.domainZone(domainZone.let(IHostedZone::unwrap))
    }

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    override fun listeners(listeners: List<NetworkListenerProps>) {
      cdkBuilder.listeners(listeners.map(NetworkListenerProps::unwrap))
    }

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    override fun listeners(vararg listeners: NetworkListenerProps): Unit =
        listeners(listeners.toList())

    /**
     * @param name Name of the load balancer. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param publicLoadBalancer Determines whether the Load Balancer will be internet-facing.
     */
    override fun publicLoadBalancer(publicLoadBalancer: Boolean) {
      cdkBuilder.publicLoadBalancer(publicLoadBalancer)
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps,
  ) : CdkObject(cdkObject), NetworkLoadBalancerProps {
    /**
     * The domain name for the service, e.g. "api.example.com.".
     *
     * Default: - No domain name.
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The Route53 hosted zone for the domain, e.g. "example.com.".
     *
     * Default: - No Route53 hosted domain zone.
     */
    override fun domainZone(): IHostedZone? = unwrap(this).getDomainZone()?.let(IHostedZone::wrap)

    /**
     * Listeners (at least one listener) attached to this load balancer.
     *
     * Default: - none
     */
    override fun listeners(): List<NetworkListenerProps> =
        unwrap(this).getListeners().map(NetworkListenerProps::wrap)

    /**
     * Name of the load balancer.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Determines whether the Load Balancer will be internet-facing.
     *
     * Default: true
     */
    override fun publicLoadBalancer(): Boolean? = unwrap(this).getPublicLoadBalancer()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NetworkLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps):
        NetworkLoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NetworkLoadBalancerProps):
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancerProps
  }
}
