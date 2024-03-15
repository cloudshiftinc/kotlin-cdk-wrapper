@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.StartingPosition
import kotlin.Boolean
import kotlin.Number
import kotlin.Unit

public interface BaseStreamEventSourceProps {
  public fun batchSize(): Number? = unwrap(this).getBatchSize()

  public fun enabled(): Boolean? = unwrap(this).getEnabled()

  public fun maxBatchingWindow(): Duration? =
      unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

  public fun startingPosition(): StartingPosition

  @CdkDslMarker
  public interface Builder {
    public fun batchSize(batchSize: Number)

    public fun enabled(enabled: Boolean)

    public fun maxBatchingWindow(maxBatchingWindow: Duration)

    public fun startingPosition(startingPosition: StartingPosition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps.Builder =
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps.builder()

    override fun batchSize(batchSize: Number) {
      cdkBuilder.batchSize(batchSize)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun maxBatchingWindow(maxBatchingWindow: Duration) {
      cdkBuilder.maxBatchingWindow(maxBatchingWindow.let(Duration::unwrap))
    }

    override fun startingPosition(startingPosition: StartingPosition) {
      cdkBuilder.startingPosition(startingPosition.let(StartingPosition::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps,
  ) : CdkObject(cdkObject), BaseStreamEventSourceProps {
    override fun batchSize(): Number? = unwrap(this).getBatchSize()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun maxBatchingWindow(): Duration? =
        unwrap(this).getMaxBatchingWindow()?.let(Duration::wrap)

    override fun startingPosition(): StartingPosition =
        unwrap(this).getStartingPosition().let(StartingPosition::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseStreamEventSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps):
        BaseStreamEventSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseStreamEventSourceProps):
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps
  }
}
