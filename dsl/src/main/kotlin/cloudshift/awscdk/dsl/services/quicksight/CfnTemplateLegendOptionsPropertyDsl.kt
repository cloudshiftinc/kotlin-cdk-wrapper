@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.quicksight

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.quicksight.CfnTemplate

/**
 * The options for the legend setup of a visual.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * LegendOptionsProperty legendOptionsProperty = LegendOptionsProperty.builder()
 * .height("height")
 * .position("position")
 * .title(LabelOptionsProperty.builder()
 * .customLabel("customLabel")
 * .fontConfiguration(FontConfigurationProperty.builder()
 * .fontColor("fontColor")
 * .fontDecoration("fontDecoration")
 * .fontSize(FontSizeProperty.builder()
 * .relative("relative")
 * .build())
 * .fontStyle("fontStyle")
 * .fontWeight(FontWeightProperty.builder()
 * .name("name")
 * .build())
 * .build())
 * .visibility("visibility")
 * .build())
 * .visibility("visibility")
 * .width("width")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-template-legendoptions.html)
 */
@CdkDslMarker
public class CfnTemplateLegendOptionsPropertyDsl {
  private val cdkBuilder: CfnTemplate.LegendOptionsProperty.Builder =
      CfnTemplate.LegendOptionsProperty.builder()

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
  public fun title(title: CfnTemplate.LabelOptionsProperty) {
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

  public fun build(): CfnTemplate.LegendOptionsProperty = cdkBuilder.build()
}
