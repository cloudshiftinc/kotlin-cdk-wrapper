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
import software.amazon.awscdk.services.cognito.EmailSettings
import kotlin.String

@CdkDslMarker
public class EmailSettingsDsl {
    private val cdkBuilder: EmailSettings.Builder = EmailSettings.builder()

    public fun from(from: String) {
        cdkBuilder.from(from)
    }

    public fun replyTo(replyTo: String) {
        cdkBuilder.replyTo(replyTo)
    }

    public fun build(): EmailSettings = cdkBuilder.build()
}
