@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisPivotTableFieldOptionPropertyDsl {
  private val cdkBuilder: CfnAnalysis.PivotTableFieldOptionProperty.Builder =
      CfnAnalysis.PivotTableFieldOptionProperty.builder()

  /**
   * @param customLabel The custom label of the pivot table field.
   */
  public fun customLabel(customLabel: String) {
    cdkBuilder.customLabel(customLabel)
  }

  /**
   * @param fieldId The field ID of the pivot table field. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param visibility The visibility of the pivot table field.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.PivotTableFieldOptionProperty = cdkBuilder.build()
}
