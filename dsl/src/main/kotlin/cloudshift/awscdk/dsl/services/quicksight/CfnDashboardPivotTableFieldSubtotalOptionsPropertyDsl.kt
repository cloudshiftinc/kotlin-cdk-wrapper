@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardPivotTableFieldSubtotalOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.PivotTableFieldSubtotalOptionsProperty.Builder =
      CfnDashboard.PivotTableFieldSubtotalOptionsProperty.builder()

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnDashboard.PivotTableFieldSubtotalOptionsProperty = cdkBuilder.build()
}
