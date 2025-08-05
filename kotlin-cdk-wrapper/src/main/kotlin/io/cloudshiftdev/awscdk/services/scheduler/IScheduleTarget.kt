@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers

/**
 * Interface representing a Event Bridge Schedule Target.
 */
public interface IScheduleTarget {
  /**
   * Returns the schedule target specification.
   *
   * @param _schedule a schedule the target should be added to. 
   */
  public fun bind(schedule: ISchedule): ScheduleTargetConfig

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.IScheduleTarget,
  ) : CdkObject(cdkObject),
      IScheduleTarget {
    /**
     * Returns the schedule target specification.
     *
     * @param _schedule a schedule the target should be added to. 
     */
    override fun bind(schedule: ISchedule): ScheduleTargetConfig =
        unwrap(this).bind(schedule.let(ISchedule.Companion::unwrap)).let(ScheduleTargetConfig::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.IScheduleTarget):
        IScheduleTarget = CdkObjectWrappers.wrap(cdkObject) as? IScheduleTarget ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IScheduleTarget):
        software.amazon.awscdk.services.scheduler.IScheduleTarget = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.scheduler.IScheduleTarget
  }
}
