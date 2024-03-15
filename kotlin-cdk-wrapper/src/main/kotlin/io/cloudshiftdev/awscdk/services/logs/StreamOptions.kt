@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface StreamOptions {
  public fun logStreamName(): String? = unwrap(this).getLogStreamName()

  @CdkDslMarker
  public interface Builder {
    public fun logStreamName(logStreamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.StreamOptions.Builder =
        software.amazon.awscdk.services.logs.StreamOptions.builder()

    override fun logStreamName(logStreamName: String) {
      cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): software.amazon.awscdk.services.logs.StreamOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.StreamOptions,
  ) : CdkObject(cdkObject), StreamOptions {
    override fun logStreamName(): String? = unwrap(this).getLogStreamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StreamOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.StreamOptions): StreamOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamOptions): software.amazon.awscdk.services.logs.StreamOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.logs.StreamOptions
  }
}
