@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancerProps

@CdkDslMarker
public class CfnLoadBalancerPropsDsl {
  private val cdkBuilder: CfnLoadBalancerProps.Builder = CfnLoadBalancerProps.builder()

  private val _appCookieStickinessPolicy: MutableList<Any> = mutableListOf()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _instances: MutableList<String> = mutableListOf()

  private val _lbCookieStickinessPolicy: MutableList<Any> = mutableListOf()

  private val _listeners: MutableList<Any> = mutableListOf()

  private val _policies: MutableList<Any> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param accessLoggingPolicy Information about where and how access logs are stored for the load
   * balancer.
   */
  public fun accessLoggingPolicy(accessLoggingPolicy: IResolvable) {
    cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
  }

  /**
   * @param accessLoggingPolicy Information about where and how access logs are stored for the load
   * balancer.
   */
  public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
    cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
  }

  /**
   * @param appCookieStickinessPolicy Information about a policy for application-controlled session
   * stickiness.
   */
  public fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any) {
    _appCookieStickinessPolicy.addAll(listOf(*appCookieStickinessPolicy))
  }

  /**
   * @param appCookieStickinessPolicy Information about a policy for application-controlled session
   * stickiness.
   */
  public fun appCookieStickinessPolicy(appCookieStickinessPolicy: Collection<Any>) {
    _appCookieStickinessPolicy.addAll(appCookieStickinessPolicy)
  }

  /**
   * @param appCookieStickinessPolicy Information about a policy for application-controlled session
   * stickiness.
   */
  public fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable) {
    cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy)
  }

  /**
   * @param availabilityZones The Availability Zones for the load balancer. For load balancers in a
   * VPC, specify `Subnets` instead.
   * Update requires replacement if you did not previously specify an Availability Zone or if you
   * are removing all Availability Zones. Otherwise, update requires no interruption.
   */
  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  /**
   * @param availabilityZones The Availability Zones for the load balancer. For load balancers in a
   * VPC, specify `Subnets` instead.
   * Update requires replacement if you did not previously specify an Availability Zone or if you
   * are removing all Availability Zones. Otherwise, update requires no interruption.
   */
  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  /**
   * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
   * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
   * For more information, see [Configure Connection
   * Draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
   * in the *Classic Load Balancers Guide* .
   */
  public fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable) {
    cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy)
  }

  /**
   * @param connectionDrainingPolicy If enabled, the load balancer allows existing requests to
   * complete before the load balancer shifts traffic away from a deregistered or unhealthy instance.
   * For more information, see [Configure Connection
   * Draining](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-conn-drain.html)
   * in the *Classic Load Balancers Guide* .
   */
  public
      fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty) {
    cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy)
  }

  /**
   * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
   * (no data is sent over the connection) for the specified duration.
   * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
   * front-end and back-end connections of your load balancer. For more information, see [Configure
   * Idle Connection
   * Timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
   * in the *Classic Load Balancers Guide* .
   */
  public fun connectionSettings(connectionSettings: IResolvable) {
    cdkBuilder.connectionSettings(connectionSettings)
  }

  /**
   * @param connectionSettings If enabled, the load balancer allows the connections to remain idle
   * (no data is sent over the connection) for the specified duration.
   * By default, Elastic Load Balancing maintains a 60-second idle connection timeout for both
   * front-end and back-end connections of your load balancer. For more information, see [Configure
   * Idle Connection
   * Timeout](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/config-idle-timeout.html)
   * in the *Classic Load Balancers Guide* .
   */
  public fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty) {
    cdkBuilder.connectionSettings(connectionSettings)
  }

  /**
   * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
   * instances regardless of the Availability Zones.
   * For more information, see [Configure Cross-Zone Load
   * Balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
   * in the *Classic Load Balancers Guide* .
   */
  public fun crossZone(crossZone: Boolean) {
    cdkBuilder.crossZone(crossZone)
  }

  /**
   * @param crossZone If enabled, the load balancer routes the request traffic evenly across all
   * instances regardless of the Availability Zones.
   * For more information, see [Configure Cross-Zone Load
   * Balancing](https://docs.aws.amazon.com/elasticloadbalancing/latest/classic/enable-disable-crosszone-lb.html)
   * in the *Classic Load Balancers Guide* .
   */
  public fun crossZone(crossZone: IResolvable) {
    cdkBuilder.crossZone(crossZone)
  }

  /**
   * @param healthCheck The health check settings to use when evaluating the health of your EC2
   * instances.
   * Update requires replacement if you did not previously specify health check settings or if you
   * are removing the health check settings. Otherwise, update requires no interruption.
   */
  public fun healthCheck(healthCheck: IResolvable) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param healthCheck The health check settings to use when evaluating the health of your EC2
   * instances.
   * Update requires replacement if you did not previously specify health check settings or if you
   * are removing the health check settings. Otherwise, update requires no interruption.
   */
  public fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty) {
    cdkBuilder.healthCheck(healthCheck)
  }

  /**
   * @param instances The IDs of the instances for the load balancer.
   */
  public fun instances(vararg instances: String) {
    _instances.addAll(listOf(*instances))
  }

  /**
   * @param instances The IDs of the instances for the load balancer.
   */
  public fun instances(instances: Collection<String>) {
    _instances.addAll(instances)
  }

  /**
   * @param lbCookieStickinessPolicy Information about a policy for duration-based session
   * stickiness.
   */
  public fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any) {
    _lbCookieStickinessPolicy.addAll(listOf(*lbCookieStickinessPolicy))
  }

  /**
   * @param lbCookieStickinessPolicy Information about a policy for duration-based session
   * stickiness.
   */
  public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: Collection<Any>) {
    _lbCookieStickinessPolicy.addAll(lbCookieStickinessPolicy)
  }

  /**
   * @param lbCookieStickinessPolicy Information about a policy for duration-based session
   * stickiness.
   */
  public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable) {
    cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy)
  }

  /**
   * @param listeners The listeners for the load balancer. You can specify at most one listener per
   * port. 
   * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
   * and creates a new one with the specified properties. While the new listener is being created,
   * clients cannot connect to the load balancer.
   */
  public fun listeners(vararg listeners: Any) {
    _listeners.addAll(listOf(*listeners))
  }

  /**
   * @param listeners The listeners for the load balancer. You can specify at most one listener per
   * port. 
   * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
   * and creates a new one with the specified properties. While the new listener is being created,
   * clients cannot connect to the load balancer.
   */
  public fun listeners(listeners: Collection<Any>) {
    _listeners.addAll(listeners)
  }

  /**
   * @param listeners The listeners for the load balancer. You can specify at most one listener per
   * port. 
   * If you update the properties for a listener, AWS CloudFormation deletes the existing listener
   * and creates a new one with the specified properties. While the new listener is being created,
   * clients cannot connect to the load balancer.
   */
  public fun listeners(listeners: IResolvable) {
    cdkBuilder.listeners(listeners)
  }

  /**
   * @param loadBalancerName The name of the load balancer.
   * This name must be unique within your set of load balancers for the region.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID for the load
   * balancer. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   * If you specify a name, you cannot perform updates that require replacement of this resource, but
   * you can perform other updates. To replace the resource, specify a new name.
   */
  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  /**
   * @param policies The policies defined for your Classic Load Balancer.
   * Specify only back-end server policies.
   */
  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  /**
   * @param policies The policies defined for your Classic Load Balancer.
   * Specify only back-end server policies.
   */
  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  /**
   * @param policies The policies defined for your Classic Load Balancer.
   * Specify only back-end server policies.
   */
  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  /**
   * @param scheme The type of load balancer. Valid only for load balancers in a VPC.
   * If `Scheme` is `internet-facing` , the load balancer has a public DNS name that resolves to a
   * public IP address.
   *
   * If `Scheme` is `internal` , the load balancer has a public DNS name that resolves to a private
   * IP address.
   */
  public fun scheme(scheme: String) {
    cdkBuilder.scheme(scheme)
  }

  /**
   * @param securityGroups The security groups for the load balancer.
   * Valid only for load balancers in a VPC.
   */
  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups for the load balancer.
   * Valid only for load balancers in a VPC.
   */
  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  /**
   * @param subnets The IDs of the subnets for the load balancer. You can specify at most one subnet
   * per Availability Zone.
   * Update requires replacement if you did not previously specify a subnet or if you are removing
   * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
   * current Availability Zone, you must first update to a subnet in a different Availability Zone,
   * then update to the new subnet in the original Availability Zone.
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * @param subnets The IDs of the subnets for the load balancer. You can specify at most one subnet
   * per Availability Zone.
   * Update requires replacement if you did not previously specify a subnet or if you are removing
   * all subnets. Otherwise, update requires no interruption. To update to a different subnet in the
   * current Availability Zone, you must first update to a subnet in a different Availability Zone,
   * then update to the new subnet in the original Availability Zone.
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  /**
   * @param tags The tags associated with a load balancer.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags associated with a load balancer.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLoadBalancerProps {
    if(_appCookieStickinessPolicy.isNotEmpty())
        cdkBuilder.appCookieStickinessPolicy(_appCookieStickinessPolicy)
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_instances.isNotEmpty()) cdkBuilder.instances(_instances)
    if(_lbCookieStickinessPolicy.isNotEmpty())
        cdkBuilder.lbCookieStickinessPolicy(_lbCookieStickinessPolicy)
    if(_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
    if(_policies.isNotEmpty()) cdkBuilder.policies(_policies)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
