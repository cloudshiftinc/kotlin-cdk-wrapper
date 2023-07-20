@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget
import software.amazon.awscdk.services.secretsmanager.SecretTargetAttachmentProps

@CdkDslMarker
public class SecretTargetAttachmentPropsDsl {
    private val cdkBuilder: SecretTargetAttachmentProps.Builder =
        SecretTargetAttachmentProps.builder()

    public fun secret(secret: ISecret) {
        cdkBuilder.secret(secret)
    }

    public fun target(target: ISecretAttachmentTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): SecretTargetAttachmentProps = cdkBuilder.build()
}
