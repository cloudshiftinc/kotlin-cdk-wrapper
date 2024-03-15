@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.TimeZone
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import java.time.Instant
import kotlin.Number
import kotlin.Unit

public interface ScalingSchedule {
  public fun endTime(): Instant? = unwrap(this).getEndTime()

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public fun schedule(): Schedule

  public fun startTime(): Instant? = unwrap(this).getStartTime()

  public fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun endTime(endTime: Instant)

    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun schedule(schedule: Schedule)

    public fun startTime(startTime: Instant)

    public fun timeZone(timeZone: TimeZone)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder =
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.builder()

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

    override fun timeZone(timeZone: TimeZone) {
      cdkBuilder.timeZone(timeZone.let(TimeZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule,
  ) : CdkObject(cdkObject), ScalingSchedule {
    override fun endTime(): Instant? = unwrap(this).getEndTime()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    override fun startTime(): Instant? = unwrap(this).getStartTime()

    override fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScalingSchedule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule):
        ScalingSchedule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalingSchedule):
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule
  }
}
