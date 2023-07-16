@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.MetricWidgetProps

@CdkDslMarker
public class MetricWidgetPropsDsl {
  private val cdkBuilder: MetricWidgetProps.Builder = MetricWidgetProps.builder()

  public fun height(height: Number) {
    cdkBuilder.height(height)
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

  public fun build(): MetricWidgetProps = cdkBuilder.build()
}
