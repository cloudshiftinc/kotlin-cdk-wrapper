@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.AlarmWidgetProps
import software.amazon.awscdk.services.cloudwatch.IAlarm
import software.amazon.awscdk.services.cloudwatch.YAxisProps

/**
 * Properties for an AlarmWidget.
 *
 * Example:
 *
 * ```
 * Dashboard dashboard;
 * Alarm errorAlarm;
 * dashboard.addWidgets(AlarmWidget.Builder.create()
 * .title("Errors")
 * .alarm(errorAlarm)
 * .build());
 * ```
 */
@CdkDslMarker
public class AlarmWidgetPropsDsl {
  private val cdkBuilder: AlarmWidgetProps.Builder = AlarmWidgetProps.builder()

  /**
   * @param alarm The alarm to show. 
   */
  public fun alarm(alarm: IAlarm) {
    cdkBuilder.alarm(alarm)
  }

  /**
   * @param height Height of the widget.
   */
  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  /**
   * @param leftYAxis Left Y axis.
   */
  public fun leftYAxis(leftYAxis: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(leftYAxis)
    cdkBuilder.leftYAxis(builder.build())
  }

  /**
   * @param leftYAxis Left Y axis.
   */
  public fun leftYAxis(leftYAxis: YAxisProps) {
    cdkBuilder.leftYAxis(leftYAxis)
  }

  /**
   * @param region The region the metrics of this graph should be taken from.
   */
  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  /**
   * @param title Title for the graph.
   */
  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  /**
   * @param width Width of the widget, in a grid of 24 units wide.
   */
  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): AlarmWidgetProps = cdkBuilder.build()
}
