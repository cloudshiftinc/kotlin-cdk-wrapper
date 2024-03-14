package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.collections.List

public abstract class EventDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
) {
  public open fun dimensions(): List<CloudWatchDimension> =
      unwrap(this).getDimensions()?.map(CloudWatchDimension::wrap) ?: emptyList()

  public open fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
  ) : EventDestination(cdkObject)

  public companion object {
    public open fun cloudWatchDimensions(dimensions: List<CloudWatchDimension>): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.cloudWatchDimensions(dimensions.map(CloudWatchDimension::unwrap)).let(EventDestination::wrap)

    public open fun snsTopic(topic: ITopic): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.snsTopic(topic.let(ITopic::unwrap)).let(EventDestination::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EventDestination):
        EventDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventDestination):
        software.amazon.awscdk.services.ses.EventDestination = (wrapped as Wrapper).cdkObject
  }
}
