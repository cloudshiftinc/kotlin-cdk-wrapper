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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ecs.BaseMountPoint

/**
 * The base details of where a volume will be mounted within a container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * BaseMountPoint baseMountPoint = BaseMountPoint.builder()
 * .containerPath("containerPath")
 * .readOnly(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class BaseMountPointDsl {
    private val cdkBuilder: BaseMountPoint.Builder = BaseMountPoint.builder()

    /** @param containerPath The path on the container to mount the host volume at. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /**
     * @param readOnly Specifies whether to give the container read-only access to the volume. If
     *   this value is true, the container has read-only access to the volume. If this value is
     *   false, then the container can write to the volume.
     */
    public fun readOnly(readOnly: Boolean) {
        cdkBuilder.readOnly(readOnly)
    }

    public fun build(): BaseMountPoint = cdkBuilder.build()
}
