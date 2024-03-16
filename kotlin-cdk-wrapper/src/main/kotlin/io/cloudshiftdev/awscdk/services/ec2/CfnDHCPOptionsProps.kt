@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDHCPOptions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnDHCPOptionsProps cfnDHCPOptionsProps = CfnDHCPOptionsProps.builder()
 * .domainName("domainName")
 * .domainNameServers(List.of("domainNameServers"))
 * .netbiosNameServers(List.of("netbiosNameServers"))
 * .netbiosNodeType(123)
 * .ntpServers(List.of("ntpServers"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html)
 */
public interface CfnDHCPOptionsProps {
  /**
   * This value is used to complete unqualified DNS hostnames.
   *
   * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
   * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
   * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
   * *MyCompany.com* ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainname)
   */
  public fun domainName(): String? = unwrap(this).getDomainName()

  /**
   * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
   *
   * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
   * specified in `DomainName` , you must set this property to a custom DNS server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
   */
  public fun domainNameServers(): List<String> = unwrap(this).getDomainNameServers() ?: emptyList()

  /**
   * The IPv4 addresses of up to four NetBIOS name servers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
   */
  public fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
      emptyList()

  /**
   * The NetBIOS node type (1, 2, 4, or 8).
   *
   * We recommend that you specify 2 (broadcast and multicast are not currently supported).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnodetype)
   */
  public fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

  /**
   * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
   */
  public fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

  /**
   * Any tags assigned to the DHCP options set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDHCPOptionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domainName This value is used to complete unqualified DNS hostnames.
     * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     * *MyCompany.com* ).
     */
    public fun domainName(domainName: String)

    /**
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` .
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     */
    public fun domainNameServers(domainNameServers: List<String>)

    /**
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` .
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     */
    public fun domainNameServers(vararg domainNameServers: String)

    /**
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers.
     */
    public fun netbiosNameServers(netbiosNameServers: List<String>)

    /**
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers.
     */
    public fun netbiosNameServers(vararg netbiosNameServers: String)

    /**
     * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8).
     * We recommend that you specify 2 (broadcast and multicast are not currently supported).
     */
    public fun netbiosNodeType(netbiosNodeType: Number)

    /**
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     */
    public fun ntpServers(ntpServers: List<String>)

    /**
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     */
    public fun ntpServers(vararg ntpServers: String)

    /**
     * @param tags Any tags assigned to the DHCP options set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Any tags assigned to the DHCP options set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps.Builder =
        software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps.builder()

    /**
     * @param domainName This value is used to complete unqualified DNS hostnames.
     * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     * *MyCompany.com* ).
     */
    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` .
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     */
    override fun domainNameServers(domainNameServers: List<String>) {
      cdkBuilder.domainNameServers(domainNameServers)
    }

    /**
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     * `AmazonProvidedDNS` .
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     */
    override fun domainNameServers(vararg domainNameServers: String): Unit =
        domainNameServers(domainNameServers.toList())

    /**
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers.
     */
    override fun netbiosNameServers(netbiosNameServers: List<String>) {
      cdkBuilder.netbiosNameServers(netbiosNameServers)
    }

    /**
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers.
     */
    override fun netbiosNameServers(vararg netbiosNameServers: String): Unit =
        netbiosNameServers(netbiosNameServers.toList())

    /**
     * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8).
     * We recommend that you specify 2 (broadcast and multicast are not currently supported).
     */
    override fun netbiosNodeType(netbiosNodeType: Number) {
      cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    /**
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     */
    override fun ntpServers(ntpServers: List<String>) {
      cdkBuilder.ntpServers(ntpServers)
    }

    /**
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     */
    override fun ntpServers(vararg ntpServers: String): Unit = ntpServers(ntpServers.toList())

    /**
     * @param tags Any tags assigned to the DHCP options set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Any tags assigned to the DHCP options set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps,
  ) : CdkObject(cdkObject), CfnDHCPOptionsProps {
    /**
     * This value is used to complete unqualified DNS hostnames.
     *
     * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     * *MyCompany.com* ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainname)
     */
    override fun domainName(): String? = unwrap(this).getDomainName()

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     */
    override fun domainNameServers(): List<String> = unwrap(this).getDomainNameServers() ?:
        emptyList()

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     */
    override fun netbiosNameServers(): List<String> = unwrap(this).getNetbiosNameServers() ?:
        emptyList()

    /**
     * The NetBIOS node type (1, 2, 4, or 8).
     *
     * We recommend that you specify 2 (broadcast and multicast are not currently supported).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnodetype)
     */
    override fun netbiosNodeType(): Number? = unwrap(this).getNetbiosNodeType()

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     */
    override fun ntpServers(): List<String> = unwrap(this).getNtpServers() ?: emptyList()

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDHCPOptionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps):
        CfnDHCPOptionsProps = CdkObjectWrappers.wrap(cdkObject) as CfnDHCPOptionsProps

    internal fun unwrap(wrapped: CfnDHCPOptionsProps):
        software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps
  }
}
