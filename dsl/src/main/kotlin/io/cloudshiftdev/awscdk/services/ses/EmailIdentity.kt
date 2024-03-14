package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EmailIdentity internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.EmailIdentity,
) : Resource(cdkObject), IEmailIdentity {
  /**
   * The host name for the first token that you have to add to the DNS configurationfor your domain.
   */
  public open fun dkimDnsTokenName1(): String = unwrap(this).getDkimDnsTokenName1()

  /**
   * The host name for the second token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun dkimDnsTokenName2(): String = unwrap(this).getDkimDnsTokenName2()

  /**
   * The host name for the third token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun dkimDnsTokenName3(): String = unwrap(this).getDkimDnsTokenName3()

  /**
   * The record value for the first token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun dkimDnsTokenValue1(): String = unwrap(this).getDkimDnsTokenValue1()

  /**
   * The record value for the second token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun dkimDnsTokenValue2(): String = unwrap(this).getDkimDnsTokenValue2()

  /**
   * The record value for the third token that you have to add to the DNS configuration for your
   * domain.
   */
  public open fun dkimDnsTokenValue3(): String = unwrap(this).getDkimDnsTokenValue3()

  /**
   * DKIM records for this identity.
   */
  public open fun dkimRecords(): List<DkimRecord> =
      unwrap(this).getDkimRecords().map(DkimRecord::wrap)

  /**
   * The ARN of the email identity.
   */
  public override fun emailIdentityArn(): String = unwrap(this).getEmailIdentityArn()

  /**
   * The name of the email identity.
   */
  public override fun emailIdentityName(): String = unwrap(this).getEmailIdentityName()

  /**
   * Adds an IAM policy statement associated with this email identity to an IAM principal's policy.
   *
   * @param grantee the principal (no-op if undefined). 
   * @param actions the set of actions to allow. 
   */
  public override fun grant(grantee: IGrantable, actions: String): Grant =
      unwrap(this).grant(grantee.let(IGrantable::unwrap), actions).let(Grant::wrap)

  /**
   * Permits an IAM principal the send email action.
   *
   * Actions: SendEmail, SendRawEmail.
   *
   * @param grantee the principal to grant access to. 
   */
  public override fun grantSendEmail(grantee: IGrantable): Grant =
      unwrap(this).grantSendEmail(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.EmailIdentity].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The configuration set to associate with the email identity.
     *
     * Default: - do not use a specific configuration set
     *
     * @param configurationSet The configuration set to associate with the email identity. 
     */
    public fun configurationSet(configurationSet: IConfigurationSet)

    /**
     * The type of DKIM identity to use.
     *
     * Default: - Easy DKIM with a key length of 2048-bit
     *
     * @param dkimIdentity The type of DKIM identity to use. 
     */
    public fun dkimIdentity(dkimIdentity: DkimIdentity)

    /**
     * Whether the messages that are sent from the identity are signed using DKIM.
     *
     * Default: true
     *
     * @param dkimSigning Whether the messages that are sent from the identity are signed using
     * DKIM. 
     */
    public fun dkimSigning(dkimSigning: Boolean)

    /**
     * Whether to receive email notifications when bounce or complaint events occur.
     *
     * These notifications are sent to the address that you specified in the `Return-Path`
     * header of the original email.
     *
     * You're required to have a method of tracking bounces and complaints. If you haven't set
     * up another mechanism for receiving bounce or complaint notifications (for example, by
     * setting up an event destination), you receive an email notification when these events
     * occur (even if this setting is disabled).
     *
     * Default: true
     *
     * @param feedbackForwarding Whether to receive email notifications when bounce or complaint
     * events occur. 
     */
    public fun feedbackForwarding(feedbackForwarding: Boolean)

    /**
     * The email address or domain to verify.
     *
     * @param identity The email address or domain to verify. 
     */
    public fun identity(identity: Identity)

    /**
     * The action to take if the required MX record for the MAIL FROM domain isn't found when you
     * send an email.
     *
     * Default: MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE
     *
     * @param mailFromBehaviorOnMxFailure The action to take if the required MX record for the MAIL
     * FROM domain isn't found when you send an email. 
     */
    public fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure)

    /**
     * The custom MAIL FROM domain that you want the verified identity to use.
     *
     * The MAIL FROM domain
     * must meet the following criteria:
     *
     * * It has to be a subdomain of the verified identity
     * * It can't be used to receive email
     * * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback
     * forwarding emails
     *
     * Default: - use amazonses.com
     *
     * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to use.
     * 
     */
    public fun mailFromDomain(mailFromDomain: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.EmailIdentity.Builder =
        software.amazon.awscdk.services.ses.EmailIdentity.Builder.create(scope, id)

    /**
     * The configuration set to associate with the email identity.
     *
     * Default: - do not use a specific configuration set
     *
     * @param configurationSet The configuration set to associate with the email identity. 
     */
    override fun configurationSet(configurationSet: IConfigurationSet) {
      cdkBuilder.configurationSet(configurationSet.let(IConfigurationSet::unwrap))
    }

    /**
     * The type of DKIM identity to use.
     *
     * Default: - Easy DKIM with a key length of 2048-bit
     *
     * @param dkimIdentity The type of DKIM identity to use. 
     */
    override fun dkimIdentity(dkimIdentity: DkimIdentity) {
      cdkBuilder.dkimIdentity(dkimIdentity.let(DkimIdentity::unwrap))
    }

    /**
     * Whether the messages that are sent from the identity are signed using DKIM.
     *
     * Default: true
     *
     * @param dkimSigning Whether the messages that are sent from the identity are signed using
     * DKIM. 
     */
    override fun dkimSigning(dkimSigning: Boolean) {
      cdkBuilder.dkimSigning(dkimSigning)
    }

    /**
     * Whether to receive email notifications when bounce or complaint events occur.
     *
     * These notifications are sent to the address that you specified in the `Return-Path`
     * header of the original email.
     *
     * You're required to have a method of tracking bounces and complaints. If you haven't set
     * up another mechanism for receiving bounce or complaint notifications (for example, by
     * setting up an event destination), you receive an email notification when these events
     * occur (even if this setting is disabled).
     *
     * Default: true
     *
     * @param feedbackForwarding Whether to receive email notifications when bounce or complaint
     * events occur. 
     */
    override fun feedbackForwarding(feedbackForwarding: Boolean) {
      cdkBuilder.feedbackForwarding(feedbackForwarding)
    }

    /**
     * The email address or domain to verify.
     *
     * @param identity The email address or domain to verify. 
     */
    override fun identity(identity: Identity) {
      cdkBuilder.identity(identity.let(Identity::unwrap))
    }

    /**
     * The action to take if the required MX record for the MAIL FROM domain isn't found when you
     * send an email.
     *
     * Default: MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE
     *
     * @param mailFromBehaviorOnMxFailure The action to take if the required MX record for the MAIL
     * FROM domain isn't found when you send an email. 
     */
    override
        fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure) {
      cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure.let(MailFromBehaviorOnMxFailure::unwrap))
    }

    /**
     * The custom MAIL FROM domain that you want the verified identity to use.
     *
     * The MAIL FROM domain
     * must meet the following criteria:
     *
     * * It has to be a subdomain of the verified identity
     * * It can't be used to receive email
     * * It can't be used in a "From" address if the MAIL FROM domain is a destination for feedback
     * forwarding emails
     *
     * Default: - use amazonses.com
     *
     * @param mailFromDomain The custom MAIL FROM domain that you want the verified identity to use.
     * 
     */
    override fun mailFromDomain(mailFromDomain: String) {
      cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): software.amazon.awscdk.services.ses.EmailIdentity = cdkBuilder.build()
  }

  public companion object {
    public fun fromEmailIdentityName(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      emailIdentityName: String,
    ): IEmailIdentity =
        software.amazon.awscdk.services.ses.EmailIdentity.fromEmailIdentityName(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, emailIdentityName).let(IEmailIdentity::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EmailIdentity {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EmailIdentity(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EmailIdentity): EmailIdentity =
        EmailIdentity(cdkObject)

    internal fun unwrap(wrapped: EmailIdentity): software.amazon.awscdk.services.ses.EmailIdentity =
        wrapped.cdkObject
  }
}
