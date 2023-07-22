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

  /**
   * @param axisBinding The axis that you are binding the field to. 
   */
  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  /**
   * @param fieldId The field ID of the field for which you are setting the axis binding. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param settings The options that determine the presentation of line series associated to the
   * field.
   */
  public fun settings(settings: IResolvable) {
    cdkBuilder.settings(settings)
  }

  /**
   * @param settings The options that determine the presentation of line series associated to the
   * field.
   */
  public fun settings(settings: CfnAnalysis.LineChartSeriesSettingsProperty) {
    cdkBuilder.settings(settings)
  }

  public fun build(): CfnAnalysis.FieldSeriesItemProperty = cdkBuilder.build()
}
