package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface UserVerificationConfig {
  /**
   * The email body template for the verification email sent to the user upon sign up.
   *
   * See
   * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
   * to
   * learn more about message templates.
   *
   * Default: - 'The verification code to your new account is {####}' if VerificationEmailStyle.CODE
   * is chosen,
   * 'Verify your account by clicking on {##Verify Email##}' if VerificationEmailStyle.LINK is
   * chosen.
   */
  public fun emailBody(): String? = unwrap(this).getEmailBody()

  /**
   * Emails can be verified either using a code or a link.
   *
   * Learn more at
   * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-email-verification-message-customization.html
   *
   * Default: VerificationEmailStyle.CODE
   */
  public fun emailStyle(): VerificationEmailStyle? =
      unwrap(this).getEmailStyle()?.let(VerificationEmailStyle::wrap)

  /**
   * The email subject template for the verification email sent to the user upon sign up.
   *
   * See
   * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
   * to
   * learn more about message templates.
   *
   * Default: 'Verify your new account'
   */
  public fun emailSubject(): String? = unwrap(this).getEmailSubject()

  /**
   * The message template for the verification SMS sent to the user upon sign up.
   *
   * See
   * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
   * to
   * learn more about message templates.
   *
   * Default: - 'The verification code to your new account is {####}' if VerificationEmailStyle.CODE
   * is chosen,
   * not configured if VerificationEmailStyle.LINK is chosen
   */
  public fun smsMessage(): String? = unwrap(this).getSmsMessage()

  /**
   * A builder for [UserVerificationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param emailBody The email body template for the verification email sent to the user upon
     * sign up.
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     */
    public fun emailBody(emailBody: String)

    /**
     * @param emailStyle Emails can be verified either using a code or a link.
     * Learn more at
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-email-verification-message-customization.html
     */
    public fun emailStyle(emailStyle: VerificationEmailStyle)

    /**
     * @param emailSubject The email subject template for the verification email sent to the user
     * upon sign up.
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     */
    public fun emailSubject(emailSubject: String)

    /**
     * @param smsMessage The message template for the verification SMS sent to the user upon sign
     * up.
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     */
    public fun smsMessage(smsMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserVerificationConfig.Builder =
        software.amazon.awscdk.services.cognito.UserVerificationConfig.builder()

    /**
     * @param emailBody The email body template for the verification email sent to the user upon
     * sign up.
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     */
    override fun emailBody(emailBody: String) {
      cdkBuilder.emailBody(emailBody)
    }

    /**
     * @param emailStyle Emails can be verified either using a code or a link.
     * Learn more at
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-email-verification-message-customization.html
     */
    override fun emailStyle(emailStyle: VerificationEmailStyle) {
      cdkBuilder.emailStyle(emailStyle.let(VerificationEmailStyle::unwrap))
    }

    /**
     * @param emailSubject The email subject template for the verification email sent to the user
     * upon sign up.
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     */
    override fun emailSubject(emailSubject: String) {
      cdkBuilder.emailSubject(emailSubject)
    }

    /**
     * @param smsMessage The message template for the verification SMS sent to the user upon sign
     * up.
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     */
    override fun smsMessage(smsMessage: String) {
      cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserVerificationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserVerificationConfig,
  ) : UserVerificationConfig {
    /**
     * The email body template for the verification email sent to the user upon sign up.
     *
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     *
     * Default: - 'The verification code to your new account is {####}' if
     * VerificationEmailStyle.CODE is chosen,
     * 'Verify your account by clicking on {##Verify Email##}' if VerificationEmailStyle.LINK is
     * chosen.
     */
    override fun emailBody(): String? = unwrap(this).getEmailBody()

    /**
     * Emails can be verified either using a code or a link.
     *
     * Learn more at
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-email-verification-message-customization.html
     *
     * Default: VerificationEmailStyle.CODE
     */
    override fun emailStyle(): VerificationEmailStyle? =
        unwrap(this).getEmailStyle()?.let(VerificationEmailStyle::wrap)

    /**
     * The email subject template for the verification email sent to the user upon sign up.
     *
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     *
     * Default: 'Verify your new account'
     */
    override fun emailSubject(): String? = unwrap(this).getEmailSubject()

    /**
     * The message template for the verification SMS sent to the user upon sign up.
     *
     * See
     * https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pool-settings-message-templates.html
     * to
     * learn more about message templates.
     *
     * Default: - 'The verification code to your new account is {####}' if
     * VerificationEmailStyle.CODE is chosen,
     * not configured if VerificationEmailStyle.LINK is chosen
     */
    override fun smsMessage(): String? = unwrap(this).getSmsMessage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserVerificationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserVerificationConfig):
        UserVerificationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserVerificationConfig):
        software.amazon.awscdk.services.cognito.UserVerificationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
