@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface TagOptionsProps {
  public fun allowedValuesForTags(): Map<String, List<String>>

  @CdkDslMarker
  public interface Builder {
    public fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.servicecatalog.TagOptionsProps.Builder =
        software.amazon.awscdk.services.servicecatalog.TagOptionsProps.builder()

    override fun allowedValuesForTags(allowedValuesForTags: Map<String, List<String>>) {
      cdkBuilder.allowedValuesForTags(allowedValuesForTags)
    }

    public fun build(): software.amazon.awscdk.services.servicecatalog.TagOptionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptionsProps,
  ) : CdkObject(cdkObject), TagOptionsProps {
    override fun allowedValuesForTags(): Map<String, List<String>> =
        unwrap(this).getAllowedValuesForTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TagOptionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.TagOptionsProps):
        TagOptionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: TagOptionsProps):
        software.amazon.awscdk.services.servicecatalog.TagOptionsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.servicecatalog.TagOptionsProps
  }
}
