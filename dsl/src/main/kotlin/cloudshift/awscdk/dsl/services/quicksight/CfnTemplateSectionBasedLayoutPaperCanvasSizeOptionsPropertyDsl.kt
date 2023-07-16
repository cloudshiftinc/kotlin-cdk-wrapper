@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSectionBasedLayoutPaperCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty.Builder =
      CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty.builder()

  public fun paperMargin(paperMargin: IResolvable) {
    cdkBuilder.paperMargin(paperMargin)
  }

  public fun paperMargin(paperMargin: CfnTemplate.SpacingProperty) {
    cdkBuilder.paperMargin(paperMargin)
  }

  public fun paperOrientation(paperOrientation: String) {
    cdkBuilder.paperOrientation(paperOrientation)
  }

  public fun paperSize(paperSize: String) {
    cdkBuilder.paperSize(paperSize)
  }

  public fun build(): CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty =
      cdkBuilder.build()
}
