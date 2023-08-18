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
import software.amazon.awscdk.services.codedeploy.IServerDeploymentGroup
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeDeployServerDeployAction
import software.amazon.awscdk.services.iam.IRole

/**
 * Example:
 * ```
 * ServerDeploymentGroup deploymentGroup;
 * Pipeline pipeline = Pipeline.Builder.create(this, "MyPipeline")
 * .pipelineName("MyPipeline")
 * .build();
 * // add the source and build Stages to the Pipeline...
 * Artifact buildOutput = new Artifact();
 * CodeDeployServerDeployAction deployAction = CodeDeployServerDeployAction.Builder.create()
 * .actionName("CodeDeploy")
 * .input(buildOutput)
 * .deploymentGroup(deploymentGroup)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Deploy")
 * .actions(List.of(deployAction))
 * .build());
 * ```
 */
@CdkDslMarker
public class CodeDeployServerDeployActionDsl {
    private val cdkBuilder: CodeDeployServerDeployAction.Builder =
        CodeDeployServerDeployAction.Builder.create()

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
     * The CodeDeploy server Deployment Group to deploy to.
     *
     * @param deploymentGroup The CodeDeploy server Deployment Group to deploy to.
     */
    public fun deploymentGroup(deploymentGroup: IServerDeploymentGroup) {
        cdkBuilder.deploymentGroup(deploymentGroup)
    }

    /**
     * The source to use as input for deployment.
     *
     * @param input The source to use as input for deployment.
     */
    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role (the required permissions for that will be granted
     * automatically) right before executing this Action. This Action will be passed into your
     * `IAction.bind` method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     *
     * @param role The Role in which context's this Action will be executing in.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
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

    public fun build(): CodeDeployServerDeployAction = cdkBuilder.build()
}
