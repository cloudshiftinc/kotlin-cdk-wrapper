@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGridLayoutScreenCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty.Builder =
      CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty.builder()

  public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
    cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
  }

  public fun resizeOption(resizeOption: String) {
    cdkBuilder.resizeOption(resizeOption)
  }

  public fun build(): CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}
