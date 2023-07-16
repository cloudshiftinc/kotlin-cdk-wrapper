@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.TimeBasedCanaryTrafficRoutingProps

@CdkDslMarker
public class TimeBasedCanaryTrafficRoutingPropsDsl {
  private val cdkBuilder: TimeBasedCanaryTrafficRoutingProps.Builder =
      TimeBasedCanaryTrafficRoutingProps.builder()

  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  public fun build(): TimeBasedCanaryTrafficRoutingProps = cdkBuilder.build()
}
