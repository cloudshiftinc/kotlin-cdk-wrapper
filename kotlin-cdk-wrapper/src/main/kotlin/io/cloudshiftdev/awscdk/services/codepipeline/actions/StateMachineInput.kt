@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline.actions

import com.fasterxml.jackson.databind.node.ObjectNode
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.codepipeline.Artifact
import io.cloudshiftdev.awscdk.services.codepipeline.ArtifactPath
import kotlin.Any
import kotlin.String

/**
 * Represents the input for the StateMachine.
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
public open class StateMachineInput(
  cdkObject: software.amazon.awscdk.services.codepipeline.actions.StateMachineInput,
) : CdkObject(cdkObject) {
  /**
   * When InputType is set to Literal (default), the Input field is used directly as the input for
   * the state machine execution.
   *
   * Otherwise, the state machine is invoked with an empty JSON object {}.
   *
   * When InputType is set to FilePath, this field is required.
   * An input artifact is also required when InputType is set to FilePath.
   *
   * Default: - none
   */
  public open fun input(): Any = unwrap(this).getInput()

  /**
   * The optional input Artifact of the Action.
   *
   * If InputType is set to FilePath, this artifact is required
   * and is used to source the input for the state machine execution.
   *
   * Default: - the Action will not have any inputs
   *
   * [Documentation](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference-StepFunctions.html#action-reference-StepFunctions-example)
   */
  public open fun inputArtifact(): Artifact? = unwrap(this).getInputArtifact()?.let(Artifact::wrap)

  /**
   * Optional StateMachine InputType InputType can be Literal or FilePath.
   *
   * Default: - Literal
   */
  public open fun inputType(): String? = unwrap(this).getInputType()

  public companion object {
    public fun filePath(inputFile: ArtifactPath): StateMachineInput =
        software.amazon.awscdk.services.codepipeline.actions.StateMachineInput.filePath(inputFile.let(ArtifactPath::unwrap)).let(StateMachineInput::wrap)

    public fun literal(`object`: ObjectNode): StateMachineInput =
        software.amazon.awscdk.services.codepipeline.actions.StateMachineInput.literal(`object`).let(StateMachineInput::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.actions.StateMachineInput):
        StateMachineInput = StateMachineInput(cdkObject)

    internal fun unwrap(wrapped: StateMachineInput):
        software.amazon.awscdk.services.codepipeline.actions.StateMachineInput = wrapped.cdkObject
        as software.amazon.awscdk.services.codepipeline.actions.StateMachineInput
  }
}
