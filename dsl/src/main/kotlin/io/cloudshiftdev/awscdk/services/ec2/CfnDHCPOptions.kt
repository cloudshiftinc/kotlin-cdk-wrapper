package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDHCPOptions internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptions,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ID of the DHCP options set.
   */
  public open fun attrDhcpOptionsId(): String = unwrap(this).getAttrDhcpOptionsId()

  /**
   * This value is used to complete unqualified DNS hostnames.
   */
  public open fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * This value is used to complete unqualified DNS hostnames.
   */
  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  /**
   * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
   */
  public open fun domainNameServers(): List<String> = unwrap(this).getDomainNameServers() ?:
      emptyList()

  /**
   * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
   */
  public open fun domainNameServers(`value`: List<String>) {
    unwrap(this).setDomainNameServers(`value`)
  }

  /**
   * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
   */
  public open fun domainNameServers(vararg `value`: String): Unit =
      domainNameServers(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The IPv4 addresses of up to four NetBIOS name servers.
   */
  public open fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
      emptyList()

  /**
   * The IPv4 addresses of up to four NetBIOS name servers.
   */
  public open fun netbiosNameServers(`value`: List<String>) {
    unwrap(this).setNetbiosNameServers(`value`)
  }

  /**
   * The IPv4 addresses of up to four NetBIOS name servers.
   */
  public open fun netbiosNameServers(vararg `value`: String): Unit =
      netbiosNameServers(`value`.toList())

  /**
   * The NetBIOS node type (1, 2, 4, or 8).
   */
  public open fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

  /**
   * The NetBIOS node type (1, 2, 4, or 8).
   */
  public open fun netbiosNodeType(`value`: Number) {
    unwrap(this).setNetbiosNodeType(`value`)
  }

  /**
   * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
   */
  public open fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

  /**
   * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
   */
  public open fun ntpServers(`value`: List<String>) {
    unwrap(this).setNtpServers(`value`)
  }

  /**
   * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
   */
  public open fun ntpServers(vararg `value`: String): Unit = ntpServers(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Any tags assigned to the DHCP options set.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Any tags assigned to the DHCP options set.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Any tags assigned to the DHCP options set.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.CfnDHCPOptions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * This value is used to complete unqualified DNS hostnames.
     *
     * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     * *MyCompany.com* ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainname)
     * @param domainName This value is used to complete unqualified DNS hostnames. 
     */
    public fun domainName(domainName: String)

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` . 
     */
    public fun domainNameServers(domainNameServers: List<String>)

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` . 
     */
    public fun domainNameServers(vararg domainNameServers: String)

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers. 
     */
    public fun netbiosNameServers(netbiosNameServers: List<String>)

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers. 
     */
    public fun netbiosNameServers(vararg netbiosNameServers: String)

    /**
     * The NetBIOS node type (1, 2, 4, or 8).
     *
     * We recommend that you specify 2 (broadcast and multicast are not currently supported).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnodetype)
     * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8). 
     */
    public fun netbiosNodeType(netbiosNodeType: Number)

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers. 
     */
    public fun ntpServers(ntpServers: List<String>)

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers. 
     */
    public fun ntpServers(vararg ntpServers: String)

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     * @param tags Any tags assigned to the DHCP options set. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     * @param tags Any tags assigned to the DHCP options set. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder =
        software.amazon.awscdk.services.ec2.CfnDHCPOptions.Builder.create(scope, id)

    /**
     * This value is used to complete unqualified DNS hostnames.
     *
     * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     * *MyCompany.com* ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainname)
     * @param domainName This value is used to complete unqualified DNS hostnames. 
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` . 
     */
    override fun domainNameServers(domainNameServers: List<String>) {
      cdkBuilder.domainNameServers(domainNameServers)
    }

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` . 
     */
    override fun domainNameServers(vararg domainNameServers: String): Unit =
        domainNameServers(domainNameServers.toList())

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers. 
     */
    override fun netbiosNameServers(netbiosNameServers: List<String>) {
      cdkBuilder.netbiosNameServers(netbiosNameServers)
    }

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers. 
     */
    override fun netbiosNameServers(vararg netbiosNameServers: String): Unit =
        netbiosNameServers(netbiosNameServers.toList())

    /**
     * The NetBIOS node type (1, 2, 4, or 8).
     *
     * We recommend that you specify 2 (broadcast and multicast are not currently supported).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnodetype)
     * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8). 
     */
    override fun netbiosNodeType(netbiosNodeType: Number) {
      cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers. 
     */
    override fun ntpServers(ntpServers: List<String>) {
      cdkBuilder.ntpServers(ntpServers)
    }

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers. 
     */
    override fun ntpServers(vararg ntpServers: String): Unit = ntpServers(ntpServers.toList())

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     * @param tags Any tags assigned to the DHCP options set. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     * @param tags Any tags assigned to the DHCP options set. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnDHCPOptions = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDHCPOptions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDHCPOptions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptions): CfnDHCPOptions
        = CfnDHCPOptions(cdkObject)

    internal fun unwrap(wrapped: CfnDHCPOptions): software.amazon.awscdk.services.ec2.CfnDHCPOptions
        = wrapped.cdkObject
  }
}