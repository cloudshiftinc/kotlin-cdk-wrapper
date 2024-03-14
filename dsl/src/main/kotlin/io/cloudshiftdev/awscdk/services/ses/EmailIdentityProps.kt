package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface EmailIdentityProps {
  /**
   * The configuration set to associate with the email identity.
   *
   * Default: - do not use a specific configuration set
   */
  public fun configurationSet(): IConfigurationSet? =
      unwrap(this).getConfigurationSet()?.let(IConfigurationSet::wrap)

  /**
   * The type of DKIM identity to use.
   *
   * Default: - Easy DKIM with a key length of 2048-bit
   */
  public fun dkimIdentity(): DkimIdentity? = unwrap(this).getDkimIdentity()?.let(DkimIdentity::wrap)

  /**
   * Whether the messages that are sent from the identity are signed using DKIM.
   *
   * Default: true
   */
  public fun dkimSigning(): Boolean? = unwrap(this).getDkimSigning()

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
   */
  public fun feedbackForwarding(): Boolean? = unwrap(this).getFeedbackForwarding()

  /**
   * The email address or domain to verify.
   */
  public fun identity(): Identity

  /**
   * The action to take if the required MX record for the MAIL FROM domain isn't found when you send
   * an email.
   *
   * Default: MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE
   */
  public fun mailFromBehaviorOnMxFailure(): MailFromBehaviorOnMxFailure? =
      unwrap(this).getMailFromBehaviorOnMxFailure()?.let(MailFromBehaviorOnMxFailure::wrap)

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
   */
  public fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()

  /**
   * A builder for [EmailIdentityProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configurationSet The configuration set to associate with the email identity.
     */
    public fun configurationSet(configurationSet: IConfigurationSet)

    /**
     * @param dkimIdentity The type of DKIM identity to use.
     */
    public fun dkimIdentity(dkimIdentity: DkimIdentity)

    /**
     * @param dkimSigning Whether the messages that are sent from the identity are signed using
     * DKIM.
     */
    public fun dkimSigning(dkimSigning: Boolean)

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
    public fun feedbackForwarding(feedbackForwarding: Boolean)

    /**
     * @param identity The email address or domain to verify. 
     */
    public fun identity(identity: Identity)

    /**
     * @param mailFromBehaviorOnMxFailure The action to take if the required MX record for the MAIL
     * FROM domain isn't found when you send an email.
     */
    public fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure)

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
    public fun mailFromDomain(mailFromDomain: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.EmailIdentityProps.Builder =
        software.amazon.awscdk.services.ses.EmailIdentityProps.builder()

    /**
     * @param configurationSet The configuration set to associate with the email identity.
     */
    override fun configurationSet(configurationSet: IConfigurationSet) {
      cdkBuilder.configurationSet(configurationSet.let(IConfigurationSet::unwrap))
    }

    /**
     * @param dkimIdentity The type of DKIM identity to use.
     */
    override fun dkimIdentity(dkimIdentity: DkimIdentity) {
      cdkBuilder.dkimIdentity(dkimIdentity.let(DkimIdentity::unwrap))
    }

    /**
     * @param dkimSigning Whether the messages that are sent from the identity are signed using
     * DKIM.
     */
    override fun dkimSigning(dkimSigning: Boolean) {
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
    override fun feedbackForwarding(feedbackForwarding: Boolean) {
      cdkBuilder.feedbackForwarding(feedbackForwarding)
    }

    /**
     * @param identity The email address or domain to verify. 
     */
    override fun identity(identity: Identity) {
      cdkBuilder.identity(identity.let(Identity::unwrap))
    }

    /**
     * @param mailFromBehaviorOnMxFailure The action to take if the required MX record for the MAIL
     * FROM domain isn't found when you send an email.
     */
    override
        fun mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure: MailFromBehaviorOnMxFailure) {
      cdkBuilder.mailFromBehaviorOnMxFailure(mailFromBehaviorOnMxFailure.let(MailFromBehaviorOnMxFailure::unwrap))
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
    override fun mailFromDomain(mailFromDomain: String) {
      cdkBuilder.mailFromDomain(mailFromDomain)
    }

    public fun build(): software.amazon.awscdk.services.ses.EmailIdentityProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.EmailIdentityProps,
  ) : CdkObject(cdkObject), EmailIdentityProps {
    /**
     * The configuration set to associate with the email identity.
     *
     * Default: - do not use a specific configuration set
     */
    override fun configurationSet(): IConfigurationSet? =
        unwrap(this).getConfigurationSet()?.let(IConfigurationSet::wrap)

    /**
     * The type of DKIM identity to use.
     *
     * Default: - Easy DKIM with a key length of 2048-bit
     */
    override fun dkimIdentity(): DkimIdentity? =
        unwrap(this).getDkimIdentity()?.let(DkimIdentity::wrap)

    /**
     * Whether the messages that are sent from the identity are signed using DKIM.
     *
     * Default: true
     */
    override fun dkimSigning(): Boolean? = unwrap(this).getDkimSigning()

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
     */
    override fun feedbackForwarding(): Boolean? = unwrap(this).getFeedbackForwarding()

    /**
     * The email address or domain to verify.
     */
    override fun identity(): Identity = unwrap(this).getIdentity().let(Identity::wrap)

    /**
     * The action to take if the required MX record for the MAIL FROM domain isn't found when you
     * send an email.
     *
     * Default: MailFromBehaviorOnMxFailure.USE_DEFAULT_VALUE
     */
    override fun mailFromBehaviorOnMxFailure(): MailFromBehaviorOnMxFailure? =
        unwrap(this).getMailFromBehaviorOnMxFailure()?.let(MailFromBehaviorOnMxFailure::wrap)

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
     */
    override fun mailFromDomain(): String? = unwrap(this).getMailFromDomain()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EmailIdentityProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EmailIdentityProps):
        EmailIdentityProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EmailIdentityProps):
        software.amazon.awscdk.services.ses.EmailIdentityProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.EmailIdentityProps
  }
}
