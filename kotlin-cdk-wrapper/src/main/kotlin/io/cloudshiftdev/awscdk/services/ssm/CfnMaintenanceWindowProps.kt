@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnMaintenanceWindowProps {
  public fun allowUnassociatedTargets(): Any

  public fun cutoff(): Number

  public fun description(): String? = unwrap(this).getDescription()

  public fun duration(): Number

  public fun endDate(): String? = unwrap(this).getEndDate()

  public fun name(): String

  public fun schedule(): String

  public fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

  public fun scheduleTimezone(): String? = unwrap(this).getScheduleTimezone()

  public fun startDate(): String? = unwrap(this).getStartDate()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean)

    public fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable)

    public fun cutoff(cutoff: Number)

    public fun description(description: String)

    public fun duration(duration: Number)

    public fun endDate(endDate: String)

    public fun name(name: String)

    public fun schedule(schedule: String)

    public fun scheduleOffset(scheduleOffset: Number)

    public fun scheduleTimezone(scheduleTimezone: String)

    public fun startDate(startDate: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps.Builder =
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps.builder()

    override fun allowUnassociatedTargets(allowUnassociatedTargets: Boolean) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets)
    }

    override fun allowUnassociatedTargets(allowUnassociatedTargets: IResolvable) {
      cdkBuilder.allowUnassociatedTargets(allowUnassociatedTargets.let(IResolvable::unwrap))
    }

    override fun cutoff(cutoff: Number) {
      cdkBuilder.cutoff(cutoff)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun duration(duration: Number) {
      cdkBuilder.duration(duration)
    }

    override fun endDate(endDate: String) {
      cdkBuilder.endDate(endDate)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    override fun scheduleOffset(scheduleOffset: Number) {
      cdkBuilder.scheduleOffset(scheduleOffset)
    }

    override fun scheduleTimezone(scheduleTimezone: String) {
      cdkBuilder.scheduleTimezone(scheduleTimezone)
    }

    override fun startDate(startDate: String) {
      cdkBuilder.startDate(startDate)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps,
  ) : CdkObject(cdkObject), CfnMaintenanceWindowProps {
    override fun allowUnassociatedTargets(): Any = unwrap(this).getAllowUnassociatedTargets()

    override fun cutoff(): Number = unwrap(this).getCutoff()

    override fun description(): String? = unwrap(this).getDescription()

    override fun duration(): Number = unwrap(this).getDuration()

    override fun endDate(): String? = unwrap(this).getEndDate()

    override fun name(): String = unwrap(this).getName()

    override fun schedule(): String = unwrap(this).getSchedule()

    override fun scheduleOffset(): Number? = unwrap(this).getScheduleOffset()

    override fun scheduleTimezone(): String? = unwrap(this).getScheduleTimezone()

    override fun startDate(): String? = unwrap(this).getStartDate()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMaintenanceWindowProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps):
        CfnMaintenanceWindowProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMaintenanceWindowProps):
        software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ssm.CfnMaintenanceWindowProps
  }
}
