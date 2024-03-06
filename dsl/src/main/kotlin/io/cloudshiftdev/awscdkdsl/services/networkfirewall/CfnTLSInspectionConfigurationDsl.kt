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
import software.constructs.Construct

/**
 * The object that defines a TLS inspection configuration.
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
 * CfnTLSInspectionConfiguration cfnTLSInspectionConfiguration =
 * CfnTLSInspectionConfiguration.Builder.create(this, "MyCfnTLSInspectionConfiguration")
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
public class CfnTLSInspectionConfigurationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnTLSInspectionConfiguration.Builder =
        CfnTLSInspectionConfiguration.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A description of the TLS inspection configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-description)
     *
     * @param description A description of the TLS inspection configuration.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     *
     * @param tags The key:value pairs to associate with the resource.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     *
     * @param tags The key:value pairs to associate with the resource.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The object that defines a TLS inspection configuration.
     *
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it
     * to its destination. You can enable inspection of your firewall's inbound traffic, outbound
     * traffic, or both. To use TLS inspection with your firewall, you must first import or
     * provision certificates using AWS Certificate Manager , create a TLS inspection configuration,
     * add that configuration to a new firewall policy, and then associate that policy with your
     * firewall. For more information about using TLS inspection configurations, see
     * [Inspecting SSL/TLS traffic with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration)
     *
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration.
     */
    public fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable) {
        cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration)
    }

    /**
     * The object that defines a TLS inspection configuration.
     *
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it
     * to its destination. You can enable inspection of your firewall's inbound traffic, outbound
     * traffic, or both. To use TLS inspection with your firewall, you must first import or
     * provision certificates using AWS Certificate Manager , create a TLS inspection configuration,
     * add that configuration to a new firewall policy, and then associate that policy with your
     * firewall. For more information about using TLS inspection configurations, see
     * [Inspecting SSL/TLS traffic with TLS inspection configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration)
     *
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration.
     */
    public fun tlsInspectionConfiguration(
        tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
    ) {
        cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration)
    }

    /**
     * The descriptive name of the TLS inspection configuration.
     *
     * You can't change the name of a TLS inspection configuration after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfigurationname)
     *
     * @param tlsInspectionConfigurationName The descriptive name of the TLS inspection
     *   configuration.
     */
    public fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String) {
        cdkBuilder.tlsInspectionConfigurationName(tlsInspectionConfigurationName)
    }

    public fun build(): CfnTLSInspectionConfiguration {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
