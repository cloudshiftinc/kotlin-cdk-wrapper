@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface TimeConversionOptions {
  public fun integral(): Boolean? = unwrap(this).getIntegral()

  @CdkDslMarker
  public interface Builder {
    public fun integral(integral: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.TimeConversionOptions.Builder =
        software.amazon.awscdk.TimeConversionOptions.builder()

    override fun integral(integral: Boolean) {
      cdkBuilder.integral(integral)
    }

    public fun build(): software.amazon.awscdk.TimeConversionOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.TimeConversionOptions,
  ) : CdkObject(cdkObject), TimeConversionOptions {
    override fun integral(): Boolean? = unwrap(this).getIntegral()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TimeConversionOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TimeConversionOptions):
        TimeConversionOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TimeConversionOptions):
        software.amazon.awscdk.TimeConversionOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.TimeConversionOptions
  }
}
