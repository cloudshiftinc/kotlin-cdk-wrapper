@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

@CdkDslMarker
public class CfnMonitorHealthEventsConfigPropertyDsl {
  private val cdkBuilder: CfnMonitor.HealthEventsConfigProperty.Builder =
      CfnMonitor.HealthEventsConfigProperty.builder()

  public fun availabilityScoreThreshold(availabilityScoreThreshold: Number) {
    cdkBuilder.availabilityScoreThreshold(availabilityScoreThreshold)
  }

  public fun performanceScoreThreshold(performanceScoreThreshold: Number) {
    cdkBuilder.performanceScoreThreshold(performanceScoreThreshold)
  }

  public fun build(): CfnMonitor.HealthEventsConfigProperty = cdkBuilder.build()
}
