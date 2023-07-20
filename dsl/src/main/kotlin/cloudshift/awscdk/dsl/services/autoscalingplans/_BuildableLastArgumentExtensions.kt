@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.autoscalingplans

import kotlin.Unit
import software.amazon.awscdk.services.autoscalingplans.CfnScalingPlan

public inline
    fun CfnScalingPlan.setApplicationSource(block: CfnScalingPlanApplicationSourcePropertyDsl.() -> Unit
    = {}) {
  val builder = CfnScalingPlanApplicationSourcePropertyDsl()
  builder.apply(block)
  return setApplicationSource(builder.build())
}
