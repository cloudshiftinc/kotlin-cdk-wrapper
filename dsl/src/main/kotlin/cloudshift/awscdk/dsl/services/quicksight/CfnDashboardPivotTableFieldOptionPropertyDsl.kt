@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableFieldOptionPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableFieldOptionProperty.Builder =
      CfnDashboard.PivotTableFieldOptionProperty.builder()

  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnDashboard.PivotTableFieldOptionProperty = cdkBuilder.build()
}
