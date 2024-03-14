package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.CdkObject

public interface INextable {
  /**
   * Go to the indicated state after this state.
   *
   * @return The chain of states built up
   * @param state 
   */
  public fun next(state: IChainable): Chain

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.INextable,
  ) : CdkObject(cdkObject), INextable {
    /**
     * Go to the indicated state after this state.
     *
     * @return The chain of states built up
     * @param state 
     */
    override fun next(state: IChainable): Chain =
        unwrap(this).next(state.let(IChainable::unwrap)).let(Chain::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.INextable): INextable
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INextable): software.amazon.awscdk.services.stepfunctions.INextable
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.INextable
  }
}
