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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codebuild.BuildEnvironmentVariable
import software.amazon.awscdk.services.codebuild.IProject
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType
import software.amazon.awscdk.services.iam.IRole

/**
 * CodePipeline build action that uses AWS CodeBuild.
 *
 * Example:
 * ```
 * // Create a Cloudfront Web Distribution
 * import software.amazon.awscdk.services.cloudfront.*;
 * Distribution distribution;
 * // Create the build project that will invalidate the cache
 * PipelineProject invalidateBuildProject = PipelineProject.Builder.create(this,
 * "InvalidateProject")
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * "version", "0.2",
 * "phases", Map.of(
 * "build", Map.of(
 * "commands", List.of("aws cloudfront create-invalidation --distribution-id
 * ${CLOUDFRONT_ID} --paths \"/ *\""))))))
 * .environmentVariables(Map.of(
 * "CLOUDFRONT_ID",
 * BuildEnvironmentVariable.builder().value(distribution.getDistributionId()).build()))
 * .build();
 * // Add Cloudfront invalidation permissions to the project
 * String distributionArn = String.format("arn:aws:cloudfront::%s:distribution/%s", this.account,
 * distribution.getDistributionId());
 * invalidateBuildProject.addToRolePolicy(PolicyStatement.Builder.create()
 * .resources(List.of(distributionArn))
 * .actions(List.of("cloudfront:CreateInvalidation"))
 * .build());
 * // Create the pipeline (here only the S3 deploy and Invalidate cache build)
 * Bucket deployBucket = new Bucket(this, "DeployBucket");
 * Artifact deployInput = new Artifact();
 * Pipeline.Builder.create(this, "Pipeline")
 * .stages(List.of(StageProps.builder()
 * .stageName("Deploy")
 * .actions(List.of(
 * S3DeployAction.Builder.create()
 * .actionName("S3Deploy")
 * .bucket(deployBucket)
 * .input(deployInput)
 * .runOrder(1)
 * .build(),
 * CodeBuildAction.Builder.create()
 * .actionName("InvalidateCache")
 * .project(invalidateBuildProject)
 * .input(deployInput)
 * .runOrder(2)
 * .build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class CodeBuildActionDsl {
    private val cdkBuilder: CodeBuildAction.Builder = CodeBuildAction.Builder.create()

    private val _extraInputs: MutableList<Artifact> = mutableListOf()

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
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind
     * of variable would result in it being displayed in plain text in the AWS Console, the
     * construct will throw an exception if it detects a secret was passed there. Pass this property
     * as false if you want to skip this validation, and keep using a secret in a plain text
     * environment variable.
     *
     * Default: true
     *
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     *   in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT.
     *   Since using a secret for the value of that kind of variable would result in it being
     *   displayed in plain text in the AWS Console, the construct will throw an exception if it
     *   detects a secret was passed there. Pass this property as false if you want to skip this
     *   validation, and keep using a secret in a plain text environment variable.
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
        cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    /**
     * Combine the build artifacts for a batch builds.
     *
     * Enabling this will combine the build artifacts into the same location for batch builds. If
     * `executeBatchBuild` is not set to `true`, this property is ignored.
     *
     * Default: false
     *
     * @param combineBatchBuildArtifacts Combine the build artifacts for a batch builds.
     */
    public fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean) {
        cdkBuilder.combineBatchBuildArtifacts(combineBatchBuildArtifacts)
    }

    /**
     * The environment variables to pass to the CodeBuild project when this action executes.
     *
     * If a variable with the same name was set both on the project level, and here, this value will
     * take precedence.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables The environment variables to pass to the CodeBuild project when
     *   this action executes.
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * Trigger a batch build.
     *
     * Enabling this will enable batch builds on the CodeBuild project.
     *
     * Default: false
     *
     * @param executeBatchBuild Trigger a batch build.
     */
    public fun executeBatchBuild(executeBatchBuild: Boolean) {
        cdkBuilder.executeBatchBuild(executeBatchBuild)
    }

    /**
     * The list of additional input Artifacts for this action.
     *
     * The directories the additional inputs will be available at are available during the project's
     * build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables. The project's build
     * always starts in the directory with the primary input artifact checked out, the one pointed
     * to by the `input` property. For more information, see
     * https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     *
     * @param extraInputs The list of additional input Artifacts for this action.
     */
    public fun extraInputs(vararg extraInputs: Artifact) {
        _extraInputs.addAll(listOf(*extraInputs))
    }

    /**
     * The list of additional input Artifacts for this action.
     *
     * The directories the additional inputs will be available at are available during the project's
     * build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables. The project's build
     * always starts in the directory with the primary input artifact checked out, the one pointed
     * to by the `input` property. For more information, see
     * https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     *
     * @param extraInputs The list of additional input Artifacts for this action.
     */
    public fun extraInputs(extraInputs: Collection<Artifact>) {
        _extraInputs.addAll(extraInputs)
    }

    /**
     * The source to use as input for this action.
     *
     * @param input The source to use as input for this action.
     */
    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    /**
     * The list of output Artifacts for this action.
     *
     * **Note**: if you specify more than one output Artifact here, you cannot use the primary
     * 'artifacts' section of the buildspec; you have to use the 'secondary-artifacts' section
     * instead. See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     *
     * Default: the action will not have any outputs
     *
     * @param outputs The list of output Artifacts for this action.
     */
    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * The list of output Artifacts for this action.
     *
     * **Note**: if you specify more than one output Artifact here, you cannot use the primary
     * 'artifacts' section of the buildspec; you have to use the 'secondary-artifacts' section
     * instead. See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     *
     * Default: the action will not have any outputs
     *
     * @param outputs The list of output Artifacts for this action.
     */
    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    /**
     * The action's Project.
     *
     * @param project The action's Project.
     */
    public fun project(project: IProject) {
        cdkBuilder.project(project)
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
     * The type of the action that determines its CodePipeline Category - Build, or Test.
     *
     * Default: CodeBuildActionType.BUILD
     *
     * @param type The type of the action that determines its CodePipeline Category - Build, or
     *   Test.
     */
    public fun type(type: CodeBuildActionType) {
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

    public fun build(): CodeBuildAction {
        if (_extraInputs.isNotEmpty()) cdkBuilder.extraInputs(_extraInputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
