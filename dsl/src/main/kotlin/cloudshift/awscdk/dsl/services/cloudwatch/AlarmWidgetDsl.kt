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

  public fun alarm(alarm: IAlarm) {
    cdkBuilder.alarm(alarm)
  }

  public fun height(height: Number) {
    cdkBuilder.height(height)
  }

  public fun leftYAxis(block: YAxisPropsDsl.() -> Unit = {}) {
    val builder = YAxisPropsDsl()
    builder.apply(block)
    cdkBuilder.leftYAxis(builder.build())
  }

  public fun leftYAxis(leftYAxis: YAxisProps) {
    cdkBuilder.leftYAxis(leftYAxis)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun title(title: String) {
    cdkBuilder.title(title)
  }

  public fun width(width: Number) {
    cdkBuilder.width(width)
  }

  public fun build(): AlarmWidget = cdkBuilder.build()
}
