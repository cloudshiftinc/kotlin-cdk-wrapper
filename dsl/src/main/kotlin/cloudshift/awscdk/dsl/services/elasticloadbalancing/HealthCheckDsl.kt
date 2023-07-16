@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancingProtocol

@CdkDslMarker
public class HealthCheckDsl {
  private val cdkBuilder: HealthCheck.Builder = HealthCheck.builder()

  public fun healthyThreshold(healthyThreshold: Number) {
    cdkBuilder.healthyThreshold(healthyThreshold)
  }

  public fun interval(interval: Duration) {
    cdkBuilder.interval(interval)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: LoadBalancingProtocol) {
    cdkBuilder.protocol(protocol)
  }

  public fun timeout(timeout: Duration) {
    cdkBuilder.timeout(timeout)
  }

  public fun unhealthyThreshold(unhealthyThreshold: Number) {
    cdkBuilder.unhealthyThreshold(unhealthyThreshold)
  }

  public fun build(): HealthCheck = cdkBuilder.build()
}
