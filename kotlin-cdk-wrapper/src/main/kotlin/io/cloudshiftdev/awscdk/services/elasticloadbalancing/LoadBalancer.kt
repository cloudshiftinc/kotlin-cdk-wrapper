@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A load balancer with a single listener.
 *
 * Routes to a fleet of of instances in a VPC.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * Vpc vpc;
 * Ec2Service service = Ec2Service.Builder.create(this,
 * "Service").cluster(cluster).taskDefinition(taskDefinition).build();
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB").vpc(vpc).build();
 * lb.addListener(LoadBalancerListener.builder().externalPort(80).build());
 * lb.addTarget(service.loadBalancerTarget(LoadBalancerTargetOptions.builder()
 * .containerName("MyContainer")
 * .containerPort(80)
 * .build()));
 * ```
 */
public open class LoadBalancer(
  cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer,
) : Resource(cdkObject), IConnectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LoadBalancerProps,
  ) :
      this(software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(LoadBalancerProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: LoadBalancerProps.Builder.() -> Unit,
  ) : this(scope, id, LoadBalancerProps(props)
  )

  /**
   * Add a backend to the load balancer.
   *
   * @return A ListenerPort object that controls connections to the listener port
   * @param listener 
   */
  public open fun addListener(listener: LoadBalancerListener): ListenerPort =
      unwrap(this).addListener(listener.let(LoadBalancerListener.Companion::unwrap)).let(ListenerPort::wrap)

  /**
   * Add a backend to the load balancer.
   *
   * @return A ListenerPort object that controls connections to the listener port
   * @param listener 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("478e00efcdf2fe91cab796f82f9fd27022c9a7f8c2a29b388826de6894902089")
  public open fun addListener(listener: LoadBalancerListener.Builder.() -> Unit): ListenerPort =
      addListener(LoadBalancerListener(listener))

  /**
   * @param target 
   */
  public open fun addTarget(target: ILoadBalancerTarget) {
    unwrap(this).addTarget(target.let(ILoadBalancerTarget.Companion::unwrap))
  }

  /**
   * Control all connections from and to this load balancer.
   */
  public override fun connections(): Connections =
      unwrap(this).getConnections().let(Connections::wrap)

  /**
   * An object controlling specifically the connections for each listener added to this load
   * balancer.
   */
  public open fun listenerPorts(): List<ListenerPort> =
      unwrap(this).getListenerPorts().map(ListenerPort::wrap)

  /**
   *
   */
  public open fun loadBalancerCanonicalHostedZoneName(): String =
      unwrap(this).getLoadBalancerCanonicalHostedZoneName()

  /**
   *
   */
  public open fun loadBalancerCanonicalHostedZoneNameId(): String =
      unwrap(this).getLoadBalancerCanonicalHostedZoneNameId()

  /**
   *
   */
  public open fun loadBalancerDnsName(): String = unwrap(this).getLoadBalancerDnsName()

  /**
   *
   */
  public open fun loadBalancerName(): String = unwrap(this).getLoadBalancerName()

  /**
   *
   */
  public open fun loadBalancerSourceSecurityGroupGroupName(): String =
      unwrap(this).getLoadBalancerSourceSecurityGroupGroupName()

  /**
   *
   */
  public open fun loadBalancerSourceSecurityGroupOwnerAlias(): String =
      unwrap(this).getLoadBalancerSourceSecurityGroupOwnerAlias()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.elasticloadbalancing.LoadBalancer].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
     * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
     * provide folder name inside bucket.
     *
     * Default: - disabled
     *
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket. 
     */
    public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty)

    /**
     * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
     * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
     * provide folder name inside bucket.
     *
     * Default: - disabled
     *
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc15462f5800028ee0a73413d8b335b4c9e1cb463c6aa6f737fbb07b0abf0e5a")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit)

    /**
     * Whether cross zone load balancing is enabled.
     *
     * This controls whether the load balancer evenly distributes requests
     * across each availability zone
     *
     * Default: true
     *
     * @param crossZone Whether cross zone load balancing is enabled. 
     */
    public fun crossZone(crossZone: Boolean)

    /**
     * Health check settings for the load balancing targets.
     *
     * Not required but recommended.
     *
     * Default: - None.
     *
     * @param healthCheck Health check settings for the load balancing targets. 
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * Health check settings for the load balancing targets.
     *
     * Not required but recommended.
     *
     * Default: - None.
     *
     * @param healthCheck Health check settings for the load balancing targets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65a99da1eca4ee4376bd14619a95df3d7c739a2d0c286c02a3d8077f18049e33")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * Whether this is an internet-facing Load Balancer.
     *
     * This controls whether the LB has a public IP address assigned. It does
     * not open up the Load Balancer's security groups to public internet access.
     *
     * Default: false
     *
     * @param internetFacing Whether this is an internet-facing Load Balancer. 
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * What listeners to set up for the load balancer.
     *
     * Can also be added by .addListener()
     *
     * Default: -
     *
     * @param listeners What listeners to set up for the load balancer. 
     */
    public fun listeners(listeners: List<LoadBalancerListener>)

    /**
     * What listeners to set up for the load balancer.
     *
     * Can also be added by .addListener()
     *
     * Default: -
     *
     * @param listeners What listeners to set up for the load balancer. 
     */
    public fun listeners(vararg listeners: LoadBalancerListener)

    /**
     * Which subnets to deploy the load balancer.
     *
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     *
     * Default: - Public subnets if internetFacing, Private subnets otherwise
     *
     * @param subnetSelection Which subnets to deploy the load balancer. 
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * Which subnets to deploy the load balancer.
     *
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     *
     * Default: - Public subnets if internetFacing, Private subnets otherwise
     *
     * @param subnetSelection Which subnets to deploy the load balancer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b46623007ae2024844912d743e1a99d7ddcac10babc527493533fc1010a669d9")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * What targets to load balance to.
     *
     * Can also be added by .addTarget()
     *
     * Default: - None.
     *
     * @param targets What targets to load balance to. 
     */
    public fun targets(targets: List<ILoadBalancerTarget>)

    /**
     * What targets to load balance to.
     *
     * Can also be added by .addTarget()
     *
     * Default: - None.
     *
     * @param targets What targets to load balance to. 
     */
    public fun targets(vararg targets: ILoadBalancerTarget)

    /**
     * VPC network of the fleet instances.
     *
     * @param vpc VPC network of the fleet instances. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer.Builder.create(scope, id)

    /**
     * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
     * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
     * provide folder name inside bucket.
     *
     * Default: - disabled
     *
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket. 
     */
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(CfnLoadBalancer.AccessLoggingPolicyProperty.Companion::unwrap))
    }

    /**
     * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
     * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
     * provide folder name inside bucket.
     *
     * Default: - disabled
     *
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc15462f5800028ee0a73413d8b335b4c9e1cb463c6aa6f737fbb07b0abf0e5a")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(CfnLoadBalancer.AccessLoggingPolicyProperty(accessLoggingPolicy))

    /**
     * Whether cross zone load balancing is enabled.
     *
     * This controls whether the load balancer evenly distributes requests
     * across each availability zone
     *
     * Default: true
     *
     * @param crossZone Whether cross zone load balancing is enabled. 
     */
    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    /**
     * Health check settings for the load balancing targets.
     *
     * Not required but recommended.
     *
     * Default: - None.
     *
     * @param healthCheck Health check settings for the load balancing targets. 
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck.Companion::unwrap))
    }

    /**
     * Health check settings for the load balancing targets.
     *
     * Not required but recommended.
     *
     * Default: - None.
     *
     * @param healthCheck Health check settings for the load balancing targets. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65a99da1eca4ee4376bd14619a95df3d7c739a2d0c286c02a3d8077f18049e33")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * Whether this is an internet-facing Load Balancer.
     *
     * This controls whether the LB has a public IP address assigned. It does
     * not open up the Load Balancer's security groups to public internet access.
     *
     * Default: false
     *
     * @param internetFacing Whether this is an internet-facing Load Balancer. 
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * What listeners to set up for the load balancer.
     *
     * Can also be added by .addListener()
     *
     * Default: -
     *
     * @param listeners What listeners to set up for the load balancer. 
     */
    override fun listeners(listeners: List<LoadBalancerListener>) {
      cdkBuilder.listeners(listeners.map(LoadBalancerListener.Companion::unwrap))
    }

    /**
     * What listeners to set up for the load balancer.
     *
     * Can also be added by .addListener()
     *
     * Default: -
     *
     * @param listeners What listeners to set up for the load balancer. 
     */
    override fun listeners(vararg listeners: LoadBalancerListener): Unit =
        listeners(listeners.toList())

    /**
     * Which subnets to deploy the load balancer.
     *
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     *
     * Default: - Public subnets if internetFacing, Private subnets otherwise
     *
     * @param subnetSelection Which subnets to deploy the load balancer. 
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection.Companion::unwrap))
    }

    /**
     * Which subnets to deploy the load balancer.
     *
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     *
     * Default: - Public subnets if internetFacing, Private subnets otherwise
     *
     * @param subnetSelection Which subnets to deploy the load balancer. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b46623007ae2024844912d743e1a99d7ddcac10babc527493533fc1010a669d9")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * What targets to load balance to.
     *
     * Can also be added by .addTarget()
     *
     * Default: - None.
     *
     * @param targets What targets to load balance to. 
     */
    override fun targets(targets: List<ILoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(ILoadBalancerTarget.Companion::unwrap))
    }

    /**
     * What targets to load balance to.
     *
     * Can also be added by .addTarget()
     *
     * Default: - None.
     *
     * @param targets What targets to load balance to. 
     */
    override fun targets(vararg targets: ILoadBalancerTarget): Unit = targets(targets.toList())

    /**
     * VPC network of the fleet instances.
     *
     * @param vpc VPC network of the fleet instances. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer =
        cdkBuilder.build()
  }

  public companion object {
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
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer = wrapped.cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
  }
}
