@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFieldSortPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FieldSortProperty.Builder =
      CfnAnalysis.FieldSortProperty.builder()

  /**
   * @param direction The sort direction. Choose one of the following options:. 
   * * `ASC` : Ascending
   * * `DESC` : Descending
   */
  public fun direction(direction: String) {
    cdkBuilder.direction(direction)
  }

  /**
   * @param fieldId The sort configuration target field. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnAnalysis.FieldSortProperty = cdkBuilder.build()
}
