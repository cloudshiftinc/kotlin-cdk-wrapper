package io.cloudshiftdev.awscdk

import kotlin.Any

public interface IPostProcessor {
  public fun postProcess(arg0: Any, arg1: IResolveContext): Any

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IPostProcessor,
  ) : IPostProcessor {
    override fun postProcess(arg0: Any, arg1: IResolveContext): Any = unwrap(this).postProcess(arg0,
        arg1.let(IResolveContext::unwrap))
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.IPostProcessor): IPostProcessor =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPostProcessor): software.amazon.awscdk.IPostProcessor = (wrapped
        as Wrapper).cdkObject
  }
}
