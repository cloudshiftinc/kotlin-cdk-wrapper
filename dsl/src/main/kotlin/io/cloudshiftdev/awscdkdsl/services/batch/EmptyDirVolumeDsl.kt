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
import software.amazon.awscdk.Size
import software.amazon.awscdk.services.batch.EmptyDirMediumType
import software.amazon.awscdk.services.batch.EmptyDirVolume

/**
 * A Kubernetes EmptyDir volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.batch.*;
 * Size size;
 * EmptyDirVolume emptyDirVolume = EmptyDirVolume.Builder.create()
 * .name("name")
 * // the properties below are optional
 * .medium(EmptyDirMediumType.DISK)
 * .mountPath("mountPath")
 * .readonly(false)
 * .sizeLimit(size)
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
 */
@CdkDslMarker
public class EmptyDirVolumeDsl {
    private val cdkBuilder: EmptyDirVolume.Builder = EmptyDirVolume.Builder.create()

    /**
     * The storage type to use for this Volume.
     *
     * Default: `EmptyDirMediumType.DISK`
     *
     * @param medium The storage type to use for this Volume.
     */
    public fun medium(medium: EmptyDirMediumType) {
        cdkBuilder.medium(medium)
    }

    /**
     * The path on the container where the volume is mounted.
     *
     * Default: - the volume is not mounted
     *
     * @param mountPath The path on the container where the volume is mounted.
     */
    public fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
    }

    /**
     * The name of this volume.
     *
     * The name must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     *
     * @param name The name of this volume.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * If specified, the container has readonly access to the volume.
     *
     * Otherwise, the container has read/write access.
     *
     * Default: false
     *
     * @param readonly If specified, the container has readonly access to the volume.
     */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    /**
     * The maximum size for this Volume.
     *
     * Default: - no size limit
     *
     * @param sizeLimit The maximum size for this Volume.
     */
    public fun sizeLimit(sizeLimit: Size) {
        cdkBuilder.sizeLimit(sizeLimit)
    }

    public fun build(): EmptyDirVolume = cdkBuilder.build()
}
