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
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.AttachmentTargetType
import software.amazon.awscdk.services.secretsmanager.SecretAttachmentTargetProps

/**
 * Attachment target specifications.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.secretsmanager.*;
 * SecretAttachmentTargetProps secretAttachmentTargetProps = SecretAttachmentTargetProps.builder()
 * .targetId("targetId")
 * .targetType(AttachmentTargetType.RDS_DB_INSTANCE)
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretAttachmentTargetPropsDsl {
    private val cdkBuilder: SecretAttachmentTargetProps.Builder =
        SecretAttachmentTargetProps.builder()

    /** @param targetId The id of the target to attach the secret to. */
    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    /** @param targetType The type of the target to attach the secret to. */
    public fun targetType(targetType: AttachmentTargetType) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): SecretAttachmentTargetProps = cdkBuilder.build()
}
