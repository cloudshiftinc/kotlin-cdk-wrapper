@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardCalculatedMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnDashboard.CalculatedMeasureFieldProperty.Builder =
      CfnDashboard.CalculatedMeasureFieldProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnDashboard.CalculatedMeasureFieldProperty = cdkBuilder.build()
}
