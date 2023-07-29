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
import kotlin.String
import software.amazon.awscdk.services.appmesh.CfnVirtualNode

/**
 * An object that represents the DNS service discovery information for your virtual node.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * DnsServiceDiscoveryProperty dnsServiceDiscoveryProperty = DnsServiceDiscoveryProperty.builder()
 * .hostname("hostname")
 * // the properties below are optional
 * .ipPreference("ipPreference")
 * .responseType("responseType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html)
 */
@CdkDslMarker
public class CfnVirtualNodeDnsServiceDiscoveryPropertyDsl {
    private val cdkBuilder: CfnVirtualNode.DnsServiceDiscoveryProperty.Builder =
        CfnVirtualNode.DnsServiceDiscoveryProperty.builder()

    /** @param hostname Specifies the DNS service discovery hostname for the virtual node. */
    public fun hostname(hostname: String) {
        cdkBuilder.hostname(hostname)
    }

    /**
     * @param ipPreference The preferred IP version that this virtual node uses. Setting the IP
     *   preference on the virtual node only overrides the IP preference set for the mesh on this
     *   specific node.
     */
    public fun ipPreference(ipPreference: String) {
        cdkBuilder.ipPreference(ipPreference)
    }

    /** @param responseType Specifies the DNS response type for the virtual node. */
    public fun responseType(responseType: String) {
        cdkBuilder.responseType(responseType)
    }

    public fun build(): CfnVirtualNode.DnsServiceDiscoveryProperty = cdkBuilder.build()
}
