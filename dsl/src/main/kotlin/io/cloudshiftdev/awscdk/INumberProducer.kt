package io.cloudshiftdev.awscdk

import kotlin.Number

public interface INumberProducer {
  /**
   * Produce the number value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): Number?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.INumberProducer,
  ) : CdkObject(cdkObject), INumberProducer {
    /**
     * Produce the number value.
     *
     * @param context 
     */
    override fun produce(context: IResolveContext): Number? =
        unwrap(this).produce(context.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.INumberProducer): INumberProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: INumberProducer): software.amazon.awscdk.INumberProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.INumberProducer
  }
}
