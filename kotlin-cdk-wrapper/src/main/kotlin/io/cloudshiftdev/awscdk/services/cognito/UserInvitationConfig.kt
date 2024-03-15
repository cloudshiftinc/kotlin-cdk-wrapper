@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface UserInvitationConfig {
  public fun emailBody(): String? = unwrap(this).getEmailBody()

  public fun emailSubject(): String? = unwrap(this).getEmailSubject()

  public fun smsMessage(): String? = unwrap(this).getSmsMessage()

  @CdkDslMarker
  public interface Builder {
    public fun emailBody(emailBody: String)

    public fun emailSubject(emailSubject: String)

    public fun smsMessage(smsMessage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.UserInvitationConfig.Builder =
        software.amazon.awscdk.services.cognito.UserInvitationConfig.builder()

    override fun emailBody(emailBody: String) {
      cdkBuilder.emailBody(emailBody)
    }

    override fun emailSubject(emailSubject: String) {
      cdkBuilder.emailSubject(emailSubject)
    }

    override fun smsMessage(smsMessage: String) {
      cdkBuilder.smsMessage(smsMessage)
    }

    public fun build(): software.amazon.awscdk.services.cognito.UserInvitationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.UserInvitationConfig,
  ) : CdkObject(cdkObject), UserInvitationConfig {
    override fun emailBody(): String? = unwrap(this).getEmailBody()

    override fun emailSubject(): String? = unwrap(this).getEmailSubject()

    override fun smsMessage(): String? = unwrap(this).getSmsMessage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserInvitationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.UserInvitationConfig):
        UserInvitationConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserInvitationConfig):
        software.amazon.awscdk.services.cognito.UserInvitationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cognito.UserInvitationConfig
  }
}
