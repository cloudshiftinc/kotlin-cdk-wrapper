package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface BounceActionConfig {
  /**
   * Human-readable text to include in the bounce message.
   */
  public fun message(): String

  /**
   * The email address of the sender of the bounced email.
   *
   * This is the address that the bounce message is sent from.
   */
  public fun sender(): String

  /**
   * The SMTP reply code, as defined by RFC 5321.
   */
  public fun smtpReplyCode(): String

  /**
   * The SMTP enhanced status code, as defined by RFC 3463.
   *
   * Default: - No status code.
   */
  public fun statusCode(): String? = unwrap(this).getStatusCode()

  /**
   * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is
   * taken.
   *
   * Default: - No notification is sent to SNS.
   */
  public fun topicArn(): String? = unwrap(this).getTopicArn()

  /**
   * A builder for [BounceActionConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param message Human-readable text to include in the bounce message. 
     */
    public fun message(message: String)

    /**
     * @param sender The email address of the sender of the bounced email. 
     * This is the address that the bounce message is sent from.
     */
    public fun sender(sender: String)

    /**
     * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
     */
    public fun smtpReplyCode(smtpReplyCode: String)

    /**
     * @param statusCode The SMTP enhanced status code, as defined by RFC 3463.
     */
    public fun statusCode(statusCode: String)

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * bounce action is taken.
     */
    public fun topicArn(topicArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.BounceActionConfig.Builder =
        software.amazon.awscdk.services.ses.BounceActionConfig.builder()

    /**
     * @param message Human-readable text to include in the bounce message. 
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    /**
     * @param sender The email address of the sender of the bounced email. 
     * This is the address that the bounce message is sent from.
     */
    override fun sender(sender: String) {
      cdkBuilder.sender(sender)
    }

    /**
     * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
     */
    override fun smtpReplyCode(smtpReplyCode: String) {
      cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    /**
     * @param statusCode The SMTP enhanced status code, as defined by RFC 3463.
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    /**
     * @param topicArn The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the
     * bounce action is taken.
     */
    override fun topicArn(topicArn: String) {
      cdkBuilder.topicArn(topicArn)
    }

    public fun build(): software.amazon.awscdk.services.ses.BounceActionConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.BounceActionConfig,
  ) : BounceActionConfig {
    /**
     * Human-readable text to include in the bounce message.
     */
    override fun message(): String = unwrap(this).getMessage()

    /**
     * The email address of the sender of the bounced email.
     *
     * This is the address that the bounce message is sent from.
     */
    override fun sender(): String = unwrap(this).getSender()

    /**
     * The SMTP reply code, as defined by RFC 5321.
     */
    override fun smtpReplyCode(): String = unwrap(this).getSmtpReplyCode()

    /**
     * The SMTP enhanced status code, as defined by RFC 3463.
     *
     * Default: - No status code.
     */
    override fun statusCode(): String? = unwrap(this).getStatusCode()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SNS topic to notify when the bounce action is
     * taken.
     *
     * Default: - No notification is sent to SNS.
     */
    override fun topicArn(): String? = unwrap(this).getTopicArn()
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
