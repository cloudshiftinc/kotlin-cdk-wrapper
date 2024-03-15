@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface LazyAnyValueOptions {
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  public fun omitEmptyArray(): Boolean? = unwrap(this).getOmitEmptyArray()

  @CdkDslMarker
  public interface Builder {
    public fun displayHint(displayHint: String)

    public fun omitEmptyArray(omitEmptyArray: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.LazyAnyValueOptions.Builder =
        software.amazon.awscdk.LazyAnyValueOptions.builder()

    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    override fun omitEmptyArray(omitEmptyArray: Boolean) {
      cdkBuilder.omitEmptyArray(omitEmptyArray)
    }

    public fun build(): software.amazon.awscdk.LazyAnyValueOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.LazyAnyValueOptions,
  ) : CdkObject(cdkObject), LazyAnyValueOptions {
    override fun displayHint(): String? = unwrap(this).getDisplayHint()

    override fun omitEmptyArray(): Boolean? = unwrap(this).getOmitEmptyArray()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyAnyValueOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.LazyAnyValueOptions): LazyAnyValueOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LazyAnyValueOptions): software.amazon.awscdk.LazyAnyValueOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.LazyAnyValueOptions
  }
}
