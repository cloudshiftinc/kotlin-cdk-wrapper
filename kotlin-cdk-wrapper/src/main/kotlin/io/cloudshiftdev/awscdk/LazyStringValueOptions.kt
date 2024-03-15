@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LazyStringValueOptions {
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  @CdkDslMarker
  public interface Builder {
    public fun displayHint(displayHint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.LazyStringValueOptions.Builder =
        software.amazon.awscdk.LazyStringValueOptions.builder()

    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    public fun build(): software.amazon.awscdk.LazyStringValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.LazyStringValueOptions,
  ) : CdkObject(cdkObject), LazyStringValueOptions {
    override fun displayHint(): String? = unwrap(this).getDisplayHint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyStringValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.LazyStringValueOptions):
        LazyStringValueOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LazyStringValueOptions):
        software.amazon.awscdk.LazyStringValueOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.LazyStringValueOptions
  }
}
