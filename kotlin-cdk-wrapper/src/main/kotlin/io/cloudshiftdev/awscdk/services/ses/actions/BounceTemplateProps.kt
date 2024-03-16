@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for a BounceTemplate.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.actions.*;
 * BounceTemplateProps bounceTemplateProps = BounceTemplateProps.builder()
 * .message("message")
 * .smtpReplyCode("smtpReplyCode")
 * // the properties below are optional
 * .statusCode("statusCode")
 * .build();
 * ```
 */
public interface BounceTemplateProps {
  /**
   * Human-readable text to include in the bounce message.
   */
  public fun message(): String

  /**
   * The SMTP reply code, as defined by RFC 5321.
   *
   * [Documentation](https://tools.ietf.org/html/rfc5321)
   */
  public fun smtpReplyCode(): String

  /**
   * The SMTP enhanced status code, as defined by RFC 3463.
   *
   * [Documentation](https://tools.ietf.org/html/rfc3463)
   */
  public fun statusCode(): String? = unwrap(this).getStatusCode()

  /**
   * A builder for [BounceTemplateProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param message Human-readable text to include in the bounce message. 
     */
    public fun message(message: String)

    /**
     * @param smtpReplyCode The SMTP reply code, as defined by RFC 5321. 
     */
    public fun smtpReplyCode(smtpReplyCode: String)

    /**
     * @param statusCode The SMTP enhanced status code, as defined by RFC 3463.
     */
    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.BounceTemplateProps.Builder
        = software.amazon.awscdk.services.ses.actions.BounceTemplateProps.builder()

    /**
     * @param message Human-readable text to include in the bounce message. 
     */
    override fun message(message: String) {
      cdkBuilder.message(message)
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

    public fun build(): software.amazon.awscdk.services.ses.actions.BounceTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplateProps,
  ) : CdkObject(cdkObject), BounceTemplateProps {
    /**
     * Human-readable text to include in the bounce message.
     */
    override fun message(): String = unwrap(this).getMessage()

    /**
     * The SMTP reply code, as defined by RFC 5321.
     *
     * [Documentation](https://tools.ietf.org/html/rfc5321)
     */
    override fun smtpReplyCode(): String = unwrap(this).getSmtpReplyCode()

    /**
     * The SMTP enhanced status code, as defined by RFC 3463.
     *
     * [Documentation](https://tools.ietf.org/html/rfc3463)
     */
    override fun statusCode(): String? = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BounceTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplateProps):
        BounceTemplateProps = CdkObjectWrappers.wrap(cdkObject) as BounceTemplateProps

    internal fun unwrap(wrapped: BounceTemplateProps):
        software.amazon.awscdk.services.ses.actions.BounceTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.BounceTemplateProps
  }
}
