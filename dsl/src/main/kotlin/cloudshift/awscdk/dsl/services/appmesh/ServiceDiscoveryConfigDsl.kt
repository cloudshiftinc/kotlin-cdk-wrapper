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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig
import kotlin.Unit

@CdkDslMarker
public class ServiceDiscoveryConfigDsl {
    private val cdkBuilder: ServiceDiscoveryConfig.Builder = ServiceDiscoveryConfig.builder()

    public fun cloudmap(block: CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl()
        builder.apply(block)
        cdkBuilder.cloudmap(builder.build())
    }

    public fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
        cdkBuilder.cloudmap(cloudmap)
    }

    public fun dns(block: CfnVirtualNodeDnsServiceDiscoveryPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeDnsServiceDiscoveryPropertyDsl()
        builder.apply(block)
        cdkBuilder.dns(builder.build())
    }

    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
        cdkBuilder.dns(dns)
    }

    public fun build(): ServiceDiscoveryConfig = cdkBuilder.build()
}
