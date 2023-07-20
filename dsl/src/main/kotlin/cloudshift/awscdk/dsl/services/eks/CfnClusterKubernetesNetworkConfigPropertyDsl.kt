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

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.eks.CfnCluster
import kotlin.String

@CdkDslMarker
public class CfnClusterKubernetesNetworkConfigPropertyDsl {
    private val cdkBuilder: CfnCluster.KubernetesNetworkConfigProperty.Builder =
        CfnCluster.KubernetesNetworkConfigProperty.builder()

    public fun ipFamily(ipFamily: String) {
        cdkBuilder.ipFamily(ipFamily)
    }

    public fun serviceIpv4Cidr(serviceIpv4Cidr: String) {
        cdkBuilder.serviceIpv4Cidr(serviceIpv4Cidr)
    }

    public fun serviceIpv6Cidr(serviceIpv6Cidr: String) {
        cdkBuilder.serviceIpv6Cidr(serviceIpv6Cidr)
    }

    public fun build(): CfnCluster.KubernetesNetworkConfigProperty = cdkBuilder.build()
}
