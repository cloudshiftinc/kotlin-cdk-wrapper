@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler.targets

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.scheduler.IScheduleTarget

/**
 * Schedule an ECS Task using AWS EventBridge Scheduler.
 */
public abstract class EcsRunTask(
  cdkObject: software.amazon.awscdk.services.scheduler.targets.EcsRunTask,
) : ScheduleTargetBase(cdkObject),
    IScheduleTarget {
  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.scheduler.targets.EcsRunTask,
  ) : EcsRunTask(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.targets.EcsRunTask):
        EcsRunTask = CdkObjectWrappers.wrap(cdkObject) as? EcsRunTask ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsRunTask):
        software.amazon.awscdk.services.scheduler.targets.EcsRunTask = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.scheduler.targets.EcsRunTask
  }
}
