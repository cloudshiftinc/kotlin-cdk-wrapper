package io.cloudshiftdev.awscdk.services.ecs

import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface EBSTagSpecification {
  public fun propagateTags(): EbsPropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(EbsPropagatedTagSource::wrap)

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  public interface Builder {
    public fun propagateTags(propagateTags: EbsPropagatedTagSource) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EBSTagSpecification.Builder =
        software.amazon.awscdk.services.ecs.EBSTagSpecification.builder()

    public override fun propagateTags(propagateTags: EbsPropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(EbsPropagatedTagSource::unwrap))
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.ecs.EBSTagSpecification = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.EBSTagSpecification,
  ) : EBSTagSpecification {
    public override fun propagateTags(): EbsPropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(EbsPropagatedTagSource::wrap)

    public override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EBSTagSpecification {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.EBSTagSpecification):
        EBSTagSpecification = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EBSTagSpecification):
        software.amazon.awscdk.services.ecs.EBSTagSpecification = (wrapped as Wrapper).cdkObject
  }
}
