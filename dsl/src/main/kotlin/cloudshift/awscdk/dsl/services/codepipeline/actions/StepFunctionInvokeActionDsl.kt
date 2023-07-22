@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.StateMachineInput
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionInvokeAction
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.IStateMachine

/**
 * StepFunctionInvokeAction that is provided by an AWS CodePipeline.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.stepfunctions.*;
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
@CdkDslMarker
public class StepFunctionInvokeActionDsl {
  private val cdkBuilder: StepFunctionInvokeAction.Builder =
      StepFunctionInvokeAction.Builder.create()

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
  public fun executionNamePrefix(executionNamePrefix: String) {
    cdkBuilder.executionNamePrefix(executionNamePrefix)
  }

  /**
   * The optional output Artifact of the Action.
   *
   * Default: the Action will not have any outputs
   *
   * @param output The optional output Artifact of the Action. 
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
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
   * @param runOrder The runOrder property for this Action. 
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * The state machine to invoke.
   *
   * @param stateMachine The state machine to invoke. 
   */
  public fun stateMachine(stateMachine: IStateMachine) {
    cdkBuilder.stateMachine(stateMachine)
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
  public fun stateMachineInput(stateMachineInput: StateMachineInput) {
    cdkBuilder.stateMachineInput(stateMachineInput)
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
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): StepFunctionInvokeAction = cdkBuilder.build()
}
