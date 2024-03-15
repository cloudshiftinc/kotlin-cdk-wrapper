@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number

public interface INumberProducer {
  public fun produce(arg0: IResolveContext): Number?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.INumberProducer,
  ) : CdkObject(cdkObject), INumberProducer {
    override fun produce(arg0: IResolveContext): Number? =
        unwrap(this).produce(arg0.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.INumberProducer): INumberProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: INumberProducer): software.amazon.awscdk.INumberProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.INumberProducer
  }
}
