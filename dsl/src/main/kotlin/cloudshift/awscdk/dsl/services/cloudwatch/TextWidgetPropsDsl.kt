@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.TextWidgetBackground
import software.amazon.awscdk.services.cloudwatch.TextWidgetProps

/**
 * Properties for a Text widget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * dashboard.addWidgets(TextWidget.Builder.create()
 * .markdown("# Key Performance Indicators")
 * .build());
 * ```
 */
@CdkDslMarker
public class TextWidgetPropsDsl {
  private val cdkBuilder: TextWidgetProps.Builder = TextWidgetProps.builder()

  /**
   * @param background Background for the widget.
   */
  public fun background(background: TextWidgetBackground) {
    cdkBuilder.background(background)
  }

  /**
   * @param height Height of the widget.
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * @param markdown The text to display, in MarkDown format. 
   */
  public fun markdown(markdown: String) {
    cdkBuilder.markdown(markdown)
  }

  /**
   * @param width Width of the widget, in a grid of 24 units wide.
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): TextWidgetProps = cdkBuilder.build()
}
