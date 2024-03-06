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
import software.amazon.awscdk.services.batch.EmptyDirVolumeOptions

/**
 * Options for a Kubernetes EmptyDir volume.
 *
 * Example:
 * ```
 * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
 * .container(EksContainerDefinition.Builder.create(this, "container")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
 * .name("myEmptyDirVolume")
 * .mountPath("/mount/path")
 * .medium(EmptyDirMediumType.MEMORY)
 * .readonly(true)
 * .sizeLimit(Size.mebibytes(2048))
 * .build())))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#emptydir)
 */
@CdkDslMarker
public class EmptyDirVolumeOptionsDsl {
    private val cdkBuilder: EmptyDirVolumeOptions.Builder = EmptyDirVolumeOptions.builder()

    /** @param medium The storage type to use for this Volume. */
    public fun medium(medium: EmptyDirMediumType) {
        cdkBuilder.medium(medium)
    }

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

    /** @param sizeLimit The maximum size for this Volume. */
    public fun sizeLimit(sizeLimit: Size) {
        cdkBuilder.sizeLimit(sizeLimit)
    }

    public fun build(): EmptyDirVolumeOptions = cdkBuilder.build()
}
