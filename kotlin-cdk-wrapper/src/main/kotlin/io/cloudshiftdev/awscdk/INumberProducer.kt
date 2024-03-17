@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number

/**
 * Interface for lazy number producers.
 */
public interface INumberProducer {
  /**
   * Produce the number value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): Number?

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.INumberProducer,
  ) : CdkObject(cdkObject), INumberProducer {
    /**
     * Produce the number value.
     *
     * @param context 
     */
    override fun produce(context: IResolveContext): Number? =
        unwrap(this).produce(context.let(IResolveContext::unwrap))
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.INumberProducer): INumberProducer =
        CdkObjectWrappers.wrap(cdkObject) as? INumberProducer ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: INumberProducer): software.amazon.awscdk.INumberProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.INumberProducer
  }
}
