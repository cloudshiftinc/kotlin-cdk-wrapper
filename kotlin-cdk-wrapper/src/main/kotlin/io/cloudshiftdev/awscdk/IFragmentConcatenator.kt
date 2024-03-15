@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public interface IFragmentConcatenator {
  public fun join(arg0: Any, arg1: Any): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IFragmentConcatenator,
  ) : CdkObject(cdkObject), IFragmentConcatenator {
    override fun join(arg0: Any, arg1: Any): Any = unwrap(this).join(arg0, arg1)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IFragmentConcatenator):
        IFragmentConcatenator = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IFragmentConcatenator):
        software.amazon.awscdk.IFragmentConcatenator = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IFragmentConcatenator
  }
}
