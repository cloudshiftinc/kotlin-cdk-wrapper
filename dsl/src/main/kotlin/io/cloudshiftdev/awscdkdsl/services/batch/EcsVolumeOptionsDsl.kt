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
import software.amazon.awscdk.services.batch.EcsVolumeOptions

/**
 * Options to configure an EcsVolume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EcsVolumeOptions ecsVolumeOptions = EcsVolumeOptions.builder()
 * .containerPath("containerPath")
 * .name("name")
 * // the properties below are optional
 * .readonly(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsVolumeOptionsDsl {
    private val cdkBuilder: EcsVolumeOptions.Builder = EcsVolumeOptions.builder()

    /** @param containerPath the path on the container where this volume is mounted. */
    public fun containerPath(containerPath: String) {
        cdkBuilder.containerPath(containerPath)
    }

    /** @param name the name of this volume. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param readonly if set, the container will have readonly access to the volume. */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    public fun build(): EcsVolumeOptions = cdkBuilder.build()
}
