@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisWaterfallChartOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.WaterfallChartOptionsProperty.Builder =
      CfnAnalysis.WaterfallChartOptionsProperty.builder()

  public fun totalBarLabel(totalBarLabel: String) {
    cdkBuilder.totalBarLabel(totalBarLabel)
  }

  public fun build(): CfnAnalysis.WaterfallChartOptionsProperty = cdkBuilder.build()
}
