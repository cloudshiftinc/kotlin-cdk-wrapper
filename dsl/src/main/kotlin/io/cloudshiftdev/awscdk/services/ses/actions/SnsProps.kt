package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface SnsProps {
  /**
   * The encoding to use for the email within the Amazon SNS notification.
   *
   * Default: UTF-8
   */
  public fun encoding(): EmailEncoding? = unwrap(this).getEncoding()?.let(EmailEncoding::wrap)

  /**
   * The SNS topic to notify.
   */
  public fun topic(): ITopic

  /**
   * A builder for [SnsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encoding The encoding to use for the email within the Amazon SNS notification.
     */
    public fun encoding(encoding: EmailEncoding)

    /**
     * @param topic The SNS topic to notify. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.SnsProps.Builder =
        software.amazon.awscdk.services.ses.actions.SnsProps.builder()

    /**
     * @param encoding The encoding to use for the email within the Amazon SNS notification.
     */
    override fun encoding(encoding: EmailEncoding) {
      cdkBuilder.encoding(encoding.let(EmailEncoding::unwrap))
    }

    /**
     * @param topic The SNS topic to notify. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.SnsProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.SnsProps,
  ) : CdkObject(cdkObject), SnsProps {
    /**
     * The encoding to use for the email within the Amazon SNS notification.
     *
     * Default: UTF-8
     */
    override fun encoding(): EmailEncoding? = unwrap(this).getEncoding()?.let(EmailEncoding::wrap)

    /**
     * The SNS topic to notify.
     */
    override fun topic(): ITopic = unwrap(this).getTopic().let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SnsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.SnsProps): SnsProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: SnsProps): software.amazon.awscdk.services.ses.actions.SnsProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.SnsProps
  }
}
