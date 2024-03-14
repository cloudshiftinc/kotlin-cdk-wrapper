package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.collections.List

public abstract class EventDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
) {
  /**
   * A list of CloudWatch dimensions upon which to categorize your emails.
   *
   * Default: - do not send events to CloudWatch
   */
  public open fun dimensions(): List<CloudWatchDimension> =
      unwrap(this).getDimensions()?.map(CloudWatchDimension::wrap) ?: emptyList()

  /**
   * A SNS topic to use as event destination.
   *
   * Default: - do not send events to a SNS topic
   */
  public open fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
  ) : EventDestination(cdkObject)

  public companion object {
    public fun cloudWatchDimensions(dimensions: List<CloudWatchDimension>): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.cloudWatchDimensions(dimensions.map(CloudWatchDimension::unwrap)).let(EventDestination::wrap)

    public fun cloudWatchDimensions(vararg dimensions: CloudWatchDimension): EventDestination =
        cloudWatchDimensions(dimensions.toList())

    public fun snsTopic(topic: ITopic): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.snsTopic(topic.let(ITopic::unwrap)).let(EventDestination::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EventDestination):
        EventDestination = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventDestination):
        software.amazon.awscdk.services.ses.EventDestination = (wrapped as Wrapper).cdkObject
  }
}
