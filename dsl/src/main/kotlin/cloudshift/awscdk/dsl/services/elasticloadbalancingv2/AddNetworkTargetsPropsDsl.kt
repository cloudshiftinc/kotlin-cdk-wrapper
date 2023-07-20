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
import software.amazon.awscdk.services.elasticloadbalancingv2.AddNetworkTargetsProps
import software.amazon.awscdk.services.elasticloadbalancingv2.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkLoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancingv2.Protocol
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class AddNetworkTargetsPropsDsl {
    private val cdkBuilder: AddNetworkTargetsProps.Builder = AddNetworkTargetsProps.builder()

    private val _targets: MutableList<INetworkLoadBalancerTarget> = mutableListOf()

    public fun deregistrationDelay(deregistrationDelay: Duration) {
        cdkBuilder.deregistrationDelay(deregistrationDelay)
    }

    public fun healthCheck(block: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(block)
        cdkBuilder.healthCheck(builder.build())
    }

    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun preserveClientIp(preserveClientIp: Boolean) {
        cdkBuilder.preserveClientIp(preserveClientIp)
    }

    public fun protocol(protocol: Protocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun proxyProtocolV2(proxyProtocolV2: Boolean) {
        cdkBuilder.proxyProtocolV2(proxyProtocolV2)
    }

    public fun targetGroupName(targetGroupName: String) {
        cdkBuilder.targetGroupName(targetGroupName)
    }

    public fun targets(vararg targets: INetworkLoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<INetworkLoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    public fun build(): AddNetworkTargetsProps {
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
