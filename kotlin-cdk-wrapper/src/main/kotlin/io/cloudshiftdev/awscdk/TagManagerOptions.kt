@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface TagManagerOptions {
  public fun tagPropertyName(): String? = unwrap(this).getTagPropertyName()

  @CdkDslMarker
  public interface Builder {
    public fun tagPropertyName(tagPropertyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.TagManagerOptions.Builder =
        software.amazon.awscdk.TagManagerOptions.builder()

    override fun tagPropertyName(tagPropertyName: String) {
      cdkBuilder.tagPropertyName(tagPropertyName)
    }

    public fun build(): software.amazon.awscdk.TagManagerOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.TagManagerOptions,
  ) : CdkObject(cdkObject), TagManagerOptions {
    override fun tagPropertyName(): String? = unwrap(this).getTagPropertyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagManagerOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.TagManagerOptions): TagManagerOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagManagerOptions): software.amazon.awscdk.TagManagerOptions =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.TagManagerOptions
  }
}
