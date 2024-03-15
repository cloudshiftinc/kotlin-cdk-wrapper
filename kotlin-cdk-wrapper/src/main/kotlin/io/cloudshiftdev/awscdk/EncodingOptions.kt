@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface EncodingOptions {
  public fun displayHint(): String? = unwrap(this).getDisplayHint()

  @CdkDslMarker
  public interface Builder {
    public fun displayHint(displayHint: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.EncodingOptions.Builder =
        software.amazon.awscdk.EncodingOptions.builder()

    override fun displayHint(displayHint: String) {
      cdkBuilder.displayHint(displayHint)
    }

    public fun build(): software.amazon.awscdk.EncodingOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.EncodingOptions,
  ) : CdkObject(cdkObject), EncodingOptions {
    override fun displayHint(): String? = unwrap(this).getDisplayHint()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EncodingOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.EncodingOptions): EncodingOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EncodingOptions): software.amazon.awscdk.EncodingOptions = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.EncodingOptions
  }
}
