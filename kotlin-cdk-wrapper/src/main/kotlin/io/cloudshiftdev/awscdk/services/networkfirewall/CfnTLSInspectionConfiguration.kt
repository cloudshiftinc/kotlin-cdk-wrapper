@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.networkfirewall

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The object that defines a TLS inspection configuration.
 *
 * AWS Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall
 * re-encrypts the traffic before sending it to its destination.
 *
 * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy, then
 * you apply the firewall policy to a firewall. Network Firewall acts as a proxy service to decrypt and
 * inspect the traffic traveling through your firewalls. You can reference a TLS inspection
 * configuration from more than one firewall policy, and you can use a firewall policy in more than one
 * firewall. For more information about using TLS inspection configurations, see [Inspecting SSL/TLS
 * traffic with TLS inspection
 * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
 * in the *AWS Network Firewall Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
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
public open class CfnTLSInspectionConfiguration(
  cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTLSInspectionConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTLSInspectionConfigurationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTLSInspectionConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTLSInspectionConfigurationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the TLS inspection configuration.
   */
  public open fun attrTlsInspectionConfigurationArn(): String =
      unwrap(this).getAttrTlsInspectionConfigurationArn()

  /**
   * A unique identifier for the TLS inspection configuration.
   *
   * This ID is returned in the responses to create and list commands. You provide it to operations
   * such as update and delete.
   */
  public open fun attrTlsInspectionConfigurationId(): String =
      unwrap(this).getAttrTlsInspectionConfigurationId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * A description of the TLS inspection configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the TLS inspection configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The key:value pairs to associate with the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The key:value pairs to associate with the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The key:value pairs to associate with the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The object that defines a TLS inspection configuration.
   */
  public open fun tlsInspectionConfiguration(): Any = unwrap(this).getTlsInspectionConfiguration()

  /**
   * The object that defines a TLS inspection configuration.
   */
  public open fun tlsInspectionConfiguration(`value`: IResolvable) {
    unwrap(this).setTlsInspectionConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * The object that defines a TLS inspection configuration.
   */
  public open fun tlsInspectionConfiguration(`value`: TLSInspectionConfigurationProperty) {
    unwrap(this).setTlsInspectionConfiguration(`value`.let(TLSInspectionConfigurationProperty::unwrap))
  }

  /**
   * The object that defines a TLS inspection configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("7184ddc902c0d819b249c81fc75e1efb036cb9855d9ba8d0318b7155ab2dcca8")
  public open
      fun tlsInspectionConfiguration(`value`: TLSInspectionConfigurationProperty.Builder.() -> Unit):
      Unit = tlsInspectionConfiguration(TLSInspectionConfigurationProperty(`value`))

  /**
   * The descriptive name of the TLS inspection configuration.
   */
  public open fun tlsInspectionConfigurationName(): String =
      unwrap(this).getTlsInspectionConfigurationName()

  /**
   * The descriptive name of the TLS inspection configuration.
   */
  public open fun tlsInspectionConfigurationName(`value`: String) {
    unwrap(this).setTlsInspectionConfigurationName(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the TLS inspection configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-description)
     * @param description A description of the TLS inspection configuration. 
     */
    public fun description(description: String)

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    public fun tags(vararg tags: CfnTag)

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
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     */
    public fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable)

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
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     */
    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty)

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
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b47cfa714e373457b6664ee322a3314374976f96a20e814d00f38a39b6901695")
    public
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty.Builder.() -> Unit)

    /**
     * The descriptive name of the TLS inspection configuration.
     *
     * You can't change the name of a TLS inspection configuration after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfigurationname)
     * @param tlsInspectionConfigurationName The descriptive name of the TLS inspection
     * configuration. 
     */
    public fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.Builder =
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.Builder.create(scope,
        id)

    /**
     * A description of the TLS inspection configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-description)
     * @param description A description of the TLS inspection configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The key:value pairs to associate with the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tags)
     * @param tags The key:value pairs to associate with the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

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
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     */
    override fun tlsInspectionConfiguration(tlsInspectionConfiguration: IResolvable) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(IResolvable::unwrap))
    }

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
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     */
    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty) {
      cdkBuilder.tlsInspectionConfiguration(tlsInspectionConfiguration.let(TLSInspectionConfigurationProperty::unwrap))
    }

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
     * @param tlsInspectionConfiguration The object that defines a TLS inspection configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b47cfa714e373457b6664ee322a3314374976f96a20e814d00f38a39b6901695")
    override
        fun tlsInspectionConfiguration(tlsInspectionConfiguration: TLSInspectionConfigurationProperty.Builder.() -> Unit):
        Unit =
        tlsInspectionConfiguration(TLSInspectionConfigurationProperty(tlsInspectionConfiguration))

    /**
     * The descriptive name of the TLS inspection configuration.
     *
     * You can't change the name of a TLS inspection configuration after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfigurationname)
     * @param tlsInspectionConfigurationName The descriptive name of the TLS inspection
     * configuration. 
     */
    override fun tlsInspectionConfigurationName(tlsInspectionConfigurationName: String) {
      cdkBuilder.tlsInspectionConfigurationName(tlsInspectionConfigurationName)
    }

    public fun build():
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTLSInspectionConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTLSInspectionConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration):
        CfnTLSInspectionConfiguration = CfnTLSInspectionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnTLSInspectionConfiguration):
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration =
        wrapped.cdkObject as
        software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration
  }

  /**
   * A single IP address specification.
   *
   * This is used in the
   * [MatchAttributes](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html)
   * source and destination settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * AddressProperty addressProperty = AddressProperty.builder()
   * .addressDefinition("addressDefinition")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-address.html)
   */
  public interface AddressProperty {
    /**
     * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
     * notation.
     *
     * Network Firewall supports all address ranges for IPv4 and IPv6.
     *
     * Examples:
     *
     * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
     * `192.0.2.44/32` .
     * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
     * specify `192.0.2.0/24` .
     * * To configure Network Firewall to inspect for the IP address
     * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128` .
     * * To configure Network Firewall to inspect for IP addresses from
     * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
     * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
     *
     * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
     * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-address.html#cfn-networkfirewall-tlsinspectionconfiguration-address-addressdefinition)
     */
    public fun addressDefinition(): String

    /**
     * A builder for [AddressProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addressDefinition Specify an IP address or a block of IP addresses in Classless
       * Inter-Domain Routing (CIDR) notation. 
       * Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      public fun addressDefinition(addressDefinition: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty.builder()

      /**
       * @param addressDefinition Specify an IP address or a block of IP addresses in Classless
       * Inter-Domain Routing (CIDR) notation. 
       * Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       */
      override fun addressDefinition(addressDefinition: String) {
        cdkBuilder.addressDefinition(addressDefinition)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty,
    ) : CdkObject(cdkObject), AddressProperty {
      /**
       * Specify an IP address or a block of IP addresses in Classless Inter-Domain Routing (CIDR)
       * notation.
       *
       * Network Firewall supports all address ranges for IPv4 and IPv6.
       *
       * Examples:
       *
       * * To configure Network Firewall to inspect for the IP address 192.0.2.44, specify
       * `192.0.2.44/32` .
       * * To configure Network Firewall to inspect for IP addresses from 192.0.2.0 to 192.0.2.255,
       * specify `192.0.2.0/24` .
       * * To configure Network Firewall to inspect for the IP address
       * 1111:0000:0000:0000:0000:0000:0000:0111, specify `1111:0000:0000:0000:0000:0000:0000:0111/128`
       * .
       * * To configure Network Firewall to inspect for IP addresses from
       * 1111:0000:0000:0000:0000:0000:0000:0000 to 1111:0000:0000:0000:ffff:ffff:ffff:ffff, specify
       * `1111:0000:0000:0000:0000:0000:0000:0000/64` .
       *
       * For more information about CIDR notation, see the Wikipedia entry [Classless Inter-Domain
       * Routing](https://docs.aws.amazon.com/https://en.wikipedia.org/wiki/Classless_Inter-Domain_Routing)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-address.html#cfn-networkfirewall-tlsinspectionconfiguration-address-addressdefinition)
       */
      override fun addressDefinition(): String = unwrap(this).getAddressDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AddressProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty):
          AddressProperty = CdkObjectWrappers.wrap(cdkObject) as? AddressProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddressProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.AddressProperty
    }
  }

  /**
   * When enabled, Network Firewall checks if the server certificate presented by the server in the
   * SSL/TLS connection has a revoked or unkown status.
   *
   * If the certificate has an unknown or revoked status, you must specify the actions that Network
   * Firewall takes on outbound traffic. To check the certificate revocation status, you must also
   * specify a `CertificateAuthorityArn` in
   * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * CheckCertificateRevocationStatusProperty checkCertificateRevocationStatusProperty =
   * CheckCertificateRevocationStatusProperty.builder()
   * .revokedStatusAction("revokedStatusAction")
   * .unknownStatusAction("unknownStatusAction")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus.html)
   */
  public interface CheckCertificateRevocationStatusProperty {
    /**
     * Configures how Network Firewall processes traffic when it determines that the certificate
     * presented by the server in the SSL/TLS connection has a revoked status.
     *
     * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
     * engine for inspection.
     * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
     * connection.
     * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
     * closes the connection and drops subsequent packets for that connection. `REJECT` is available
     * only for TCP traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus.html#cfn-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus-revokedstatusaction)
     */
    public fun revokedStatusAction(): String? = unwrap(this).getRevokedStatusAction()

    /**
     * Configures how Network Firewall processes traffic when it determines that the certificate
     * presented by the server in the SSL/TLS connection has an unknown status, or a status that cannot
     * be determined for any other reason, including when the service is unable to connect to the OCSP
     * and CRL endpoints for the certificate.
     *
     * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
     * engine for inspection.
     * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
     * connection.
     * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
     * closes the connection and drops subsequent packets for that connection. `REJECT` is available
     * only for TCP traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus.html#cfn-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus-unknownstatusaction)
     */
    public fun unknownStatusAction(): String? = unwrap(this).getUnknownStatusAction()

    /**
     * A builder for [CheckCertificateRevocationStatusProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param revokedStatusAction Configures how Network Firewall processes traffic when it
       * determines that the certificate presented by the server in the SSL/TLS connection has a
       * revoked status.
       * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
       * engine for inspection.
       * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
       * connection.
       * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
       * closes the connection and drops subsequent packets for that connection. `REJECT` is available
       * only for TCP traffic.
       */
      public fun revokedStatusAction(revokedStatusAction: String)

      /**
       * @param unknownStatusAction Configures how Network Firewall processes traffic when it
       * determines that the certificate presented by the server in the SSL/TLS connection has an
       * unknown status, or a status that cannot be determined for any other reason, including when the
       * service is unable to connect to the OCSP and CRL endpoints for the certificate.
       * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
       * engine for inspection.
       * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
       * connection.
       * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
       * closes the connection and drops subsequent packets for that connection. `REJECT` is available
       * only for TCP traffic.
       */
      public fun unknownStatusAction(unknownStatusAction: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty.builder()

      /**
       * @param revokedStatusAction Configures how Network Firewall processes traffic when it
       * determines that the certificate presented by the server in the SSL/TLS connection has a
       * revoked status.
       * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
       * engine for inspection.
       * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
       * connection.
       * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
       * closes the connection and drops subsequent packets for that connection. `REJECT` is available
       * only for TCP traffic.
       */
      override fun revokedStatusAction(revokedStatusAction: String) {
        cdkBuilder.revokedStatusAction(revokedStatusAction)
      }

      /**
       * @param unknownStatusAction Configures how Network Firewall processes traffic when it
       * determines that the certificate presented by the server in the SSL/TLS connection has an
       * unknown status, or a status that cannot be determined for any other reason, including when the
       * service is unable to connect to the OCSP and CRL endpoints for the certificate.
       * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
       * engine for inspection.
       * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
       * connection.
       * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
       * closes the connection and drops subsequent packets for that connection. `REJECT` is available
       * only for TCP traffic.
       */
      override fun unknownStatusAction(unknownStatusAction: String) {
        cdkBuilder.unknownStatusAction(unknownStatusAction)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty,
    ) : CdkObject(cdkObject), CheckCertificateRevocationStatusProperty {
      /**
       * Configures how Network Firewall processes traffic when it determines that the certificate
       * presented by the server in the SSL/TLS connection has a revoked status.
       *
       * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
       * engine for inspection.
       * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
       * connection.
       * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
       * closes the connection and drops subsequent packets for that connection. `REJECT` is available
       * only for TCP traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus.html#cfn-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus-revokedstatusaction)
       */
      override fun revokedStatusAction(): String? = unwrap(this).getRevokedStatusAction()

      /**
       * Configures how Network Firewall processes traffic when it determines that the certificate
       * presented by the server in the SSL/TLS connection has an unknown status, or a status that
       * cannot be determined for any other reason, including when the service is unable to connect to
       * the OCSP and CRL endpoints for the certificate.
       *
       * * *PASS* - Allow the connection to continue, and pass subsequent packets to the stateful
       * engine for inspection.
       * * *DROP* - Network Firewall closes the connection and drops subsequent packets for that
       * connection.
       * * *REJECT* - Network Firewall sends a TCP reject packet back to your client. The service
       * closes the connection and drops subsequent packets for that connection. `REJECT` is available
       * only for TCP traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus.html#cfn-networkfirewall-tlsinspectionconfiguration-checkcertificaterevocationstatus-unknownstatusaction)
       */
      override fun unknownStatusAction(): String? = unwrap(this).getUnknownStatusAction()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          CheckCertificateRevocationStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty):
          CheckCertificateRevocationStatusProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CheckCertificateRevocationStatusProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CheckCertificateRevocationStatusProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.CheckCertificateRevocationStatusProperty
    }
  }

  /**
   * A single port range specification.
   *
   * This is used for source and destination port ranges in the stateless rule
   * [MatchAttributes](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-rulegroup-matchattributes.html)
   * , `SourcePorts` , and `DestinationPorts` settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * PortRangeProperty portRangeProperty = PortRangeProperty.builder()
   * .fromPort(123)
   * .toPort(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-portrange.html)
   */
  public interface PortRangeProperty {
    /**
     * The lower limit of the port range.
     *
     * This must be less than or equal to the `ToPort` specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-portrange.html#cfn-networkfirewall-tlsinspectionconfiguration-portrange-fromport)
     */
    public fun fromPort(): Number

    /**
     * The upper limit of the port range.
     *
     * This must be greater than or equal to the `FromPort` specification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-portrange.html#cfn-networkfirewall-tlsinspectionconfiguration-portrange-toport)
     */
    public fun toPort(): Number

    /**
     * A builder for [PortRangeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fromPort The lower limit of the port range. 
       * This must be less than or equal to the `ToPort` specification.
       */
      public fun fromPort(fromPort: Number)

      /**
       * @param toPort The upper limit of the port range. 
       * This must be greater than or equal to the `FromPort` specification.
       */
      public fun toPort(toPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty.builder()

      /**
       * @param fromPort The lower limit of the port range. 
       * This must be less than or equal to the `ToPort` specification.
       */
      override fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
      }

      /**
       * @param toPort The upper limit of the port range. 
       * This must be greater than or equal to the `FromPort` specification.
       */
      override fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty,
    ) : CdkObject(cdkObject), PortRangeProperty {
      /**
       * The lower limit of the port range.
       *
       * This must be less than or equal to the `ToPort` specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-portrange.html#cfn-networkfirewall-tlsinspectionconfiguration-portrange-fromport)
       */
      override fun fromPort(): Number = unwrap(this).getFromPort()

      /**
       * The upper limit of the port range.
       *
       * This must be greater than or equal to the `FromPort` specification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-portrange.html#cfn-networkfirewall-tlsinspectionconfiguration-portrange-toport)
       */
      override fun toPort(): Number = unwrap(this).getToPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PortRangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty):
          PortRangeProperty = CdkObjectWrappers.wrap(cdkObject) as? PortRangeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PortRangeProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.PortRangeProperty
    }
  }

  /**
   * Configures the AWS Certificate Manager certificates and scope that Network Firewall uses to
   * decrypt and re-encrypt traffic using a
   * [TLSInspectionConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
   * . You can configure `ServerCertificates` for inbound SSL/TLS inspection, a
   * `CertificateAuthorityArn` for outbound SSL/TLS inspection, or both. For information about working
   * with certificates for TLS inspection, see [Using SSL/TLS server certficiates with TLS inspection
   * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
   * in the *AWS Network Firewall Developer Guide* .
   *
   *
   * If a server certificate that's associated with your
   * [TLSInspectionConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
   * is revoked, deleted, or expired it can result in client-side TLS errors.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * ServerCertificateConfigurationProperty serverCertificateConfigurationProperty =
   * ServerCertificateConfigurationProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html)
   */
  public interface ServerCertificateConfigurationProperty {
    /**
     * The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate within
     * AWS Certificate Manager (ACM) to use for outbound SSL/TLS inspection.
     *
     * The following limitations apply:
     *
     * * You can use CA certificates that you imported into ACM, but you can't generate CA
     * certificates with ACM.
     * * You can't use certificates issued by AWS Private Certificate Authority .
     *
     * For more information about configuring certificates for outbound inspection, see [Using
     * SSL/TLS certificates with certificates with TLS inspection
     * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
     * in the *AWS Network Firewall Developer Guide* .
     *
     * For information about working with certificates in ACM, see [Importing
     * certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the
     * *AWS Certificate Manager User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-certificateauthorityarn)
     */
    public fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

    /**
     * When enabled, Network Firewall checks if the server certificate presented by the server in
     * the SSL/TLS connection has a revoked or unkown status.
     *
     * If the certificate has an unknown or revoked status, you must specify the actions that
     * Network Firewall takes on outbound traffic. To check the certificate revocation status, you must
     * also specify a `CertificateAuthorityArn` in
     * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-checkcertificaterevocationstatus)
     */
    public fun checkCertificateRevocationStatus(): Any? =
        unwrap(this).getCheckCertificateRevocationStatus()

    /**
     * A list of scopes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-scopes)
     */
    public fun scopes(): Any? = unwrap(this).getScopes()

    /**
     * The list of server certificates to use for inbound SSL/TLS inspection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-servercertificates)
     */
    public fun serverCertificates(): Any? = unwrap(this).getServerCertificates()

    /**
     * A builder for [ServerCertificateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the imported certificate
       * authority (CA) certificate within AWS Certificate Manager (ACM) to use for outbound SSL/TLS
       * inspection.
       * The following limitations apply:
       *
       * * You can use CA certificates that you imported into ACM, but you can't generate CA
       * certificates with ACM.
       * * You can't use certificates issued by AWS Private Certificate Authority .
       *
       * For more information about configuring certificates for outbound inspection, see [Using
       * SSL/TLS certificates with certificates with TLS inspection
       * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * For information about working with certificates in ACM, see [Importing
       * certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the
       * *AWS Certificate Manager User Guide* .
       */
      public fun certificateAuthorityArn(certificateAuthorityArn: String)

      /**
       * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
       * certificate presented by the server in the SSL/TLS connection has a revoked or unkown status.
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       */
      public fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: IResolvable)

      /**
       * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
       * certificate presented by the server in the SSL/TLS connection has a revoked or unkown status.
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       */
      public
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty)

      /**
       * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
       * certificate presented by the server in the SSL/TLS connection has a revoked or unkown status.
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9141f699fe4042459f98b128e176533dcff6e1200b985ef4d872e13b87a334")
      public
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty.Builder.() -> Unit)

      /**
       * @param scopes A list of scopes.
       */
      public fun scopes(scopes: IResolvable)

      /**
       * @param scopes A list of scopes.
       */
      public fun scopes(scopes: List<Any>)

      /**
       * @param scopes A list of scopes.
       */
      public fun scopes(vararg scopes: Any)

      /**
       * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
       * inspection.
       */
      public fun serverCertificates(serverCertificates: IResolvable)

      /**
       * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
       * inspection.
       */
      public fun serverCertificates(serverCertificates: List<Any>)

      /**
       * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
       * inspection.
       */
      public fun serverCertificates(vararg serverCertificates: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty.builder()

      /**
       * @param certificateAuthorityArn The Amazon Resource Name (ARN) of the imported certificate
       * authority (CA) certificate within AWS Certificate Manager (ACM) to use for outbound SSL/TLS
       * inspection.
       * The following limitations apply:
       *
       * * You can use CA certificates that you imported into ACM, but you can't generate CA
       * certificates with ACM.
       * * You can't use certificates issued by AWS Private Certificate Authority .
       *
       * For more information about configuring certificates for outbound inspection, see [Using
       * SSL/TLS certificates with certificates with TLS inspection
       * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * For information about working with certificates in ACM, see [Importing
       * certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the
       * *AWS Certificate Manager User Guide* .
       */
      override fun certificateAuthorityArn(certificateAuthorityArn: String) {
        cdkBuilder.certificateAuthorityArn(certificateAuthorityArn)
      }

      /**
       * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
       * certificate presented by the server in the SSL/TLS connection has a revoked or unkown status.
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       */
      override fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: IResolvable) {
        cdkBuilder.checkCertificateRevocationStatus(checkCertificateRevocationStatus.let(IResolvable::unwrap))
      }

      /**
       * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
       * certificate presented by the server in the SSL/TLS connection has a revoked or unkown status.
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       */
      override
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty) {
        cdkBuilder.checkCertificateRevocationStatus(checkCertificateRevocationStatus.let(CheckCertificateRevocationStatusProperty::unwrap))
      }

      /**
       * @param checkCertificateRevocationStatus When enabled, Network Firewall checks if the server
       * certificate presented by the server in the SSL/TLS connection has a revoked or unkown status.
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9a9141f699fe4042459f98b128e176533dcff6e1200b985ef4d872e13b87a334")
      override
          fun checkCertificateRevocationStatus(checkCertificateRevocationStatus: CheckCertificateRevocationStatusProperty.Builder.() -> Unit):
          Unit =
          checkCertificateRevocationStatus(CheckCertificateRevocationStatusProperty(checkCertificateRevocationStatus))

      /**
       * @param scopes A list of scopes.
       */
      override fun scopes(scopes: IResolvable) {
        cdkBuilder.scopes(scopes.let(IResolvable::unwrap))
      }

      /**
       * @param scopes A list of scopes.
       */
      override fun scopes(scopes: List<Any>) {
        cdkBuilder.scopes(scopes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param scopes A list of scopes.
       */
      override fun scopes(vararg scopes: Any): Unit = scopes(scopes.toList())

      /**
       * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
       * inspection.
       */
      override fun serverCertificates(serverCertificates: IResolvable) {
        cdkBuilder.serverCertificates(serverCertificates.let(IResolvable::unwrap))
      }

      /**
       * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
       * inspection.
       */
      override fun serverCertificates(serverCertificates: List<Any>) {
        cdkBuilder.serverCertificates(serverCertificates.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param serverCertificates The list of server certificates to use for inbound SSL/TLS
       * inspection.
       */
      override fun serverCertificates(vararg serverCertificates: Any): Unit =
          serverCertificates(serverCertificates.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty,
    ) : CdkObject(cdkObject), ServerCertificateConfigurationProperty {
      /**
       * The Amazon Resource Name (ARN) of the imported certificate authority (CA) certificate
       * within AWS Certificate Manager (ACM) to use for outbound SSL/TLS inspection.
       *
       * The following limitations apply:
       *
       * * You can use CA certificates that you imported into ACM, but you can't generate CA
       * certificates with ACM.
       * * You can't use certificates issued by AWS Private Certificate Authority .
       *
       * For more information about configuring certificates for outbound inspection, see [Using
       * SSL/TLS certificates with certificates with TLS inspection
       * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection-certificate-requirements.html)
       * in the *AWS Network Firewall Developer Guide* .
       *
       * For information about working with certificates in ACM, see [Importing
       * certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html) in the
       * *AWS Certificate Manager User Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-certificateauthorityarn)
       */
      override fun certificateAuthorityArn(): String? = unwrap(this).getCertificateAuthorityArn()

      /**
       * When enabled, Network Firewall checks if the server certificate presented by the server in
       * the SSL/TLS connection has a revoked or unkown status.
       *
       * If the certificate has an unknown or revoked status, you must specify the actions that
       * Network Firewall takes on outbound traffic. To check the certificate revocation status, you
       * must also specify a `CertificateAuthorityArn` in
       * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-servercertificateconfiguration.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-checkcertificaterevocationstatus)
       */
      override fun checkCertificateRevocationStatus(): Any? =
          unwrap(this).getCheckCertificateRevocationStatus()

      /**
       * A list of scopes.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-scopes)
       */
      override fun scopes(): Any? = unwrap(this).getScopes()

      /**
       * The list of server certificates to use for inbound SSL/TLS inspection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration-servercertificates)
       */
      override fun serverCertificates(): Any? = unwrap(this).getServerCertificates()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ServerCertificateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty):
          ServerCertificateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerCertificateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateConfigurationProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateConfigurationProperty
    }
  }

  /**
   * Any AWS Certificate Manager (ACM) Secure Sockets Layer/Transport Layer Security (SSL/TLS)
   * server certificate that's associated with a
   * [ServerCertificateConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificateconfiguration.html)
   * . Used in a
   * [TLSInspectionConfiguration](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-networkfirewall-tlsinspectionconfiguration.html)
   * for inspection of inbound traffic to your firewall. You must request or import a SSL/TLS
   * certificate into ACM for each domain Network Firewall needs to decrypt and inspect. AWS Network
   * Firewall uses the SSL/TLS certificates to decrypt specified inbound SSL/TLS traffic going to your
   * firewall. For information about working with certificates in AWS Certificate Manager , see
   * [Request a public
   * certificate](https://docs.aws.amazon.com/acm/latest/userguide/gs-acm-request-public.html) or
   * [Importing certificates](https://docs.aws.amazon.com/acm/latest/userguide/import-certificate.html)
   * in the *AWS Certificate Manager User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * ServerCertificateProperty serverCertificateProperty = ServerCertificateProperty.builder()
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificate.html)
   */
  public interface ServerCertificateProperty {
    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager SSL/TLS server certificate
     * that's used for inbound SSL/TLS inspection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificate.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificate-resourcearn)
     */
    public fun resourceArn(): String? = unwrap(this).getResourceArn()

    /**
     * A builder for [ServerCertificateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the AWS Certificate Manager SSL/TLS
       * server certificate that's used for inbound SSL/TLS inspection.
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty.builder()

      /**
       * @param resourceArn The Amazon Resource Name (ARN) of the AWS Certificate Manager SSL/TLS
       * server certificate that's used for inbound SSL/TLS inspection.
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty,
    ) : CdkObject(cdkObject), ServerCertificateProperty {
      /**
       * The Amazon Resource Name (ARN) of the AWS Certificate Manager SSL/TLS server certificate
       * that's used for inbound SSL/TLS inspection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificate.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificate-resourcearn)
       */
      override fun resourceArn(): String? = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty):
          ServerCertificateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerCertificateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateProperty
    }
  }

  /**
   * Settings that define the Secure Sockets Layer/Transport Layer Security (SSL/TLS) traffic that
   * Network Firewall should decrypt for inspection by the stateful rule engine.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
   * ServerCertificateScopeProperty serverCertificateScopeProperty =
   * ServerCertificateScopeProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html)
   */
  public interface ServerCertificateScopeProperty {
    /**
     * The destination ports to decrypt for inspection, in Transmission Control Protocol (TCP)
     * format.
     *
     * If not specified, this matches with any destination port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-destinationports)
     */
    public fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

    /**
     * The destination IP addresses and address ranges to decrypt for inspection, in CIDR notation.
     *
     * If not specified, this
     * matches with any destination address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-destinations)
     */
    public fun destinations(): Any? = unwrap(this).getDestinations()

    /**
     * The protocols to decrypt for inspection, specified using each protocol's assigned internet
     * protocol number (IANA).
     *
     * Network Firewall currently supports only TCP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-protocols)
     */
    public fun protocols(): Any? = unwrap(this).getProtocols()

    /**
     * The source ports to decrypt for inspection, in Transmission Control Protocol (TCP) format.
     *
     * If not specified, this matches with any source port.
     *
     * You can specify individual ports, for example `1994` , and you can specify port ranges, such
     * as `1990:1994` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-sourceports)
     */
    public fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

    /**
     * The source IP addresses and address ranges to decrypt for inspection, in CIDR notation.
     *
     * If not specified, this
     * matches with any source address.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-sources)
     */
    public fun sources(): Any? = unwrap(this).getSources()

    /**
     * A builder for [ServerCertificateScopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
       * Control Protocol (TCP) format.
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      public fun destinationPorts(destinationPorts: IResolvable)

      /**
       * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
       * Control Protocol (TCP) format.
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      public fun destinationPorts(destinationPorts: List<Any>)

      /**
       * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
       * Control Protocol (TCP) format.
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      public fun destinationPorts(vararg destinationPorts: Any)

      /**
       * @param destinations The destination IP addresses and address ranges to decrypt for
       * inspection, in CIDR notation.
       * If not specified, this
       * matches with any destination address.
       */
      public fun destinations(destinations: IResolvable)

      /**
       * @param destinations The destination IP addresses and address ranges to decrypt for
       * inspection, in CIDR notation.
       * If not specified, this
       * matches with any destination address.
       */
      public fun destinations(destinations: List<Any>)

      /**
       * @param destinations The destination IP addresses and address ranges to decrypt for
       * inspection, in CIDR notation.
       * If not specified, this
       * matches with any destination address.
       */
      public fun destinations(vararg destinations: Any)

      /**
       * @param protocols The protocols to decrypt for inspection, specified using each protocol's
       * assigned internet protocol number (IANA).
       * Network Firewall currently supports only TCP.
       */
      public fun protocols(protocols: IResolvable)

      /**
       * @param protocols The protocols to decrypt for inspection, specified using each protocol's
       * assigned internet protocol number (IANA).
       * Network Firewall currently supports only TCP.
       */
      public fun protocols(protocols: List<Number>)

      /**
       * @param protocols The protocols to decrypt for inspection, specified using each protocol's
       * assigned internet protocol number (IANA).
       * Network Firewall currently supports only TCP.
       */
      public fun protocols(vararg protocols: Number)

      /**
       * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
       * Protocol (TCP) format.
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      public fun sourcePorts(sourcePorts: IResolvable)

      /**
       * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
       * Protocol (TCP) format.
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      public fun sourcePorts(sourcePorts: List<Any>)

      /**
       * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
       * Protocol (TCP) format.
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      public fun sourcePorts(vararg sourcePorts: Any)

      /**
       * @param sources The source IP addresses and address ranges to decrypt for inspection, in
       * CIDR notation.
       * If not specified, this
       * matches with any source address.
       */
      public fun sources(sources: IResolvable)

      /**
       * @param sources The source IP addresses and address ranges to decrypt for inspection, in
       * CIDR notation.
       * If not specified, this
       * matches with any source address.
       */
      public fun sources(sources: List<Any>)

      /**
       * @param sources The source IP addresses and address ranges to decrypt for inspection, in
       * CIDR notation.
       * If not specified, this
       * matches with any source address.
       */
      public fun sources(vararg sources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty.builder()

      /**
       * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
       * Control Protocol (TCP) format.
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      override fun destinationPorts(destinationPorts: IResolvable) {
        cdkBuilder.destinationPorts(destinationPorts.let(IResolvable::unwrap))
      }

      /**
       * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
       * Control Protocol (TCP) format.
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      override fun destinationPorts(destinationPorts: List<Any>) {
        cdkBuilder.destinationPorts(destinationPorts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinationPorts The destination ports to decrypt for inspection, in Transmission
       * Control Protocol (TCP) format.
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      override fun destinationPorts(vararg destinationPorts: Any): Unit =
          destinationPorts(destinationPorts.toList())

      /**
       * @param destinations The destination IP addresses and address ranges to decrypt for
       * inspection, in CIDR notation.
       * If not specified, this
       * matches with any destination address.
       */
      override fun destinations(destinations: IResolvable) {
        cdkBuilder.destinations(destinations.let(IResolvable::unwrap))
      }

      /**
       * @param destinations The destination IP addresses and address ranges to decrypt for
       * inspection, in CIDR notation.
       * If not specified, this
       * matches with any destination address.
       */
      override fun destinations(destinations: List<Any>) {
        cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param destinations The destination IP addresses and address ranges to decrypt for
       * inspection, in CIDR notation.
       * If not specified, this
       * matches with any destination address.
       */
      override fun destinations(vararg destinations: Any): Unit =
          destinations(destinations.toList())

      /**
       * @param protocols The protocols to decrypt for inspection, specified using each protocol's
       * assigned internet protocol number (IANA).
       * Network Firewall currently supports only TCP.
       */
      override fun protocols(protocols: IResolvable) {
        cdkBuilder.protocols(protocols.let(IResolvable::unwrap))
      }

      /**
       * @param protocols The protocols to decrypt for inspection, specified using each protocol's
       * assigned internet protocol number (IANA).
       * Network Firewall currently supports only TCP.
       */
      override fun protocols(protocols: List<Number>) {
        cdkBuilder.protocols(protocols)
      }

      /**
       * @param protocols The protocols to decrypt for inspection, specified using each protocol's
       * assigned internet protocol number (IANA).
       * Network Firewall currently supports only TCP.
       */
      override fun protocols(vararg protocols: Number): Unit = protocols(protocols.toList())

      /**
       * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
       * Protocol (TCP) format.
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      override fun sourcePorts(sourcePorts: IResolvable) {
        cdkBuilder.sourcePorts(sourcePorts.let(IResolvable::unwrap))
      }

      /**
       * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
       * Protocol (TCP) format.
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      override fun sourcePorts(sourcePorts: List<Any>) {
        cdkBuilder.sourcePorts(sourcePorts.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sourcePorts The source ports to decrypt for inspection, in Transmission Control
       * Protocol (TCP) format.
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       */
      override fun sourcePorts(vararg sourcePorts: Any): Unit = sourcePorts(sourcePorts.toList())

      /**
       * @param sources The source IP addresses and address ranges to decrypt for inspection, in
       * CIDR notation.
       * If not specified, this
       * matches with any source address.
       */
      override fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources.let(IResolvable::unwrap))
      }

      /**
       * @param sources The source IP addresses and address ranges to decrypt for inspection, in
       * CIDR notation.
       * If not specified, this
       * matches with any source address.
       */
      override fun sources(sources: List<Any>) {
        cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sources The source IP addresses and address ranges to decrypt for inspection, in
       * CIDR notation.
       * If not specified, this
       * matches with any source address.
       */
      override fun sources(vararg sources: Any): Unit = sources(sources.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty,
    ) : CdkObject(cdkObject), ServerCertificateScopeProperty {
      /**
       * The destination ports to decrypt for inspection, in Transmission Control Protocol (TCP)
       * format.
       *
       * If not specified, this matches with any destination port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-destinationports)
       */
      override fun destinationPorts(): Any? = unwrap(this).getDestinationPorts()

      /**
       * The destination IP addresses and address ranges to decrypt for inspection, in CIDR
       * notation.
       *
       * If not specified, this
       * matches with any destination address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-destinations)
       */
      override fun destinations(): Any? = unwrap(this).getDestinations()

      /**
       * The protocols to decrypt for inspection, specified using each protocol's assigned internet
       * protocol number (IANA).
       *
       * Network Firewall currently supports only TCP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-protocols)
       */
      override fun protocols(): Any? = unwrap(this).getProtocols()

      /**
       * The source ports to decrypt for inspection, in Transmission Control Protocol (TCP) format.
       *
       * If not specified, this matches with any source port.
       *
       * You can specify individual ports, for example `1994` , and you can specify port ranges,
       * such as `1990:1994` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-sourceports)
       */
      override fun sourcePorts(): Any? = unwrap(this).getSourcePorts()

      /**
       * The source IP addresses and address ranges to decrypt for inspection, in CIDR notation.
       *
       * If not specified, this
       * matches with any source address.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-servercertificatescope.html#cfn-networkfirewall-tlsinspectionconfiguration-servercertificatescope-sources)
       */
      override fun sources(): Any? = unwrap(this).getSources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCertificateScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty):
          ServerCertificateScopeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ServerCertificateScopeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCertificateScopeProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.ServerCertificateScopeProperty
    }
  }

  /**
   * The object that defines a TLS inspection configuration. This defines the TLS inspection
   * configuration.
   *
   * AWS Network Firewall uses a TLS inspection configuration to decrypt traffic. Network Firewall
   * re-encrypts the traffic before sending it to its destination.
   *
   * To use a TLS inspection configuration, you add it to a new Network Firewall firewall policy,
   * then you apply the firewall policy to a firewall. Network Firewall acts as a proxy service to
   * decrypt and inspect the traffic traveling through your firewalls. You can reference a TLS
   * inspection configuration from more than one firewall policy, and you can use a firewall policy in
   * more than one firewall. For more information about using TLS inspection configurations, see
   * [Inspecting SSL/TLS traffic with TLS inspection
   * configurations](https://docs.aws.amazon.com/network-firewall/latest/developerguide/tls-inspection.html)
   * in the *AWS Network Firewall Developer Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.networkfirewall.*;
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
  public interface TLSInspectionConfigurationProperty {
    /**
     * Lists the server certificate configurations that are associated with the TLS configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration-servercertificateconfigurations)
     */
    public fun serverCertificateConfigurations(): Any? =
        unwrap(this).getServerCertificateConfigurations()

    /**
     * A builder for [TLSInspectionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serverCertificateConfigurations Lists the server certificate configurations that are
       * associated with the TLS configuration.
       */
      public fun serverCertificateConfigurations(serverCertificateConfigurations: IResolvable)

      /**
       * @param serverCertificateConfigurations Lists the server certificate configurations that are
       * associated with the TLS configuration.
       */
      public fun serverCertificateConfigurations(serverCertificateConfigurations: List<Any>)

      /**
       * @param serverCertificateConfigurations Lists the server certificate configurations that are
       * associated with the TLS configuration.
       */
      public fun serverCertificateConfigurations(vararg serverCertificateConfigurations: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty.builder()

      /**
       * @param serverCertificateConfigurations Lists the server certificate configurations that are
       * associated with the TLS configuration.
       */
      override fun serverCertificateConfigurations(serverCertificateConfigurations: IResolvable) {
        cdkBuilder.serverCertificateConfigurations(serverCertificateConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param serverCertificateConfigurations Lists the server certificate configurations that are
       * associated with the TLS configuration.
       */
      override fun serverCertificateConfigurations(serverCertificateConfigurations: List<Any>) {
        cdkBuilder.serverCertificateConfigurations(serverCertificateConfigurations.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param serverCertificateConfigurations Lists the server certificate configurations that are
       * associated with the TLS configuration.
       */
      override fun serverCertificateConfigurations(vararg serverCertificateConfigurations: Any):
          Unit = serverCertificateConfigurations(serverCertificateConfigurations.toList())

      public fun build():
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty,
    ) : CdkObject(cdkObject), TLSInspectionConfigurationProperty {
      /**
       * Lists the server certificate configurations that are associated with the TLS configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration.html#cfn-networkfirewall-tlsinspectionconfiguration-tlsinspectionconfiguration-servercertificateconfigurations)
       */
      override fun serverCertificateConfigurations(): Any? =
          unwrap(this).getServerCertificateConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TLSInspectionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty):
          TLSInspectionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TLSInspectionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TLSInspectionConfigurationProperty):
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.networkfirewall.CfnTLSInspectionConfiguration.TLSInspectionConfigurationProperty
    }
  }
}
