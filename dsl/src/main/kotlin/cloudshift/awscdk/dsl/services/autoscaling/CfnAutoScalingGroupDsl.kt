@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscaling

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.autoscaling.CfnAutoScalingGroup
import software.constructs.Construct

@CdkDslMarker
public class CfnAutoScalingGroupDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAutoScalingGroup.Builder = CfnAutoScalingGroup.Builder.create(scope,
      id)

  private val _availabilityZones: MutableList<String> = mutableListOf()

  private val _lifecycleHookSpecificationList: MutableList<Any> = mutableListOf()

  private val _loadBalancerNames: MutableList<String> = mutableListOf()

  private val _metricsCollection: MutableList<Any> = mutableListOf()

  private val _notificationConfigurations: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnAutoScalingGroup.TagPropertyProperty> = mutableListOf()

  private val _targetGroupArns: MutableList<String> = mutableListOf()

  private val _terminationPolicies: MutableList<String> = mutableListOf()

  private val _vpcZoneIdentifier: MutableList<String> = mutableListOf()

  public fun autoScalingGroupName(autoScalingGroupName: String) {
    cdkBuilder.autoScalingGroupName(autoScalingGroupName)
  }

  public fun availabilityZones(vararg availabilityZones: String) {
    _availabilityZones.addAll(listOf(*availabilityZones))
  }

  public fun availabilityZones(availabilityZones: Collection<String>) {
    _availabilityZones.addAll(availabilityZones)
  }

  public fun capacityRebalance(capacityRebalance: Boolean) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  public fun capacityRebalance(capacityRebalance: IResolvable) {
    cdkBuilder.capacityRebalance(capacityRebalance)
  }

  public fun context(context: String) {
    cdkBuilder.context(context)
  }

  public fun cooldown(cooldown: String) {
    cdkBuilder.cooldown(cooldown)
  }

  public fun defaultInstanceWarmup(defaultInstanceWarmup: Number) {
    cdkBuilder.defaultInstanceWarmup(defaultInstanceWarmup)
  }

  public fun desiredCapacity(desiredCapacity: String) {
    cdkBuilder.desiredCapacity(desiredCapacity)
  }

  public fun desiredCapacityType(desiredCapacityType: String) {
    cdkBuilder.desiredCapacityType(desiredCapacityType)
  }

  public fun healthCheckGracePeriod(healthCheckGracePeriod: Number) {
    cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
  }

  public fun healthCheckType(healthCheckType: String) {
    cdkBuilder.healthCheckType(healthCheckType)
  }

  public fun instanceId(instanceId: String) {
    cdkBuilder.instanceId(instanceId)
  }

  public fun launchConfigurationName(launchConfigurationName: String) {
    cdkBuilder.launchConfigurationName(launchConfigurationName)
  }

  public fun launchTemplate(launchTemplate: IResolvable) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public
      fun launchTemplate(launchTemplate: CfnAutoScalingGroup.LaunchTemplateSpecificationProperty) {
    cdkBuilder.launchTemplate(launchTemplate)
  }

  public fun lifecycleHookSpecificationList(vararg lifecycleHookSpecificationList: Any) {
    _lifecycleHookSpecificationList.addAll(listOf(*lifecycleHookSpecificationList))
  }

  public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: Collection<Any>) {
    _lifecycleHookSpecificationList.addAll(lifecycleHookSpecificationList)
  }

  public fun lifecycleHookSpecificationList(lifecycleHookSpecificationList: IResolvable) {
    cdkBuilder.lifecycleHookSpecificationList(lifecycleHookSpecificationList)
  }

  public fun loadBalancerNames(vararg loadBalancerNames: String) {
    _loadBalancerNames.addAll(listOf(*loadBalancerNames))
  }

  public fun loadBalancerNames(loadBalancerNames: Collection<String>) {
    _loadBalancerNames.addAll(loadBalancerNames)
  }

  public fun maxInstanceLifetime(maxInstanceLifetime: Number) {
    cdkBuilder.maxInstanceLifetime(maxInstanceLifetime)
  }

  public fun maxSize(maxSize: String) {
    cdkBuilder.maxSize(maxSize)
  }

  public fun metricsCollection(vararg metricsCollection: Any) {
    _metricsCollection.addAll(listOf(*metricsCollection))
  }

  public fun metricsCollection(metricsCollection: Collection<Any>) {
    _metricsCollection.addAll(metricsCollection)
  }

  public fun metricsCollection(metricsCollection: IResolvable) {
    cdkBuilder.metricsCollection(metricsCollection)
  }

  public fun minSize(minSize: String) {
    cdkBuilder.minSize(minSize)
  }

  public fun mixedInstancesPolicy(mixedInstancesPolicy: IResolvable) {
    cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy)
  }

  public
      fun mixedInstancesPolicy(mixedInstancesPolicy: CfnAutoScalingGroup.MixedInstancesPolicyProperty) {
    cdkBuilder.mixedInstancesPolicy(mixedInstancesPolicy)
  }

  public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: Boolean) {
    cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
  }

  public fun newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn: IResolvable) {
    cdkBuilder.newInstancesProtectedFromScaleIn(newInstancesProtectedFromScaleIn)
  }

  public fun notificationConfigurations(vararg notificationConfigurations: Any) {
    _notificationConfigurations.addAll(listOf(*notificationConfigurations))
  }

  public fun notificationConfigurations(notificationConfigurations: Collection<Any>) {
    _notificationConfigurations.addAll(notificationConfigurations)
  }

  public fun notificationConfigurations(notificationConfigurations: IResolvable) {
    cdkBuilder.notificationConfigurations(notificationConfigurations)
  }

  public fun placementGroup(placementGroup: String) {
    cdkBuilder.placementGroup(placementGroup)
  }

  public fun serviceLinkedRoleArn(serviceLinkedRoleArn: String) {
    cdkBuilder.serviceLinkedRoleArn(serviceLinkedRoleArn)
  }

  public fun tags(tags: CfnAutoScalingGroupTagPropertyPropertyDsl.() -> Unit) {
    _tags.add(CfnAutoScalingGroupTagPropertyPropertyDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnAutoScalingGroup.TagPropertyProperty>) {
    _tags.addAll(tags)
  }

  public fun targetGroupArns(vararg targetGroupArns: String) {
    _targetGroupArns.addAll(listOf(*targetGroupArns))
  }

  public fun targetGroupArns(targetGroupArns: Collection<String>) {
    _targetGroupArns.addAll(targetGroupArns)
  }

  public fun terminationPolicies(vararg terminationPolicies: String) {
    _terminationPolicies.addAll(listOf(*terminationPolicies))
  }

  public fun terminationPolicies(terminationPolicies: Collection<String>) {
    _terminationPolicies.addAll(terminationPolicies)
  }

  public fun vpcZoneIdentifier(vararg vpcZoneIdentifier: String) {
    _vpcZoneIdentifier.addAll(listOf(*vpcZoneIdentifier))
  }

  public fun vpcZoneIdentifier(vpcZoneIdentifier: Collection<String>) {
    _vpcZoneIdentifier.addAll(vpcZoneIdentifier)
  }

  public fun build(): CfnAutoScalingGroup {
    if(_availabilityZones.isNotEmpty()) cdkBuilder.availabilityZones(_availabilityZones)
    if(_lifecycleHookSpecificationList.isNotEmpty())
        cdkBuilder.lifecycleHookSpecificationList(_lifecycleHookSpecificationList)
    if(_loadBalancerNames.isNotEmpty()) cdkBuilder.loadBalancerNames(_loadBalancerNames)
    if(_metricsCollection.isNotEmpty()) cdkBuilder.metricsCollection(_metricsCollection)
    if(_notificationConfigurations.isNotEmpty())
        cdkBuilder.notificationConfigurations(_notificationConfigurations)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    if(_targetGroupArns.isNotEmpty()) cdkBuilder.targetGroupArns(_targetGroupArns)
    if(_terminationPolicies.isNotEmpty()) cdkBuilder.terminationPolicies(_terminationPolicies)
    if(_vpcZoneIdentifier.isNotEmpty()) cdkBuilder.vpcZoneIdentifier(_vpcZoneIdentifier)
    return cdkBuilder.build()
  }
}
