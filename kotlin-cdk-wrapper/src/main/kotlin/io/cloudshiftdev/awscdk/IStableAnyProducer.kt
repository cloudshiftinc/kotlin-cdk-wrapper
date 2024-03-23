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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IStableAnyProducer,
  ) : CdkObject(cdkObject), IStableAnyProducer {
    /**
     * Produce the value.
     */
    override fun produce(): Any = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableAnyProducer): IStableAnyProducer =
        CdkObjectWrappers.wrap(cdkObject) as? IStableAnyProducer ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableAnyProducer): software.amazon.awscdk.IStableAnyProducer =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.IStableAnyProducer
  }
}
