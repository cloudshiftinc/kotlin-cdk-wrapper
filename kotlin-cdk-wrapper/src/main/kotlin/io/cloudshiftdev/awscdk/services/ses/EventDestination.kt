@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.collections.List

/**
 * An event destination.
 *
 * Example:
 *
 * ```
 * ConfigurationSet myConfigurationSet;
 * Topic myTopic;
 * myConfigurationSet.addEventDestination("ToSns", ConfigurationSetEventDestinationOptions.builder()
 * .destination(EventDestination.snsTopic(myTopic))
 * .build());
 * ```
 */
public abstract class EventDestination internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ses.EventDestination,
) : CdkObject(cdkObject) {
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
        EventDestination = CdkObjectWrappers.wrap(cdkObject) as? EventDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventDestination):
        software.amazon.awscdk.services.ses.EventDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.EventDestination
  }
}
