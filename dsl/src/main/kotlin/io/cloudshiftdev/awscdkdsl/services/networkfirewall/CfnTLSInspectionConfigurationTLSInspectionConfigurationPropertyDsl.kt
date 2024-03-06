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

package io.cloudshiftdev.awscdkdsl.services.networkfirewall

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration

/**
 * The object that defines a TLS inspection configuration. This defines the TLS inspection
 * configuration.
 *
 * AWS Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall
 * re-encrypts the traffic before sending it to its destination.
 *
 * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then
 * you apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt
 * and inspect the traffic traveling through your firewalls. You can reference a TLS inspection
 * configuration from more than one firewall policy, and you can use a firewall policy in more than
 * one firewall. For more information about using TLS inspection configurations, see
 * [Inspecting SSL/TLS traffic with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
 * in the *AWS Network Firewall Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * TLSInspectionConfigurationProperty tLSInspectionConfigurationProperty =
 * TLSInspectionConfigurationProperty.builder()
 * .serverCertificateConfigurations(List.of(ServerCertificateConfigurationProperty.builder()
 * .certificateAuthorityArn("certificateAuthorityArn")
 * .checkCertificateRevocationStatus(CheckCertificateRevocationStatusProperty.builder()
 * .revokedStatusAction("revokedStatusAction")
 * .unknownStatusAction("unknownStatusAction")
 * .build())
 * .scopes(List.of(ServerCertificateScopeProperty.builder()
 * .destinationPorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .destinations(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .protocols(List.of(123))
 * .sourcePorts(List.of(PortRangeProperty.builder()
 * .fromPort(123)
 * .toPort(123)
 * .build()))
 * .sources(List.of(AddressProperty.builder()
 * .addressDefinition("addressDefinition")
 * .build()))
 * .build()))
 * .serverCertificates(List.of(ServerCertificateProperty.builder()
 * .resourceArn("resourceArn")
 * .build()))
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationTLSInspectionConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder =
        CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.builder()

    private val _serverCertificateConfigurations: MutableList<Any> = mutableListOf()

    /**
     * @param serverCertificateConfigurations Lists the server certificate configurations that are
     *   associated with the TLS configuration.
     */
    public fun serverCertificateConfigurations(vararg serverCertificateConfigurations: Any) {
        _serverCertificateConfigurations.addAll(listOf(*serverCertificateConfigurations))
    }

    /**
     * @param serverCertificateConfigurations Lists the server certificate configurations that are
     *   associated with the TLS configuration.
     */
    public fun serverCertificateConfigurations(serverCertificateConfigurations: Collection<Any>) {
        _serverCertificateConfigurations.addAll(serverCertificateConfigurations)
    }

    /**
     * @param serverCertificateConfigurations Lists the server certificate configurations that are
     *   associated with the TLS configuration.
     */
    public fun serverCertificateConfigurations(serverCertificateConfigurations: IResolvable) {
        cdkBuilder.serverCertificateConfigurations(serverCertificateConfigurations)
    }

    public fun build(): CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty {
        if (_serverCertificateConfigurations.isNotEmpty())
            cdkBuilder.serverCertificateConfigurations(_serverCertificateConfigurations)
        return cdkBuilder.build()
    }
}
