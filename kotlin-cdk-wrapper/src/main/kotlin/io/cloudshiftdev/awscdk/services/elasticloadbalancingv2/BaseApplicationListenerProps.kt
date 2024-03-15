@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit
import kotlin.collections.List

/**
 * Basic properties for an ApplicationListener.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * FargateService service = FargateService.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
 * "LB").vpc(vpc).internetFacing(true).build();
 * ApplicationListener listener = lb.addListener("Listener",
 * BaseApplicationListenerProps.builder().port(80).build());
 * service.registerLoadBalancerTargets(EcsTarget.builder()
 * .containerName("web")
 * .containerPort(80)
 * .newTargetGroupId("ECS")
 * .listener(ListenerConfig.applicationListener(listener, AddApplicationTargetsProps.builder()
 * .protocol(ApplicationProtocol.HTTPS)
 * .build()))
 * .build());
 * ```
 */
public interface BaseApplicationListenerProps {
  /**
   * Certificate list of ACM cert ARNs.
   *
   * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
   *
   * Default: - No certificates.
   */
  public fun certificates(): List<IListenerCertificate> =
      unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

  /**
   * Default action to take for requests to this listener.
   *
   * This allows full control of the default action of the load balancer,
   * including Action chaining, fixed responses and redirect responses.
   *
   * See the `ListenerAction` class for all options.
   *
   * Cannot be specified together with `defaultTargetGroups`.
   *
   * Default: - None.
   */
  public fun defaultAction(): ListenerAction? =
      unwrap(this).getDefaultAction()?.let(ListenerAction::wrap)

  /**
   * Default target groups to load balance to.
   *
   * All target groups will be load balanced to with equal weight and without
   * stickiness. For a more complex configuration than that, use
   * either `defaultAction` or `addAction()`.
   *
   * Cannot be specified together with `defaultAction`.
   *
   * Default: - None.
   */
  public fun defaultTargetGroups(): List<IApplicationTargetGroup> =
      unwrap(this).getDefaultTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

  /**
   * Allow anyone to connect to the load balancer on the listener port.
   *
   * If this is specified, the load balancer will be opened up to anyone who can reach it.
   * For internal load balancers this is anyone in the same VPC. For public load
   * balancers, this is anyone on the internet.
   *
   * If you want to be more selective about who can access this load
   * balancer, set this to `false` and use the listener's `connections`
   * object to selectively grant access to the load balancer on the listener port.
   *
   * Default: true
   */
  public fun `open`(): Boolean? = unwrap(this).getOpen()

  /**
   * The port on which the listener listens for requests.
   *
   * Default: - Determined from protocol if known.
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * The protocol to use.
   *
   * Default: - Determined from port if known.
   */
  public fun protocol(): ApplicationProtocol? =
      unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

  /**
   * The security policy that defines which ciphers and protocols are supported.
   *
   * Default: - The current predefined security policy.
   */
  public fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)

  /**
   * A builder for [BaseApplicationListenerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    public fun certificates(certificates: List<IListenerCertificate>)

    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    public fun certificates(vararg certificates: IListenerCertificate)

    /**
     * @param defaultAction Default action to take for requests to this listener.
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    public fun defaultAction(defaultAction: ListenerAction)

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>)

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup)

    /**
     * @param open Allow anyone to connect to the load balancer on the listener port.
     * If this is specified, the load balancer will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the load balancer on the listener port.
     */
    public fun `open`(`open`: Boolean)

    /**
     * @param port The port on which the listener listens for requests.
     */
    public fun port(port: Number)

    /**
     * @param protocol The protocol to use.
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported.
     */
    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps.Builder
        =
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps.builder()

    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    /**
     * @param certificates Certificate list of ACM cert ARNs.
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     */
    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

    /**
     * @param defaultAction Default action to take for requests to this listener.
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     */
    override fun defaultAction(defaultAction: ListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(ListenerAction::unwrap))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    override fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(IApplicationTargetGroup::unwrap))
    }

    /**
     * @param defaultTargetGroups Default target groups to load balance to.
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     */
    override fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    /**
     * @param open Allow anyone to connect to the load balancer on the listener port.
     * If this is specified, the load balancer will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the load balancer on the listener port.
     */
    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    /**
     * @param port The port on which the listener listens for requests.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol to use.
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported.
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps,
  ) : CdkObject(cdkObject), BaseApplicationListenerProps {
    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     */
    override fun certificates(): List<IListenerCertificate> =
        unwrap(this).getCertificates()?.map(IListenerCertificate::wrap) ?: emptyList()

    /**
     * Default action to take for requests to this listener.
     *
     * This allows full control of the default action of the load balancer,
     * including Action chaining, fixed responses and redirect responses.
     *
     * See the `ListenerAction` class for all options.
     *
     * Cannot be specified together with `defaultTargetGroups`.
     *
     * Default: - None.
     */
    override fun defaultAction(): ListenerAction? =
        unwrap(this).getDefaultAction()?.let(ListenerAction::wrap)

    /**
     * Default target groups to load balance to.
     *
     * All target groups will be load balanced to with equal weight and without
     * stickiness. For a more complex configuration than that, use
     * either `defaultAction` or `addAction()`.
     *
     * Cannot be specified together with `defaultAction`.
     *
     * Default: - None.
     */
    override fun defaultTargetGroups(): List<IApplicationTargetGroup> =
        unwrap(this).getDefaultTargetGroups()?.map(IApplicationTargetGroup::wrap) ?: emptyList()

    /**
     * Allow anyone to connect to the load balancer on the listener port.
     *
     * If this is specified, the load balancer will be opened up to anyone who can reach it.
     * For internal load balancers this is anyone in the same VPC. For public load
     * balancers, this is anyone on the internet.
     *
     * If you want to be more selective about who can access this load
     * balancer, set this to `false` and use the listener's `connections`
     * object to selectively grant access to the load balancer on the listener port.
     *
     * Default: true
     */
    override fun `open`(): Boolean? = unwrap(this).getOpen()

    /**
     * The port on which the listener listens for requests.
     *
     * Default: - Determined from protocol if known.
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol to use.
     *
     * Default: - Determined from port if known.
     */
    override fun protocol(): ApplicationProtocol? =
        unwrap(this).getProtocol()?.let(ApplicationProtocol::wrap)

    /**
     * The security policy that defines which ciphers and protocols are supported.
     *
     * Default: - The current predefined security policy.
     */
    override fun sslPolicy(): SslPolicy? = unwrap(this).getSslPolicy()?.let(SslPolicy::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseApplicationListenerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps):
        BaseApplicationListenerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseApplicationListenerProps):
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.BaseApplicationListenerProps
  }
}
