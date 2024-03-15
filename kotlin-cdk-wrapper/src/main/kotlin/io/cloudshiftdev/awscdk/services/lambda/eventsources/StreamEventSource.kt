@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.eventsources

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IEventSource
import io.cloudshiftdev.awscdk.services.lambda.IFunction

public abstract class StreamEventSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lambda.eventsources.StreamEventSource,
) : CdkObject(cdkObject), IEventSource {
  public override fun bind(arg0: IFunction) {
    unwrap(this).bind(arg0.let(IFunction::unwrap))
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
