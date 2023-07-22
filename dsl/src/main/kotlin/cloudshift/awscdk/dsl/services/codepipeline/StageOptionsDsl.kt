@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codepipeline

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.codepipeline.IAction
import software.amazon.awscdk.services.codepipeline.StageOptions
import software.amazon.awscdk.services.codepipeline.StagePlacement

/**
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
public class StageOptionsDsl {
  private val cdkBuilder: StageOptions.Builder = StageOptions.builder()

  private val _actions: MutableList<IAction> = mutableListOf()

  /**
   * @param actions The list of Actions to create this Stage with.
   * You can always add more Actions later by calling `IStage#addAction`.
   */
  public fun actions(vararg actions: IAction) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * @param actions The list of Actions to create this Stage with.
   * You can always add more Actions later by calling `IStage#addAction`.
   */
  public fun actions(actions: Collection<IAction>) {
    _actions.addAll(actions)
  }

  /**
   * @param placement the value to be set.
   */
  public fun placement(placement: StagePlacementDsl.() -> Unit = {}) {
    val builder = StagePlacementDsl()
    builder.apply(placement)
    cdkBuilder.placement(builder.build())
  }

  /**
   * @param placement the value to be set.
   */
  public fun placement(placement: StagePlacement) {
    cdkBuilder.placement(placement)
  }

  /**
   * @param stageName The physical, human-readable name to assign to this Pipeline Stage. 
   */
  public fun stageName(stageName: String) {
    cdkBuilder.stageName(stageName)
  }

  /**
   * @param transitionDisabledReason The reason for disabling transition to this stage.
   * Only applicable
   * if `transitionToEnabled` is set to `false`.
   */
  public fun transitionDisabledReason(transitionDisabledReason: String) {
    cdkBuilder.transitionDisabledReason(transitionDisabledReason)
  }

  /**
   * @param transitionToEnabled Whether to enable transition to this stage.
   */
  public fun transitionToEnabled(transitionToEnabled: Boolean) {
    cdkBuilder.transitionToEnabled(transitionToEnabled)
  }

  public fun build(): StageOptions {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
