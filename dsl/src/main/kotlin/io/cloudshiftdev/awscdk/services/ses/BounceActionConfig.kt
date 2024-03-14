package io.cloudshiftdev.awscdk.services.ses

import kotlin.String
import kotlin.Unit

public interface BounceActionConfig {
  public fun message(): String

  public fun sender(): String

  public fun smtpReplyCode(): String

  public fun statusCode(): String? = unwrap(this).getStatusCode()

  public fun topicArn(): String? = unwrap(this).getTopicArn()

  public interface Builder {
    public fun message(message: String) {
    }

    public fun sender(sender: String) {
    }

    public fun smtpReplyCode(smtpReplyCode: String) {
    }

    public fun statusCode(statusCode: String) {
    }

    public fun topicArn(topicArn: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.BounceActionConfig.Builder =
        software.amazon.awscdk.services.ses.BounceActionConfig.builder()

    public override fun message(message: String) {
      cdkBuilder.message(message)
    }

    public override fun sender(sender: String) {
      cdkBuilder.sender(sender)
    }

    public override fun smtpReplyCode(smtpReplyCode: String) {
      cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    public override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.BounceActionConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.BounceActionConfig,
  ) : BounceActionConfig {
    public override fun message(): String = unwrap(this).getMessage()

    public override fun sender(): String = unwrap(this).getSender()

    public override fun smtpReplyCode(): String = unwrap(this).getSmtpReplyCode()

    public override fun statusCode(): String? = unwrap(this).getStatusCode()

    public override fun topicArn(): String? = unwrap(this).getTopicArn()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BounceActionConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.BounceActionConfig):
        BounceActionConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BounceActionConfig):
        software.amazon.awscdk.services.ses.BounceActionConfig = (wrapped as Wrapper).cdkObject
  }
}
