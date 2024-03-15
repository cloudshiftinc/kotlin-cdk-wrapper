@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public abstract class StateMachineFragment internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.stepfunctions.StateMachineFragment,
) : Construct(cdkObject), IChainable {
  public override fun endStates(): List<INextable> =
      unwrap(this).getEndStates().map(INextable::wrap)

  public override fun id(): String = unwrap(this).getId()

  public open fun next(next: IChainable): Chain =
      unwrap(this).next(next.let(IChainable::unwrap)).let(Chain::wrap)

  public open fun prefixStates(): StateMachineFragment =
      unwrap(this).prefixStates().let(StateMachineFragment::wrap)

  public open fun prefixStates(prefix: String): StateMachineFragment =
      unwrap(this).prefixStates(prefix).let(StateMachineFragment::wrap)

  public override fun startState(): State = unwrap(this).getStartState().let(State::wrap)

  public open fun toSingleState(): Parallel = unwrap(this).toSingleState().let(Parallel::wrap)

  public open fun toSingleState(options: SingleStateOptions): Parallel =
      unwrap(this).toSingleState(options.let(SingleStateOptions::unwrap)).let(Parallel::wrap)

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fd3e68c3c16b062615b4d52ab1a9fc2fbcf66e5642cf0f17f04be311b0e96b56")
  public open fun toSingleState(options: SingleStateOptions.Builder.() -> Unit): Parallel =
      toSingleState(SingleStateOptions(options))

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineFragment,
  ) : StateMachineFragment(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.StateMachineFragment):
        StateMachineFragment = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StateMachineFragment):
        software.amazon.awscdk.services.stepfunctions.StateMachineFragment = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.StateMachineFragment
  }
}
