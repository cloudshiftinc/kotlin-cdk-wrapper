package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.collections.List

public interface IListProducer {
  /**
   * Produce the list value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IListProducer,
  ) : CdkObject(cdkObject), IListProducer {
    /**
     * Produce the list value.
     *
     * @param context 
     */
    override fun produce(context: IResolveContext): List<String> =
        unwrap(this).produce(context.let(IResolveContext::unwrap)) ?: emptyList()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IListProducer): IListProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListProducer): software.amazon.awscdk.IListProducer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IListProducer
  }
}
