@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataPathLabelTypePropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataPathLabelTypeProperty.Builder =
      CfnAnalysis.DataPathLabelTypeProperty.builder()

  /**
   * @param fieldId The field ID of the field that the data label needs to be applied to.
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param fieldValue The actual value of the field that is labeled.
   */
  public fun fieldValue(fieldValue: String) {
    cdkBuilder.fieldValue(fieldValue)
  }

  /**
   * @param visibility The visibility of the data label.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  public fun build(): CfnAnalysis.DataPathLabelTypeProperty = cdkBuilder.build()
}
