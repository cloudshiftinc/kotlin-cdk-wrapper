@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

@CdkDslMarker
public class CfnTargetGroupHealthCheckConfigPropertyDsl {
  private val cdkBuilder: CfnTargetGroup.HealthCheckConfigProperty.Builder =
      CfnTargetGroup.HealthCheckConfigProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
    cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
  }

  public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
    cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
  }

  public fun healthyThresholdCount(healthyThresholdCount: Number) {
    cdkBuilder.healthyThresholdCount(healthyThresholdCount)
  }

  public fun matcher(matcher: IResolvable) {
    cdkBuilder.matcher(matcher)
  }

  public fun matcher(matcher: CfnTargetGroup.MatcherProperty) {
    cdkBuilder.matcher(matcher)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun protocol(protocol: String) {
    cdkBuilder.protocol(protocol)
  }

  public fun protocolVersion(protocolVersion: String) {
    cdkBuilder.protocolVersion(protocolVersion)
  }

  public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
    cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
  }

  public fun build(): CfnTargetGroup.HealthCheckConfigProperty = cdkBuilder.build()
}
