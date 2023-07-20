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
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancerRedirectConfig
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationProtocol
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class ApplicationLoadBalancerRedirectConfigDsl {
    private val cdkBuilder: ApplicationLoadBalancerRedirectConfig.Builder =
        ApplicationLoadBalancerRedirectConfig.builder()

    public fun `open`(`open`: Boolean) {
        cdkBuilder.`open`(`open`)
    }

    public fun sourcePort(sourcePort: Number) {
        cdkBuilder.sourcePort(sourcePort)
    }

    public fun sourceProtocol(sourceProtocol: ApplicationProtocol) {
        cdkBuilder.sourceProtocol(sourceProtocol)
    }

    public fun targetPort(targetPort: Number) {
        cdkBuilder.targetPort(targetPort)
    }

    public fun targetProtocol(targetProtocol: ApplicationProtocol) {
        cdkBuilder.targetProtocol(targetProtocol)
    }

    public fun build(): ApplicationLoadBalancerRedirectConfig = cdkBuilder.build()
}
