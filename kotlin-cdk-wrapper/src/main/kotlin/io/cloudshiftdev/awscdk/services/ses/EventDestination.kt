@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.events.IEventBus
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * An event destination.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.events.*;
 * ConfigurationSet myConfigurationSet;
 * IEventBus bus = EventBus.fromEventBusName(this, "EventBus", "default");
 * myConfigurationSet.addEventDestination("ToEventBus",
 * ConfigurationSetEventDestinationOptions.builder()
 * .destination(EventDestination.eventBus(bus))
 * .build());
 * ```
 */
public abstract class EventDestination(
  cdkObject: software.amazon.awscdk.services.ses.EventDestination,
) : CdkObject(cdkObject) {
  /**
   * Use Event Bus as event destination.
   *
   * Default: - do not send events to Event bus
   */
  public open fun bus(): IEventBus? = unwrap(this).getBus()?.let(IEventBus::wrap)

  /**
   * A list of CloudWatch dimensions upon which to categorize your emails.
   *
   * Default: - do not send events to CloudWatch
   */
  public open fun dimensions(): List<CloudWatchDimension> =
      unwrap(this).getDimensions()?.map(CloudWatchDimension::wrap) ?: emptyList()

  /**
   * Use Firehose Delivery Stream.
   *
   * Default: - do not send events to Firehose Delivery Stream
   */
  public open fun stream(): FirehoseDeliveryStreamDestination? =
      unwrap(this).getStream()?.let(FirehoseDeliveryStreamDestination::wrap)

  /**
   * A SNS topic to use as event destination.
   *
   * Default: - do not send events to a SNS topic
   */
  public open fun topic(): ITopic? = unwrap(this).getTopic()?.let(ITopic::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.EventDestination,
  ) : EventDestination(cdkObject)

  public companion object {
    public fun cloudWatchDimensions(dimensions: List<CloudWatchDimension>): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.cloudWatchDimensions(dimensions.map(CloudWatchDimension.Companion::unwrap)).let(EventDestination::wrap)

    public fun cloudWatchDimensions(vararg dimensions: CloudWatchDimension): EventDestination =
        cloudWatchDimensions(dimensions.toList())

    public fun eventBus(eventBus: IEventBus): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.eventBus(eventBus.let(IEventBus.Companion::unwrap)).let(EventDestination::wrap)

    public fun firehoseDeliveryStream(stream: FirehoseDeliveryStreamDestination): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.firehoseDeliveryStream(stream.let(FirehoseDeliveryStreamDestination.Companion::unwrap)).let(EventDestination::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("693dd61370d67abdfb13f35e7e82980839552fb7850fa79006347c27c1058f53")
    public fun firehoseDeliveryStream(stream: FirehoseDeliveryStreamDestination.Builder.() -> Unit):
        EventDestination = firehoseDeliveryStream(FirehoseDeliveryStreamDestination(stream))

    public fun snsTopic(topic: ITopic): EventDestination =
        software.amazon.awscdk.services.ses.EventDestination.snsTopic(topic.let(ITopic.Companion::unwrap)).let(EventDestination::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.EventDestination):
        EventDestination = CdkObjectWrappers.wrap(cdkObject) as? EventDestination ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EventDestination):
        software.amazon.awscdk.services.ses.EventDestination = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ses.EventDestination
  }
}
