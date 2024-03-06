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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.batch.HostVolumeOptions

/**
 * Options for configuring an ECS HostVolume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * HostVolumeOptions hostVolumeOptions = HostVolumeOptions.builder()
 * .containerPath("containerPath")
 * .name("name")
 * // the properties below are optional
 * .hostPath("hostPath")
 * .readonly(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class HostVolumeOptionsDsl {
    private val cdkBuilder: HostVolumeOptions.Builder = HostVolumeOptions.builder()

    /** @param containerPath the path on the container where this volume is mounted. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /** @param hostPath The path on the host machine this container will have access to. */
    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
    }

    /** @param name the name of this volume. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param readonly if set, the container will have readonly access to the volume. */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    public fun build(): HostVolumeOptions = cdkBuilder.build()
}
