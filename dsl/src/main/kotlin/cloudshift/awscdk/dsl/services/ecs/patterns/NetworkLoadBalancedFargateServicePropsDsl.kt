@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import cloudshift.awscdk.dsl.services.ecs.CapacityProviderStrategyDsl
import cloudshift.awscdk.dsl.services.ecs.CloudMapOptionsDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentCircuitBreakerDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentControllerDsl
import cloudshift.awscdk.dsl.services.ecs.RuntimePlatformDsl
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.FargatePlatformVersion
import software.amazon.awscdk.services.ecs.FargateTaskDefinition
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.RuntimePlatform
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedFargateServiceProps
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedServiceRecordType
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancer
import software.amazon.awscdk.services.route53.IHostedZone

@CdkDslMarker
public class NetworkLoadBalancedFargateServicePropsDsl {
  private val cdkBuilder: NetworkLoadBalancedFargateServiceProps.Builder =
      NetworkLoadBalancedFargateServiceProps.builder()

  private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

  public fun assignPublicIp(assignPublicIp: Boolean) {
    cdkBuilder.assignPublicIp(assignPublicIp)
  }

  public
      fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
    _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
  }

  public
      fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
    _capacityProviderStrategies.addAll(capacityProviderStrategies)
  }

  public fun circuitBreaker(block: DeploymentCircuitBreakerDsl.() -> Unit = {}) {
    val builder = DeploymentCircuitBreakerDsl()
    builder.apply(block)
    cdkBuilder.circuitBreaker(builder.build())
  }

  public fun circuitBreaker(circuitBreaker: DeploymentCircuitBreaker) {
    cdkBuilder.circuitBreaker(circuitBreaker)
  }

  public fun cloudMapOptions(block: CloudMapOptionsDsl.() -> Unit = {}) {
    val builder = CloudMapOptionsDsl()
    builder.apply(block)
    cdkBuilder.cloudMapOptions(builder.build())
  }

  public fun cloudMapOptions(cloudMapOptions: CloudMapOptions) {
    cdkBuilder.cloudMapOptions(cloudMapOptions)
  }

  public fun cluster(cluster: ICluster) {
    cdkBuilder.cluster(cluster)
  }

  public fun cpu(cpu: Number) {
    cdkBuilder.cpu(cpu)
  }

  public fun deploymentController(block: DeploymentControllerDsl.() -> Unit = {}) {
    val builder = DeploymentControllerDsl()
    builder.apply(block)
    cdkBuilder.deploymentController(builder.build())
  }

  public fun deploymentController(deploymentController: DeploymentController) {
    cdkBuilder.deploymentController(deploymentController)
  }

  public fun desiredCount(desiredCount: Number) {
    cdkBuilder.desiredCount(desiredCount)
  }

  public fun domainName(domainName: String) {
    cdkBuilder.domainName(domainName)
  }

  public fun domainZone(domainZone: IHostedZone) {
    cdkBuilder.domainZone(domainZone)
  }

  public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
    cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
  }

  public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
    cdkBuilder.enableExecuteCommand(enableExecuteCommand)
  }

  public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
    cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
  }

  public fun listenerPort(listenerPort: Number) {
    cdkBuilder.listenerPort(listenerPort)
  }

  public fun loadBalancer(loadBalancer: INetworkLoadBalancer) {
    cdkBuilder.loadBalancer(loadBalancer)
  }

  public fun maxHealthyPercent(maxHealthyPercent: Number) {
    cdkBuilder.maxHealthyPercent(maxHealthyPercent)
  }

  public fun memoryLimitMiB(memoryLimitMiB: Number) {
    cdkBuilder.memoryLimitMiB(memoryLimitMiB)
  }

  public fun minHealthyPercent(minHealthyPercent: Number) {
    cdkBuilder.minHealthyPercent(minHealthyPercent)
  }

  public fun platformVersion(platformVersion: FargatePlatformVersion) {
    cdkBuilder.platformVersion(platformVersion)
  }

  public fun propagateTags(propagateTags: PropagatedTagSource) {
    cdkBuilder.propagateTags(propagateTags)
  }

  public fun publicLoadBalancer(publicLoadBalancer: Boolean) {
    cdkBuilder.publicLoadBalancer(publicLoadBalancer)
  }

  public fun recordType(recordType: NetworkLoadBalancedServiceRecordType) {
    cdkBuilder.recordType(recordType)
  }

  public fun runtimePlatform(block: RuntimePlatformDsl.() -> Unit = {}) {
    val builder = RuntimePlatformDsl()
    builder.apply(block)
    cdkBuilder.runtimePlatform(builder.build())
  }

  public fun runtimePlatform(runtimePlatform: RuntimePlatform) {
    cdkBuilder.runtimePlatform(runtimePlatform)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun taskDefinition(taskDefinition: FargateTaskDefinition) {
    cdkBuilder.taskDefinition(taskDefinition)
  }

  public fun taskImageOptions(block: NetworkLoadBalancedTaskImageOptionsDsl.() -> Unit = {}) {
    val builder = NetworkLoadBalancedTaskImageOptionsDsl()
    builder.apply(block)
    cdkBuilder.taskImageOptions(builder.build())
  }

  public fun taskImageOptions(taskImageOptions: NetworkLoadBalancedTaskImageOptions) {
    cdkBuilder.taskImageOptions(taskImageOptions)
  }

  public fun taskSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.taskSubnets(builder.build())
  }

  public fun taskSubnets(taskSubnets: SubnetSelection) {
    cdkBuilder.taskSubnets(taskSubnets)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): NetworkLoadBalancedFargateServiceProps {
    if(_capacityProviderStrategies.isNotEmpty())
        cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
    return cdkBuilder.build()
  }
}
