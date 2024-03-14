package io.cloudshiftdev.awscdk

import kotlin.String
import kotlin.collections.List

public interface IStableListProducer {
  /**
   * Produce the list value.
   */
  public fun produce(): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableListProducer,
  ) : CdkObject(cdkObject), IStableListProducer {
    /**
     * Produce the list value.
     */
    override fun produce(): List<String> = unwrap(this).produce() ?: emptyList()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableListProducer): IStableListProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableListProducer): software.amazon.awscdk.IStableListProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableListProducer
  }
}
