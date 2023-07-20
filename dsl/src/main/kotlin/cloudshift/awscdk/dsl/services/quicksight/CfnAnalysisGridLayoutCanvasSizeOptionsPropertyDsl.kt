@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisGridLayoutCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.GridLayoutCanvasSizeOptionsProperty.Builder =
      CfnAnalysis.GridLayoutCanvasSizeOptionsProperty.builder()

  public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
    cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
  }

  public
      fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnAnalysis.GridLayoutScreenCanvasSizeOptionsProperty) {
    cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
  }

  public fun build(): CfnAnalysis.GridLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
