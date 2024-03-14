package io.cloudshiftdev.awscdk

import kotlin.Any

public interface IFragmentConcatenator {
  /**
   * Join the fragment on the left and on the right.
   *
   * @param left 
   * @param right 
   */
  public fun join(left: Any, right: Any): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IFragmentConcatenator,
  ) : CdkObject(cdkObject), IFragmentConcatenator {
    /**
     * Join the fragment on the left and on the right.
     *
     * @param left 
     * @param right 
     */
    override fun join(left: Any, right: Any): Any = unwrap(this).join(left, right)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IFragmentConcatenator):
        IFragmentConcatenator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFragmentConcatenator):
        software.amazon.awscdk.IFragmentConcatenator = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IFragmentConcatenator
  }
}
