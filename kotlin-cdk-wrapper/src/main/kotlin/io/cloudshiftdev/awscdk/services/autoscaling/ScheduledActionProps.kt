@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface ScheduledActionProps : BasicScheduledActionProps {
  public fun autoScalingGroup(): IAutoScalingGroup

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup)

    public fun desiredCapacity(desiredCapacity: Number)

    public fun endTime(endTime: Instant)

    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun schedule(schedule: Schedule)

    public fun startTime(startTime: Instant)

    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.ScheduledActionProps.Builder
        = software.amazon.awscdk.services.autoscaling.ScheduledActionProps.builder()

    override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    override fun endTime(endTime: Instant) {
      cdkBuilder.endTime(endTime)
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override fun startTime(startTime: Instant) {
      cdkBuilder.startTime(startTime)
    }

    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledActionProps,
  ) : CdkObject(cdkObject), ScheduledActionProps {
    override fun autoScalingGroup(): IAutoScalingGroup =
        unwrap(this).getAutoScalingGroup().let(IAutoScalingGroup::wrap)

    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    override fun endTime(): Instant? = unwrap(this).getEndTime()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    override fun startTime(): Instant? = unwrap(this).getStartTime()

    override fun timeZone(): String? = unwrap(this).getTimeZone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledActionProps):
        ScheduledActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledActionProps):
        software.amazon.awscdk.services.autoscaling.ScheduledActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.ScheduledActionProps
  }
}
