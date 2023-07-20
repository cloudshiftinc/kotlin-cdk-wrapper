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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnEmailIdentityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnEmailIdentity.Builder = CfnEmailIdentity.Builder.create(scope, id)

    public fun configurationSetAttributes(configurationSetAttributes: IResolvable) {
        cdkBuilder.configurationSetAttributes(configurationSetAttributes)
    }

    public fun configurationSetAttributes(configurationSetAttributes: CfnEmailIdentity.ConfigurationSetAttributesProperty) {
        cdkBuilder.configurationSetAttributes(configurationSetAttributes)
    }

    public fun dkimAttributes(dkimAttributes: IResolvable) {
        cdkBuilder.dkimAttributes(dkimAttributes)
    }

    public fun dkimAttributes(dkimAttributes: CfnEmailIdentity.DkimAttributesProperty) {
        cdkBuilder.dkimAttributes(dkimAttributes)
    }

    public fun dkimSigningAttributes(dkimSigningAttributes: IResolvable) {
        cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
    }

    public fun dkimSigningAttributes(dkimSigningAttributes: CfnEmailIdentity.DkimSigningAttributesProperty) {
        cdkBuilder.dkimSigningAttributes(dkimSigningAttributes)
    }

    public fun emailIdentity(emailIdentity: String) {
        cdkBuilder.emailIdentity(emailIdentity)
    }

    public fun feedbackAttributes(feedbackAttributes: IResolvable) {
        cdkBuilder.feedbackAttributes(feedbackAttributes)
    }

    public fun feedbackAttributes(feedbackAttributes: CfnEmailIdentity.FeedbackAttributesProperty) {
        cdkBuilder.feedbackAttributes(feedbackAttributes)
    }

    public fun mailFromAttributes(mailFromAttributes: IResolvable) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    public fun mailFromAttributes(mailFromAttributes: CfnEmailIdentity.MailFromAttributesProperty) {
        cdkBuilder.mailFromAttributes(mailFromAttributes)
    }

    public fun build(): CfnEmailIdentity = cdkBuilder.build()
}
