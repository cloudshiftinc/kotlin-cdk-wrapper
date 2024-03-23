@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.pipelines

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

/**
 * A manual approval step.
 *
 * If this step is added to a Pipeline, the Pipeline will
 * be paused waiting for a human to resume it
 *
 * Only engines that support pausing the deployment will
 * support this step type.
 *
 * Example:
 *
 * ```
 * CodePipeline pipeline;
 * MyApplicationStage preprod = new MyApplicationStage(this, "PreProd");
 * MyApplicationStage prod = new MyApplicationStage(this, "Prod");
 * pipeline.addStage(preprod, AddStageOpts.builder()
 * .post(List.of(
 * ShellStep.Builder.create("Validate Endpoint")
 * .commands(List.of("curl -Ssf https://my.webservice.com/"))
 * .build()))
 * .build());
 * pipeline.addStage(prod, AddStageOpts.builder()
 * .pre(List.of(
 * new ManualApprovalStep("PromoteToProd")))
 * .build());
 * ```
 */
public open class ManualApprovalStep(
  cdkObject: software.amazon.awscdk.pipelines.ManualApprovalStep,
) : Step(cdkObject) {
  public constructor(id: String) : this(software.amazon.awscdk.pipelines.ManualApprovalStep(id)
  )

  public constructor(id: String, props: ManualApprovalStepProps) :
      this(software.amazon.awscdk.pipelines.ManualApprovalStep(id,
      props.let(ManualApprovalStepProps::unwrap))
  )

  public constructor(id: String, props: ManualApprovalStepProps.Builder.() -> Unit) : this(id,
      ManualApprovalStepProps(props)
  )

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
        software.amazon.awscdk.pipelines.ManualApprovalStep = wrapped.cdkObject as
        software.amazon.awscdk.pipelines.ManualApprovalStep
  }
}
