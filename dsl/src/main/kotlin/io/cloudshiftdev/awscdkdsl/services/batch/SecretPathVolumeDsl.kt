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
import software.amazon.awscdk.services.batch.SecretPathVolume

/**
 * Specifies the configuration of a Kubernetes secret volume.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * SecretPathVolume secretPathVolume = SecretPathVolume.Builder.create()
 * .name("name")
 * .secretName("secretName")
 * // the properties below are optional
 * .mountPath("mountPath")
 * .optional(false)
 * .readonly(false)
 * .build();
 * ```
 *
 * [Documentation](https://kubernetes.io/docs/concepts/storage/volumes/#secret)
 */
@CdkDslMarker
public class SecretPathVolumeDsl {
    private val cdkBuilder: SecretPathVolume.Builder = SecretPathVolume.Builder.create()

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
     * Specifies whether the secret or the secret's keys must be defined.
     *
     * Default: true
     *
     * @param optional Specifies whether the secret or the secret's keys must be defined.
     */
    public fun optional(optional: Boolean) {
        cdkBuilder.optional(optional)
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
     * The name of the secret.
     *
     * Must be a valid DNS subdomain name.
     *
     * [Documentation](https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#dns-subdomain-names)
     *
     * @param secretName The name of the secret.
     */
    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): SecretPathVolume = cdkBuilder.build()
}
