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
import kotlin.Number

@CdkDslMarker
public class CfnLoadBalancerConnectionSettingsPropertyDsl {
    private val cdkBuilder: CfnLoadBalancer.ConnectionSettingsProperty.Builder =
        CfnLoadBalancer.ConnectionSettingsProperty.builder()

    public fun idleTimeout(idleTimeout: Number) {
        cdkBuilder.idleTimeout(idleTimeout)
    }

    public fun build(): CfnLoadBalancer.ConnectionSettingsProperty = cdkBuilder.build()
}
