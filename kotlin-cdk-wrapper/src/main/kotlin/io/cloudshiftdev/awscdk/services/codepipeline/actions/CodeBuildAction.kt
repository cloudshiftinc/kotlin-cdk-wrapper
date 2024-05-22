@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codebuild.BuildEnvironmentVariable
import io.cloudshiftdev.awscdk.services.codebuild.IProject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * CodePipeline build action that uses AWS CodeBuild.
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
public open class CodeBuildAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction,
) : Action(cdkObject) {
  public constructor(props: CodeBuildActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction(props.let(CodeBuildActionProps.Companion::unwrap))
  )

  public constructor(props: CodeBuildActionProps.Builder.() -> Unit) :
      this(CodeBuildActionProps(props)
  )

  /**
   * Reference a CodePipeline variable defined by the CodeBuild project this action points to.
   *
   * Variables in CodeBuild actions are defined using the 'exported-variables' subsection of the
   * 'env'
   * section of the buildspec.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-spec-ref.html#build-spec-ref-syntax)
   * @param variableName the name of the variable to reference. 
   */
  public open fun variable(variableName: String): String = unwrap(this).variable(variableName)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.CodeBuildAction].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    public fun actionName(actionName: String)

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     *
     * @param checkSecretsInPlainTextEnvVariables Whether to check for the presence of any secrets
     * in the environment variables of the default type, BuildEnvironmentVariableType.PLAINTEXT. Since
     * using a secret for the value of that kind of variable would result in it being displayed in
     * plain text in the AWS Console, the construct will throw an exception if it detects a secret was
     * passed there. Pass this property as false if you want to skip this validation, and keep using a
     * secret in a plain text environment variable. 
     */
    public fun checkSecretsInPlainTextEnvVariables(checkSecretsInPlainTextEnvVariables: Boolean)

    /**
     * Combine the build artifacts for a batch builds.
     *
     * Enabling this will combine the build artifacts into the same location for batch builds.
     * If `executeBatchBuild` is not set to `true`, this property is ignored.
     *
     * Default: false
     *
     * @param combineBatchBuildArtifacts Combine the build artifacts for a batch builds. 
     */
    public fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean)

    /**
     * The environment variables to pass to the CodeBuild project when this action executes.
     *
     * If a variable with the same name was set both on the project level, and here,
     * this value will take precedence.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables The environment variables to pass to the CodeBuild project when
     * this action executes. 
     */
    public fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>)

    /**
     * Trigger a batch build.
     *
     * Enabling this will enable batch builds on the CodeBuild project.
     *
     * Default: false
     *
     * @param executeBatchBuild Trigger a batch build. 
     */
    public fun executeBatchBuild(executeBatchBuild: Boolean)

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
     *
     * @param extraInputs The list of additional input Artifacts for this action. 
     */
    public fun extraInputs(extraInputs: List<Artifact>)

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
     *
     * @param extraInputs The list of additional input Artifacts for this action. 
     */
    public fun extraInputs(vararg extraInputs: Artifact)

    /**
     * The source to use as input for this action.
     *
     * @param input The source to use as input for this action. 
     */
    public fun input(input: Artifact)

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
     *
     * @param outputs The list of output Artifacts for this action. 
     */
    public fun outputs(outputs: List<Artifact>)

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
     *
     * @param outputs The list of output Artifacts for this action. 
     */
    public fun outputs(vararg outputs: Artifact)

    /**
     * The action's Project.
     *
     * @param project The action's Project. 
     */
    public fun project(project: IProject)

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    public fun role(role: IRole)

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    public fun runOrder(runOrder: Number)

    /**
     * The type of the action that determines its CodePipeline Category - Build, or Test.
     *
     * Default: CodeBuildActionType.BUILD
     *
     * @param type The type of the action that determines its CodePipeline Category - Build, or
     * Test. 
     */
    public fun type(type: CodeBuildActionType)

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction.Builder.create()

    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     *
     * @param actionName The physical, human-readable name of the Action. 
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * Whether to check for the presence of any secrets in the environment variables of the default
     * type, BuildEnvironmentVariableType.PLAINTEXT. Since using a secret for the value of that kind of
     * variable would result in it being displayed in plain text in the AWS Console, the construct will
     * throw an exception if it detects a secret was passed there. Pass this property as false if you
     * want to skip this validation, and keep using a secret in a plain text environment variable.
     *
     * Default: true
     *
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
     * Combine the build artifacts for a batch builds.
     *
     * Enabling this will combine the build artifacts into the same location for batch builds.
     * If `executeBatchBuild` is not set to `true`, this property is ignored.
     *
     * Default: false
     *
     * @param combineBatchBuildArtifacts Combine the build artifacts for a batch builds. 
     */
    override fun combineBatchBuildArtifacts(combineBatchBuildArtifacts: Boolean) {
      cdkBuilder.combineBatchBuildArtifacts(combineBatchBuildArtifacts)
    }

    /**
     * The environment variables to pass to the CodeBuild project when this action executes.
     *
     * If a variable with the same name was set both on the project level, and here,
     * this value will take precedence.
     *
     * Default: - No additional environment variables are specified.
     *
     * @param environmentVariables The environment variables to pass to the CodeBuild project when
     * this action executes. 
     */
    override fun environmentVariables(environmentVariables: Map<String, BuildEnvironmentVariable>) {
      cdkBuilder.environmentVariables(environmentVariables.mapValues{BuildEnvironmentVariable.unwrap(it.value)})
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
    override fun executeBatchBuild(executeBatchBuild: Boolean) {
      cdkBuilder.executeBatchBuild(executeBatchBuild)
    }

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
     *
     * @param extraInputs The list of additional input Artifacts for this action. 
     */
    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact.Companion::unwrap))
    }

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
     *
     * @param extraInputs The list of additional input Artifacts for this action. 
     */
    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    /**
     * The source to use as input for this action.
     *
     * @param input The source to use as input for this action. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

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
     *
     * @param outputs The list of output Artifacts for this action. 
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact.Companion::unwrap))
    }

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
     *
     * @param outputs The list of output Artifacts for this action. 
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

    /**
     * The action's Project.
     *
     * @param project The action's Project. 
     */
    override fun project(project: IProject) {
      cdkBuilder.project(project.let(IProject.Companion::unwrap))
    }

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
     *
     * @param role The Role in which context's this Action will be executing in. 
     */
    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole.Companion::unwrap))
    }

    /**
     * The runOrder property for this Action.
     *
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html)
     * @param runOrder The runOrder property for this Action. 
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * The type of the action that determines its CodePipeline Category - Build, or Test.
     *
     * Default: CodeBuildActionType.BUILD
     *
     * @param type The type of the action that determines its CodePipeline Category - Build, or
     * Test. 
     */
    override fun type(type: CodeBuildActionType) {
      cdkBuilder.type(type.let(CodeBuildActionType.Companion::unwrap))
    }

    /**
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     *
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action. 
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CodeBuildAction {
      val builderImpl = BuilderImpl()
      return CodeBuildAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction):
        CodeBuildAction = CodeBuildAction(cdkObject)

    internal fun unwrap(wrapped: CodeBuildAction):
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CodeBuildAction
  }
}
