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

package cloudshift.awscdk.dsl.services.ecs.patterns

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.applicationautoscaling.ScalingIntervalDsl
import cloudshift.awscdk.dsl.services.ecs.CapacityProviderStrategyDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentCircuitBreakerDsl
import cloudshift.awscdk.dsl.services.ecs.DeploymentControllerDsl
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.applicationautoscaling.ScalingInterval
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.PlacementConstraint
import software.amazon.awscdk.services.ecs.PlacementStrategy
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.QueueProcessingEc2ServiceProps
import software.amazon.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class QueueProcessingEc2ServicePropsDsl {
    private val cdkBuilder: QueueProcessingEc2ServiceProps.Builder =
        QueueProcessingEc2ServiceProps.builder()

    private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

    private val _command: MutableList<String> = mutableListOf()

    private val _placementConstraints: MutableList<PlacementConstraint> = mutableListOf()

    private val _placementStrategies: MutableList<PlacementStrategy> = mutableListOf()

    private val _scalingSteps: MutableList<ScalingInterval> = mutableListOf()

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

    public fun cluster(cluster: ICluster) {
        cdkBuilder.cluster(cluster)
    }

    public fun command(vararg command: String) {
        _command.addAll(listOf(*command))
    }

    public fun command(command: Collection<String>) {
        _command.addAll(command)
    }

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
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

    public fun enableEcsManagedTags(enableEcsManagedTags: Boolean) {
        cdkBuilder.enableEcsManagedTags(enableEcsManagedTags)
    }

    public fun enableExecuteCommand(enableExecuteCommand: Boolean) {
        cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    public fun enableLogging(enableLogging: Boolean) {
        cdkBuilder.enableLogging(enableLogging)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    public fun gpuCount(gpuCount: Number) {
        cdkBuilder.gpuCount(gpuCount)
    }

    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
        cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public fun maxReceiveCount(maxReceiveCount: Number) {
        cdkBuilder.maxReceiveCount(maxReceiveCount)
    }

    public fun maxScalingCapacity(maxScalingCapacity: Number) {
        cdkBuilder.maxScalingCapacity(maxScalingCapacity)
    }

    public fun memoryLimitMiB(memoryLimitMiB: Number) {
        cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    public fun memoryReservationMiB(memoryReservationMiB: Number) {
        cdkBuilder.memoryReservationMiB(memoryReservationMiB)
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
        cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public fun minScalingCapacity(minScalingCapacity: Number) {
        cdkBuilder.minScalingCapacity(minScalingCapacity)
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

    public fun queue(queue: IQueue) {
        cdkBuilder.queue(queue)
    }

    public fun retentionPeriod(retentionPeriod: Duration) {
        cdkBuilder.retentionPeriod(retentionPeriod)
    }

    public fun scalingSteps(scalingSteps: ScalingIntervalDsl.() -> Unit) {
        _scalingSteps.add(ScalingIntervalDsl().apply(scalingSteps).build())
    }

    public fun scalingSteps(scalingSteps: Collection<ScalingInterval>) {
        _scalingSteps.addAll(scalingSteps)
    }

    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun visibilityTimeout(visibilityTimeout: Duration) {
        cdkBuilder.visibilityTimeout(visibilityTimeout)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): QueueProcessingEc2ServiceProps {
        if (_capacityProviderStrategies.isNotEmpty()) {
            cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
        }
        if (_command.isNotEmpty()) cdkBuilder.command(_command)
        if (_placementConstraints.isNotEmpty()) cdkBuilder.placementConstraints(_placementConstraints)
        if (_placementStrategies.isNotEmpty()) cdkBuilder.placementStrategies(_placementStrategies)
        if (_scalingSteps.isNotEmpty()) cdkBuilder.scalingSteps(_scalingSteps)
        return cdkBuilder.build()
    }
}
