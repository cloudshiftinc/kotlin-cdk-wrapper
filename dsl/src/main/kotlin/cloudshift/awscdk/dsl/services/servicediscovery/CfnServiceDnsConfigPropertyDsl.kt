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

package cloudshift.awscdk.dsl.services.servicediscovery

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicediscovery.CfnService
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnServiceDnsConfigPropertyDsl {
    private val cdkBuilder: CfnService.DnsConfigProperty.Builder =
        CfnService.DnsConfigProperty.builder()

    private val _dnsRecords: MutableList<Any> = mutableListOf()

    public fun dnsRecords(vararg dnsRecords: Any) {
        _dnsRecords.addAll(listOf(*dnsRecords))
    }

    public fun dnsRecords(dnsRecords: Collection<Any>) {
        _dnsRecords.addAll(dnsRecords)
    }

    public fun dnsRecords(dnsRecords: IResolvable) {
        cdkBuilder.dnsRecords(dnsRecords)
    }

    public fun namespaceId(namespaceId: String) {
        cdkBuilder.namespaceId(namespaceId)
    }

    public fun routingPolicy(routingPolicy: String) {
        cdkBuilder.routingPolicy(routingPolicy)
    }

    public fun build(): CfnService.DnsConfigProperty {
        if (_dnsRecords.isNotEmpty()) cdkBuilder.dnsRecords(_dnsRecords)
        return cdkBuilder.build()
    }
}
