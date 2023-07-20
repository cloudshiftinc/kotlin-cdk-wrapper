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
import software.amazon.awscdk.services.cognito.CfnUserPool
import kotlin.String

@CdkDslMarker
public class CfnUserPoolInviteMessageTemplatePropertyDsl {
    private val cdkBuilder: CfnUserPool.InviteMessageTemplateProperty.Builder =
        CfnUserPool.InviteMessageTemplateProperty.builder()

    public fun emailMessage(emailMessage: String) {
        cdkBuilder.emailMessage(emailMessage)
    }

    public fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
    }

    public fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): CfnUserPool.InviteMessageTemplateProperty = cdkBuilder.build()
}
