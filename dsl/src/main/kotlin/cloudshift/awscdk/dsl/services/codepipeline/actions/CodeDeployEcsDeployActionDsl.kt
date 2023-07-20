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
import software.amazon.awscdk.services.codedeploy.IEcsDeploymentGroup
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.ArtifactPath
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsContainerImageInput
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployEcsDeployAction
import software.amazon.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CodeDeployEcsDeployActionDsl {
    private val cdkBuilder: CodeDeployEcsDeployAction.Builder =
        CodeDeployEcsDeployAction.Builder.create()

    private val _containerImageInputs: MutableList<CodeDeployEcsContainerImageInput> = mutableListOf()

    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    public fun appSpecTemplateFile(appSpecTemplateFile: ArtifactPath) {
        cdkBuilder.appSpecTemplateFile(appSpecTemplateFile)
    }

    public fun appSpecTemplateInput(appSpecTemplateInput: Artifact) {
        cdkBuilder.appSpecTemplateInput(appSpecTemplateInput)
    }

    public fun containerImageInputs(containerImageInputs: CodeDeployEcsContainerImageInputDsl.() -> Unit) {
        _containerImageInputs.add(CodeDeployEcsContainerImageInputDsl().apply(containerImageInputs).build())
    }

    public fun containerImageInputs(containerImageInputs: Collection<CodeDeployEcsContainerImageInput>) {
        _containerImageInputs.addAll(containerImageInputs)
    }

    public fun deploymentGroup(deploymentGroup: IEcsDeploymentGroup) {
        cdkBuilder.deploymentGroup(deploymentGroup)
    }

    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    public fun taskDefinitionTemplateFile(taskDefinitionTemplateFile: ArtifactPath) {
        cdkBuilder.taskDefinitionTemplateFile(taskDefinitionTemplateFile)
    }

    public fun taskDefinitionTemplateInput(taskDefinitionTemplateInput: Artifact) {
        cdkBuilder.taskDefinitionTemplateInput(taskDefinitionTemplateInput)
    }

    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CodeDeployEcsDeployAction {
        if (_containerImageInputs.isNotEmpty()) cdkBuilder.containerImageInputs(_containerImageInputs)
        return cdkBuilder.build()
    }
}
