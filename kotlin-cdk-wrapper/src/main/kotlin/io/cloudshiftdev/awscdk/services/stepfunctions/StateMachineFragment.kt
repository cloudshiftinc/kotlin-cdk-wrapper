@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Base class for reusable state machine fragments.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.Stack;
 * import software.constructs.Construct;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.*;
 * public class MyJobProps {
 * private String jobFlavor;
 * public String getJobFlavor() {
 * return this.jobFlavor;
 * }
 * public MyJobProps jobFlavor(String jobFlavor) {
 * this.jobFlavor = jobFlavor;
 * return this;
 * }
 * }
 * public class MyJob extends StateMachineFragment {
 * public final State startState;
 * public final INextable[] endStates;
 * public MyJob(Construct parent, String id, MyJobProps props) {
 * super(parent, id);
 * Choice choice = new Choice(this, "Choice").when(Condition.stringEquals("$.branch", "left"), new
 * Pass(this, "Left Branch")).when(Condition.stringEquals("$.branch", "right"), new Pass(this, "Right
 * Branch"));
 * // ...
 * this.startState = choice;
 * this.endStates = choice.afterwards().getEndStates();
 * }
 * }
 * public class MyStack extends Stack {
 * public MyStack(Construct scope, String id) {
 * super(scope, id);
 * // Do 3 different variants of MyJob in parallel
 * Parallel parallel = new Parallel(this, "All jobs").branch(new MyJob(this, "Quick", new
 * MyJobProps().jobFlavor("quick")).prefixStates()).branch(new MyJob(this, "Medium", new
 * MyJobProps().jobFlavor("medium")).prefixStates()).branch(new MyJob(this, "Slow", new
 * MyJobProps().jobFlavor("slow")).prefixStates());
 * StateMachine.Builder.create(this, "MyStateMachine")
 * .definitionBody(DefinitionBody.fromChainable(parallel))
 * .build();
 * }
 * }
 * ```
 */
public abstract class StateMachineFragment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.StateMachineFragment,
) : Construct(cdkObject), IChainable {
  /**
   * The states to chain onto if this fragment is used.
   */
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  /**
   * Descriptive identifier for this chainable.
   */
  public override fun id(): String = unwrap(this).getId()

  /**
   * Continue normal execution with the given state.
   *
   * @param next 
   */
  public open fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  /**
   * Prefix the IDs of all states in this state machine fragment.
   *
   * Use this to avoid multiple copies of the state machine all having the
   * same state IDs.
   *
   * @param prefix The prefix to add.
   */
  public open fun prefixStates(): StateMachineFragment =
      unwrap(this).prefixStates().let(StateMachineFragment::wrap)

  /**
   * Prefix the IDs of all states in this state machine fragment.
   *
   * Use this to avoid multiple copies of the state machine all having the
   * same state IDs.
   *
   * @param prefix The prefix to add.
   */
  public open fun prefixStates(prefix: String): StateMachineFragment =
      unwrap(this).prefixStates(prefix).let(StateMachineFragment::wrap)

  /**
   * The start state of this state machine fragment.
   */
  public override fun startState(): State = unwrap(this).getStartState().let(State::wrap)

  /**
   * Wrap all states in this state machine fragment up into a single state.
   *
   * This can be used to add retry or error handling onto this state
   * machine fragment.
   *
   * Be aware that this changes the result of the inner state machine
   * to be an array with the result of the state machine in it. Adjust
   * your paths accordingly. For example, change 'outputPath' to
   * '$[0]'.
   *
   * @param options
   */
  public open fun toSingleState(): Parallel = unwrap(this).toSingleState().let(Parallel::wrap)

  /**
   * Wrap all states in this state machine fragment up into a single state.
   *
   * This can be used to add retry or error handling onto this state
   * machine fragment.
   *
   * Be aware that this changes the result of the inner state machine
   * to be an array with the result of the state machine in it. Adjust
   * your paths accordingly. For example, change 'outputPath' to
   * '$[0]'.
   *
   * @param options
   */
  public open fun toSingleState(options: SingleStateOptions): Parallel =
      unwrap(this).toSingleState(options.let(SingleStateOptions::unwrap)).let(Parallel::wrap)

  /**
   * Wrap all states in this state machine fragment up into a single state.
   *
   * This can be used to add retry or error handling onto this state
   * machine fragment.
   *
   * Be aware that this changes the result of the inner state machine
   * to be an array with the result of the state machine in it. Adjust
   * your paths accordingly. For example, change 'outputPath' to
   * '$[0]'.
   *
   * @param options
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd3e68c3c16b062615b4d52ab1a9fc2fbcf66e5642cf0f17f04be311b0e96b56")
  public open fun toSingleState(options: SingleStateOptions.Builder.() -> Unit): Parallel =
      toSingleState(SingleStateOptions(options))

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineFragment):
        StateMachineFragment = CdkObjectWrappers.wrap(cdkObject) as StateMachineFragment

    internal fun unwrap(wrapped: StateMachineFragment):
        software.amazon.awscdk.services.stepfunctions.StateMachineFragment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.StateMachineFragment
  }
}
