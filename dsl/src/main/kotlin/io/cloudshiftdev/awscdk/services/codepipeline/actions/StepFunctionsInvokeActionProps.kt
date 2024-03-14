package io.cloudshiftdev.awscdk.services.codepipeline.actions

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.CommonAwsActionProps
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.stepfunctions.IStateMachine
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface StepFunctionsInvokeActionProps : CommonAwsActionProps {
  /**
   * Prefix (optional).
   *
   * By default, the action execution ID is used as the state machine execution name.
   * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
   * together used as the state machine execution name.
   *
   * Default: - action execution ID
   */
  public fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

  /**
   * The optional output Artifact of the Action.
   *
   * Default: the Action will not have any outputs
   */
  public fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

  /**
   * The state machine to invoke.
   */
  public fun stateMachine(): IStateMachine

  /**
   * Represents the input to the StateMachine.
   *
   * This includes input artifact, input type and the statemachine input.
   *
   * Default: - none
   */
  public fun stateMachineInput(): StateMachineInput? =
      unwrap(this).getStateMachineInput()?.let(StateMachineInput::wrap)

  /**
   * A builder for [StepFunctionsInvokeActionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    public fun actionName(actionName: String)

    /**
     * @param executionNamePrefix Prefix (optional).
     * By default, the action execution ID is used as the state machine execution name.
     * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
     * together used as the state machine execution name.
     */
    public fun executionNamePrefix(executionNamePrefix: String)

    /**
     * @param output The optional output Artifact of the Action.
     */
    public fun output(output: Artifact)

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
     * @param stateMachine The state machine to invoke. 
     */
    public fun stateMachine(stateMachine: IStateMachine)

    /**
     * @param stateMachineInput Represents the input to the StateMachine.
     * This includes input artifact, input type and the statemachine input.
     */
    public fun stateMachineInput(stateMachineInput: StateMachineInput)

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    public fun variablesNamespace(variablesNamespace: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps.Builder
        =
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps.builder()

    /**
     * @param actionName The physical, human-readable name of the Action. 
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(actionName: String) {
      cdkBuilder.actionName(actionName)
    }

    /**
     * @param executionNamePrefix Prefix (optional).
     * By default, the action execution ID is used as the state machine execution name.
     * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
     * together used as the state machine execution name.
     */
    override fun executionNamePrefix(executionNamePrefix: String) {
      cdkBuilder.executionNamePrefix(executionNamePrefix)
    }

    /**
     * @param output The optional output Artifact of the Action.
     */
    override fun output(output: Artifact) {
      cdkBuilder.output(output.let(Artifact::unwrap))
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
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    /**
     * @param runOrder The runOrder property for this Action.
     * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
     */
    override fun runOrder(runOrder: Number) {
      cdkBuilder.runOrder(runOrder)
    }

    /**
     * @param stateMachine The state machine to invoke. 
     */
    override fun stateMachine(stateMachine: IStateMachine) {
      cdkBuilder.stateMachine(stateMachine.let(IStateMachine::unwrap))
    }

    /**
     * @param stateMachineInput Represents the input to the StateMachine.
     * This includes input artifact, input type and the statemachine input.
     */
    override fun stateMachineInput(stateMachineInput: StateMachineInput) {
      cdkBuilder.stateMachineInput(stateMachineInput.let(StateMachineInput::unwrap))
    }

    /**
     * @param variablesNamespace The name of the namespace to use for variables emitted by this
     * action.
     */
    override fun variablesNamespace(variablesNamespace: String) {
      cdkBuilder.variablesNamespace(variablesNamespace)
    }

    public fun build():
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps,
  ) : CdkObject(cdkObject), StepFunctionsInvokeActionProps {
    /**
     * The physical, human-readable name of the Action.
     *
     * Note that Action names must be unique within a single Stage.
     */
    override fun actionName(): String = unwrap(this).getActionName()

    /**
     * Prefix (optional).
     *
     * By default, the action execution ID is used as the state machine execution name.
     * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
     * together used as the state machine execution name.
     *
     * Default: - action execution ID
     */
    override fun executionNamePrefix(): String? = unwrap(this).getExecutionNamePrefix()

    /**
     * The optional output Artifact of the Action.
     *
     * Default: the Action will not have any outputs
     */
    override fun output(): Artifact? = unwrap(this).getOutput()?.let(Artifact::wrap)

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
     * The state machine to invoke.
     */
    override fun stateMachine(): IStateMachine =
        unwrap(this).getStateMachine().let(IStateMachine::wrap)

    /**
     * Represents the input to the StateMachine.
     *
     * This includes input artifact, input type and the statemachine input.
     *
     * Default: - none
     */
    override fun stateMachineInput(): StateMachineInput? =
        unwrap(this).getStateMachineInput()?.let(StateMachineInput::wrap)

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
    public operator fun invoke(block: Builder.() -> Unit = {}): StepFunctionsInvokeActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps):
        StepFunctionsInvokeActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StepFunctionsInvokeActionProps):
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps
  }
}
