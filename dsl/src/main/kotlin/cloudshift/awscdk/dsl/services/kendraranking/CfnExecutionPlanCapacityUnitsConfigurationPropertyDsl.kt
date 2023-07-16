@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendraranking

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kendraranking.CfnExecutionPlan

@CdkDslMarker
public class CfnExecutionPlanCapacityUnitsConfigurationPropertyDsl {
  private val cdkBuilder: CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder =
      CfnExecutionPlan.CapacityUnitsConfigurationProperty.builder()

  public fun rescoreCapacityUnits(rescoreCapacityUnits: Number) {
    cdkBuilder.rescoreCapacityUnits(rescoreCapacityUnits)
  }

  public fun build(): CfnExecutionPlan.CapacityUnitsConfigurationProperty = cdkBuilder.build()
}
