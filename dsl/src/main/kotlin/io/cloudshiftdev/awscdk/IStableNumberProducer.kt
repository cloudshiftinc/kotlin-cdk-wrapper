package io.cloudshiftdev.awscdk

import kotlin.Number

public interface IStableNumberProducer {
  /**
   * Produce the number value.
   */
  public fun produce(): Number?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableNumberProducer,
  ) : CdkObject(cdkObject), IStableNumberProducer {
    /**
     * Produce the number value.
     */
    override fun produce(): Number? = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableNumberProducer):
        IStableNumberProducer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableNumberProducer):
        software.amazon.awscdk.IStableNumberProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IStableNumberProducer
  }
}
