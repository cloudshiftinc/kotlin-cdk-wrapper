@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Construction properties of the `CommandsAction`.
 *
 * Example:
 *
 * ```
 * Artifact sourceArtifact;
 * Artifact outputArtifact;
 * CommandsAction commandsAction = CommandsAction.Builder.create()
 * .actionName("Commands")
 * .commands(List.of("export MY_OUTPUT=my-key"))
 * .input(sourceArtifact)
 * .output(outputArtifact)
 * .outputVariables(List.of("MY_OUTPUT", "CODEBUILD_BUILD_ID"))
 * .build();
 * // Deploy action
 * S3DeployAction deployAction = S3DeployAction.Builder.create()
 * .actionName("DeployAction")
 * .extract(true)
 * .input(outputArtifact)
 * .bucket(new Bucket(this, "DeployBucket"))
 * .objectKey(commandsAction.variable("MY_OUTPUT"))
 * .build();
 * ```
 */
public interface CommandsActionProps : CommonAwsActionProps {
  /**
   * Shell commands for the Commands action to run.
   *
   * All formats are supported except multi-line formats.
   *
   * The length of the commands array must be between 1 and 50.
   */
  public fun commands(): List<String>

  /**
   * The list of additional input artifacts for this action.
   *
   * Default: - no extra inputs
   */
  public fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   * The source to use as input for this action.
   */
  public fun input(): Artifact

  /**
   * The output artifact for this action.
   *
   * You can filter files that you want to export as the output artifact for the action.
   *
   * Default: - no output artifact
   *
   * Example:
   *
   * ```
   * new Artifact("CommandsArtifact", List.of("my-dir/ **"));
   * ```
   */
  public fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

  /**
   * The names of the variables in your environment that you want to export.
   *
   * These variables can be referenced in other actions by using the `variable` method
   * of this class.
   *
   * Default: - No output variables are exported
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
   */
  public fun outputVariables(): List<String> = unwrap(this).getOutputVariables() ?: emptyList()

  /**
   * A builder for [CommandsActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param commands Shell commands for the Commands action to run. 
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     */
    public fun commands(commands: List<String>)

    /**
     * @param commands Shell commands for the Commands action to run. 
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     */
    public fun commands(vararg commands: String)

    /**
     * @param extraInputs The list of additional input artifacts for this action.
     */
    public fun extraInputs(extraInputs: List<Artifact>)

    /**
     * @param extraInputs The list of additional input artifacts for this action.
     */
    public fun extraInputs(vararg extraInputs: Artifact)

    /**
     * @param input The source to use as input for this action. 
     */
    public fun input(input: Artifact)

    /**
     * @param output The output artifact for this action.
     * You can filter files that you want to export as the output artifact for the action.
     */
    public fun output(output: Artifact)

    /**
     * @param outputVariables The names of the variables in your environment that you want to
     * export.
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     */
    public fun outputVariables(outputVariables: List<String>)

    /**
     * @param outputVariables The names of the variables in your environment that you want to
     * export.
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     */
    public fun outputVariables(vararg outputVariables: String)

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
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param commands Shell commands for the Commands action to run. 
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     */
    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    /**
     * @param commands Shell commands for the Commands action to run. 
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     */
    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    /**
     * @param extraInputs The list of additional input artifacts for this action.
     */
    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact.Companion::unwrap))
    }

    /**
     * @param extraInputs The list of additional input artifacts for this action.
     */
    override fun extraInputs(vararg extraInputs: Artifact): Unit = extraInputs(extraInputs.toList())

    /**
     * @param input The source to use as input for this action. 
     */
    override fun input(input: Artifact) {
      cdkBuilder.input(input.let(Artifact.Companion::unwrap))
    }

    /**
     * @param output The output artifact for this action.
     * You can filter files that you want to export as the output artifact for the action.
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * @param outputVariables The names of the variables in your environment that you want to
     * export.
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     */
    override fun outputVariables(outputVariables: List<String>) {
      cdkBuilder.outputVariables(outputVariables)
    }

    /**
     * @param outputVariables The names of the variables in your environment that you want to
     * export.
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     */
    override fun outputVariables(vararg outputVariables: String): Unit =
        outputVariables(outputVariables.toList())

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
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps,
  ) : CdkObject(cdkObject),
      CommandsActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Shell commands for the Commands action to run.
     *
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     */
    override fun commands(): List<String> = unwrap(this).getCommands()

    /**
     * The list of additional input artifacts for this action.
     *
     * Default: - no extra inputs
     */
    override fun extraInputs(): List<Artifact> = unwrap(this).getExtraInputs()?.map(Artifact::wrap)
        ?: emptyList()

    /**
     * The source to use as input for this action.
     */
    override fun input(): Artifact = unwrap(this).getInput().let(Artifact::wrap)

    /**
     * The output artifact for this action.
     *
     * You can filter files that you want to export as the output artifact for the action.
     *
     * Default: - no output artifact
     *
     * Example:
     *
     * ```
     * new Artifact("CommandsArtifact", List.of("my-dir/ **"));
     * ```
     */
    override fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

    /**
     * The names of the variables in your environment that you want to export.
     *
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     *
     * Default: - No output variables are exported
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     */
    override fun outputVariables(): List<String> = unwrap(this).getOutputVariables() ?: emptyList()

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
     * The name of the namespace to use for variables emitted by this action.
     *
     * Default: - a name will be generated, based on the stage and action names,
     * if any of the action's variables were referenced - otherwise,
     * no namespace will be set
     */
    override fun variablesNamespace(): String? = unwrap(this).getVariablesNamespace()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommandsActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps):
        CommandsActionProps = CdkObjectWrappers.wrap(cdkObject) as? CommandsActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CommandsActionProps):
        software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CommandsActionProps
  }
}
