package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit

public interface UserVerificationConfig {
  public fun emailBody(): String? = unwrap(this).getEmailBody()

  public fun emailStyle(): VerificationEmailStyle? =
      unwrap(this).getEmailStyle()?.let(VerificationEmailStyle::wrap)

  public fun emailSubject(): String? = unwrap(this).getEmailSubject()

  public fun smsMessage(): String? = unwrap(this).getSmsMessage()

  public interface Builder {
    public fun emailBody(emailBody: String)

    public fun emailStyle(emailStyle: VerificationEmailStyle)

    public fun emailSubject(emailSubject: String)

    public fun smsMessage(smsMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserVerificationConfig.Builder =
        software.amazon.awscdk.services.cognito.UserVerificationConfig.builder()

    override fun emailBody(emailBody: String) {
      cdkBuilder.emailBody(emailBody)
    }

    override fun emailStyle(emailStyle: VerificationEmailStyle) {
      cdkBuilder.emailStyle(emailStyle.let(VerificationEmailStyle::unwrap))
    }

    override fun emailSubject(emailSubject: String) {
      cdkBuilder.emailSubject(emailSubject)
    }

    override fun smsMessage(smsMessage: String) {
      cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserVerificationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserVerificationConfig,
  ) : UserVerificationConfig {
    override fun emailBody(): String? = unwrap(this).getEmailBody()

    override fun emailStyle(): VerificationEmailStyle? =
        unwrap(this).getEmailStyle()?.let(VerificationEmailStyle::wrap)

    override fun emailSubject(): String? = unwrap(this).getEmailSubject()

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
