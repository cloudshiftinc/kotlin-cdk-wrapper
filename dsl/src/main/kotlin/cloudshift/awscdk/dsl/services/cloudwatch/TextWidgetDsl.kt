@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.TextWidget
import software.amazon.awscdk.services.cloudwatch.TextWidgetBackground

/**
 * A dashboard widget that displays MarkDown.
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
public class TextWidgetDsl {
  private val cdkBuilder: TextWidget.Builder = TextWidget.Builder.create()

  /**
   * Background for the widget.
   *
   * Default: solid
   *
   * @param background Background for the widget. 
   */
  public fun background(background: TextWidgetBackground) {
    cdkBuilder.background(background)
  }

  /**
   * Height of the widget.
   *
   * Default: 2
   *
   * @param height Height of the widget. 
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * The text to display, in MarkDown format.
   *
   * @param markdown The text to display, in MarkDown format. 
   */
  public fun markdown(markdown: String) {
    cdkBuilder.markdown(markdown)
  }

  /**
   * Width of the widget, in a grid of 24 units wide.
   *
   * Default: 6
   *
   * @param width Width of the widget, in a grid of 24 units wide. 
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): TextWidget = cdkBuilder.build()
}
