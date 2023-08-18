@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.ses

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.DkimIdentity
import software.amazon.awscdk.services.ses.EmailIdentity
import software.amazon.awscdk.services.ses.IConfigurationSet
import software.amazon.awscdk.services.ses.Identity
import software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure
import software.constructs.Construct

/**
 * An email identity.
 *
 * Example:
 * ```
 * IPublicHostedZone myHostedZone;
 * EmailIdentity identity = EmailIdentity.Builder.create(this, "Identity")
 * .identity(Identity.publicHostedZone(myHostedZone))
 * .mailFromDomain("mail.cdk.dev")
 * .build();
 * ```
 */
@CdkDslMarker
public class EmailIdentityDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: EmailIdentity.Builder = EmailIdentity.Builder.create(scope, id)

    /**
     * The configuration set to associate with the email identity.
     *
     * Default: - do not use a specific configuration set
     *
     * @param configurationSet The configuration set to associate with the email identity.
     */
    public fun configurationSet(configurationSet: IConfigurationSet) {
        cdkBuilder.configurationSet(configurationSet)
    }

    /**
     * The type of DKIM identity to use.
     *
     * Default: - Easy DKIM with a key length of 2048-bit
     *
     * @param dkimIdentity The type of DKIM identity to use.
     */
    public fun dkimIdentity(dkimIdentity: DkimIdentity) {
        cdkBuilder.dkimIdentity(dkimIdentity)
    }

    /**
     * Whether the messages that are sent from the identity are signed using DKIM.
     *
     * Default: true
     *
     * @param dkimSigning Whether the messages that are sent from the identity are signed using
     *   DKIM.
     */
    public fun dkimSigning(dkimSigning: Boolean) {
        cdkBuilder.dkimSigning(dkimSigning)
    }

    /**
     * Whether to receive email notifications when bounce or complaint events occur.
     *
     * These notifications are sent to the address that you specified in the `Return-Path` header of
     * the original email.
     *
     * You're required to have a method of tracking bounces and complaints. If you haven't set up
     * another mechanism for receiving bounce or complaint notifications (for example, by setting up
     * an event destination), you receive an email notification when these events occur (even if
     * this setting is disabled).
     *
     * Default: true
     *
     * @param feedbackForwarding Whether to receive email notifications when bounce or complaint
     *   events occur.
     */
    public fun feedbackForwarding(feedbackForwarding: Boolean) {
        cdkBuilder.feedbackForwarding(feedbackForwarding)
    }

    /**
     * The email address or domain to verify.
     *
     * @param identity The email address or domain to verify.
     */
    public fun identity(identity: Identity) {
        cdkBuilder.identity(identity)
    }

    /**
     * The action to take if the required MX record for the MAIL FROM domain isn't found when you
     * send an email.
     *
     * Default: MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE
     *
     * @param mailFromBehaviorOnMxFailure The action to take if the required MX record for the MAIL
     *   FROM domain isn't found when you send an email.
     */
    public fun mailFromBehaviorOnMxFailure(
        mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure
    ) {
        cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure)
    }

    /**
     * The custom MAIL FROM domain that you want the verified identity to use.
     *
     * The MAIL FROM domain must meet the following criteria:
     * * It has to be a subdomain of the verified identity
     * * It can't be used to receive email
     * * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback
     *   forwarding emails
     *
     * Default: - use amazonses.com
     *
     * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to use.
     */
    public fun mailFromDomain(mailFromDomain: String) {
        cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): EmailIdentity = cdkBuilder.build()
}
