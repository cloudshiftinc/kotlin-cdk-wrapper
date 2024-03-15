@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface EBSTagSpecification {
  public fun propagateTags(): EbsPropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(EbsPropagatedTagSource::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun propagateTags(propagateTags: EbsPropagatedTagSource)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EBSTagSpecification.Builder =
        software.amazon.awscdk.services.ecs.EBSTagSpecification.builder()

    override fun propagateTags(propagateTags: EbsPropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(EbsPropagatedTagSource::unwrap))
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.ecs.EBSTagSpecification = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.EBSTagSpecification,
  ) : CdkObject(cdkObject), EBSTagSpecification {
    override fun propagateTags(): EbsPropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(EbsPropagatedTagSource::wrap)

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EBSTagSpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EBSTagSpecification):
        EBSTagSpecification = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EBSTagSpecification):
        software.amazon.awscdk.services.ecs.EBSTagSpecification = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.EBSTagSpecification
  }
}
