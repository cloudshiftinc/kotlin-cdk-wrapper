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
import software.amazon.awscdk.services.batch.HostVolume

/**
 * Creates a Host volume.
 *
 * This volume will persist on the host at the specified `hostPath`. If the `hostPath` is not
 * specified, Docker will choose the host path. In this case, the data may not persist after the
 * containers that use it stop running.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * HostVolume hostVolume = HostVolume.Builder.create()
 * .containerPath("containerPath")
 * .name("name")
 * // the properties below are optional
 * .hostPath("hostPath")
 * .readonly(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class HostVolumeDsl {
    private val cdkBuilder: HostVolume.Builder = HostVolume.Builder.create()

    /**
     * the path on the container where this volume is mounted.
     *
     * @param containerPath the path on the container where this volume is mounted.
     */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /**
     * The path on the host machine this container will have access to.
     *
     * Default: - Docker will choose the host path. The data may not persist after the containers
     * that use it stop running.
     *
     * @param hostPath The path on the host machine this container will have access to.
     */
    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
    }

    /**
     * the name of this volume.
     *
     * @param name the name of this volume.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * if set, the container will have readonly access to the volume.
     *
     * Default: false
     *
     * @param readonly if set, the container will have readonly access to the volume.
     */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    public fun build(): HostVolume = cdkBuilder.build()
}
