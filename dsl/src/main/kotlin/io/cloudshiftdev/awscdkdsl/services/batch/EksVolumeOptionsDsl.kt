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
import software.amazon.awscdk.services.batch.EksVolumeOptions

/**
 * Options to configure an EksVolume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * EksVolumeOptions eksVolumeOptions = EksVolumeOptions.builder()
 * .name("name")
 * // the properties below are optional
 * .mountPath("mountPath")
 * .readonly(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class EksVolumeOptionsDsl {
    private val cdkBuilder: EksVolumeOptions.Builder = EksVolumeOptions.builder()

    /** @param mountPath The path on the container where the volume is mounted. */
    public fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
    }

    /** @param name The name of this volume. The name must be a valid DNS subdomain name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param readonly If specified, the container has readonly access to the volume. Otherwise, the
     *   container has read/write access.
     */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    public fun build(): EksVolumeOptions = cdkBuilder.build()
}
