@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public open class BounceTemplate internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplate,
) : CdkObject(cdkObject) {
  public open fun props(): BounceTemplateProps =
      unwrap(this).getProps().let(BounceTemplateProps::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun message(message: String)

    public fun smtpReplyCode(smtpReplyCode: String)

    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.BounceTemplate.Builder =
        software.amazon.awscdk.services.ses.actions.BounceTemplate.Builder.create()

    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    override fun smtpReplyCode(smtpReplyCode: String) {
      cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

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
