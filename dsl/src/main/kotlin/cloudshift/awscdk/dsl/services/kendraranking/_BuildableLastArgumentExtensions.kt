@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendraranking

import kotlin.Unit
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan

public inline
    fun CfnExecutionPlan.setCapacityUnits(block: CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl()
  builder.apply(block)
  return setCapacityUnits(builder.build())
}
