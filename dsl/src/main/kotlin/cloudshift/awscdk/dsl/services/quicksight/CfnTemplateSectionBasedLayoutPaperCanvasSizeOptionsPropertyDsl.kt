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

  /**
   * @param paperMargin Defines the spacing between the canvas content and the top, bottom, left,
   * and right edges.
   */
  public fun paperMargin(paperMargin: IResolvable) {
    cdkBuilder.paperMargin(paperMargin)
  }

  /**
   * @param paperMargin Defines the spacing between the canvas content and the top, bottom, left,
   * and right edges.
   */
  public fun paperMargin(paperMargin: CfnTemplate.SpacingProperty) {
    cdkBuilder.paperMargin(paperMargin)
  }

  /**
   * @param paperOrientation The paper orientation that is used to define canvas dimensions. Choose
   * one of the following options:.
   * * PORTRAIT
   * * LANDSCAPE
   */
  public fun paperOrientation(paperOrientation: String) {
    cdkBuilder.paperOrientation(paperOrientation)
  }

  /**
   * @param paperSize The paper size that is used to define canvas dimensions.
   */
  public fun paperSize(paperSize: String) {
    cdkBuilder.paperSize(paperSize)
  }

  public fun build(): CfnTemplate.SectionBasedLayoutPaperCanvasSizeOptionsProperty =
      cdkBuilder.build()
}
