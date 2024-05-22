@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironmentVariable
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Construction properties of the `CodeBuildAction CodeBuild build CodePipeline action`.
 *
 * Example:
 *
 * ```
 * // Create a Cloudfront Web Distribution
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
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
public interface CodeBuildActionProps : CommonAwsActionProps {
  /**
   * Whether to check for the presence of any secrets in the environment variables of the default
   * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
   * variable would result in it being displayed in plain text in the AWS Console, the construct will
   * throw an exception if it detects a secret was passed there. Pass this property as false if you
   * want to skip this validation, and keep using a secret in a plain text environment variable.
   *
   * Default: true
   */
  public fun checkSecretsInPlainTextEnvVariables(): Boolean? =
      unwrap(this).getCheckSecretsInPlainTextEnvVariables()

  /**
   * Combine the build artifacts for a batch builds.
   *
   * Enabling this will combine the build artifacts into the same location for batch builds.
   * If `executeBatchBuild` is not set to `true`, this property is ignored.
   *
   * Default: false
   */
  public fun combineBatchBuildArtifacts(): Boolean? = unwrap(this).getCombineBatchBuildArtifacts()

  /**
   * The environment variables to pass to the CodeBuild project when this action executes.
   *
   * If a variable with the same name was set both on the project level, and here,
   * this value will take precedence.
   *
   * Default: - No additional environment variables are specified.
   */
  public fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
      unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)} ?:
      emptyMap()

  /**
   * Trigger a batch build.
   *
   * Enabling this will enable batch builds on the CodeBuild project.
   *
   * Default: false
   */
  public fun executeBatchBuild(): Boolean? = unwrap(this).getExecuteBatchBuild()

  /**
   * The list of additional input Artifacts for this action.
   *
   * The directories the additional inputs will be available at are available
   * during the project's build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables.
   * The project's build always starts in the directory with the primary input artifact checked out,
   * the one pointed to by the `input` property.
   * For more information,
   * see https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
   */
  public fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   * The source to use as input for this action.
   */
  public fun input(): Artifact

  /**
   * The list of output Artifacts for this action.
   *
   * **Note**: if you specify more than one output Artifact here,
   * you cannot use the primary 'artifacts' section of the buildspec;
   * you have to use the 'secondary-artifacts' section instead.
   * See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
   * for details.
   *
   * Default: the action will not have any outputs
   */
  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   * The action's Project.
   */
  public fun project(): IProject

  /**
   * The type of the action that determines its CodePipeline Category - Build, or Test.
   *
   * Default: CodeBuildActionType.BUILD
   */
  public fun type(): CodeBuildActionType? = unwrap(this).getType()?.let(CodeBuildActionType::wrap)

  /**
   * A builder for [CodeBuildActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable.
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    /**
     * @param combineBatchBuildArtifacts Combine the build artifacts for a batch builds.
     * Enabling this will combine the build artifacts into the same location for batch builds.
     * If `executeBatchBuild` is not set to `true`, this property is ignored.
     */
    public fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean)

    /**
     * @param environmentVariables The environment variables to pass to the CodeBuild project when
     * this action executes.
     * If a variable with the same name was set both on the project level, and here,
     * this value will take precedence.
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    /**
     * @param executeBatchBuild Trigger a batch build.
     * Enabling this will enable batch builds on the CodeBuild project.
     */
    public fun executeBatchBuild(executeBatchBuild: Boolean)

    /**
     * @param extraInputs The list of additional input Artifacts for this action.
     * The directories the additional inputs will be available at are available
     * during the project's build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables.
     * The project's build always starts in the directory with the primary input artifact checked
     * out,
     * the one pointed to by the `input` property.
     * For more information,
     * see https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    public fun extraInputs(extraInputs: List<Artifact>)

    /**
     * @param extraInputs The list of additional input Artifacts for this action.
     * The directories the additional inputs will be available at are available
     * during the project's build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables.
     * The project's build always starts in the directory with the primary input artifact checked
     * out,
     * the one pointed to by the `input` property.
     * For more information,
     * see https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    public fun extraInputs(vararg extraInputs: Artifact)

    /**
     * @param input The source to use as input for this action. 
     */
    public fun input(input: Artifact)

    /**
     * @param outputs The list of output Artifacts for this action.
     * **Note**: if you specify more than one output Artifact here,
     * you cannot use the primary 'artifacts' section of the buildspec;
     * you have to use the 'secondary-artifacts' section instead.
     * See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     */
    public fun outputs(outputs: List<Artifact>)

    /**
     * @param outputs The list of output Artifacts for this action.
     * **Note**: if you specify more than one output Artifact here,
     * you cannot use the primary 'artifacts' section of the buildspec;
     * you have to use the 'secondary-artifacts' section instead.
     * See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     */
    public fun outputs(vararg outputs: Artifact)

    /**
     * @param project The action's Project. 
     */
    public fun project(project: IProject)

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    public fun role(role: IRole)

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    public fun runOrder(runOrder: Number)

    /**
     * @param type The type of the action that determines its CodePipeline Category - Build, or
     * Test.
     */
    public fun type(type: CodeBuildActionType)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable.
     */
    override fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean) {
      cdkBuilder.checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables)
    }

    /**
     * @param combineBatchBuildArtifacts Combine the build artifacts for a batch builds.
     * Enabling this will combine the build artifacts into the same location for batch builds.
     * If `executeBatchBuild` is not set to `true`, this property is ignored.
     */
    override fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean) {
      cdkBuilder.combineBatchBuildArtifacts(combineBatchBuildArtifacts)
    }

    /**
     * @param environmentVariables The environment variables to pass to the CodeBuild project when
     * this action executes.
     * If a variable with the same name was set both on the project level, and here,
     * this value will take precedence.
     */
    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
    }

    /**
     * @param executeBatchBuild Trigger a batch build.
     * Enabling this will enable batch builds on the CodeBuild project.
     */
    override fun executeBatchBuild(executeBatchBuild: Boolean) {
      cdkBuilder.executeBatchBuild(executeBatchBuild)
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this action.
     * The directories the additional inputs will be available at are available
     * during the project's build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables.
     * The project's build always starts in the directory with the primary input artifact checked
     * out,
     * the one pointed to by the `input` property.
     * For more information,
     * see https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact.Companion::unwrap))
    }

    /**
     * @param extraInputs The list of additional input Artifacts for this action.
     * The directories the additional inputs will be available at are available
     * during the project's build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables.
     * The project's build always starts in the directory with the primary input artifact checked
     * out,
     * the one pointed to by the `input` property.
     * For more information,
     * see https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    /**
     * @param input The source to use as input for this action. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * @param outputs The list of output Artifacts for this action.
     * **Note**: if you specify more than one output Artifact here,
     * you cannot use the primary 'artifacts' section of the buildspec;
     * you have to use the 'secondary-artifacts' section instead.
     * See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact.Companion::unwrap))
    }

    /**
     * @param outputs The list of output Artifacts for this action.
     * **Note**: if you specify more than one output Artifact here,
     * you cannot use the primary 'artifacts' section of the buildspec;
     * you have to use the 'secondary-artifacts' section instead.
     * See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    /**
     * @param project The action's Project. 
     */
    override fun project(project: IProject) {
      cdkBuilder.project(project.let(IProject.Companion::unwrap))
    }

    /**
     * @param role The Role in which context's this Action will be executing in.
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param type The type of the action that determines its CodePipeline Category - Build, or
     * Test.
     */
    override fun type(type: CodeBuildActionType) {
      cdkBuilder.type(type.let(CodeBuildActionType.Companion::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps,
  ) : CdkObject(cdkObject), CodeBuildActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     */
    override fun checkSecretsInPlainTextEnvVariables(): Boolean? =
        unwrap(this).getCheckSecretsInPlainTextEnvVariables()

    /**
     * Combine the build artifacts for a batch builds.
     *
     * Enabling this will combine the build artifacts into the same location for batch builds.
     * If `executeBatchBuild` is not set to `true`, this property is ignored.
     *
     * Default: false
     */
    override fun combineBatchBuildArtifacts(): Boolean? =
        unwrap(this).getCombineBatchBuildArtifacts()

    /**
     * The environment variables to pass to the CodeBuild project when this action executes.
     *
     * If a variable with the same name was set both on the project level, and here,
     * this value will take precedence.
     *
     * Default: - No additional environment variables are specified.
     */
    override fun environmentVariables(): Map<String, BuildEnvironmentVariable> =
        unwrap(this).getEnvironmentVariables()?.mapValues{BuildEnvironmentVariable.wrap(it.value)}
        ?: emptyMap()

    /**
     * Trigger a batch build.
     *
     * Enabling this will enable batch builds on the CodeBuild project.
     *
     * Default: false
     */
    override fun executeBatchBuild(): Boolean? = unwrap(this).getExecuteBatchBuild()

    /**
     * The list of additional input Artifacts for this action.
     *
     * The directories the additional inputs will be available at are available
     * during the project's build in the CODEBUILD_SRC_DIR_<artifact-name> environment variables.
     * The project's build always starts in the directory with the primary input artifact checked
     * out,
     * the one pointed to by the `input` property.
     * For more information,
     * see https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html .
     */
    override fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap)
        ?: emptyList()

    /**
     * The source to use as input for this action.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The list of output Artifacts for this action.
     *
     * **Note**: if you specify more than one output Artifact here,
     * you cannot use the primary 'artifacts' section of the buildspec;
     * you have to use the 'secondary-artifacts' section instead.
     * See https://docs.aws.amazon.com/codebuild/latest/userguide/sample-multi-in-out.html
     * for details.
     *
     * Default: the action will not have any outputs
     */
    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

    /**
     * The action's Project.
     */
    override fun project(): IProject = unwrap(this).getProject().let(IProject::wrap)

    /**
     * The Role in which context's this Action will be executing in.
     *
     * The Pipeline's Role will assume this Role
     * (the required permissions for that will be granted automatically)
     * right before executing this Action.
     * This Action will be passed into your `IAction.bind`
     * method in the `ActionBindOptions.role` property.
     *
     * Default: a new Role will be generated
     */
    override fun role(): IRole? = unwrap(this).getRole()?.let(IRole::wrap)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     */
    override fun runOrder(): Number? = unwrap(this).getRunOrder()

    /**
     * The type of the action that determines its CodePipeline Category - Build, or Test.
     *
     * Default: CodeBuildActionType.BUILD
     */
    override fun type(): CodeBuildActionType? =
        unwrap(this).getType()?.let(CodeBuildActionType::wrap)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps):
        CodeBuildActionProps = CdkObjectWrappers.wrap(cdkObject) as? CodeBuildActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CodeBuildActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildActionProps
  }
}
