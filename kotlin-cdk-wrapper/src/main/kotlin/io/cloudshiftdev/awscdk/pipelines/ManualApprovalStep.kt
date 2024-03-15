@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public open class ManualApprovalStep internal constructor(
  internal override val cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStep,
) : Step(cdkObject) {
  public open fun comment(): String? = unwrap(this).getComment()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)
  }

  private class BuilderImpl(
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.pipelines.ManualApprovalStep.Builder =
        software.amazon.awscdk.pipelines.ManualApprovalStep.Builder.create(id)

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
