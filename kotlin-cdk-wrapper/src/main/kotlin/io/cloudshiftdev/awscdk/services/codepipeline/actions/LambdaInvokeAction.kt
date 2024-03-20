@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.lambda.IFunction
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * CodePipeline invoke Action that is provided by an AWS Lambda function.
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
 *
 * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html)
 */
public open class LambdaInvokeAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction,
) : Action(cdkObject) {
  public constructor(props: LambdaInvokeActionProps) :
      this(software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction(props.let(LambdaInvokeActionProps::unwrap))
  )

  public constructor(props: LambdaInvokeActionProps.Builder.() -> Unit) :
      this(LambdaInvokeActionProps(props)
  )

  /**
   * Reference a CodePipeline variable defined by the Lambda function this action points to.
   *
   * Variables in Lambda invoke actions are defined by calling the PutJobSuccessResult CodePipeline
   * API call
   * with the 'outputVariables' property filled.
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/APIReference/API_PutJobSuccessResult.html)
   * @param variableName the name of the variable to reference. 
   */
  public open fun variable(variableName: String): String = unwrap(this).variable(variableName)

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.LambdaInvokeAction].
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
     * The optional input Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     *
     * Default: the Action will not have any inputs
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     * @param inputs The optional input Artifacts of the Action. 
     */
    public fun inputs(inputs: List<Artifact>)

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
     * @param inputs The optional input Artifacts of the Action. 
     */
    public fun inputs(vararg inputs: Artifact)

    /**
     * The lambda function to invoke.
     *
     * @param lambda The lambda function to invoke. 
     */
    public fun lambda(lambda: IFunction)

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
     *
     * @param outputs The optional names of the output Artifacts of the Action. 
     */
    public fun outputs(outputs: List<Artifact>)

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
     *
     * @param outputs The optional names of the output Artifacts of the Action. 
     */
    public fun outputs(vararg outputs: Artifact)

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
     * A set of key-value pairs that will be accessible to the invoked Lambda inside the event that
     * the Pipeline will call it with.
     *
     * Only one of `userParameters` or `userParametersString` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     * inside the event that the Pipeline will call it with. 
     */
    public fun userParameters(userParameters: Map<String, Any>)

    /**
     * The string representation of the user parameters that will be accessible to the invoked
     * Lambda inside the event that the Pipeline will call it with.
     *
     * Only one of `userParametersString` or `userParameters` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * @param userParametersString The string representation of the user parameters that will be
     * accessible to the invoked Lambda inside the event that the Pipeline will call it with. 
     */
    public fun userParametersString(userParametersString: String)

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
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction.Builder.create()

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
     * The optional input Artifacts of the Action.
     *
     * A Lambda Action can have up to 5 inputs.
     * The inputs will appear in the event passed to the Lambda,
     * under the `'CodePipeline.job'.data.inputArtifacts` path.
     *
     * Default: the Action will not have any inputs
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     * @param inputs The optional input Artifacts of the Action. 
     */
    override fun inputs(inputs: List<Artifact>) {
      cdkBuilder.inputs(inputs.map(Artifact::unwrap))
    }

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
     * @param inputs The optional input Artifacts of the Action. 
     */
    override fun inputs(vararg inputs: Artifact): Unit = inputs(inputs.toList())

    /**
     * The lambda function to invoke.
     *
     * @param lambda The lambda function to invoke. 
     */
    override fun lambda(lambda: IFunction) {
      cdkBuilder.lambda(lambda.let(IFunction::unwrap))
    }

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
     *
     * @param outputs The optional names of the output Artifacts of the Action. 
     */
    override fun outputs(outputs: List<Artifact>) {
      cdkBuilder.outputs(outputs.map(Artifact::unwrap))
    }

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
     *
     * @param outputs The optional names of the output Artifacts of the Action. 
     */
    override fun outputs(vararg outputs: Artifact): Unit = outputs(outputs.toList())

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
      cdkBuilder.role(role.let(IRole::unwrap))
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
     * A set of key-value pairs that will be accessible to the invoked Lambda inside the event that
     * the Pipeline will call it with.
     *
     * Only one of `userParameters` or `userParametersString` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/actions-invoke-lambda-function.html#actions-invoke-lambda-function-json-event-example)
     * @param userParameters A set of key-value pairs that will be accessible to the invoked Lambda
     * inside the event that the Pipeline will call it with. 
     */
    override fun userParameters(userParameters: Map<String, Any>) {
      cdkBuilder.userParameters(userParameters)
    }

    /**
     * The string representation of the user parameters that will be accessible to the invoked
     * Lambda inside the event that the Pipeline will call it with.
     *
     * Only one of `userParametersString` or `userParameters` can be specified.
     *
     * Default: - no user parameters will be passed
     *
     * @param userParametersString The string representation of the user parameters that will be
     * accessible to the invoked Lambda inside the event that the Pipeline will call it with. 
     */
    override fun userParametersString(userParametersString: String) {
      cdkBuilder.userParametersString(userParametersString)
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

    public fun build(): software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaInvokeAction {
      val builderImpl = BuilderImpl()
      return LambdaInvokeAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction):
        LambdaInvokeAction = LambdaInvokeAction(cdkObject)

    internal fun unwrap(wrapped: LambdaInvokeAction):
        software.amazon.awscdk.services.codepipeline.actions.LambdaInvokeAction = wrapped.cdkObject
  }
}
