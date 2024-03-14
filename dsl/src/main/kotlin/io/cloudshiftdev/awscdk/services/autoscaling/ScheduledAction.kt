package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.Resource
import java.time.Instant
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ScheduledAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledAction,
) : Resource(cdkObject) {
  public open fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

  public interface Builder {
    public fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
    }

    public fun desiredCapacity(desiredCapacity: Number) {
    }

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

    public fun timeZone(timeZone: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.ScheduledAction.Builder =
        software.amazon.awscdk.services.autoscaling.ScheduledAction.Builder.create(scope, id)

    public override fun autoScalingGroup(autoScalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoScalingGroup(autoScalingGroup.let(IAutoScalingGroup::unwrap))
    }

    public override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

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

    public override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.ScheduledAction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScheduledAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScheduledAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.ScheduledAction):
        ScheduledAction = ScheduledAction(cdkObject)

    internal fun unwrap(wrapped: ScheduledAction):
        software.amazon.awscdk.services.autoscaling.ScheduledAction = wrapped.cdkObject
  }
}
