package io.cloudshiftdev.awscdk.services.stepfunctions

public interface INextable {
  public fun next(arg0: IChainable): Chain

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.stepfunctions.INextable,
  ) : INextable {
    public override fun next(arg0: IChainable): Chain =
        unwrap(this).next(arg0.let(IChainable::unwrap)).let(Chain::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.INextable): INextable
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INextable): software.amazon.awscdk.services.stepfunctions.INextable
        = (wrapped as Wrapper).cdkObject
  }
}
