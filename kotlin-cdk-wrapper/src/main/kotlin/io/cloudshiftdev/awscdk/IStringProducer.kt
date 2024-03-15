@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IStringProducer {
  public fun produce(arg0: IResolveContext): String?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStringProducer,
  ) : CdkObject(cdkObject), IStringProducer {
    override fun produce(arg0: IResolveContext): String? =
        unwrap(this).produce(arg0.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStringProducer): IStringProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStringProducer): software.amazon.awscdk.IStringProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.IStringProducer
  }
}
