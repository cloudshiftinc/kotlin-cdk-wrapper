package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction

public abstract class StreamEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.StreamEventSource,
) : CdkObject(cdkObject), IEventSource {
  /**
   * Called by `lambda.addEventSource` to allow the event source to bind to this function.
   *
   * @param _target 
   */
  public override fun bind(_target: IFunction) {
    unwrap(this).bind(_target.let(IFunction::unwrap))
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSource,
  ) : StreamEventSource(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lambda.eventsources.StreamEventSource):
        StreamEventSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StreamEventSource):
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSource = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lambda.eventsources.StreamEventSource
  }
}
