@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.redshift

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnScheduledActionProps {
  public fun enable(): Any? = unwrap(this).getEnable()

  public fun endTime(): String? = unwrap(this).getEndTime()

  public fun iamRole(): String? = unwrap(this).getIamRole()

  public fun schedule(): String? = unwrap(this).getSchedule()

  public fun scheduledActionDescription(): String? = unwrap(this).getScheduledActionDescription()

  public fun scheduledActionName(): String

  public fun startTime(): String? = unwrap(this).getStartTime()

  public fun targetAction(): Any? = unwrap(this).getTargetAction()

  @CdkDslMarker
  public interface Builder {
    public fun enable(enable: Boolean)

    public fun enable(enable: IResolvable)

    public fun endTime(endTime: String)

    public fun iamRole(iamRole: String)

    public fun schedule(schedule: String)

    public fun scheduledActionDescription(scheduledActionDescription: String)

    public fun scheduledActionName(scheduledActionName: String)

    public fun startTime(startTime: String)

    public fun targetAction(targetAction: IResolvable)

    public fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd137b88f193866d0b88e047c1e5039564dabc677c2d45457207af12ac238425")
    public
        fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.redshift.CfnScheduledActionProps.Builder
        = software.amazon.awscdk.services.redshift.CfnScheduledActionProps.builder()

    override fun enable(enable: Boolean) {
      cdkBuilder.enable(enable)
    }

    override fun enable(enable: IResolvable) {
      cdkBuilder.enable(enable.let(IResolvable::unwrap))
    }

    override fun endTime(endTime: String) {
      cdkBuilder.endTime(endTime)
    }

    override fun iamRole(iamRole: String) {
      cdkBuilder.iamRole(iamRole)
    }

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun scheduledActionDescription(scheduledActionDescription: String) {
      cdkBuilder.scheduledActionDescription(scheduledActionDescription)
    }

    override fun scheduledActionName(scheduledActionName: String) {
      cdkBuilder.scheduledActionName(scheduledActionName)
    }

    override fun startTime(startTime: String) {
      cdkBuilder.startTime(startTime)
    }

    override fun targetAction(targetAction: IResolvable) {
      cdkBuilder.targetAction(targetAction.let(IResolvable::unwrap))
    }

    override fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty) {
      cdkBuilder.targetAction(targetAction.let(CfnScheduledAction.ScheduledActionTypeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fd137b88f193866d0b88e047c1e5039564dabc677c2d45457207af12ac238425")
    override
        fun targetAction(targetAction: CfnScheduledAction.ScheduledActionTypeProperty.Builder.() -> Unit):
        Unit = targetAction(CfnScheduledAction.ScheduledActionTypeProperty(targetAction))

    public fun build(): software.amazon.awscdk.services.redshift.CfnScheduledActionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledActionProps,
  ) : CdkObject(cdkObject), CfnScheduledActionProps {
    override fun enable(): Any? = unwrap(this).getEnable()

    override fun endTime(): String? = unwrap(this).getEndTime()

    override fun iamRole(): String? = unwrap(this).getIamRole()

    override fun schedule(): String? = unwrap(this).getSchedule()

    override fun scheduledActionDescription(): String? =
        unwrap(this).getScheduledActionDescription()

    override fun scheduledActionName(): String = unwrap(this).getScheduledActionName()

    override fun startTime(): String? = unwrap(this).getStartTime()

    override fun targetAction(): Any? = unwrap(this).getTargetAction()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduledActionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.redshift.CfnScheduledActionProps):
        CfnScheduledActionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnScheduledActionProps):
        software.amazon.awscdk.services.redshift.CfnScheduledActionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.redshift.CfnScheduledActionProps
  }
}
