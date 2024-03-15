@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

public interface IStableListProducer {
  public fun produce(): List<String>

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableListProducer,
  ) : CdkObject(cdkObject), IStableListProducer {
    override fun produce(): List<String> = unwrap(this).produce() ?: emptyList()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableListProducer): IStableListProducer =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableListProducer): software.amazon.awscdk.IStableListProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableListProducer
  }
}
