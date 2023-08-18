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
import software.amazon.awscdk.services.ec2.CfnDHCPOptionsProps

/**
 * Properties for defining a `CfnDHCPOptions`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
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
@CdkDslMarker
public class CfnDHCPOptionsPropsDsl {
    private val cdkBuilder: CfnDHCPOptionsProps.Builder = CfnDHCPOptionsProps.builder()

    private val _domainNameServers: MutableList<String> = mutableListOf()

    private val _netbiosNameServers: MutableList<String> = mutableListOf()

    private val _ntpServers: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param domainName This value is used to complete unqualified DNS hostnames. If you're using
     *   AmazonProvidedDNS in `us-east-1` , specify `ec2.internal` . If you're using
     *   AmazonProvidedDNS in another Region, specify *region* . `compute.internal` (for example,
     *   `ap-northeast-1.compute.internal` ). Otherwise, specify a domain name (for example,
     *   *MyCompany.com* ).
     */
    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    /**
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     *   `AmazonProvidedDNS` . The default is `AmazonProvidedDNS` . To have your instance receive a
     *   custom DNS hostname as specified in `DomainName` , you must set this property to a custom
     *   DNS server.
     */
    public fun domainNameServers(vararg domainNameServers: String) {
        _domainNameServers.addAll(listOf(*domainNameServers))
    }

    /**
     * @param domainNameServers The IPv4 addresses of up to four domain name servers, or
     *   `AmazonProvidedDNS` . The default is `AmazonProvidedDNS` . To have your instance receive a
     *   custom DNS hostname as specified in `DomainName` , you must set this property to a custom
     *   DNS server.
     */
    public fun domainNameServers(domainNameServers: Collection<String>) {
        _domainNameServers.addAll(domainNameServers)
    }

    /** @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers. */
    public fun netbiosNameServers(vararg netbiosNameServers: String) {
        _netbiosNameServers.addAll(listOf(*netbiosNameServers))
    }

    /** @param netbiosNameServers The IPv4 addresses of up to four NetBIOS name servers. */
    public fun netbiosNameServers(netbiosNameServers: Collection<String>) {
        _netbiosNameServers.addAll(netbiosNameServers)
    }

    /**
     * @param netbiosNodeType The NetBIOS node type (1, 2, 4, or 8). We recommend that you specify 2
     *   (broadcast and multicast are not currently supported).
     */
    public fun netbiosNodeType(netbiosNodeType: Number) {
        cdkBuilder.netbiosNodeType(netbiosNodeType)
    }

    /** @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers. */
    public fun ntpServers(vararg ntpServers: String) {
        _ntpServers.addAll(listOf(*ntpServers))
    }

    /** @param ntpServers The IPv4 addresses of up to four Network Time Protocol (NTP) servers. */
    public fun ntpServers(ntpServers: Collection<String>) {
        _ntpServers.addAll(ntpServers)
    }

    /** @param tags Any tags assigned to the DHCP options set. */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /** @param tags Any tags assigned to the DHCP options set. */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDHCPOptionsProps {
        if (_domainNameServers.isNotEmpty()) cdkBuilder.domainNameServers(_domainNameServers)
        if (_netbiosNameServers.isNotEmpty()) cdkBuilder.netbiosNameServers(_netbiosNameServers)
        if (_ntpServers.isNotEmpty()) cdkBuilder.ntpServers(_ntpServers)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
