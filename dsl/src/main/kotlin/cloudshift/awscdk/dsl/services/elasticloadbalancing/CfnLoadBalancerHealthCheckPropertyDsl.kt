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

package cloudshift.awscdk.dsl.services.elasticloadbalancing

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import kotlin.String

@CdkDslMarker
public class CfnLoadBalancerHealthCheckPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.HealthCheckProperty.Builder =
        CfnLoadBalancer.HealthCheckProperty.builder()

    public fun healthyThreshold(healthyThreshold: String) {
        cdkBuilder.healthyThreshold(healthyThreshold)
    }

    public fun interval(interval: String) {
        cdkBuilder.interval(interval)
    }

    public fun target(target: String) {
        cdkBuilder.target(target)
    }

    public fun timeout(timeout: String) {
        cdkBuilder.timeout(timeout)
    }

    public fun unhealthyThreshold(unhealthyThreshold: String) {
        cdkBuilder.unhealthyThreshold(unhealthyThreshold)
    }

    public fun build(): CfnLoadBalancer.HealthCheckProperty = cdkBuilder.build()
}
