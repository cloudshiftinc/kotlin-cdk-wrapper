package io.cloudshiftdev.awscdk

import kotlin.Any

public interface IAnyProducer {
  /**
   * Produce the value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IAnyProducer,
  ) : CdkObject(cdkObject), IAnyProducer {
    /**
     * Produce the value.
     *
     * @param context 
     */
    override fun produce(context: IResolveContext): Any =
        unwrap(this).produce(context.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IAnyProducer): IAnyProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAnyProducer): software.amazon.awscdk.IAnyProducer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IAnyProducer
  }
}
