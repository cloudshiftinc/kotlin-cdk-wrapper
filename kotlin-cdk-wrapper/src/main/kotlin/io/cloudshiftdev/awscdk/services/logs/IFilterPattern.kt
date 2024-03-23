@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Interface for objects that can render themselves to log patterns.
 */
public interface IFilterPattern {
  /**
   *
   */
  public fun logPatternString(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.logs.IFilterPattern,
  ) : CdkObject(cdkObject), IFilterPattern {
    /**
     *
     */
    override fun logPatternString(): String = unwrap(this).getLogPatternString()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.IFilterPattern):
        IFilterPattern = CdkObjectWrappers.wrap(cdkObject) as? IFilterPattern ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFilterPattern):
        software.amazon.awscdk.services.logs.IFilterPattern = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.IFilterPattern
  }
}
