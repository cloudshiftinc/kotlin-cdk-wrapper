@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataFieldSeriesItemPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataFieldSeriesItemProperty.Builder =
      CfnAnalysis.DataFieldSeriesItemProperty.builder()

  /**
   * @param axisBinding The axis that you are binding the field to. 
   */
  public fun axisBinding(axisBinding: String) {
    cdkBuilder.axisBinding(axisBinding)
  }

  /**
   * @param fieldId The field ID of the field that you are setting the axis binding to. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param fieldValue The field value of the field that you are setting the axis binding to.
   */
  public fun fieldValue(fieldValue: String) {
    cdkBuilder.fieldValue(fieldValue)
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

  public fun build(): CfnAnalysis.DataFieldSeriesItemProperty = cdkBuilder.build()
}
