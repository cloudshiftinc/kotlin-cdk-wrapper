@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IFilterPattern {
  public fun logPatternString(): String

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.logs.IFilterPattern,
  ) : CdkObject(cdkObject), IFilterPattern {
    override fun logPatternString(): String = unwrap(this).getLogPatternString()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.IFilterPattern):
        IFilterPattern = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFilterPattern):
        software.amazon.awscdk.services.logs.IFilterPattern = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.logs.IFilterPattern
  }
}