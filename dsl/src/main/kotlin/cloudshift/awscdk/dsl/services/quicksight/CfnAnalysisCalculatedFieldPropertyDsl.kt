@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisCalculatedFieldPropertyDsl {
  private val cdkBuilder: CfnAnalysis.CalculatedFieldProperty.Builder =
      CfnAnalysis.CalculatedFieldProperty.builder()

  public fun dataSetIdentifier(dataSetIdentifier: String) {
    cdkBuilder.dataSetIdentifier(dataSetIdentifier)
  }

  public fun expression(expression: String) {
    cdkBuilder.expression(expression)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnAnalysis.CalculatedFieldProperty = cdkBuilder.build()
}
