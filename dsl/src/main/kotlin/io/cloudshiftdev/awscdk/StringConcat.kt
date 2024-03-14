package io.cloudshiftdev.awscdk

import kotlin.Any

public open class StringConcat internal constructor(
  internal override val cdkObject: software.amazon.awscdk.StringConcat,
) : CdkObject(cdkObject), IFragmentConcatenator {
  /**
   * Join the fragment on the left and on the right.
   *
   * @param left 
   * @param right 
   */
  public override fun join(left: Any, right: Any): Any = unwrap(this).join(left, right)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.StringConcat): StringConcat =
        StringConcat(cdkObject)

    internal fun unwrap(wrapped: StringConcat): software.amazon.awscdk.StringConcat =
        wrapped.cdkObject
  }
}
