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

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.cognito.CfnUserPoolRiskConfigurationAttachment
import kotlin.String

@CdkDslMarker
public class CfnUserPoolRiskConfigurationAttachmentNotifyEmailTypePropertyDsl {
    private val cdkBuilder: CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.Builder =
        CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty.builder()

    public fun htmlBody(htmlBody: String) {
        cdkBuilder.htmlBody(htmlBody)
    }

    public fun subject(subject: String) {
        cdkBuilder.subject(subject)
    }

    public fun textBody(textBody: String) {
        cdkBuilder.textBody(textBody)
    }

    public fun build(): CfnUserPoolRiskConfigurationAttachment.NotifyEmailTypeProperty =
        cdkBuilder.build()
}
