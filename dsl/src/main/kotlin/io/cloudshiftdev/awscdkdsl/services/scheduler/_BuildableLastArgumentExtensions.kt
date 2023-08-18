@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.scheduler

import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

/**
 * Allows you to configure a time window during which EventBridge Scheduler invokes the schedule.
 */
public inline fun CfnSchedule.setFlexibleTimeWindow(
    block: CfnScheduleFlexibleTimeWindowPropertyDsl.() -> Unit = {}
) {
    val builder = CfnScheduleFlexibleTimeWindowPropertyDsl()
    builder.apply(block)
    return setFlexibleTimeWindow(builder.build())
}

/** The schedule's target details. */
public inline fun CfnSchedule.setTarget(block: CfnScheduleTargetPropertyDsl.() -> Unit = {}) {
    val builder = CfnScheduleTargetPropertyDsl()
    builder.apply(block)
    return setTarget(builder.build())
}
