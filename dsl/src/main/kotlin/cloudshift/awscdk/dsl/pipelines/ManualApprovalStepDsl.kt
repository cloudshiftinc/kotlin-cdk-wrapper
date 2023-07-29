@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.pipelines.ManualApprovalStep

/**
 * A manual approval step.
 *
 * If this step is added to a Pipeline, the Pipeline will be paused waiting for a human to resume it
 *
 * Only engines that support pausing the deployment will support this step type.
 *
 * Example:
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
@CdkDslMarker
public class ManualApprovalStepDsl(
    id: String,
) {
    private val cdkBuilder: ManualApprovalStep.Builder = ManualApprovalStep.Builder.create(id)

    /**
     * The comment to display with this manual approval.
     *
     * Default: - No comment
     *
     * @param comment The comment to display with this manual approval.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun build(): ManualApprovalStep = cdkBuilder.build()
}
