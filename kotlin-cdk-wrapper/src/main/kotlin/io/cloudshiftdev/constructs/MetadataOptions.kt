@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.constructs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Unit

public interface MetadataOptions {
  public fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

  public fun traceFromFunction(): Any? = unwrap(this).getTraceFromFunction()

  @CdkDslMarker
  public interface Builder {
    public fun stackTrace(stackTrace: Boolean)

    public fun traceFromFunction(traceFromFunction: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.constructs.MetadataOptions.Builder =
        software.constructs.MetadataOptions.builder()

    override fun stackTrace(stackTrace: Boolean) {
      cdkBuilder.stackTrace(stackTrace)
    }

    override fun traceFromFunction(traceFromFunction: Any) {
      cdkBuilder.traceFromFunction(traceFromFunction)
    }

    public fun build(): software.constructs.MetadataOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.constructs.MetadataOptions,
  ) : CdkObject(cdkObject), MetadataOptions {
    override fun stackTrace(): Boolean? = unwrap(this).getStackTrace()

    override fun traceFromFunction(): Any? = unwrap(this).getTraceFromFunction()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MetadataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.constructs.MetadataOptions): MetadataOptions =
        CdkObjectWrappers.wrap(cdkObject) as MetadataOptions

    internal fun unwrap(wrapped: MetadataOptions): software.constructs.MetadataOptions = (wrapped as
        CdkObject).cdkObject as software.constructs.MetadataOptions
  }
}
