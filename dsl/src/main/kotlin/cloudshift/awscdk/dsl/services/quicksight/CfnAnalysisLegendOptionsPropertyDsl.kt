@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnAnalysis

@CdkDslMarker
public class CfnAnalysisLegendOptionsPropertyDsl {
  private val cdkBuilder: CfnAnalysis.LegendOptionsProperty.Builder =
      CfnAnalysis.LegendOptionsProperty.builder()

  /**
   * @param height The height of the legend.
   * If this value is omitted, a default height is used when rendering.
   */
  public fun height(height: String) {
    cdkBuilder.height(height)
  }

  /**
   * @param position The positions for the legend. Choose one of the following options:.
   * * `AUTO`
   * * `RIGHT`
   * * `BOTTOM`
   * * `LEFT`
   */
  public fun position(position: String) {
    cdkBuilder.position(position)
  }

  /**
   * @param title The custom title for the legend.
   */
  public fun title(title: IResolvable) {
    cdkBuilder.title(title)
  }

  /**
   * @param title The custom title for the legend.
   */
  public fun title(title: CfnAnalysis.LabelOptionsProperty) {
    cdkBuilder.title(title)
  }

  /**
   * @param visibility Determines whether or not the legend is visible.
   */
  public fun visibility(visibility: String) {
    cdkBuilder.visibility(visibility)
  }

  /**
   * @param width The width of the legend.
   * If this value is omitted, a default width is used when rendering.
   */
  public fun width(width: String) {
    cdkBuilder.width(width)
  }

  public fun build(): CfnAnalysis.LegendOptionsProperty = cdkBuilder.build()
}
