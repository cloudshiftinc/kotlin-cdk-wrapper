@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface StopProps {
  public fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.actions.StopProps.Builder =
        software.amazon.awscdk.services.ses.actions.StopProps.builder()

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ses.actions.StopProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.actions.StopProps,
  ) : CdkObject(cdkObject), StopProps {
    override fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StopProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.actions.StopProps): StopProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StopProps): software.amazon.awscdk.services.ses.actions.StopProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.ses.actions.StopProps
  }
}
