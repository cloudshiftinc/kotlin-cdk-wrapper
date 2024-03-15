@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface ModelClientOptions {
  public fun invocationsMaxRetries(): Number? = unwrap(this).getInvocationsMaxRetries()

  public fun invocationsTimeout(): Duration? =
      unwrap(this).getInvocationsTimeout()?.let(Duration::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun invocationsMaxRetries(invocationsMaxRetries: Number)

    public fun invocationsTimeout(invocationsTimeout: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions.builder()

    override fun invocationsMaxRetries(invocationsMaxRetries: Number) {
      cdkBuilder.invocationsMaxRetries(invocationsMaxRetries)
    }

    override fun invocationsTimeout(invocationsTimeout: Duration) {
      cdkBuilder.invocationsTimeout(invocationsTimeout.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions,
  ) : CdkObject(cdkObject), ModelClientOptions {
    override fun invocationsMaxRetries(): Number? = unwrap(this).getInvocationsMaxRetries()

    override fun invocationsTimeout(): Duration? =
        unwrap(this).getInvocationsTimeout()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ModelClientOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions):
        ModelClientOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ModelClientOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions
  }
}
