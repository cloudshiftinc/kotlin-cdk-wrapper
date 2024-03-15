@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions

import io.cloudshiftdev.awscdk.common.CdkObject

public interface INextable {
  public fun next(arg0: IChainable): Chain

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.INextable,
  ) : CdkObject(cdkObject), INextable {
    override fun next(arg0: IChainable): Chain =
        unwrap(this).next(arg0.let(IChainable::unwrap)).let(Chain::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.INextable): INextable
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: INextable): software.amazon.awscdk.services.stepfunctions.INextable
        = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.INextable
  }
}
