package io.cloudshiftdev.awscdk.services.applicationautoscaling

import io.cloudshiftdev.awscdk.TimeZone
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

  public interface Builder {
    public fun endTime(endTime: Instant) {
    }

    public fun maxCapacity(maxCapacity: Number) {
    }

    public fun minCapacity(minCapacity: Number) {
    }

    public fun schedule(schedule: Schedule) {
    }

    public fun startTime(startTime: Instant) {
    }

    public fun timeZone(timeZone: TimeZone) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.Builder =
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule.builder()

    public override fun endTime(endTime: Instant) {
      cdkBuilder.endTime(endTime)
    }

    public override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    public override fun minCapacity(minCapacity: Number) {
      cdkBuilder.minCapacity(minCapacity)
    }

    public override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    public override fun startTime(startTime: Instant) {
      cdkBuilder.startTime(startTime)
    }

    public override fun timeZone(timeZone: TimeZone) {
      cdkBuilder.timeZone(timeZone.let(TimeZone::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule,
  ) : ScalingSchedule {
    public override fun endTime(): Instant? = unwrap(this).getEndTime()

    public override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    public override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    public override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    public override fun startTime(): Instant? = unwrap(this).getStartTime()

    public override fun timeZone(): TimeZone? = unwrap(this).getTimeZone()?.let(TimeZone::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ScalingSchedule {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule):
        ScalingSchedule = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScalingSchedule):
        software.amazon.awscdk.services.applicationautoscaling.ScalingSchedule = (wrapped as
        Wrapper).cdkObject
  }
}
