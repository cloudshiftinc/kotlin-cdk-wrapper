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

package io.cloudshiftdev.awscdkdsl.services.codepipeline.actions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionProps
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType

/**
 * Construction properties of `JenkinsAction`.
 *
 * Example:
 * ```
 * JenkinsProvider jenkinsProvider;
 * JenkinsAction buildAction = JenkinsAction.Builder.create()
 * .actionName("JenkinsBuild")
 * .jenkinsProvider(jenkinsProvider)
 * .projectName("MyProject")
 * .type(JenkinsActionType.BUILD)
 * .build();
 * ```
 */
@CdkDslMarker
public class JenkinsActionPropsDsl {
    private val cdkBuilder: JenkinsActionProps.Builder = JenkinsActionProps.builder()

    private val _inputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /** @param inputs The source to use as input for this build. */
    public fun inputs(vararg inputs: Artifact) {
        _inputs.addAll(listOf(*inputs))
    }

    /** @param inputs The source to use as input for this build. */
    public fun inputs(inputs: Collection<Artifact>) {
        _inputs.addAll(inputs)
    }

    /** @param jenkinsProvider The Jenkins Provider for this Action. */
    public fun jenkinsProvider(jenkinsProvider: IJenkinsProvider) {
        cdkBuilder.jenkinsProvider(jenkinsProvider)
    }

    /** @param outputs the value to be set. */
    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    /** @param outputs the value to be set. */
    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    /**
     * @param projectName The name of the project (sometimes also called job, or task) on your
     *   Jenkins installation that will be invoked by this Action.
     */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /** @param type The type of the Action - Build, or Test. */
    public fun type(type: JenkinsActionType) {
        cdkBuilder.type(type)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): JenkinsActionProps {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
