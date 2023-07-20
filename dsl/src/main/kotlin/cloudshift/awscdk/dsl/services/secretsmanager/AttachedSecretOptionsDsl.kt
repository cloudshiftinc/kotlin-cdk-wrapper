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
import software.amazon.awscdk.services.secretsmanager.AttachedSecretOptions
import software.amazon.awscdk.services.secretsmanager.ISecretAttachmentTarget

@CdkDslMarker
public class AttachedSecretOptionsDsl {
    private val cdkBuilder: AttachedSecretOptions.Builder = AttachedSecretOptions.builder()

    public fun target(target: ISecretAttachmentTarget) {
        cdkBuilder.target(target)
    }

    public fun build(): AttachedSecretOptions = cdkBuilder.build()
}
