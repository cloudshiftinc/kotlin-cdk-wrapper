@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnDashboard

@CdkDslMarker
public class CfnDashboardSectionBasedLayoutCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty.Builder =
      CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty.builder()

  /**
   * @param paperCanvasSizeOptions The options for a paper canvas of a section-based layout.
   */
  public fun paperCanvasSizeOptions(paperCanvasSizeOptions: IResolvable) {
    cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
  }

  /**
   * @param paperCanvasSizeOptions The options for a paper canvas of a section-based layout.
   */
  public
      fun paperCanvasSizeOptions(paperCanvasSizeOptions: CfnDashboard.SectionBasedLayoutPaperCanvasSizeOptionsProperty) {
    cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
  }

  public fun build(): CfnDashboard.SectionBasedLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
