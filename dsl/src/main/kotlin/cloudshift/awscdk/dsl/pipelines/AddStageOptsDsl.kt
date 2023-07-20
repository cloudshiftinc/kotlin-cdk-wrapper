@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.pipelines

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.pipelines.AddStageOpts
import software.amazon.awscdk.pipelines.StackSteps
import software.amazon.awscdk.pipelines.Step
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AddStageOptsDsl {
    private val cdkBuilder: AddStageOpts.Builder = AddStageOpts.builder()

    private val _post: MutableList<Step> = mutableListOf()

    private val _pre: MutableList<Step> = mutableListOf()

    private val _stackSteps: MutableList<StackSteps> = mutableListOf()

    public fun post(vararg post: Step) {
        _post.addAll(listOf(*post))
    }

    public fun post(post: Collection<Step>) {
        _post.addAll(post)
    }

    public fun pre(vararg pre: Step) {
        _pre.addAll(listOf(*pre))
    }

    public fun pre(pre: Collection<Step>) {
        _pre.addAll(pre)
    }

    public fun stackSteps(stackSteps: StackStepsDsl.() -> Unit) {
        _stackSteps.add(StackStepsDsl().apply(stackSteps).build())
    }

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
