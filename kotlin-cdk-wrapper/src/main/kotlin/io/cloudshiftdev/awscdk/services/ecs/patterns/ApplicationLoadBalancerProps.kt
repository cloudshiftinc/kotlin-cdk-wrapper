@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.route53.IHostedZone
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties to define an application load balancer.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.certificatemanager.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * import io.cloudshiftdev.awscdk.services.route53.*;
 * Certificate certificate;
 * HostedZone hostedZone;
 * ApplicationLoadBalancerProps applicationLoadBalancerProps =
 * ApplicationLoadBalancerProps.builder()
 * .listeners(List.of(ApplicationListenerProps.builder()
 * .name("name")
 * // the properties below are optional
 * .certificate(certificate)
 * .port(123)
 * .protocol(ApplicationProtocol.HTTP)
 * .sslPolicy(SslPolicy.RECOMMENDED_TLS)
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .domainName("domainName")
 * .domainZone(hostedZone)
 * .idleTimeout(Duration.minutes(30))
 * .publicLoadBalancer(false)
 * .build();
 * ```
 */
public interface ApplicationLoadBalancerProps {
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
   * The load balancer idle timeout, in seconds.
   *
   * Can be between 1 and 4000 seconds.
   *
   * Default: - CloudFormation sets idle timeout to 60 seconds
   */
  public fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

  /**
   * Listeners (at least one listener) attached to this load balancer.
   */
  public fun listeners(): List<ApplicationListenerProps>

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
   * A builder for [ApplicationLoadBalancerProps]
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
     * @param idleTimeout The load balancer idle timeout, in seconds.
     * Can be between 1 and 4000 seconds.
     */
    public fun idleTimeout(idleTimeout: Duration)

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    public fun listeners(listeners: List<ApplicationListenerProps>)

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    public fun listeners(vararg listeners: ApplicationListenerProps)

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
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps.builder()

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
      cdkBuilder.domainZone(domainZone.let(IHostedZone.Companion::unwrap))
    }

    /**
     * @param idleTimeout The load balancer idle timeout, in seconds.
     * Can be between 1 and 4000 seconds.
     */
    override fun idleTimeout(idleTimeout: Duration) {
      cdkBuilder.idleTimeout(idleTimeout.let(Duration.Companion::unwrap))
    }

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    override fun listeners(listeners: List<ApplicationListenerProps>) {
      cdkBuilder.listeners(listeners.map(ApplicationListenerProps.Companion::unwrap))
    }

    /**
     * @param listeners Listeners (at least one listener) attached to this load balancer. 
     */
    override fun listeners(vararg listeners: ApplicationListenerProps): Unit =
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

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps,
  ) : CdkObject(cdkObject), ApplicationLoadBalancerProps {
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
     * The load balancer idle timeout, in seconds.
     *
     * Can be between 1 and 4000 seconds.
     *
     * Default: - CloudFormation sets idle timeout to 60 seconds
     */
    override fun idleTimeout(): Duration? = unwrap(this).getIdleTimeout()?.let(Duration::wrap)

    /**
     * Listeners (at least one listener) attached to this load balancer.
     */
    override fun listeners(): List<ApplicationListenerProps> =
        unwrap(this).getListeners().map(ApplicationListenerProps::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationLoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps):
        ApplicationLoadBalancerProps = CdkObjectWrappers.wrap(cdkObject) as?
        ApplicationLoadBalancerProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationLoadBalancerProps):
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ApplicationLoadBalancerProps
  }
}
