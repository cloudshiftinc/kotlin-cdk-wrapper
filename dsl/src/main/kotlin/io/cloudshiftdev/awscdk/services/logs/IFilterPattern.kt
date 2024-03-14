package io.cloudshiftdev.awscdk.services.logs

import kotlin.String

public interface IFilterPattern {
  /**
   *
   */
  public fun logPatternString(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.logs.IFilterPattern,
  ) : IFilterPattern {
    /**
     *
     */
    override fun logPatternString(): String = unwrap(this).getLogPatternString()
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.IFilterPattern):
        IFilterPattern = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFilterPattern):
        software.amazon.awscdk.services.logs.IFilterPattern = (wrapped as Wrapper).cdkObject
  }
}
