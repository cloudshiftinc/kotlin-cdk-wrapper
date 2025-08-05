@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.scheduler.ISchedule
import io.cloudshiftdev.awscdk.services.scheduler.ScheduleTargetConfig

/**
 * Base class for Schedule Targets.
 */
public abstract class ScheduleTargetBase(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBase,
) : CdkObject(cdkObject) {
  /**
   * Create a return a Schedule Target Configuration for the given schedule.
   *
   * @return a Schedule Target Configuration
   * @param schedule 
   */
  public open fun bind(schedule: ISchedule): ScheduleTargetConfig =
      unwrap(this).bind(schedule.let(ISchedule.Companion::unwrap)).let(ScheduleTargetConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBase,
  ) : ScheduleTargetBase(cdkObject)

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBase):
        ScheduleTargetBase = CdkObjectWrappers.wrap(cdkObject) as? ScheduleTargetBase ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduleTargetBase):
        software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBase = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.targets.ScheduleTargetBase
  }
}
