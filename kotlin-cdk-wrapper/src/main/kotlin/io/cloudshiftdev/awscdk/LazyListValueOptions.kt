@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface LazyListValueOptions {
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  public fun omitEmpty(): Boolean? = unwrap(this).getOmitEmpty()

  @CdkDslMarker
  public interface Builder {
    public fun displayHint(displayHint: String)

    public fun omitEmpty(omitEmpty: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.LazyListValueOptions.Builder =
        software.amazon.awscdk.LazyListValueOptions.builder()

    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    override fun omitEmpty(omitEmpty: Boolean) {
      cdkBuilder.omitEmpty(omitEmpty)
    }

    public fun build(): software.amazon.awscdk.LazyListValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.LazyListValueOptions,
  ) : CdkObject(cdkObject), LazyListValueOptions {
    override fun displayHint(): String? = unwrap(this).getDisplayHint()

    override fun omitEmpty(): Boolean? = unwrap(this).getOmitEmpty()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyListValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.LazyListValueOptions): LazyListValueOptions
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LazyListValueOptions): software.amazon.awscdk.LazyListValueOptions
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.LazyListValueOptions
  }
}
