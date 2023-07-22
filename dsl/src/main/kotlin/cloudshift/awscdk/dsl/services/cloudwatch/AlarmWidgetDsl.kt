@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmWidget
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.cloudwatch.YAxisProps

@CdkDslMarker
public class AlarmWidgetDsl {
  private val cdkBuilder: AlarmWidget.Builder = AlarmWidget.Builder.create()

  /**
   * The alarm to show.
   *
   * @param alarm The alarm to show. 
   */
  public fun alarm(alarm: IAlarm) {
    cdkBuilder.alarm(alarm)
  }

  /**
   * Height of the widget.
   *
   * Default: - 6 for Alarm and Graph widgets.
   * 3 for single value widgets where most recent value of a metric is displayed.
   *
   * @param height Height of the widget. 
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * Left Y axis.
   *
   * Default: - No minimum or maximum values for the left Y-axis
   *
   * @param leftYAxis Left Y axis. 
   */
  public fun leftYAxis(leftYAxis: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(leftYAxis)
    cdkBuilder.leftYAxis(builder.build())
  }

  /**
   * Left Y axis.
   *
   * Default: - No minimum or maximum values for the left Y-axis
   *
   * @param leftYAxis Left Y axis. 
   */
  public fun leftYAxis(leftYAxis: YAxisProps) {
    cdkBuilder.leftYAxis(leftYAxis)
  }

  /**
   * The region the metrics of this graph should be taken from.
   *
   * Default: - Current region
   *
   * @param region The region the metrics of this graph should be taken from. 
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * Title for the graph.
   *
   * Default: - None
   *
   * @param title Title for the graph. 
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
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

  public fun build(): AlarmWidget = cdkBuilder.build()
}
