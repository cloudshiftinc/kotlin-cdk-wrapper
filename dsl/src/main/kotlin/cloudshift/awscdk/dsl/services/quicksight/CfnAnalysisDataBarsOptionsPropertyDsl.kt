@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDataBarsOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DataBarsOptionsProperty.Builder =
      CfnAnalysis.DataBarsOptionsProperty.builder()

  /**
   * @param fieldId The field ID for the data bars options. 
   */
  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  /**
   * @param negativeColor The color of the negative data bar.
   */
  public fun negativeColor(negativeColor: String) {
    cdkBuilder.negativeColor(negativeColor)
  }

  /**
   * @param positiveColor The color of the positive data bar.
   */
  public fun positiveColor(positiveColor: String) {
    cdkBuilder.positiveColor(positiveColor)
  }

  public fun build(): CfnAnalysis.DataBarsOptionsProperty = cdkBuilder.build()
}
