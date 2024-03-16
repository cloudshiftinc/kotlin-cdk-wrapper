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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.INumberProducer): INumberProducer =
        CdkObjectWrappers.wrap(cdkObject) as INumberProducer

    internal fun unwrap(wrapped: INumberProducer): software.amazon.awscdk.INumberProducer = (wrapped
        as CdkObject).cdkObject as software.amazon.awscdk.INumberProducer
  }
}
