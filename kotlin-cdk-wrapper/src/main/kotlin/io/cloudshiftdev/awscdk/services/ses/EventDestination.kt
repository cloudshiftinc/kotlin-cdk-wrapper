@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.collections.List

public abstract class EventDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
) : CdkObject(cdkObject) {
  public open fun dimensions(): List<CloudWatchDimension> =
      unwrap(this).getDimensions()?.map(CloudWatchDimension::wrap) ?: emptyList()

  public open fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
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
        software.amazon.awscdk.services.ses.EventDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.EventDestination
  }
}
