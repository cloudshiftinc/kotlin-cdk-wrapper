@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendraranking

import cloudshift.awscdk.dsl.RemovalPolicyOptionsDsl
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan

public inline fun CfnExecutionPlan.applyRemovalPolicy(arg0: RemovalPolicy,
    block: RemovalPolicyOptionsDsl.() -> Unit = {}) {
  val builder = RemovalPolicyOptionsDsl()
  builder.apply(block)
  return applyRemovalPolicy(arg0,builder.build())
}

public inline
    fun CfnExecutionPlan.setCapacityUnits(block: CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl()
  builder.apply(block)
  return setCapacityUnits(builder.build())
}
