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
import software.amazon.awscdk.services.lightsail.CfnContainer
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnContainerHealthCheckConfigPropertyDsl {
    private val cdkBuilder: CfnContainer.HealthCheckConfigProperty.Builder =
        CfnContainer.HealthCheckConfigProperty.builder()

    public fun healthyThreshold(healthyThreshold: Number) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public fun intervalSeconds(intervalSeconds: Number) {
        cdkBuilder.intervalSeconds(intervalSeconds)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun successCodes(successCodes: String) {
        cdkBuilder.successCodes(successCodes)
    }

    public fun timeoutSeconds(timeoutSeconds: Number) {
        cdkBuilder.timeoutSeconds(timeoutSeconds)
    }

    public fun unhealthyThreshold(unhealthyThreshold: Number) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): CfnContainer.HealthCheckConfigProperty = cdkBuilder.build()
}
