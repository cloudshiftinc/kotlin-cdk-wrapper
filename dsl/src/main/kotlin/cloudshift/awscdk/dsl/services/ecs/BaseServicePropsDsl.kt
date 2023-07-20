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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.BaseServiceProps
import software.amazon.awscdk.services.ecs.CapacityProviderStrategy
import software.amazon.awscdk.services.ecs.CloudMapOptions
import software.amazon.awscdk.services.ecs.DeploymentAlarmConfig
import software.amazon.awscdk.services.ecs.DeploymentCircuitBreaker
import software.amazon.awscdk.services.ecs.DeploymentController
import software.amazon.awscdk.services.ecs.ICluster
import software.amazon.awscdk.services.ecs.LaunchType
import software.amazon.awscdk.services.ecs.PropagatedTagSource
import software.amazon.awscdk.services.ecs.ServiceConnectProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class BaseServicePropsDsl {
    private val cdkBuilder: BaseServiceProps.Builder = BaseServiceProps.builder()

    private val _capacityProviderStrategies: MutableList<CapacityProviderStrategy> = mutableListOf()

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

    public fun launchType(launchType: LaunchType) {
        cdkBuilder.launchType(launchType)
    }

    public fun maxHealthyPercent(maxHealthyPercent: Number) {
        cdkBuilder.maxHealthyPercent(maxHealthyPercent)
    }

    public fun minHealthyPercent(minHealthyPercent: Number) {
        cdkBuilder.minHealthyPercent(minHealthyPercent)
    }

    public fun propagateTags(propagateTags: PropagatedTagSource) {
        cdkBuilder.propagateTags(propagateTags)
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

    public fun build(): BaseServiceProps {
        if (_capacityProviderStrategies.isNotEmpty()) {
            cdkBuilder.capacityProviderStrategies(_capacityProviderStrategies)
        }
        return cdkBuilder.build()
    }
}
