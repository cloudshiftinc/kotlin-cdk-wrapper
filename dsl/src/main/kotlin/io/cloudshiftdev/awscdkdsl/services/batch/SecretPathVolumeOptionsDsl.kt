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
import software.amazon.awscdk.services.batch.SecretPathVolumeOptions

/**
 * Options for a Kubernetes SecretPath Volume.
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
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#secret)
 */
@CdkDslMarker
public class SecretPathVolumeOptionsDsl {
    private val cdkBuilder: SecretPathVolumeOptions.Builder = SecretPathVolumeOptions.builder()

    /** @param mountPath The path on the container where the volume is mounted. */
    public fun mountPath(mountPath: String) {
        cdkBuilder.mountPath(mountPath)
    }

    /** @param name The name of this volume. The name must be a valid DNS subdomain name. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param optional Specifies whether the secret or the secret's keys must be defined. */
    public fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
    }

    /**
     * @param readonly If specified, the container has readonly access to the volume. Otherwise, the
     *   container has read/write access.
     */
    public fun readonly(readonly: Boolean) {
        cdkBuilder.readonly(readonly)
    }

    /** @param secretName The name of the secret. Must be a valid DNS subdomain name. */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): SecretPathVolumeOptions = cdkBuilder.build()
}
