@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisDefaultGridLayoutConfigurationPropertyDsl {
  private val cdkBuilder: CfnAnalysis.DefaultGridLayoutConfigurationProperty.Builder =
      CfnAnalysis.DefaultGridLayoutConfigurationProperty.builder()

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a grid layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: IResolvable) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  /**
   * @param canvasSizeOptions Determines the screen canvas size options for a grid layout. 
   */
  public fun canvasSizeOptions(canvasSizeOptions: CfnAnalysis.GridLayoutCanvasSizeOptionsProperty) {
    cdkBuilder.canvasSizeOptions(canvasSizeOptions)
  }

  public fun build(): CfnAnalysis.DefaultGridLayoutConfigurationProperty = cdkBuilder.build()
}
