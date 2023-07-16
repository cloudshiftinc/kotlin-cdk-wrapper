@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

@CdkDslMarker
public class CfnTemplateSectionBasedLayoutCanvasSizeOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.SectionBasedLayoutCanvasSizeOptionsProperty.Builder =
      CfnTemplate.SectionBasedLayoutCanvasSizeOptionsProperty.builder()

  public fun paperCanvasSizeOptions(paperCanvasSizeOptions: IResolvable) {
    cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
  }

  public
      fun paperCanvasSizeOptions(paperCanvasSizeOptions: CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty) {
    cdkBuilder.paperCanvasSizeOptions(paperCanvasSizeOptions)
  }

  public fun build(): CfnTemplate.SectionBasedLayoutCanvasSizeOptionsProperty = cdkBuilder.build()
}
