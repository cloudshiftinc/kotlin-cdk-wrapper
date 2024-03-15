@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any

public interface IStableAnyProducer {
  public fun produce(): Any

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableAnyProducer,
  ) : CdkObject(cdkObject), IStableAnyProducer {
    override fun produce(): Any = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableAnyProducer): IStableAnyProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableAnyProducer): software.amazon.awscdk.IStableAnyProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableAnyProducer
  }
}
