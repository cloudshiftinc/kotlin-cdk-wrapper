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

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions
import software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget

/**
 * Options to add a secret attachment to a secret.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * ISecretAttachmentTarget secretAttachmentTarget;
 * AttachedSecretOptions attachedSecretOptions = AttachedSecretOptions.builder()
 * .target(secretAttachmentTarget)
 * .build();
 * ```
 */
@CdkDslMarker
public class AttachedSecretOptionsDsl {
    private val cdkBuilder: AttachedSecretOptions.Builder = AttachedSecretOptions.builder()

    /** @param target The target to attach the secret to. */
    public fun target(target: ISecretAttachmentTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): AttachedSecretOptions = cdkBuilder.build()
}
