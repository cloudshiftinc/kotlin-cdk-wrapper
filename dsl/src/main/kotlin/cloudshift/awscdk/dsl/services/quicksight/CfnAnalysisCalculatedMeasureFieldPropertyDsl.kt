@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCalculatedMeasureFieldPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CalculatedMeasureFieldProperty.Builder =
      CfnAnalysis.CalculatedMeasureFieldProperty.builder()

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun fieldId(fieldId: String) {
    cdkBuilder.fieldId(fieldId)
  }

  public fun build(): CfnAnalysis.CalculatedMeasureFieldProperty = cdkBuilder.build()
}
