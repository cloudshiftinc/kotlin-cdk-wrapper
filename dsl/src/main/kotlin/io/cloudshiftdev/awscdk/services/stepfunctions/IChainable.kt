package io.cloudshiftdev.awscdk.services.stepfunctions

import kotlin.String
import kotlin.collections.List

public interface IChainable {
  public fun endStates(): List<INextable>

  public fun id(): String

  public fun startState(): State

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.IChainable,
  ) : IChainable {
    override fun endStates(): List<INextable> = unwrap(this).getEndStates().map(INextable::wrap)

    override fun id(): String = unwrap(this).getId()

    override fun startState(): State = unwrap(this).getStartState().let(State::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.IChainable):
        IChainable = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IChainable):
        software.amazon.awscdk.services.stepfunctions.IChainable = (wrapped as Wrapper).cdkObject
  }
}
