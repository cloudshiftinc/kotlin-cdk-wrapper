@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnScheduleProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun endDate(): String? = unwrap(this).getEndDate()

  public fun flexibleTimeWindow(): Any

  public fun groupName(): String? = unwrap(this).getGroupName()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun name(): String? = unwrap(this).getName()

  public fun scheduleExpression(): String

  public fun scheduleExpressionTimezone(): String? = unwrap(this).getScheduleExpressionTimezone()

  public fun startDate(): String? = unwrap(this).getStartDate()

  public fun state(): String? = unwrap(this).getState()

  public fun target(): Any

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun endDate(endDate: String)

    public fun flexibleTimeWindow(flexibleTimeWindow: IResolvable)

    public fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2e9da3121125e51f392822b9d4bf4714a69e22b112f1a09587178b96a5ff631")
    public
        fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit)

    public fun groupName(groupName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun name(name: String)

    public fun scheduleExpression(scheduleExpression: String)

    public fun scheduleExpressionTimezone(scheduleExpressionTimezone: String)

    public fun startDate(startDate: String)

    public fun state(state: String)

    public fun target(target: IResolvable)

    public fun target(target: CfnSchedule.TargetProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b76da045623705cd1a8382cd6ac50d2c3a5f1733ab91ecf82c6b1b80fcaf5e")
    public fun target(target: CfnSchedule.TargetProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.scheduler.CfnScheduleProps.Builder =
        software.amazon.awscdk.services.scheduler.CfnScheduleProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    override fun flexibleTimeWindow(flexibleTimeWindow: IResolvable) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(IResolvable::unwrap))
    }

    override fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty) {
      cdkBuilder.flexibleTimeWindow(flexibleTimeWindow.let(CfnSchedule.FlexibleTimeWindowProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a2e9da3121125e51f392822b9d4bf4714a69e22b112f1a09587178b96a5ff631")
    override
        fun flexibleTimeWindow(flexibleTimeWindow: CfnSchedule.FlexibleTimeWindowProperty.Builder.() -> Unit):
        Unit = flexibleTimeWindow(CfnSchedule.FlexibleTimeWindowProperty(flexibleTimeWindow))

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun scheduleExpression(scheduleExpression: String) {
      cdkBuilder.scheduleExpression(scheduleExpression)
    }

    override fun scheduleExpressionTimezone(scheduleExpressionTimezone: String) {
      cdkBuilder.scheduleExpressionTimezone(scheduleExpressionTimezone)
    }

    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    override fun state(state: String) {
      cdkBuilder.state(state)
    }

    override fun target(target: IResolvable) {
      cdkBuilder.target(target.let(IResolvable::unwrap))
    }

    override fun target(target: CfnSchedule.TargetProperty) {
      cdkBuilder.target(target.let(CfnSchedule.TargetProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12b76da045623705cd1a8382cd6ac50d2c3a5f1733ab91ecf82c6b1b80fcaf5e")
    override fun target(target: CfnSchedule.TargetProperty.Builder.() -> Unit): Unit =
        target(CfnSchedule.TargetProperty(target))

    public fun build(): software.amazon.awscdk.services.scheduler.CfnScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.scheduler.CfnScheduleProps,
  ) : CdkObject(cdkObject), CfnScheduleProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun endDate(): String? = unwrap(this).getEndDate()

    override fun flexibleTimeWindow(): Any = unwrap(this).getFlexibleTimeWindow()

    override fun groupName(): String? = unwrap(this).getGroupName()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun name(): String? = unwrap(this).getName()

    override fun scheduleExpression(): String = unwrap(this).getScheduleExpression()

    override fun scheduleExpressionTimezone(): String? =
        unwrap(this).getScheduleExpressionTimezone()

    override fun startDate(): String? = unwrap(this).getStartDate()

    override fun state(): String? = unwrap(this).getState()

    override fun target(): Any = unwrap(this).getTarget()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.CfnScheduleProps):
        CfnScheduleProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduleProps):
        software.amazon.awscdk.services.scheduler.CfnScheduleProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.CfnScheduleProps
  }
}
