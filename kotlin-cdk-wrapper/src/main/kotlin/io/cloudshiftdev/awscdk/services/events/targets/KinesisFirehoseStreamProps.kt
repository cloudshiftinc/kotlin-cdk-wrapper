@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.Unit

public interface KinesisFirehoseStreamProps {
  public fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun message(message: RuleTargetInput)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps.Builder =
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps.builder()

    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps,
  ) : CdkObject(cdkObject), KinesisFirehoseStreamProps {
    override fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisFirehoseStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps):
        KinesisFirehoseStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisFirehoseStreamProps):
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps
  }
}
