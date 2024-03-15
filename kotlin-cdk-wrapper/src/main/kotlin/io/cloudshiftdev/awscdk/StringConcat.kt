@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

/**
 * Converts all fragments to strings and concats those.
 *
 * Drops 'undefined's.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * StringConcat stringConcat = new StringConcat();
 * ```
 */
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
