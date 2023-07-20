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
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import kotlin.String

@CdkDslMarker
public class CfnEmailIdentityMailFromAttributesPropertyDsl {
    private val cdkBuilder: CfnEmailIdentity.MailFromAttributesProperty.Builder =
        CfnEmailIdentity.MailFromAttributesProperty.builder()

    public fun behaviorOnMxFailure(behaviorOnMxFailure: String) {
        cdkBuilder.behaviorOnMxFailure(behaviorOnMxFailure)
    }

    public fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): CfnEmailIdentity.MailFromAttributesProperty = cdkBuilder.build()
}
