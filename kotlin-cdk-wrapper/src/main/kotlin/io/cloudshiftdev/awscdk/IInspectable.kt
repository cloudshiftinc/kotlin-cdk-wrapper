@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject

public interface IInspectable {
  public fun inspect(arg0: TreeInspector)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IInspectable,
  ) : CdkObject(cdkObject), IInspectable {
    override fun inspect(arg0: TreeInspector) {
      unwrap(this).inspect(arg0.let(TreeInspector::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IInspectable): IInspectable =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IInspectable): software.amazon.awscdk.IInspectable = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IInspectable
  }
}
