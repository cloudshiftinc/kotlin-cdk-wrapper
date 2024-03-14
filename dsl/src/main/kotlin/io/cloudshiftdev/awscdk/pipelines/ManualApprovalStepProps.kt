package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ManualApprovalStepProps {
  /**
   * The comment to display with this manual approval.
   *
   * Default: - No comment
   */
  public fun comment(): String? = unwrap(this).getComment()

  /**
   * A builder for [ManualApprovalStepProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param comment The comment to display with this manual approval.
     */
    public fun comment(comment: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ManualApprovalStepProps.Builder =
        software.amazon.awscdk.pipelines.ManualApprovalStepProps.builder()

    /**
     * @param comment The comment to display with this manual approval.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.pipelines.ManualApprovalStepProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStepProps,
  ) : CdkObject(cdkObject), ManualApprovalStepProps {
    /**
     * The comment to display with this manual approval.
     *
     * Default: - No comment
     */
    override fun comment(): String? = unwrap(this).getComment()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ManualApprovalStepProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStepProps):
        ManualApprovalStepProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ManualApprovalStepProps):
        software.amazon.awscdk.pipelines.ManualApprovalStepProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.pipelines.ManualApprovalStepProps
  }
}
