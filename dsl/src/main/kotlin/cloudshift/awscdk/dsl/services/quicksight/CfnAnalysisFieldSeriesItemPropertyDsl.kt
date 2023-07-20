@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFieldSeriesItemPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FieldSeriesItemProperty.Builder =
      CfnAnalysis.FieldSeriesItemProperty.builder()

  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun settings(settings: IResolvable) {
    cdkBuilder.settings(settings)
  }

  public fun settings(settings: CfnAnalysis.LineChartSeriesSettingsProperty) {
    cdkBuilder.settings(settings)
  }

  public fun build(): CfnAnalysis.FieldSeriesItemProperty = cdkBuilder.build()
}
