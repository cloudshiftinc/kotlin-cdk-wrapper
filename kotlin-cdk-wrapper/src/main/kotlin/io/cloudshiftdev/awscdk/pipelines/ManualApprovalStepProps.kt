@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ManualApprovalStepProps {
  public fun comment(): String? = unwrap(this).getComment()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ManualApprovalStepProps.Builder =
        software.amazon.awscdk.pipelines.ManualApprovalStepProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    public fun build(): software.amazon.awscdk.pipelines.ManualApprovalStepProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStepProps,
  ) : CdkObject(cdkObject), ManualApprovalStepProps {
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
