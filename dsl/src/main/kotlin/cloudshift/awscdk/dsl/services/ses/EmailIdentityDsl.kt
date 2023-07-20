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
import software.amazon.awscdk.services.ses.DkimIdentity
import software.amazon.awscdk.services.ses.EmailIdentity
import software.amazon.awscdk.services.ses.IConfigurationSet
import software.amazon.awscdk.services.ses.Identity
import software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class EmailIdentityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EmailIdentity.Builder = EmailIdentity.Builder.create(scope, id)

    public fun configurationSet(configurationSet: IConfigurationSet) {
        cdkBuilder.configurationSet(configurationSet)
    }

    public fun dkimIdentity(dkimIdentity: DkimIdentity) {
        cdkBuilder.dkimIdentity(dkimIdentity)
    }

    public fun dkimSigning(dkimSigning: Boolean) {
        cdkBuilder.dkimSigning(dkimSigning)
    }

    public fun feedbackForwarding(feedbackForwarding: Boolean) {
        cdkBuilder.feedbackForwarding(feedbackForwarding)
    }

    public fun identity(identity: Identity) {
        cdkBuilder.identity(identity)
    }

    public fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure) {
        cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure)
    }

    public fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): EmailIdentity = cdkBuilder.build()
}
