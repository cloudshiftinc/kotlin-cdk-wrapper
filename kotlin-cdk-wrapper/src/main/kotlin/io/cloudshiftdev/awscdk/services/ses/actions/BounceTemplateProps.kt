@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface BounceTemplateProps {
  public fun message(): String

  public fun smtpReplyCode(): String

  public fun statusCode(): String? = unwrap(this).getStatusCode()

  @CdkDslMarker
  public interface Builder {
    public fun message(message: String)

    public fun smtpReplyCode(smtpReplyCode: String)

    public fun statusCode(statusCode: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.BounceTemplateProps.Builder
        = software.amazon.awscdk.services.ses.actions.BounceTemplateProps.builder()

    override fun message(message: String) {
      cdkBuilder.message(message)
    }

    override fun smtpReplyCode(smtpReplyCode: String) {
      cdkBuilder.smtpReplyCode(smtpReplyCode)
    }

    override fun statusCode(statusCode: String) {
      cdkBuilder.statusCode(statusCode)
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.BounceTemplateProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplateProps,
  ) : CdkObject(cdkObject), BounceTemplateProps {
    override fun message(): String = unwrap(this).getMessage()

    override fun smtpReplyCode(): String = unwrap(this).getSmtpReplyCode()

    override fun statusCode(): String? = unwrap(this).getStatusCode()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BounceTemplateProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.BounceTemplateProps):
        BounceTemplateProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BounceTemplateProps):
        software.amazon.awscdk.services.ses.actions.BounceTemplateProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.BounceTemplateProps
  }
}
