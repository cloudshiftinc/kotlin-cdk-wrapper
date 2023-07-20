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
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.elasticloadbalancingv2.NetworkLoadBalancerAttributes
import kotlin.String

@CdkDslMarker
public class NetworkLoadBalancerAttributesDsl {
    private val cdkBuilder: NetworkLoadBalancerAttributes.Builder =
        NetworkLoadBalancerAttributes.builder()

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
        cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    public fun loadBalancerDnsName(loadBalancerDnsName: String) {
        cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun build(): NetworkLoadBalancerAttributes = cdkBuilder.build()
}
