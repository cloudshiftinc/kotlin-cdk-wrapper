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
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.pipelines.StackSteps
import software.amazon.awscdk.pipelines.StageDeploymentProps
import software.amazon.awscdk.pipelines.Step

/**
 * Properties for a `StageDeployment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.pipelines.*;
 * Stack stack;
 * Step step;
 * StageDeploymentProps stageDeploymentProps = StageDeploymentProps.builder()
 * .post(List.of(step))
 * .pre(List.of(step))
 * .stackSteps(List.of(StackSteps.builder()
 * .stack(stack)
 * // the properties below are optional
 * .changeSet(List.of(step))
 * .post(List.of(step))
 * .pre(List.of(step))
 * .build()))
 * .stageName("stageName")
 * .build();
 * ```
 */
@CdkDslMarker
public class StageDeploymentPropsDsl {
    private val cdkBuilder: StageDeploymentProps.Builder = StageDeploymentProps.builder()

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

    /** @param stackSteps Instructions for additional steps that are run at the stack level. */
    public fun stackSteps(stackSteps: StackStepsDsl.() -> Unit) {
        _stackSteps.add(StackStepsDsl().apply(stackSteps).build())
    }

    /** @param stackSteps Instructions for additional steps that are run at the stack level. */
    public fun stackSteps(stackSteps: Collection<StackSteps>) {
        _stackSteps.addAll(stackSteps)
    }

    /** @param stageName Stage name to use in the pipeline. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): StageDeploymentProps {
        if (_post.isNotEmpty()) cdkBuilder.post(_post)
        if (_pre.isNotEmpty()) cdkBuilder.pre(_pre)
        if (_stackSteps.isNotEmpty()) cdkBuilder.stackSteps(_stackSteps)
        return cdkBuilder.build()
    }
}
