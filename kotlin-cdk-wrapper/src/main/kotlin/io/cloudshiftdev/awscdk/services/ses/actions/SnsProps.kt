@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface SnsProps {
  public fun encoding(): EmailEncoding? = unwrap(this).getEncoding()?.let(EmailEncoding::wrap)

  public fun topic(): ITopic

  @CdkDslMarker
  public interface Builder {
    public fun encoding(encoding: EmailEncoding)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.SnsProps.Builder =
        software.amazon.awscdk.services.ses.actions.SnsProps.builder()

    override fun encoding(encoding: EmailEncoding) {
      cdkBuilder.encoding(encoding.let(EmailEncoding::unwrap))
    }

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.SnsProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.SnsProps,
  ) : CdkObject(cdkObject), SnsProps {
    override fun encoding(): EmailEncoding? = unwrap(this).getEncoding()?.let(EmailEncoding::wrap)

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
