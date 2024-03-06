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

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration
import software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps

/**
 * Properties for defining a `CfnTLSInspectionConfiguration`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.networkfirewall.*;
 * CfnTLSInspectionConfigurationProps cfnTLSInspectionConfigurationProps =
 * CfnTLSInspectionConfigurationProps.builder()
 * .tlsInspectionConfiguration(TLSInspectionConfigurationProperty.builder()
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
 * .build())
 * .tlsInspectionConfigurationName("tlsInspectionConfigurationName")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
 */
@CdkDslMarker
public class CfnTLSInspectionConfigurationPropsDsl {
    private val cdkBuilder: CfnTLSInspectionConfigurationProps.Builder =
        CfnTLSInspectionConfigurationProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param description A description of the TLS inspection configuration. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param tags The key:value pairs to associate with the resource. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags The key:value pairs to associate with the resource. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. AWS
     *   Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound and
     *   outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     *   according to your firewall policy's stateful rules, and then re-encrypts it before sending
     *   it to its destination. You can enable inspection of your firewall's inbound traffic,
     *   outbound traffic, or both. To use TLS inspection with your firewall, you must first import
     *   or provision certificates using AWS Certificate Manager , create a TLS inspection
     *   configuration, add that configuration to a new firewall policy, and then associate that
     *   policy with your firewall. For more information about using TLS inspection configurations,
     *   see
     *   [Inspecting SSL/TLS traffic with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     *   in the *AWS Network Firewall Developer Guide* .
     */
    public fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable) {
        cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration)
    }

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. AWS
     *   Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound and
     *   outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     *   according to your firewall policy's stateful rules, and then re-encrypts it before sending
     *   it to its destination. You can enable inspection of your firewall's inbound traffic,
     *   outbound traffic, or both. To use TLS inspection with your firewall, you must first import
     *   or provision certificates using AWS Certificate Manager , create a TLS inspection
     *   configuration, add that configuration to a new firewall policy, and then associate that
     *   policy with your firewall. For more information about using TLS inspection configurations,
     *   see
     *   [Inspecting SSL/TLS traffic with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     *   in the *AWS Network Firewall Developer Guide* .
     */
    public fun tlsInspectionConfiguration(
        tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
    ) {
        cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration)
    }

    /**
     * @param tlsInspectionConfigurationName The descriptive name of the TLS inspection
     *   configuration.
     *
     * You can't change the name of a TLS inspection configuration after you create it.
     */
    public fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String) {
        cdkBuilder.tlsInspectionConfigurationName(tlsInspectionConfigurationName)
    }

    public fun build(): CfnTLSInspectionConfigurationProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
