@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.sns.ITopic
import kotlin.Unit

public interface NotificationConfiguration {
  public fun scalingEvents(): ScalingEvents? =
      unwrap(this).getScalingEvents()?.let(ScalingEvents::wrap)

  public fun topic(): ITopic

  @CdkDslMarker
  public interface Builder {
    public fun scalingEvents(scalingEvents: ScalingEvents)

    public fun topic(topic: ITopic)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration.Builder =
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration.builder()

    override fun scalingEvents(scalingEvents: ScalingEvents) {
      cdkBuilder.scalingEvents(scalingEvents.let(ScalingEvents::unwrap))
    }

    override fun topic(topic: ITopic) {
      cdkBuilder.topic(topic.let(ITopic::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.NotificationConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.NotificationConfiguration,
  ) : CdkObject(cdkObject), NotificationConfiguration {
    override fun scalingEvents(): ScalingEvents? =
        unwrap(this).getScalingEvents()?.let(ScalingEvents::wrap)

    override fun topic(): ITopic = unwrap(this).getTopic().let(ITopic::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): NotificationConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.NotificationConfiguration):
        NotificationConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: NotificationConfiguration):
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.autoscaling.NotificationConfiguration
  }
}
