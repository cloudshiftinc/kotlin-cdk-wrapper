@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct

public interface IAspect {
  public fun visit(arg0: IConstruct)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IAspect,
  ) : CdkObject(cdkObject), IAspect {
    override fun visit(arg0: IConstruct) {
      unwrap(this).visit(arg0.let(IConstruct::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IAspect): IAspect = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAspect): software.amazon.awscdk.IAspect = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IAspect
  }
}
