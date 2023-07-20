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
import software.amazon.awscdk.services.cognito.UserInvitationConfig
import kotlin.String

@CdkDslMarker
public class UserInvitationConfigDsl {
    private val cdkBuilder: UserInvitationConfig.Builder = UserInvitationConfig.builder()

    public fun emailBody(emailBody: String) {
        cdkBuilder.emailBody(emailBody)
    }

    public fun emailSubject(emailSubject: String) {
        cdkBuilder.emailSubject(emailSubject)
    }

    public fun smsMessage(smsMessage: String) {
        cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): UserInvitationConfig = cdkBuilder.build()
}
