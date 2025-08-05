@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * CodePipeline compute action that uses AWS Commands.
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
public open class CommandsAction(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommandsAction,
) : Action(cdkObject) {
  public constructor(props: CommandsActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.CommandsAction(props.let(CommandsActionProps.Companion::unwrap))
  )

  public constructor(props: CommandsActionProps.Builder.() -> Unit) :
      this(CommandsActionProps(props)
  )

  /**
   * Reference a CodePipeline variable exported in the Commands action.
   *
   * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
   * @param variableName the name of the variable exported by `outputVariables`. 
   */
  public open fun variable(variableName: String): String = unwrap(this).variable(variableName)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.codepipeline.actions.CommandsAction].
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
     * Shell commands for the Commands action to run.
     *
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     *
     * @param commands Shell commands for the Commands action to run. 
     */
    public fun commands(commands: List<String>)

    /**
     * Shell commands for the Commands action to run.
     *
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     *
     * @param commands Shell commands for the Commands action to run. 
     */
    public fun commands(vararg commands: String)

    /**
     * The list of additional input artifacts for this action.
     *
     * Default: - no extra inputs
     *
     * @param extraInputs The list of additional input artifacts for this action. 
     */
    public fun extraInputs(extraInputs: List<Artifact>)

    /**
     * The list of additional input artifacts for this action.
     *
     * Default: - no extra inputs
     *
     * @param extraInputs The list of additional input artifacts for this action. 
     */
    public fun extraInputs(vararg extraInputs: Artifact)

    /**
     * The source to use as input for this action.
     *
     * @param input The source to use as input for this action. 
     */
    public fun input(input: Artifact)

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
     *
     * @param output The output artifact for this action. 
     */
    public fun output(output: Artifact)

    /**
     * The names of the variables in your environment that you want to export.
     *
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     *
     * Default: - No output variables are exported
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     * @param outputVariables The names of the variables in your environment that you want to
     * export. 
     */
    public fun outputVariables(outputVariables: List<String>)

    /**
     * The names of the variables in your environment that you want to export.
     *
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     *
     * Default: - No output variables are exported
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     * @param outputVariables The names of the variables in your environment that you want to
     * export. 
     */
    public fun outputVariables(vararg outputVariables: String)

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
        software.amazon.awscdk.services.codepipeline.actions.CommandsAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.CommandsAction.Builder.create()

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
     * Shell commands for the Commands action to run.
     *
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     *
     * @param commands Shell commands for the Commands action to run. 
     */
    override fun commands(commands: List<String>) {
      cdkBuilder.commands(commands)
    }

    /**
     * Shell commands for the Commands action to run.
     *
     * All formats are supported except multi-line formats.
     *
     * The length of the commands array must be between 1 and 50.
     *
     * @param commands Shell commands for the Commands action to run. 
     */
    override fun commands(vararg commands: String): Unit = commands(commands.toList())

    /**
     * The list of additional input artifacts for this action.
     *
     * Default: - no extra inputs
     *
     * @param extraInputs The list of additional input artifacts for this action. 
     */
    override fun extraInputs(extraInputs: List<Artifact>) {
      cdkBuilder.extraInputs(extraInputs.map(Artifact.Companion::unwrap))
    }

    /**
     * The list of additional input artifacts for this action.
     *
     * Default: - no extra inputs
     *
     * @param extraInputs The list of additional input artifacts for this action. 
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
     *
     * @param output The output artifact for this action. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact.Companion::unwrap))
    }

    /**
     * The names of the variables in your environment that you want to export.
     *
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     *
     * Default: - No output variables are exported
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     * @param outputVariables The names of the variables in your environment that you want to
     * export. 
     */
    override fun outputVariables(outputVariables: List<String>) {
      cdkBuilder.outputVariables(outputVariables)
    }

    /**
     * The names of the variables in your environment that you want to export.
     *
     * These variables can be referenced in other actions by using the `variable` method
     * of this class.
     *
     * Default: - No output variables are exported
     *
     * [Documentation](https://docs.aws.amazon.com/codebuild/latest/userguide/build-env-ref-env-vars.html)
     * @param outputVariables The names of the variables in your environment that you want to
     * export. 
     */
    override fun outputVariables(vararg outputVariables: String): Unit =
        outputVariables(outputVariables.toList())

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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.CommandsAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CommandsAction {
      val builderImpl = BuilderImpl()
      return CommandsAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.CommandsAction):
        CommandsAction = CommandsAction(cdkObject)

    internal fun unwrap(wrapped: CommandsAction):
        software.amazon.awscdk.services.codepipeline.actions.CommandsAction = wrapped.cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.CommandsAction
  }
}
