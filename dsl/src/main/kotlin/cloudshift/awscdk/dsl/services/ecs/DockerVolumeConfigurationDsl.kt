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
import software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
import software.amazon.awscdk.services.ecs.Scope
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class DockerVolumeConfigurationDsl {
    private val cdkBuilder: DockerVolumeConfiguration.Builder = DockerVolumeConfiguration.builder()

    public fun autoprovision(autoprovision: Boolean) {
        cdkBuilder.autoprovision(autoprovision)
    }

    public fun driver(driver: String) {
        cdkBuilder.driver(driver)
    }

    public fun driverOpts(driverOpts: Map<String, String>) {
        cdkBuilder.driverOpts(driverOpts)
    }

    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    public fun scope(scope: Scope) {
        cdkBuilder.scope(scope)
    }

    public fun build(): DockerVolumeConfiguration = cdkBuilder.build()
}
