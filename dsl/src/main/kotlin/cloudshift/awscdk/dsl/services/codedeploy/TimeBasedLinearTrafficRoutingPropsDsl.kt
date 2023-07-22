@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.codedeploy.TimeBasedLinearTrafficRoutingProps

@CdkDslMarker
public class TimeBasedLinearTrafficRoutingPropsDsl {
  private val cdkBuilder: TimeBasedLinearTrafficRoutingProps.Builder =
      TimeBasedLinearTrafficRoutingProps.builder()

  /**
   * @param interval The amount of time between traffic shifts. 
   */
  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param percentage The percentage to increase traffic on each traffic shift. 
   */
  public fun percentage(percentage: Number) {
    cdkBuilder.percentage(percentage)
  }

  public fun build(): TimeBasedLinearTrafficRoutingProps = cdkBuilder.build()
}
