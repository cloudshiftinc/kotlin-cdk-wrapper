@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * A DLQ for an event source.
 */
public interface IEventSourceDlq {
  /**
   * Returns the DLQ destination config of the DLQ.
   *
   * @param target 
   * @param targetHandler 
   */
  public fun bind(target: IEventSourceMapping, targetHandler: IFunction): DlqDestinationConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq,
  ) : CdkObject(cdkObject),
      IEventSourceDlq {
    /**
     * Returns the DLQ destination config of the DLQ.
     *
     * @param target 
     * @param targetHandler 
     */
    override fun bind(target: IEventSourceMapping, targetHandler: IFunction): DlqDestinationConfig =
        unwrap(this).bind(target.let(IEventSourceMapping.Companion::unwrap),
        targetHandler.let(IFunction.Companion::unwrap)).let(DlqDestinationConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSourceDlq):
        IEventSourceDlq = CdkObjectWrappers.wrap(cdkObject) as? IEventSourceDlq ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSourceDlq):
        software.amazon.awscdk.services.lambda.IEventSourceDlq = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.IEventSourceDlq
  }
}
