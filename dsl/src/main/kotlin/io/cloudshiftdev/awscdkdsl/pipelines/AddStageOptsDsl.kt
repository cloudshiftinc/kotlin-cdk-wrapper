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

package io.cloudshiftdev.awscdkdsl.pipelines

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.AddStageOpts
import software.amazon.awscdk.pipelines.StackSteps
import software.amazon.awscdk.pipelines.Step

/**
 * Options to pass to `addStage`.
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
public class AddStageOptsDsl {
    private val cdkBuilder: AddStageOpts.Builder = AddStageOpts.builder()

    private val _post: MutableList<Step> = mutableListOf()

    private val _pre: MutableList<Step> = mutableListOf()

    private val _stackSteps: MutableList<StackSteps> = mutableListOf()

    /** @param post Additional steps to run after all of the stacks in the stage. */
    public fun post(vararg post: Step) {
        _post.addAll(listOf(*post))
    }

    /** @param post Additional steps to run after all of the stacks in the stage. */
    public fun post(post: Collection<Step>) {
        _post.addAll(post)
    }

    /** @param pre Additional steps to run before any of the stacks in the stage. */
    public fun pre(vararg pre: Step) {
        _pre.addAll(listOf(*pre))
    }

    /** @param pre Additional steps to run before any of the stacks in the stage. */
    public fun pre(pre: Collection<Step>) {
        _pre.addAll(pre)
    }

    /** @param stackSteps Instructions for stack level steps. */
    public fun stackSteps(stackSteps: StackStepsDsl.() -> Unit) {
        _stackSteps.add(StackStepsDsl().apply(stackSteps).build())
    }

    /** @param stackSteps Instructions for stack level steps. */
    public fun stackSteps(stackSteps: Collection<StackSteps>) {
        _stackSteps.addAll(stackSteps)
    }

    public fun build(): AddStageOpts {
        if (_post.isNotEmpty()) cdkBuilder.post(_post)
        if (_pre.isNotEmpty()) cdkBuilder.pre(_pre)
        if (_stackSteps.isNotEmpty()) cdkBuilder.stackSteps(_stackSteps)
        return cdkBuilder.build()
    }
}
