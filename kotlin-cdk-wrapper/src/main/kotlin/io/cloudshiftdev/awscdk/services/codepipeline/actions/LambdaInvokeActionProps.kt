@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Construction properties of the `LambdaInvokeAction Lambda invoke CodePipeline Action`.
 *
 * Example:
 *
 * ```
 * Function fn;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * LambdaInvokeAction lambdaAction = LambdaInvokeAction.Builder.create()
 * .actionName("Lambda")
 * .lambda(fn)
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("Lambda")
 * .actions(List.of(lambdaAction))
 * .build());
 * ```
 */
public interface LambdaInvokeActionProps : CommonAwsActionProps {
  /**
   * The optional input Artifacts of the Action.
   *
   * A Lambda Action can have up to 5 inputs.
   * The inputs will appear in the event passed to the Lambda,
   * under the `'CodePipeline.job'.data.inputArtifacts` path.
   *
   * Default: the Action will not have any inputs
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
   */
  public fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?: emptyList()

  /**
   * The lambda function to invoke.
   */
  public fun lambda(): IFunction

  /**
   * The optional names of the output Artifacts of the Action.
   *
   * A Lambda Action can have up to 5 outputs.
   * The outputs will appear in the event passed to the Lambda,
   * under the `'CodePipeline.job'.data.outputArtifacts` path.
   * It is the responsibility of the Lambda to upload ZIP files with the Artifact contents to the
   * provided locations.
   *
   * Default: the Action will not have any outputs
   */
  public fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
      emptyList()

  /**
   * A set of key-value pairs that will be accessible to the invoked Lambda inside the event that
   * the Pipeline will call it with.
   *
   * Only one of `userParameters` or `userParametersString` can be specified.
   *
   * Default: - no user parameters will be passed
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
   */
  public fun userParameters(): Map<String, Any> = unwrap(this).getUserParameters() ?: emptyMap()

  /**
   * The string representation of the user parameters that will be accessible to the invoked Lambda
   * inside the event that the Pipeline will call it with.
   *
   * Only one of `userParametersString` or `userParameters` can be specified.
   *
   * Default: - no user parameters will be passed
   */
  public fun userParametersString(): String? = unwrap(this).getUserParametersString()

  /**
   * A builder for [LambdaInvokeActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param inputs The optional input Artifacts of the Action.
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     */
    public fun inputs(inputs: List<Artifact>)

    /**
     * @param inputs The optional input Artifacts of the Action.
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     */
    public fun inputs(vararg inputs: Artifact)

    /**
     * @param lambda The lambda function to invoke. 
     */
    public fun lambda(lambda: IFunction)

    /**
     * @param outputs The optional names of the output Artifacts of the Action.
     * A Lambda Action can have up to 5 outputs.
     * The outputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.outputArtifacts` path.
     * It is the responsibility of the Lambda to upload ZIP files with the Artifact contents to the
     * provided locations.
     */
    public fun outputs(outputs: List<Artifact>)

    /**
     * @param outputs The optional names of the output Artifacts of the Action.
     * A Lambda Action can have up to 5 outputs.
     * The outputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.outputArtifacts` path.
     * It is the responsibility of the Lambda to upload ZIP files with the Artifact contents to the
     * provided locations.
     */
    public fun outputs(vararg outputs: Artifact)

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
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     * inside the event that the Pipeline will call it with.
     * Only one of `userParameters` or `userParametersString` can be specified.
     */
    public fun userParameters(userParameters: Map<String, Any>)

    /**
     * @param userParametersString The string representation of the user parameters that will be
     * accessible to the invoked Lambda inside the event that the Pipeline will call it with.
     * Only one of `userParametersString` or `userParameters` can be specified.
     */
    public fun userParametersString(userParametersString: String)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps.Builder =
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param inputs The optional input Artifacts of the Action.
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     */
    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact.Companion::unwrap))
    }

    /**
     * @param inputs The optional input Artifacts of the Action.
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     */
    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    /**
     * @param lambda The lambda function to invoke. 
     */
    override fun lambda(lambda: IFunction) {
      cdkBuilder.lambda(lambda.let(IFunction.Companion::unwrap))
    }

    /**
     * @param outputs The optional names of the output Artifacts of the Action.
     * A Lambda Action can have up to 5 outputs.
     * The outputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.outputArtifacts` path.
     * It is the responsibility of the Lambda to upload ZIP files with the Artifact contents to the
     * provided locations.
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact.Companion::unwrap))
    }

    /**
     * @param outputs The optional names of the output Artifacts of the Action.
     * A Lambda Action can have up to 5 outputs.
     * The outputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.outputArtifacts` path.
     * It is the responsibility of the Lambda to upload ZIP files with the Artifact contents to the
     * provided locations.
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

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
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     * inside the event that the Pipeline will call it with.
     * Only one of `userParameters` or `userParametersString` can be specified.
     */
    override fun userParameters(userParameters: Map<String, Any>) {
      cdkBuilder.userParameters(userParameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * @param userParametersString The string representation of the user parameters that will be
     * accessible to the invoked Lambda inside the event that the Pipeline will call it with.
     * Only one of `userParametersString` or `userParameters` can be specified.
     */
    override fun userParametersString(userParametersString: String) {
      cdkBuilder.userParametersString(userParametersString)
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps,
  ) : CdkObject(cdkObject), LambdaInvokeActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * The optional input Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     *
     * Default: the Action will not have any inputs
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     */
    override fun inputs(): List<Artifact> = unwrap(this).getInputs()?.map(Artifact::wrap) ?:
        emptyList()

    /**
     * The lambda function to invoke.
     */
    override fun lambda(): IFunction = unwrap(this).getLambda().let(IFunction::wrap)

    /**
     * The optional names of the output Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 outputs.
     * The outputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.outputArtifacts` path.
     * It is the responsibility of the Lambda to upload ZIP files with the Artifact contents to the
     * provided locations.
     *
     * Default: the Action will not have any outputs
     */
    override fun outputs(): List<Artifact> = unwrap(this).getOutputs()?.map(Artifact::wrap) ?:
        emptyList()

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
     * A set of key-value pairs that will be accessible to the invoked Lambda inside the event that
     * the Pipeline will call it with.
     *
     * Only one of `userParameters` or `userParametersString` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     */
    override fun userParameters(): Map<String, Any> = unwrap(this).getUserParameters() ?: emptyMap()

    /**
     * The string representation of the user parameters that will be accessible to the invoked
     * Lambda inside the event that the Pipeline will call it with.
     *
     * Only one of `userParametersString` or `userParameters` can be specified.
     *
     * Default: - no user parameters will be passed
     */
    override fun userParametersString(): String? = unwrap(this).getUserParametersString()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaInvokeActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps):
        LambdaInvokeActionProps = CdkObjectWrappers.wrap(cdkObject) as? LambdaInvokeActionProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaInvokeActionProps):
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeActionProps
  }
}
