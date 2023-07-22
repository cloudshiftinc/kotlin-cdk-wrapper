@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline.actions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codepipeline.Artifact
import software.amazon.awscdk.services.codepipeline.actions.StateMachineInput
import software.amazon.awscdk.services.codepipeline.actions.StepFunctionsInvokeActionProps
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.stepfunctions.IStateMachine

@CdkDslMarker
public class StepFunctionsInvokeActionPropsDsl {
  private val cdkBuilder: StepFunctionsInvokeActionProps.Builder =
      StepFunctionsInvokeActionProps.builder()

  /**
   * @param actionName The physical, human-readable name of the Action. 
   * Note that Action names must be unique within a single Stage.
   */
  public fun actionName(actionName: String) {
    cdkBuilder.actionName(actionName)
  }

  /**
   * @param executionNamePrefix Prefix (optional).
   * By default, the action execution ID is used as the state machine execution name.
   * If a prefix is provided, it is prepended to the action execution ID with a hyphen and
   * together used as the state machine execution name.
   */
  public fun executionNamePrefix(executionNamePrefix: String) {
    cdkBuilder.executionNamePrefix(executionNamePrefix)
  }

  /**
   * @param output The optional output Artifact of the Action.
   */
  public fun output(output: Artifact) {
    cdkBuilder.output(output)
  }

  /**
   * @param role The Role in which context's this Action will be executing in.
   * The Pipeline's Role will assume this Role
   * (the required permissions for that will be granted automatically)
   * right before executing this Action.
   * This Action will be passed into your `IAction.bind`
   * method in the `ActionBindOptions.role` property.
   */
  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  /**
   * @param runOrder The runOrder property for this Action.
   * RunOrder determines the relative order in which multiple Actions in the same Stage execute.
   */
  public fun runOrder(runOrder: Number) {
    cdkBuilder.runOrder(runOrder)
  }

  /**
   * @param stateMachine The state machine to invoke. 
   */
  public fun stateMachine(stateMachine: IStateMachine) {
    cdkBuilder.stateMachine(stateMachine)
  }

  /**
   * @param stateMachineInput Represents the input to the StateMachine.
   * This includes input artifact, input type and the statemachine input.
   */
  public fun stateMachineInput(stateMachineInput: StateMachineInput) {
    cdkBuilder.stateMachineInput(stateMachineInput)
  }

  /**
   * @param variablesNamespace The name of the namespace to use for variables emitted by this
   * action.
   */
  public fun variablesNamespace(variablesNamespace: String) {
    cdkBuilder.variablesNamespace(variablesNamespace)
  }

  public fun build(): StepFunctionsInvokeActionProps = cdkBuilder.build()
}
