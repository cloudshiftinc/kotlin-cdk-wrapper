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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ecs.CfnTaskDefinition
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnTaskDefinitionDockerVolumeConfigurationPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.DockerVolumeConfigurationProperty.Builder =
        CfnTaskDefinition.DockerVolumeConfigurationProperty.builder()

    public fun autoprovision(autoprovision: Boolean) {
        cdkBuilder.autoprovision(autoprovision)
    }

    public fun autoprovision(autoprovision: IResolvable) {
        cdkBuilder.autoprovision(autoprovision)
    }

    public fun driver(driver: String) {
        cdkBuilder.driver(driver)
    }

    public fun driverOpts(driverOpts: Map<String, String>) {
        cdkBuilder.driverOpts(driverOpts)
    }

    public fun driverOpts(driverOpts: IResolvable) {
        cdkBuilder.driverOpts(driverOpts)
    }

    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    public fun labels(labels: IResolvable) {
        cdkBuilder.labels(labels)
    }

    public fun scope(scope: String) {
        cdkBuilder.scope(scope)
    }

    public fun build(): CfnTaskDefinition.DockerVolumeConfigurationProperty = cdkBuilder.build()
}
