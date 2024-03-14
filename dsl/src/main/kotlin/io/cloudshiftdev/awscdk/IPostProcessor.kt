package io.cloudshiftdev.awscdk

import kotlin.Any

public interface IPostProcessor {
  /**
   * Process the completely resolved value, after full recursion/resolution has happened.
   *
   * @param input 
   * @param context 
   */
  public fun postProcess(input: Any, context: IResolveContext): Any

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.IPostProcessor,
  ) : IPostProcessor {
    /**
     * Process the completely resolved value, after full recursion/resolution has happened.
     *
     * @param input 
     * @param context 
     */
    override fun postProcess(input: Any, context: IResolveContext): Any =
        unwrap(this).postProcess(input, context.let(IResolveContext::unwrap))
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
