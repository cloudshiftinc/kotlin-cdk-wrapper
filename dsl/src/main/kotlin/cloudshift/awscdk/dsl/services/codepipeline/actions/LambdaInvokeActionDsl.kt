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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class LambdaInvokeActionDsl {
    private val cdkBuilder: LambdaInvokeAction.Builder = LambdaInvokeAction.Builder.create()

    private val _inputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun inputs(vararg inputs: Artifact) {
        _inputs.addAll(listOf(*inputs))
    }

    public fun inputs(inputs: Collection<Artifact>) {
        _inputs.addAll(inputs)
    }

    public fun lambda(lambda: IFunction) {
        cdkBuilder.lambda(lambda)
    }

    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun userParameters(block: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(block)
        cdkBuilder.userParameters(builder.map)
    }

    public fun userParameters(userParameters: Map<String, Any>) {
        cdkBuilder.userParameters(userParameters)
    }

    public fun userParametersString(userParametersString: String) {
        cdkBuilder.userParametersString(userParametersString)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): LambdaInvokeAction {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
