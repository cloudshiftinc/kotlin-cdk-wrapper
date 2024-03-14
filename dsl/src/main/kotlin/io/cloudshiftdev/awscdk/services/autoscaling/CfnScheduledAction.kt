package io.cloudshiftdev.awscdk.services.autoscaling

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnScheduledAction internal constructor(
  private val cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledAction,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrScheduledActionName(): String = unwrap(this).getAttrScheduledActionName()

  public open fun autoScalingGroupName(): String = unwrap(this).getAutoScalingGroupName()

  public open fun autoScalingGroupName(`value`: String) {
    unwrap(this).setAutoScalingGroupName(`value`)
  }

  public open fun desiredCapacity(): Number? = unwrap(this).getDesiredCapacity()

  public open fun desiredCapacity(`value`: Number) {
    unwrap(this).setDesiredCapacity(`value`)
  }

  public open fun endTime(): String? = unwrap(this).getEndTime()

  public open fun endTime(`value`: String) {
    unwrap(this).setEndTime(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun maxSize(): Number? = unwrap(this).getMaxSize()

  public open fun maxSize(`value`: Number) {
    unwrap(this).setMaxSize(`value`)
  }

  public open fun minSize(): Number? = unwrap(this).getMinSize()

  public open fun minSize(`value`: Number) {
    unwrap(this).setMinSize(`value`)
  }

  public open fun recurrence(): String? = unwrap(this).getRecurrence()

  public open fun recurrence(`value`: String) {
    unwrap(this).setRecurrence(`value`)
  }

  public open fun startTime(): String? = unwrap(this).getStartTime()

  public open fun startTime(`value`: String) {
    unwrap(this).setStartTime(`value`)
  }

  public open fun timeZone(): String? = unwrap(this).getTimeZone()

  public open fun timeZone(`value`: String) {
    unwrap(this).setTimeZone(`value`)
  }

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

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.autoscaling.CfnScheduledAction.Builder =
        software.amazon.awscdk.services.autoscaling.CfnScheduledAction.Builder.create(scope, id)

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

    public fun build(): software.amazon.awscdk.services.autoscaling.CfnScheduledAction =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnScheduledAction {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnScheduledAction(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.autoscaling.CfnScheduledAction):
        CfnScheduledAction = CfnScheduledAction(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledAction):
        software.amazon.awscdk.services.autoscaling.CfnScheduledAction = wrapped.cdkObject
  }
}
