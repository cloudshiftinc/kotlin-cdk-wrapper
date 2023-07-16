@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

public inline fun CfnScalingPlan.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnScalingPlan.setApplicationSource(block: CfnScalingPlanApplicationSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScalingPlanApplicationSourcePropertyDsl()
  builder.apply(block)
  return setApplicationSource(builder.build())
}
