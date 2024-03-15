@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public interface IAnyProducer {
  public fun produce(arg0: IResolveContext): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IAnyProducer,
  ) : CdkObject(cdkObject), IAnyProducer {
    override fun produce(arg0: IResolveContext): Any =
        unwrap(this).produce(arg0.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IAnyProducer): IAnyProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IAnyProducer): software.amazon.awscdk.IAnyProducer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IAnyProducer
  }
}
