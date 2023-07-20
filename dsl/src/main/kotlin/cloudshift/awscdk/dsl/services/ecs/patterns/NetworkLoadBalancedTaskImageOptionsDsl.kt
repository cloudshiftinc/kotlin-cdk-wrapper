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
import software.amazon.awscdk.services.ecs.ContainerImage
import software.amazon.awscdk.services.ecs.LogDriver
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.patterns.NetworkLoadBalancedTaskImageOptions
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class NetworkLoadBalancedTaskImageOptionsDsl {
    private val cdkBuilder: NetworkLoadBalancedTaskImageOptions.Builder =
        NetworkLoadBalancedTaskImageOptions.builder()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun dockerLabels(dockerLabels: Map<String, String>) {
        cdkBuilder.dockerLabels(dockerLabels)
    }

    public fun enableLogging(enableLogging: Boolean) {
        cdkBuilder.enableLogging(enableLogging)
    }

    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    public fun executionRole(executionRole: IRole) {
        cdkBuilder.executionRole(executionRole)
    }

    public fun family(family: String) {
        cdkBuilder.family(family)
    }

    public fun image(image: ContainerImage) {
        cdkBuilder.image(image)
    }

    public fun logDriver(logDriver: LogDriver) {
        cdkBuilder.logDriver(logDriver)
    }

    public fun secrets(secrets: Map<String, Secret>) {
        cdkBuilder.secrets(secrets)
    }

    public fun taskRole(taskRole: IRole) {
        cdkBuilder.taskRole(taskRole)
    }

    public fun build(): NetworkLoadBalancedTaskImageOptions = cdkBuilder.build()
}
