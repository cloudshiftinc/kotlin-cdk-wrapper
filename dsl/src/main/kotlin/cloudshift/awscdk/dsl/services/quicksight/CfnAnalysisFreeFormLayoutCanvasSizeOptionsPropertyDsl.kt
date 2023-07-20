@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisFreeFormLayoutCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.FreeFormLayoutCanvasSizeOptionsProperty.Builder =
      CfnAnalysis.FreeFormLayoutCanvasSizeOptionsProperty.builder()

  public fun screenCanvasSizeOptions(screenCanvasSizeOptions: IResolvable) {
    cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
  }

  public
      fun screenCanvasSizeOptions(screenCanvasSizeOptions: CfnAnalysis.FreeFormLayoutScreenCanvasSizeOptionsProperty) {
    cdkBuilder.screenCanvasSizeOptions(screenCanvasSizeOptions)
  }

  public fun build(): CfnAnalysis.FreeFormLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
