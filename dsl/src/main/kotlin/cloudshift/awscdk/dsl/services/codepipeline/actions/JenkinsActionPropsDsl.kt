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
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class JenkinsActionPropsDsl {
    private val cdkBuilder: JenkinsActionProps.Builder = JenkinsActionProps.builder()

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

    public fun jenkinsProvider(jenkinsProvider: IJenkinsProvider) {
        cdkBuilder.jenkinsProvider(jenkinsProvider)
    }

    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun type(type: JenkinsActionType) {
        cdkBuilder.type(type)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): JenkinsActionProps {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
