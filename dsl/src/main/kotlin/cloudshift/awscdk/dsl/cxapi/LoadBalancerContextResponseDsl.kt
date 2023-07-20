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

package cloudshift.awscdk.dsl.cxapi

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cxapi.LoadBalancerContextResponse
import software.amazon.awscdk.cxapi.LoadBalancerIpAddressType
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class LoadBalancerContextResponseDsl {
    private val cdkBuilder: LoadBalancerContextResponse.Builder =
        LoadBalancerContextResponse.builder()

    private val _securityGroupIds: MutableList<String> = mutableListOf()

    public fun ipAddressType(ipAddressType: LoadBalancerIpAddressType) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    public fun loadBalancerArn(loadBalancerArn: String) {
        cdkBuilder.loadBalancerArn(loadBalancerArn)
    }

    public fun loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId: String) {
        cdkBuilder.loadBalancerCanonicalHostedZoneId(loadBalancerCanonicalHostedZoneId)
    }

    public fun loadBalancerDnsName(loadBalancerDnsName: String) {
        cdkBuilder.loadBalancerDnsName(loadBalancerDnsName)
    }

    public fun securityGroupIds(vararg securityGroupIds: String) {
        _securityGroupIds.addAll(listOf(*securityGroupIds))
    }

    public fun securityGroupIds(securityGroupIds: Collection<String>) {
        _securityGroupIds.addAll(securityGroupIds)
    }

    public fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
    }

    public fun build(): LoadBalancerContextResponse {
        if (_securityGroupIds.isNotEmpty()) cdkBuilder.securityGroupIds(_securityGroupIds)
        return cdkBuilder.build()
    }
}
