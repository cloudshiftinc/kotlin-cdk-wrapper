@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.OutlierDetection

@CdkDslMarker
public class OutlierDetectionDsl {
  private val cdkBuilder: OutlierDetection.Builder = OutlierDetection.builder()

  /**
   * @param baseEjectionDuration The base amount of time for which a host is ejected. 
   */
  public fun baseEjectionDuration(baseEjectionDuration: Duration) {
    cdkBuilder.baseEjectionDuration(baseEjectionDuration)
  }

  /**
   * @param interval The time interval between ejection sweep analysis. 
   */
  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  /**
   * @param maxEjectionPercent Maximum percentage of hosts in load balancing pool for upstream
   * service that can be ejected. 
   * Will eject at
   * least one host regardless of the value.
   */
  public fun maxEjectionPercent(maxEjectionPercent: Number) {
    cdkBuilder.maxEjectionPercent(maxEjectionPercent)
  }

  /**
   * @param maxServerErrors Number of consecutive 5xx errors required for ejection. 
   */
  public fun maxServerErrors(maxServerErrors: Number) {
    cdkBuilder.maxServerErrors(maxServerErrors)
  }

  public fun build(): OutlierDetection = cdkBuilder.build()
}
