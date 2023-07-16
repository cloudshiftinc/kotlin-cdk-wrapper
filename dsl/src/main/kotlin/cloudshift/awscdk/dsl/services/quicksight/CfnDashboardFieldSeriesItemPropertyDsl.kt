@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFieldSeriesItemPropertyDsl {
  private val cdkBuilder: CfnDashboard.FieldSeriesItemProperty.Builder =
      CfnDashboard.FieldSeriesItemProperty.builder()

  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun settings(settings: IResolvable) {
    cdkBuilder.settings(settings)
  }

  public fun settings(settings: CfnDashboard.LineChartSeriesSettingsProperty) {
    cdkBuilder.settings(settings)
  }

  public fun build(): CfnDashboard.FieldSeriesItemProperty = cdkBuilder.build()
}
