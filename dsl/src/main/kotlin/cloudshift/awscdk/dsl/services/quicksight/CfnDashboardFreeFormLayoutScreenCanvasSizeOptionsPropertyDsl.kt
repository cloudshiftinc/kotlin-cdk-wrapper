@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardFreeFormLayoutScreenCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.FreeFormLayoutScreenCanvasSizeOptionsProperty.Builder =
      CfnDashboard.FreeFormLayoutScreenCanvasSizeOptionsProperty.builder()

  public fun optimizedViewPortWidth(optimizedViewPortWidth: String) {
    cdkBuilder.optimizedViewPortWidth(optimizedViewPortWidth)
  }

  public fun build(): CfnDashboard.FreeFormLayoutScreenCanvasSizeOptionsProperty =
      cdkBuilder.build()
}
