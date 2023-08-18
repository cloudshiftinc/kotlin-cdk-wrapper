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
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps
import software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionType
import software.amazon.awscdk.services.iam.IRole

/**
 * Construction properties of the `CodeBuildAction CodeBuild build CodePipeline action`.
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
public class CodeBuildActionPropsDsl {
    private val cdkBuilder: CodeBuildActionProps.Builder = CodeBuildActionProps.builder()

    private val _extraInputs: MutableList<Artifact> = mutableListOf()

    private val _outputs: MutableList<Artifact> = mutableListOf()

    /**
     * @param actionName The physical, human-readable name of the Action. Note that Action names
     *   must be unique within a single Stage.
     */
    public fun actionName(actionName: String) {
        cdkBuilder.actionName(actionName)
    }

    /**
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
     * @param combineBatchBuildArtifacts Combine the build artifacts for a batch builds. Enabling
     *   this will combine the build artifacts into the same location for batch builds. If
     *   `executeBatchBuild` is not set to `true`, this property is ignored.
     */
    public fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean) {
        cdkBuilder.combineBatchBuildArtifacts(combineBatchBuildArtifacts)
    }

    /**
     * @param environmentVariables The environment variables to pass to the CodeBuild project when
     *   this action executes. If a variable with the same name was set both on the project level,
     *   and here, this value will take precedence.
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
        cdkBuilder.environmentVariables(environmentVariables)
    }

    /**
     * @param executeBatchBuild Trigger a batch build. Enabling this will enable batch builds on the
     *   CodeBuild project.
     */
    public fun executeBatchBuild(executeBatchBuild: Boolean) {
        cdkBuilder.executeBatchBuild(executeBatchBuild)
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this action. The directories
     *   the additional inputs will be available at are available during the project's build in the
     *   CODEBUILD_SRC_DIR_<artifact-name> environment variables. The project's build always starts
     *   in the directory with the primary input artifact checked out, the one pointed to by the
     *   `input` property. For more information, see
     *   https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    public fun extraInputs(vararg extraInputs: Artifact) {
        _extraInputs.addAll(listOf(*extraInputs))
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this action. The directories
     *   the additional inputs will be available at are available during the project's build in the
     *   CODEBUILD_SRC_DIR_<artifact-name> environment variables. The project's build always starts
     *   in the directory with the primary input artifact checked out, the one pointed to by the
     *   `input` property. For more information, see
     *   https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    public fun extraInputs(extraInputs: Collection<Artifact>) {
        _extraInputs.addAll(extraInputs)
    }

    /** @param input The source to use as input for this action. */
    public fun input(input: Artifact) {
        cdkBuilder.input(input)
    }

    /**
     * @param outputs The list of output Artifacts for this action. **Note**: if you specify more
     *   than one output Artifact here, you cannot use the primary 'artifacts' section of the
     *   buildspec; you have to use the 'secondary-artifacts' section instead. See
     *   https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html for
     *   details.
     */
    public fun outputs(vararg outputs: Artifact) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * @param outputs The list of output Artifacts for this action. **Note**: if you specify more
     *   than one output Artifact here, you cannot use the primary 'artifacts' section of the
     *   buildspec; you have to use the 'secondary-artifacts' section instead. See
     *   https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html for
     *   details.
     */
    public fun outputs(outputs: Collection<Artifact>) {
        _outputs.addAll(outputs)
    }

    /** @param project The action's Project. */
    public fun project(project: IProject) {
        cdkBuilder.project(project)
    }

    /**
     * @param role The Role in which context's this Action will be executing in. The Pipeline's Role
     *   will assume this Role (the required permissions for that will be granted automatically)
     *   right before executing this Action. This Action will be passed into your `IAction.bind`
     *   method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole) {
        cdkBuilder.role(role)
    }

    /**
     * @param runOrder The runOrder property for this Action. RunOrder determines the relative order
     *   in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number) {
        cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param type The type of the action that determines its CodePipeline Category - Build, or
     *   Test.
     */
    public fun type(type: CodeBuildActionType) {
        cdkBuilder.type(type)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     *   action.
     */
    public fun variablesNamespace(variablesNamespace: String) {
        cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): CodeBuildActionProps {
        if (_extraInputs.isNotEmpty()) cdkBuilder.extraInputs(_extraInputs)
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        return cdkBuilder.build()
    }
}
