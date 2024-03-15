@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnScheduledActionProps {
  public fun autoScalingGroupName(): String

  public fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  public fun endTime(): String? = unwrap(this).getEndTime()

  public fun maxSize(): Number? = unwrap(this).getMaxSize()

  public fun minSize(): Number? = unwrap(this).getMinSize()

  public fun recurrence(): String? = unwrap(this).getRecurrence()

  public fun startTime(): String? = unwrap(this).getStartTime()

  public fun timeZone(): String? = unwrap(this).getTimeZone()

  @CdkDslMarker
  public interface Builder {
    public fun autoScalingGroupName(autoScalingGroupName: String)

    public fun desiredCapacity(desiredCapacity: Number)

    public fun endTime(endTime: String)

    public fun maxSize(maxSize: Number)

    public fun minSize(minSize: Number)

    public fun recurrence(recurrence: String)

    public fun startTime(startTime: String)

    public fun timeZone(timeZone: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps.builder()

    override fun autoScalingGroupName(autoScalingGroupName: String) {
      cdkBuilder.autoScalingGroupName(autoScalingGroupName)
    }

    override fun desiredCapacity(desiredCapacity: Number) {
      cdkBuilder.desiredCapacity(desiredCapacity)
    }

    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

    override fun maxSize(maxSize: Number) {
      cdkBuilder.maxSize(maxSize)
    }

    override fun minSize(minSize: Number) {
      cdkBuilder.minSize(minSize)
    }

    override fun recurrence(recurrence: String) {
      cdkBuilder.recurrence(recurrence)
    }

    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    override fun timeZone(timeZone: String) {
      cdkBuilder.timeZone(timeZone)
    }

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps,
  ) : CdkObject(cdkObject), CfnScheduledActionProps {
    override fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

    override fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

    override fun endTime(): String? = unwrap(this).getEndTime()

    override fun maxSize(): Number? = unwrap(this).getMaxSize()

    override fun minSize(): Number? = unwrap(this).getMinSize()

    override fun recurrence(): String? = unwrap(this).getRecurrence()

    override fun startTime(): String? = unwrap(this).getStartTime()

    override fun timeZone(): String? = unwrap(this).getTimeZone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps):
        CfnScheduledActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledActionProps):
        software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.autoscaling.CfnScheduledActionProps
  }
}
