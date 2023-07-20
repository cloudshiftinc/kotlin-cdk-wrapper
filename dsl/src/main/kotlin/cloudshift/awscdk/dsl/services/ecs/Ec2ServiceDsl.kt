@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.Ec2Service
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import software.amazon.awscdk.services.ecs.TaskDefinition
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class Ec2ServiceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: Ec2Service.Builder = Ec2Service.Builder.create(scope, id)

    private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

    public fun assignPublicIp(assignPublicIp: Boolean) {
        cdkBuilder.assignPublicIp(assignPublicIp)
    }

    public fun capacityProviderStrategies(capacityProviderStrategies: CapacityProviderStrategyDsl.() -> Unit) {
        _capacityProviderStrategies.add(CapacityProviderStrategyDsl().apply(capacityProviderStrategies).build())
    }

    public fun capacityProviderStrategies(capacityProviderStrategies: Collection<CapacityProviderStrategy>) {
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

    public fun daemon(daemon: Boolean) {
        cdkBuilder.daemon(daemon)
    }

    public fun deploymentAlarms(block: DeploymentAlarmConfigDsl.() -> Unit = {}) {
        val builder = DeploymentAlarmConfigDsl()
        builder.apply(block)
        cdkBuilder.deploymentAlarms(builder.build())
    }

    public fun deploymentAlarms(deploymentAlarms: DeploymentAlarmConfig) {
        cdkBuilder.deploymentAlarms(deploymentAlarms)
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

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public fun healthCheckGracePeriod(healthCheckGracePeriod: Duration) {
        cdkBuilder.healthCheckGracePeriod(healthCheckGracePeriod)
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
        cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
        cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public fun placementConstraints(vararg placementConstraints: PlacementConstraint) {
        _placementConstraints.addAll(listOf(*placementConstraints))
    }

    public fun placementConstraints(placementConstraints: Collection<PlacementConstraint>) {
        _placementConstraints.addAll(placementConstraints)
    }

    public fun placementStrategies(vararg placementStrategies: PlacementStrategy) {
        _placementStrategies.addAll(listOf(*placementStrategies))
    }

    public fun placementStrategies(placementStrategies: Collection<PlacementStrategy>) {
        _placementStrategies.addAll(placementStrategies)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
    }

    public fun securityGroups(vararg securityGroups: ISecurityGroup) {
        _securityGroups.addAll(listOf(*securityGroups))
    }

    public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
        _securityGroups.addAll(securityGroups)
    }

    public fun serviceConnectConfiguration(block: ServiceConnectPropsDsl.() -> Unit = {}) {
        val builder = ServiceConnectPropsDsl()
        builder.apply(block)
        cdkBuilder.serviceConnectConfiguration(builder.build())
    }

    public fun serviceConnectConfiguration(serviceConnectConfiguration: ServiceConnectProps) {
        cdkBuilder.serviceConnectConfiguration(serviceConnectConfiguration)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun taskDefinition(taskDefinition: TaskDefinition) {
        cdkBuilder.taskDefinition(taskDefinition)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): Ec2Service {
        if (_capacityProviderStrategies.isNotEmpty()) {
            cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
        }
        if (_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
        return cdkBuilder.build()
    }
}
