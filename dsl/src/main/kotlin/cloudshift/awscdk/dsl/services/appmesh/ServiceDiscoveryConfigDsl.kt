@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.ServiceDiscoveryConfig

/**
 * Properties for VirtualNode Service Discovery.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * ServiceDiscoveryConfig serviceDiscoveryConfig = ServiceDiscoveryConfig.builder()
 * .cloudmap(AwsCloudMapServiceDiscoveryProperty.builder()
 * .namespaceName("namespaceName")
 * .serviceName("serviceName")
 * // the properties below are optional
 * .attributes(List.of(AwsCloudMapInstanceAttributeProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .ipPreference("ipPreference")
 * .build())
 * .dns(DnsServiceDiscoveryProperty.builder()
 * .hostname("hostname")
 * // the properties below are optional
 * .ipPreference("ipPreference")
 * .responseType("responseType")
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ServiceDiscoveryConfigDsl {
    private val cdkBuilder: ServiceDiscoveryConfig.Builder = ServiceDiscoveryConfig.builder()

    /** @param cloudmap Cloud Map based Service Discovery. */
    public fun cloudmap(
        cloudmap: CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnVirtualNodeAwsCloudMapServiceDiscoveryPropertyDsl()
        builder.apply(cloudmap)
        cdkBuilder.cloudmap(builder.build())
    }

    /** @param cloudmap Cloud Map based Service Discovery. */
    public fun cloudmap(cloudmap: CfnVirtualNode.AwsCloudMapServiceDiscoveryProperty) {
        cdkBuilder.cloudmap(cloudmap)
    }

    /** @param dns DNS based Service Discovery. */
    public fun dns(dns: CfnVirtualNodeDnsServiceDiscoveryPropertyDsl.() -> Unit = {}) {
        val builder = CfnVirtualNodeDnsServiceDiscoveryPropertyDsl()
        builder.apply(dns)
        cdkBuilder.dns(builder.build())
    }

    /** @param dns DNS based Service Discovery. */
    public fun dns(dns: CfnVirtualNode.DnsServiceDiscoveryProperty) {
        cdkBuilder.dns(dns)
    }

    public fun build(): ServiceDiscoveryConfig = cdkBuilder.build()
}
