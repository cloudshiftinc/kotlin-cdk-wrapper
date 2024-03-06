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
import software.amazon.awscdk.services.batch.HostPathVolume

/**
 * A Kubernetes HostPath volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * HostPathVolume hostPathVolume = HostPathVolume.Builder.create()
 * .hostPath("hostPath")
 * .name("name")
 * // the properties below are optional
 * .mountPath("mountPath")
 * .readonly(false)
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
 */
@CdkDslMarker
public class HostPathVolumeDsl {
    private val cdkBuilder: HostPathVolume.Builder = HostPathVolume.Builder.create()

    /**
     * The path of the file or directory on the host to mount into containers on the pod.
     *
     * *Note*: HothPath Volumes present many security risks, and should be avoided when possible.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#hostpath)
     *
     * @param hostPath The path of the file or directory on the host to mount into containers on the
     *   pod.
     */
    public fun hostPath(hostPath: String) {
        cdkBuilder.hostPath(hostPath)
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

    public fun build(): HostPathVolume = cdkBuilder.build()
}
