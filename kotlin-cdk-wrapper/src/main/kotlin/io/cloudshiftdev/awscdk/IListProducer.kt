@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public interface IListProducer {
  public fun produce(arg0: IResolveContext): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IListProducer,
  ) : CdkObject(cdkObject), IListProducer {
    override fun produce(arg0: IResolveContext): List<String> =
        unwrap(this).produce(arg0.let(IResolveContext::unwrap)) ?: emptyList()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IListProducer): IListProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListProducer): software.amazon.awscdk.IListProducer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IListProducer
  }
}
