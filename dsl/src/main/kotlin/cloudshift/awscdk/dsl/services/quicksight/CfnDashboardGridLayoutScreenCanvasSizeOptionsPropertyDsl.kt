@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardGridLayoutScreenCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.GridLayoutScreenCanvasSizeOptionsProperty.Builder =
      CfnDashboard.GridLayoutScreenCanvasSizeOptionsProperty.builder()

  public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
    cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
  }

  public fun resizeOption(resizeOption: String) {
    cdkBuilder.resizeOption(resizeOption)
  }

  public fun build(): CfnDashboard.GridLayoutScreenCanvasSizeOptionsProperty = cdkBuilder.build()
}
