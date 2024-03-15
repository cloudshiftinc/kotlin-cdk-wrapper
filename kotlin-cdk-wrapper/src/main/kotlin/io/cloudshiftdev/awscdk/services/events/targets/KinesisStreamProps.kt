@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.events.RuleTargetInput
import kotlin.String
import kotlin.Unit

public interface KinesisStreamProps {
  public fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

  public fun partitionKeyPath(): String? = unwrap(this).getPartitionKeyPath()

  @CdkDslMarker
  public interface Builder {
    public fun message(message: RuleTargetInput)

    public fun partitionKeyPath(partitionKeyPath: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.KinesisStreamProps.Builder =
        software.amazon.awscdk.services.events.targets.KinesisStreamProps.builder()

    override fun message(message: RuleTargetInput) {
      cdkBuilder.message(message.let(RuleTargetInput::unwrap))
    }

    override fun partitionKeyPath(partitionKeyPath: String) {
      cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.KinesisStreamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.events.targets.KinesisStreamProps,
  ) : CdkObject(cdkObject), KinesisStreamProps {
    override fun message(): RuleTargetInput? = unwrap(this).getMessage()?.let(RuleTargetInput::wrap)

    override fun partitionKeyPath(): String? = unwrap(this).getPartitionKeyPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KinesisStreamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.KinesisStreamProps):
        KinesisStreamProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KinesisStreamProps):
        software.amazon.awscdk.services.events.targets.KinesisStreamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.targets.KinesisStreamProps
  }
}
