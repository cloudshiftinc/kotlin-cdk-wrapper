@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.ses.DkimIdentity
import software.amazon.awscdk.services.ses.EmailIdentityProps
import software.amazon.awscdk.services.ses.IConfigurationSet
import software.amazon.awscdk.services.ses.Identity
import software.amazon.awscdk.services.ses.MailFromBehaviorOnMxFailure

@CdkDslMarker
public class EmailIdentityPropsDsl {
  private val cdkBuilder: EmailIdentityProps.Builder = EmailIdentityProps.builder()

  /**
   * @param configurationSet The configuration set to associate with the email identity.
   */
  public fun configurationSet(configurationSet: IConfigurationSet) {
    cdkBuilder.configurationSet(configurationSet)
  }

  /**
   * @param dkimIdentity The type of DKIM identity to use.
   */
  public fun dkimIdentity(dkimIdentity: DkimIdentity) {
    cdkBuilder.dkimIdentity(dkimIdentity)
  }

  /**
   * @param dkimSigning Whether the messages that are sent from the identity are signed using DKIM.
   */
  public fun dkimSigning(dkimSigning: Boolean) {
    cdkBuilder.dkimSigning(dkimSigning)
  }

  /**
   * @param feedbackForwarding Whether to receive email notifications when bounce or complaint
   * events occur.
   * These notifications are sent to the address that you specified in the `Return-Path`
   * header of the original email.
   *
   * You're required to have a method of tracking bounces and complaints. If you haven't set
   * up another mechanism for receiving bounce or complaint notifications (for example, by
   * setting up an event destination), you receive an email notification when these events
   * occur (even if this setting is disabled).
   */
  public fun feedbackForwarding(feedbackForwarding: Boolean) {
    cdkBuilder.feedbackForwarding(feedbackForwarding)
  }

  /**
   * @param identity The email address or domain to verify. 
   */
  public fun identity(identity: Identity) {
    cdkBuilder.identity(identity)
  }

  /**
   * @param mailFromBehaviorOnMxFailure The action to take if the required MX record for the MAIL
   * FROM domain isn't found when you send an email.
   */
  public fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure) {
    cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure)
  }

  /**
   * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to use.
   * The MAIL FROM domain
   * must meet the following criteria:
   *
   * * It has to be a subdomain of the verified identity
   * * It can't be used to receive email
   * * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback
   * forwarding emails
   */
  public fun mailFromDomain(mailFromDomain: String) {
    cdkBuilder.mailFromDomain(mailFromDomain)
  }

  public fun build(): EmailIdentityProps = cdkBuilder.build()
}
