@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class HealthCheckDsl {
    private val cdkBuilder: HealthCheck.Builder = HealthCheck.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun healthyGrpcCodes(healthyGrpcCodes: String) {
        cdkBuilder.healthyGrpcCodes(healthyGrpcCodes)
    }

    public fun healthyHttpCodes(healthyHttpCodes: String) {
        cdkBuilder.healthyHttpCodes(healthyHttpCodes)
    }

    public fun healthyThresholdCount(healthyThresholdCount: Number) {
        cdkBuilder.healthyThresholdCount(healthyThresholdCount)
    }

    public fun interval(interval: Duration) {
        cdkBuilder.interval(interval)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    public fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
        cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
    }

    public fun build(): HealthCheck = cdkBuilder.build()
}
