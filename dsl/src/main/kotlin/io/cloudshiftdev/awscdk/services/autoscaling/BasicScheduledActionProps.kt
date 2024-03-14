package io.cloudshiftdev.awscdk.services.autoscaling

import java.time.Instant
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface BasicScheduledActionProps {
  public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  public fun endTime(): Instant? = unwrap(this).getEndTime()

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun minCapacity(): Number? = unwrap(this).getMinCapacity()

  public fun schedule(): Schedule

  public fun startTime(): Instant? = unwrap(this).getStartTime()

  public fun timeZone(): String? = unwrap(this).getTimeZone()

  public interface Builder {
    public fun desiredCapacity(desiredCapacity: Number)

    public fun endTime(endTime: Instant)

    public fun maxCapacity(maxCapacity: Number)

    public fun minCapacity(minCapacity: Number)

    public fun schedule(schedule: Schedule)

    public fun startTime(startTime: Instant)

    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.Builder =
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps.builder()

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

    public fun build(): software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps,
  ) : BasicScheduledActionProps {
    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    override fun endTime(): Instant? = unwrap(this).getEndTime()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun minCapacity(): Number? = unwrap(this).getMinCapacity()

    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    override fun startTime(): Instant? = unwrap(this).getStartTime()

    override fun timeZone(): String? = unwrap(this).getTimeZone()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): BasicScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps):
        BasicScheduledActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BasicScheduledActionProps):
        software.amazon.awscdk.services.autoscaling.BasicScheduledActionProps = (wrapped as
        Wrapper).cdkObject
  }
}
