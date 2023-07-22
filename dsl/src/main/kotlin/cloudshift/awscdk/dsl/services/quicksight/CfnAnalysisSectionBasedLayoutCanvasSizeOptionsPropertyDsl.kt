@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisSectionBasedLayoutCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty.Builder =
      CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty.builder()

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
      fun paperCanvasSizeOptions(paperCanvasSizeOptions: CfnAnalysis.SectionBasedLayoutPaperCanvasSizeOptionsProperty) {
    cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
  }

  public fun build(): CfnAnalysis.SectionBasedLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
