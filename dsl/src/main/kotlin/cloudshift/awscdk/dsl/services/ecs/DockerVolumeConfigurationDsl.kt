@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.services.ecs.DockerVolumeConfiguration
import software.amazon.awscdk.services.ecs.Scope

/**
 * The configuration for a Docker volume.
 *
 * Docker volumes are only supported when you are using the EC2 launch type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * DockerVolumeConfiguration dockerVolumeConfiguration = DockerVolumeConfiguration.builder()
 * .driver("driver")
 * .scope(Scope.TASK)
 * // the properties below are optional
 * .autoprovision(false)
 * .driverOpts(Map.of(
 * "driverOptsKey", "driverOpts"))
 * .labels(Map.of(
 * "labelsKey", "labels"))
 * .build();
 * ```
 */
@CdkDslMarker
public class DockerVolumeConfigurationDsl {
    private val cdkBuilder: DockerVolumeConfiguration.Builder = DockerVolumeConfiguration.builder()

    /**
     * @param autoprovision Specifies whether the Docker volume should be created if it does not
     *   already exist. If true is specified, the Docker volume will be created for you.
     */
    public fun autoprovision(autoprovision: Boolean) {
        cdkBuilder.autoprovision(autoprovision)
    }

    /** @param driver The Docker volume driver to use. */
    public fun driver(driver: String) {
        cdkBuilder.driver(driver)
    }

    /** @param driverOpts A map of Docker driver-specific options passed through. */
    public fun driverOpts(driverOpts: Map<String, String>) {
        cdkBuilder.driverOpts(driverOpts)
    }

    /** @param labels Custom metadata to add to your Docker volume. */
    public fun labels(labels: Map<String, String>) {
        cdkBuilder.labels(labels)
    }

    /** @param scope The scope for the Docker volume that determines its lifecycle. */
    public fun scope(scope: Scope) {
        cdkBuilder.scope(scope)
    }

    public fun build(): DockerVolumeConfiguration = cdkBuilder.build()
}
