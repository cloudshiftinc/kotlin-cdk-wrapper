package io.cloudshiftdev.awscdk

import kotlin.String

public interface IStableStringProducer {
  /**
   * Produce the string value.
   */
  public fun produce(): String?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableStringProducer,
  ) : CdkObject(cdkObject), IStableStringProducer {
    /**
     * Produce the string value.
     */
    override fun produce(): String? = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableStringProducer):
        IStableStringProducer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableStringProducer):
        software.amazon.awscdk.IStableStringProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IStableStringProducer
  }
}
