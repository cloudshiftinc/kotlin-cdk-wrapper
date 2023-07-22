@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.constructs.Construct

/**
 * A load balancer with a single listener.
 *
 * Routes to a fleet of of instances in a VPC.
 *
 * Example:
 *
 * ```
 * IVpc vpc;
 * AutoScalingGroup myAutoScalingGroup;
 * LoadBalancer lb = LoadBalancer.Builder.create(this, "LB")
 * .vpc(vpc)
 * .internetFacing(true)
 * .healthCheck(HealthCheck.builder()
 * .port(80)
 * .build())
 * .build();
 * lb.addTarget(myAutoScalingGroup);
 * lb.addListener(LoadBalancerListener.builder()
 * .externalPort(80)
 * .build());
 * ```
 */
@CdkDslMarker
public class LoadBalancerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: LoadBalancer.Builder = LoadBalancer.Builder.create(scope, id)

  private val _listeners: MutableList<LoadBalancerListener> = mutableListOf()

  private val _targets: MutableList<ILoadBalancerTarget> = mutableListOf()

  /**
   * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
   * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
   * provide folder name inside bucket.
   *
   * Default: - disabled
   *
   * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work as
   * aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set bucket
   * prefix in order to provide folder name inside bucket. 
   */
  public
      fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit
      = {}) {
    val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
    builder.apply(accessLoggingPolicy)
    cdkBuilder.accessLoggingPolicy(builder.build())
  }

  /**
   * Enable Loadbalancer access logs Can be used to avoid manual work as aws console Required S3
   * bucket name , enabled flag Can add interval for pushing log Can set bucket prefix in order to
   * provide folder name inside bucket.
   *
   * Default: - disabled
   *
   * @param accessLoggingPolicy Enable Loadbalancer access logs Can be used to avoid manual work as
   * aws console Required S3 bucket name , enabled flag Can add interval for pushing log Can set bucket
   * prefix in order to provide folder name inside bucket. 
   */
  public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
    cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
  }

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
  public fun crossZone(crossZone: Boolean) {
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
  public fun healthCheck(healthCheck: HealthCheckDsl.() -> Unit = {}) {
    val builder = HealthCheckDsl()
    builder.apply(healthCheck)
    cdkBuilder.healthCheck(builder.build())
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
  public fun healthCheck(healthCheck: HealthCheck) {
    cdkBuilder.healthCheck(healthCheck)
  }

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
  public fun internetFacing(internetFacing: Boolean) {
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
  public fun listeners(listeners: LoadBalancerListenerDsl.() -> Unit) {
    _listeners.add(LoadBalancerListenerDsl().apply(listeners).build())
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
  public fun listeners(listeners: Collection<LoadBalancerListener>) {
    _listeners.addAll(listeners)
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
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
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
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
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
  public fun targets(vararg targets: ILoadBalancerTarget) {
    _targets.addAll(listOf(*targets))
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
  public fun targets(targets: Collection<ILoadBalancerTarget>) {
    _targets.addAll(targets)
  }

  /**
   * VPC network of the fleet instances.
   *
   * @param vpc VPC network of the fleet instances. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): LoadBalancer {
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    if(_targets.isNotEmpty()) cdkBuilder.targets(_targets)
    return cdkBuilder.build()
  }
}
