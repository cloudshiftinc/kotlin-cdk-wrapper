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

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.IJenkinsProvider
import software.amazon.awscdk.services.codepipeline.actions.JenkinsAction
import software.amazon.awscdk.services.codepipeline.actions.JenkinsActionType

/**
 * Jenkins build CodePipeline Action.
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
 *
 * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/tutorials-four-stage-pipeline.html)
 */
@CdkDslMarker
public class JenkinsActionDsl {
    private val cdkBuilder: JenkinsAction.Builder = JenkinsAction.Builder.create()

    private val _inputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
     * The source to use as input for this build.
     *
     * @param inputs The source to use as input for this build.
     */
    public fun inputs(vararg inputs: Artifact) {
        _inputs.addAll(listOf(*inputs))
    }

    /**
     * The source to use as input for this build.
     *
     * @param inputs The source to use as input for this build.
     */
    public fun inputs(inputs: Collection<Artifact>) {
        _inputs.addAll(inputs)
    }

    /**
     * The Jenkins Provider for this Action.
     *
     * @param jenkinsProvider The Jenkins Provider for this Action.
     */
    public fun jenkinsProvider(jenkinsProvider: IJenkinsProvider) {
        cdkBuilder.jenkinsProvider(jenkinsProvider)
    }

    /** @param outputs */
    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    /** @param outputs */
    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    /**
     * The name of the project (sometimes also called job, or task) on your Jenkins installation
     * that will be invoked by this Action.
     *
     * Example:
     * ```
     * "MyJob";
     * ```
     *
     * @param projectName The name of the project (sometimes also called job, or task) on your
     *   Jenkins installation that will be invoked by this Action.
     */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     *
     * @param runOrder The runOrder property for this Action.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * The type of the Action - Build, or Test.
     *
     * @param type The type of the Action - Build, or Test.
     */
    public fun type(type: JenkinsActionType) {
        cdkBuilder.type(type)
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names, if any of the
     * action's variables were referenced - otherwise, no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): JenkinsAction {
        if (_inputs.isNotEmpty()) cdkBuilder.inputs(_inputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
