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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnContainerPublicEndpointPropertyDsl {
    private val cdkBuilder: CfnContainer.PublicEndpointProperty.Builder =
        CfnContainer.PublicEndpointProperty.builder()

    public fun containerName(containerName: String) {
        cdkBuilder.containerName(containerName)
    }

    public fun containerPort(containerPort: Number) {
        cdkBuilder.containerPort(containerPort)
    }

    public fun healthCheckConfig(healthCheckConfig: IResolvable) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    public fun healthCheckConfig(healthCheckConfig: CfnContainer.HealthCheckConfigProperty) {
        cdkBuilder.healthCheckConfig(healthCheckConfig)
    }

    public fun build(): CfnContainer.PublicEndpointProperty = cdkBuilder.build()
}
