@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.scheduler

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.scheduler.CfnSchedule
import software.amazon.awscdk.services.scheduler.CfnScheduleGroup

public inline fun CfnSchedule.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

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

public inline fun CfnScheduleGroup.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}
