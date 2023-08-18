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

package io.cloudshiftdev.awscdkdsl.services.secretsmanager

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps

/**
 * Construction properties for an AttachedSecret.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Secret secret;
 * ISecretAttachmentTarget secretAttachmentTarget;
 * SecretTargetAttachmentProps secretTargetAttachmentProps = SecretTargetAttachmentProps.builder()
 * .secret(secret)
 * .target(secretAttachmentTarget)
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretTargetAttachmentPropsDsl {
    private val cdkBuilder: SecretTargetAttachmentProps.Builder =
        SecretTargetAttachmentProps.builder()

    /** @param secret The secret to attach to the target. */
    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    /** @param target The target to attach the secret to. */
    public fun target(target: ISecretAttachmentTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): SecretTargetAttachmentProps = cdkBuilder.build()
}
