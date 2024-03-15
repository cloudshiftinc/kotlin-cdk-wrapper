@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public interface IPostProcessor {
  public fun postProcess(arg0: Any, arg1: IResolveContext): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IPostProcessor,
  ) : CdkObject(cdkObject), IPostProcessor {
    override fun postProcess(arg0: Any, arg1: IResolveContext): Any = unwrap(this).postProcess(arg0,
        arg1.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IPostProcessor): IPostProcessor =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPostProcessor): software.amazon.awscdk.IPostProcessor = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IPostProcessor
  }
}
