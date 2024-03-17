@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number

/**
 * Interface for (stable) lazy number producers.
 */
public interface IStableNumberProducer {
  /**
   * Produce the number value.
   */
  public fun produce(): Number?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.IStableNumberProducer,
  ) : CdkObject(cdkObject), IStableNumberProducer {
    /**
     * Produce the number value.
     */
    override fun produce(): Number? = unwrap(this).produce()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IStableNumberProducer):
        IStableNumberProducer = CdkObjectWrappers.wrap(cdkObject) as? IStableNumberProducer ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IStableNumberProducer):
        software.amazon.awscdk.IStableNumberProducer = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.IStableNumberProducer
  }
}
