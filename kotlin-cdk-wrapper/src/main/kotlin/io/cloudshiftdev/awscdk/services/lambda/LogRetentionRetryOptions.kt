@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.Number
import kotlin.Unit

public interface LogRetentionRetryOptions :
    io.cloudshiftdev.awscdk.services.logs.LogRetentionRetryOptions {
  @CdkDslMarker
  public interface Builder {
    @Deprecated(message = "deprecated in CDK")
    public fun base(base: Duration)

    public fun maxRetries(maxRetries: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.LogRetentionRetryOptions.Builder
        = software.amazon.awscdk.services.lambda.LogRetentionRetryOptions.builder()

    @Deprecated(message = "deprecated in CDK")
    override fun base(base: Duration) {
      cdkBuilder.base(base.let(Duration::unwrap))
    }

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    public fun build(): software.amazon.awscdk.services.lambda.LogRetentionRetryOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.LogRetentionRetryOptions,
  ) : CdkObject(cdkObject), LogRetentionRetryOptions {
    @Deprecated(message = "deprecated in CDK")
    override fun base(): Duration? = unwrap(this).getBase()?.let(Duration::wrap)

    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LogRetentionRetryOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.LogRetentionRetryOptions):
        LogRetentionRetryOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LogRetentionRetryOptions):
        software.amazon.awscdk.services.lambda.LogRetentionRetryOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.LogRetentionRetryOptions
  }
}