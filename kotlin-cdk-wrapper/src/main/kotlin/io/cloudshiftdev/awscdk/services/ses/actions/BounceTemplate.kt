@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * A bounce template.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * BounceTemplate bounceTemplate = BounceTemplate.MAILBOX_DOES_NOT_EXIST;
 * ```
 */
public open class BounceTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplate,
) : CdkObject(cdkObject) {
  public constructor(props: BounceTemplateProps) :
      this(software.amazon.awscdk.services.ses.actions.BounceTemplate(props.let(BounceTemplateProps::unwrap))
  )

  public constructor(props: BounceTemplateProps.Builder.() -> Unit) :
      this(BounceTemplateProps(props)
  )

  /**
   *
   */
  public open fun props(): BounceTemplateProps =
      unwrap(this).getProps().let(BounceTemplateProps::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.actions.BounceTemplate].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Human-readable text to include in the bounce message.
     *
     * @param message Human-readable text to include in the bounce message. 
     */
    public fun message(message: String)

    /**
     * The SMTP reply code, as defined by RFC 5321.
     *
     * [Documentation](https://tools.ietf.org/html/rfc5321)
     * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
     */
    public fun smtpReplyCode(smtpReplyCode: String)

    /**
     * The SMTP enhanced status code, as defined by RFC 3463.
     *
     * [Documentation](https://tools.ietf.org/html/rfc3463)
     * @param statusCode The SMTP enhanced status code, as defined by RFC 3463. 
     */
    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.BounceTemplate.Builder =
        software.amazon.awscdk.services.ses.actions.BounceTemplate.Builder.create()

    /**
     * Human-readable text to include in the bounce message.
     *
     * @param message Human-readable text to include in the bounce message. 
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    /**
     * The SMTP reply code, as defined by RFC 5321.
     *
     * [Documentation](https://tools.ietf.org/html/rfc5321)
     * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
     */
    override fun smtpReplyCode(smtpReplyCode: String) {
      cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    /**
     * The SMTP enhanced status code, as defined by RFC 3463.
     *
     * [Documentation](https://tools.ietf.org/html/rfc3463)
     * @param statusCode The SMTP enhanced status code, as defined by RFC 3463. 
     */
    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.BounceTemplate =
        cdkBuilder.build()
  }

  public companion object {
    public val MAILBOX_DOES_NOT_EXIST: BounceTemplate =
        BounceTemplate.wrap(software.amazon.awscdk.services.ses.actions.BounceTemplate.MAILBOX_DOES_NOT_EXIST)

    public val MAILBOX_FULL: BounceTemplate =
        BounceTemplate.wrap(software.amazon.awscdk.services.ses.actions.BounceTemplate.MAILBOX_FULL)

    public val MESSAGE_CONTENT_REJECTED: BounceTemplate =
        BounceTemplate.wrap(software.amazon.awscdk.services.ses.actions.BounceTemplate.MESSAGE_CONTENT_REJECTED)

    public val MESSAGE_TOO_LARGE: BounceTemplate =
        BounceTemplate.wrap(software.amazon.awscdk.services.ses.actions.BounceTemplate.MESSAGE_TOO_LARGE)

    public val TEMPORARY_FAILURE: BounceTemplate =
        BounceTemplate.wrap(software.amazon.awscdk.services.ses.actions.BounceTemplate.TEMPORARY_FAILURE)

    public operator fun invoke(block: Builder.() -> Unit = {}): BounceTemplate {
      val builderImpl = BuilderImpl()
      return BounceTemplate(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplate):
        BounceTemplate = BounceTemplate(cdkObject)

    internal fun unwrap(wrapped: BounceTemplate):
        software.amazon.awscdk.services.ses.actions.BounceTemplate = wrapped.cdkObject
  }
}
