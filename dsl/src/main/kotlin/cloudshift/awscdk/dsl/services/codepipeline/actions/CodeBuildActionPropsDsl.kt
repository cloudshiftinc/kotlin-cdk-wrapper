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
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType
import software.amazon.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class CodeBuildActionPropsDsl {
    private val cdkBuilder: CodeBuildActionProps.Builder = CodeBuildActionProps.builder()

    private val _extraInputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
        cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    public fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean) {
        cdkBuilder.combineBatchBuildArtifacts(combineBatchBuildArtifacts)
    }

    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    public fun executeBatchBuild(executeBatchBuild: Boolean) {
        cdkBuilder.executeBatchBuild(executeBatchBuild)
    }

    public fun extraInputs(vararg extraInputs: Artifact) {
        _extraInputs.addAll(listOf(*extraInputs))
    }

    public fun extraInputs(extraInputs: Collection<Artifact>) {
        _extraInputs.addAll(extraInputs)
    }

    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    public fun project(project: IProject) {
        cdkBuilder.project(project)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun type(type: CodeBuildActionType) {
        cdkBuilder.type(type)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CodeBuildActionProps {
        if (_extraInputs.isNotEmpty()) cdkBuilder.extraInputs(_extraInputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
