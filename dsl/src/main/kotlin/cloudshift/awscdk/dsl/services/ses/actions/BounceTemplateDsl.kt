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

package cloudshift.awscdk.dsl.services.ses.actions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.actions.BounceTemplate
import kotlin.String

@CdkDslMarker
public class BounceTemplateDsl {
    private val cdkBuilder: BounceTemplate.Builder = BounceTemplate.Builder.create()

    public fun message(message: String) {
        cdkBuilder.message(message)
    }

    public fun smtpReplyCode(smtpReplyCode: String) {
        cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): BounceTemplate = cdkBuilder.build()
}
