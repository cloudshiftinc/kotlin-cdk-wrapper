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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.BounceActionConfig
import kotlin.String

@CdkDslMarker
public class BounceActionConfigDsl {
    private val cdkBuilder: BounceActionConfig.Builder = BounceActionConfig.builder()

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun sender(sender: String) {
        cdkBuilder.sender(sender)
    }

    public fun smtpReplyCode(smtpReplyCode: String) {
        cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun topicArn(topicArn: String) {
        cdkBuilder.topicArn(topicArn)
    }

    public fun build(): BounceActionConfig = cdkBuilder.build()
}
