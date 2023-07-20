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
import software.amazon.awscdk.services.cognito.UserVerificationConfig
import software.amazon.awscdk.services.cognito.VerificationEmailStyle
import kotlin.String

@CdkDslMarker
public class UserVerificationConfigDsl {
    private val cdkBuilder: UserVerificationConfig.Builder = UserVerificationConfig.builder()

    public fun emailBody(emailBody: String) {
        cdkBuilder.emailBody(emailBody)
    }

    public fun emailStyle(emailStyle: VerificationEmailStyle) {
        cdkBuilder.emailStyle(emailStyle)
    }

    public fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
    }

    public fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): UserVerificationConfig = cdkBuilder.build()
}
