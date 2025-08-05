@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.scheduler

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * A set of convenient static methods representing the Scheduler Context Attributes.
 *
 * These Context Attributes keywords can be used inside a ScheduleTargetInput.
 *
 * [Documentation](https://docs.aws.amazon.com/scheduler/latest/UserGuide/managing-schedule-context-attributes.html)
 */
public open class ContextAttribute(
  cdkObject: software.amazon.awscdk.services.scheduler.ContextAttribute,
) : CdkObject(cdkObject) {
  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

  public companion object {
    public fun attemptNumber(): String =
        software.amazon.awscdk.services.scheduler.ContextAttribute.getAttemptNumber()

    public fun executionId(): String =
        software.amazon.awscdk.services.scheduler.ContextAttribute.getExecutionId()

    public fun fromName(name: String): String =
        software.amazon.awscdk.services.scheduler.ContextAttribute.fromName(name)

    public fun scheduleArn(): String =
        software.amazon.awscdk.services.scheduler.ContextAttribute.getScheduleArn()

    public fun scheduledTime(): String =
        software.amazon.awscdk.services.scheduler.ContextAttribute.getScheduledTime()

    internal fun wrap(cdkObject: software.amazon.awscdk.services.scheduler.ContextAttribute):
        ContextAttribute = ContextAttribute(cdkObject)

    internal fun unwrap(wrapped: ContextAttribute):
        software.amazon.awscdk.services.scheduler.ContextAttribute = wrapped.cdkObject as
        software.amazon.awscdk.services.scheduler.ContextAttribute
  }
}
