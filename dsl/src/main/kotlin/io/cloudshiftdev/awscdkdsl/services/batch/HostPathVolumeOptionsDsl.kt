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
import software.amazon.awscdk.services.batch.HostPathVolumeOptions

/**
 * Options for a kubernetes HostPath volume.
 *
 * Example:
 * ```
 * EksJobDefinition jobDefn;
 * jobDefn.container.addVolume(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
 * .name("emptyDir")
 * .mountPath("/Volumes/emptyDir")
 * .build()));
 * jobDefn.container.addVolume(EksVolume.hostPath(HostPathVolumeOptions.builder()
 * .name("hostPath")
 * .hostPath("/sys")
 * .mountPath("/Volumes/hostPath")
 * .build()));
 * jobDefn.container.addVolume(EksVolume.secret(SecretPathVolumeOptions.builder()
 * .name("secret")
 * .optional(true)
 * .mountPath("/Volumes/secret")
 * .secretName("mySecret")
 * .build()));
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
 */
@CdkDslMarker
public class HostPathVolumeOptionsDsl {
    private val cdkBuilder: HostPathVolumeOptions.Builder = HostPathVolumeOptions.builder()

    /**
     * @param hostPath The path of the file or directory on the host to mount into containers on the
     *   pod. *Note*: HothPath Volumes present many security risks, and should be avoided when
     *   possible.
     */
    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
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

    public fun build(): HostPathVolumeOptions = cdkBuilder.build()
}
