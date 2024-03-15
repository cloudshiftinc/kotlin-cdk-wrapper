@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.common.CdkObject

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

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.IEventSource,
  ) : CdkObject(cdkObject), IEventSource {
    /**
     * Called by `lambda.addEventSource` to allow the event source to bind to this function.
     *
     * @param target That lambda function to bind to. 
     */
    override fun bind(target: IFunction) {
      unwrap(this).bind(target.let(IFunction::unwrap))
    }
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.IEventSource): IEventSource
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEventSource): software.amazon.awscdk.services.lambda.IEventSource
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.lambda.IEventSource
  }
}
