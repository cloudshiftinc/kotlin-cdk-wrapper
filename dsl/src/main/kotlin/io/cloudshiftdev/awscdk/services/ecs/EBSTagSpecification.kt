package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface EBSTagSpecification {
  /**
   * Specifies whether to propagate the tags from the task definition or the service to the task.
   *
   * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION
   *
   * Default: - undefined
   */
  public fun propagateTags(): EbsPropagatedTagSource? =
      unwrap(this).getPropagateTags()?.let(EbsPropagatedTagSource::wrap)

  /**
   * The tags to apply to the volume.
   *
   * Default: - No tags
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [EBSTagSpecification]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the task.
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION
     */
    public fun propagateTags(propagateTags: EbsPropagatedTagSource)

    /**
     * @param tags The tags to apply to the volume.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.EBSTagSpecification.Builder =
        software.amazon.awscdk.services.ecs.EBSTagSpecification.builder()

    /**
     * @param propagateTags Specifies whether to propagate the tags from the task definition or the
     * service to the task.
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION
     */
    override fun propagateTags(propagateTags: EbsPropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(EbsPropagatedTagSource::unwrap))
    }

    /**
     * @param tags The tags to apply to the volume.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.ecs.EBSTagSpecification = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.EBSTagSpecification,
  ) : EBSTagSpecification {
    /**
     * Specifies whether to propagate the tags from the task definition or the service to the task.
     *
     * Valid values are: PropagatedTagSource.SERVICE, PropagatedTagSource.TASK_DEFINITION
     *
     * Default: - undefined
     */
    override fun propagateTags(): EbsPropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(EbsPropagatedTagSource::wrap)

    /**
     * The tags to apply to the volume.
     *
     * Default: - No tags
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
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
