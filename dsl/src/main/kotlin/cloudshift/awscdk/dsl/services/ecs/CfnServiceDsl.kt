@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnService
import software.constructs.Construct

@CdkDslMarker
public class CfnServiceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnService.Builder = CfnService.Builder.create(scope, id)

  private val _capacityProviderStrategy: MutableList<Any> = mutableListOf()

  private val _loadBalancers: MutableList<Any> = mutableListOf()

  private val _placementConstraints: MutableList<Any> = mutableListOf()

  private val _placementStrategies: MutableList<Any> = mutableListOf()

  private val _serviceRegistries: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun capacityProviderStrategy(vararg capacityProviderStrategy: Any) {
    _capacityProviderStrategy.addAll(listOf(*capacityProviderStrategy))
  }

  public fun capacityProviderStrategy(capacityProviderStrategy: Collection<Any>) {
    _capacityProviderStrategy.addAll(capacityProviderStrategy)
  }

  public fun capacityProviderStrategy(capacityProviderStrategy: IResolvable) {
    cdkBuilder.capacityProviderStrategy(capacityProviderStrategy)
  }

  public fun cluster(cluster: String) {
    cdkBuilder.cluster(cluster)
  }

  public fun deploymentConfiguration(deploymentConfiguration: IResolvable) {
    cdkBuilder.deploymentConfiguration(deploymentConfiguration)
  }

  public
      fun deploymentConfiguration(deploymentConfiguration: CfnService.DeploymentConfigurationProperty) {
    cdkBuilder.deploymentConfiguration(deploymentConfiguration)
  }

  public fun deploymentController(deploymentController: IResolvable) {
    cdkBuilder.deploymentController(deploymentController)
  }

  public fun deploymentController(deploymentController: CfnService.DeploymentControllerProperty) {
    cdkBuilder.deploymentController(deploymentController)
  }

  public fun desiredCount(desiredCount: Number) {
    cdkBuilder.desiredCount(desiredCount)
  }

  public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  public fun enableEcsManagedTags(enableEcsManagedTags: IResolvable) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  public fun enableExecuteCommand(enableExecuteCommand: IResolvable) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  public fun healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds: Number) {
    cdkBuilder.healthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds)
  }

  public fun launchType(launchType: String) {
    cdkBuilder.launchType(launchType)
  }

  public fun loadBalancers(vararg loadBalancers: Any) {
    _loadBalancers.addAll(listOf(*loadBalancers))
  }

  public fun loadBalancers(loadBalancers: Collection<Any>) {
    _loadBalancers.addAll(loadBalancers)
  }

  public fun loadBalancers(loadBalancers: IResolvable) {
    cdkBuilder.loadBalancers(loadBalancers)
  }

  public fun networkConfiguration(networkConfiguration: IResolvable) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public fun networkConfiguration(networkConfiguration: CfnService.NetworkConfigurationProperty) {
    cdkBuilder.networkConfiguration(networkConfiguration)
  }

  public fun placementConstraints(vararg placementConstraints: Any) {
    _placementConstraints.addAll(listOf(*placementConstraints))
  }

  public fun placementConstraints(placementConstraints: Collection<Any>) {
    _placementConstraints.addAll(placementConstraints)
  }

  public fun placementConstraints(placementConstraints: IResolvable) {
    cdkBuilder.placementConstraints(placementConstraints)
  }

  public fun placementStrategies(vararg placementStrategies: Any) {
    _placementStrategies.addAll(listOf(*placementStrategies))
  }

  public fun placementStrategies(placementStrategies: Collection<Any>) {
    _placementStrategies.addAll(placementStrategies)
  }

  public fun placementStrategies(placementStrategies: IResolvable) {
    cdkBuilder.placementStrategies(placementStrategies)
  }

  public fun platformVersion(platformVersion: String) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun propagateTags(propagateTags: String) {
    cdkBuilder.propagateTags(propagateTags)
  }

  public fun role(role: String) {
    cdkBuilder.role(role)
  }

  public fun schedulingStrategy(schedulingStrategy: String) {
    cdkBuilder.schedulingStrategy(schedulingStrategy)
  }

  public fun serviceConnectConfiguration(serviceConnectConfiguration: IResolvable) {
    cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
  }

  public
      fun serviceConnectConfiguration(serviceConnectConfiguration: CfnService.ServiceConnectConfigurationProperty) {
    cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun serviceRegistries(vararg serviceRegistries: Any) {
    _serviceRegistries.addAll(listOf(*serviceRegistries))
  }

  public fun serviceRegistries(serviceRegistries: Collection<Any>) {
    _serviceRegistries.addAll(serviceRegistries)
  }

  public fun serviceRegistries(serviceRegistries: IResolvable) {
    cdkBuilder.serviceRegistries(serviceRegistries)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun taskDefinition(taskDefinition: String) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun build(): CfnService {
    if(_capacityProviderStrategy.isNotEmpty())
        cdkBuilder.capacityProviderStrategy(_capacityProviderStrategy)
    if(_loadBalancers.isNotEmpty()) cdkBuilder.loadBalancers(_loadBalancers)
    if(_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
    if(_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
    if(_serviceRegistries.isNotEmpty()) cdkBuilder.serviceRegistries(_serviceRegistries)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
