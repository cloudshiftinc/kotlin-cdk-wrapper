@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancing

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Construction properties for a LoadBalancer.
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
public interface LoadBalancerProps {
  /**
   * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
   * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
   * provide folder name inside bucket.
   *
   * Default: - disabled
   */
  public fun accessLoggingPolicy(): CfnLoadBalancer.AccessLoggingPolicyProperty? =
      unwrap(this).getAccessLoggingPolicy()?.let(CfnLoadBalancer.AccessLoggingPolicyProperty::wrap)

  /**
   * Whether cross zone load balancing is enabled.
   *
   * This controls whether the load balancer evenly distributes requests
   * across each availability zone
   *
   * Default: true
   */
  public fun crossZone(): Boolean? = unwrap(this).getCrossZone()

  /**
   * Health check settings for the load balancing targets.
   *
   * Not required but recommended.
   *
   * Default: - None.
   */
  public fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

  /**
   * Whether this is an internet-facing Load Balancer.
   *
   * This controls whether the LB has a public IP address assigned. It does
   * not open up the Load Balancer's security groups to public internet access.
   *
   * Default: false
   */
  public fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

  /**
   * What listeners to set up for the load balancer.
   *
   * Can also be added by .addListener()
   *
   * Default: -
   */
  public fun listeners(): List<LoadBalancerListener> =
      unwrap(this).getListeners()?.map(LoadBalancerListener::wrap) ?: emptyList()

  /**
   * Which subnets to deploy the load balancer.
   *
   * Can be used to define a specific set of subnets to deploy the load balancer to.
   * Useful multiple public or private subnets are covering the same availability zone.
   *
   * Default: - Public subnets if internetFacing, Private subnets otherwise
   */
  public fun subnetSelection(): SubnetSelection? =
      unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

  /**
   * What targets to load balance to.
   *
   * Can also be added by .addTarget()
   *
   * Default: - None.
   */
  public fun targets(): List<ILoadBalancerTarget> =
      unwrap(this).getTargets()?.map(ILoadBalancerTarget::wrap) ?: emptyList()

  /**
   * VPC network of the fleet instances.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [LoadBalancerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket.
     */
    public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty)

    /**
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a3190865c19df1b84c51211b0acb133e87169d0dbe7bb832088cb1ee967dd2")
    public
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit)

    /**
     * @param crossZone Whether cross zone load balancing is enabled.
     * This controls whether the load balancer evenly distributes requests
     * across each availability zone
     */
    public fun crossZone(crossZone: Boolean)

    /**
     * @param healthCheck Health check settings for the load balancing targets.
     * Not required but recommended.
     */
    public fun healthCheck(healthCheck: HealthCheck)

    /**
     * @param healthCheck Health check settings for the load balancing targets.
     * Not required but recommended.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5fc2af6950327ca269256b8e706f124dd82a1db30f51cbac36100b7fbd92fa6")
    public fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit)

    /**
     * @param internetFacing Whether this is an internet-facing Load Balancer.
     * This controls whether the LB has a public IP address assigned. It does
     * not open up the Load Balancer's security groups to public internet access.
     */
    public fun internetFacing(internetFacing: Boolean)

    /**
     * @param listeners What listeners to set up for the load balancer.
     * Can also be added by .addListener()
     */
    public fun listeners(listeners: List<LoadBalancerListener>)

    /**
     * @param listeners What listeners to set up for the load balancer.
     * Can also be added by .addListener()
     */
    public fun listeners(vararg listeners: LoadBalancerListener)

    /**
     * @param subnetSelection Which subnets to deploy the load balancer.
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     */
    public fun subnetSelection(subnetSelection: SubnetSelection)

    /**
     * @param subnetSelection Which subnets to deploy the load balancer.
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d645e12edc9392d4e52337f7d228d9ec87e3c639bc45187f9e4fc32e5ba0ed7c")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    /**
     * @param targets What targets to load balance to.
     * Can also be added by .addTarget()
     */
    public fun targets(targets: List<ILoadBalancerTarget>)

    /**
     * @param targets What targets to load balance to.
     * Can also be added by .addTarget()
     */
    public fun targets(vararg targets: ILoadBalancerTarget)

    /**
     * @param vpc VPC network of the fleet instances. 
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.Builder =
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps.builder()

    /**
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket.
     */
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
      cdkBuilder.accessLoggingPolicy(accessLoggingPolicy.let(CfnLoadBalancer.AccessLoggingPolicyProperty::unwrap))
    }

    /**
     * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work
     * as aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set
     * bucket prefix in order to provide folder name inside bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a8a3190865c19df1b84c51211b0acb133e87169d0dbe7bb832088cb1ee967dd2")
    override
        fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty.Builder.() -> Unit):
        Unit = accessLoggingPolicy(CfnLoadBalancer.AccessLoggingPolicyProperty(accessLoggingPolicy))

    /**
     * @param crossZone Whether cross zone load balancing is enabled.
     * This controls whether the load balancer evenly distributes requests
     * across each availability zone
     */
    override fun crossZone(crossZone: Boolean) {
      cdkBuilder.crossZone(crossZone)
    }

    /**
     * @param healthCheck Health check settings for the load balancing targets.
     * Not required but recommended.
     */
    override fun healthCheck(healthCheck: HealthCheck) {
      cdkBuilder.healthCheck(healthCheck.let(HealthCheck::unwrap))
    }

    /**
     * @param healthCheck Health check settings for the load balancing targets.
     * Not required but recommended.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e5fc2af6950327ca269256b8e706f124dd82a1db30f51cbac36100b7fbd92fa6")
    override fun healthCheck(healthCheck: HealthCheck.Builder.() -> Unit): Unit =
        healthCheck(HealthCheck(healthCheck))

    /**
     * @param internetFacing Whether this is an internet-facing Load Balancer.
     * This controls whether the LB has a public IP address assigned. It does
     * not open up the Load Balancer's security groups to public internet access.
     */
    override fun internetFacing(internetFacing: Boolean) {
      cdkBuilder.internetFacing(internetFacing)
    }

    /**
     * @param listeners What listeners to set up for the load balancer.
     * Can also be added by .addListener()
     */
    override fun listeners(listeners: List<LoadBalancerListener>) {
      cdkBuilder.listeners(listeners.map(LoadBalancerListener::unwrap))
    }

    /**
     * @param listeners What listeners to set up for the load balancer.
     * Can also be added by .addListener()
     */
    override fun listeners(vararg listeners: LoadBalancerListener): Unit =
        listeners(listeners.toList())

    /**
     * @param subnetSelection Which subnets to deploy the load balancer.
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     */
    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    /**
     * @param subnetSelection Which subnets to deploy the load balancer.
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d645e12edc9392d4e52337f7d228d9ec87e3c639bc45187f9e4fc32e5ba0ed7c")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    /**
     * @param targets What targets to load balance to.
     * Can also be added by .addTarget()
     */
    override fun targets(targets: List<ILoadBalancerTarget>) {
      cdkBuilder.targets(targets.map(ILoadBalancerTarget::unwrap))
    }

    /**
     * @param targets What targets to load balance to.
     * Can also be added by .addTarget()
     */
    override fun targets(vararg targets: ILoadBalancerTarget): Unit = targets(targets.toList())

    /**
     * @param vpc VPC network of the fleet instances. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps,
  ) : CdkObject(cdkObject), LoadBalancerProps {
    /**
     * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
     * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
     * provide folder name inside bucket.
     *
     * Default: - disabled
     */
    override fun accessLoggingPolicy(): CfnLoadBalancer.AccessLoggingPolicyProperty? =
        unwrap(this).getAccessLoggingPolicy()?.let(CfnLoadBalancer.AccessLoggingPolicyProperty::wrap)

    /**
     * Whether cross zone load balancing is enabled.
     *
     * This controls whether the load balancer evenly distributes requests
     * across each availability zone
     *
     * Default: true
     */
    override fun crossZone(): Boolean? = unwrap(this).getCrossZone()

    /**
     * Health check settings for the load balancing targets.
     *
     * Not required but recommended.
     *
     * Default: - None.
     */
    override fun healthCheck(): HealthCheck? = unwrap(this).getHealthCheck()?.let(HealthCheck::wrap)

    /**
     * Whether this is an internet-facing Load Balancer.
     *
     * This controls whether the LB has a public IP address assigned. It does
     * not open up the Load Balancer's security groups to public internet access.
     *
     * Default: false
     */
    override fun internetFacing(): Boolean? = unwrap(this).getInternetFacing()

    /**
     * What listeners to set up for the load balancer.
     *
     * Can also be added by .addListener()
     *
     * Default: -
     */
    override fun listeners(): List<LoadBalancerListener> =
        unwrap(this).getListeners()?.map(LoadBalancerListener::wrap) ?: emptyList()

    /**
     * Which subnets to deploy the load balancer.
     *
     * Can be used to define a specific set of subnets to deploy the load balancer to.
     * Useful multiple public or private subnets are covering the same availability zone.
     *
     * Default: - Public subnets if internetFacing, Private subnets otherwise
     */
    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    /**
     * What targets to load balance to.
     *
     * Can also be added by .addTarget()
     *
     * Default: - None.
     */
    override fun targets(): List<ILoadBalancerTarget> =
        unwrap(this).getTargets()?.map(ILoadBalancerTarget::wrap) ?: emptyList()

    /**
     * VPC network of the fleet instances.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LoadBalancerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps):
        LoadBalancerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LoadBalancerProps):
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
  }
}
