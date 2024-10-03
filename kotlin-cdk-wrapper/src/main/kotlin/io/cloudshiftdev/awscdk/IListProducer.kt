@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.collections.List

/**
 * Interface for lazy list producers.
 */
public interface IListProducer {
  /**
   * Produce the list value.
   *
   * @param context 
   */
  public fun produce(context: IResolveContext): List<String>

  private class Wrapper(
    cdkObject: software.amazon.awscdk.IListProducer,
  ) : CdkObject(cdkObject),
      IListProducer {
    /**
     * Produce the list value.
     *
     * @param context 
     */
    override fun produce(context: IResolveContext): List<String> =
        unwrap(this).produce(context.let(IResolveContext.Companion::unwrap)) ?: emptyList()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IListProducer): IListProducer =
        CdkObjectWrappers.wrap(cdkObject) as? IListProducer ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IListProducer): software.amazon.awscdk.IListProducer = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.IListProducer
  }
}
