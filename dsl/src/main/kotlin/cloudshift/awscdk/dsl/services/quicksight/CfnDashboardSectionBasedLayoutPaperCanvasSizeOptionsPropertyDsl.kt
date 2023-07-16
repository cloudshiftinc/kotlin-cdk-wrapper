@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.SectionBasedLayoutPaperCanvasSizeOptionsProperty.Builder =
      CfnDashboard.SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()

  public fun paperMargin(paperMargin: IResolvable) {
    cdkBuilder.paperMargin(paperMargin)
  }

  public fun paperMargin(paperMargin: CfnDashboard.SpacingProperty) {
    cdkBuilder.paperMargin(paperMargin)
  }

  public fun paperOrientation(paperOrientation: String) {
    cdkBuilder.paperOrientation(paperOrientation)
  }

  public fun paperSize(paperSize: String) {
    cdkBuilder.paperSize(paperSize)
  }

  public fun build(): CfnDashboard.SectionBasedLayoutPaperCanvasSizeOptionsProperty =
      cdkBuilder.build()
}
