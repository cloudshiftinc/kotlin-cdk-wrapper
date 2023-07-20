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
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerProps
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

@CdkDslMarker
public class NetworkLoadBalancerPropsDsl {
    private val cdkBuilder: NetworkLoadBalancerProps.Builder = NetworkLoadBalancerProps.builder()

    public fun crossZoneEnabled(crossZoneEnabled: Boolean) {
        cdkBuilder.crossZoneEnabled(crossZoneEnabled)
    }

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun internetFacing(internetFacing: Boolean) {
        cdkBuilder.internetFacing(internetFacing)
    }

    public fun loadBalancerName(loadBalancerName: String) {
        cdkBuilder.loadBalancerName(loadBalancerName)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
        val builder = SubnetSelectionDsl()
        builder.apply(block)
        cdkBuilder.vpcSubnets(builder.build())
    }

    public fun vpcSubnets(vpcSubnets: SubnetSelection) {
        cdkBuilder.vpcSubnets(vpcSubnets)
    }

    public fun build(): NetworkLoadBalancerProps = cdkBuilder.build()
}
