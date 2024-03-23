@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTLSInspectionConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
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
public interface CfnTLSInspectionConfigurationProps {
  /**
   * A description of the TLS inspection configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The key:value pairs to associate with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The object that defines a TLS inspection configuration.
   *
   * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound and
   * outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic according to
   * your firewall policy's stateful rules, and then re-encrypts it before sending it to its
   * destination. You can enable inspection of your firewall's inbound traffic, outbound traffic, or
   * both. To use TLS inspection with your firewall, you must first import or provision certificates
   * using AWS Certificate Manager , create a TLS inspection configuration, add that configuration to a
   * new firewall policy, and then associate that policy with your firewall. For more information about
   * using TLS inspection configurations, see [Inspecting SSL/TLS traffic with TLS inspection
   * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
   * in the *AWS Network Firewall Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration)
   */
  public fun tlsInspectionConfiguration(): Any

  /**
   * The descriptive name of the TLS inspection configuration.
   *
   * You can't change the name of a TLS inspection configuration after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfigurationname)
   */
  public fun tlsInspectionConfigurationName(): String

  /**
   * A builder for [CfnTLSInspectionConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the TLS inspection configuration.
     */
    public fun description(description: String)

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     */
    public fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable)

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     */
    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty)

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5c5889473895ca12ac3ee4c34383e18319c56a9d744a4fad4adf5a59bbbfbbd")
    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tlsInspectionConfigurationName The descriptive name of the TLS inspection
     * configuration. 
     * You can't change the name of a TLS inspection configuration after you create it.
     */
    public fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps.builder()

    /**
     * @param description A description of the TLS inspection configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The key:value pairs to associate with the resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     */
    override fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     */
    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty::unwrap))
    }

    /**
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d5c5889473895ca12ac3ee4c34383e18319c56a9d744a4fad4adf5a59bbbfbbd")
    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder.() -> Unit):
        Unit =
        tlsInspectionConfiguration(CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty(tlsInspectionConfiguration))

    /**
     * @param tlsInspectionConfigurationName The descriptive name of the TLS inspection
     * configuration. 
     * You can't change the name of a TLS inspection configuration after you create it.
     */
    override fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String) {
      cdkBuilder.tlsInspectionConfigurationName(tlsInspectionConfigurationName)
    }

    public fun build():
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps,
  ) : CdkObject(cdkObject), CfnTLSInspectionConfigurationProps {
    /**
     * A description of the TLS inspection configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The object that defines a TLS inspection configuration.
     *
     * AWS Network Firewall uses TLS inspection configurations to decrypt your firewall's inbound
     * and outbound SSL/TLS traffic. After decryption, AWS Network Firewall inspects the traffic
     * according to your firewall policy's stateful rules, and then re-encrypts it before sending it to
     * its destination. You can enable inspection of your firewall's inbound traffic, outbound traffic,
     * or both. To use TLS inspection with your firewall, you must first import or provision
     * certificates using AWS Certificate Manager , create a TLS inspection configuration, add that
     * configuration to a new firewall policy, and then associate that policy with your firewall. For
     * more information about using TLS inspection configurations, see [Inspecting SSL/TLS traffic with
     * TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration)
     */
    override fun tlsInspectionConfiguration(): Any = unwrap(this).getTlsInspectionConfiguration()

    /**
     * The descriptive name of the TLS inspection configuration.
     *
     * You can't change the name of a TLS inspection configuration after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfigurationname)
     */
    override fun tlsInspectionConfigurationName(): String =
        unwrap(this).getTlsInspectionConfigurationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTLSInspectionConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps):
        CfnTLSInspectionConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnTLSInspectionConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTLSInspectionConfigurationProps):
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps =
        (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfigurationProps
  }
}
