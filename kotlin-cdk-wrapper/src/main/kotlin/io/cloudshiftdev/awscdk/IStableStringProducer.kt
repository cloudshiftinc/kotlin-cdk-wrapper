@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public interface IStableStringProducer {
  public fun produce(): String?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableStringProducer,
  ) : CdkObject(cdkObject), IStableStringProducer {
    override fun produce(): String? = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableStringProducer):
        IStableStringProducer = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableStringProducer):
        software.amazon.awscdk.IStableStringProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IStableStringProducer
  }
}
