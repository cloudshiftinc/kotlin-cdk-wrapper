package io.cloudshiftdev.awscdk

import kotlin.Any

public interface IStableAnyProducer {
  /**
   * Produce the value.
   */
  public fun produce(): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableAnyProducer,
  ) : CdkObject(cdkObject), IStableAnyProducer {
    /**
     * Produce the value.
     */
    override fun produce(): Any = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableAnyProducer): IStableAnyProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableAnyProducer): software.amazon.awscdk.IStableAnyProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableAnyProducer
  }
}
