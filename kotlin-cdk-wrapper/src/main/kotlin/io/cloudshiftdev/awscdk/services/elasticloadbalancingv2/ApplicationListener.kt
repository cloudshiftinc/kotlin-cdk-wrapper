@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.Port
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Define an ApplicationListener.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.autoscaling.AutoScalingGroup;
 * AutoScalingGroup asg;
 * Vpc vpc;
 * // Create the load balancer in a VPC. 'internetFacing' is 'false'
 * // by default, which creates an internal load balancer.
 * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .build();
 * // Add a listener and open up the load balancer's security group
 * // to the world.
 * ApplicationListener listener = lb.addListener("Listener", BaseApplicationListenerProps.builder()
 * .port(80)
 * // 'open: true' is the default, you can leave it out if you want. Set it
 * // to 'false' and use `listener.connections` if you want to be selective
 * // about who can access the load balancer.
 * .open(true)
 * .build());
 * // Create an AutoScaling group and add it as a load balancing
 * // target to the listener.
 * listener.addTargets("ApplicationFleet", AddApplicationTargetsProps.builder()
 * .port(8080)
 * .targets(List.of(asg))
 * .build());
 * ```
 */
public open class ApplicationListener(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener,
) : BaseListener(cdkObject), IApplicationListener {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationListenerProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ApplicationListenerProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ApplicationListenerProps.Builder.() -> Unit,
  ) : this(scope, id, ApplicationListenerProps(props)
  )

  /**
   * Perform the given default action on incoming requests.
   *
   * This allows full control of the default action of the load balancer,
   * including Action chaining, fixed responses and redirect responses. See
   * the `ListenerAction` class for all options.
   *
   * It's possible to add routing conditions to the Action added in this way.
   * At least one Action must be added without conditions (which becomes the
   * default Action).
   *
   * @param id 
   * @param props 
   */
  public override fun addAction(id: String, props: AddApplicationActionProps) {
    unwrap(this).addAction(id, props.let(AddApplicationActionProps::unwrap))
  }

  /**
   * Perform the given default action on incoming requests.
   *
   * This allows full control of the default action of the load balancer,
   * including Action chaining, fixed responses and redirect responses. See
   * the `ListenerAction` class for all options.
   *
   * It's possible to add routing conditions to the Action added in this way.
   * At least one Action must be added without conditions (which becomes the
   * default Action).
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("38982a24904e19a27775083a0236be2eab0ffadce58e1eb48572062d8567e700")
  public override fun addAction(id: String, props: AddApplicationActionProps.Builder.() -> Unit):
      Unit = addAction(id, AddApplicationActionProps(props))

  /**
   * Add one or more certificates to this listener.
   *
   * After the first certificate, this creates ApplicationListenerCertificates
   * resources since cloudformation requires the certificates array on the
   * listener resource to have a length of 1.
   *
   * @param id 
   * @param certificates 
   */
  public override fun addCertificates(id: String, certificates: List<IListenerCertificate>) {
    unwrap(this).addCertificates(id, certificates.map(IListenerCertificate::unwrap))
  }

  /**
   * Load balance incoming requests to the given target groups.
   *
   * All target groups will be load balanced to with equal weight and without
   * stickiness. For a more complex configuration than that, use `addAction()`.
   *
   * It's possible to add routing conditions to the TargetGroups added in this
   * way. At least one TargetGroup must be added without conditions (which will
   * become the default Action for this listener).
   *
   * @param id 
   * @param props 
   */
  public override fun addTargetGroups(id: String, props: AddApplicationTargetGroupsProps) {
    unwrap(this).addTargetGroups(id, props.let(AddApplicationTargetGroupsProps::unwrap))
  }

  /**
   * Load balance incoming requests to the given target groups.
   *
   * All target groups will be load balanced to with equal weight and without
   * stickiness. For a more complex configuration than that, use `addAction()`.
   *
   * It's possible to add routing conditions to the TargetGroups added in this
   * way. At least one TargetGroup must be added without conditions (which will
   * become the default Action for this listener).
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("23d206697af6cd2df80791ed22c62995c4f5c61f025a8e8fccb2df80290df232")
  public override fun addTargetGroups(id: String,
      props: AddApplicationTargetGroupsProps.Builder.() -> Unit): Unit = addTargetGroups(id,
      AddApplicationTargetGroupsProps(props))

  /**
   * Load balance incoming requests to the given load balancing targets.
   *
   * This method implicitly creates an ApplicationTargetGroup for the targets
   * involved, and a 'forward' action to route traffic to the given TargetGroup.
   *
   * If you want more control over the precise setup, create the TargetGroup
   * and use `addAction` yourself.
   *
   * It's possible to add conditions to the targets added in this way. At least
   * one set of targets must be added without conditions.
   *
   * @return The newly created target group
   * @param id 
   * @param props 
   */
  public override fun addTargets(id: String, props: AddApplicationTargetsProps):
      ApplicationTargetGroup = unwrap(this).addTargets(id,
      props.let(AddApplicationTargetsProps::unwrap)).let(ApplicationTargetGroup::wrap)

  /**
   * Load balance incoming requests to the given load balancing targets.
   *
   * This method implicitly creates an ApplicationTargetGroup for the targets
   * involved, and a 'forward' action to route traffic to the given TargetGroup.
   *
   * If you want more control over the precise setup, create the TargetGroup
   * and use `addAction` yourself.
   *
   * It's possible to add conditions to the targets added in this way. At least
   * one set of targets must be added without conditions.
   *
   * @return The newly created target group
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("65353b2aaa4d44b3413ee899b6257e24f21c3f8adbdf472376980f2c10a0a327")
  public override fun addTargets(id: String, props: AddApplicationTargetsProps.Builder.() -> Unit):
      ApplicationTargetGroup = addTargets(id, AddApplicationTargetsProps(props))

  /**
   * Manage connections to this ApplicationListener.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * Load balancer this listener is associated with.
   */
  public open fun loadBalancer(): IApplicationLoadBalancer =
      unwrap(this).getLoadBalancer().let(IApplicationLoadBalancer::wrap)

  /**
   * Register that a connectable that has been added to this load balancer.
   *
   * Don't call this directly. It is called by ApplicationTargetGroup.
   *
   * @param connectable 
   * @param portRange 
   */
  public override fun registerConnectable(connectable: IConnectable, portRange: Port) {
    unwrap(this).registerConnectable(connectable.let(IConnectable::unwrap),
        portRange.let(Port::unwrap))
  }

  /**
   * Register that a connectable that has been added to this load balancer.
   *
   * Don't call this directly. It is called by ApplicationTargetGroup.
   *
   * @param connectable 
   * @param portRange 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bcc196a279cd8df29b10150b2d6fcd0fb653d88666d4c7b6871b5f67e18a087a")
  public override fun registerConnectable(connectable: IConnectable,
      portRange: Port.Builder.() -> Unit): Unit = registerConnectable(connectable, Port(portRange))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.ApplicationListener].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    public fun certificates(certificates: List<IListenerCertificate>)

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    public fun certificates(vararg certificates: IListenerCertificate)

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
     *
     * @param defaultAction Default action to take for requests to this listener. 
     */
    public fun defaultAction(defaultAction: ListenerAction)

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    public fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>)

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    public fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup)

    /**
     * The load balancer to attach this listener to.
     *
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    public fun loadBalancer(loadBalancer: IApplicationLoadBalancer)

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
     *
     * @param open Allow anyone to connect to the load balancer on the listener port. 
     */
    public fun `open`(`open`: Boolean)

    /**
     * The port on which the listener listens for requests.
     *
     * Default: - Determined from protocol if known.
     *
     * @param port The port on which the listener listens for requests. 
     */
    public fun port(port: Number)

    /**
     * The protocol to use.
     *
     * Default: - Determined from port if known.
     *
     * @param protocol The protocol to use. 
     */
    public fun protocol(protocol: ApplicationProtocol)

    /**
     * The security policy that defines which ciphers and protocols are supported.
     *
     * Default: - The current predefined security policy.
     *
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported. 
     */
    public fun sslPolicy(sslPolicy: SslPolicy)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.Builder.create(scope,
        id)

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    override fun certificates(certificates: List<IListenerCertificate>) {
      cdkBuilder.certificates(certificates.map(IListenerCertificate::unwrap))
    }

    /**
     * Certificate list of ACM cert ARNs.
     *
     * You must provide exactly one certificate if the listener protocol is HTTPS or TLS.
     *
     * Default: - No certificates.
     *
     * @param certificates Certificate list of ACM cert ARNs. 
     */
    override fun certificates(vararg certificates: IListenerCertificate): Unit =
        certificates(certificates.toList())

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
     *
     * @param defaultAction Default action to take for requests to this listener. 
     */
    override fun defaultAction(defaultAction: ListenerAction) {
      cdkBuilder.defaultAction(defaultAction.let(ListenerAction::unwrap))
    }

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    override fun defaultTargetGroups(defaultTargetGroups: List<IApplicationTargetGroup>) {
      cdkBuilder.defaultTargetGroups(defaultTargetGroups.map(IApplicationTargetGroup::unwrap))
    }

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
     *
     * @param defaultTargetGroups Default target groups to load balance to. 
     */
    override fun defaultTargetGroups(vararg defaultTargetGroups: IApplicationTargetGroup): Unit =
        defaultTargetGroups(defaultTargetGroups.toList())

    /**
     * The load balancer to attach this listener to.
     *
     * @param loadBalancer The load balancer to attach this listener to. 
     */
    override fun loadBalancer(loadBalancer: IApplicationLoadBalancer) {
      cdkBuilder.loadBalancer(loadBalancer.let(IApplicationLoadBalancer::unwrap))
    }

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
     *
     * @param open Allow anyone to connect to the load balancer on the listener port. 
     */
    override fun `open`(`open`: Boolean) {
      cdkBuilder.`open`(`open`)
    }

    /**
     * The port on which the listener listens for requests.
     *
     * Default: - Determined from protocol if known.
     *
     * @param port The port on which the listener listens for requests. 
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * The protocol to use.
     *
     * Default: - Determined from port if known.
     *
     * @param protocol The protocol to use. 
     */
    override fun protocol(protocol: ApplicationProtocol) {
      cdkBuilder.protocol(protocol.let(ApplicationProtocol::unwrap))
    }

    /**
     * The security policy that defines which ciphers and protocols are supported.
     *
     * Default: - The current predefined security policy.
     *
     * @param sslPolicy The security policy that defines which ciphers and protocols are supported. 
     */
    override fun sslPolicy(sslPolicy: SslPolicy) {
      cdkBuilder.sslPolicy(sslPolicy.let(SslPolicy::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromApplicationListenerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationListenerAttributes,
    ): IApplicationListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.fromApplicationListenerAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(ApplicationListenerAttributes::unwrap)).let(IApplicationListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b897b7fb5b672293f218aba1adecf0ac2282eeedea9ba928e37c9ecba0fae0d4")
    public fun fromApplicationListenerAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: ApplicationListenerAttributes.Builder.() -> Unit,
    ): IApplicationListener = fromApplicationListenerAttributes(scope, id,
        ApplicationListenerAttributes(attrs))

    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationListenerLookupOptions,
    ): IApplicationListener =
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, options.let(ApplicationListenerLookupOptions::unwrap)).let(IApplicationListener::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c7a271d69b9802565632e8864c501b85c1d1c9a7287bb40117a2242310e7184e")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      options: ApplicationListenerLookupOptions.Builder.() -> Unit,
    ): IApplicationListener = fromLookup(scope, id, ApplicationListenerLookupOptions(options))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ApplicationListener {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ApplicationListener(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener):
        ApplicationListener = ApplicationListener(cdkObject)

    internal fun unwrap(wrapped: ApplicationListener):
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener =
        wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationListener
  }
}
