@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendraranking

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan

@CdkDslMarker
public class CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl {
  private val cdkBuilder: CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder =
      CfnExecutionPlan.CapacityUnitsConfigurationProperty.builder()

  /**
   * @param rescoreCapacityUnits The amount of extra capacity for your rescore execution plan. 
   * A single extra capacity unit for a rescore execution plan provides 0.01 rescore requests per
   * second. You can add up to 1000 extra capacity units.
   */
  public fun rescoreCapacityUnits(rescoreCapacityUnits: Number) {
    cdkBuilder.rescoreCapacityUnits(rescoreCapacityUnits)
  }

  public fun build(): CfnExecutionPlan.CapacityUnitsConfigurationProperty = cdkBuilder.build()
}
