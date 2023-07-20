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
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancing.CfnLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancing.HealthCheck
import software.amazon.awscdk.services.elasticloadbalancing.ILoadBalancerTarget
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerListener
import software.amazon.awscdk.services.elasticloadbalancing.LoadBalancerProps
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LoadBalancerPropsDsl {
    private val cdkBuilder: LoadBalancerProps.Builder = LoadBalancerProps.builder()

    private val _listeners: MutableList<LoadBalancerListener> = mutableListOf()

    private val _targets: MutableList<ILoadBalancerTarget> = mutableListOf()

    public fun accessLoggingPolicy(
        block: CfnLoadBalancerAccessLoggingPolicyPropertyDsl.() -> Unit =
            {},
    ) {
        val builder = CfnLoadBalancerAccessLoggingPolicyPropertyDsl()
        builder.apply(block)
        cdkBuilder.accessLoggingPolicy(builder.build())
    }

    public fun accessLoggingPolicy(accessLoggingPolicy: CfnLoadBalancer.AccessLoggingPolicyProperty) {
        cdkBuilder.accessLoggingPolicy(accessLoggingPolicy)
    }

    public fun crossZone(crossZone: Boolean) {
        cdkBuilder.crossZone(crossZone)
    }

    public fun healthCheck(block: HealthCheckDsl.() -> Unit = {}) {
        val builder = HealthCheckDsl()
        builder.apply(block)
        cdkBuilder.healthCheck(builder.build())
    }

    public fun healthCheck(healthCheck: HealthCheck) {
        cdkBuilder.healthCheck(healthCheck)
    }

    public fun internetFacing(internetFacing: Boolean) {
        cdkBuilder.internetFacing(internetFacing)
    }

    public fun listeners(listeners: LoadBalancerListenerDsl.() -> Unit) {
        _listeners.add(LoadBalancerListenerDsl().apply(listeners).build())
    }

    public fun listeners(listeners: Collection<LoadBalancerListener>) {
        _listeners.addAll(listeners)
    }

    public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.subnetSelection(builder.build())
    }

    public fun subnetSelection(subnetSelection: SubnetSelection) {
        cdkBuilder.subnetSelection(subnetSelection)
    }

    public fun targets(vararg targets: ILoadBalancerTarget) {
        _targets.addAll(listOf(*targets))
    }

    public fun targets(targets: Collection<ILoadBalancerTarget>) {
        _targets.addAll(targets)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): LoadBalancerProps {
        if (_listeners.isNotEmpty()) cdkBuilder.listeners(_listeners)
        if (_targets.isNotEmpty()) cdkBuilder.targets(_targets)
        return cdkBuilder.build()
    }
}
