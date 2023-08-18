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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.ec2.CfnDHCPOptions
import software.constructs.Construct

/**
 * Specifies a set of DHCP options for your VPC.
 *
 * You must specify at least one of the following properties: `DomainNameServers` ,
 * `NetbiosNameServers` , `NtpServers` . If you specify `NetbiosNameServers` , you must specify
 * `NetbiosNodeType` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnDHCPOptions cfnDHCPOptions = CfnDHCPOptions.Builder.create(this, "MyCfnDHCPOptions")
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
@CdkDslMarker
public class CfnDHCPOptionsDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDHCPOptions.Builder = CfnDHCPOptions.Builder.create(scope, id)

    private val _domainNameServers: MutableList<String> = mutableListOf()

    private val _netbiosNameServers: MutableList<String> = mutableListOf()

    private val _ntpServers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * This value is used to complete unqualified DNS hostnames.
     *
     * If you're using AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     * AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     * `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     * *MyCompany.com* ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainname)
     *
     * @param domainName This value is used to complete unqualified DNS hostnames.
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     *
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     *   `AmazonProvidedDNS` .
     */
    public fun domainNameServers(vararg domainNameServers: String) {
        _domainNameServers.addAll(listOf(*domainNameServers))
    }

    /**
     * The IPv4 addresses of up to four domain name servers, or `AmazonProvidedDNS` .
     *
     * The default is `AmazonProvidedDNS` . To have your instance receive a custom DNS hostname as
     * specified in `DomainName` , you must set this property to a custom DNS server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-domainnameservers)
     *
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     *   `AmazonProvidedDNS` .
     */
    public fun domainNameServers(domainNameServers: Collection<String>) {
        _domainNameServers.addAll(domainNameServers)
    }

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     *
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers.
     */
    public fun netbiosNameServers(vararg netbiosNameServers: String) {
        _netbiosNameServers.addAll(listOf(*netbiosNameServers))
    }

    /**
     * The IPv4 addresses of up to four NetBIOS name servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnameservers)
     *
     * @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers.
     */
    public fun netbiosNameServers(netbiosNameServers: Collection<String>) {
        _netbiosNameServers.addAll(netbiosNameServers)
    }

    /**
     * The NetBIOS node type (1, 2, 4, or 8).
     *
     * We recommend that you specify 2 (broadcast and multicast are not currently supported).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-netbiosnodetype)
     *
     * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8).
     */
    public fun netbiosNodeType(netbiosNodeType: Number) {
        cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     *
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     */
    public fun ntpServers(vararg ntpServers: String) {
        _ntpServers.addAll(listOf(*ntpServers))
    }

    /**
     * The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-ntpservers)
     *
     * @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers.
     */
    public fun ntpServers(ntpServers: Collection<String>) {
        _ntpServers.addAll(ntpServers)
    }

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     *
     * @param tags Any tags assigned to the DHCP options set.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Any tags assigned to the DHCP options set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-dhcpoptions.html#cfn-ec2-dhcpoptions-tags)
     *
     * @param tags Any tags assigned to the DHCP options set.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDHCPOptions {
        if (_domainNameServers.isNotEmpty()) cdkBuilder.domainNameServers(_domainNameServers)
        if (_netbiosNameServers.isNotEmpty()) cdkBuilder.netbiosNameServers(_netbiosNameServers)
        if (_ntpServers.isNotEmpty()) cdkBuilder.ntpServers(_ntpServers)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
