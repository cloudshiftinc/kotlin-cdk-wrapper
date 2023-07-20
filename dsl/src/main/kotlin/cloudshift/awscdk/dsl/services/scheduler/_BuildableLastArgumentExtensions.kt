@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import kotlin.Unit
import software.amazon.awscdk.services.scheduler.CfnSchedule

public inline
    fun CfnSchedule.setFlexibleTimeWindow(block: CfnScheduleFlexibleTimeWindowPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScheduleFlexibleTimeWindowPropertyDsl()
  builder.apply(block)
  return setFlexibleTimeWindow(builder.build())
}

public inline fun CfnSchedule.setTarget(block: CfnScheduleTargetPropertyDsl.() -> Unit = {}) {
  val builder = CfnScheduleTargetPropertyDsl()
  builder.apply(block)
  return setTarget(builder.build())
}
