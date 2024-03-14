package io.cloudshiftdev.awscdk.services.cognito

import kotlin.String
import kotlin.Unit

public interface UserInvitationConfig {
  public fun emailBody(): String? = unwrap(this).getEmailBody()

  public fun emailSubject(): String? = unwrap(this).getEmailSubject()

  public fun smsMessage(): String? = unwrap(this).getSmsMessage()

  public interface Builder {
    public fun emailBody(emailBody: String) {
    }

    public fun emailSubject(emailSubject: String) {
    }

    public fun smsMessage(smsMessage: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserInvitationConfig.Builder =
        software.amazon.awscdk.services.cognito.UserInvitationConfig.builder()

    public override fun emailBody(emailBody: String) {
      cdkBuilder.emailBody(emailBody)
    }

    public override fun emailSubject(emailSubject: String) {
      cdkBuilder.emailSubject(emailSubject)
    }

    public override fun smsMessage(smsMessage: String) {
      cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserInvitationConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cognito.UserInvitationConfig,
  ) : UserInvitationConfig {
    public override fun emailBody(): String? = unwrap(this).getEmailBody()

    public override fun emailSubject(): String? = unwrap(this).getEmailSubject()

    public override fun smsMessage(): String? = unwrap(this).getSmsMessage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): UserInvitationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserInvitationConfig):
        UserInvitationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserInvitationConfig):
        software.amazon.awscdk.services.cognito.UserInvitationConfig = (wrapped as
        Wrapper).cdkObject
  }
}
