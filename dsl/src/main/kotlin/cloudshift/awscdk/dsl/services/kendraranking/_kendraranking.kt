@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendraranking

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlanProps
import software.constructs.Construct

public object kendraranking {
  public inline fun cfnExecutionPlan(
    scope: Construct,
    id: String,
    block: CfnExecutionPlanDsl.() -> Unit = {},
  ): CfnExecutionPlan {
    val builder = CfnExecutionPlanDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnExecutionPlanCapacityUnitsConfigurationProperty(block: CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl.() -> Unit
      = {}): CfnExecutionPlan.CapacityUnitsConfigurationProperty {
    val builder = CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnExecutionPlanProps(block: CfnExecutionPlanPropsDsl.() -> Unit = {}):
      CfnExecutionPlanProps {
    val builder = CfnExecutionPlanPropsDsl()
    builder.apply(block)
    return builder.build()
  }
}
