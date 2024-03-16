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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.IFilterPattern):
        IFilterPattern = CdkObjectWrappers.wrap(cdkObject) as IFilterPattern

    internal fun unwrap(wrapped: IFilterPattern):
        software.amazon.awscdk.services.logs.IFilterPattern = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.IFilterPattern
  }
}
