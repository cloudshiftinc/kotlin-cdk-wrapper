@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction

/**
 * Use an stream as an event source for AWS Lambda.
 */
public abstract class StreamEventSource(
  cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSource,
) : CdkObject(cdkObject),
    IEventSource {
  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param _target 
   */
  public override fun bind(target: IFunction) {
    unwrap(this).bind(target.let(IFunction.Companion::unwrap))
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSource,
  ) : StreamEventSource(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSource):
        StreamEventSource = CdkObjectWrappers.wrap(cdkObject) as? StreamEventSource ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamEventSource):
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSource = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSource
  }
}
