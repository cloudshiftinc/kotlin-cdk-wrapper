@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Unit

public interface LogGroupTargetInputOptions {
  public fun message(): Any? = unwrap(this).getMessage()

  public fun timestamp(): Any? = unwrap(this).getTimestamp()

  @CdkDslMarker
  public interface Builder {
    public fun message(message: Any)

    public fun timestamp(timestamp: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions.Builder =
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions.builder()

    override fun message(message: Any) {
      cdkBuilder.message(message)
    }

    override fun timestamp(timestamp: Any) {
      cdkBuilder.timestamp(timestamp)
    }

    public fun build(): software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions,
  ) : CdkObject(cdkObject), LogGroupTargetInputOptions {
    override fun message(): Any? = unwrap(this).getMessage()

    override fun timestamp(): Any? = unwrap(this).getTimestamp()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogGroupTargetInputOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions):
        LogGroupTargetInputOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogGroupTargetInputOptions):
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.events.targets.LogGroupTargetInputOptions
  }
}
