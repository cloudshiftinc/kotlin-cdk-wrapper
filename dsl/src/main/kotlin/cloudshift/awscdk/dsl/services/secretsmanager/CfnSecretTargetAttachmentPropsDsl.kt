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
import software.amazon.awscdk.services.secretsmanager.CfnSecretTargetAttachmentProps
import kotlin.String

@CdkDslMarker
public class CfnSecretTargetAttachmentPropsDsl {
    private val cdkBuilder: CfnSecretTargetAttachmentProps.Builder =
        CfnSecretTargetAttachmentProps.builder()

    public fun secretId(secretId: String) {
        cdkBuilder.secretId(secretId)
    }

    public fun targetId(targetId: String) {
        cdkBuilder.targetId(targetId)
    }

    public fun targetType(targetType: String) {
        cdkBuilder.targetType(targetType)
    }

    public fun build(): CfnSecretTargetAttachmentProps = cdkBuilder.build()
}
