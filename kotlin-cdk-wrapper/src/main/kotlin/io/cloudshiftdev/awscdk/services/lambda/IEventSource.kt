@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * An abstract class which represents an AWS Lambda event source.
 */
public interface IEventSource {
  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param target That lambda function to bind to. 
   */
  public fun bind(target: IFunction)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSource): IEventSource
        = CdkObjectWrappers.wrap(cdkObject) as IEventSource

    internal fun unwrap(wrapped: IEventSource): software.amazon.awscdk.services.lambda.IEventSource
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IEventSource
  }
}
