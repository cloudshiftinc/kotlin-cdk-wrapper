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
import software.constructs.Construct

@CdkDslMarker
public class CfnLoadBalancerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnLoadBalancer.Builder = CfnLoadBalancer.Builder.create(scope, id)

  private val _appCookieStickinessPolicy: MutableList<Any> = mutableListOf()

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _instances: MutableList<String> = mutableListOf()

  private val _lbCookieStickinessPolicy: MutableList<Any> = mutableListOf()

  private val _listeners: MutableList<Any> = mutableListOf()

  private val _policies: MutableList<Any> = mutableListOf()

  private val _securityGroups: MutableList<String> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun accessLoggingPolicy(accessLoggingPolicy: IResolvable) {
    cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
  }

  public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
    cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
  }

  public fun appCookieStickinessPolicy(vararg appCookieStickinessPolicy: Any) {
    _appCookieStickinessPolicy.addAll(listOf(*appCookieStickinessPolicy))
  }

  public fun appCookieStickinessPolicy(appCookieStickinessPolicy: Collection<Any>) {
    _appCookieStickinessPolicy.addAll(appCookieStickinessPolicy)
  }

  public fun appCookieStickinessPolicy(appCookieStickinessPolicy: IResolvable) {
    cdkBuilder.appCookieStickinessPolicy(appCookieStickinessPolicy)
  }

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun connectionDrainingPolicy(connectionDrainingPolicy: IResolvable) {
    cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy)
  }

  public
      fun connectionDrainingPolicy(connectionDrainingPolicy: CfnLoadBalancer.ConnectionDrainingPolicyProperty) {
    cdkBuilder.connectionDrainingPolicy(connectionDrainingPolicy)
  }

  public fun connectionSettings(connectionSettings: IResolvable) {
    cdkBuilder.connectionSettings(connectionSettings)
  }

  public fun connectionSettings(connectionSettings: CfnLoadBalancer.ConnectionSettingsProperty) {
    cdkBuilder.connectionSettings(connectionSettings)
  }

  public fun crossZone(crossZone: Boolean) {
    cdkBuilder.crossZone(crossZone)
  }

  public fun crossZone(crossZone: IResolvable) {
    cdkBuilder.crossZone(crossZone)
  }

  public fun healthCheck(healthCheck: IResolvable) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public fun healthCheck(healthCheck: CfnLoadBalancer.HealthCheckProperty) {
    cdkBuilder.healthCheck(healthCheck)
  }

  public fun instances(vararg instances: String) {
    _instances.addAll(listOf(*instances))
  }

  public fun instances(instances: Collection<String>) {
    _instances.addAll(instances)
  }

  public fun lbCookieStickinessPolicy(vararg lbCookieStickinessPolicy: Any) {
    _lbCookieStickinessPolicy.addAll(listOf(*lbCookieStickinessPolicy))
  }

  public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: Collection<Any>) {
    _lbCookieStickinessPolicy.addAll(lbCookieStickinessPolicy)
  }

  public fun lbCookieStickinessPolicy(lbCookieStickinessPolicy: IResolvable) {
    cdkBuilder.lbCookieStickinessPolicy(lbCookieStickinessPolicy)
  }

  public fun listeners(vararg listeners: Any) {
    _listeners.addAll(listOf(*listeners))
  }

  public fun listeners(listeners: Collection<Any>) {
    _listeners.addAll(listeners)
  }

  public fun listeners(listeners: IResolvable) {
    cdkBuilder.listeners(listeners)
  }

  public fun loadBalancerName(loadBalancerName: String) {
    cdkBuilder.loadBalancerName(loadBalancerName)
  }

  public fun policies(vararg policies: Any) {
    _policies.addAll(listOf(*policies))
  }

  public fun policies(policies: Collection<Any>) {
    _policies.addAll(policies)
  }

  public fun policies(policies: IResolvable) {
    cdkBuilder.policies(policies)
  }

  public fun scheme(scheme: String) {
    cdkBuilder.scheme(scheme)
  }

  public fun securityGroups(vararg securityGroups: String) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<String>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnLoadBalancer {
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
