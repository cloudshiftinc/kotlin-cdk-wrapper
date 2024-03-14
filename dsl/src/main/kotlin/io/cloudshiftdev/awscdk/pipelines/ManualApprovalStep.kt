package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public open class ManualApprovalStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStep,
) : Step(cdkObject) {
  /**
   * The comment associated with this manual approval.
   *
   * Default: - No comment
   */
  public open fun comment(): String? = unwrap(this).getComment()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.pipelines.ManualApprovalStep].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The comment to display with this manual approval.
     *
     * Default: - No comment
     *
     * @param comment The comment to display with this manual approval. 
     */
    public fun comment(comment: String)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ManualApprovalStep.Builder =
        software.amazon.awscdk.pipelines.ManualApprovalStep.Builder.create(id)

    /**
     * The comment to display with this manual approval.
     *
     * Default: - No comment
     *
     * @param comment The comment to display with this manual approval. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.pipelines.ManualApprovalStep = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(id: String, block: Builder.() -> Unit = {}): ManualApprovalStep {
      val builderImpl = BuilderImpl(id)
      return ManualApprovalStep(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStep):
        ManualApprovalStep = ManualApprovalStep(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalStep):
        software.amazon.awscdk.pipelines.ManualApprovalStep = wrapped.cdkObject
  }
}
