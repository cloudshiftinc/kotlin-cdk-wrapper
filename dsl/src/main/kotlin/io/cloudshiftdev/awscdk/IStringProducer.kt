package io.cloudshiftdev.awscdk

import kotlin.String

public interface IStringProducer {
  /**
   * Produce the string value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): String?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStringProducer,
  ) : CdkObject(cdkObject), IStringProducer {
    /**
     * Produce the string value.
     *
     * @param context 
     */
    override fun produce(context: IResolveContext): String? =
        unwrap(this).produce(context.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStringProducer): IStringProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStringProducer): software.amazon.awscdk.IStringProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IStringProducer
  }
}
