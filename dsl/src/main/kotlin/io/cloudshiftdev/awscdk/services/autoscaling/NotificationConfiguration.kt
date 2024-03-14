package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

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
      cdkBuilder.scalingEvents(scalingEvents.let(ScalingEvents::unwrap))
    }

    /**
     * @param topic SNS topic to send notifications about fleet scaling events. 
     */
    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.NotificationConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.NotificationConfiguration,
  ) : NotificationConfiguration {
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
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.NotificationConfiguration):
        NotificationConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationConfiguration):
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
