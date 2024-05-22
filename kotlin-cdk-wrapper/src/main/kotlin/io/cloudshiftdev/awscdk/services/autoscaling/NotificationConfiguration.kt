@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

/**
 * AutoScalingGroup fleet change notifications configurations.
 *
 * You can configure AutoScaling to send an SNS notification whenever your Auto Scaling group
 * scales.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.autoscaling.*;
 * import io.cloudshiftdev.awscdk.services.sns.*;
 * ScalingEvents scalingEvents;
 * Topic topic;
 * NotificationConfiguration notificationConfiguration = NotificationConfiguration.builder()
 * .topic(topic)
 * // the properties below are optional
 * .scalingEvents(scalingEvents)
 * .build();
 * ```
 */
public interface NotificationConfiguration {
  /**
   * Which fleet scaling events triggers a notification.
   *
   * Default: ScalingEvents.ALL
   */
  public fun scalingEvents(): ScalingEvents? =
      unwrap(this).getScalingEvents()?.let(ScalingEvents::wrap)

  /**
   * SNS topic to send notifications about fleet scaling events.
   */
  public fun topic(): ITopic

  /**
   * A builder for [NotificationConfiguration]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param scalingEvents Which fleet scaling events triggers a notification.
     */
    public fun scalingEvents(scalingEvents: ScalingEvents)

    /**
     * @param topic SNS topic to send notifications about fleet scaling events. 
     */
    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration.Builder =
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration.builder()

    /**
     * @param scalingEvents Which fleet scaling events triggers a notification.
     */
    override fun scalingEvents(scalingEvents: ScalingEvents) {
      cdkBuilder.scalingEvents(scalingEvents.let(ScalingEvents.Companion::unwrap))
    }

    /**
     * @param topic SNS topic to send notifications about fleet scaling events. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.NotificationConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.autoscaling.NotificationConfiguration,
  ) : CdkObject(cdkObject), NotificationConfiguration {
    /**
     * Which fleet scaling events triggers a notification.
     *
     * Default: ScalingEvents.ALL
     */
    override fun scalingEvents(): ScalingEvents? =
        unwrap(this).getScalingEvents()?.let(ScalingEvents::wrap)

    /**
     * SNS topic to send notifications about fleet scaling events.
     */
    override fun topic(): ITopic = unwrap(this).getTopic().let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.NotificationConfiguration):
        NotificationConfiguration = CdkObjectWrappers.wrap(cdkObject) as? NotificationConfiguration
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationConfiguration):
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration
  }
}
