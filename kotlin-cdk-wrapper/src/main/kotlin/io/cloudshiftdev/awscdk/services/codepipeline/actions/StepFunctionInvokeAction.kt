@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * StepFunctionInvokeAction that is provided by an AWS CodePipeline.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * Pipeline pipeline = new Pipeline(this, "MyPipeline");
 * Pass startState = new Pass(this, "StartState");
 * StateMachine simpleStateMachine = StateMachine.Builder.create(this, "SimpleStateMachine")
 * .definition(startState)
 * .build();
 * StepFunctionInvokeAction stepFunctionAction = StepFunctionInvokeAction.Builder.create()
 * .actionName("Invoke")
 * .stateMachine(simpleStateMachine)
 * .stateMachineInput(StateMachineInput.literal(Map.of("IsHelloWorldExample", true)))
 * .build();
 * pipeline.addStage(StageOptions.builder()
 * .stageName("StepFunctions")
 * .actions(List.of(stepFunctionAction))
 * .build());
 * ```
 */
public open class StepFunctionInvokeAction internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction,
) : Action(cdkObject) {
  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.codepipeline.actions.StepFunctionInvokeAction].
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
     * Prefix (optional).
     *
     * By default, the action execution ID is used as the state machine execution name.
     * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
     * together used as the state machine execution name.
     *
     * Default: - action execution ID
     *
     * @param executionNamePrefix Prefix (optional). 
     */
    public fun executionNamePrefix(executionNamePrefix: String)

    /**
     * The optional output Artifact of the Action.
     *
     * Default: the Action will not have any outputs
     *
     * @param output The optional output Artifact of the Action. 
     */
    public fun output(output: Artifact)

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
     * The state machine to invoke.
     *
     * @param stateMachine The state machine to invoke. 
     */
    public fun stateMachine(stateMachine: IStateMachine)

    /**
     * Represents the input to the StateMachine.
     *
     * This includes input artifact, input type and the statemachine input.
     *
     * Default: - none
     *
     * @param stateMachineInput Represents the input to the StateMachine. 
     */
    public fun stateMachineInput(stateMachineInput: StateMachineInput)

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
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction.Builder =
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction.Builder.create()

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
     * Prefix (optional).
     *
     * By default, the action execution ID is used as the state machine execution name.
     * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
     * together used as the state machine execution name.
     *
     * Default: - action execution ID
     *
     * @param executionNamePrefix Prefix (optional). 
     */
    override fun executionNamePrefix(executionNamePrefix: String) {
      cdkBuilder.executionNamePrefix(executionNamePrefix)
    }

    /**
     * The optional output Artifact of the Action.
     *
     * Default: the Action will not have any outputs
     *
     * @param output The optional output Artifact of the Action. 
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
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
     * The state machine to invoke.
     *
     * @param stateMachine The state machine to invoke. 
     */
    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
    }

    /**
     * Represents the input to the StateMachine.
     *
     * This includes input artifact, input type and the statemachine input.
     *
     * Default: - none
     *
     * @param stateMachineInput Represents the input to the StateMachine. 
     */
    override fun stateMachineInput(stateMachineInput: StateMachineInput) {
      cdkBuilder.stateMachineInput(stateMachineInput.let(StateMachineInput::unwrap))
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

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionInvokeAction {
      val builderImpl = BuilderImpl()
      return StepFunctionInvokeAction(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction):
        StepFunctionInvokeAction = StepFunctionInvokeAction(cdkObject)

    internal fun unwrap(wrapped: StepFunctionInvokeAction):
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction =
        wrapped.cdkObject
  }
}
