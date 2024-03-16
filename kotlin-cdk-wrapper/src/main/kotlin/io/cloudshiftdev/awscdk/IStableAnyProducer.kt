@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any

/**
 * Interface for (stable) lazy untyped value producers.
 */
public interface IStableAnyProducer {
  /**
   * Produce the value.
   */
  public fun produce(): Any

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableAnyProducer): IStableAnyProducer =
        CdkObjectWrappers.wrap(cdkObject) as IStableAnyProducer

    internal fun unwrap(wrapped: IStableAnyProducer): software.amazon.awscdk.IStableAnyProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableAnyProducer
  }
}
